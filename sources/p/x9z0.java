package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x9z0 {
    public static final x9z0 a;
    public static final /* synthetic */ x9z0[] b;

    static {
        x9z0 x9z0Var = new x9z0("Jam", 0);
        a = x9z0Var;
        b = new x9z0[]{x9z0Var};
    }

    public static x9z0 valueOf(String str) {
        return (x9z0) Enum.valueOf(x9z0.class, str);
    }

    public static x9z0[] values() {
        return (x9z0[]) b.clone();
    }
}
