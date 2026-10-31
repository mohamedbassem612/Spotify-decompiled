package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gwd1 {
    public final lzn0 a;
    public final axd1 b;
    public final mwd1 c;
    public final q8n d;

    public gwd1(lzn0 lzn0Var, axd1 axd1Var, mwd1 mwd1Var, q8n q8nVar) {
        this.a = lzn0Var;
        this.b = axd1Var;
        this.c = mwd1Var;
        this.d = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, tv80 tv80Var, onm onmVar) {
        fwd1 fwd1Var;
        xwd1 m231Var;
        Object objA;
        if (onmVar instanceof fwd1) {
            fwd1Var = (fwd1) onmVar;
            int i = fwd1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fwd1Var.d = i - Integer.MIN_VALUE;
            } else {
                fwd1Var = new fwd1(this, onmVar);
            }
        } else {
            fwd1Var = new fwd1(this, onmVar);
        }
        Object obj = fwd1Var.b;
        int i2 = fwd1Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                axd1 axd1Var = this.b;
                String str2 = this.c.a;
                fwd1Var.a = tv80Var;
                fwd1Var.d = 1;
                objA = axd1Var.a(str2, str, fwd1Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tv80Var = fwd1Var.a;
                hm5.M(obj);
                objA = ((xwd1) obj).a;
            }
            m231Var = new xwd1((String) objA);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return e331.a(m231Var) == null ? new rxz(tv80Var) : qxz.a;
    }
}
