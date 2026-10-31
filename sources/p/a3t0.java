package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a3t0 {
    public static final a3t0 a;
    public static final a3t0 b;
    public static final /* synthetic */ a3t0[] c;
    public static final /* synthetic */ t0z d;

    static {
        a3t0 a3t0Var = new a3t0("LIST", 0);
        a = a3t0Var;
        a3t0 a3t0Var2 = new a3t0("GRID", 1);
        a3t0 a3t0Var3 = new a3t0("COMPACT_GRID", 2);
        b = a3t0Var3;
        a3t0[] a3t0VarArr = {a3t0Var, a3t0Var2, a3t0Var3};
        c = a3t0VarArr;
        d = new t0z(a3t0VarArr);
    }

    public static a3t0 valueOf(String str) {
        return (a3t0) Enum.valueOf(a3t0.class, str);
    }

    public static a3t0[] values() {
        return (a3t0[]) c.clone();
    }
}
