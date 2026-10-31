package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zf41 {
    public static final zf41 a;
    public static final zf41 b;
    public static final zf41 c;
    public static final zf41 d;
    public static final zf41 e;
    public static final /* synthetic */ zf41[] f;

    static {
        zf41 zf41Var = new zf41("TopBar", 0);
        a = zf41Var;
        zf41 zf41Var2 = new zf41("MainContent", 1);
        b = zf41Var2;
        zf41 zf41Var3 = new zf41("Snackbar", 2);
        c = zf41Var3;
        zf41 zf41Var4 = new zf41("Fab", 3);
        d = zf41Var4;
        zf41 zf41Var5 = new zf41("BottomBar", 4);
        e = zf41Var5;
        f = new zf41[]{zf41Var, zf41Var2, zf41Var3, zf41Var4, zf41Var5};
    }

    public static zf41 valueOf(String str) {
        return (zf41) Enum.valueOf(zf41.class, str);
    }

    public static zf41[] values() {
        return (zf41[]) f.clone();
    }
}
