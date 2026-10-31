package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p521 {
    public static final p521 a;
    public static final p521 b;
    public static final /* synthetic */ p521[] c;

    static {
        p521 p521Var = new p521("Approved", 0);
        a = p521Var;
        p521 p521Var2 = new p521("Cancelled", 1);
        b = p521Var2;
        c = new p521[]{p521Var, p521Var2};
    }

    public static p521 valueOf(String str) {
        return (p521) Enum.valueOf(p521.class, str);
    }

    public static p521[] values() {
        return (p521[]) c.clone();
    }
}
