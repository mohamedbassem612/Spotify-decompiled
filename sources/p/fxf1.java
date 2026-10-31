package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fxf1 {
    public static final fxf1 a;
    public static final /* synthetic */ fxf1[] b;
    public static final /* synthetic */ t0z c;

    /* JADX INFO: Fake field, exist only in values array */
    fxf1 EF0;

    static {
        fxf1 fxf1Var = new fxf1("UP", 0);
        fxf1 fxf1Var2 = new fxf1("DOWN", 1);
        fxf1 fxf1Var3 = new fxf1("NEW", 2);
        fxf1 fxf1Var4 = new fxf1("NONE", 3);
        a = fxf1Var4;
        fxf1[] fxf1VarArr = {fxf1Var, fxf1Var2, fxf1Var3, fxf1Var4};
        b = fxf1VarArr;
        c = new t0z(fxf1VarArr);
    }

    public static fxf1 valueOf(String str) {
        return (fxf1) Enum.valueOf(fxf1.class, str);
    }

    public static fxf1[] values() {
        return (fxf1[]) b.clone();
    }
}
