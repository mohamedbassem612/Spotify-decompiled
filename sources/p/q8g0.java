package p;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q8g0 {
    public final a2b0 a;
    public final ur00 b;
    public final q8n c;

    public q8g0(a2b0 a2b0Var, ur00 ur00Var, q8n q8nVar) {
        this.a = a2b0Var;
        this.b = ur00Var;
        this.c = q8nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(w7g0 w7g0Var, onm onmVar) {
        e8g0 e8g0Var;
        List m231Var;
        if (onmVar instanceof e8g0) {
            e8g0Var = (e8g0) onmVar;
            int i = e8g0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                e8g0Var.d = i - Integer.MIN_VALUE;
            } else {
                e8g0Var = new e8g0(this, onmVar);
            }
        } else {
            e8g0Var = new e8g0(this, onmVar);
        }
        Object objA = e8g0Var.b;
        int i2 = e8g0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                a2b0 a2b0Var = this.a;
                String str = w7g0Var.e;
                String str2 = w7g0Var.f;
                List list = w7g0Var.g;
                e8g0Var.a = w7g0Var;
                e8g0Var.d = 1;
                objA = a2b0Var.a(str, str2, list, e8g0Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w7g0Var = e8g0Var.a;
                hm5.M(objA);
            }
            m231Var = (List) objA;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) != null) {
            return new s8g0(w7g0Var.f);
        }
        return new t8g0(w7g0Var.f, m231Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x7g0 x7g0Var, onm onmVar) {
        p8g0 p8g0Var;
        rih1 m231Var;
        if (onmVar instanceof p8g0) {
            p8g0Var = (p8g0) onmVar;
            int i = p8g0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                p8g0Var.d = i - Integer.MIN_VALUE;
            } else {
                p8g0Var = new p8g0(this, onmVar);
            }
        } else {
            p8g0Var = new p8g0(this, onmVar);
        }
        Object obj = p8g0Var.b;
        int i2 = p8g0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                a2b0 a2b0Var = this.a;
                String str = x7g0Var.e;
                int i3 = x7g0Var.f;
                p8g0Var.a = x7g0Var;
                p8g0Var.d = 1;
                Object objI = a2b0Var.i(str, i3, p8g0Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x7g0Var = p8g0Var.a;
                hm5.M(obj);
            }
            m231Var = rih1.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return e331.a(m231Var) == null ? new v8g0(x7g0Var.e, x7g0Var.f) : new u8g0(x7g0Var.e, x7g0Var.f);
    }
}
