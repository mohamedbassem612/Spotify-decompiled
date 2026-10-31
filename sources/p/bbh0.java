package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bbh0 {
    public static final bbh0 a;
    public static final bbh0 b;
    public static final bbh0 c;
    public static final /* synthetic */ bbh0[] d;
    public static final /* synthetic */ t0z e;

    static {
        bbh0 bbh0Var = new bbh0("Similar", 0);
        a = bbh0Var;
        bbh0 bbh0Var2 = new bbh0("Recommended", 1);
        b = bbh0Var2;
        bbh0 bbh0Var3 = new bbh0("Unavailable", 2);
        c = bbh0Var3;
        bbh0[] bbh0VarArr = {bbh0Var, bbh0Var2, bbh0Var3};
        d = bbh0VarArr;
        e = new t0z(bbh0VarArr);
    }

    public static bbh0 valueOf(String str) {
        return (bbh0) Enum.valueOf(bbh0.class, str);
    }

    public static bbh0[] values() {
        return (bbh0[]) d.clone();
    }
}
