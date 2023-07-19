DOCS: <https://github.com/flutter/flutter/tree/main/packages/integration_test>

### iOS
1. Login to firebase
```bash
gcloud auth login
gcloud config set project <PROJECT_ID>
```
2. Run `firebase_testlab.sh`
3. Test in local
```bash
xcodebuild test-without-building \
  -xctestrun "build/ios_integ/Build/Products/Runner_iphoneos16.4-arm64.xctestrun" \
  -destination id=<YOUR_DEVICE_ID>
```
4. Publish to firebase
```bash
gcloud firebase test ios run \
  --test "build/ios_integ/Build/Products/ios_tests.zip"
```