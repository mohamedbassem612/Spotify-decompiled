package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bq00 {
    public static final bq00 a;
    public static final bq00 b;
    public static final bq00 c;
    public static final /* synthetic */ bq00[] d;

    static {
        bq00 bq00Var = new bq00("EXPANDABLE", 0);
        a = bq00Var;
        bq00 bq00Var2 = new bq00("COLLAPSABLE", 1);
        b = bq00Var2;
        bq00 bq00Var3 = new bq00("NONE", 2);
        c = bq00Var3;
        d = new bq00[]{bq00Var, bq00Var2, bq00Var3};
    }

    public static bq00 valueOf(String str) {
        return (bq00) Enum.valueOf(bq00.class, str);
    }

    public static bq00[] values() {
        return (bq00[]) d.clone();
    }
}
