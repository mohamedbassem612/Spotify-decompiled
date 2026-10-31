package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum vvy0 implements v190 {
    CONTENT_TYPE_UNSPECIFIED(0),
    CONTENT_TYPE_TEXT(1),
    CONTENT_TYPE_MEDIA(2),
    UNRECOGNIZED(-1);

    public final int a;

    vvy0(int i) {
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
