package p;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yv5 implements dwo {
    public final Context a;
    public final ajg b;
    public final Flowable c;
    public final yqg d;
    public final ndi1 e;
    public final crd f;
    public final q8n g;
    public final mr20 h;
    public final llm i;
    public int t;

    public yv5(Context context, ajg ajgVar, Flowable flowable, yqg yqgVar, ndi1 ndi1Var, crd crdVar, Observable observable, q8n q8nVar, q8n q8nVar2) {
        this.a = context;
        this.b = ajgVar;
        this.c = flowable;
        this.d = yqgVar;
        this.e = ndi1Var;
        this.f = crdVar;
        this.g = q8nVar;
        this.h = rqt0.u(yoi1.g(observable));
        llm llmVarE = smo1.e(flo1.l(q8nVar, guo1.B()).y(new v62(olj0.T0, (byte) 1)));
        this.i = llmVarE;
        fn31.T(llmVarE, q8nVar2, 0, new wt(this, (lnm) null, (byte) 10), 2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (p.b5p1.i(r0, r6) == r10) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(p.onm r16) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.yv5.a(p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        uv5 uv5Var;
        if (onmVar instanceof uv5) {
            uv5Var = (uv5) onmVar;
            int i = uv5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uv5Var.c = i - Integer.MIN_VALUE;
            } else {
                uv5Var = new uv5(this, onmVar);
            }
        } else {
            uv5Var = new uv5(this, onmVar);
        }
        Object objI = uv5Var.a;
        int i2 = uv5Var.c;
        lnm lnmVar = null;
        dw5 dw5Var = dw5.c;
        ndi1 ndi1Var = this.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            uv5Var.c = 1;
            objI = b5p1.i(new a1b1(new lt20(ndi1Var.a("app_rater").getData(), new w1e0(3, (lnm) null, (byte) 29), (byte) 0), dw5Var, (byte) 25), uv5Var);
            if (objI != d9nVar) {
            }
        }
        if (i2 == 1) {
            hm5.M(objI);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    hm5.M(objI);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objI);
        }
        kk kkVar = new kk(this, lnmVar, (byte) 13);
        uv5Var.c = 3;
        return fn31.Y(this.g, kkVar, uv5Var) == d9nVar ? d9nVar : rih1Var;
        if (!((Boolean) objI).booleanValue()) {
            Boolean bool = Boolean.TRUE;
            uv5Var.c = 2;
            if (ndi1Var.b(dw5Var, bool, uv5Var) != d9nVar) {
                kk kkVar2 = new kk(this, lnmVar, (byte) 13);
                uv5Var.c = 3;
                if (fn31.Y(this.g, kkVar2, uv5Var) == d9nVar) {
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        wv5 wv5Var;
        if (onmVar instanceof wv5) {
            wv5Var = (wv5) onmVar;
            int i = wv5Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wv5Var.c = i - Integer.MIN_VALUE;
            } else {
                wv5Var = new wv5(this, onmVar);
            }
        } else {
            wv5Var = new wv5(this, onmVar);
        }
        Object obj = wv5Var.a;
        int i2 = wv5Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            if (this.b.b() == null) {
                Logger.g("The app is sideloaded, skipping the AppRater Dialog", new Object[0]);
                return Boolean.FALSE;
            }
            ve1 ve1Var = new ve1(new x010(this.h, rqt0.u(yoi1.g(this.f.c)), new xv5(3, (lnm) null, (byte) 0), (byte) 1), (byte) 1);
            wv5Var.c = 1;
            Object objI = b5p1.i(ve1Var, wv5Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return Boolean.TRUE;
    }

    public final void shutdown() {
        smo1.p(this.i, (CancellationException) null);
    }
}
