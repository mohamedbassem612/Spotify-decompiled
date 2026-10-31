package p;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class v4g1 {
    public final q8n a;
    public final q8n b;
    public final yqg c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final dt71 f;
    public final dt71 g;
    public volatile gia h;

    public v4g1(q8n q8nVar, q8n q8nVar2, zwz0 zwz0Var, gal galVar, yqg yqgVar, boolean z) {
        this.a = q8nVar;
        this.b = q8nVar2;
        this.c = yqgVar;
        llm llmVarE = smo1.e(ilo1.B(q8nVar, new z8n("OkHttpTrafficMonitorInterceptor")).y(guo1.B()));
        this.f = mgo1.e(0, 64, 0, 4);
        this.g = mgo1.d(0, 1024, 2);
        this.h = gia.c;
        l4p1.u(llmVarE, f5p1.q(rqt0.u(zwz0Var.d()), new xw0(this, galVar, null, (byte) 13)));
        if (z) {
            c921.y(llmVarE, (o8n) null, 0, new b0f1(this, (lnm) null, (byte) 6), 3);
        }
    }

    public final void a(i4g1 i4g1Var, iu30 iu30Var) {
        boolean z;
        p811 p811Var = new p811();
        p811 p811Var2 = new p811();
        this.d.computeIfPresent(i4g1Var, new t4g1(iu30Var, this, p811Var, p811Var2));
        r4g1 r4g1Var = (r4g1) p811Var.a;
        if (r4g1Var == null) {
            return;
        }
        iu30 iu30Var2 = (iu30) this.e.remove(i4g1Var);
        boolean z2 = r4g1Var instanceof n4g1;
        if (z2 && iu30Var2 != null) {
            iu30Var2.invoke(((n4g1) r4g1Var).e);
        }
        n270 n270Var = (n270) i4g1Var.a.b.c(n270.class);
        j4g1 j4g1Var = null;
        List<m270> listA = n270Var != null ? n270Var.a() : null;
        if (listA == null) {
            listA = z6x.a;
        }
        if (listA.isEmpty()) {
            return;
        }
        Object obj = p811Var2.a;
        if (obj == null) {
            eg.m("Required value was null.");
            return;
        }
        mxc mxcVar = ((gxc) obj).b;
        jf01 jf01Var = i4g1Var.a;
        ln21 ln21Var = mxcVar.e;
        if (ln21Var == null) {
            ln21Var = jf01Var.b;
        }
        v360 v360Var = mxcVar.f;
        if (z2) {
            j4g1Var = ((n4g1) r4g1Var).e;
        } else if (r4g1Var instanceof m4g1) {
            j4g1Var = ((m4g1) r4g1Var).f;
        }
        st60 st60Var = new st60(ln21Var, v360Var, j4g1Var, (byte) 3);
        synchronized (mxcVar) {
            z = mxcVar.j;
            if (z) {
                mxcVar.k = st60Var;
            }
        }
        if (z) {
            return;
        }
        for (m270 m270Var : listA) {
            try {
                m270Var.a(i4g1Var.a, st60Var);
            } catch (Exception e) {
                n57.t("HttpCallListener " + m270Var.getClass().getName() + " threw", e);
            }
        }
    }

    public final void b(i4g1 i4g1Var, iu30 iu30Var) {
        this.d.computeIfPresent(i4g1Var, new fnq0(iu30Var, (byte) 2));
    }

    public final void c(i4g1 i4g1Var, iu30 iu30Var) {
        b(i4g1Var, new b1c1(iu30Var, (byte) 29));
    }
}
