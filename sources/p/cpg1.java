package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cpg1 {
    public static final cpg1 a;
    public static final cpg1 b;
    public static final cpg1 c;
    public static final /* synthetic */ cpg1[] d;

    static {
        cpg1 cpg1Var = new cpg1("ContinueTraversal", 0);
        a = cpg1Var;
        cpg1 cpg1Var2 = new cpg1("SkipSubtreeAndContinueTraversal", 1);
        b = cpg1Var2;
        cpg1 cpg1Var3 = new cpg1("CancelTraversal", 2);
        c = cpg1Var3;
        d = new cpg1[]{cpg1Var, cpg1Var2, cpg1Var3};
    }

    public static cpg1 valueOf(String str) {
        return (cpg1) Enum.valueOf(cpg1.class, str);
    }

    public static cpg1[] values() {
        return (cpg1[]) d.clone();
    }
}
