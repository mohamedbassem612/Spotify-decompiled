package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mhn0 {
    public final a2b0 a;
    public final q8n b;
    public final poj0 c;

    public mhn0(a2b0 a2b0Var, q8n q8nVar, poj0 poj0Var) {
        this.a = a2b0Var;
        this.b = q8nVar;
        this.c = poj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ehn0 ehn0Var, onm onmVar) {
        hhn0 hhn0Var;
        rih1 m231Var;
        if (onmVar instanceof hhn0) {
            hhn0Var = (hhn0) onmVar;
            int i = hhn0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hhn0Var.d = i - Integer.MIN_VALUE;
            } else {
                hhn0Var = new hhn0(this, onmVar);
            }
        } else {
            hhn0Var = new hhn0(this, onmVar);
        }
        Object obj = hhn0Var.b;
        int i2 = hhn0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                a2b0 a2b0Var = this.a;
                String str = ehn0Var.c;
                hhn0Var.a = ehn0Var;
                hhn0Var.d = 1;
                Object objB = a2b0Var.b(str, hhn0Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ehn0Var = hhn0Var.a;
                hm5.M(obj);
            }
            m231Var = rih1.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return e331.a(m231Var) == null ? new qhn0(ehn0Var.c) : new phn0(ehn0Var.c);
    }
}
