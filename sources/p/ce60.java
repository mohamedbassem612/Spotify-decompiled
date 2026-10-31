package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ce60 {
    public static final ce60 a;
    public static final ce60 b;
    public static final /* synthetic */ ce60[] c;

    static {
        ce60 ce60Var = new ce60("PEEK", 0);
        a = ce60Var;
        ce60 ce60Var2 = new ce60("REVEAL", 1);
        b = ce60Var2;
        c = new ce60[]{ce60Var, ce60Var2};
    }

    public static ce60 valueOf(String str) {
        return (ce60) Enum.valueOf(ce60.class, str);
    }

    public static ce60[] values() {
        return (ce60[]) c.clone();
    }
}
