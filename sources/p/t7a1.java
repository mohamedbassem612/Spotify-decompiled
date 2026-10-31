package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t7a1 {
    public static final t7a1 a;
    public static final t7a1 b;
    public static final t7a1 c;
    public static final /* synthetic */ t7a1[] d;

    static {
        t7a1 t7a1Var = new t7a1("Track", 0);
        a = t7a1Var;
        t7a1 t7a1Var2 = new t7a1("Contributor", 1);
        b = t7a1Var2;
        t7a1 t7a1Var3 = new t7a1("Sample", 2);
        c = t7a1Var3;
        d = new t7a1[]{t7a1Var, t7a1Var2, t7a1Var3};
    }

    public static t7a1 valueOf(String str) {
        return (t7a1) Enum.valueOf(t7a1.class, str);
    }

    public static t7a1[] values() {
        return (t7a1[]) d.clone();
    }
}
