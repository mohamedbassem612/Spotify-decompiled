package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s8p0 {
    public static final s8p0 a;
    public static final s8p0 b;
    public static final s8p0 c;
    public static final s8p0 d;
    public static final /* synthetic */ s8p0[] e;

    static {
        s8p0 s8p0Var = new s8p0("Unspecified", 0);
        a = s8p0Var;
        s8p0 s8p0Var2 = new s8p0("ChapterSkipEnabled", 1);
        b = s8p0Var2;
        s8p0 s8p0Var3 = new s8p0("NpvContentLayerTapSkip15s", 2);
        c = s8p0Var3;
        s8p0 s8p0Var4 = new s8p0("Unrecognized", 3);
        d = s8p0Var4;
        e = new s8p0[]{s8p0Var, s8p0Var2, s8p0Var3, s8p0Var4};
    }

    public static s8p0 valueOf(String str) {
        return (s8p0) Enum.valueOf(s8p0.class, str);
    }

    public static s8p0[] values() {
        return (s8p0[]) e.clone();
    }
}
