package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kpy0 {
    public static final kpy0 a;
    public static final kpy0 b;
    public static final kpy0 c;
    public static final kpy0 d;
    public static final kpy0 e;
    public static final kpy0 f;
    public static final kpy0 g;
    public static final /* synthetic */ kpy0[] h;

    static {
        kpy0 kpy0Var = new kpy0("PUFFIN_NOT_APPLICABLE", 0);
        a = kpy0Var;
        kpy0 kpy0Var2 = new kpy0("PUFFIN_BLUETOOTH_NOT_OPTIMIZED", 1);
        b = kpy0Var2;
        kpy0 kpy0Var3 = new kpy0("PUFFIN_BLUETOOTH_OPTIMIZED_AND_OFF", 2);
        c = kpy0Var3;
        kpy0 kpy0Var4 = new kpy0("PUFFIN_BLUETOOTH_OPTIMIZED_AND_ON", 3);
        d = kpy0Var4;
        kpy0 kpy0Var5 = new kpy0("PUFFIN_WIRED_NOT_OPTIMIZED", 4);
        e = kpy0Var5;
        kpy0 kpy0Var6 = new kpy0("PUFFIN_WIRED_OPTIMIZED_AND_OFF", 5);
        f = kpy0Var6;
        kpy0 kpy0Var7 = new kpy0("PUFFIN_WIRED_OPTIMIZED_AND_ON", 6);
        g = kpy0Var7;
        h = new kpy0[]{kpy0Var, kpy0Var2, kpy0Var3, kpy0Var4, kpy0Var5, kpy0Var6, kpy0Var7};
    }

    public static kpy0 valueOf(String str) {
        return (kpy0) Enum.valueOf(kpy0.class, str);
    }

    public static kpy0[] values() {
        return (kpy0[]) h.clone();
    }
}
