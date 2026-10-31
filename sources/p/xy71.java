package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xy71 {
    public static final xy71 a;
    public static final xy71 b;
    public static final xy71 c;
    public static final /* synthetic */ xy71[] d;

    static {
        xy71 xy71Var = new xy71("Hidden", 0);
        a = xy71Var;
        xy71 xy71Var2 = new xy71("Expanded", 1);
        b = xy71Var2;
        xy71 xy71Var3 = new xy71("PartiallyExpanded", 2);
        c = xy71Var3;
        d = new xy71[]{xy71Var, xy71Var2, xy71Var3};
    }

    public static xy71 valueOf(String str) {
        return (xy71) Enum.valueOf(xy71.class, str);
    }

    public static xy71[] values() {
        return (xy71[]) d.clone();
    }
}
