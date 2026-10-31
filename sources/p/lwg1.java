package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lwg1 {
    public static final lwg1 a;
    public static final lwg1 b;
    public static final lwg1 c;
    public static final lwg1 d;
    public static final lwg1 e;
    public static final lwg1 f;
    public static final lwg1 g;
    public static final lwg1 h;
    public static final lwg1 i;
    public static final /* synthetic */ lwg1[] t;

    static {
        lwg1 lwg1Var = new lwg1("UNSPECIFIED", 0);
        a = lwg1Var;
        lwg1 lwg1Var2 = new lwg1("CONTENT_SHARING", 1);
        b = lwg1Var2;
        lwg1 lwg1Var3 = new lwg1("COLLABORATIVE_PLAYLISTS", 2);
        c = lwg1Var3;
        lwg1 lwg1Var4 = new lwg1("BLENDS", 3);
        d = lwg1Var4;
        lwg1 lwg1Var5 = new lwg1("GROUP_SESSIONS", 4);
        e = lwg1Var5;
        lwg1 lwg1Var6 = new lwg1("FAMILY", 5);
        f = lwg1Var6;
        lwg1 lwg1Var7 = new lwg1("FOLLOWING", 6);
        g = lwg1Var7;
        lwg1 lwg1Var8 = new lwg1("MESSAGING", 7);
        h = lwg1Var8;
        lwg1 lwg1Var9 = new lwg1("WRAPPED_PARTY", 8);
        i = lwg1Var9;
        t = new lwg1[]{lwg1Var, lwg1Var2, lwg1Var3, lwg1Var4, lwg1Var5, lwg1Var6, lwg1Var7, lwg1Var8, lwg1Var9};
    }

    public static lwg1 valueOf(String str) {
        return (lwg1) Enum.valueOf(lwg1.class, str);
    }

    public static lwg1[] values() {
        return (lwg1[]) t.clone();
    }
}
