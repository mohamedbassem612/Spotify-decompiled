package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class at50 {
    public static final at50 a;
    public static final at50 b;
    public static final at50 c;
    public static final /* synthetic */ at50[] d;

    static {
        at50 at50Var = new at50("SkipLimit", 0);
        a = at50Var;
        at50 at50Var2 = new at50("TrackSelected", 1);
        b = at50Var2;
        at50 at50Var3 = new at50("TrackSelectedOnSearch", 2);
        c = at50Var3;
        d = new at50[]{at50Var, at50Var2, at50Var3, new at50("Preview", 3)};
    }

    public static at50 valueOf(String str) {
        return (at50) Enum.valueOf(at50.class, str);
    }

    public static at50[] values() {
        return (at50[]) d.clone();
    }
}
