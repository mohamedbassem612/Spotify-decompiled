package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zgv0 implements yt90 {
    public final c9c0 a;
    public final fy91 b;
    public final mr20 c;
    public final ynb0 d;
    public final ynb0 e;
    public final llm f;

    public zgv0(c9c0 c9c0Var, fy91 fy91Var, mr20 mr20Var, ynb0 ynb0Var, ynb0 ynb0Var2, q8n q8nVar) {
        this.a = c9c0Var;
        this.b = fy91Var;
        this.c = mr20Var;
        this.d = ynb0Var;
        this.e = ynb0Var2;
        this.f = us71.h(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        vgv0 vgv0Var;
        eww0 m231Var;
        if (onmVar instanceof vgv0) {
            vgv0Var = (vgv0) onmVar;
            int i = vgv0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vgv0Var.c = i - Integer.MIN_VALUE;
            } else {
                vgv0Var = new vgv0(this, onmVar);
            }
        } else {
            vgv0Var = new vgv0(this, onmVar);
        }
        Object objO = vgv0Var.a;
        int i2 = vgv0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                f3t0 f3t0Var = new f3t0(this, str, (lnm) null, (byte) 26);
                vgv0Var.c = 1;
                objO = rc2.O(1000L, f3t0Var, vgv0Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objO);
            }
            m231Var = (eww0) objO;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            return null;
        }
        return m231Var;
    }

    public final void start() {
        fn31.T(this.f, (o8n) null, 0, new f3t0(this, (lnm) null, (byte) 27), 3);
    }

    public final void stop() {
        op71.q(this.f.a, (CancellationException) null);
    }
}
