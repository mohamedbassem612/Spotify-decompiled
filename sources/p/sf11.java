package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sf11 implements me91 {
    public final be91 a;

    public sf11(be91 be91Var) {
        this.a = be91Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(jx0 jx0Var, lnm lnmVar) {
        rf11 rf11Var;
        if (lnmVar instanceof rf11) {
            rf11Var = (rf11) lnmVar;
            int i = rf11Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rf11Var.d = i - Integer.MIN_VALUE;
            } else {
                rf11Var = new rf11(this, (onm) lnmVar);
            }
        } else {
            rf11Var = new rf11(this, (onm) lnmVar);
        }
        Object objH = rf11Var.b;
        int i2 = rf11Var.d;
        if (i2 == 0) {
            hm5.M(objH);
            rf11Var.a = jx0Var;
            rf11Var.d = 1;
            be91 be91Var = this.a;
            objH = c921.H(be91Var.e, new ciw0(jx0Var, be91Var, (lnm) null, (byte) 22), rf11Var);
            d9n d9nVar = d9n.a;
            if (objH == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jx0Var = rf11Var.a;
            hm5.M(objH);
        }
        if (((tc91) objH) instanceof sc91) {
            return Boolean.TRUE;
        }
        Logger.d(f4i1.f("Failed to register ", jx0Var.a, " slot."), new Object[0]);
        return Boolean.FALSE;
    }
}
