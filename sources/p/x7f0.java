package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x7f0 {
    public static final x7f0 a;
    public static final x7f0 b;
    public static final x7f0 c;
    public static final x7f0 d;
    public static final /* synthetic */ x7f0[] e;

    static {
        x7f0 x7f0Var = new x7f0("Phone", 0);
        a = x7f0Var;
        x7f0 x7f0Var2 = new x7f0("Connect", 1);
        b = x7f0Var2;
        x7f0 x7f0Var3 = new x7f0("Bluetooth", 2);
        c = x7f0Var3;
        x7f0 x7f0Var4 = new x7f0("Desktop", 3);
        d = x7f0Var4;
        e = new x7f0[]{x7f0Var, x7f0Var2, x7f0Var3, x7f0Var4};
    }

    public static x7f0 valueOf(String str) {
        return (x7f0) Enum.valueOf(x7f0.class, str);
    }

    public static x7f0[] values() {
        return (x7f0[]) e.clone();
    }
}
