package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum wv11 implements v190 {
    RELEASE_TAG_UNKNOWN(0),
    RELEASE_TAG_LATEST_RELEASE(1),
    RELEASE_TAG_PRE_RELEASE(2),
    UNRECOGNIZED(-1);

    public final int a;

    wv11(int i) {
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
