package p;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w5b0 implements anc0, mqb1 {
    public static final o3r h;
    public static final o3r i;
    public static final o3r j;
    public static final i13 k;
    public final d0r a;
    public final koc0 b;
    public final gq4 c;
    public boolean d;
    public xab1 e;
    public ayh f;
    public final llm g;

    static {
        jd11 jd11Var = rc11.a;
        h = w3p1.o(new l4r(new wlu(jd11Var.b(jo70.class)), 1, t5b0.t, new j4r(t5b0.f), t5b0.X), t5b0.g);
        i = w3p1.o(new l4r(new wlu(jd11Var.b(xkk1.class)), 1, t5b0.Y, new j4r(t5b0.h), t5b0.Z), t5b0.i);
        j = w3p1.o(new l4r(new wlu(jd11Var.b(hll.class)), 1, t5b0.N0, new j4r(t5b0.d), t5b0.O0), t5b0.e);
        k = i13.n;
    }

    public w5b0(d0r d0rVar, koc0 koc0Var, q8n q8nVar, gq4 gq4Var) {
        this.a = d0rVar;
        this.b = koc0Var;
        this.c = gq4Var;
        this.g = us71.h(q8nVar);
    }

    @Override // p.anc0
    public final void a() {
        xab1 xab1Var = this.e;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.e = null;
        this.f = null;
        smo1.p(this.g, (CancellationException) null);
    }

    @Override // p.anc0
    public final void b() {
        gq4 gq4Var = this.c;
        if (gq4Var.b() > 0 && gq4Var.a() > 0 && !this.d) {
            this.d = true;
            ayh ayhVarA = sap1.a();
            this.f = ayhVarA;
            this.e = fn31.T(this.g, (o8n) null, 0, new ss90(this, ayhVarA, null, (byte) 6), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(int i2, onm onmVar) {
        u5b0 u5b0Var;
        if (onmVar instanceof u5b0) {
            u5b0Var = (u5b0) onmVar;
            int i3 = u5b0Var.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u5b0Var.d = i3 - Integer.MIN_VALUE;
            } else {
                u5b0Var = new u5b0(this, onmVar);
            }
        } else {
            u5b0Var = new u5b0(this, onmVar);
        }
        Object objJ = u5b0Var.b;
        int i4 = u5b0Var.d;
        if (i4 == 0) {
            hm5.M(objJ);
            any anyVarC = ((roc0) this.b).c();
            s5x s5xVar = new s5x(i2, (lnm) null, (byte) 2);
            u5b0Var.a = i2;
            u5b0Var.d = 1;
            objJ = b5p1.j(anyVarC, s5xVar, u5b0Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i4 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = u5b0Var.a;
            hm5.M(objJ);
        }
        m7e0 m7e0Var = (m7e0) objJ;
        if (m7e0Var.a == 0) {
            return z6x.a;
        }
        List listD1 = o7h.d1(m7e0Var.b, i2);
        ArrayList arrayList = new ArrayList(q7h.U(listD1, 10));
        Iterator it = listD1.iterator();
        while (it.hasNext()) {
            arrayList.add(((l7e0) it.next()).getUri());
        }
        return arrayList;
    }

    @Override // p.mqb1
    public final void e(Bundle bundle) {
        this.d = bundle != null ? bundle.getBoolean("kodiak_prefetch_has_prefetched") : false;
    }

    @Override // p.mqb1
    public final void f(Bundle bundle) {
        bundle.putBoolean("kodiak_prefetch_has_prefetched", this.d);
    }

    @Override // p.anc0
    public final Object h(l8t0 l8t0Var) {
        ayh ayhVar;
        int iB = this.c.b();
        if (iB <= 0 || (ayhVar = this.f) == null) {
            return rih1.a;
        }
        ytw0 ytw0Var = jfv.b;
        return rc2.P(fdg1.k0(iB, ngv.d), new c38(ayhVar, (lnm) null, (byte) 4), l8t0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void i(int i2, ayh ayhVar, onm onmVar) {
        v5b0 v5b0Var;
        if (onmVar instanceof v5b0) {
            v5b0Var = (v5b0) onmVar;
            int i3 = v5b0Var.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v5b0Var.c = i3 - Integer.MIN_VALUE;
            } else {
                v5b0Var = new v5b0(this, onmVar);
            }
        } else {
            v5b0Var = new v5b0(this, onmVar);
        }
        Object obj = v5b0Var.a;
        int i4 = v5b0Var.c;
        if (i4 == 0) {
            hm5.M(obj);
            tc1 tc1Var = new tc1(this, i2, (zxh) ayhVar, (lnm) null);
            v5b0Var.c = 1;
            if (smo1.s(tc1Var, v5b0Var) == d9n.a) {
                return;
            }
        } else {
            if (i4 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            hm5.M(obj);
        }
        jah.d();
    }

    @Override // p.anc0
    public final void n() {
    }
}
