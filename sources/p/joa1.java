package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class joa1 {
    public static final joa1 b;
    public static final joa1 c;
    public static final joa1 d;
    public static final ioa1 e;
    public static final /* synthetic */ joa1[] f;
    public final Object a;

    static {
        joa1 joa1Var = new joa1("NULL", 0, null);
        b = joa1Var;
        joa1 joa1Var2 = new joa1("INDEX", 1, -1);
        c = joa1Var2;
        joa1 joa1Var3 = new joa1("FALSE", 2, Boolean.FALSE);
        d = joa1Var3;
        ioa1 ioa1Var = new ioa1("MAP_GET_OR_DEFAULT", 3, null);
        e = ioa1Var;
        f = new joa1[]{joa1Var, joa1Var2, joa1Var3, ioa1Var};
    }

    public joa1(String str, int i, Object obj) {
        super(str, i);
        this.a = obj;
    }

    public static joa1 valueOf(String str) {
        return (joa1) Enum.valueOf(joa1.class, str);
    }

    public static joa1[] values() {
        return (joa1[]) f.clone();
    }
}
