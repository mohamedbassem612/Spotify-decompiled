package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uac implements o4l1 {
    public Object a = dbc.f16p;
    public ohd b;
    public final /* synthetic */ bbc c;

    public uac(bbc bbcVar) {
        this.c = bbcVar;
    }

    public final Object a(lnm lnmVar) throws Throwable {
        rge rgeVarK;
        Object obj = this.a;
        boolean z = true;
        if (obj == dbc.f16p || obj == dbc.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bbc.g;
            bbc bbcVar = this.c;
            rge rgeVar = (rge) atomicReferenceFieldUpdater.get(bbcVar);
            while (!bbcVar.C()) {
                long andIncrement = bbc.c.getAndIncrement(bbcVar);
                long j = dbc.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (rgeVar.e != j2) {
                    rgeVarK = bbcVar.k(j2, rgeVar);
                    if (rgeVarK == null) {
                        continue;
                    }
                } else {
                    rgeVarK = rgeVar;
                }
                Object objU = bbcVar.U(rgeVarK, i, andIncrement, null);
                jm jmVar = dbc.m;
                if (objU == jmVar) {
                    eg.m("unreachable");
                    return null;
                }
                jm jmVar2 = dbc.o;
                if (objU == jmVar2) {
                    if (andIncrement < bbcVar.v()) {
                        rgeVarK.b();
                    }
                    rgeVar = rgeVarK;
                } else {
                    if (objU == dbc.n) {
                        bbc bbcVar2 = this.c;
                        ohd ohdVarU = jzn1.u(aym.t(lnmVar));
                        try {
                            this.b = ohdVarU;
                            Object objU2 = bbcVar2.U(rgeVarK, i, andIncrement, this);
                            if (objU2 != jmVar) {
                                if (objU2 == jmVar2) {
                                    if (andIncrement < bbcVar2.v()) {
                                        rgeVarK.b();
                                    }
                                    rge rgeVar2 = (rge) bbc.g.get(bbcVar2);
                                    while (true) {
                                        if (bbcVar2.C()) {
                                            ohd ohdVar = this.b;
                                            ohdVar.getClass();
                                            this.b = null;
                                            this.a = dbc.l;
                                            Throwable thO = bbcVar.o();
                                            if (thO != null) {
                                                ohdVar.resumeWith(new m231(thO));
                                                break;
                                            }
                                            ohdVar.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = bbc.c.getAndIncrement(bbcVar2);
                                        long j3 = dbc.b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (rgeVar2.e != j4) {
                                            rge rgeVarK2 = bbcVar2.k(j4, rgeVar2);
                                            if (rgeVarK2 != null) {
                                                rgeVar2 = rgeVarK2;
                                            }
                                        }
                                        Object objU3 = bbcVar2.U(rgeVar2, i2, andIncrement2, this);
                                        if (objU3 == dbc.m) {
                                            bbcVar2.N(this, rgeVar2, i2);
                                            break;
                                        }
                                        if (objU3 == dbc.o) {
                                            if (andIncrement2 < bbcVar2.v()) {
                                                rgeVar2.b();
                                            }
                                        } else {
                                            if (objU3 == dbc.n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            rgeVar2.b();
                                            this.a = objU3;
                                            this.b = null;
                                        }
                                    }
                                } else {
                                    rgeVarK.b();
                                    this.a = objU2;
                                    this.b = null;
                                }
                                ohdVarU.f(yah0.m(true), null);
                                break;
                            }
                            bbcVar2.N(this, rgeVarK, i);
                            return ohdVarU.r();
                        } catch (Throwable th) {
                            ohdVarU.A();
                            throw th;
                        }
                    }
                    rgeVarK.b();
                    this.a = objU;
                }
            }
            this.a = dbc.l;
            Throwable thO2 = bbcVar.o();
            if (thO2 != null) {
                int i3 = cab1.a;
                throw thO2;
            }
            z = false;
        }
        return yah0.m(z);
    }

    @Override // p.o4l1
    public final void b(hp51 hp51Var, int i) {
        ohd ohdVar = this.b;
        if (ohdVar != null) {
            ohdVar.b(hp51Var, i);
        }
    }

    public final Object c() throws Throwable {
        Object obj = this.a;
        jm jmVar = dbc.f16p;
        if (obj == jmVar) {
            eg.m("`hasNext()` has not been invoked");
            return null;
        }
        this.a = jmVar;
        if (obj != dbc.l) {
            return obj;
        }
        Throwable thP = this.c.p();
        int i = cab1.a;
        throw thP;
    }
}
