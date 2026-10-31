package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oh7 {
    public static final oh7 a;
    public static final /* synthetic */ oh7[] b;

    static {
        oh7 oh7Var = new oh7("RowClicked", 0);
        a = oh7Var;
        b = new oh7[]{oh7Var};
    }

    public static oh7 valueOf(String str) {
        return (oh7) Enum.valueOf(oh7.class, str);
    }

    public static oh7[] values() {
        return (oh7[]) b.clone();
    }
}
