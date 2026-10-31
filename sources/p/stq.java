package p;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class stq {
    public final /* synthetic */ ttq a;

    public stq(ttq ttqVar) {
        this.a = ttqVar;
    }

    public final y9i1 a(String str, eaa0 eaa0Var, px10 px10Var, c490 c490Var, String str2) {
        jmq jmqVar = (jmq) this.a.c;
        z8i1 z8i1Var = (z8i1) jmqVar.a;
        g580 g580Var = (g580) z8i1Var.f.get();
        c8o.l(g580Var);
        xi61 xi61Var = (xi61) z8i1Var.g.get();
        c8o.l(xi61Var);
        q8n q8nVar = (q8n) z8i1Var.i.get();
        c8o.l(q8nVar);
        yse0 yse0Var = (yse0) z8i1Var.h.get();
        c8o.l(yse0Var);
        Context context = (Context) z8i1Var.p.get();
        c8o.l(context);
        ov20 ov20Var = (ov20) z8i1Var.r.get();
        c8o.l(ov20Var);
        vgr vgrVar = new vgr(g580Var, xi61Var, q8nVar, yse0Var, context, ov20Var, ((Boolean) z8i1Var.t.get()).booleanValue());
        kt91 kt91Var = (kt91) ((z8i1) jmqVar.a).k.get();
        c8o.l(kt91Var);
        q8n q8nVar2 = (q8n) ((z8i1) jmqVar.a).i.get();
        c8o.l(q8nVar2);
        q8n q8nVar3 = (q8n) ((z8i1) jmqVar.a).j.get();
        c8o.l(q8nVar3);
        l9i1 l9i1Var = (l9i1) ((z8i1) jmqVar.a).l.get();
        c8o.l(l9i1Var);
        uy10 uy10Var = (uy10) ((z8i1) jmqVar.a).m.get();
        c8o.l(uy10Var);
        z8i1 z8i1Var2 = (z8i1) jmqVar.a;
        Context context2 = (Context) z8i1Var2.p.get();
        c8o.l(context2);
        q8n q8nVar4 = (q8n) z8i1Var2.i.get();
        c8o.l(q8nVar4);
        fyh1 fyh1Var = new fyh1(context2, q8nVar4);
        z8i1 z8i1Var3 = (z8i1) jmqVar.a;
        Application application = (Application) z8i1Var3.b.get();
        c8o.l(application);
        e831 e831Var = (e831) z8i1Var3.d.get();
        c8o.l(e831Var);
        st60 st60Var = new st60(application, e831Var);
        a390 a390Var = (a390) ((z8i1) jmqVar.a).n.get();
        c8o.l(a390Var);
        boolean zBooleanValue = ((Boolean) ((z8i1) jmqVar.a).t.get()).booleanValue();
        ov20 ov20Var2 = (ov20) ((z8i1) jmqVar.a).r.get();
        c8o.l(ov20Var2);
        mr20 mr20Var = (mr20) ((z8i1) jmqVar.a).s.get();
        c8o.l(mr20Var);
        return new y9i1(vgrVar, kt91Var, q8nVar2, q8nVar3, l9i1Var, uy10Var, fyh1Var, st60Var, a390Var, zBooleanValue, ov20Var2, mr20Var, (ttq) jmqVar.c, str, eaa0Var, px10Var, c490Var, str2);
    }
}
