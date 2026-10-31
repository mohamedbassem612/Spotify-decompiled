package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class yu40 {
    public static final yu40 a;
    public static final yu40 b;
    public static final yu40 c;
    public static final /* synthetic */ yu40[] d;

    static {
        yu40 yu40Var = new yu40("Jam", 0);
        a = yu40Var;
        yu40 yu40Var2 = new yu40("DesktopLauncher", 1);
        b = yu40Var2;
        yu40 yu40Var3 = new yu40("Dodo", 2);
        c = yu40Var3;
        d = new yu40[]{yu40Var, yu40Var2, yu40Var3};
    }

    public static yu40 valueOf(String str) {
        return (yu40) Enum.valueOf(yu40.class, str);
    }

    public static yu40[] values() {
        return (yu40[]) d.clone();
    }
}
