package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o3f1 {
    public static final o3f1 a;
    public static final o3f1 b;
    public static final /* synthetic */ o3f1[] c;

    static {
        o3f1 o3f1Var = new o3f1("CLEAR", 0);
        a = o3f1Var;
        o3f1 o3f1Var2 = new o3f1("SCANNABLES", 1);
        b = o3f1Var2;
        c = new o3f1[]{o3f1Var, o3f1Var2};
    }

    public static o3f1 valueOf(String str) {
        return (o3f1) Enum.valueOf(o3f1.class, str);
    }

    public static o3f1[] values() {
        return (o3f1[]) c.clone();
    }
}
