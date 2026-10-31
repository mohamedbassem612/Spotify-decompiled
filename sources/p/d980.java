package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class d980 {
    public static final d980 a;
    public static final d980 b;
    public static final d980 c;
    public static final /* synthetic */ d980[] d;

    static {
        d980 d980Var = new d980("AUTO", 0);
        a = d980Var;
        d980 d980Var2 = new d980("CONNECT", 1);
        b = d980Var2;
        d980 d980Var3 = new d980("CAST", 2);
        c = d980Var3;
        d = new d980[]{d980Var, d980Var2, d980Var3};
    }

    public static d980 valueOf(String str) {
        return (d980) Enum.valueOf(d980.class, str);
    }

    public static d980[] values() {
        return (d980[]) d.clone();
    }
}
