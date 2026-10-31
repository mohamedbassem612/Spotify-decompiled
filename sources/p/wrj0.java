package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum wrj0 implements v190 {
    STATUS_UNSPECIFIED(0),
    STATUS_STARTED(1),
    STATUS_FINISHED(2),
    STATUS_FAILED(3),
    UNRECOGNIZED(-1);

    public final int a;

    wrj0(int i) {
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
