package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rmh0 {
    public static final rmh0 a;
    public static final rmh0 b;
    public static final rmh0 c;
    public static final rmh0 d;
    public static final rmh0 e;
    public static final /* synthetic */ rmh0[] f;

    static {
        rmh0 rmh0Var = new rmh0("UPLOADING", 0);
        a = rmh0Var;
        rmh0 rmh0Var2 = new rmh0("CANCELLING", 1);
        b = rmh0Var2;
        rmh0 rmh0Var3 = new rmh0("SUBMITTING", 2);
        c = rmh0Var3;
        rmh0 rmh0Var4 = new rmh0("UPLOADED", 3);
        d = rmh0Var4;
        rmh0 rmh0Var5 = new rmh0("FAILED", 4);
        e = rmh0Var5;
        f = new rmh0[]{rmh0Var, rmh0Var2, rmh0Var3, rmh0Var4, rmh0Var5};
    }

    public static rmh0 valueOf(String str) {
        return (rmh0) Enum.valueOf(rmh0.class, str);
    }

    public static rmh0[] values() {
        return (rmh0[]) f.clone();
    }
}
