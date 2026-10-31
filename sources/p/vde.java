package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vde {
    public static final vde a;
    public static final /* synthetic */ vde[] b;

    static {
        vde vdeVar = new vde("RowClicked", 0);
        a = vdeVar;
        b = new vde[]{vdeVar};
    }

    public static vde valueOf(String str) {
        return (vde) Enum.valueOf(vde.class, str);
    }

    public static vde[] values() {
        return (vde[]) b.clone();
    }
}
