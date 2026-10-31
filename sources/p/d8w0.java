package p;

import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d8w0 extends x7e0 {
    public final a9w0 d;
    public e8w0 e;
    public final llm f = smo1.e(op71.f());
    public xab1 g;

    public d8w0(a9w0 a9w0Var) {
        this.d = a9w0Var;
    }

    public final void e() {
        j();
        this.g = fn31.T(this.f, (o8n) null, 0, new c3u0(this, null, (byte) 13), 3);
    }

    public final void f() {
        xab1 xab1Var = this.g;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(onm onmVar) {
        c8w0 c8w0Var;
        Object objB;
        if (onmVar instanceof c8w0) {
            c8w0Var = (c8w0) onmVar;
            int i = c8w0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c8w0Var.c = i - Integer.MIN_VALUE;
            } else {
                c8w0Var = new c8w0(this, onmVar);
            }
        } else {
            c8w0Var = new c8w0(this, onmVar);
        }
        Object obj = c8w0Var.a;
        int i2 = c8w0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            c8w0Var.c = 1;
            objB = this.d.b(c8w0Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objB = ((e331) obj).a;
        }
        if (objB instanceof m231) {
            return objB;
        }
        try {
            List list = (List) objB;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Preset response must not be empty");
            }
            return new e8w0(list);
        } catch (Throwable th) {
            return new m231(th);
        }
    }
}
