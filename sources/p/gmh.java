package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gmh {
    public static final o3r c = w3p1.o(new l4r(jd0.k, 1, bmh.d, new j4r(bmh.b), bmh.e), bmh.c);
    public final d0r a;
    public final ykr0 b;

    public gmh(d0r d0rVar, ykr0 ykr0Var) {
        this.a = d0rVar;
        this.b = ykr0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(iu30 iu30Var, onm onmVar) {
        fmh fmhVar;
        if (onmVar instanceof fmh) {
            fmhVar = (fmh) onmVar;
            int i = fmhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fmhVar.c = i - Integer.MIN_VALUE;
            } else {
                fmhVar = new fmh(this, onmVar);
            }
        } else {
            fmhVar = new fmh(this, onmVar);
        }
        Object obj = fmhVar.a;
        int i2 = fmhVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            fmhVar.c = 1;
            Object objInvoke = iu30Var.invoke(fmhVar);
            d9n d9nVar = d9n.a;
            return objInvoke == d9nVar ? d9nVar : objInvoke;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new m231(e2);
        }
    }
}
