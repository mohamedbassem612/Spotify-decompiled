package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tml1 {
    public static final tml1 a;
    public static final tml1 b;
    public static final tml1 c;
    public static final tml1 d;
    public static final tml1 e;
    public static final /* synthetic */ tml1[] f;

    /* JADX INFO: Fake field, exist only in values array */
    tml1 EF0;

    static {
        tml1 tml1Var = new tml1("INTENT_IS_NOT_FROM_WHATSAPP", 0);
        tml1 tml1Var2 = new tml1("OTP_CODE_NOT_RECEIVED", 1);
        a = tml1Var2;
        tml1 tml1Var3 = new tml1("HANDSHAKE_ID_MISSING", 2);
        b = tml1Var3;
        tml1 tml1Var4 = new tml1("HANDSHAKE_ID_INVALID_FORMAT", 3);
        c = tml1Var4;
        tml1 tml1Var5 = new tml1("HANDSHAKE_ID_MISMATCH", 4);
        d = tml1Var5;
        tml1 tml1Var6 = new tml1("GENERIC_EXCEPTION", 5);
        e = tml1Var6;
        f = new tml1[]{tml1Var, tml1Var2, tml1Var3, tml1Var4, tml1Var5, tml1Var6};
    }

    public static tml1 valueOf(String str) {
        return (tml1) Enum.valueOf(tml1.class, str);
    }

    public static tml1[] values() {
        return (tml1[]) f.clone();
    }
}
