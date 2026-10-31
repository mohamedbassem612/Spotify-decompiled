package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bwj1 {
    public static final bwj1 a;
    public static final bwj1 b;
    public static final /* synthetic */ bwj1[] c;

    static {
        bwj1 bwj1Var = new bwj1("VideoOnly", 0);
        a = bwj1Var;
        bwj1 bwj1Var2 = new bwj1("SessionOnly", 1);
        b = bwj1Var2;
        c = new bwj1[]{bwj1Var, bwj1Var2};
    }

    public static bwj1 valueOf(String str) {
        return (bwj1) Enum.valueOf(bwj1.class, str);
    }

    public static bwj1[] values() {
        return (bwj1[]) c.clone();
    }
}
