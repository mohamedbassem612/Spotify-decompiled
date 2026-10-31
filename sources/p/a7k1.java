package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a7k1 {
    public static final a7k1 a;
    public static final /* synthetic */ a7k1[] b;

    static {
        a7k1 a7k1Var = new a7k1("RowClicked", 0);
        a = a7k1Var;
        b = new a7k1[]{a7k1Var};
    }

    public static a7k1 valueOf(String str) {
        return (a7k1) Enum.valueOf(a7k1.class, str);
    }

    public static a7k1[] values() {
        return (a7k1[]) b.clone();
    }
}
