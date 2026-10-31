package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q6b1 {
    public final h5a1 a;

    public q6b1(h5a1 h5a1Var) {
        this.a = h5a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, onm onmVar) {
        p6b1 p6b1Var;
        if (onmVar instanceof p6b1) {
            p6b1Var = (p6b1) onmVar;
            int i = p6b1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p6b1Var.c = i - Integer.MIN_VALUE;
            } else {
                p6b1Var = new p6b1(this, onmVar);
            }
        } else {
            p6b1Var = new p6b1(this, onmVar);
        }
        p6b1 p6b1Var2 = p6b1Var;
        Object objK = p6b1Var2.a;
        int i2 = p6b1Var2.c;
        try {
            if (i2 == 0) {
                hm5.M(objK);
                h5a1 h5a1Var = this.a;
                p6b1Var2.c = 1;
                objK = h5a1Var.k(str, p6b1Var2);
                d9n d9nVar = d9n.a;
                if (objK == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objK);
            }
            llh1 llh1VarA = ((nlh1) objK).a();
            String strC = llh1VarA.c();
            if (strC != null) {
                return new f7q0(strC, llh1VarA.b(), (String) null, (String) null, (s7q0) null, 120);
            }
            throw new IllegalStateException("Chat Input field: no URI in response from UnshortenUrlService");
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            op71.x(p6b1Var2.getContext());
            return new m231(e2);
        }
    }
}
