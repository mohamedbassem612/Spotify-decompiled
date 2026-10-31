package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class z6d0 {
    public static final z6d0 a;
    public static final z6d0 b;
    public static final /* synthetic */ z6d0[] c;

    static {
        z6d0 z6d0Var = new z6d0("GotItClicked", 0);
        a = z6d0Var;
        z6d0 z6d0Var2 = new z6d0("SystemDismissed", 1);
        b = z6d0Var2;
        c = new z6d0[]{z6d0Var, z6d0Var2};
    }

    public static z6d0 valueOf(String str) {
        return (z6d0) Enum.valueOf(z6d0.class, str);
    }

    public static z6d0[] values() {
        return (z6d0[]) c.clone();
    }
}
