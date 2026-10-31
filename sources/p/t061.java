package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t061 {
    public static final t061 a;
    public static final /* synthetic */ t061[] b;

    static {
        t061 t061Var = new t061("Toggle", 0);
        a = t061Var;
        b = new t061[]{t061Var};
    }

    public static t061 valueOf(String str) {
        return (t061) Enum.valueOf(t061.class, str);
    }

    public static t061[] values() {
        return (t061[]) b.clone();
    }
}
