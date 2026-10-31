package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l4a0 {
    public static final l4a0 a;
    public static final l4a0 b;
    public static final l4a0 c;
    public static final /* synthetic */ l4a0[] d;

    static {
        l4a0 l4a0Var = new l4a0("BASIC", 0);
        a = l4a0Var;
        l4a0 l4a0Var2 = new l4a0("EXPANDED", 1);
        b = l4a0Var2;
        l4a0 l4a0Var3 = new l4a0("DISABLED", 2);
        c = l4a0Var3;
        d = new l4a0[]{l4a0Var, l4a0Var2, l4a0Var3};
    }

    public static l4a0 valueOf(String str) {
        return (l4a0) Enum.valueOf(l4a0.class, str);
    }

    public static l4a0[] values() {
        return (l4a0[]) d.clone();
    }
}
