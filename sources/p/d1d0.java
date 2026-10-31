package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d1d0 {
    public static final d1d0 a;
    public static final d1d0 b;
    public static final /* synthetic */ d1d0[] c;

    static {
        d1d0 d1d0Var = new d1d0("MakePublic", 0);
        a = d1d0Var;
        d1d0 d1d0Var2 = new d1d0("MakePrivate", 1);
        b = d1d0Var2;
        c = new d1d0[]{d1d0Var, d1d0Var2};
    }

    public static d1d0 valueOf(String str) {
        return (d1d0) Enum.valueOf(d1d0.class, str);
    }

    public static d1d0[] values() {
        return (d1d0[]) c.clone();
    }
}
