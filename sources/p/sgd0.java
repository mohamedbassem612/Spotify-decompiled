package p;

import android.app.Application;
import android.os.Bundle;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sgd0 {
    public final f1n0 a;
    public final r241 b;
    public final ut71 c;
    public final Flowable d;
    public final Application e;

    public sgd0(f1n0 f1n0Var, r241 r241Var, ut71 ut71Var, Flowable flowable, Application application) {
        this.a = f1n0Var;
        this.b = r241Var;
        this.c = ut71Var;
        this.d = flowable;
        this.e = application;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        ogd0 ogd0Var;
        Application application;
        ut71 ut71Var;
        if (onmVar instanceof ogd0) {
            ogd0Var = (ogd0) onmVar;
            int i = ogd0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                ogd0Var.e = i - Integer.MIN_VALUE;
            } else {
                ogd0Var = new ogd0(this, onmVar);
            }
        } else {
            ogd0Var = new ogd0(this, onmVar);
        }
        Object objJ = ogd0Var.c;
        int i2 = ogd0Var.e;
        if (i2 == 0) {
            hm5.M(objJ);
            vbm[] vbmVarArr = q601.a;
            kge kgeVar = new kge(this.d);
            fca0 fca0Var = new fca0(2, (lnm) null, (byte) 7);
            ut71 ut71Var2 = this.c;
            ogd0Var.a = ut71Var2;
            application = this.e;
            ogd0Var.b = application;
            ogd0Var.e = 1;
            objJ = b5p1.j(kgeVar, fca0Var, ogd0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
            ut71Var = ut71Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            application = ogd0Var.b;
            ut71Var = ogd0Var.a;
            hm5.M(objJ);
        }
        return ut71Var.b(application, ((th61) objJ).a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(boolean z, boolean z2, onm onmVar) {
        pgd0 pgd0Var;
        if (onmVar instanceof pgd0) {
            pgd0Var = (pgd0) onmVar;
            int i = pgd0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pgd0Var.e = i - Integer.MIN_VALUE;
            } else {
                pgd0Var = new pgd0(this, onmVar);
            }
        } else {
            pgd0Var = new pgd0(this, onmVar);
        }
        Object objA = pgd0Var.c;
        int i2 = pgd0Var.e;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            if (!z) {
                this.b.a("share-listening-activity", "1");
                if (z2) {
                    pgd0Var.a = z;
                    pgd0Var.b = z2;
                    pgd0Var.e = 3;
                    if (e(null, pgd0Var) == obj) {
                    }
                }
                return rih1Var;
            }
            pgd0Var.a = z;
            pgd0Var.b = z2;
            pgd0Var.e = 1;
            objA = a(pgd0Var);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objA);
                return rih1Var;
            }
            if (i2 == 3) {
                hm5.M(objA);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z2 = pgd0Var.b;
        z = pgd0Var.a;
        hm5.M(objA);
        dma1 dma1Var = (dma1) objA;
        bma1 bma1Var = rcd0.a;
        if (!dma1Var.h(bma1Var, false)) {
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.a(bma1Var, true);
            hma1VarEdit.g();
            pgd0Var.a = z;
            pgd0Var.b = z2;
            pgd0Var.e = 2;
            if (d(null, pgd0Var) == obj) {
                return obj;
            }
            return rih1Var;
        }
        this.b.a("share-listening-activity", "1");
        if (z2) {
            pgd0Var.a = z;
            pgd0Var.b = z2;
            pgd0Var.e = 3;
            if (e(null, pgd0Var) == obj) {
                return obj;
            }
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(boolean z, onm onmVar) {
        qgd0 qgd0Var;
        sgd0 sgd0Var;
        if (onmVar instanceof qgd0) {
            qgd0Var = (qgd0) onmVar;
            int i = qgd0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                qgd0Var.e = i - Integer.MIN_VALUE;
            } else {
                qgd0Var = new qgd0(this, onmVar);
            }
        } else {
            qgd0Var = new qgd0(this, onmVar);
        }
        Object objA = qgd0Var.c;
        int i2 = qgd0Var.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            r241 r241Var = this.b;
            r241Var.a("share-listening-activity", "1");
            r241Var.a("view-listening-activity", "1");
            qgd0Var.b = this;
            qgd0Var.a = z;
            qgd0Var.e = 1;
            objA = a(qgd0Var);
            if (objA != d9nVar) {
                sgd0Var = this;
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objA);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = qgd0Var.a;
        sgd0Var = qgd0Var.b;
        hm5.M(objA);
        sgd0Var.getClass();
        hma1 hma1VarEdit = ((dma1) objA).edit();
        hma1VarEdit.a(rcd0.a, true);
        hma1VarEdit.g();
        if (z) {
            qgd0Var.b = null;
            qgd0Var.a = z;
            qgd0Var.e = 2;
            if (e(null, qgd0Var) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    public final Object d(tv80 tv80Var, onm onmVar) {
        d9n d9nVar = d9n.a;
        f1n0 f1n0Var = this.a;
        if (tv80Var == null) {
            Object objD = f1n0.d(f1n0Var, new dwn0(nik1.v4.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), onmVar);
            if (objD == d9nVar) {
                return objD;
            }
        } else {
            Object objF = f1n0.f(f1n0Var, nik1.v4.a, tv80Var, onmVar);
            if (objF == d9nVar) {
                return objF;
            }
        }
        return rih1.a;
    }

    public final Object e(tv80 tv80Var, onm onmVar) {
        Set set = s4b1.f;
        String strZ = uic.x("spotify:listening-activity:settings").z();
        if (strZ == null) {
            strZ = nik1.x4.a;
        }
        String str = strZ;
        d9n d9nVar = d9n.a;
        f1n0 f1n0Var = this.a;
        if (tv80Var == null) {
            Object objD = f1n0.d(f1n0Var, new dwn0(str, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), onmVar);
            if (objD == d9nVar) {
                return objD;
            }
        } else {
            Object objF = f1n0.f(f1n0Var, str, tv80Var, onmVar);
            if (objF == d9nVar) {
                return objF;
            }
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(tv80 tv80Var, onm onmVar) {
        rgd0 rgd0Var;
        if (onmVar instanceof rgd0) {
            rgd0Var = (rgd0) onmVar;
            int i = rgd0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rgd0Var.d = i - Integer.MIN_VALUE;
            } else {
                rgd0Var = new rgd0(this, onmVar);
            }
        } else {
            rgd0Var = new rgd0(this, onmVar);
        }
        Object obj = rgd0Var.b;
        int i2 = rgd0Var.d;
        rih1 rih1Var = rih1.a;
        Object obj2 = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                if (i2 == 3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tv80 tv80Var2 = rgd0Var.a;
            hm5.M(obj);
            dma1 dma1Var = (dma1) obj;
            bma1 bma1Var = rcd0.a;
            if (!dma1Var.h(bma1Var, false)) {
                hma1 hma1VarEdit = dma1Var.edit();
                hma1VarEdit.a(bma1Var, true);
                hma1VarEdit.g();
                rgd0Var.a = null;
                rgd0Var.d = 2;
                if (d(tv80Var2, rgd0Var) == obj2) {
                    return obj2;
                }
                return rih1Var;
            }
            tv80Var = tv80Var2;
        }
        rgd0Var.a = null;
        rgd0Var.d = 3;
        if (e(tv80Var, rgd0Var) == obj2) {
            return obj2;
        }
        return rih1Var;
    }
}
