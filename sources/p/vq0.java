package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vq0 {
    public static final vq0 a;
    public static final vq0 b;
    public static final vq0 c;
    public static final /* synthetic */ vq0[] d;

    static {
        vq0 vq0Var = new vq0("MuteClicked", 0);
        a = vq0Var;
        vq0 vq0Var2 = new vq0("UnMuteClicked", 1);
        b = vq0Var2;
        vq0 vq0Var3 = new vq0("AdvertiserInfoClicked", 2);
        c = vq0Var3;
        d = new vq0[]{vq0Var, vq0Var2, vq0Var3};
    }

    public static vq0 valueOf(String str) {
        return (vq0) Enum.valueOf(vq0.class, str);
    }

    public static vq0[] values() {
        return (vq0[]) d.clone();
    }
}
