package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wy41 {
    public static final wy41 a;
    public static final wy41 b;
    public static final /* synthetic */ wy41[] c;

    static {
        wy41 wy41Var = new wy41("TRACK", 0);
        a = wy41Var;
        wy41 wy41Var2 = new wy41("ARTIST", 1);
        b = wy41Var2;
        c = new wy41[]{wy41Var, wy41Var2};
    }

    public static wy41 valueOf(String str) {
        return (wy41) Enum.valueOf(wy41.class, str);
    }

    public static wy41[] values() {
        return (wy41[]) c.clone();
    }
}
