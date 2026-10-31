package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ww30 {
    public static final ww30 a;
    public static final ww30 b;
    public static final ww30 c;
    public static final /* synthetic */ ww30[] d;

    static {
        ww30 ww30Var = new ww30("CACHE", 0);
        a = ww30Var;
        ww30 ww30Var2 = new ww30("NETWORK", 1);
        b = ww30Var2;
        ww30 ww30Var3 = new ww30("CACHE_OR_NETWORK", 2);
        c = ww30Var3;
        d = new ww30[]{ww30Var, ww30Var2, ww30Var3};
    }

    public static ww30 valueOf(String str) {
        return (ww30) Enum.valueOf(ww30.class, str);
    }

    public static ww30[] values() {
        return (ww30[]) d.clone();
    }
}
