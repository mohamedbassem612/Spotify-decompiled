package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iy50 {
    public static final iy50 a;
    public static final iy50 b;
    public static final iy50 c;
    public static final /* synthetic */ iy50[] d;
    public static final /* synthetic */ t0z e;

    static {
        iy50 iy50Var = new iy50("Normal", 0);
        a = iy50Var;
        iy50 iy50Var2 = new iy50("Compact", 1);
        b = iy50Var2;
        iy50 iy50Var3 = new iy50("FullBleed", 2);
        c = iy50Var3;
        iy50[] iy50VarArr = {iy50Var, iy50Var2, iy50Var3};
        d = iy50VarArr;
        e = new t0z(iy50VarArr);
    }

    public static iy50 valueOf(String str) {
        return (iy50) Enum.valueOf(iy50.class, str);
    }

    public static iy50[] values() {
        return (iy50[]) d.clone();
    }
}
