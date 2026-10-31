package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class onr0 {
    public static final onr0 a;
    public static final onr0 b;
    public static final onr0 c;
    public static final /* synthetic */ onr0[] d;

    static {
        onr0 onr0Var = new onr0("Main", 0);
        a = onr0Var;
        onr0 onr0Var2 = new onr0("Auxiliary", 1);
        b = onr0Var2;
        onr0 onr0Var3 = new onr0("Bar", 2);
        c = onr0Var3;
        d = new onr0[]{onr0Var, onr0Var2, onr0Var3, new onr0("Chrome", 3)};
    }

    public static onr0 valueOf(String str) {
        return (onr0) Enum.valueOf(onr0.class, str);
    }

    public static onr0[] values() {
        return (onr0[]) d.clone();
    }
}
