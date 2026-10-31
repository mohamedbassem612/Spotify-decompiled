package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public enum spw0 implements v190 {
    PRIVACY_POLICY_CONSENT_TYPE_UNSPECIFIED(0),
    PRIVACY_POLICY_CONSENT_TYPE_NON(1),
    PRIVACY_POLICY_CONSENT_TYPE_COPPA(2),
    PRIVACY_POLICY_CONSENT_TYPE_IMPLICIT(3),
    PRIVACY_POLICY_CONSENT_TYPE_EXPLICIT(4),
    UNRECOGNIZED(-1);

    public final int a;

    spw0(int i) {
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
