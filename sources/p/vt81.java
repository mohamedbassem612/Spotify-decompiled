package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vt81 {
    public static final vt81 a;
    public static final vt81 b;
    public static final vt81 c;
    public static final /* synthetic */ vt81[] d;

    static {
        vt81 vt81Var = new vt81("TEXT", 0);
        a = vt81Var;
        vt81 vt81Var2 = new vt81("SUGGESTED", 1);
        b = vt81Var2;
        vt81 vt81Var3 = new vt81("VOICE", 2);
        c = vt81Var3;
        d = new vt81[]{vt81Var, vt81Var2, vt81Var3};
    }

    public static vt81 valueOf(String str) {
        return (vt81) Enum.valueOf(vt81.class, str);
    }

    public static vt81[] values() {
        return (vt81[]) d.clone();
    }
}
