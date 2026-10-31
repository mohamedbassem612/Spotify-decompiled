package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pwt0 {
    public static final pwt0 a;
    public static final pwt0 b;
    public static final /* synthetic */ pwt0[] c;

    static {
        pwt0 pwt0Var = new pwt0("PlayIfItemIsNotCurrentItem", 0);
        a = pwt0Var;
        pwt0 pwt0Var2 = new pwt0("Never", 1);
        b = pwt0Var2;
        c = new pwt0[]{pwt0Var, pwt0Var2};
    }

    public static pwt0 valueOf(String str) {
        return (pwt0) Enum.valueOf(pwt0.class, str);
    }

    public static pwt0[] values() {
        return (pwt0[]) c.clone();
    }
}
