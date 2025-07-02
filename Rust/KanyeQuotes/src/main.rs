use reqwest::blocking::get;
use serde::Deserialize;

#[derive(Debug, Deserialize)]
struct KanyeQuote {
    quote: String,
}

fn main() -> Result<(), Box<dyn std::error::Error + Send + Sync>> {
    let url = "https://api.kanye.rest/";
    let response = get(url)?.json::<KanyeQuote>()?;

    println!("Kanye says -> {}", response.quote);

    Ok(())
}
