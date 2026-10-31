package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fch1 {
    public static final fch1 a;
    public static final /* synthetic */ fch1[] b;

    static {
        fch1 fch1Var = new fch1("OnRemoveClicked", 0);
        a = fch1Var;
        b = new fch1[]{fch1Var};
    }

    public static fch1 valueOf(String str) {
        return (fch1) Enum.valueOf(fch1.class, str);
    }

    public static fch1[] values() {
        return (fch1[]) b.clone();
    }
}
