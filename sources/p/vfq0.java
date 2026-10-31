package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vfq0 {
    public static final vfq0 a;
    public static final /* synthetic */ vfq0[] b;

    static {
        vfq0 vfq0Var = new vfq0("ButtonClicked", 0);
        a = vfq0Var;
        b = new vfq0[]{vfq0Var};
    }

    public static vfq0 valueOf(String str) {
        return (vfq0) Enum.valueOf(vfq0.class, str);
    }

    public static vfq0[] values() {
        return (vfq0[]) b.clone();
    }
}
