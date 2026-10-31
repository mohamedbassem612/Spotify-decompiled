package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum vd60 implements v190 {
    NONE(0),
    WRAPPED(1),
    NEW_RELEASES(2),
    AUDIOBOOKS(3),
    UNRECOGNIZED(-1);

    public final int a;

    vd60(int i) {
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
