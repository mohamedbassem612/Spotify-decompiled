package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kq9 {
    public static final kq9 a;
    public static final kq9 b;
    public static final kq9 c;
    public static final /* synthetic */ kq9[] d;

    static {
        kq9 kq9Var = new kq9("PORTRAIT", 0);
        a = kq9Var;
        kq9 kq9Var2 = new kq9("FORCED_LANDSCAPE", 1);
        b = kq9Var2;
        kq9 kq9Var3 = new kq9("FOLLOW_DEVICE", 2);
        c = kq9Var3;
        d = new kq9[]{kq9Var, kq9Var2, kq9Var3};
    }

    public static kq9 valueOf(String str) {
        return (kq9) Enum.valueOf(kq9.class, str);
    }

    public static kq9[] values() {
        return (kq9[]) d.clone();
    }

    public final boolean a() {
        return this != a;
    }
}
