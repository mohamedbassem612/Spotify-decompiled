package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class aop0 {
    public static final aop0 a;
    public static final /* synthetic */ aop0[] b;

    static {
        aop0 aop0Var = new aop0("OnClick", 0);
        a = aop0Var;
        b = new aop0[]{aop0Var};
    }

    public static aop0 valueOf(String str) {
        return (aop0) Enum.valueOf(aop0.class, str);
    }

    public static aop0[] values() {
        return (aop0[]) b.clone();
    }
}
