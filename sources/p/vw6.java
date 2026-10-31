package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vw6 {
    public static final vw6 a;
    public static final /* synthetic */ vw6[] b;

    static {
        vw6 vw6Var = new vw6("RowClicked", 0);
        a = vw6Var;
        b = new vw6[]{vw6Var};
    }

    public static vw6 valueOf(String str) {
        return (vw6) Enum.valueOf(vw6.class, str);
    }

    public static vw6[] values() {
        return (vw6[]) b.clone();
    }
}
