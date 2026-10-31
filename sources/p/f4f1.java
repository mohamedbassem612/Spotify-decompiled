package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f4f1 {
    public static final f4f1 a;
    public static final f4f1 b;
    public static final /* synthetic */ f4f1[] c;

    static {
        f4f1 f4f1Var = new f4f1("ABOVE", 0);
        a = f4f1Var;
        f4f1 f4f1Var2 = new f4f1("BELOW", 1);
        b = f4f1Var2;
        c = new f4f1[]{f4f1Var, f4f1Var2};
    }

    public static f4f1 valueOf(String str) {
        return (f4f1) Enum.valueOf(f4f1.class, str);
    }

    public static f4f1[] values() {
        return (f4f1[]) c.clone();
    }
}
