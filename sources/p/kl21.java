package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kl21 {
    public static final kl21 a;
    public static final kl21 b;
    public static final kl21 c;
    public static final /* synthetic */ kl21[] d;

    static {
        kl21 kl21Var = new kl21("IGNORE", 0);
        a = kl21Var;
        kl21 kl21Var2 = new kl21("WARN", 1);
        b = kl21Var2;
        kl21 kl21Var3 = new kl21("STRICT", 2);
        c = kl21Var3;
        d = new kl21[]{kl21Var, kl21Var2, kl21Var3};
    }

    public static kl21 valueOf(String str) {
        return (kl21) Enum.valueOf(kl21.class, str);
    }

    public static kl21[] values() {
        return (kl21[]) d.clone();
    }

    public final boolean a() {
        return this == b;
    }
}
