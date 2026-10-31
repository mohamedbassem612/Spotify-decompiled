package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zc61 {
    public static final zc61 a;
    public static final zc61 b;
    public static final /* synthetic */ zc61[] c;

    static {
        zc61 zc61Var = new zc61("OnVideoSelected", 0);
        a = zc61Var;
        zc61 zc61Var2 = new zc61("OnVideoDeselected", 1);
        b = zc61Var2;
        c = new zc61[]{zc61Var, zc61Var2};
    }

    public static zc61 valueOf(String str) {
        return (zc61) Enum.valueOf(zc61.class, str);
    }

    public static zc61[] values() {
        return (zc61[]) c.clone();
    }
}
