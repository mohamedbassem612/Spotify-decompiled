package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dh40 {
    public static final dh40 a;
    public static final dh40 b;
    public static final dh40 c;
    public static final dh40 d;
    public static final dh40 e;
    public static final dh40 f;
    public static final /* synthetic */ dh40[] g;

    static {
        dh40 dh40Var = new dh40("UNSPECIFIED", 0);
        a = dh40Var;
        dh40 dh40Var2 = new dh40("GENERATING", 1);
        b = dh40Var2;
        dh40 dh40Var3 = new dh40("GENERATED", 2);
        c = dh40Var3;
        dh40 dh40Var4 = new dh40("READY", 3);
        d = dh40Var4;
        dh40 dh40Var5 = new dh40("FAILED", 4);
        e = dh40Var5;
        dh40 dh40Var6 = new dh40("NO_CREDITS", 5);
        f = dh40Var6;
        g = new dh40[]{dh40Var, dh40Var2, dh40Var3, dh40Var4, dh40Var5, dh40Var6};
    }

    public static dh40 valueOf(String str) {
        return (dh40) Enum.valueOf(dh40.class, str);
    }

    public static dh40[] values() {
        return (dh40[]) g.clone();
    }
}
