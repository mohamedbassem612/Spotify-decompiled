package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lni0 {
    public static final lni0 a;
    public static final /* synthetic */ lni0[] b;

    static {
        lni0 lni0Var = new lni0("RowClicked", 0);
        a = lni0Var;
        b = new lni0[]{lni0Var};
    }

    public static lni0 valueOf(String str) {
        return (lni0) Enum.valueOf(lni0.class, str);
    }

    public static lni0[] values() {
        return (lni0[]) b.clone();
    }
}
