package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pmm1 {
    public static final pmm1 a;
    public static final pmm1 b;
    public static final pmm1 c;
    public static final /* synthetic */ pmm1[] d;

    static {
        pmm1 pmm1Var = new pmm1("NotConnected", 0);
        a = pmm1Var;
        pmm1 pmm1Var2 = new pmm1("ConnectedWithDisplay", 1);
        b = pmm1Var2;
        pmm1 pmm1Var3 = new pmm1("ConnectedWithoutDisplay", 2);
        c = pmm1Var3;
        d = new pmm1[]{pmm1Var, pmm1Var2, pmm1Var3};
    }

    public static pmm1 valueOf(String str) {
        return (pmm1) Enum.valueOf(pmm1.class, str);
    }

    public static pmm1[] values() {
        return (pmm1[]) d.clone();
    }
}
