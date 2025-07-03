use std::fmt::format;
use serde::Deserialize;
use warp::Filter;

#[derive(Debug, Deserialize)]
struct KanyeQuote {
    quote:String,
}
#[tokio::main]
async fn main() {
    let route = warp::get().and_then(handle_request);
    println!("Server running at http://localhost:3030");
    warp::serve(route).run(([127,0,0,1],3030)).await;

}

async fn handle_request() -> Result<impl warp::Reply, warp::Rejection> {
    match fetch_kanye_quote().await {
        Ok(quote) => {
            let html = format!(
                r#"
                <html>
                <head>
                <title> Kanye Quotes </title>

                </head>
                <body style="font-family:sans-serif;text-align:center;margin-top:50px;">
                <h1> Kanye Says </h1>
                <p style="font-size:24px;">"{quote}"</p>

                </body>
                </html>
                "#
            );
            Ok(warp::reply::html(html))
        }
        Err(_) => Err(warp::reject::not_found()),
    }
}

async fn fetch_kanye_quote() -> Result<String, reqwest::Error> {
    let url = "https://api.kanye.rest/";
    let response = reqwest::get(url).await;
    let quote:KanyeQuote = response?.json().await?;
    Ok(quote.quote)
}