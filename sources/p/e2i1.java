package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e2i1 {
    public static final e2i1 a;
    public static final e2i1 b;
    public static final /* synthetic */ e2i1[] c;

    static {
        e2i1 e2i1Var = new e2i1("INLINE", 0);
        a = e2i1Var;
        e2i1 e2i1Var2 = new e2i1("BOTTOM_SHEET", 1);
        b = e2i1Var2;
        c = new e2i1[]{e2i1Var, e2i1Var2};
    }

    public static e2i1 valueOf(String str) {
        return (e2i1) Enum.valueOf(e2i1.class, str);
    }

    public static e2i1[] values() {
        return (e2i1[]) c.clone();
    }
}
