package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class px10 {
    public static final px10 a;
    public static final px10 b;
    public static final px10 c;
    public static final /* synthetic */ px10[] d;
    public static final /* synthetic */ t0z e;

    static {
        px10 px10Var = new px10("ExternalFeedback", 0);
        a = px10Var;
        px10 px10Var2 = new px10("InternalBug", 1);
        b = px10Var2;
        px10 px10Var3 = new px10("FeatureSpecific", 2);
        c = px10Var3;
        px10[] px10VarArr = {px10Var, px10Var2, px10Var3};
        d = px10VarArr;
        e = new t0z(px10VarArr);
    }

    public static px10 valueOf(String str) {
        return (px10) Enum.valueOf(px10.class, str);
    }

    public static px10[] values() {
        return (px10[]) d.clone();
    }
}
