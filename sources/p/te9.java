package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class te9 {
    public static final te9 a;
    public static final te9 b;
    public static final te9 c;
    public static final te9 d;
    public static final /* synthetic */ te9[] e;

    static {
        te9 te9Var = new te9("UNKNOWN", 0);
        a = te9Var;
        te9 te9Var2 = new te9("IMMEDIATE", 1);
        b = te9Var2;
        te9 te9Var3 = new te9("CLOSE", 2);
        c = te9Var3;
        te9 te9Var4 = new te9("FAR", 3);
        d = te9Var4;
        e = new te9[]{te9Var, te9Var2, te9Var3, te9Var4};
    }

    public static te9 valueOf(String str) {
        return (te9) Enum.valueOf(te9.class, str);
    }

    public static te9[] values() {
        return (te9[]) e.clone();
    }
}
