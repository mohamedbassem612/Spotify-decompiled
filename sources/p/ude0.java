package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ude0 implements sdm {
    public final Context a;
    public final ltm1 b;
    public final tzr0 c;
    public final dlg1 d;
    public final vqg e;

    public ude0(Context context, ltm1 ltm1Var, tzr0 tzr0Var, dlg1 dlg1Var, vqg vqgVar) {
        this.a = context;
        this.b = ltm1Var;
        this.c = tzr0Var;
        this.d = dlg1Var;
        this.e = vqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(wde0 wde0Var, onm onmVar) {
        tde0 tde0Var;
        String str;
        Object objL;
        if (onmVar instanceof tde0) {
            tde0Var = (tde0) onmVar;
            int i = tde0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tde0Var.e = i - Integer.MIN_VALUE;
            } else {
                tde0Var = new tde0(this, onmVar);
            }
        } else {
            tde0Var = new tde0(this, onmVar);
        }
        Object obj = tde0Var.c;
        int i2 = tde0Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            str = wde0Var.b;
            Observable observableG1 = this.e.g1(str, "");
            tde0Var.a = wde0Var;
            tde0Var.b = str;
            tde0Var.e = 1;
            objL = fc11.l(observableG1, 1, (Object) null, tde0Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str2 = tde0Var.b;
            wde0 wde0Var2 = tde0Var.a;
            hm5.M(obj);
            str = str2;
            wde0Var = wde0Var2;
            objL = obj;
        }
        vde0 vde0Var = (vde0) objL;
        lik1 lik1Var = wde0Var.a;
        String str3 = vde0Var.a;
        this.b.getClass();
        igm igmVar = new igm(str3, new vfm(ltm1.c(this.a)), (String) null, 4);
        smc0 smc0VarN = k4p1.n();
        int i3 = vde0Var.b;
        e2t0 e2t0Var = e2t0.Y;
        if (i3 == 1) {
            smc0VarN.add(this.d.i(str, e2t0Var));
        } else if (i3 != 4) {
            smc0VarN.add(this.c.g(str, e2t0Var, lik1Var));
        }
        return new kjm(igmVar, k4p1.k(smc0VarN), 4);
    }
}
