package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jwb0 {
    public static final jwb0 a;
    public static final jwb0 b;
    public static final /* synthetic */ jwb0[] c;

    static {
        jwb0 jwb0Var = new jwb0("CloseButton", 0);
        a = jwb0Var;
        jwb0 jwb0Var2 = new jwb0("MoreButton", 1);
        jwb0 jwb0Var3 = new jwb0("None", 2);
        b = jwb0Var3;
        c = new jwb0[]{jwb0Var, jwb0Var2, jwb0Var3};
    }

    public static jwb0 valueOf(String str) {
        return (jwb0) Enum.valueOf(jwb0.class, str);
    }

    public static jwb0[] values() {
        return (jwb0[]) c.clone();
    }
}
