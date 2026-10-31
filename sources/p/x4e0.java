package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x4e0 {
    public static final x4e0 a;
    public static final x4e0 b;
    public static final x4e0 c;
    public static final /* synthetic */ x4e0[] d;

    static {
        x4e0 x4e0Var = new x4e0("NETWORK", 0);
        a = x4e0Var;
        x4e0 x4e0Var2 = new x4e0("CACHE", 1);
        b = x4e0Var2;
        x4e0 x4e0Var3 = new x4e0("FALLBACK", 2);
        c = x4e0Var3;
        d = new x4e0[]{x4e0Var, x4e0Var2, x4e0Var3, new x4e0("OFFLINE", 3)};
    }

    public static x4e0 valueOf(String str) {
        return (x4e0) Enum.valueOf(x4e0.class, str);
    }

    public static x4e0[] values() {
        return (x4e0[]) d.clone();
    }
}
