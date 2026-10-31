package p;

import com.spotify.martini.martinidata.model.Mode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a9m {
    public final toj0 a;
    public final ay10 b;
    public final xw10 c;

    public a9m(toj0 toj0Var, ay10 ay10Var, xw10 xw10Var) {
        this.a = toj0Var;
        this.b = ay10Var;
        this.c = xw10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, lik1 lik1Var, Mode mode, onm onmVar) {
        x8m x8mVar;
        if (onmVar instanceof x8m) {
            x8mVar = (x8m) onmVar;
            int i = x8mVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                x8mVar.f = i - Integer.MIN_VALUE;
            } else {
                x8mVar = new x8m(this, onmVar);
            }
        } else {
            x8mVar = new x8m(this, onmVar);
        }
        Object objI = x8mVar.d;
        int i2 = x8mVar.f;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            r8m r8mVarN = this.a.n(mode);
            x8mVar.a = str;
            x8mVar.b = lik1Var;
            x8mVar.f = 1;
            objI = r8mVarN.i(str, x8mVar);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj = x8mVar.c;
            hm5.M(objI);
            return obj;
        }
        lik1Var = x8mVar.b;
        str = x8mVar.a;
        hm5.M(objI);
        if (((q8m) objI) instanceof p8m) {
            this.b.a.put(str, zx10.c);
            x8mVar.a = null;
            x8mVar.b = null;
            x8mVar.c = objI;
            x8mVar.f = 2;
            Object objEmit = ((sen0) this.c.a.computeIfAbsent(str, azt.c)).emit(new mmr0(lik1Var, (Object) null), x8mVar);
            if (objEmit != d9nVar) {
                objEmit = rih1.a;
            }
            if (objEmit == d9nVar) {
                return d9nVar;
            }
        }
        return objI;
    }

    public final Object b(String str, lik1 lik1Var, cy10 cy10Var, onm onmVar) {
        zx10 zx10Var;
        int iOrdinal = cy10Var.ordinal();
        if (iOrdinal == 0) {
            zx10Var = zx10.a;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            zx10Var = zx10.b;
        }
        this.b.a.put(str, zx10Var);
        Object objEmit = ((sen0) this.c.a.computeIfAbsent(str, azt.c)).emit(new mmr0(lik1Var, cy10Var), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objEmit != d9nVar) {
            objEmit = rih1Var;
        }
        return objEmit == d9nVar ? objEmit : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(o5o0 o5o0Var, lik1 lik1Var, Mode mode, onm onmVar) {
        y8m y8mVar;
        if (onmVar instanceof y8m) {
            y8mVar = (y8m) onmVar;
            int i = y8mVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                y8mVar.f = i - Integer.MIN_VALUE;
            } else {
                y8mVar = new y8m(this, onmVar);
            }
        } else {
            y8mVar = new y8m(this, onmVar);
        }
        Object objJ = y8mVar.d;
        int i2 = y8mVar.f;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ);
            r8m r8mVarN = this.a.n(mode);
            y8mVar.a = o5o0Var;
            y8mVar.b = lik1Var;
            y8mVar.f = 1;
            objJ = r8mVarN.j(o5o0Var, y8mVar);
            if (objJ != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = y8mVar.c;
            hm5.M(objJ);
            return obj2;
        }
        lik1Var = y8mVar.b;
        o5o0Var = y8mVar.a;
        hm5.M(objJ);
        if (((q8m) objJ) instanceof p8m) {
            String str = o5o0Var.a;
            y8mVar.a = null;
            y8mVar.b = null;
            y8mVar.c = objJ;
            y8mVar.f = 2;
            if (b(str, lik1Var, cy10.b, y8mVar) == obj) {
                return obj;
            }
        }
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, lik1 lik1Var, Mode mode, onm onmVar) {
        z8m z8mVar;
        if (onmVar instanceof z8m) {
            z8mVar = (z8m) onmVar;
            int i = z8mVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                z8mVar.f = i - Integer.MIN_VALUE;
            } else {
                z8mVar = new z8m(this, onmVar);
            }
        } else {
            z8mVar = new z8m(this, onmVar);
        }
        Object objF = z8mVar.d;
        int i2 = z8mVar.f;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objF);
            r8m r8mVarN = this.a.n(mode);
            z8mVar.a = str;
            z8mVar.b = lik1Var;
            z8mVar.f = 1;
            objF = r8mVarN.f(str, z8mVar);
            if (objF != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = z8mVar.c;
            hm5.M(objF);
            return obj2;
        }
        lik1Var = z8mVar.b;
        str = z8mVar.a;
        hm5.M(objF);
        if (((q8m) objF) instanceof p8m) {
            z8mVar.a = null;
            z8mVar.b = null;
            z8mVar.c = objF;
            z8mVar.f = 2;
            if (b(str, lik1Var, cy10.a, z8mVar) == obj) {
                return obj;
            }
        }
        return objF;
    }
}
