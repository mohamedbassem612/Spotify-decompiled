package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hpg implements sdm {
    public final tzr0 a;
    public final dlg1 b;
    public final vqg c;

    public hpg(vqg vqgVar, tzr0 tzr0Var, dlg1 dlg1Var) {
        this.a = tzr0Var;
        this.b = dlg1Var;
        this.c = vqgVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(kpg kpgVar, onm onmVar) {
        gpg gpgVar;
        String str;
        Object objL;
        if (onmVar instanceof gpg) {
            gpgVar = (gpg) onmVar;
            int i = gpgVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                gpgVar.e = i - Integer.MIN_VALUE;
            } else {
                gpgVar = new gpg(this, onmVar);
            }
        } else {
            gpgVar = new gpg(this, onmVar);
        }
        Object obj = gpgVar.c;
        int i2 = gpgVar.e;
        if (i2 == 0) {
            hm5.M(obj);
            str = kpgVar.b.a;
            Observable observableG1 = this.c.g1(str, "");
            gpgVar.a = kpgVar;
            gpgVar.b = str;
            gpgVar.e = 1;
            objL = fc11.l(observableG1, 1, (Object) null, gpgVar);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str2 = gpgVar.b;
            kpg kpgVar2 = gpgVar.a;
            hm5.M(obj);
            str = str2;
            kpgVar = kpgVar2;
            objL = obj;
        }
        jpg jpgVar = (jpg) objL;
        lik1 lik1Var = kpgVar.a;
        igm igmVar = new igm(jpgVar.a, (rzn1) null, jpgVar.b, 2);
        smc0 smc0VarN = k4p1.n();
        int i3 = jpgVar.c;
        e2t0 e2t0Var = e2t0.Y;
        if (i3 == 1) {
            smc0VarN.add(this.b.i(str, e2t0Var));
        } else if (i3 != 4) {
            smc0VarN.add(this.a.g(str, e2t0Var, lik1Var));
        }
        return new kjm(igmVar, k4p1.k(smc0VarN), 4);
    }
}
