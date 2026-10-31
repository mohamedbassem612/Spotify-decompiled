package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum yns0 implements v190 {
    QUEUE_PERMISSION_RESULTS_ALLOWED(0),
    QUEUE_PERMISSION_RESULTS_ALLOWED_UNCAPPED_PNS(1),
    QUEUE_PERMISSION_RESULTS_DISALLOWED_MFT(2),
    QUEUE_PERMISSION_RESULTS_DISALLOWED_CAPPED_PNS(3),
    UNRECOGNIZED(-1);

    public final int a;

    yns0(int i) {
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
