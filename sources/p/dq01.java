package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dq01 {
    public static final dq01 a;
    public static final dq01 b;
    public static final /* synthetic */ dq01[] c;

    static {
        dq01 dq01Var = new dq01("CardClicked", 0);
        a = dq01Var;
        dq01 dq01Var2 = new dq01("CardLongClicked", 1);
        b = dq01Var2;
        c = new dq01[]{dq01Var, dq01Var2};
    }

    public static dq01 valueOf(String str) {
        return (dq01) Enum.valueOf(dq01.class, str);
    }

    public static dq01[] values() {
        return (dq01[]) c.clone();
    }
}
