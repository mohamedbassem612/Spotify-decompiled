package p;

import android.view.textclassifier.TextClassifier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ldt0 extends a8d1 implements vu30 {
    public vgn0 a;
    public ndt0 b;
    public byte c;
    public final /* synthetic */ ndt0 d;
    public final /* synthetic */ vu30 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldt0(ndt0 ndt0Var, vu30 vu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = ndt0Var;
        this.e = vu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new ldt0(this.d, this.e, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0093 A[RETURN] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ndt0 ndt0Var;
        vgn0 vgn0Var;
        vgn0 vgn0Var2;
        TextClassifier textClassifierJ;
        Object objP;
        byte b = this.c;
        ngv ngvVar = ngv.d;
        d9n d9nVar = d9n.a;
        try {
            if (b == 0) {
                hm5.M(obj);
                ndt0Var = this.d;
                vgn0Var = ndt0Var.e;
                this.a = vgn0Var;
                this.b = ndt0Var;
                this.c = (byte) 1;
                if (vgn0Var.a(this) != d9nVar) {
                }
                return d9nVar;
            }
            if (b != 1) {
                if (b != 2) {
                    if (b == 3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vgn0Var2 = this.a;
                try {
                    hm5.M(obj);
                    textClassifierJ = qpp0.j(obj);
                    vgn0Var = vgn0Var2;
                    vgn0Var.c((Object) null);
                    ytw0 ytw0Var = jfv.b;
                    long jL0 = fdg1.l0(200L, ngvVar);
                    f3t0 f3t0Var = new f3t0(textClassifierJ, this.e, (lnm) null, (byte) 4);
                    this.a = null;
                    this.b = null;
                    this.c = (byte) 3;
                    objP = rc2.P(jL0, f3t0Var, this);
                    if (objP == d9nVar) {
                        return d9nVar;
                    }
                    return objP;
                } catch (Throwable th) {
                    th = th;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            }
            ndt0Var = this.b;
            vgn0 vgn0Var3 = this.a;
            hm5.M(obj);
            vgn0Var = vgn0Var3;
            textClassifierJ = ndt0Var.f;
            if (textClassifierJ == null || textClassifierJ.isDestroyed()) {
                ytw0 ytw0Var2 = jfv.b;
                long jL1 = fdg1.l0(300L, ngvVar);
                kdt0 kdt0Var = new kdt0(ndt0Var, (lnm) null, (byte) 0);
                this.a = vgn0Var;
                this.b = null;
                this.c = (byte) 2;
                Object objP2 = rc2.P(jL1, kdt0Var, this);
                if (objP2 != d9nVar) {
                    vgn0Var2 = vgn0Var;
                    obj = objP2;
                    textClassifierJ = qpp0.j(obj);
                    vgn0Var = vgn0Var2;
                    vgn0Var.c((Object) null);
                    ytw0 ytw0Var3 = jfv.b;
                    long jL2 = fdg1.l0(200L, ngvVar);
                    f3t0 f3t0Var2 = new f3t0(textClassifierJ, this.e, (lnm) null, (byte) 4);
                    this.a = null;
                    this.b = null;
                    this.c = (byte) 3;
                    objP = rc2.P(jL2, f3t0Var2, this);
                    if (objP == d9nVar) {
                        return objP;
                    }
                }
            } else {
                vgn0Var.c((Object) null);
                ytw0 ytw0Var4 = jfv.b;
                long jL3 = fdg1.l0(200L, ngvVar);
                f3t0 f3t0Var3 = new f3t0(textClassifierJ, this.e, (lnm) null, (byte) 4);
                this.a = null;
                this.b = null;
                this.c = (byte) 3;
                objP = rc2.P(jL3, f3t0Var3, this);
                if (objP == d9nVar) {
                    return objP;
                }
            }
            return d9nVar;
        } catch (Throwable th2) {
            th = th2;
            vgn0Var2 = vgn0Var;
            vgn0Var2.c((Object) null);
            throw th;
        }
    }
}
