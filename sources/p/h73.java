package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h73 {
    public static final h73 a;
    public static final /* synthetic */ h73[] b;

    static {
        h73 h73Var = new h73("CtaClicked", 0);
        a = h73Var;
        b = new h73[]{h73Var};
    }

    public static h73 valueOf(String str) {
        return (h73) Enum.valueOf(h73.class, str);
    }

    public static h73[] values() {
        return (h73[]) b.clone();
    }
}
