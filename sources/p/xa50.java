package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xa50 {
    public static final xa50 a;
    public static final /* synthetic */ xa50[] b;

    static {
        xa50 xa50Var = new xa50("INELIGIBLE", 0);
        a = xa50Var;
        b = new xa50[]{xa50Var, new xa50("CAN_REQUEST_GRADUATION", 1), new xa50("GRADUATION_CHOICE_REQUIRED", 2), new xa50("GRADUATION_POSTPONED_AND_MUST_ACCEPT_NEW_TERMS", 3), new xa50("GRADUATION_REQUEST_PENDING_AND_MUST_ACCEPT_NEW_TERMS", 4), new xa50("GRADUATION_REQUEST_PENDING", 5), new xa50("GRADUATION_REQUEST_APPROVED", 6), new xa50("GRADUATION_REQUEST_DENIED", 7), new xa50("GRADUATION_PENDING", 8), new xa50("GRADUATION_REQUIRED", 9)};
    }

    public static xa50 valueOf(String str) {
        return (xa50) Enum.valueOf(xa50.class, str);
    }

    public static xa50[] values() {
        return (xa50[]) b.clone();
    }
}
