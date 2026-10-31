package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ej2 {
    public static final ej2 a;
    public static final ej2 b;
    public static final ej2 c;
    public static final ej2 d;
    public static final /* synthetic */ ej2[] e;

    static {
        ej2 ej2Var = new ej2("GOOGLE_PLAY", 0);
        a = ej2Var;
        ej2 ej2Var2 = new ej2("SAMSUNG", 1);
        b = ej2Var2;
        ej2 ej2Var3 = new ej2("AMAZON", 2);
        c = ej2Var3;
        ej2 ej2Var4 = new ej2("UNKNOWN", 3);
        d = ej2Var4;
        e = new ej2[]{ej2Var, ej2Var2, ej2Var3, ej2Var4};
    }

    public static ej2 valueOf(String str) {
        return (ej2) Enum.valueOf(ej2.class, str);
    }

    public static ej2[] values() {
        return (ej2[]) e.clone();
    }
}
