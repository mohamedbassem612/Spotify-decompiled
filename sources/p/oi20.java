package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oi20 {
    public static final oi20 a;
    public static final /* synthetic */ oi20[] b;

    static {
        oi20 oi20Var = new oi20("GRANTED", 0);
        a = oi20Var;
        b = new oi20[]{oi20Var, new oi20("DENIED", 1)};
    }

    public static oi20 valueOf(String str) {
        return (oi20) Enum.valueOf(oi20.class, str);
    }

    public static oi20[] values() {
        return (oi20[]) b.clone();
    }
}
