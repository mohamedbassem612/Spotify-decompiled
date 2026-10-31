package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xzg1 {
    public static final xzg1 a;
    public static final /* synthetic */ xzg1[] b;

    static {
        xzg1 xzg1Var = new xzg1("Jam", 0);
        a = xzg1Var;
        b = new xzg1[]{xzg1Var};
    }

    public static xzg1 valueOf(String str) {
        return (xzg1) Enum.valueOf(xzg1.class, str);
    }

    public static xzg1[] values() {
        return (xzg1[]) b.clone();
    }
}
