package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public enum vns0 implements v190 {
    AGE_ASSURANCE_REASON_UNKNOWN(0),
    AGE_ASSURANCE_REASON_UNAVAILABLE(1),
    AGE_ASSURANCE_REASON_REQUIRES_AGE_ASSURANCE(2),
    AGE_ASSURANCE_REASON_ALLOW(3),
    UNRECOGNIZED(-1);

    public final int a;

    vns0(int i) {
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
