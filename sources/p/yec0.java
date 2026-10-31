package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yec0 {
    public static final yec0 a;
    public static final yec0 b;
    public static final /* synthetic */ yec0[] c;

    static {
        yec0 yec0Var = new yec0("HideBottomActions", 0);
        a = yec0Var;
        yec0 yec0Var2 = new yec0("ShowBottomActions", 1);
        b = yec0Var2;
        c = new yec0[]{yec0Var, yec0Var2};
    }

    public static yec0 valueOf(String str) {
        return (yec0) Enum.valueOf(yec0.class, str);
    }

    public static yec0[] values() {
        return (yec0[]) c.clone();
    }
}
