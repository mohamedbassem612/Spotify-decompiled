package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fgq0 {
    public static final fgq0 a;
    public static final /* synthetic */ fgq0[] b;

    static {
        fgq0 fgq0Var = new fgq0("RowClicked", 0);
        a = fgq0Var;
        b = new fgq0[]{fgq0Var};
    }

    public static fgq0 valueOf(String str) {
        return (fgq0) Enum.valueOf(fgq0.class, str);
    }

    public static fgq0[] values() {
        return (fgq0[]) b.clone();
    }
}
