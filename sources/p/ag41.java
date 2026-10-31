package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ag41 {
    public static final ag41 a;
    public static final ag41 b;
    public static final ag41 c;
    public static final ag41 d;
    public static final ag41 e;
    public static final /* synthetic */ ag41[] f;

    static {
        ag41 ag41Var = new ag41("TopBar", 0);
        a = ag41Var;
        ag41 ag41Var2 = new ag41("MainContent", 1);
        b = ag41Var2;
        ag41 ag41Var3 = new ag41("Snackbar", 2);
        c = ag41Var3;
        ag41 ag41Var4 = new ag41("Fab", 3);
        d = ag41Var4;
        ag41 ag41Var5 = new ag41("BottomBar", 4);
        e = ag41Var5;
        f = new ag41[]{ag41Var, ag41Var2, ag41Var3, ag41Var4, ag41Var5};
    }

    public static ag41 valueOf(String str) {
        return (ag41) Enum.valueOf(ag41.class, str);
    }

    public static ag41[] values() {
        return (ag41[]) f.clone();
    }
}
