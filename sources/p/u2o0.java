package p;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u2o0 implements a4l {
    public final iur a;
    public final v4o0 b;
    public final eur c;
    public final q8n d;
    public final Context e;
    public c9n f;
    public String g;

    public u2o0(iur iurVar, v4o0 v4o0Var, eur eurVar, Context context, q8n q8nVar) {
        this.a = iurVar;
        this.b = v4o0Var;
        this.c = eurVar;
        this.d = q8nVar;
        this.e = context.getApplicationContext();
        this.f = cy30.t(q8nVar);
    }

    public final void a() {
        smo1.q(this.f);
        String str = this.g;
        if (str != null) {
            this.c.a(str);
            this.g = null;
        }
    }

    public final void b() {
        if (Build.VERSION.SDK_INT > 36) {
            c9n c9nVarV = qmo1.v(this.f, new ivn0(this, (byte) 4));
            this.f = c9nVarV;
            l4p1.u(c9nVarV, f5p1.q(this.a.b, new oy3(this, (lnm) null, (byte) 11)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        s2o0 s2o0Var;
        r2o0 r2o0Var;
        if (onmVar instanceof s2o0) {
            s2o0Var = (s2o0) onmVar;
            int i = s2o0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s2o0Var.c = i - Integer.MIN_VALUE;
            } else {
                s2o0Var = new s2o0(this, onmVar);
            }
        } else {
            s2o0Var = new s2o0(this, onmVar);
        }
        Object objI = s2o0Var.a;
        int i2 = s2o0Var.c;
        rih1 rih1Var = rih1.a;
        if (i2 == 0) {
            hm5.M(objI);
            if (this.g == null) {
                mr20 mr20Var = this.b.g;
                s2o0Var.c = 1;
                objI = b5p1.i(mr20Var, s2o0Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objI);
        k4o0 k4o0Var = (m4o0) objI;
        if (k4o0Var instanceof k4o0) {
            k4o0 k4o0Var2 = k4o0Var;
            boolean z = k4o0Var2 instanceof i4o0;
            Context context = this.e;
            if (z) {
                r2o0Var = new r2o0(2131952960, new uvi0(context.getString(2131952957), new t2o0(this, (byte) 1)));
            } else {
                if (!(k4o0Var2 instanceof j4o0)) {
                    eg.o();
                    return null;
                }
                r2o0Var = new r2o0(2131952959, new tvi0(context.getString(2131952958), new t2o0(this, (byte) 2)));
            }
            this.g = this.c.b(new fwi0(ywi0.e, context.getString(2131952961), context.getString(r2o0Var.a()), r2o0Var.b(), 80), new t2o0(this, (byte) 0));
            return rih1Var;
        }
        return rih1Var;
    }
}
