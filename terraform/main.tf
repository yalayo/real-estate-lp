terraform {
  backend "s3" {
    bucket = "rsarnik-terraform-state"
    key    = "real-estate-lp"
    region = "us-east-1"
  }
}