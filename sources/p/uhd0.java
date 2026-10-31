package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uhd0 {
    public static final uhd0 a;
    public static final uhd0 b;
    public static final uhd0 c;
    public static final /* synthetic */ uhd0[] d;
    public static final /* synthetic */ t0z e;

    static {
        uhd0 uhd0Var = new uhd0("YOUNGER", 0);
        a = uhd0Var;
        uhd0 uhd0Var2 = new uhd0("SAME_AGE", 1);
        b = uhd0Var2;
        uhd0 uhd0Var3 = new uhd0("OLDER", 2);
        c = uhd0Var3;
        uhd0[] uhd0VarArr = {uhd0Var, uhd0Var2, uhd0Var3};
        d = uhd0VarArr;
        e = new t0z(uhd0VarArr);
    }

    public static uhd0 valueOf(String str) {
        return (uhd0) Enum.valueOf(uhd0.class, str);
    }

    public static uhd0[] values() {
        return (uhd0[]) d.clone();
    }
}
