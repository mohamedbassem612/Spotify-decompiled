package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public enum ifg1 implements v190 {
    IN_PROGRESS(0),
    COMPLETED(1),
    FAILED(2),
    UNRECOGNIZED(-1);

    public final int a;

    ifg1(int i) {
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
