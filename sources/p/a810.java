package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a810 {
    public static final a810 a;
    public static final a810 b;
    public static final a810 c;
    public static final /* synthetic */ a810[] d;

    static {
        a810 a810Var = new a810("CONFLICTS_ONLY", 0);
        a = a810Var;
        a810 a810Var2 = new a810("SUCCESS_ONLY", 1);
        b = a810Var2;
        a810 a810Var3 = new a810("BOTH", 2);
        c = a810Var3;
        d = new a810[]{a810Var, a810Var2, a810Var3};
    }

    public static a810 valueOf(String str) {
        return (a810) Enum.valueOf(a810.class, str);
    }

    public static a810[] values() {
        return (a810[]) d.clone();
    }
}
