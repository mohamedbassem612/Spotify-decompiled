package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class svq0 {
    public static final svq0 a;
    public static final /* synthetic */ svq0[] b;

    static {
        svq0 svq0Var = new svq0("Single", 0);
        a = svq0Var;
        b = new svq0[]{svq0Var, new svq0("Multiple", 1)};
    }

    public static svq0 valueOf(String str) {
        return (svq0) Enum.valueOf(svq0.class, str);
    }

    public static svq0[] values() {
        return (svq0[]) b.clone();
    }
}
