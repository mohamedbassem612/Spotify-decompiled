package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i28 {
    public static final i28 a;
    public static final i28 b;
    public static final i28 c;
    public static final i28 d;
    public static final i28 e;
    public static final i28 f;
    public static final /* synthetic */ i28[] g;

    static {
        i28 i28Var = new i28("CheckingPermission", 0);
        a = i28Var;
        i28 i28Var2 = new i28("PermissionRequested", 1);
        b = i28Var2;
        i28 i28Var3 = new i28("AwaitingPermission", 2);
        c = i28Var3;
        i28 i28Var4 = new i28("Listening", 3);
        d = i28Var4;
        i28 i28Var5 = new i28("Identifying", 4);
        e = i28Var5;
        i28 i28Var6 = new i28("Matched", 5);
        f = i28Var6;
        g = new i28[]{i28Var, i28Var2, i28Var3, i28Var4, i28Var5, i28Var6};
    }

    public static i28 valueOf(String str) {
        return (i28) Enum.valueOf(i28.class, str);
    }

    public static i28[] values() {
        return (i28[]) g.clone();
    }

    public final boolean a() {
        return this == a || this == b || this == c;
    }
}
