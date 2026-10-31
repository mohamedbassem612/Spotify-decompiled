package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wir0 {
    public static final wir0 a;
    public static final wir0 b;
    public static final /* synthetic */ wir0[] c;

    static {
        wir0 wir0Var = new wir0("Visible", 0);
        a = wir0Var;
        wir0 wir0Var2 = new wir0("Hidden", 1);
        b = wir0Var2;
        c = new wir0[]{wir0Var, wir0Var2};
    }

    public static wir0 valueOf(String str) {
        return (wir0) Enum.valueOf(wir0.class, str);
    }

    public static wir0[] values() {
        return (wir0[]) c.clone();
    }
}
