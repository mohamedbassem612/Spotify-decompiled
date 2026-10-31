package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bh91 {
    public static final bh91 a;
    public static final bh91 b;
    public static final bh91 c;
    public static final bh91 d;
    public static final /* synthetic */ bh91[] e;

    static {
        bh91 bh91Var = new bh91("QUEUED", 0);
        a = bh91Var;
        bh91 bh91Var2 = new bh91("PRESENTED", 1);
        b = bh91Var2;
        bh91 bh91Var3 = new bh91("DISMISSED", 2);
        c = bh91Var3;
        bh91 bh91Var4 = new bh91("CANCELLED", 3);
        d = bh91Var4;
        e = new bh91[]{bh91Var, bh91Var2, bh91Var3, bh91Var4};
    }

    public static bh91 valueOf(String str) {
        return (bh91) Enum.valueOf(bh91.class, str);
    }

    public static bh91[] values() {
        return (bh91[]) e.clone();
    }
}
