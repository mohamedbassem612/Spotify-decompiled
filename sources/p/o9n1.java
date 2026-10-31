package p;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o9n1 extends kz40 {
    public static final em3 l = new em3("ClientNotification.API", new a8n1(3), new ytw0((byte) 10));
    public static final em3 m = new em3("ClientTelemetry.API", new a8n1(4), new ytw0((byte) 10));
    public static final em3 n = new em3("ModuleInstall.API", new a8n1(2), new ytw0((byte) 10));
    public static final em3 o = new em3("LocationServices.API", new a8n1(10), new ytw0((byte) 10));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final em3 f26p = new em3("RecaptchaBase.API", new a8n1(13), new ytw0((byte) 10));
    public static byte q = 1;

    public o9n1(Context context) {
        super(context, (Activity) null, l, mh5.k, jz40.c);
    }

    public hfp1 f(cm00 cm00Var) {
        asd1 asd1VarB = asd1.b();
        asd1VarB.a = new pl10[]{fqo1.a};
        asd1VarB.d = new csj1(cm00Var, (byte) 13);
        asd1VarB.c = (char) 34002;
        return e(0, asd1VarB.a());
    }

    public hfp1 g(dxd1 dxd1Var) {
        asd1 asd1VarB = asd1.b();
        asd1VarB.a = new pl10[]{rpo1.a};
        asd1VarB.b = false;
        asd1VarB.d = new owf1(dxd1Var, (byte) 19);
        return e(2, asd1VarB.a());
    }

    public void h() {
        BasePendingResult basePendingResult;
        boolean z = j() == 3;
        kan1.a.b("Signing out", new Object[0]);
        kan1.b(((kz40) this).a);
        j8n1 j8n1Var = ((kz40) this).i;
        if (z) {
            jub1 jub1Var = new jub1(j8n1Var, (byte) 0);
            jub1Var.g(Status.e);
            basePendingResult = jub1Var;
        } else {
            ian1 ian1Var = new ian1(j8n1Var, (byte) 0);
            j8n1Var.a.d(1, ian1Var);
            basePendingResult = ian1Var;
        }
        ezn1.u(basePendingResult, new t9n1());
    }

    public void i(e8n1 e8n1Var) {
        asd1 asd1VarB = asd1.b();
        asd1VarB.a = new pl10[]{rpo1.b};
        asd1VarB.b = false;
        asd1VarB.d = new a1g1(e8n1Var, (byte) 17);
        e(2, asd1VarB.a());
    }

    public synchronized int j() {
        byte b;
        try {
            b = q;
            if (b == 1) {
                Context context = ((kz40) this).a;
                lz40 lz40Var = lz40.e;
                int iC = lz40Var.c(context, 12451000);
                if (iC == 0) {
                    b = 4;
                    q = (byte) 4;
                } else if (lz40Var.a(iC, context, (String) null) != null || gjv.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    b = 2;
                    q = (byte) 2;
                } else {
                    b = 3;
                    q = (byte) 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }
}
