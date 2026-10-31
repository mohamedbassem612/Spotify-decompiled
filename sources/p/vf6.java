package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vf6 {
    public static final vf6 a;
    public static final vf6 b;
    public static final vf6 c;
    public static final /* synthetic */ vf6[] d;

    static {
        vf6 vf6Var = new vf6("VERTICAL", 0);
        a = vf6Var;
        vf6 vf6Var2 = new vf6("LEFT", 1);
        b = vf6Var2;
        vf6 vf6Var3 = new vf6("RIGHT", 2);
        c = vf6Var3;
        d = new vf6[]{vf6Var, vf6Var2, vf6Var3};
    }

    public static vf6 valueOf(String str) {
        return (vf6) Enum.valueOf(vf6.class, str);
    }

    public static vf6[] values() {
        return (vf6[]) d.clone();
    }
}
