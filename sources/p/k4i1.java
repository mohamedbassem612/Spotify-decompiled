package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k4i1 {
    public static final k4i1 a;
    public static final k4i1 b;
    public static final k4i1 c;
    public static final k4i1 d;
    public static final k4i1 e;
    public static final k4i1 f;
    public static final /* synthetic */ k4i1[] g;

    static {
        k4i1 k4i1Var = new k4i1("IMAGE_CAPTURE", 0);
        a = k4i1Var;
        k4i1 k4i1Var2 = new k4i1("PREVIEW", 1);
        b = k4i1Var2;
        k4i1 k4i1Var3 = new k4i1("IMAGE_ANALYSIS", 2);
        c = k4i1Var3;
        k4i1 k4i1Var4 = new k4i1("VIDEO_CAPTURE", 3);
        d = k4i1Var4;
        k4i1 k4i1Var5 = new k4i1("STREAM_SHARING", 4);
        e = k4i1Var5;
        k4i1 k4i1Var6 = new k4i1("METERING_REPEATING", 5);
        f = k4i1Var6;
        g = new k4i1[]{k4i1Var, k4i1Var2, k4i1Var3, k4i1Var4, k4i1Var5, k4i1Var6};
    }

    public static k4i1 valueOf(String str) {
        return (k4i1) Enum.valueOf(k4i1.class, str);
    }

    public static k4i1[] values() {
        return (k4i1[]) g.clone();
    }
}
