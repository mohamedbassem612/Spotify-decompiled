package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v4g0 {
    public static final v4g0 a;
    public static final /* synthetic */ v4g0[] b;

    static {
        v4g0 v4g0Var = new v4g0("RowClicked", 0);
        a = v4g0Var;
        b = new v4g0[]{v4g0Var};
    }

    public static v4g0 valueOf(String str) {
        return (v4g0) Enum.valueOf(v4g0.class, str);
    }

    public static v4g0[] values() {
        return (v4g0[]) b.clone();
    }
}
