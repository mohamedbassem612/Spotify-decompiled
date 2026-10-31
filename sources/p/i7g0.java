package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class i7g0 {
    public static final i7g0 a;
    public static final i7g0 b;
    public static final i7g0 c;
    public static final /* synthetic */ i7g0[] d;
    public static final /* synthetic */ t0z e;

    static {
        i7g0 i7g0Var = new i7g0("NONE", 0);
        a = i7g0Var;
        i7g0 i7g0Var2 = new i7g0("ARTIST", 1);
        b = i7g0Var2;
        i7g0 i7g0Var3 = new i7g0("TRACK", 2);
        c = i7g0Var3;
        i7g0[] i7g0VarArr = {i7g0Var, i7g0Var2, i7g0Var3};
        d = i7g0VarArr;
        e = new t0z(i7g0VarArr);
    }

    public static i7g0 valueOf(String str) {
        return (i7g0) Enum.valueOf(i7g0.class, str);
    }

    public static i7g0[] values() {
        return (i7g0[]) d.clone();
    }
}
