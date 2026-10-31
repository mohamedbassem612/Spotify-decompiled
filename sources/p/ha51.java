package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ha51 {
    public static final ha51 a;
    public static final ha51 b;
    public static final ha51 c;
    public static final /* synthetic */ ha51[] d;

    static {
        ha51 ha51Var = new ha51("ADD_ACTION", 0);
        a = ha51Var;
        ha51 ha51Var2 = new ha51("ARTIST_ON_APPROVED_LIST", 1);
        b = ha51Var2;
        ha51 ha51Var3 = new ha51("ARTIST_ON_DONT_PLAY_LIST", 2);
        c = ha51Var3;
        d = new ha51[]{ha51Var, ha51Var2, ha51Var3};
    }

    public static ha51 valueOf(String str) {
        return (ha51) Enum.valueOf(ha51.class, str);
    }

    public static ha51[] values() {
        return (ha51[]) d.clone();
    }
}
