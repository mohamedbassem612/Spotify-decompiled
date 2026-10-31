package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public enum pvh1 implements v190 {
    OK(0),
    INVALID_SLOT(1),
    BAD_REQUEST(2),
    UNRECOGNIZED(-1);

    public final int a;

    pvh1(int i) {
        this.a = i;
    }

    @Override // p.v190
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.a;
        }
        hhg1.n("Can't get the number of an unknown enum value.");
        return 0;
    }
}
