package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y771 {
    public static final y771 a;
    public static final y771 b;
    public static final /* synthetic */ y771[] c;

    static {
        y771 y771Var = new y771("UNKNOWN", 0);
        a = y771Var;
        y771 y771Var2 = new y771("UGC", 1);
        b = y771Var2;
        c = new y771[]{y771Var, y771Var2};
    }

    public static y771 valueOf(String str) {
        return (y771) Enum.valueOf(y771.class, str);
    }

    public static y771[] values() {
        return (y771[]) c.clone();
    }
}
