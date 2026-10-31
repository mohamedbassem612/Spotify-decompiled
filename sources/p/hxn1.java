package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract /* synthetic */ class hxn1 {
    public static final /* synthetic */ int a = 0;

    static {
        int i = lxn1.M0;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i = vsn1.a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable unused) {
            vsn1.i("BillingLogger");
            return null;
        }
    }

    public static nlo1 b(int i, int i2, iua iuaVar, String str, jno1 jno1Var) {
        try {
            lmo1 lmo1VarR = umo1.r();
            int i3 = iuaVar.a;
            lmo1VarR.b();
            umo1.q(((t9o1) lmo1VarR).b, i3);
            String str2 = iuaVar.c;
            lmo1VarR.b();
            umo1.t(((t9o1) lmo1VarR).b, str2);
            int i4 = iuaVar.b;
            if (i4 != 0) {
                lmo1VarR.b();
                umo1.v(((t9o1) lmo1VarR).b, i4);
            }
            if (i != 0) {
                lmo1VarR.d(i);
            }
            if (str != null) {
                lmo1VarR.b();
                umo1.s(((t9o1) lmo1VarR).b, str);
            }
            hlo1 hlo1VarT = nlo1.t();
            hlo1VarT.d(lmo1VarR);
            hlo1VarT.g(i2);
            if (!jno1Var.equals(jno1.b)) {
                hlo1VarT.b();
                nlo1.w(((t9o1) hlo1VarT).b, jno1Var);
            }
            return hlo1VarT.a();
        } catch (Throwable unused) {
            vsn1.i("BillingLogger");
            return null;
        }
    }

    public static gmo1 c(int i, jno1 jno1Var) {
        try {
            qlo1 qlo1VarR = gmo1.r();
            qlo1VarR.b();
            gmo1.q(((t9o1) qlo1VarR).b, i);
            if (!jno1Var.equals(jno1.b)) {
                qlo1VarR.b();
                gmo1.t(((t9o1) qlo1VarR).b, jno1Var);
            }
            return qlo1VarR.a();
        } catch (Exception unused) {
            vsn1.i("BillingLogger");
            return null;
        }
    }
}
