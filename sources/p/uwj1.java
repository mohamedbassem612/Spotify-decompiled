package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uwj1 {
    public static final uwj1 a;
    public static final uwj1 b;
    public static final /* synthetic */ uwj1[] c;

    static {
        uwj1 uwj1Var = new uwj1("VIDEO_ONLY", 0);
        a = uwj1Var;
        uwj1 uwj1Var2 = new uwj1("SESSION_ONLY", 1);
        b = uwj1Var2;
        c = new uwj1[]{uwj1Var, uwj1Var2};
    }

    public static uwj1 valueOf(String str) {
        return (uwj1) Enum.valueOf(uwj1.class, str);
    }

    public static uwj1[] values() {
        return (uwj1[]) c.clone();
    }
}
