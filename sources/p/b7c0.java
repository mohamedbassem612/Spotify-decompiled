package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b7c0 {
    public static final b7c0 a;
    public static final b7c0 b;
    public static final /* synthetic */ b7c0[] c;
    public static final /* synthetic */ t0z d;

    static {
        b7c0 b7c0Var = new b7c0("LIST", 0);
        a = b7c0Var;
        b7c0 b7c0Var2 = new b7c0("GRID", 1);
        b = b7c0Var2;
        b7c0[] b7c0VarArr = {b7c0Var, b7c0Var2};
        c = b7c0VarArr;
        d = new t0z(b7c0VarArr);
    }

    public static b7c0 valueOf(String str) {
        return (b7c0) Enum.valueOf(b7c0.class, str);
    }

    public static b7c0[] values() {
        return (b7c0[]) c.clone();
    }
}
