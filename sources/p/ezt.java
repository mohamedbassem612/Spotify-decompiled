package p;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ezt implements a4l {
    public final ynb0 a;
    public final g0l b;
    public final pyt c;
    public final fzt d;
    public final jd4 e;
    public final llm g;
    public final idd1 f = new idd1(new ots(this, (byte) 24));
    public final bpb1 h = gio1.b((Object) null);
    public final ConcurrentHashMap i = new ConcurrentHashMap();
    public final ConcurrentHashMap t = new ConcurrentHashMap();
    public final ConcurrentHashMap X = new ConcurrentHashMap();

    public ezt(ynb0 ynb0Var, q8n q8nVar, g0l g0lVar, pyt pytVar, fzt fztVar, jd4 jd4Var) {
        this.a = ynb0Var;
        this.b = g0lVar;
        this.c = pytVar;
        this.d = fztVar;
        this.e = jd4Var;
        this.g = l1d.x(q8nVar);
    }

    public static iib g(ezt eztVar, String str) {
        bpb1 bpb1Var = eztVar.h;
        oxt oxtVar = oxt.a;
        return u4p1.a0(u4p1.b0(rqt0.u(new vyt(bpb1Var, eztVar, oxtVar, (byte) 1)), new gke(eztVar, str, oxtVar, (lnm) null, (byte) 27)), new qr0(eztVar, str, oxtVar, (lnm) null));
    }

    public static nzt j(szt sztVar, oxt oxtVar) {
        Map mapA;
        if (sztVar == null || (mapA = sztVar.b().a()) == null) {
            return null;
        }
        return (nzt) mapA.get(oxtVar);
    }

    @Override // p.a4l
    public final void a() {
        if (this.e.c()) {
            ConcurrentHashMap concurrentHashMap = this.t;
            List listL1 = o7h.l1(concurrentHashMap.values());
            concurrentHashMap.clear();
            ConcurrentHashMap concurrentHashMap2 = this.X;
            for (faa0 faa0Var : concurrentHashMap2.values()) {
                faa0Var.getClass();
                faa0Var.d((CancellationException) null);
            }
            concurrentHashMap2.clear();
            op71.r(this.g.a);
            this.h.l((Object) null);
            Iterator it = listL1.iterator();
            if (it.hasNext()) {
                pze0.m(it.next());
                throw null;
            }
        }
    }

    @Override // p.a4l
    public final void b() {
        if (this.e.c()) {
            bu buVar = new bu(this, (lnm) null, (byte) 12);
            llm llmVar = this.g;
            c921.y(llmVar, (o8n) null, 0, buVar, 3);
            for (oxt oxtVar : oxt.c) {
                l4p1.u(llmVar, f5p1.q(rqt0.u(new vyt(this.h, this, oxtVar, (byte) 2)), new gke(this, oxtVar, (lnm) null, (byte) 28)));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
    
        if (r0 == r13) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if (r0 == r13) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(p.oxt r16, java.lang.Long r17, p.onm r18) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ezt.c(p.oxt, java.lang.Long, p.onm):java.lang.Object");
    }

    public final void d(String str, oxt oxtVar) {
        nzt nztVarJ;
        if (str.length() == 0 || (nztVarJ = j((szt) this.h.getValue(), oxtVar)) == null) {
            return;
        }
        this.d.a(nztVarJ.c(), nztVarJ.a(), k4p1.x(str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, oxt oxtVar, Long l, iu30 iu30Var, onm onmVar) {
        bzt bztVar;
        if (onmVar instanceof bzt) {
            bztVar = (bzt) onmVar;
            int i = bztVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bztVar.f = i - Integer.MIN_VALUE;
            } else {
                bztVar = new bzt(this, onmVar);
            }
        } else {
            bztVar = new bzt(this, onmVar);
        }
        Object objC = bztVar.d;
        int i2 = bztVar.f;
        if (i2 == 0) {
            hm5.M(objC);
            bztVar.a = str;
            bztVar.b = oxtVar;
            bztVar.c = (hab0) iu30Var;
            bztVar.f = 1;
            objC = c(oxtVar, l, bztVar);
            d9n d9nVar = d9n.a;
            if (objC == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iu30Var = (iu30) bztVar.c;
            oxtVar = bztVar.b;
            str = bztVar.a;
            hm5.M(objC);
        }
        iu30 iu30Var2 = iu30Var;
        bxt bxtVar = (bxt) objC;
        if (bxtVar == null) {
            return null;
        }
        d(str, oxtVar);
        faa0 faa0VarY = c921.y(this.g, (o8n) null, 0, new swn(this, iu30Var2, bxtVar, bxtVar.d(), (lnm) null), 3);
        faa0 faa0Var = (faa0) this.X.put(new qyt(str, oxtVar), faa0VarY);
        if (faa0Var != null) {
            faa0Var.d((CancellationException) null);
        }
        return bxtVar;
    }
}
