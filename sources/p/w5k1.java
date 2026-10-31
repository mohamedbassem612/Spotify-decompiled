package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w5k1 {
    public static final w5k1 a;
    public static final w5k1 b;
    public static final w5k1 c;
    public static final /* synthetic */ w5k1[] d;

    static {
        w5k1 w5k1Var = new w5k1("MUSIC_VIDEO", 0);
        a = w5k1Var;
        w5k1 w5k1Var2 = new w5k1("CANVAS", 1);
        b = w5k1Var2;
        w5k1 w5k1Var3 = new w5k1("OTHER_VIDEO", 2);
        c = w5k1Var3;
        d = new w5k1[]{w5k1Var, w5k1Var2, w5k1Var3};
    }

    public static w5k1 valueOf(String str) {
        return (w5k1) Enum.valueOf(w5k1.class, str);
    }

    public static w5k1[] values() {
        return (w5k1[]) d.clone();
    }
}
