package p;

import com.spotify.hovercraftasr.v1.a;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ty60 {
    public static final WeakHashMap q = new WeakHashMap();
    public static final /* synthetic */ int r = 0;
    public final g38 a;
    public final boolean b;
    public volatile Object f;
    public final d6a1 h;
    public final ev81 i;
    public final llm j;
    public final g38 k;
    public llm l;
    public final bpb1 m;
    public final jge n;
    public final bpb1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f118p;
    public final AtomicReference c = new AtomicReference(null);
    public final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();
    public final xgn0 e = ygn0.a();
    public mr20 g = r6x.a;

    public ty60(d6a1 d6a1Var, ev81 ev81Var, llm llmVar, g38 g38Var, boolean z) {
        this.a = g38Var;
        this.b = z;
        this.h = d6a1Var;
        this.i = ev81Var;
        this.j = llmVar;
        this.k = g38Var;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.m = bpb1VarB;
        this.n = hu20.e(bpb1VarB, new i64((byte) 12));
        this.o = gio1.b(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
    
        if (r10 == r1) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object f(p.ty60 r9, p.onm r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ty60.f(p.ty60, p.onm):java.lang.Object");
    }

    public final Object a(onm onmVar) {
        Object objY = fn31.Y(geo0.b, new h38(this, (lnm) null), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }

    public final void b() {
        List listC;
        c9n c9nVar = this.l;
        if (c9nVar != null) {
            if (!op71.z(((llm) c9nVar).a).isActive()) {
                c9nVar = null;
            }
            if (c9nVar == null) {
                return;
            }
            this.o.m((Object) null, Boolean.FALSE);
            d(k57.c);
            g();
            smo1.q(c9nVar);
            at71 at71Var = (at71) this.m.getValue();
            if (at71Var == null || (listC = at71Var.c()) == null || !listC.isEmpty()) {
                return;
            }
            this.h.a();
        }
    }

    public final boolean c(Object obj) {
        boolean z;
        WeakHashMap weakHashMap = q;
        synchronized (weakHashMap) {
            try {
                if (this.f == obj) {
                    this.f = null;
                }
                if (weakHashMap.get(this.a) == obj) {
                    weakHashMap.remove(this.a);
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final void d(k57 k57Var) {
        if (this.f118p) {
            return;
        }
        this.f118p = true;
        ev81 ev81Var = this.i;
        if (ev81Var.f != null) {
            a aVarB = ev81Var.b();
            aVarB.r();
            aVarB.v(k57Var);
            rhc rhcVarC = fap1.c(aVarB);
            ig01 ig01Var = ev81Var.f;
            if (ig01Var == null) {
                u890.C("webSocket");
                throw null;
            }
            ig01Var.f(2, rhcVarC);
        }
        if (k57Var == k57.b) {
            this.o.m((Object) null, Boolean.TRUE);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(lnm lnmVar) throws Exception {
        py60 py60Var;
        o8n o8nVar;
        llm llmVarE;
        ve01 ve01VarR;
        llm llmVar;
        if (lnmVar instanceof py60) {
            py60Var = (py60) lnmVar;
            int i = py60Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                py60Var.e = i - Integer.MIN_VALUE;
            } else {
                py60Var = new py60(this, (onm) lnmVar);
            }
        } else {
            py60Var = new py60(this, (onm) lnmVar);
        }
        Object obj = py60Var.c;
        int i2 = py60Var.e;
        sua suaVar = ey71.a;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                llm llmVar2 = this.l;
                if (llmVar2 != null && (o8nVar = llmVar2.a) != null) {
                    faa0 faa0VarZ = op71.z(o8nVar);
                    py60Var.e = 1;
                    if (op71.p(faa0VarZ, py60Var) != d9nVar) {
                    }
                }
                return d9nVar;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ve01VarR = py60Var.b;
                llmVar = py60Var.a;
                try {
                    hm5.M(obj);
                    c921.y(llmVar, (o8n) null, 4, new p1r(this, (lnm) null, (byte) 26), 1);
                    this.m.m((Object) null, d5p1.r(f5p1.q(hu20.d(new mr20[]{ve01VarR, x4p1.h(h4p1.l(new x060(this, ve01VarR, (lnm) null, (byte) 9)), new rf2((byte) 20)), new ry50(this.g, (byte) 4)}), new i38(this, (lnm) null, (byte) 2)), llmVar, suaVar, Integer.MAX_VALUE));
                    c921.y(llmVar, (o8n) null, 0, new x060(this, llmVar, (lnm) null, (byte) 8), 3);
                    return rih1.a;
                } catch (Exception e) {
                    e = e;
                    smo1.q(llmVar);
                    throw e;
                }
            }
            hm5.M(obj);
            py60Var.a = llmVarE;
            py60Var.b = ve01VarR;
            py60Var.e = 2;
            if (f(this, (onm) py60Var) != d9nVar) {
                llmVar = llmVarE;
                c921.y(llmVar, (o8n) null, 4, new p1r(this, (lnm) null, (byte) 26), 1);
                this.m.m((Object) null, d5p1.r(f5p1.q(hu20.d(new mr20[]{ve01VarR, x4p1.h(h4p1.l(new x060(this, ve01VarR, (lnm) null, (byte) 9)), new rf2((byte) 20)), new ry50(this.g, (byte) 4)}), new i38(this, (lnm) null, (byte) 2)), llmVar, suaVar, Integer.MAX_VALUE));
                c921.y(llmVar, (o8n) null, 0, new x060(this, llmVar, (lnm) null, (byte) 8), 3);
                return rih1.a;
            }
            return d9nVar;
        } catch (Exception e2) {
            e = e2;
            llmVar = llmVarE;
            smo1.q(llmVar);
            throw e;
        }
        o8n o8nVar2 = this.j.a;
        llmVarE = smo1.e(o8nVar2.y(op71.e(op71.z(o8nVar2))));
        this.l = llmVarE;
        this.f118p = false;
        Boolean boolM = yah0.m(false);
        bpb1 bpb1Var = this.o;
        bpb1Var.m((Object) null, boolM);
        ve01VarR = d5p1.r(hu20.d(new mr20[]{f5p1.q(this.h.b(this.i), new y160(this, (lnm) null, (byte) 4)), hu20.e(bpb1Var, new i64((byte) 11))}), llmVarE, suaVar, Integer.MAX_VALUE);
    }

    public final void g() {
        Object obj = this.f;
        if (obj != null && c(obj)) {
            this.a.l.p();
            this.a.c(false);
        }
        d38 d38Var = (d38) this.c.getAndSet(null);
        if (d38Var != null) {
            this.d.add(d38Var);
        }
        this.g = r6x.a;
    }
}
