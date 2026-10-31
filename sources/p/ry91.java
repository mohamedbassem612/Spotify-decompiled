package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ry91 {
    public static final ry91 a;
    public static final ry91 b;
    public static final ry91 c;
    public static final ry91 d;
    public static final ry91 e;
    public static final /* synthetic */ ry91[] f;

    static {
        ry91 ry91Var = new ry91("UNKNOWN", 0);
        a = ry91Var;
        ry91 ry91Var2 = new ry91("NONE", 1);
        b = ry91Var2;
        ry91 ry91Var3 = new ry91("FRIEND", 2);
        c = ry91Var3;
        ry91 ry91Var4 = new ry91("SENT", 3);
        d = ry91Var4;
        ry91 ry91Var5 = new ry91("INCOMING", 4);
        e = ry91Var5;
        f = new ry91[]{ry91Var, ry91Var2, ry91Var3, ry91Var4, ry91Var5};
    }

    public static ry91 valueOf(String str) {
        return (ry91) Enum.valueOf(ry91.class, str);
    }

    public static ry91[] values() {
        return (ry91[]) f.clone();
    }
}
