package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zt70 {
    public static final zt70 a;
    public static final zt70 b;
    public static final /* synthetic */ zt70[] c;

    static {
        zt70 zt70Var = new zt70("CardClicked", 0);
        a = zt70Var;
        zt70 zt70Var2 = new zt70("CardLongClicked", 1);
        b = zt70Var2;
        c = new zt70[]{zt70Var, zt70Var2};
    }

    public static zt70 valueOf(String str) {
        return (zt70) Enum.valueOf(zt70.class, str);
    }

    public static zt70[] values() {
        return (zt70[]) c.clone();
    }
}
