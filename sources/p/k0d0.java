package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k0d0 implements yzc0 {
    public final String a;
    public final t8r0 b;
    public final ur00 c;
    public final qkm d;
    public final q8n e;
    public xab1 f;
    public t4u0 g;
    public final h6a h;

    public k0d0(String str, t4u0 t4u0Var, t8r0 t8r0Var, ur00 ur00Var, qkm qkmVar, q8n q8nVar) {
        this.a = str;
        this.b = t8r0Var;
        this.c = ur00Var;
        this.d = qkmVar;
        this.e = q8nVar;
        this.g = t4u0Var;
        this.h = (h6a) t8r0Var.b;
    }

    @Override // p.yzc0
    public final mr20 a() {
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.yzc0
    public final Object b(tv80 tv80Var, yjp1 yjp1Var, onm onmVar) {
        h0d0 h0d0Var;
        tv80 tv80Var2;
        k0d0 k0d0Var;
        if (onmVar instanceof h0d0) {
            h0d0Var = (h0d0) onmVar;
            int i = h0d0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                h0d0Var.f = i - Integer.MIN_VALUE;
            } else {
                h0d0Var = new h0d0(this, onmVar);
            }
        } else {
            h0d0Var = new h0d0(this, onmVar);
        }
        Object objF = h0d0Var.d;
        int i2 = h0d0Var.f;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objF);
            h0d0Var.a = tv80Var;
            h0d0Var.b = yjp1Var;
            h0d0Var.c = this;
            h0d0Var.f = 1;
            qkm qkmVar = this.d;
            objF = qkmVar.f(qkmVar.b(tv80Var), h0d0Var);
            if (objF != d9nVar) {
                tv80Var2 = tv80Var;
                k0d0Var = this;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objF);
                return objF;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k0d0Var = h0d0Var.c;
        yjp1Var = h0d0Var.b;
        tv80 tv80Var3 = h0d0Var.a;
        hm5.M(objF);
        tv80Var2 = tv80Var3;
        l24 l24Var = new l24((Object) this, (Object) tv80Var2, (Object) yjp1Var, (lnm) null, (byte) 10);
        h0d0Var.a = null;
        h0d0Var.b = null;
        h0d0Var.c = null;
        h0d0Var.f = 2;
        Object objN = k0d0Var.n((Boolean) objF, l24Var, h0d0Var);
        return objN == d9nVar ? d9nVar : objN;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.yzc0
    public final Object c(String str, onm onmVar) {
        i0d0 i0d0Var;
        String str2;
        k0d0 k0d0Var;
        if (onmVar instanceof i0d0) {
            i0d0Var = (i0d0) onmVar;
            int i = i0d0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0d0Var.e = i - Integer.MIN_VALUE;
            } else {
                i0d0Var = new i0d0(this, onmVar);
            }
        } else {
            i0d0Var = new i0d0(this, onmVar);
        }
        Object objF = i0d0Var.c;
        int i2 = i0d0Var.e;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objF);
            i0d0Var.a = str;
            i0d0Var.b = this;
            i0d0Var.e = 1;
            qkm qkmVar = this.d;
            objF = qkmVar.f(qkmVar.a(str), i0d0Var);
            if (objF != d9nVar) {
                str2 = str;
                k0d0Var = this;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objF);
                return objF;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k0d0Var = i0d0Var.b;
        str2 = i0d0Var.a;
        hm5.M(objF);
        fpo fpoVar = new fpo(this, str2, (lnm) null, (byte) 17);
        i0d0Var.a = null;
        i0d0Var.b = null;
        i0d0Var.e = 2;
        Object objN = k0d0Var.n((Boolean) objF, fpoVar, i0d0Var);
        return objN == d9nVar ? d9nVar : objN;
    }

    @Override // p.yzc0
    public final Object d(wzc0 wzc0Var, String str, onm onmVar) {
        Object objW = this.c.w(this.a, new vsc0(wzc0Var), str, this.g, onmVar);
        return objW == d9n.a ? objW : rih1.a;
    }

    @Override // p.yzc0
    public final Object e(String str, onm onmVar) {
        qkm qkmVar = this.d;
        return qkmVar.d(qkmVar.a(str), onmVar);
    }

    @Override // p.yzc0
    public final trc0 f() {
        return ur00.h(this.g);
    }

    @Override // p.yzc0
    public final Object g(String str, onm onmVar) {
        qkm qkmVar = this.d;
        return qkmVar.c(qkmVar.a(str), onmVar);
    }

    @Override // p.yzc0
    public final Object h(wzc0 wzc0Var, tv80 tv80Var, yjp1 yjp1Var, onm onmVar) {
        Object objX = this.c.x(this.a, new vsc0(wzc0Var), tv80Var, yjp1Var, this.g, onmVar);
        return objX == d9n.a ? objX : rih1.a;
    }

    @Override // p.yzc0
    public final Object i(tv80 tv80Var, onm onmVar) {
        qkm qkmVar = this.d;
        return qkmVar.c(qkmVar.b(tv80Var), onmVar);
    }

    @Override // p.yzc0
    public final mr20 j() {
        qkm qkmVar = this.d;
        return rqt0.u(new m441(new hff(qkmVar.b, (lnm) null, qkmVar, (byte) 23)));
    }

    @Override // p.yzc0
    public final Object k(tv80 tv80Var, onm onmVar) {
        qkm qkmVar = this.d;
        return qkmVar.d(qkmVar.b(tv80Var), onmVar);
    }

    @Override // p.yzc0
    public final Object l(String str, tv80 tv80Var, onm onmVar) {
        qkm qkmVar = this.d;
        Object objE = qkmVar.e(str, qkmVar.b(tv80Var), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objE != d9nVar) {
            objE = rih1Var;
        }
        return objE == d9nVar ? objE : rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(Boolean bool, iu30 iu30Var, onm onmVar) {
        j0d0 j0d0Var;
        if (onmVar instanceof j0d0) {
            j0d0Var = (j0d0) onmVar;
            int i = j0d0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j0d0Var.c = i - Integer.MIN_VALUE;
            } else {
                j0d0Var = new j0d0(this, onmVar);
            }
        } else {
            j0d0Var = new j0d0(this, onmVar);
        }
        Object obj = j0d0Var.a;
        int i2 = j0d0Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            if (bool != null) {
                return bool;
            }
            j0d0Var.c = 1;
            Object objInvoke = iu30Var.invoke(j0d0Var);
            d9n d9nVar = d9n.a;
            if (objInvoke == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return Boolean.TRUE;
    }
}
