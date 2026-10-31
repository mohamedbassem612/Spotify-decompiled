package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a3n1 {
    public static final a3n1 a;
    public static final /* synthetic */ a3n1[] b;

    static {
        a3n1 a3n1Var = new a3n1("ContextMenuButtonClicked", 0);
        a = a3n1Var;
        b = new a3n1[]{a3n1Var};
    }

    public static a3n1 valueOf(String str) {
        return (a3n1) Enum.valueOf(a3n1.class, str);
    }

    public static a3n1[] values() {
        return (a3n1[]) b.clone();
    }
}
