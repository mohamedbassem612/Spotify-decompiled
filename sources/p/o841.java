package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o841 {
    public static final o841 a;
    public static final o841 b;
    public static final o841 c;
    public static final /* synthetic */ o841[] d;

    static {
        o841 o841Var = new o841("UNKNOWN", 0);
        a = o841Var;
        o841 o841Var2 = new o841("ADDED", 1);
        b = o841Var2;
        o841 o841Var3 = new o841("NOT_ADDED", 2);
        c = o841Var3;
        d = new o841[]{o841Var, o841Var2, o841Var3};
    }

    public static o841 valueOf(String str) {
        return (o841) Enum.valueOf(o841.class, str);
    }

    public static o841[] values() {
        return (o841[]) d.clone();
    }
}
