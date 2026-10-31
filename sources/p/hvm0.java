package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hvm0 {
    public static final hvm0 a;
    public static final hvm0 b;
    public static final hvm0 c;
    public static final /* synthetic */ hvm0[] d;

    static {
        hvm0 hvm0Var = new hvm0("CardClicked", 0);
        a = hvm0Var;
        hvm0 hvm0Var2 = new hvm0("PrimaryButtonClicked", 1);
        b = hvm0Var2;
        hvm0 hvm0Var3 = new hvm0("AatEntryPointClicked", 2);
        c = hvm0Var3;
        d = new hvm0[]{hvm0Var, hvm0Var2, hvm0Var3};
    }

    public static hvm0 valueOf(String str) {
        return (hvm0) Enum.valueOf(hvm0.class, str);
    }

    public static hvm0[] values() {
        return (hvm0[]) d.clone();
    }
}
