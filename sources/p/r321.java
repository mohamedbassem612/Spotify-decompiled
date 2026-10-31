package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class r321 {
    public static final r321 a;
    public static final r321 b;
    public static final /* synthetic */ r321[] c;

    static {
        r321 r321Var = new r321("PLAYING", 0);
        a = r321Var;
        r321 r321Var2 = new r321("NOT_PLAYING", 1);
        b = r321Var2;
        c = new r321[]{r321Var, r321Var2};
        new eoc((byte) 22);
    }

    public static r321 valueOf(String str) {
        return (r321) Enum.valueOf(r321.class, str);
    }

    public static r321[] values() {
        return (r321[]) c.clone();
    }
}
