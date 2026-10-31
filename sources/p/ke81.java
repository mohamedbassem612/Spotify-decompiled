package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ke81 {
    public static final ke81 a;
    public static final ke81 b;
    public static final ke81 c;
    public static final /* synthetic */ ke81[] d;

    static {
        ke81 ke81Var = new ke81("NONE", 0);
        a = ke81Var;
        ke81 ke81Var2 = new ke81("DISCARD", 1);
        b = ke81Var2;
        ke81 ke81Var3 = new ke81("SAVING", 2);
        c = ke81Var3;
        d = new ke81[]{ke81Var, ke81Var2, ke81Var3};
    }

    public static ke81 valueOf(String str) {
        return (ke81) Enum.valueOf(ke81.class, str);
    }

    public static ke81[] values() {
        return (ke81[]) d.clone();
    }
}
