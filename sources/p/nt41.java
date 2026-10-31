package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nt41 {
    public static final nt41 a;
    public static final nt41 b;
    public static final /* synthetic */ nt41[] c;

    static {
        nt41 nt41Var = new nt41("BACKWARD", 0);
        a = nt41Var;
        nt41 nt41Var2 = new nt41("FORWARD", 1);
        b = nt41Var2;
        c = new nt41[]{nt41Var, nt41Var2};
    }

    public static nt41 valueOf(String str) {
        return (nt41) Enum.valueOf(nt41.class, str);
    }

    public static nt41[] values() {
        return (nt41[]) c.clone();
    }
}
