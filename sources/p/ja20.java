package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ja20 {
    public static final ja20 a;
    public static final ja20 b;
    public static final /* synthetic */ ja20[] c;
    public static final /* synthetic */ t0z d;

    static {
        ja20 ja20Var = new ja20("TOP", 0);
        a = ja20Var;
        ja20 ja20Var2 = new ja20("BOTTOM", 1);
        b = ja20Var2;
        ja20[] ja20VarArr = {ja20Var, ja20Var2};
        c = ja20VarArr;
        d = new t0z(ja20VarArr);
    }

    public static ja20 valueOf(String str) {
        return (ja20) Enum.valueOf(ja20.class, str);
    }

    public static ja20[] values() {
        return (ja20[]) c.clone();
    }
}
