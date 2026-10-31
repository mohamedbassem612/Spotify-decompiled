package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wls0 {
    public static final wls0 a;
    public static final wls0 b;
    public static final wls0 c;
    public static final wls0 d;
    public static final wls0 e;
    public static final wls0 f;
    public static final /* synthetic */ wls0[] g;
    public static final /* synthetic */ t0z h;

    static {
        wls0 wls0Var = new wls0("ADMIN", 0);
        a = wls0Var;
        wls0 wls0Var2 = new wls0("UNKNOWN", 1);
        b = wls0Var2;
        wls0 wls0Var3 = new wls0("BLOCKED", 2);
        c = wls0Var3;
        wls0 wls0Var4 = new wls0("VIEWER", 3);
        d = wls0Var4;
        wls0 wls0Var5 = new wls0("MADE_FOR", 4);
        e = wls0Var5;
        wls0 wls0Var6 = new wls0("CONTRIBUTOR", 5);
        f = wls0Var6;
        wls0[] wls0VarArr = {wls0Var, wls0Var2, wls0Var3, wls0Var4, wls0Var5, wls0Var6};
        g = wls0VarArr;
        h = new t0z(wls0VarArr);
    }

    public static wls0 valueOf(String str) {
        return (wls0) Enum.valueOf(wls0.class, str);
    }

    public static wls0[] values() {
        return (wls0[]) g.clone();
    }

    public final boolean a() {
        return this == c;
    }

    public final boolean b() {
        return this == f;
    }
}
