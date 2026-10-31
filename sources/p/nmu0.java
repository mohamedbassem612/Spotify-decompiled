package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nmu0 {
    public static final nmu0 a;
    public static final nmu0 b;
    public static final nmu0 c;
    public static final /* synthetic */ nmu0[] d;
    public static final /* synthetic */ t0z e;

    static {
        nmu0 nmu0Var = new nmu0("ITERATIVE_UPDATE", 0);
        b = nmu0Var;
        nmu0 nmu0Var2 = new nmu0("FULL_GENERATION", 1);
        c = nmu0Var2;
        nmu0[] nmu0VarArr = {nmu0Var, nmu0Var2};
        d = nmu0VarArr;
        e = new t0z(nmu0VarArr);
        a = nmu0Var2;
    }

    public static nmu0 valueOf(String str) {
        return (nmu0) Enum.valueOf(nmu0.class, str);
    }

    public static nmu0[] values() {
        return (nmu0[]) d.clone();
    }
}
