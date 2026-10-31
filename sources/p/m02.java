package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class m02 {
    public static final m02 a;
    public static final m02 b;
    public static final m02 c;
    public static final m02 d;
    public static final m02 e;
    public static final m02 f;
    public static final m02 g;
    public static final m02 h;
    public static final m02 i;
    public static final /* synthetic */ m02[] t;

    static {
        m02 m02Var = new m02("UNKNOWN", 0);
        a = m02Var;
        m02 m02Var2 = new m02("MEET_VERSION_UNSUPPORTED", 1);
        b = m02Var2;
        m02 m02Var3 = new m02("SDK_VERSION_UNSUPPORTED", 2);
        c = m02Var3;
        m02 m02Var4 = new m02("PARTICIPANT_INELIGIBLE", 3);
        d = m02Var4;
        m02 m02Var5 = new m02("ADDON_SESSION_IN_PROGRESS_WITH_DIFFERENT_APPLICATION", 4);
        e = m02Var5;
        m02 m02Var6 = new m02("SECURITY_POLICY_EXCEPTION", 5);
        f = m02Var6;
        m02 m02Var7 = new m02("OPERATION_UNSUPPORTED", 6);
        g = m02Var7;
        m02 m02Var8 = new m02("ONGOING_RECORDING", 7);
        h = m02Var8;
        m02 m02Var9 = new m02("ADDON_NOT_INSTALLED", 8);
        i = m02Var9;
        t = new m02[]{m02Var, m02Var2, m02Var3, m02Var4, m02Var5, m02Var6, m02Var7, m02Var8, m02Var9};
    }

    public static m02 valueOf(String str) {
        return (m02) Enum.valueOf(m02.class, str);
    }

    public static m02[] values() {
        return (m02[]) t.clone();
    }
}
