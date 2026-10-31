package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum jz4 implements v190 {
    ANDROID_PUSH_TOKEN_SOURCE_UNSPECIFIED(0),
    ANDROID_PUSH_TOKEN_SOURCE_FCM_TOKEN(1),
    ANDROID_PUSH_TOKEN_SOURCE_FIREBASE_INSTALLATION_ID(2),
    UNRECOGNIZED(-1);

    public final int a;

    jz4(int i) {
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
