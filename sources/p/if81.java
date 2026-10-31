package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class if81 {
    public static final if81 a;
    public static final if81 b;
    public static final if81 c;
    public static final if81 d;
    public static final /* synthetic */ if81[] e;

    static {
        if81 if81Var = new if81("Linear", 0);
        a = if81Var;
        if81 if81Var2 = new if81("Shuffle", 1);
        b = if81Var2;
        if81 if81Var3 = new if81("SmartShuffle", 2);
        c = if81Var3;
        if81 if81Var4 = new if81("Loading", 3);
        d = if81Var4;
        e = new if81[]{if81Var, if81Var2, if81Var3, if81Var4};
    }

    public static if81 valueOf(String str) {
        return (if81) Enum.valueOf(if81.class, str);
    }

    public static if81[] values() {
        return (if81[]) e.clone();
    }
}
