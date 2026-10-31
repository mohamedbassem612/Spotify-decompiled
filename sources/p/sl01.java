package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class sl01 {
    public static final sl01 a;
    public static final sl01 b;
    public static final sl01 c;
    public static final /* synthetic */ sl01[] d;

    static {
        sl01 sl01Var = new sl01("Played", 0);
        a = sl01Var;
        sl01 sl01Var2 = new sl01("Saved", 1);
        b = sl01Var2;
        sl01 sl01Var3 = new sl01("Seen", 2);
        c = sl01Var3;
        d = new sl01[]{sl01Var, sl01Var2, sl01Var3};
    }

    public static sl01 valueOf(String str) {
        return (sl01) Enum.valueOf(sl01.class, str);
    }

    public static sl01[] values() {
        return (sl01[]) d.clone();
    }
}
