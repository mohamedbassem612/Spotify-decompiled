package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cyx extends hab0 implements vu30 {
    public final /* synthetic */ e6e1 X;
    public final /* synthetic */ vu30 a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ float e;
    public final /* synthetic */ hdn0 f;
    public final /* synthetic */ j2i g;
    public final /* synthetic */ String h;
    public final /* synthetic */ y7e1 i;
    public final /* synthetic */ zxx t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyx(vu30 vu30Var, vu30 vu30Var2, boolean z, boolean z2, float f, hdn0 hdn0Var, j2i j2iVar, String str, y7e1 y7e1Var, zxx zxxVar, e6e1 e6e1Var) {
        super(2);
        this.a = vu30Var;
        this.b = vu30Var2;
        this.c = z;
        this.d = z2;
        this.e = f;
        this.f = hdn0Var;
        this.g = j2iVar;
        this.h = str;
        this.i = y7e1Var;
        this.t = zxxVar;
        this.X = e6e1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        j06 j06Var;
        qim0 uul1Var;
        boolean z;
        tl3 tl3Var;
        int i;
        boolean z2;
        boolean z3;
        x340 x340Var;
        qim0 i5j1Var;
        djc0 cjc0Var;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        x340 x340Var2 = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        tl3 tl3Var2 = een.d;
        fra fraVar = een.O0;
        m4c m4cVar = fkj0.X;
        x340 x340Var3 = x340Var2;
        boolean zY = x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var2 = x340Var3.a;
        if (zY) {
            qim0 qim0Var = nim0.a;
            n4k n4kVar = hmb0.t1;
            boolean z4 = this.c;
            boolean z5 = this.d;
            vu30 vu30Var = this.a;
            if (vu30Var == null) {
                x340Var3.i0(-527128730);
                x340Var3.r(false);
                tl3Var = tl3Var2;
                j06Var = j06Var2;
                z5 = z5;
                z4 = z4;
                i = 1;
            } else {
                j06Var = j06Var2;
                x340Var3.i0(-527128729);
                if (z4) {
                    x340Var3.i0(-1221450560);
                    x340Var3.r(false);
                    uul1Var = new i5j1(fraVar);
                    z = false;
                } else if (z5) {
                    x340Var3.i0(-1221448463);
                    z = false;
                    x340Var3.r(false);
                    uul1Var = qim0Var;
                } else {
                    x340Var3.i0(-1221447076);
                    Object objT = x340Var3.T();
                    if (objT == m4cVar) {
                        objT = s8x.V0;
                        x340Var3.s0(objT);
                    }
                    uul1Var = new uul1(new mi31((iu30) objT));
                    z = false;
                    x340Var3.r(false);
                }
                gfh0 gfh0VarC = t1c.c(tl3Var2, z);
                int iHashCode = Long.hashCode(x340Var3.T);
                xos0 xos0VarM = x340Var3.m();
                qim0 qim0VarE = zr7.E(x340Var3, uul1Var);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                tl3Var = tl3Var2;
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var3, lljVar4);
                nko1.H(xos0VarM, x340Var3, lljVar3);
                x0d.q(iHashCode, x340Var3, lljVar2, x340Var3);
                nko1.H(qim0VarE, x340Var3, lljVar);
                vu30Var.invoke(x340Var3, 0);
                i = 1;
                x340Var3.r(true);
                x340Var3.r(false);
            }
            x340Var3.i0(-432628740);
            qim0 qim0VarZ = z5 ? uyn1.z(0.0f, this.e, i, qim0Var) : qim0Var;
            if (z5) {
                z2 = false;
                x340Var3.i0(1758960545);
            } else {
                x340Var3.i0(1758959452);
                hdn0 hdn0Var = this.f;
                boolean zI = x340Var3.i(hdn0Var);
                Object objT2 = x340Var3.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new tu9(hdn0Var, (byte) 11);
                    x340Var3.s0(objT2);
                }
                qim0VarZ = qim0VarZ.then(new uul1(new mi31((iu30) objT2)));
                z2 = false;
            }
            x340Var3.r(z2);
            x340Var3.r(z2);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarThen = qim0VarZ.then(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            tl3 tl3Var3 = tl3Var;
            gfh0 gfh0VarC2 = t1c.c(tl3Var3, true);
            int iHashCode2 = Long.hashCode(x340Var3.T);
            xos0 xos0VarM2 = x340Var3.m();
            qim0 qim0VarE2 = zr7.E(x340Var3, qim0VarThen);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(n4kVar);
            } else {
                x340Var3.v0();
            }
            nko1.H(gfh0VarC2, x340Var3, lljVar4);
            nko1.H(xos0VarM2, x340Var3, lljVar3);
            x0d.q(iHashCode2, x340Var3, lljVar2, x340Var3);
            nko1.H(qim0VarE2, x340Var3, lljVar);
            this.g.invoke(x340Var3, 0);
            String str = this.h;
            if (str == null || this.i.d().d.length() != 0) {
                z3 = false;
                x340Var = x340Var3;
                x340Var.i0(504801305);
                x340Var.r(false);
            } else {
                x340Var3.i0(504364639);
                long j = this.t.c;
                e6e1 e6e1Var = this.X;
                boolean z6 = e6e1Var instanceof c6e1;
                c6e1 c6e1Var = z6 ? (c6e1) e6e1Var : null;
                int i2 = c6e1Var != null ? c6e1Var.b : 1;
                if (e6e1Var instanceof d6e1) {
                    cjc0Var = new cjc0(1);
                } else {
                    if (!z6) {
                        eg.o();
                        return null;
                    }
                    cjc0Var = new cjc0(((c6e1) e6e1Var).c);
                }
                uwo1.e(str, (qim0) null, (lee1) null, j, (a0e1) null, (iu30) null, 2, false, cjc0Var, i2, (qx8) null, x340Var3, 0, 0, 1206);
                x340Var = x340Var3;
                z3 = false;
                x340Var.r(false);
            }
            x340Var.r(true);
            vu30 vu30Var2 = this.b;
            if (vu30Var2 == null) {
                x340Var.i0(-525834170);
                x340Var.r(z3);
            } else {
                x340Var.i0(-525834169);
                if (z4) {
                    x340Var.i0(622027561);
                    x340Var.r(z3);
                    i5j1Var = new i5j1(fraVar);
                } else if (z5) {
                    x340Var.i0(622029658);
                    x340Var.r(z3);
                    i5j1Var = qim0Var;
                } else {
                    x340Var.i0(622031045);
                    Object objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = s8x.W0;
                        x340Var.s0(objT3);
                    }
                    qim0 uul1Var2 = new uul1(new mi31((iu30) objT3));
                    z3 = false;
                    x340Var.r(false);
                    i5j1Var = uul1Var2;
                }
                gfh0 gfh0VarC3 = t1c.c(tl3Var3, z3);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, i5j1Var);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar4);
                nko1.H(xos0VarM3, x340Var, lljVar3);
                x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar);
                vu30Var2.invoke(x340Var, 0);
                x340Var.r(true);
                x340Var.r(false);
            }
        } else {
            x340Var3.b0();
        }
        return rih1.a;
    }
}
