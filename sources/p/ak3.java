package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ak3 {
    public static final ak3 a;
    public static final ak3 b;
    public static final ak3 c;
    public static final /* synthetic */ ak3[] d;
    public static final /* synthetic */ t0z e;

    static {
        ak3 ak3Var = new ak3("Songs", 0);
        a = ak3Var;
        ak3 ak3Var2 = new ak3("Episodes", 1);
        b = ak3Var2;
        ak3 ak3Var3 = new ak3("Audiobook", 2);
        c = ak3Var3;
        ak3[] ak3VarArr = {ak3Var, ak3Var2, ak3Var3};
        d = ak3VarArr;
        e = new t0z(ak3VarArr);
    }

    public static ak3 valueOf(String str) {
        return (ak3) Enum.valueOf(ak3.class, str);
    }

    public static ak3[] values() {
        return (ak3[]) d.clone();
    }
}
