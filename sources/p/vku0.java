package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vku0 {
    public static final vku0 a;
    public static final /* synthetic */ vku0[] b;

    static {
        vku0 vku0Var = new vku0("ButtonClicked", 0);
        a = vku0Var;
        b = new vku0[]{vku0Var};
    }

    public static vku0 valueOf(String str) {
        return (vku0) Enum.valueOf(vku0.class, str);
    }

    public static vku0[] values() {
        return (vku0[]) b.clone();
    }
}
