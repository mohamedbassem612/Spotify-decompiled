package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x0y0 {
    public static final x0y0 a;
    public static final /* synthetic */ x0y0[] b;

    static {
        x0y0 x0y0Var = new x0y0("OnClicked", 0);
        a = x0y0Var;
        b = new x0y0[]{x0y0Var};
    }

    public static x0y0 valueOf(String str) {
        return (x0y0) Enum.valueOf(x0y0.class, str);
    }

    public static x0y0[] values() {
        return (x0y0[]) b.clone();
    }
}
