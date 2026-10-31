package p;

import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class q7d0 implements hsw {
    public final koc0 a;
    public final bct b;
    public final wj3 c;
    public final q8n d;
    public final m720 e;
    public final rp4 f;
    public llm g;
    public final idd1 h;
    public final evz i;
    public final x010 j;
    public final yd91 k;

    public q7d0(ikp ikpVar, koc0 koc0Var, lcq lcqVar, bct bctVar, wj3 wj3Var, q8n q8nVar, m720 m720Var, rp4 rp4Var) {
        this.a = koc0Var;
        this.b = bctVar;
        this.c = wj3Var;
        this.d = q8nVar;
        this.e = m720Var;
        this.f = rp4Var;
        this.g = us71.h(q8nVar);
        this.h = new idd1(new bsc0(ikpVar, this, (byte) 5));
        any anyVarD = ((roc0) koc0Var).d();
        vvu vvuVar = (vvu) wj3Var.N0;
        lnm lnmVar = null;
        mr20 mr20Var = rp4Var.a() ? (x880) wj3Var.P0 : null;
        this.i = h5p1.s(anyVarD, vvuVar, mr20Var == null ? new huz(Boolean.FALSE, (byte) 10) : mr20Var, new r20((Object) this, lnmVar, (byte) 25));
        this.j = new x010((x880) wj3Var.O0, vvuVar, new qr0(this, lnmVar, (byte) 28), (byte) 1);
        this.k = new yd91(3, new nzb0(this, (byte) 20));
    }

    @Override // p.anc0
    public final void a() {
        smo1.p(this.g, (CancellationException) null);
        this.g = smo1.e(flo1.l(guo1.B(), this.d));
    }

    @Override // p.anc0
    public final void b() {
        wj3 wj3Var = this.c;
        xab1 xab1Var = (xab1) wj3Var.X;
        lnm lnmVar = null;
        if (xab1Var == null || !xab1Var.isActive()) {
            if (wj3Var.i()) {
                wj3Var.k(new f7d0(wj3Var, null, (byte) 1));
            } else {
                Set setG = wj3Var.g();
                if (!setG.isEmpty()) {
                    wj3Var.k(new fpo(wj3Var, setG, (lnm) null, (byte) 19));
                }
            }
        }
        if (this.f.a()) {
            fn31.T(this.g, (o8n) null, 0, new q4d0(this.b.c, this, lnmVar, (byte) 2), 3);
        }
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.k;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, onm onmVar) {
        o7d0 o7d0Var;
        String str2;
        cxc0 cxc0Var;
        b431 b431Var;
        Object objF;
        b431 b431Var2;
        String str3;
        if (onmVar instanceof o7d0) {
            o7d0Var = (o7d0) onmVar;
            int i = o7d0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                o7d0Var.f = i - Integer.MIN_VALUE;
            } else {
                o7d0Var = new o7d0(this, onmVar);
            }
        } else {
            o7d0Var = new o7d0(this, onmVar);
        }
        Object objI = o7d0Var.d;
        int i2 = o7d0Var.f;
        rih1 rih1Var = rih1.a;
        Object obj = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            any anyVarD = ((roc0) this.a).d();
            o7d0Var.a = str;
            o7d0Var.f = 1;
            objI = b5p1.i(anyVarD, o7d0Var);
            if (objI != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = o7d0Var.a;
            hm5.M(objI);
        } else {
            if (i2 == 2) {
                cxc0Var = o7d0Var.b;
                str2 = o7d0Var.a;
                hm5.M(objI);
                if (((Boolean) objI).booleanValue()) {
                    return rih1Var;
                }
                b431Var = (b431) this.h.getValue();
                o7d0Var.a = str2;
                o7d0Var.b = null;
                o7d0Var.c = b431Var;
                o7d0Var.f = 3;
                objF = f(cxc0Var, o7d0Var);
                if (objF != obj) {
                    objI = objF;
                    b431Var2 = b431Var;
                    str3 = str2;
                }
                return obj;
            }
            if (i2 != 3) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b431Var2 = o7d0Var.c;
            str3 = o7d0Var.a;
            hm5.M(objI);
        }
        b431Var2.a((e720) objI, str3);
        return rih1Var;
        cxc0 cxc0Var2 = (cxc0) objI;
        qxc0 qxc0VarU = fyo1.u(cxc0Var2);
        o7d0Var.a = str;
        o7d0Var.b = cxc0Var2;
        o7d0Var.f = 2;
        Object objP = this.c.p(qxc0VarU, o7d0Var);
        if (objP != obj) {
            str2 = str;
            cxc0Var = cxc0Var2;
            objI = objP;
            if (((Boolean) objI).booleanValue()) {
                return rih1Var;
            }
            b431Var = (b431) this.h.getValue();
            o7d0Var.a = str2;
            o7d0Var.b = null;
            o7d0Var.c = b431Var;
            o7d0Var.f = 3;
            objF = f(cxc0Var, o7d0Var);
            if (objF != obj) {
                objI = objF;
                b431Var2 = b431Var;
                str3 = str2;
                b431Var2.a((e720) objI, str3);
                return rih1Var;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(cxc0 cxc0Var, onm onmVar) {
        p7d0 p7d0Var;
        if (onmVar instanceof p7d0) {
            p7d0Var = (p7d0) onmVar;
            int i = p7d0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p7d0Var.c = i - Integer.MIN_VALUE;
            } else {
                p7d0Var = new p7d0(this, onmVar);
            }
        } else {
            p7d0Var = new p7d0(this, onmVar);
        }
        Object objF = p7d0Var.a;
        int i2 = p7d0Var.c;
        if (i2 == 0) {
            hm5.M(objF);
            qxc0 qxc0VarU = fyo1.u(cxc0Var);
            p7d0Var.c = 1;
            objF = this.c.f(qxc0VarU, p7d0Var);
            d9n d9nVar = d9n.a;
            if (objF == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        return new e720((s620) objF);
    }

    @Override // p.hsw, p.xe91
    public final mr20 getShow() {
        return this.i;
    }
}
