package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ahn1 {
    public static final ahn1 a;
    public static final ahn1 b;
    public static final ahn1 c;
    public static final /* synthetic */ ahn1[] d;

    /* JADX INFO: Fake field, exist only in values array */
    ahn1 EF0;

    static {
        ahn1 ahn1Var = new ahn1("SHA1", 0);
        ahn1 ahn1Var2 = new ahn1("SHA224", 1);
        ahn1 ahn1Var3 = new ahn1("SHA256", 2);
        a = ahn1Var3;
        ahn1 ahn1Var4 = new ahn1("SHA384", 3);
        b = ahn1Var4;
        ahn1 ahn1Var5 = new ahn1("SHA512", 4);
        c = ahn1Var5;
        d = new ahn1[]{ahn1Var, ahn1Var2, ahn1Var3, ahn1Var4, ahn1Var5};
    }

    public static ahn1[] values() {
        return (ahn1[]) d.clone();
    }
}
