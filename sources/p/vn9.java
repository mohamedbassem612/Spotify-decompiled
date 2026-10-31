package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vn9 {
    public static final vn9 a;
    public static final /* synthetic */ vn9[] b;

    static {
        vn9 vn9Var = new vn9("OpenNowPlaying", 0);
        a = vn9Var;
        b = new vn9[]{vn9Var};
    }

    public static vn9 valueOf(String str) {
        return (vn9) Enum.valueOf(vn9.class, str);
    }

    public static vn9[] values() {
        return (vn9[]) b.clone();
    }
}
