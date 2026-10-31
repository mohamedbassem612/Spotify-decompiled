package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wld0 {
    public static final wld0 a;
    public static final /* synthetic */ wld0[] b;

    static {
        wld0 wld0Var = new wld0("CardClicked", 0);
        a = wld0Var;
        b = new wld0[]{wld0Var};
    }

    public static wld0 valueOf(String str) {
        return (wld0) Enum.valueOf(wld0.class, str);
    }

    public static wld0[] values() {
        return (wld0[]) b.clone();
    }
}
