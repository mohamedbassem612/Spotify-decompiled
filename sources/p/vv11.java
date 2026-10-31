package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vv11 {
    public static final vv11 a;
    public static final vv11 b;
    public static final vv11 c;
    public static final /* synthetic */ vv11[] d;

    static {
        vv11 vv11Var = new vv11("UNKNOWN", 0);
        a = vv11Var;
        vv11 vv11Var2 = new vv11("LATEST_RELEASE", 1);
        b = vv11Var2;
        vv11 vv11Var3 = new vv11("PRE_RELEASE", 2);
        c = vv11Var3;
        d = new vv11[]{vv11Var, vv11Var2, vv11Var3};
    }

    public static vv11 valueOf(String str) {
        return (vv11) Enum.valueOf(vv11.class, str);
    }

    public static vv11[] values() {
        return (vv11[]) d.clone();
    }
}
