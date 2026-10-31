package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ysg {
    public static final /* synthetic */ ysg[] a;
    public static final /* synthetic */ t0z b;

    /* JADX INFO: Fake field, exist only in values array */
    ysg EF5;

    static {
        ysg[] ysgVarArr = {new ysg("START", 0), new ysg("CENTER", 1), new ysg("END", 2), new ysg("LEFT", 3), new ysg("RIGHT", 4)};
        a = ysgVarArr;
        b = new t0z(ysgVarArr);
    }

    public static ysg valueOf(String str) {
        return (ysg) Enum.valueOf(ysg.class, str);
    }

    public static ysg[] values() {
        return (ysg[]) a.clone();
    }
}
