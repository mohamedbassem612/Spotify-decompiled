package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b810 {
    public static final b810 a;
    public static final b810 b;
    public static final b810 c;
    public static final /* synthetic */ b810[] d;

    static {
        b810 b810Var = new b810("OVERRIDABLE", 0);
        a = b810Var;
        b810 b810Var2 = new b810("INCOMPATIBLE", 1);
        b = b810Var2;
        b810 b810Var3 = new b810("UNKNOWN", 2);
        c = b810Var3;
        d = new b810[]{b810Var, b810Var2, b810Var3};
    }

    public static b810 valueOf(String str) {
        return (b810) Enum.valueOf(b810.class, str);
    }

    public static b810[] values() {
        return (b810[]) d.clone();
    }
}
