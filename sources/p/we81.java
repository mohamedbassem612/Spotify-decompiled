package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class we81 {
    public static final we81 a;
    public static final we81 b;
    public static final we81 c;
    public static final /* synthetic */ we81[] d;

    static {
        we81 we81Var = new we81("Linear", 0);
        a = we81Var;
        we81 we81Var2 = new we81("Shuffle", 1);
        b = we81Var2;
        we81 we81Var3 = new we81("SmartShuffle", 2);
        c = we81Var3;
        d = new we81[]{we81Var, we81Var2, we81Var3};
    }

    public static we81 valueOf(String str) {
        return (we81) Enum.valueOf(we81.class, str);
    }

    public static we81[] values() {
        return (we81[]) d.clone();
    }
}
