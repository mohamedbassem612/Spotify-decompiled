package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k4i0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ m4i0 a;

    public k4i0(m4i0 m4i0Var) {
        this.a = m4i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        j4i0 j4i0Var;
        Object objO;
        if (onmVar instanceof j4i0) {
            j4i0Var = (j4i0) onmVar;
            int i = j4i0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                j4i0Var.b = i - Integer.MIN_VALUE;
            } else {
                j4i0Var = new j4i0(this, onmVar);
            }
        } else {
            j4i0Var = new j4i0(this, onmVar);
        }
        Object obj2 = j4i0Var.a;
        int i2 = j4i0Var.b;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj2);
            jkp0 jkp0Var = this.a.b;
            j4i0Var.d = r261Var;
            j4i0Var.b = 1;
            b7i0 b7i0Var = (b7i0) jkp0Var.b;
            r091 r091Var = (r091) b7i0Var.d.getValue();
            if (r091Var == null) {
                objO = rih1Var;
            } else {
                boolean z = b7i0Var.f;
                r091Var.j();
                b7i0Var.f = false;
                if (!z || (objO = rc2.O(1000L, new bz30(r091Var, (lnm) null, (byte) 1), j4i0Var)) != d9nVar) {
                    objO = rih1Var;
                }
            }
            if (objO != d9nVar) {
                objO = rih1Var;
            }
            if (objO != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r261Var = j4i0Var.d;
        hm5.M(obj2);
        j4i0Var.d = null;
        j4i0Var.b = 2;
        return r261Var.b(h5i0.a, j4i0Var) == d9nVar ? d9nVar : rih1Var;
    }
}
