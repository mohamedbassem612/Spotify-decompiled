package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yr4 {
    public static final yr4 a;
    public static final yr4 b;
    public static final yr4 c;
    public static final /* synthetic */ yr4[] d;

    static {
        yr4 yr4Var = new yr4("Connecting", 0);
        a = yr4Var;
        yr4 yr4Var2 = new yr4("LoggedIn", 1);
        b = yr4Var2;
        yr4 yr4Var3 = new yr4("LoggedOut", 2);
        c = yr4Var3;
        d = new yr4[]{yr4Var, yr4Var2, yr4Var3};
    }

    public static yr4 valueOf(String str) {
        return (yr4) Enum.valueOf(yr4.class, str);
    }

    public static yr4[] values() {
        return (yr4[]) d.clone();
    }
}
