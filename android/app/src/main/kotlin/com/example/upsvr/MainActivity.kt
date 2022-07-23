package com.example.upsvr

import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {
https://review.gerrithub.io/c/thainxo/upsvr/+/541530 
{
    "verified" : "-1",
    "message" : "Test",
    "comments" : {
        "android\app\src\main\kotlin\com\example\upsvr\MainActivity.kt" : [
            {
                "line": 12,
                message: "test ccpp"
            }
        ]
    }
}

cat test.json | ssh thainxo@review.gerrithub.io -p 29418 gerrit review 541530,1 --json --label Verified=-1 --project thainxo/upsvr 
ssh thainxo@review.gerrithub.io -p 29418 gerrit query
  ssh thainxo@review.gerrithub.io -p 29418 gerrit query --comments change:541530,1 --format JSON
}
