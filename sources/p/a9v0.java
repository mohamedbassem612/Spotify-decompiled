package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum a9v0 implements v190 {
    BADGE_UNSPECIFIED(0),
    BADGE_EXTRAS(1),
    UNRECOGNIZED(-1);

    public final int a;

    a9v0(int i) {
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
