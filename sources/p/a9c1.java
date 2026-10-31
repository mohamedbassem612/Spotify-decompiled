package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a9c1 {
    public static final a9c1 a;
    public static final /* synthetic */ a9c1[] b;
    public static final /* synthetic */ t0z c;

    static {
        a9c1 a9c1Var = new a9c1("DEFAULT", 0);
        a = a9c1Var;
        a9c1[] a9c1VarArr = {a9c1Var, new a9c1("DETAIL", 1)};
        b = a9c1VarArr;
        c = new t0z(a9c1VarArr);
    }

    public static a9c1 valueOf(String str) {
        return (a9c1) Enum.valueOf(a9c1.class, str);
    }

    public static a9c1[] values() {
        return (a9c1[]) b.clone();
    }
}
