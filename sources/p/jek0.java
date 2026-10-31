package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jek0 implements xpw {
    public final v0j a;
    public final vek0 b;
    public final jfq c;
    public final kfq d;
    public final lfq e;
    public final mfq f;
    public final rey0 g = new rey0(new mbj0(this, (byte) 15));
    public final psw h;
    public final ia00 i;

    public jek0(v0j v0jVar, vek0 vek0Var, jfq jfqVar, kfq kfqVar, lfq lfqVar, mfq mfqVar) {
        this.a = v0jVar;
        this.b = vek0Var;
        this.c = jfqVar;
        this.d = kfqVar;
        this.e = lfqVar;
        this.f = mfqVar;
        j2i j2iVar = new j2i(-853144156, new y3i0(this, (byte) 25), true);
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
        this.i = n3o1.q(this).a(w7k0.R0, w7k0.S0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.h;
    }

    public final void e(vdk0 vdk0Var, iek0 iek0Var, c9n c9nVar, iu30 iu30Var, iu30 iu30Var2, b0k b0kVar, int i) {
        int i2;
        c9n c9nVar2;
        jek0 jek0Var;
        vdk0 vdk0Var2;
        iu30 iu30Var3;
        b0k b0kVar2;
        iu30 iu30Var4;
        boolean z;
        Object obj = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1729349348);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? b0kVar3.g(vdk0Var) : b0kVar3.i(vdk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(iek0Var) : b0kVar3.i(iek0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            c9nVar2 = c9nVar;
            i2 |= b0kVar3.i(c9nVar2) ? 256 : 128;
        } else {
            c9nVar2 = c9nVar;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(iu30Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(this) ? 131072 : 65536;
        }
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            boolean zJ = u890.j(iek0Var, hek0.a);
            boolean z2 = false;
            rih1 rih1Var = rih1.a;
            if (zJ) {
                b0kVar3.i0(-913361934);
                Object objT = b0kVar3.T();
                if (objT == obj) {
                    qej0 qej0Var = new qej0(new stj0(iu30Var, (byte) 21), this.e.a.b.A5);
                    b0kVar3.s0(qej0Var);
                    objT = qej0Var;
                }
                qej0 qej0Var2 = (qej0) objT;
                z = true;
                otw.c(qej0Var2, rih1Var, (qim0) null, (ipb1) null, b0kVar3, 48, 12);
                b0kVar3.r(false);
            } else {
                z = true;
                b0kVar3.i0(-913188954);
                b0kVar3.r(false);
            }
            if (u890.j(iek0Var, gek0.a)) {
                b0kVar3.i0(-913064396);
                Object objT2 = b0kVar3.T();
                if (objT2 == obj) {
                    mej0 mej0Var = new mej0(new stj0(iu30Var, (byte) 22), this.f.a.b.A5);
                    b0kVar3.s0(mej0Var);
                    objT2 = mej0Var;
                }
                otw.c((mej0) objT2, rih1Var, (qim0) null, (ipb1) null, b0kVar3, 48, 12);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-912893338);
                b0kVar3.r(false);
            }
            if (u890.j(iek0Var, eek0.a)) {
                b0kVar3.i0(-912745809);
                Object objT3 = b0kVar3.T();
                if (objT3 == obj) {
                    e9g0 e9g0Var = new e9g0(iu30Var, c9nVar2, iu30Var2, this, vdk0Var, (byte) 7);
                    jek0Var = this;
                    vdk0Var2 = vdk0Var;
                    jek0Var.c.getClass();
                    objT3 = new sek0(e9g0Var);
                    b0kVar3.s0(objT3);
                } else {
                    jek0Var = this;
                    vdk0Var2 = vdk0Var;
                }
                iu30Var3 = iu30Var2;
                b0kVar2 = b0kVar3;
                iu30Var4 = iu30Var;
                otw.c((sek0) objT3, new rek0(vdk0Var2.a), (qim0) null, (ipb1) null, b0kVar2, 0, 12);
                b0kVar2.r(z2);
            } else {
                jek0Var = this;
                vdk0Var2 = vdk0Var;
                iu30Var3 = iu30Var2;
                b0kVar2 = b0kVar3;
                iu30Var4 = iu30Var;
                z2 = false;
                b0kVar2.i0(-911278362);
                b0kVar2.r(false);
            }
            if (iek0Var instanceof fek0) {
                b0kVar2.i0(-911113256);
                Object objT4 = b0kVar2.T();
                if (objT4 == obj) {
                    maj0 maj0Var = new maj0(1, new jjv(iu30Var4, iu30Var3, (byte) 3), jek0Var.d.a.b.A5);
                    b0kVar2.s0(maj0Var);
                    objT4 = maj0Var;
                }
                otw.c((maj0) objT4, rih1Var, (qim0) null, (ipb1) null, b0kVar2, 48, 12);
                b0kVar2.r(z2);
            } else {
                b0kVar2.i0(-910146490);
                b0kVar2.r(z2);
            }
        } else {
            jek0Var = this;
            vdk0Var2 = vdk0Var;
            iu30Var3 = iu30Var2;
            b0kVar2 = b0kVar3;
            iu30Var4 = iu30Var;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0((byte) 5, i, jek0Var, vdk0Var2, iek0Var, c9nVar, iu30Var4, iu30Var3, false);
        }
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
