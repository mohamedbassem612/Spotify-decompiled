package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b890 implements h0r0 {
    public final hvj a;
    public final ay0 b;
    public final lzn0 c;
    public final av0 d;
    public final fv0 e;
    public final dz0 f;
    public final ddo g;
    public final op0 h;
    public final kt91 i;
    public final fu00 j;
    public final q8n k;
    public final woa l;
    public final ruz m;
    public final x72 n;
    public final x72 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2t f1p;
    public final AtomicBoolean q;
    public final cbr0 r;

    public b890(hvj hvjVar, ay0 ay0Var, lzn0 lzn0Var, g9c0 g9c0Var, av0 av0Var, fv0 fv0Var, dz0 dz0Var, ddo ddoVar, op0 op0Var, kt91 kt91Var, pxc pxcVar, fu00 fu00Var, q7r0 q7r0Var, cyp cypVar, q8n q8nVar) {
        this.a = hvjVar;
        this.b = ay0Var;
        this.c = lzn0Var;
        this.d = av0Var;
        this.e = fv0Var;
        this.f = dz0Var;
        this.g = ddoVar;
        this.h = op0Var;
        this.i = kt91Var;
        this.j = fu00Var;
        this.k = q8nVar;
        this.l = g9c0Var.a(q7r0Var.d.c);
        this.m = cypVar.a();
        any anyVar = fv0Var.f;
        this.n = new x72(anyVar, (byte) 25);
        this.o = new x72(anyVar, (byte) 26);
        this.f1p = new p2t(pxcVar, kt91Var);
        this.q = new AtomicBoolean(false);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.r = new cbr0(new dbr0[]{new bn70(yon1.G1("ADS", "ads", 18, "ads"), nik1.e2, (nar0) null), new pu00(true), new t1r0(true), new hgr0(egr0.a, 0, 2), new s9h1(14, true, false, false), new tc30(3)}, false);
    }

    public final cbr0 a() {
        return this.r;
    }

    public final p2r0 b() {
        return hvj.b(this.a, new o6e0(new pbg(this, (lnm) null, (byte) 28), f46.I(new p6e0[0])), new j2i(1489424228, new yy80(this, (byte) 1), true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        w790 w790Var;
        if (onmVar instanceof w790) {
            w790Var = (w790) onmVar;
            int i = w790Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                w790Var.d = i - Integer.MIN_VALUE;
            } else {
                w790Var = new w790(this, onmVar);
            }
        } else {
            w790Var = new w790(this, onmVar);
        }
        Object objB = w790Var.b;
        int i2 = w790Var.d;
        ay0 ay0Var = this.b;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objB);
            w790Var.d = 1;
            objB = ay0.b(ay0Var, (Map) null, w790Var, 3);
            if (objB != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oc91 oc91Var = w790Var.a;
            hm5.M(objB);
            return oc91Var;
        }
        hm5.M(objB);
        oc91 oc91Var2 = objB instanceof oc91 ? (oc91) objB : null;
        if (oc91Var2 == null || oc91Var2.b.isEmpty()) {
            return null;
        }
        this.q.set(false);
        w790Var.a = oc91Var2;
        w790Var.d = 2;
        return ay0Var.e(w790Var) == d9nVar ? d9nVar : oc91Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ji0 ji0Var, onm onmVar) {
        x790 x790Var;
        if (onmVar instanceof x790) {
            x790Var = (x790) onmVar;
            int i = x790Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                x790Var.d = i - Integer.MIN_VALUE;
            } else {
                x790Var = new x790(this, onmVar);
            }
        } else {
            x790Var = new x790(this, onmVar);
        }
        Object objI = x790Var.b;
        int i2 = x790Var.d;
        if (i2 == 0) {
            hm5.M(objI);
            x790Var.a = ji0Var;
            x790Var.d = 1;
            objI = b5p1.i(this.n, x790Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ji0Var = x790Var.a;
            hm5.M(objI);
        }
        ji0 ji0Var2 = ji0Var;
        pxc.a(this.f1p, ji0Var2, new Long(((Number) objI).longValue()), (String) null, "companion", 20);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(onm onmVar) {
        y790 y790Var;
        if (onmVar instanceof y790) {
            y790Var = (y790) onmVar;
            int i = y790Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y790Var.c = i - Integer.MIN_VALUE;
            } else {
                y790Var = new y790(this, onmVar);
            }
        } else {
            y790Var = new y790(this, onmVar);
        }
        Object objJ = y790Var.a;
        int i2 = y790Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleA = this.m.a(new d9u0("interrupting-ad-video", false));
                y790Var.c = 1;
                objJ = fc11.j(singleA, y790Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            beh behVar = (feh) objJ;
            if (behVar instanceof beh) {
                Logger.d("Could not pause existing playback: %s", new Object[]{behVar.a});
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to pause existing playback for interrupting video ad", new Object[0]);
        }
        return rih1.a;
    }

    public final Object f(u790 u790Var, lnm lnmVar) {
        if (this.q.compareAndSet(false, true)) {
            Object objY = fn31.Y(this.k, new xe2(u790Var, this, (lnm) null), lnmVar);
            if (objY == d9n.a) {
                return objY;
            }
        }
        return rih1.a;
    }
}
