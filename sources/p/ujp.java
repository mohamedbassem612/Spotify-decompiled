package p;

import android.app.Activity;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ujp {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ ujp(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final dj41 a(String str, Long l, mdg1 mdg1Var) {
        byte b = this.a;
        chp chpVar = this.b;
        switch (b) {
            case 0:
                kp5 kp5Var = (kp5) chpVar.c;
                s880 s880Var = (s880) kp5Var.a;
                Activity activity = (Activity) s880Var.b;
                cir0 cir0Var = (cir0) s880Var.g;
                c8o.l(cir0Var);
                iac0 iac0VarE = cir0Var.e();
                c8o.m(iac0VarE);
                s880 s880Var2 = (s880) kp5Var.a;
                return new dj41(activity, iac0VarE, new hce1(new sok0(((Activity) s880Var2.b).getApplicationContext()), new xq60()), new a050((RetrofitMaker) s880Var2.d), str, l, mdg1Var, (iae1) ((jly0) kp5Var.c).get(), (sj30) ((jly0) kp5Var.d).get(), (q8n) s880Var2.a);
            default:
                gxp gxpVar = (gxp) ((ywp) chpVar).c;
                qsq0 qsq0Var = gxpVar.a;
                Activity activity2 = qsq0Var.a;
                iac0 iac0VarE2 = qsq0Var.j.e();
                c8o.m(iac0VarE2);
                qsq0 qsq0Var2 = gxpVar.a;
                return new dj41(activity2, iac0VarE2, new hce1(new sok0(qsq0Var2.a.getApplicationContext()), new xq60()), new a050(qsq0Var2.c), str, l, mdg1Var, (iae1) gxpVar.c.get(), (sj30) gxpVar.d.get(), qsq0Var2.l);
        }
    }
}
