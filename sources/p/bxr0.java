package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bxr0 {
    public static final bxr0 a;
    public static final bxr0 b;
    public static final /* synthetic */ bxr0[] c;

    static {
        bxr0 bxr0Var = new bxr0("EXPLICIT", 0);
        a = bxr0Var;
        bxr0 bxr0Var2 = new bxr0("VIDEOS", 1);
        b = bxr0Var2;
        c = new bxr0[]{bxr0Var, bxr0Var2};
    }

    public static bxr0 valueOf(String str) {
        return (bxr0) Enum.valueOf(bxr0.class, str);
    }

    public static bxr0[] values() {
        return (bxr0[]) c.clone();
    }
}
