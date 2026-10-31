package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dov0 {
    public static final dov0 a;
    public static final dov0 b;
    public static final dov0 c;
    public static final /* synthetic */ dov0[] d;

    static {
        dov0 dov0Var = new dov0("Click", 0);
        a = dov0Var;
        dov0 dov0Var2 = new dov0("Clear", 1);
        b = dov0Var2;
        dov0 dov0Var3 = new dov0("Confirm", 2);
        c = dov0Var3;
        d = new dov0[]{dov0Var, dov0Var2, dov0Var3};
    }

    public static dov0 valueOf(String str) {
        return (dov0) Enum.valueOf(dov0.class, str);
    }

    public static dov0[] values() {
        return (dov0[]) d.clone();
    }
}
