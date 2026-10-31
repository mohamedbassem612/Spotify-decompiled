package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dlx0 extends x8c0 {
    public final Context b;
    public final o8n c;
    public final tac0 d;
    public final llm e;
    public final llm f;
    public g2z g;
    public vj70 h;
    public final clx0 i;

    public dlx0(tkx0 tkx0Var, Context context, o8n o8nVar) {
        this.b = context;
        this.c = o8nVar;
        this.d = new tac0(tkx0Var, true);
        fns fnsVar = igu.a;
        this.e = smo1.e(pyf0.a);
        this.f = smo1.e(o8nVar);
        this.i = new clx0(this);
    }

    @Override // p.x8c0
    public final void a(hac0 hac0Var) {
        c921.y(this.e, (o8n) null, 0, new rwm0(this, hac0Var, (lnm) null, (byte) 29), 3);
    }

    @Override // p.x8c0
    public final w8c0 b() {
        return this.d.i;
    }

    @Override // p.x8c0
    public final void d(hac0 hac0Var) {
        c921.y(this.e, (o8n) null, 0, new cqu0(this, hac0Var, (lnm) null, (byte) 21), 3);
    }

    public final void e(k8c0 k8c0Var) {
        c921.y(this.e, (o8n) null, 0, new cqu0(this, k8c0Var, (lnm) null, (byte) 20), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(onm onmVar) {
        alx0 alx0Var;
        if (onmVar instanceof alx0) {
            alx0Var = (alx0) onmVar;
            int i = alx0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                alx0Var.d = i - Integer.MIN_VALUE;
            } else {
                alx0Var = new alx0(this, onmVar);
            }
        } else {
            alx0Var = new alx0(this, onmVar);
        }
        Object objW = alx0Var.b;
        int i2 = alx0Var.d;
        vj70 vj70Var = null;
        try {
            if (i2 == 0) {
                hm5.M(objW);
                this.g = new g2z(this.b);
                c921.y(this.f, (o8n) null, 0, new zkx0(this, (lnm) null, (byte) 1), 3);
                g2z g2zVar = this.g;
                if (g2zVar != null) {
                    alx0Var.a = this;
                    alx0Var.d = 1;
                    objW = g2zVar.w(alx0Var);
                    d9n d9nVar = d9n.a;
                    if (objW == d9nVar) {
                        return d9nVar;
                    }
                }
                this.h = vj70Var;
                return rih1.a;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = alx0Var.a;
            hm5.M(objW);
            vj70Var = (vj70) objW;
            this.h = vj70Var;
        } catch (IllegalStateException unused) {
        }
        return rih1.a;
    }
}
