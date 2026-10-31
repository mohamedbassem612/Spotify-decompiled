package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fgo0 {
    public static final fgo0 a;
    public static final fgo0 b;
    public static final /* synthetic */ fgo0[] c;

    static {
        fgo0 fgo0Var = new fgo0("OnGoToHomeClicked", 0);
        a = fgo0Var;
        fgo0 fgo0Var2 = new fgo0("OnUnfollowClicked", 1);
        b = fgo0Var2;
        c = new fgo0[]{fgo0Var, fgo0Var2};
    }

    public static fgo0 valueOf(String str) {
        return (fgo0) Enum.valueOf(fgo0.class, str);
    }

    public static fgo0[] values() {
        return (fgo0[]) c.clone();
    }
}
