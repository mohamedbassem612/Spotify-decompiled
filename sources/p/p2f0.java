package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p2f0 {
    public static final long c;
    public final ru71 a;
    public final mr20 b;

    static {
        ytw0 ytw0Var = jfv.b;
        c = fdg1.k0(1, ngv.SECONDS);
    }

    public p2f0(ru71 ru71Var, mr20 mr20Var) {
        this.a = ru71Var;
        this.b = mr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(onm onmVar) {
        n2f0 n2f0Var;
        if (onmVar instanceof n2f0) {
            n2f0Var = (n2f0) onmVar;
            int i = n2f0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n2f0Var.c = i - Integer.MIN_VALUE;
            } else {
                n2f0Var = new n2f0(this, onmVar);
            }
        } else {
            n2f0Var = new n2f0(this, onmVar);
        }
        Object objP = n2f0Var.a;
        int i2 = n2f0Var.c;
        if (i2 == 0) {
            hm5.M(objP);
            ru71 ru71Var = this.a;
            ima1 ima1Var = (dma1) ru71Var.c.getValue();
            bma1 bma1Var = ru71.d;
            if (!ima1Var.n(bma1Var) || !((dma1) ru71Var.c.getValue()).h(bma1Var, false)) {
                p6d0 p6d0Var = new p6d0(this, (lnm) null, (byte) 17);
                n2f0Var.c = 1;
                objP = rc2.P(c, p6d0Var, n2f0Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
            }
            return m2f0.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objP);
        if (((th61) objP) == null) {
            Logger.k("Session state timed out - Assuming logged-out", new Object[0]);
            return m2f0.b;
        }
        return m2f0.a;
    }
}
