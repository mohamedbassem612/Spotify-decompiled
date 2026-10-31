package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z53 {
    public static final z53 a;
    public static final z53 b;
    public static final z53 c;
    public static final z53 d;
    public static final z53 e;
    public static final /* synthetic */ z53[] f;

    static {
        z53 z53Var = new z53("AddToButtonClicked", 0);
        a = z53Var;
        z53 z53Var2 = new z53("CardClicked", 1);
        b = z53Var2;
        z53 z53Var3 = new z53("CardLongClicked", 2);
        c = z53Var3;
        z53 z53Var4 = new z53("ContextMenuButtonClicked", 3);
        d = z53Var4;
        z53 z53Var5 = new z53("PlayButtonClicked", 4);
        e = z53Var5;
        f = new z53[]{z53Var, z53Var2, z53Var3, z53Var4, z53Var5};
    }

    public static z53 valueOf(String str) {
        return (z53) Enum.valueOf(z53.class, str);
    }

    public static z53[] values() {
        return (z53[]) f.clone();
    }
}
