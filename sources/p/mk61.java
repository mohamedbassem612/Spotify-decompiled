package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mk61 {
    public static final mk61 a;
    public static final mk61 b;
    public static final mk61 c;
    public static final /* synthetic */ mk61[] d;

    static {
        mk61 mk61Var = new mk61("ACCEPTED", 0);
        a = mk61Var;
        mk61 mk61Var2 = new mk61("BAD_REQUEST", 1);
        b = mk61Var2;
        mk61 mk61Var3 = new mk61("UNRECOGNIZED", 2);
        c = mk61Var3;
        d = new mk61[]{mk61Var, mk61Var2, mk61Var3};
    }

    public static mk61 valueOf(String str) {
        return (mk61) Enum.valueOf(mk61.class, str);
    }

    public static mk61[] values() {
        return (mk61[]) d.clone();
    }
}
