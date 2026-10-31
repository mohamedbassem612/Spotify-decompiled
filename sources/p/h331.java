package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h331 {
    public static final h331 a;
    public static final h331 b;
    public static final h331 c;
    public static final /* synthetic */ h331[] d;

    static {
        h331 h331Var = new h331("Approved", 0);
        a = h331Var;
        h331 h331Var2 = new h331("Denied", 1);
        b = h331Var2;
        h331 h331Var3 = new h331("Cancelled", 2);
        c = h331Var3;
        d = new h331[]{h331Var, h331Var2, h331Var3};
    }

    public static h331 valueOf(String str) {
        return (h331) Enum.valueOf(h331.class, str);
    }

    public static h331[] values() {
        return (h331[]) d.clone();
    }
}
