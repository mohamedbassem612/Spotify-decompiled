package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uw60 {
    public static final uw60 a;
    public static final uw60 b;
    public static final /* synthetic */ uw60[] c;

    static {
        uw60 uw60Var = new uw60("DISMISSED_SWIPED_DOWN", 0);
        a = uw60Var;
        uw60 uw60Var2 = new uw60("DISMISSED_BACK_PRESSED", 1);
        b = uw60Var2;
        c = new uw60[]{uw60Var, uw60Var2};
    }

    public static uw60 valueOf(String str) {
        return (uw60) Enum.valueOf(uw60.class, str);
    }

    public static uw60[] values() {
        return (uw60[]) c.clone();
    }
}
