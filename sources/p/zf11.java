package p;

import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zf11 implements s331 {
    public final bpb1 a = gio1.b(0);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // p.s331
    public final Object a(lnm lnmVar) {
        yf11 yf11Var;
        if (lnmVar instanceof yf11) {
            yf11Var = (yf11) lnmVar;
            int i = yf11Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                yf11Var.c = i - Integer.MIN_VALUE;
            } else {
                yf11Var = new yf11(this, (onm) lnmVar);
            }
        } else {
            yf11Var = new yf11(this, (onm) lnmVar);
        }
        Object obj = yf11Var.a;
        int i2 = yf11Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                ytw0 ytw0Var = jfv.b;
                long jK0 = fdg1.k0(5, ngv.SECONDS);
                ic01 ic01Var = new ic01(this, (lnm) null, (byte) 10);
                yf11Var.c = 1;
                Object objN = rc2.N(jK0, ic01Var, yf11Var);
                d9n d9nVar = d9n.a;
                this = objN;
                if (objN == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this = this;
            }
        } catch (TimeoutCancellationException unused) {
            this.a.m(null, yah0.p(0));
        }
        return rih1.a;
    }

    public final xf11 b() {
        bpb1 bpb1Var;
        Object value;
        do {
            bpb1Var = this.a;
            value = bpb1Var.getValue();
        } while (!bpb1Var.k(value, Integer.valueOf(((Number) value).intValue() + 1)));
        return new xf11(this);
    }
}
