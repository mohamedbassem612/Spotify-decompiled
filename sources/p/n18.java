package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n18 {
    public final Context a;
    public final a1r0 b;
    public final hrj0 c;
    public final h28 d;
    public long e;

    public n18(Context context, a1r0 a1r0Var, hrj0 hrj0Var, h28 h28Var) {
        this.a = context;
        this.b = a1r0Var;
        this.c = hrj0Var;
        this.d = h28Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, onm onmVar) {
        m18 m18Var;
        if (onmVar instanceof m18) {
            m18Var = (m18) onmVar;
            int i = m18Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                m18Var.d = i - Integer.MIN_VALUE;
            } else {
                m18Var = new m18(this, onmVar);
            }
        } else {
            m18Var = new m18(this, onmVar);
        }
        Object objI = m18Var.b;
        int i2 = m18Var.d;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objI);
            m441 m441Var = new m441(new d7i0((Object) this.c, lnmVar, (byte) 12));
            m18Var.a = j;
            m18Var.d = 1;
            objI = b5p1.i(m441Var, m18Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = m18Var.a;
            hm5.M(objI);
        }
        return new g2h0(j, ((grj0) objI).a && x74.j(this.a, "android.permission.RECORD_AUDIO") == 0);
    }

    public final void b(long j) {
        if (j <= this.e || ((Number) this.d.a.getValue()).longValue() >= j) {
            return;
        }
        this.e = j;
        this.c.a();
        a1r0.j(this.b, nik1.D4.a, (String) null, l0p1.q(brj0.c), true, 2);
    }
}
