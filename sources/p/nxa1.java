package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nxa1 {
    public static final nxa1 a;
    public static final /* synthetic */ nxa1[] b;

    static {
        nxa1 nxa1Var = new nxa1("Unavailable", 0);
        a = nxa1Var;
        b = new nxa1[]{nxa1Var, new nxa1("Displaying", 1), new nxa1("Complete", 2)};
    }

    public static nxa1 valueOf(String str) {
        return (nxa1) Enum.valueOf(nxa1.class, str);
    }

    public static nxa1[] values() {
        return (nxa1[]) b.clone();
    }
}
