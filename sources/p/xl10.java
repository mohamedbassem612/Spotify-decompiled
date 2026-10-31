package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public enum xl10 implements v190 {
    UNKNOWN(0),
    ENTITLEMENT_MISSING(1),
    FEATURE_UNAVAILABLE(2),
    AGE_RESTRICTED(3),
    AGE_ASSURANCE_REQUIRED(4),
    CHILD_ACCOUNT(5),
    DEVICE_NOT_SUPPORTED(6),
    BLOCKED_BY_USER_SETTING(7),
    BLOCKED_BY_ACCOUNT_MANAGER(8),
    DSA_MODE_ENABLED(9),
    UNRELEASED_MARKET(10),
    UNRECOGNIZED(-1);

    public final int a;

    xl10(int i) {
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
