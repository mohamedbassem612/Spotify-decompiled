package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kms0 {
    public static final kms0 a;
    public static final kms0 b;
    public static final /* synthetic */ kms0[] c;

    static {
        kms0 kms0Var = new kms0("RequestClicked", 0);
        a = kms0Var;
        kms0 kms0Var2 = new kms0("CancelClicked", 1);
        b = kms0Var2;
        c = new kms0[]{kms0Var, kms0Var2};
    }

    public static kms0 valueOf(String str) {
        return (kms0) Enum.valueOf(kms0.class, str);
    }

    public static kms0[] values() {
        return (kms0[]) c.clone();
    }
}
