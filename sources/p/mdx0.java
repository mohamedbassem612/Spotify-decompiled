package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class mdx0 {
    public static final mdx0 a;
    public static final /* synthetic */ mdx0[] b;

    static {
        mdx0 mdx0Var = new mdx0("RowClicked", 0);
        a = mdx0Var;
        b = new mdx0[]{mdx0Var};
    }

    public static mdx0 valueOf(String str) {
        return (mdx0) Enum.valueOf(mdx0.class, str);
    }

    public static mdx0[] values() {
        return (mdx0[]) b.clone();
    }
}
