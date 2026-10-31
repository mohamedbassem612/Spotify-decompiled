package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public enum acv0 implements v190 {
    MULTIPLE_CHOICE(0),
    SINGLE_CHOICE(1),
    UNRECOGNIZED(-1);

    public final int a;

    acv0(int i) {
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
