package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a851 {
    public static final a851 X;
    public static final /* synthetic */ a851[] Y;
    public static final a851 a;
    public static final a851 b;
    public static final a851 c;
    public static final a851 d;
    public static final a851 e;
    public static final a851 f;
    public static final a851 g;
    public static final a851 h;
    public static final a851 i;
    public static final a851 t;

    static {
        a851 a851Var = new a851("NONE", 0);
        a = a851Var;
        a851 a851Var2 = new a851("LOADING", 1);
        b = a851Var2;
        a851 a851Var3 = new a851("ONLINE", 2);
        c = a851Var3;
        a851 a851Var4 = new a851("OFFLINE", 3);
        d = a851Var4;
        a851 a851Var5 = new a851("HISTORY", 4);
        e = a851Var5;
        a851 a851Var6 = new a851("ONLINE_ERROR", 5);
        f = a851Var6;
        a851 a851Var7 = new a851("HISTORY_ERROR", 6);
        g = a851Var7;
        a851 a851Var8 = new a851("AUTOCOMPLETE", 7);
        h = a851Var8;
        a851 a851Var9 = new a851("AUTOCOMPLETE_ERROR", 8);
        i = a851Var9;
        a851 a851Var10 = new a851("RECENTS", 9);
        t = a851Var10;
        a851 a851Var11 = new a851("NATIVE", 10);
        X = a851Var11;
        Y = new a851[]{a851Var, a851Var2, a851Var3, a851Var4, a851Var5, a851Var6, a851Var7, a851Var8, a851Var9, a851Var10, a851Var11};
    }

    public static a851 valueOf(String str) {
        return (a851) Enum.valueOf(a851.class, str);
    }

    public static a851[] values() {
        return (a851[]) Y.clone();
    }
}
