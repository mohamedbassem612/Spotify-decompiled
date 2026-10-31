package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dij1 {
    public static final dij1 a;
    public static final dij1 b;
    public static final dij1 c;
    public static final /* synthetic */ dij1[] d;

    static {
        dij1 dij1Var = new dij1("H264", 0);
        a = dij1Var;
        dij1 dij1Var2 = new dij1("HEVC", 1);
        b = dij1Var2;
        dij1 dij1Var3 = new dij1("AV1", 2);
        c = dij1Var3;
        d = new dij1[]{dij1Var, dij1Var2, dij1Var3};
    }

    public static dij1 valueOf(String str) {
        return (dij1) Enum.valueOf(dij1.class, str);
    }

    public static dij1[] values() {
        return (dij1[]) d.clone();
    }
}
