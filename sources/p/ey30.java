package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ey30 {
    public static final ey30 a;
    public static final ey30 b;
    public static final ey30 c;
    public static final /* synthetic */ ey30[] d;

    static {
        ey30 ey30Var = new ey30("UNKNOWN", 0);
        a = ey30Var;
        ey30 ey30Var2 = new ey30("DEFAULT", 1);
        b = ey30Var2;
        ey30 ey30Var3 = new ey30("YUV", 2);
        c = ey30Var3;
        d = new ey30[]{ey30Var, ey30Var2, ey30Var3};
    }

    public static ey30 valueOf(String str) {
        return (ey30) Enum.valueOf(ey30.class, str);
    }

    public static ey30[] values() {
        return (ey30[]) d.clone();
    }
}
