package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gb91 {
    public static final gb91 a;
    public static final gb91 b;
    public static final /* synthetic */ gb91[] c;

    static {
        gb91 gb91Var = new gb91("THUMB", 0);
        a = gb91Var;
        gb91 gb91Var2 = new gb91("TRACK", 1);
        b = gb91Var2;
        c = new gb91[]{gb91Var, gb91Var2};
    }

    public static gb91 valueOf(String str) {
        return (gb91) Enum.valueOf(gb91.class, str);
    }

    public static gb91[] values() {
        return (gb91[]) c.clone();
    }
}
