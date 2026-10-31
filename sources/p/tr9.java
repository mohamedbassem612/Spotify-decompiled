package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tr9 {
    public static final tr9 a;
    public static final tr9 b;
    public static final tr9 c;
    public static final tr9 d;
    public static final /* synthetic */ tr9[] e;

    static {
        tr9 tr9Var = new tr9("ALLOWED", 0);
        a = tr9Var;
        tr9 tr9Var2 = new tr9("INCOMPATIBLE", 1);
        b = tr9Var2;
        tr9 tr9Var3 = new tr9("RESTRICTED", 2);
        c = tr9Var3;
        tr9 tr9Var4 = new tr9("UNKNOWN", 3);
        d = tr9Var4;
        e = new tr9[]{tr9Var, tr9Var2, tr9Var3, tr9Var4};
    }

    public static tr9 valueOf(String str) {
        return (tr9) Enum.valueOf(tr9.class, str);
    }

    public static tr9[] values() {
        return (tr9[]) e.clone();
    }
}
