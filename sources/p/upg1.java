package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class upg1 {
    public static final upg1 a;
    public static final upg1 b;
    public static final upg1 c;
    public static final upg1 d;
    public static final upg1 e;
    public static final /* synthetic */ upg1[] f;

    static {
        upg1 upg1Var = new upg1("CardClicked", 0);
        a = upg1Var;
        upg1 upg1Var2 = new upg1("ThumbnailClicked", 1);
        b = upg1Var2;
        upg1 upg1Var3 = new upg1("PlayButtonClicked", 2);
        c = upg1Var3;
        upg1 upg1Var4 = new upg1("ContextMenuButtonClicked", 3);
        d = upg1Var4;
        upg1 upg1Var5 = new upg1("CardLockedClicked", 4);
        e = upg1Var5;
        f = new upg1[]{upg1Var, upg1Var2, upg1Var3, upg1Var4, upg1Var5};
    }

    public static upg1 valueOf(String str) {
        return (upg1) Enum.valueOf(upg1.class, str);
    }

    public static upg1[] values() {
        return (upg1[]) f.clone();
    }
}
