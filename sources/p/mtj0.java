package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mtj0 {
    public static final mtj0 a;
    public static final /* synthetic */ mtj0[] b;
    public static final /* synthetic */ t0z c;

    /* JADX INFO: Fake field, exist only in values array */
    mtj0 EF0;

    static {
        mtj0 mtj0Var = new mtj0("SUPERSEDE", 0);
        mtj0 mtj0Var2 = new mtj0("DROP", 1);
        a = mtj0Var2;
        mtj0[] mtj0VarArr = {mtj0Var, mtj0Var2};
        b = mtj0VarArr;
        c = new t0z(mtj0VarArr);
    }

    public static mtj0 valueOf(String str) {
        return (mtj0) Enum.valueOf(mtj0.class, str);
    }

    public static mtj0[] values() {
        return (mtj0[]) b.clone();
    }
}
