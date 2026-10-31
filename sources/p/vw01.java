package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vw01 {
    public static final vw01 a;
    public static final vw01 b;
    public static final vw01 c;
    public static final /* synthetic */ vw01[] d;

    static {
        vw01 vw01Var = new vw01("CAN_BE_ADDED", 0);
        a = vw01Var;
        vw01 vw01Var2 = new vw01("IS_ADDED", 1);
        b = vw01Var2;
        vw01 vw01Var3 = new vw01("NONE", 2);
        c = vw01Var3;
        d = new vw01[]{vw01Var, vw01Var2, vw01Var3};
    }

    public static vw01 valueOf(String str) {
        return (vw01) Enum.valueOf(vw01.class, str);
    }

    public static vw01[] values() {
        return (vw01[]) d.clone();
    }
}
