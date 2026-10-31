package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ax91 {
    public static final ax91 a;
    public static final /* synthetic */ ax91[] b;

    static {
        ax91 ax91Var = new ax91("OnButtonClicked", 0);
        a = ax91Var;
        b = new ax91[]{ax91Var};
    }

    public static ax91 valueOf(String str) {
        return (ax91) Enum.valueOf(ax91.class, str);
    }

    public static ax91[] values() {
        return (ax91[]) b.clone();
    }
}
