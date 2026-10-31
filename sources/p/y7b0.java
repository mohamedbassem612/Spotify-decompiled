package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y7b0 {
    public static final y7b0 a;
    public static final y7b0 b;
    public static final y7b0 c;
    public static final /* synthetic */ y7b0[] d;

    static {
        y7b0 y7b0Var = new y7b0("RUNTIME", 0);
        a = y7b0Var;
        y7b0 y7b0Var2 = new y7b0("BINARY", 1);
        b = y7b0Var2;
        y7b0 y7b0Var3 = new y7b0("SOURCE", 2);
        c = y7b0Var3;
        d = new y7b0[]{y7b0Var, y7b0Var2, y7b0Var3};
    }

    public static y7b0 valueOf(String str) {
        return (y7b0) Enum.valueOf(y7b0.class, str);
    }

    public static y7b0[] values() {
        return (y7b0[]) d.clone();
    }
}
