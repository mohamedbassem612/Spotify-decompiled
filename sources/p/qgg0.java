package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qgg0 {
    public final a2b0 a;
    public final ehg0 b;
    public final q8n c;

    public qgg0(a2b0 a2b0Var, ehg0 ehg0Var, q8n q8nVar) {
        this.a = a2b0Var;
        this.b = ehg0Var;
        this.c = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(kgg0 kgg0Var, onm onmVar) {
        pgg0 pgg0Var;
        rih1 m231Var;
        if (onmVar instanceof pgg0) {
            pgg0Var = (pgg0) onmVar;
            int i = pgg0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                pgg0Var.d = i - Integer.MIN_VALUE;
            } else {
                pgg0Var = new pgg0(this, onmVar);
            }
        } else {
            pgg0Var = new pgg0(this, onmVar);
        }
        Object obj = pgg0Var.b;
        int i2 = pgg0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                a2b0 a2b0Var = this.a;
                String str = kgg0Var.a;
                boolean z = kgg0Var.b;
                pgg0Var.a = kgg0Var;
                pgg0Var.d = 1;
                Object objJ = a2b0Var.j(str, z, pgg0Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kgg0Var = pgg0Var.a;
                hm5.M(obj);
            }
            m231Var = rih1.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return e331.a(m231Var) == null ? new sgg0(kgg0Var.a, kgg0Var.b) : new rgg0(kgg0Var.a, kgg0Var.b);
    }
}
