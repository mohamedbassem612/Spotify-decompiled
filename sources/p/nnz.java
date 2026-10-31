package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum nnz implements v190 {
    OK(0),
    FAILED(1),
    SUNSET(2),
    UNRECOGNIZED(-1);

    public final int a;

    nnz(int i) {
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
