package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q740 {
    public static final q740 a;
    public static final /* synthetic */ q740[] b;

    static {
        q740 q740Var = new q740("CardClicked", 0);
        a = q740Var;
        b = new q740[]{q740Var};
    }

    public static q740 valueOf(String str) {
        return (q740) Enum.valueOf(q740.class, str);
    }

    public static q740[] values() {
        return (q740[]) b.clone();
    }
}
