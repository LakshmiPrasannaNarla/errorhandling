%dw 2.0
import * from dw::test::Asserts
---
payload must equalTo([
  {
    "account_id": 11,
    "city": "kurnool",
    "name": "lucky",
    "branch": "GPREC",
    "contactno": "67853"
  },
  {
    "account_id": 12,
    "city": "kurnool",
    "name": "lakshmi",
    "branch": "GPREC",
    "contactno": "6776433"
  },
  {
    "account_id": 23,
    "city": "guntur",
    "name": "damu",
    "branch": "GPREC",
    "contactno": "7645"
  }
])