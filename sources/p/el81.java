package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class el81 {
    public static final el81 a;
    public static final el81 b;
    public static final el81 c;
    public static final /* synthetic */ el81[] d;

    static {
        el81 el81Var = new el81("TEXT", 0);
        a = el81Var;
        el81 el81Var2 = new el81("VOICE", 1);
        b = el81Var2;
        el81 el81Var3 = new el81("SUGGESTED", 2);
        c = el81Var3;
        d = new el81[]{el81Var, el81Var2, el81Var3};
    }

    public static el81 valueOf(String str) {
        return (el81) Enum.valueOf(el81.class, str);
    }

    public static el81[] values() {
        return (el81[]) d.clone();
    }
}
