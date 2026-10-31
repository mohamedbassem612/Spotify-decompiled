package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dm6 implements sdm {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ dm6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final /* bridge */ /* synthetic */ Object a(oim oimVar, us0 us0Var) {
        switch (this.a) {
            case 0:
                return b((fm6) oimVar, us0Var);
            case 1:
                return c((eoc0) oimVar, us0Var);
            default:
                return d((dmf1) oimVar, us0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(fm6 fm6Var, onm onmVar) {
        cm6 cm6Var;
        if (onmVar instanceof cm6) {
            cm6Var = (cm6) onmVar;
            int i = cm6Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cm6Var.c = i - Integer.MIN_VALUE;
            } else {
                cm6Var = new cm6(this, onmVar);
            }
        } else {
            cm6Var = new cm6(this, onmVar);
        }
        Object objL = cm6Var.a;
        int i2 = cm6Var.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable observableA = ((js6) this.b).a(fm6Var);
            cm6Var.c = 1;
            objL = fc11.l(observableA, 1, (Object) null, cm6Var);
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
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(eoc0 eoc0Var, onm onmVar) {
        doc0 doc0Var;
        if (onmVar instanceof doc0) {
            doc0Var = (doc0) onmVar;
            int i = doc0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                doc0Var.c = i - Integer.MIN_VALUE;
            } else {
                doc0Var = new doc0(this, onmVar);
            }
        } else {
            doc0Var = new doc0(this, onmVar);
        }
        Object objL = doc0Var.a;
        int i2 = doc0Var.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable observableA = ((ywc0) this.b).a(eoc0Var);
            doc0Var.c = 1;
            objL = fc11.l(observableA, 1, (Object) null, doc0Var);
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
        return objL;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(dmf1 dmf1Var, onm onmVar) {
        amf1 amf1Var;
        if (onmVar instanceof amf1) {
            amf1Var = (amf1) onmVar;
            int i = amf1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                amf1Var.c = i - Integer.MIN_VALUE;
            } else {
                amf1Var = new amf1(this, onmVar);
            }
        } else {
            amf1Var = new amf1(this, onmVar);
        }
        Object objL = amf1Var.a;
        int i2 = amf1Var.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable observableD = ((jsf1) this.b).d(dmf1Var);
            amf1Var.c = 1;
            objL = fc11.l(observableD, 1, (Object) null, amf1Var);
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
        return objL;
    }
}
