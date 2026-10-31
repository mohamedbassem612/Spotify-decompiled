package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bfd1 {
    public static final bfd1 a;
    public static final bfd1 b;
    public static final bfd1 c;
    public static final bfd1 d;
    public static final /* synthetic */ bfd1[] e;

    static {
        bfd1 bfd1Var = new bfd1("FIRST", 0);
        a = bfd1Var;
        bfd1 bfd1Var2 = new bfd1("SECOND", 1);
        b = bfd1Var2;
        bfd1 bfd1Var3 = new bfd1("THIRD", 2);
        c = bfd1Var3;
        bfd1 bfd1Var4 = new bfd1("FOURTH", 3);
        d = bfd1Var4;
        e = new bfd1[]{bfd1Var, bfd1Var2, bfd1Var3, bfd1Var4};
    }

    public static bfd1 valueOf(String str) {
        return (bfd1) Enum.valueOf(bfd1.class, str);
    }

    public static bfd1[] values() {
        return (bfd1[]) e.clone();
    }
}
