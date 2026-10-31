package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yg8 {
    public static final yg8 N0;
    public static final yg8 O0;
    public static final yg8 P0;
    public static final /* synthetic */ yg8[] Q0;
    public static final yg8 X;
    public static final yg8 Y;
    public static final yg8 Z;
    public static final yg8 a;
    public static final yg8 b;
    public static final yg8 c;
    public static final yg8 d;
    public static final yg8 e;
    public static final yg8 f;
    public static final yg8 g;
    public static final yg8 h;
    public static final yg8 i;
    public static final yg8 t;

    static {
        yg8 yg8Var = new yg8("UNDEFINED", 0);
        a = yg8Var;
        yg8 yg8Var2 = new yg8("ATTEMPTING_AUTOLOGIN", 1);
        b = yg8Var2;
        yg8 yg8Var3 = new yg8("NOT_LOGGED_IN", 2);
        c = yg8Var3;
        yg8 yg8Var4 = new yg8("USER_INITIATED", 3);
        d = yg8Var4;
        yg8 yg8Var5 = new yg8("FORCED_LOGOUT", 4);
        e = yg8Var5;
        yg8 yg8Var6 = new yg8("REMOTE_LOGOUT", 5);
        f = yg8Var6;
        yg8 yg8Var7 = new yg8("BOOTSTRAP_FAILURE", 6);
        g = yg8Var7;
        yg8 yg8Var8 = new yg8("APP_SHUTDOWN", 7);
        h = yg8Var8;
        yg8 yg8Var9 = new yg8("ABROAD_SINCE", 8);
        i = yg8Var9;
        yg8 yg8Var10 = new yg8("ACCOUNT_SWITCHING", 9);
        t = yg8Var10;
        yg8 yg8Var11 = new yg8("ADDING_ACCOUNT_SWITCHING_ACCOUNT", 10);
        X = yg8Var11;
        yg8 yg8Var12 = new yg8("LOGGING_IN_TO_ACCOUNT_SWITCHING_ACCOUNT", 11);
        Y = yg8Var12;
        yg8 yg8Var13 = new yg8("LOGIN_TAKEOVER", 12);
        Z = yg8Var13;
        yg8 yg8Var14 = new yg8("USER_GRADUATION", 13);
        N0 = yg8Var14;
        yg8 yg8Var15 = new yg8("AGE_SIGNAL_BLOCKED", 14);
        O0 = yg8Var15;
        yg8 yg8Var16 = new yg8("CHILD_INITIATED_TRANSITION_FALLBACK", 15);
        P0 = yg8Var16;
        Q0 = new yg8[]{yg8Var, yg8Var2, yg8Var3, yg8Var4, yg8Var5, yg8Var6, yg8Var7, yg8Var8, yg8Var9, yg8Var10, yg8Var11, yg8Var12, yg8Var13, yg8Var14, yg8Var15, yg8Var16};
    }

    public static yg8 valueOf(String str) {
        return (yg8) Enum.valueOf(yg8.class, str);
    }

    public static yg8[] values() {
        return (yg8[]) Q0.clone();
    }

    public final boolean a() {
        return this == d || this == t || this == X || this == Y || this == Z || this == e || this == i || this == f || this == N0 || this == O0 || this == P0;
    }
}
