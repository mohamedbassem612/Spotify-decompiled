package p;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i4s {
    public final mr20 a;
    public final AtomicReference b = new AtomicReference();

    public i4s(mr20 mr20Var) {
        this.a = mr20Var;
    }

    public final void a() {
        f4s f4sVar = (f4s) this.b.getAndSet(null);
        if (f4sVar != null) {
            f4sVar.b.d((CancellationException) null);
        }
    }

    public final boolean b(f4s f4sVar) {
        return this.b.get() == f4sVar && f4sVar.b.isActive();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        g4s g4sVar;
        if (onmVar instanceof g4s) {
            g4sVar = (g4s) onmVar;
            int i = g4sVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                g4sVar.c = i - Integer.MIN_VALUE;
            } else {
                g4sVar = new g4s(this, onmVar);
            }
        } else {
            g4sVar = new g4s(this, onmVar);
        }
        Object obj = g4sVar.a;
        int i2 = g4sVar.c;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(obj);
                    a();
                    mr20 mr20Var = this.a;
                    skr skrVar = new skr(this, (byte) 8);
                    g4sVar.c = 1;
                    Object objCollect = mr20Var.collect(skrVar, g4sVar);
                    d9n d9nVar = d9n.a;
                    if (objCollect == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                a();
            }
            a();
            return rih1.a;
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
