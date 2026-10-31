package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d5i1 {
    public static final d5i1 a;
    public static final d5i1 b;
    public static final d5i1 c;
    public static final /* synthetic */ d5i1[] d;

    static {
        d5i1 d5i1Var = new d5i1("VisibleCanHide", 0);
        a = d5i1Var;
        d5i1 d5i1Var2 = new d5i1("HiddenCanUnhide", 1);
        b = d5i1Var2;
        d5i1 d5i1Var3 = new d5i1("NotEligible", 2);
        c = d5i1Var3;
        d = new d5i1[]{d5i1Var, d5i1Var2, d5i1Var3};
    }

    public static d5i1 valueOf(String str) {
        return (d5i1) Enum.valueOf(d5i1.class, str);
    }

    public static d5i1[] values() {
        return (d5i1[]) d.clone();
    }
}
