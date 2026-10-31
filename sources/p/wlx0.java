package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wlx0 {
    public static final wlx0 a;
    public static final /* synthetic */ wlx0[] b;

    static {
        wlx0 wlx0Var = new wlx0("OnClicked", 0);
        a = wlx0Var;
        b = new wlx0[]{wlx0Var};
    }

    public static wlx0 valueOf(String str) {
        return (wlx0) Enum.valueOf(wlx0.class, str);
    }

    public static wlx0[] values() {
        return (wlx0[]) b.clone();
    }
}
