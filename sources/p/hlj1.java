package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum hlj1 implements v190 {
    URL(0),
    MANIFEST_ID(1),
    UNRECOGNIZED(-1);

    public final int a;

    hlj1(int i) {
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
