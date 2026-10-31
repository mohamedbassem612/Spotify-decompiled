package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public enum ksw0 implements v190 {
    PROCESSING_STATUS_UNSPECIFIED(0),
    INCORPORATED(1),
    PROCESSING(2),
    UNRECOGNIZED(-1);

    public final int a;

    ksw0(int i) {
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
