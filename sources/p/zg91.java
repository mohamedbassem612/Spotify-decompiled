package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zg91 {
    public static final zg91 a;
    public static final zg91 b;
    public static final zg91 c;
    public static final /* synthetic */ zg91[] d;

    static {
        zg91 zg91Var = new zg91("NPV", 0);
        a = zg91Var;
        zg91 zg91Var2 = new zg91("NPB", 1);
        b = zg91Var2;
        zg91 zg91Var3 = new zg91("NP_MINI", 2);
        c = zg91Var3;
        d = new zg91[]{zg91Var, zg91Var2, zg91Var3};
    }

    public static zg91 valueOf(String str) {
        return (zg91) Enum.valueOf(zg91.class, str);
    }

    public static zg91[] values() {
        return (zg91[]) d.clone();
    }
}
