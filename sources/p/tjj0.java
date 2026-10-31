package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tjj0 {
    public static final tjj0 a;
    public static final tjj0 b;
    public static final tjj0 c;
    public static final /* synthetic */ tjj0[] d;

    static {
        tjj0 tjj0Var = new tjj0("None", 0);
        a = tjj0Var;
        tjj0 tjj0Var2 = new tjj0("Public", 1);
        b = tjj0Var2;
        tjj0 tjj0Var3 = new tjj0("Locked", 2);
        c = tjj0Var3;
        d = new tjj0[]{tjj0Var, tjj0Var2, tjj0Var3};
    }

    public static tjj0 valueOf(String str) {
        return (tjj0) Enum.valueOf(tjj0.class, str);
    }

    public static tjj0[] values() {
        return (tjj0[]) d.clone();
    }
}
