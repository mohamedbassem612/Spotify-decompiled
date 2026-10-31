package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum upw0 implements v190 {
    PRIVACY_POLICY_TYPE_UNSPECIFIED(0),
    PRIVACY_POLICY_TYPE_NON(1),
    PRIVACY_POLICY_TYPE_EXPLICIT(2),
    PRIVACY_POLICY_TYPE_IMPLICIT(3),
    UNRECOGNIZED(-1);

    public final int a;

    upw0(int i) {
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
