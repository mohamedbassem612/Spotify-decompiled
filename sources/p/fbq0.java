package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fbq0 {
    public static final fbq0 a;
    public static final /* synthetic */ fbq0[] b;

    static {
        fbq0 fbq0Var = new fbq0("CardClicked", 0);
        a = fbq0Var;
        b = new fbq0[]{fbq0Var};
    }

    public static fbq0 valueOf(String str) {
        return (fbq0) Enum.valueOf(fbq0.class, str);
    }

    public static fbq0[] values() {
        return (fbq0[]) b.clone();
    }
}
