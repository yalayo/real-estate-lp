resource "aws_s3_bucket" "b" {
  bucket = "real-estate-lp"
  acl    = "public-read"
  policy = file("policy.json")

  website {
    index_document = "index.html"
    error_document = "error.html"
  }
}