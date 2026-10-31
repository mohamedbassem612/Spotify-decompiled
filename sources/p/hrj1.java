package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hrj1 {
    public static final hrj1 a;
    public static final /* synthetic */ hrj1[] b;

    /* JADX INFO: Fake field, exist only in values array */
    hrj1 EF0;

    static {
        hrj1 hrj1Var = new hrj1("SUBSCRIBED", 0);
        hrj1 hrj1Var2 = new hrj1("START", 1);
        hrj1 hrj1Var3 = new hrj1("STOP", 2);
        hrj1 hrj1Var4 = new hrj1("PAUSE", 3);
        hrj1 hrj1Var5 = new hrj1("RESUME", 4);
        hrj1 hrj1Var6 = new hrj1("SEEK_TO", 5);
        hrj1 hrj1Var7 = new hrj1("SET_STOP_POSITION", 6);
        hrj1 hrj1Var8 = new hrj1("SET_MARKERS", 7);
        hrj1 hrj1Var9 = new hrj1("PREFETCH_TRACKS", 8);
        hrj1 hrj1Var10 = new hrj1("CONFIG", 9);
        hrj1 hrj1Var11 = new hrj1("UNKNOWN", 10);
        a = hrj1Var11;
        b = new hrj1[]{hrj1Var, hrj1Var2, hrj1Var3, hrj1Var4, hrj1Var5, hrj1Var6, hrj1Var7, hrj1Var8, hrj1Var9, hrj1Var10, hrj1Var11};
    }

    public static hrj1 valueOf(String str) {
        return (hrj1) Enum.valueOf(hrj1.class, str);
    }

    public static hrj1[] values() {
        return (hrj1[]) b.clone();
    }
}
