package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r591 {
    public static final r591 a;
    public static final r591 b;
    public static final r591 c;
    public static final /* synthetic */ r591[] d;
    public static final /* synthetic */ t0z e;

    static {
        r591 r591Var = new r591("FIFTEEN_SECONDS", 0);
        b = r591Var;
        r591 r591Var2 = new r591("NEXT_CHAPTER", 1);
        c = r591Var2;
        r591[] r591VarArr = {r591Var, r591Var2};
        d = r591VarArr;
        e = new t0z(r591VarArr);
        a = r591Var2;
    }

    public static r591 valueOf(String str) {
        return (r591) Enum.valueOf(r591.class, str);
    }

    public static r591[] values() {
        return (r591[]) d.clone();
    }
}
