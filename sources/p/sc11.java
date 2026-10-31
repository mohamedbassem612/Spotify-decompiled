package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sc11 {
    public static final /* synthetic */ sc11[] a;
    public static final /* synthetic */ t0z b;

    /* JADX INFO: Fake field, exist only in values array */
    sc11 EF5;

    static {
        sc11[] sc11VarArr = {new sc11("MEANINGFUL", 0), new sc11("REGRETFUL", 1), new sc11("FUN", 2), new sc11("INTERESTING", 3), new sc11("ENJOYABLE", 4), new sc11("BORING", 5)};
        a = sc11VarArr;
        b = new t0z(sc11VarArr);
    }

    public static sc11 valueOf(String str) {
        return (sc11) Enum.valueOf(sc11.class, str);
    }

    public static sc11[] values() {
        return (sc11[]) a.clone();
    }
}
