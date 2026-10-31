package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xqe1 {
    public static final xqe1 a;
    public static final /* synthetic */ xqe1[] b;

    static {
        xqe1 xqe1Var = new xqe1("QUICK", 0);
        a = xqe1Var;
        b = new xqe1[]{xqe1Var, new xqe1("HIGH", 1)};
    }

    public static xqe1 valueOf(String str) {
        return (xqe1) Enum.valueOf(xqe1.class, str);
    }

    public static xqe1[] values() {
        return (xqe1[]) b.clone();
    }
}
