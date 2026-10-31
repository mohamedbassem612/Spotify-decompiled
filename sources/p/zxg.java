package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zxg implements enn {
    public final o241 a;
    public final spn b;

    public zxg(o241 o241Var, spn spnVar) {
        this.a = o241Var;
        this.b = spnVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(qmn qmnVar, lnm lnmVar) {
        xxg xxgVar;
        qmn qmnVar2;
        Object objB;
        if (lnmVar instanceof xxg) {
            xxgVar = (xxg) lnmVar;
            int i = xxgVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                xxgVar.d = i - Integer.MIN_VALUE;
            } else {
                xxgVar = new xxg(this, (onm) lnmVar);
            }
        } else {
            xxgVar = new xxg(this, (onm) lnmVar);
        }
        Object obj = xxgVar.b;
        int i2 = xxgVar.d;
        if (i2 == 0) {
            hm5.M(obj);
            qmnVar2 = qmnVar;
            xxgVar.a = qmnVar2;
            xxgVar.d = 1;
            objB = b(xxgVar);
            Object obj2 = d9n.a;
            if (objB == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qmn qmnVar3 = xxgVar.a;
            hm5.M(obj);
            objB = obj;
            qmnVar2 = qmnVar3;
        }
        if (((Boolean) objB).booleanValue()) {
            return null;
        }
        return new mmn(rnx.c, new Integer(2131954633), new Integer(2131954634), new Integer(2131954632), (String) null, (tm81) null, (nmn) null, 3, new jmn(tpg.R0, new gke(this, qmnVar2, (lnm) null, (byte) 6)), 468);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        yxg yxgVar;
        if (onmVar instanceof yxg) {
            yxgVar = (yxg) onmVar;
            int i = yxgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yxgVar.c = i - Integer.MIN_VALUE;
            } else {
                yxgVar = new yxg(this, onmVar);
            }
        } else {
            yxgVar = new yxg(this, onmVar);
        }
        Object objL = yxgVar.a;
        int i2 = yxgVar.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable map = this.a.a.map(olj0.P0);
            yxgVar.c = 1;
            objL = fc11.l(map, 2, (Object) null, yxgVar);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
        }
        return Boolean.valueOf(u890.j(objL, Boolean.TRUE));
    }
}
