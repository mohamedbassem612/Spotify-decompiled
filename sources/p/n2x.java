package p;

import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class n2x implements b1x {
    public final qaq a;
    public final av0 b;
    public final kly0 c;
    public final q290 d;
    public final yje e;

    public n2x(qaq qaqVar, av0 av0Var, jly0 jly0Var, q290 q290Var, yje yjeVar) {
        this.a = qaqVar;
        this.b = av0Var;
        this.c = jly0Var;
        this.d = q290Var;
        this.e = yjeVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(ji0 ji0Var, lnm lnmVar) {
        m2x m2xVar;
        if (lnmVar instanceof m2x) {
            m2xVar = (m2x) lnmVar;
            int i = m2xVar.d;
            if ((i & os00.INVALID_ID) != 0) {
                m2xVar.d = i - os00.INVALID_ID;
            } else {
                m2xVar = new m2x(this, (onm) lnmVar);
            }
        } else {
            m2xVar = new m2x(this, (onm) lnmVar);
        }
        Object objY = m2xVar.b;
        int i2 = m2xVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                hce1 hce1Var = new hce1(this.a.a("embedded-npv-video"), this.b, (fv0) this.c.get());
                m2xVar.a = ji0Var;
                m2xVar.d = 1;
                fns fnsVar = igu.a;
                objY = fn31.Y(pyf0.a, new a38(hce1Var, ji0Var, (lnm) null, (byte) 18), m2xVar);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ji0Var = m2xVar.a;
                hm5.M(objY);
            }
            ylv0 ylv0Var = (ylv0) objY;
            if (ylv0Var != null) {
                return ylv0Var;
            }
            throw new IllegalStateException("Prebuffering failed for ad ".concat(gq0.d(ji0Var.a)));
        } catch (Exception e) {
            op71.x(m2xVar.getContext());
            Logger.k(e.getMessage(), new Object[]{e});
            return new m231(e);
        }
    }

    public final boolean b(ji0 ji0Var) {
        return ji0Var.Z == Format.VIDEO;
    }

    public final xu30 c() {
        return new oat(this, (byte) 29);
    }
}
