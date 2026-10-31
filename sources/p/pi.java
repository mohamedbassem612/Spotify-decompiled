package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum pi implements v190 {
    UNKNOWN_IMAGE_STYLE(0),
    CIRCLE(1),
    SQUARE(2),
    FULL_WIDTH(3),
    UNRECOGNIZED(-1);

    public final int a;

    pi(int i) {
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
