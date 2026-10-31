package p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jj8 {
    public static final /* synthetic */ jj8[] X;
    public static final jj8 a;
    public static final jj8 b;
    public static final jj8 c;
    public static final jj8 d;
    public static final jj8 e;
    public static final jj8 f;
    public static final jj8 g;
    public static final jj8 h;
    public static final jj8 i;
    public static final jj8 t;

    static {
        jj8 jj8Var = new jj8("PHONE_NUMBER", 0);
        a = jj8Var;
        jj8 jj8Var2 = new jj8("FACEBOOK", 1);
        b = jj8Var2;
        jj8 jj8Var3 = new jj8("GOOGLE", 2);
        c = jj8Var3;
        jj8 jj8Var4 = new jj8("NAVER", 3);
        d = jj8Var4;
        jj8 jj8Var5 = new jj8("PASSKEY", 4);
        e = jj8Var5;
        jj8 jj8Var6 = new jj8("EMAIL", 5);
        f = jj8Var6;
        jj8 jj8Var7 = new jj8("EMAIL_CONTINUE", 6);
        g = jj8Var7;
        jj8 jj8Var8 = new jj8("EMAIL_LOG_IN", 7);
        h = jj8Var8;
        jj8 jj8Var9 = new jj8("EMAIL_SIGNUP_PREMIUM", 8);
        i = jj8Var9;
        jj8 jj8Var10 = new jj8("EMAIL_SIGNUP_LEGACY", 9);
        t = jj8Var10;
        X = new jj8[]{jj8Var, jj8Var2, jj8Var3, jj8Var4, jj8Var5, jj8Var6, jj8Var7, jj8Var8, jj8Var9, jj8Var10};
    }

    public static jj8 valueOf(String str) {
        return (jj8) Enum.valueOf(jj8.class, str);
    }

    public static jj8[] values() {
        return (jj8[]) X.clone();
    }
}
