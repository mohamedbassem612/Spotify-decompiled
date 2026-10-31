package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y011 implements ne11 {
    public s2t a;
    public boolean b;
    public final xgn0 c = ygn0.a();

    public final void a() {
        this.b = true;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(l8t0 l8t0Var, onm onmVar) throws Throwable {
        x011 x011Var;
        vgn0 vgn0Var;
        int i;
        vgn0 vgn0Var2;
        s2t s2tVar;
        w011 m7y0Var;
        l111 m231Var;
        Object objA;
        if (onmVar instanceof x011) {
            x011Var = (x011) onmVar;
            int i2 = x011Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x011Var.f = i2 - Integer.MIN_VALUE;
            } else {
                x011Var = new x011(this, onmVar);
            }
        } else {
            x011Var = new x011(this, onmVar);
        }
        Object obj = x011Var.d;
        int i3 = x011Var.f;
        d9n d9nVar = d9n.a;
        try {
            if (i3 == 0) {
                hm5.M(obj);
                x011Var.a = l8t0Var;
                vgn0Var = this.c;
                x011Var.b = vgn0Var;
                x011Var.c = 0;
                x011Var.f = 1;
                if (vgn0Var.a(x011Var) != d9nVar) {
                    i = 0;
                }
                return d9nVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vgn0Var2 = x011Var.b;
                try {
                    hm5.M(obj);
                    w011 uqv0Var = new uqv0((l2t) obj, (byte) 17);
                    vgn0Var = vgn0Var2;
                    m7y0Var = uqv0Var;
                    vgn0Var.c((Object) null);
                    x011Var.a = null;
                    x011Var.b = null;
                    x011Var.f = 3;
                    objA = m7y0Var.a(x011Var);
                    if (objA != d9nVar) {
                        return d9nVar;
                    }
                    return objA;
                } catch (Throwable th) {
                    th = th;
                    vgn0Var2.c((Object) null);
                    throw th;
                }
            }
            int i4 = x011Var.c;
            vgn0 vgn0Var3 = x011Var.b;
            l8t0 l8t0Var2 = x011Var.a;
            hm5.M(obj);
            vgn0Var = vgn0Var3;
            i = i4;
            l8t0Var = l8t0Var2;
            if (!this.b && (s2tVar = this.a) != null) {
                if (!s2tVar.isActive()) {
                    if (s2tVar.v() && !s2tVar.isCancelled()) {
                        try {
                            m231Var = (l111) s2tVar.Z();
                        } catch (Throwable th2) {
                            try {
                                m231Var = new m231(th2);
                            } catch (Throwable th3) {
                                th = th3;
                                vgn0Var2 = vgn0Var;
                                vgn0Var2.c((Object) null);
                                throw th;
                            }
                        }
                        if (m231Var instanceof m231) {
                            m231Var = null;
                        }
                        l111 l111Var = m231Var;
                        if (l111Var != null && !l111Var.a.isEmpty() && l111Var.b != 2) {
                        }
                    }
                    this.a = null;
                }
                m7y0Var = new m7y0(s2tVar, (byte) 7);
                vgn0Var.c((Object) null);
                x011Var.a = null;
                x011Var.b = null;
                x011Var.f = 3;
                objA = m7y0Var.a(x011Var);
                if (objA != d9nVar) {
                    return d9nVar;
                }
                return objA;
            }
            this.b = false;
            i3y0 i3y0Var = new i3y0(l8t0Var, this, (lnm) null, (byte) 10);
            x011Var.a = null;
            x011Var.b = vgn0Var;
            x011Var.c = i;
            x011Var.f = 2;
            Object objS = smo1.s(i3y0Var, x011Var);
            if (objS != d9nVar) {
                vgn0 vgn0Var4 = vgn0Var;
                obj = objS;
                vgn0Var2 = vgn0Var4;
                w011 uqv0Var2 = new uqv0((l2t) obj, (byte) 17);
                vgn0Var = vgn0Var2;
                m7y0Var = uqv0Var2;
                vgn0Var.c((Object) null);
                x011Var.a = null;
                x011Var.b = null;
                x011Var.f = 3;
                objA = m7y0Var.a(x011Var);
                if (objA != d9nVar) {
                    return objA;
                }
            }
            return d9nVar;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
