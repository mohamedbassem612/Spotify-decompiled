package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class aay0 {
    public final tzr0 a;
    public final ki20 b;
    public final pux0 c;
    public final q8n d;

    public aay0(tzr0 tzr0Var, ki20 ki20Var, pux0 pux0Var, q8n q8nVar) {
        this.a = tzr0Var;
        this.b = ki20Var;
        this.c = pux0Var;
        this.d = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(cay0 cay0Var, onm onmVar) {
        z9y0 z9y0Var;
        if (onmVar instanceof z9y0) {
            z9y0Var = (z9y0) onmVar;
            int i = z9y0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                z9y0Var.c = i - Integer.MIN_VALUE;
            } else {
                z9y0Var = new z9y0(this, onmVar);
            }
        } else {
            z9y0Var = new z9y0(this, onmVar);
        }
        Object objH = z9y0Var.a;
        int i2 = z9y0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objH);
                pux0 pux0Var = this.c;
                String str = cay0Var.a;
                z9y0Var.c = 1;
                objH = pux0Var.h(str, z9y0Var);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objH);
            }
            h7y0 h7y0Var = (h7y0) objH;
            return new fay0(h7y0Var.c, h7y0Var.e, h7y0Var.a, h7y0Var.b);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return eay0.a;
        }
    }
}
