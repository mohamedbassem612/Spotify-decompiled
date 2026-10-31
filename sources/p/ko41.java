package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ko41 {
    public static final ko41 a;
    public static final ko41 b;
    public static final ko41 c;
    public static final ko41 d;
    public static final ko41 e;
    public static final ko41 f;
    public static final /* synthetic */ ko41[] g;

    static {
        ko41 ko41Var = new ko41("NO_ANSWER", 0);
        a = ko41Var;
        ko41 ko41Var2 = new ko41("INCORRECT", 1);
        b = ko41Var2;
        ko41 ko41Var3 = new ko41("LOW", 2);
        c = ko41Var3;
        ko41 ko41Var4 = new ko41("MEDIUM", 3);
        d = ko41Var4;
        ko41 ko41Var5 = new ko41("HIGH", 4);
        e = ko41Var5;
        ko41 ko41Var6 = new ko41("PERFECT", 5);
        f = ko41Var6;
        g = new ko41[]{ko41Var, ko41Var2, ko41Var3, ko41Var4, ko41Var5, ko41Var6};
    }

    public static ko41 valueOf(String str) {
        return (ko41) Enum.valueOf(ko41.class, str);
    }

    public static ko41[] values() {
        return (ko41[]) g.clone();
    }

    public final long a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return yah.c();
        }
        if (iOrdinal == 3) {
            return yah.d();
        }
        if (iOrdinal == 4) {
            return yah.b();
        }
        if (iOrdinal == 5) {
            return yah.a();
        }
        eg.o();
        return 0L;
    }
}
