package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g7l1 {
    public static final g7l1 a;
    public static final /* synthetic */ g7l1[] b;

    static {
        g7l1 g7l1Var = new g7l1("ButtonClicked", 0);
        a = g7l1Var;
        b = new g7l1[]{g7l1Var};
    }

    public static g7l1 valueOf(String str) {
        return (g7l1) Enum.valueOf(g7l1.class, str);
    }

    public static g7l1[] values() {
        return (g7l1[]) b.clone();
    }
}
