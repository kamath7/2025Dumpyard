use clap::Parser;

#[derive(Parser)]
#[command(name="greet", version, about="Send a greeting", long_about=None)]
struct cli {
    name: String,
    #[arg(short, long, action= clap::ArgAction::SetTrue)]
    shout: bool
}
fn main() {

    let args = cli::parse();
    let mut greeting = format!("Hello {}!", args.name);

    if args.shout {
        greeting = greeting.to_uppercase();
    }
    println!("{}", greeting);
}
