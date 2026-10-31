package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yqq0 {
    public static final yqq0 a;
    public static final yqq0 b;
    public static final yqq0 c;
    public static final /* synthetic */ yqq0[] d;

    static {
        yqq0 yqq0Var = new yqq0("PORTRAIT_ONLY", 0);
        a = yqq0Var;
        yqq0 yqq0Var2 = new yqq0("LANDSCAPE_ONLY", 1);
        b = yqq0Var2;
        yqq0 yqq0Var3 = new yqq0("UNSPECIFIED", 2);
        c = yqq0Var3;
        d = new yqq0[]{yqq0Var, yqq0Var2, yqq0Var3};
    }

    public static yqq0 valueOf(String str) {
        return (yqq0) Enum.valueOf(yqq0.class, str);
    }

    public static yqq0[] values() {
        return (yqq0[]) d.clone();
    }
}
