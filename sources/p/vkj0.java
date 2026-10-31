package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vkj0 {
    public static final vkj0 a;
    public static final vkj0 b;
    public static final vkj0 c;
    public static final /* synthetic */ vkj0[] d;

    static {
        vkj0 vkj0Var = new vkj0("Error", 0);
        a = vkj0Var;
        vkj0 vkj0Var2 = new vkj0("Loaded", 1);
        b = vkj0Var2;
        vkj0 vkj0Var3 = new vkj0("Loading", 2);
        c = vkj0Var3;
        d = new vkj0[]{vkj0Var, vkj0Var2, vkj0Var3};
    }

    public static vkj0 valueOf(String str) {
        return (vkj0) Enum.valueOf(vkj0.class, str);
    }

    public static vkj0[] values() {
        return (vkj0[]) d.clone();
    }
}
