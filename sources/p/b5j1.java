package p;

import android.os.Bundle;
import android.view.ViewGroup;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b5j1 implements byf0 {
    public final lzn0 a;
    public final c5j1 b;
    public final kly0 c;
    public final q8n d;
    public final kly0 e;
    public final llm f;
    public xab1 g;
    public boolean h;

    public b5j1(lzn0 lzn0Var, c5j1 c5j1Var, gbp gbpVar, q8n q8nVar, q8n q8nVar2, gbp gbpVar2) {
        this.a = lzn0Var;
        this.b = c5j1Var;
        this.c = gbpVar;
        this.d = q8nVar;
        this.e = gbpVar2;
        this.f = smo1.e(flo1.l(op71.f(), q8nVar2));
    }

    public static final void a(b5j1 b5j1Var, boolean z, boolean z2) {
        b5j1Var.a.i(new dwn0(z ? d5j1.b.a : d5j1.a.a, "", z, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), mno1.h(new mmr0[]{new mmr0("has_expired", Boolean.valueOf(z2))}));
        b5j1Var.b.b = true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(k4j1 k4j1Var, onm onmVar) {
        a5j1 a5j1Var;
        if (onmVar instanceof a5j1) {
            a5j1Var = (a5j1) onmVar;
            int i = a5j1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                a5j1Var.c = i - Integer.MIN_VALUE;
            } else {
                a5j1Var = new a5j1(this, onmVar);
            }
        } else {
            a5j1Var = new a5j1(this, onmVar);
        }
        Object obj = a5j1Var.a;
        int i2 = a5j1Var.c;
        c5j1 c5j1Var = this.b;
        if (i2 == 0) {
            hm5.M(obj);
            if (!c5j1Var.a) {
                b0f1 b0f1Var = new b0f1(k4j1Var, (lnm) null, (byte) 28);
                a5j1Var.c = 1;
                Object objY = fn31.Y(this.d, b0f1Var, a5j1Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1.a;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        c5j1Var.a = true;
        return rih1.a;
    }

    public final void c() {
        if (this.h) {
            return;
        }
        this.g = fn31.T(this.f, (o8n) null, 0, new k6g1(this, (lnm) null, (byte) 23), 3);
    }

    public final void d() {
        xab1 xab1Var = this.g;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
    }

    public final void g(ViewGroup viewGroup) {
    }
}
