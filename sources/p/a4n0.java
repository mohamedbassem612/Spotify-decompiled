package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a4n0 {
    public static final a4n0 a;
    public static final a4n0 b;
    public static final a4n0 c;
    public static final /* synthetic */ a4n0[] d;

    static {
        a4n0 a4n0Var = new a4n0("WAITING", 0);
        a = a4n0Var;
        a4n0 a4n0Var2 = new a4n0("LOGGED", 1);
        b = a4n0Var2;
        a4n0 a4n0Var3 = new a4n0("NOT_LOGGED", 2);
        c = a4n0Var3;
        d = new a4n0[]{a4n0Var, a4n0Var2, a4n0Var3};
    }

    public static a4n0 valueOf(String str) {
        return (a4n0) Enum.valueOf(a4n0.class, str);
    }

    public static a4n0[] values() {
        return (a4n0[]) d.clone();
    }
}
