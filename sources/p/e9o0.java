package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e9o0 implements sdm {
    public final Activity a;
    public final ltm1 b;
    public final tzr0 c;
    public final vqg d;
    public final dlg1 e;
    public final zwm1 f;

    public e9o0(Activity activity, ltm1 ltm1Var, tzr0 tzr0Var, vqg vqgVar, dlg1 dlg1Var, zwm1 zwm1Var) {
        this.a = activity;
        this.b = ltm1Var;
        this.c = tzr0Var;
        this.d = vqgVar;
        this.e = dlg1Var;
        this.f = zwm1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(g9o0 g9o0Var, onm onmVar) {
        d9o0 d9o0Var;
        String strD;
        lik1 lik1Var;
        String str;
        if (onmVar instanceof d9o0) {
            d9o0Var = (d9o0) onmVar;
            int i = d9o0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                d9o0Var.g = i - Integer.MIN_VALUE;
            } else {
                d9o0Var = new d9o0(this, onmVar);
            }
        } else {
            d9o0Var = new d9o0(this, onmVar);
        }
        Object obj = d9o0Var.e;
        int i2 = d9o0Var.g;
        if (i2 == 0) {
            hm5.M(obj);
            String str2 = g9o0Var.b.a;
            strD = this.f.d();
            lik1 lik1Var2 = g9o0Var.a;
            Observable observableG1 = this.d.g1(str2, strD);
            d9o0Var.a = this;
            d9o0Var.b = lik1Var2;
            d9o0Var.c = str2;
            d9o0Var.d = strD;
            d9o0Var.g = 1;
            Object objL = fc11.l(observableG1, 1, (Object) null, d9o0Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
            lik1Var = lik1Var2;
            str = str2;
            obj = objL;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str3 = d9o0Var.d;
            str = d9o0Var.c;
            lik1 lik1Var3 = d9o0Var.b;
            e9o0 e9o0Var = d9o0Var.a;
            hm5.M(obj);
            strD = str3;
            this = e9o0Var;
            lik1Var = lik1Var3;
        }
        f9o0 f9o0Var = (f9o0) obj;
        this.getClass();
        String str4 = f9o0Var.a;
        if (str4 == null) {
            str4 = "";
        }
        ltm1 ltm1Var = this.b;
        Activity activity = this.a;
        ltm1Var.getClass();
        igm igmVar = new igm(strD, new vfm(ltm1.d(activity)), str4);
        smc0 smc0VarN = k4p1.n();
        int i3 = f9o0Var.b;
        e2t0 e2t0Var = e2t0.Y;
        if (i3 == 1) {
            smc0VarN.add(this.e.i(str, e2t0Var));
        } else if (i3 != 4) {
            smc0VarN.add(this.c.g(str, e2t0Var, lik1Var));
        }
        return new kjm(igmVar, k4p1.k(smc0VarN), 4);
    }
}
