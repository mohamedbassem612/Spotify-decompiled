package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fea0 {
    public static final fea0 a;
    public static final /* synthetic */ fea0[] b;

    static {
        fea0 fea0Var = new fea0("OnClicked", 0);
        a = fea0Var;
        b = new fea0[]{fea0Var};
    }

    public static fea0 valueOf(String str) {
        return (fea0) Enum.valueOf(fea0.class, str);
    }

    public static fea0[] values() {
        return (fea0[]) b.clone();
    }
}
