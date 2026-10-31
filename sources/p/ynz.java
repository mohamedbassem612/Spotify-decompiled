package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum ynz implements v190 {
    UNKNOWN(0),
    ITUNES(1),
    DOWNLOADS(2),
    MY_MUSIC(3),
    WINDOWS_MUSIC_LIBRARY(4),
    ANDROID_MEDIA_STORE(5),
    IOS_DOCUMENTS(6),
    YOUR_LOCAL_FILES_APP_SUPPORT_FOLDER(7),
    UNRECOGNIZED(-1);

    public final int a;

    ynz(int i) {
        this.a = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
