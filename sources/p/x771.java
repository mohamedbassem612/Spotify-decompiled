package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x771 {
    public static final x771 a;
    public static final x771 b;
    public static final /* synthetic */ x771[] c;

    static {
        x771 x771Var = new x771("UNKNOWN", 0);
        a = x771Var;
        x771 x771Var2 = new x771("UGC", 1);
        b = x771Var2;
        c = new x771[]{x771Var, x771Var2};
    }

    public static x771 valueOf(String str) {
        return (x771) Enum.valueOf(x771.class, str);
    }

    public static x771[] values() {
        return (x771[]) c.clone();
    }
}
