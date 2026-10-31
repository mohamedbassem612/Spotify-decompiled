package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kn21 {
    public static final kn21 a;
    public static final /* synthetic */ kn21[] b;

    /* JADX INFO: Fake field, exist only in values array */
    kn21 EF0;

    static {
        kn21 kn21Var = new kn21("LOW", 0);
        kn21 kn21Var2 = new kn21("NORMAL", 1);
        a = kn21Var2;
        b = new kn21[]{kn21Var, kn21Var2, new kn21("HIGH", 2), new kn21("IMMEDIATE", 3)};
    }

    public static kn21 valueOf(String str) {
        return (kn21) Enum.valueOf(kn21.class, str);
    }

    public static kn21[] values() {
        return (kn21[]) b.clone();
    }
}
