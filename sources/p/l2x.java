package p;

import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.base.java.logging.Logger;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l2x implements b1x {
    public static fv0 h;
    public final woa a;
    public final av0 b;
    public final kly0 c;
    public final List d;
    public final byp e;
    public final rmr f;
    public final jut g;

    public l2x(woa woaVar, av0 av0Var, jly0 jly0Var, List list, byp bypVar, rmr rmrVar, jut jutVar) {
        this.a = woaVar;
        this.b = av0Var;
        this.c = jly0Var;
        this.d = list;
        this.e = bypVar;
        this.f = rmrVar;
        this.g = jutVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(ji0 ji0Var, lnm lnmVar) {
        k2x k2xVar;
        if (lnmVar instanceof k2x) {
            k2xVar = (k2x) lnmVar;
            int i = k2xVar.d;
            if ((i & os00.INVALID_ID) != 0) {
                k2xVar.d = i - os00.INVALID_ID;
            } else {
                k2xVar = new k2x(this, (onm) lnmVar);
            }
        } else {
            k2xVar = new k2x(this, (onm) lnmVar);
        }
        Object objY = k2xVar.b;
        int i2 = k2xVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                fv0 fv0Var = h;
                if (fv0Var == null) {
                    Object obj = this.c.get();
                    h = (fv0) obj;
                    fv0Var = (fv0) obj;
                }
                fv0 fv0Var2 = fv0Var;
                woa woaVar = this.a;
                List list = this.d;
                av0 av0Var = this.b;
                fv0Var2.getClass();
                hce1 hce1Var = new hce1(woaVar, list, av0Var, fv0Var2, (byte) 21);
                k2xVar.a = ji0Var;
                k2xVar.d = 1;
                fns fnsVar = igu.a;
                objY = fn31.Y(pyf0.a, new a38(hce1Var, ji0Var, (lnm) null, (byte) 19), k2xVar);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ji0Var = k2xVar.a;
                hm5.M(objY);
            }
            ylv0 ylv0Var = (ylv0) objY;
            if (ylv0Var != null) {
                return ylv0Var;
            }
            throw new IllegalStateException("Prebuffering failed for ad ".concat(gq0.d(ji0Var.a)));
        } catch (Exception e) {
            op71.x(k2xVar.getContext());
            Logger.k(e.getMessage(), new Object[]{e});
            return new m231(e);
        }
    }

    public final boolean b(ji0 ji0Var) {
        return ji0Var.Z == Format.VIDEO;
    }

    public final xu30 c() {
        return new oat(this, (byte) 28);
    }
}
