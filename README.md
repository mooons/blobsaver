Help support this project by ⭐️'ing it; [Donations](https://www.paypal.me/airsqrd) also appreciated!

# blobsaver [![GitHub All Releases](https://img.shields.io/github/downloads/airsquared/blobsaver/total.svg)](https://github.com/airsquared/blobsaver/releases) [![Codacy Badge](https://app.codacy.com/project/badge/Grade/0d4fdc1daca5402a8c57efc3bef73d31)](https://www.codacy.com/gh/airsquared/blobsaver/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=airsquared/blobsaver&amp;utm_campaign=Badge_Grade)

A cross-platform GUI and CLI for automatically saving SHSH blobs. [Download](https://github.com/airsquared/blobsaver/releases)

[Need help?](https://github.com/airsquared/blobsaver/wiki)

![Mac Screenshot](.github/screenshots/screenshot-macos.png)

## Features

- Automatically save blobs in the background
- Read both the apnonce and generator on unjailbroken and jailbroken devices, in addition to other device information
  such as ECID
- Store an unlimited number of devices
- Save blobs for beta versions without specifying a URL and in the background
- Automate all features with the CLI
- Save blobs to TSS Saver and SHSH Host as well with one click

## Builds from each push

The [CI workflow](https://github.com/mooons/blobsaver/actions/workflows/main.yml) builds runnable packages on every push and pull request. You can also start it with **Run workflow**. Local commits trigger CI once pushed to GitHub.

Open a successful workflow run and download the package for your platform from **Artifacts**:

| Artifact | Package |
| --- | --- |
| `macOS-arm64` | DMG with an Apple Silicon app |
| `macOS-x64` | DMG with an Intel Mac app |
| `Windows-x64` | EXE installer |
| `Linux-x64` | DEB installer and TAR.GZ app bundle |

Extract the downloaded artifact ZIP, then open the installer or unpack the Linux app bundle and run `blobsaver/bin/blobsaver`. Java is bundled. Linux device-reading dependencies are described in [README-linux.txt](dist/linux/README-linux.txt). Artifacts are kept for 30 days; these development builds are not notarized macOS releases.

## Feedback

Please send feedback via [Github Issue](https://github.com/airsquared/blobsaver/issues/new/choose) if you encounter any
bugs/problems or have a feature request.

## Built With

- JDK 21
- [IntelliJ Idea](https://www.jetbrains.com/idea/)
- [Gradle](https://gradle.org/)
- [JLink Plugin](https://github.com/beryx/badass-jlink-plugin)
- [Inno Setup](http://www.jrsoftware.org/isinfo.php) (Windows)

See the full credits [here](dist/libraries_used.txt).

## License [![GitHub license](https://img.shields.io/github/license/airsquared/blobsaver.svg)](https://github.com/airsquared/blobsaver/blob/master/LICENSE)
This project is licensed under GNU GPL v3.0-only - see the [LICENSE](https://github.com/airsquared/blobsaver/blob/master/LICENSE) file for details
