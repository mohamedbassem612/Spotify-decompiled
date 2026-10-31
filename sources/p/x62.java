package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x62 implements yte0 {
    public final w62 a;
    public final mik1 b;

    public x62(w62 w62Var, mik1 mik1Var) {
        this.a = w62Var;
        this.b = mik1Var;
    }

    public final void a() {
        w62 w62Var = this.a;
        xab1 xab1Var = (xab1) w62Var.h;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        w62Var.h = null;
        xab1 xab1Var2 = (xab1) w62Var.i;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        w62Var.i = null;
        xab1 xab1Var3 = (xab1) w62Var.j;
        if (xab1Var3 != null) {
            xab1Var3.d((CancellationException) null);
        }
        w62Var.j = null;
        this.b.a();
    }

    public final void b() {
        w62 w62Var = this.a;
        xab1 xab1Var = (xab1) w62Var.h;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        w62Var.h = null;
        fu20 fu20Var = new fu20(((qr20) w62Var.f).a(), new u62(w62Var, null, (byte) 0), (byte) 1);
        llm llmVar = (llm) w62Var.k;
        w62Var.h = l4p1.u(llmVar, fu20Var);
        boolean z = w62Var.b;
        xab1 xab1Var2 = (xab1) w62Var.j;
        if (!z) {
            if (xab1Var2 != null) {
                xab1Var2.d((CancellationException) null);
            }
            w62Var.j = null;
        } else if (xab1Var2 == null || !xab1Var2.isActive()) {
            w62Var.j = fn31.T(llmVar, (o8n) null, 0, new u62(w62Var, null, (byte) 1), 3);
        }
        this.b.b();
    }
}
