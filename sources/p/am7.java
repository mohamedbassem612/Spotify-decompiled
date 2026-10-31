package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum am7 implements v190 {
    ATTESTATION_UNSPECIFIED(0),
    ATTESTATION_NONE(1),
    ATTESTATION_INDIRECT(2),
    ATTESTATION_DIRECT(3),
    ATTESTATION_ENTERPRISE(4),
    UNRECOGNIZED(-1);

    public final int a;

    am7(int i) {
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
