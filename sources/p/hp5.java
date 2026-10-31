package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hp5 {
    public static final hp5 a;
    public static final hp5 b;
    public static final hp5 c;
    public static final /* synthetic */ hp5[] d;

    static {
        hp5 hp5Var = new hp5("NoLoggedInUi", 0);
        a = hp5Var;
        hp5 hp5Var2 = new hp5("HasLoggedInUi", 1);
        b = hp5Var2;
        hp5 hp5Var3 = new hp5("Splash", 2);
        c = hp5Var3;
        d = new hp5[]{hp5Var, hp5Var2, hp5Var3};
    }

    public static hp5 valueOf(String str) {
        return (hp5) Enum.valueOf(hp5.class, str);
    }

    public static hp5[] values() {
        return (hp5[]) d.clone();
    }
}
