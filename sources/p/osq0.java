package p;

import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class osq0 implements tyq {
    public final n9r0 N0;
    public final t8r0 O0;
    public final ts50 P0;
    public final d0r Q0;
    public r6h1 R0 = r6h1.c;
    public final o3r S0;
    public final ljm0 T0;
    public final ia00 U0;
    public final psw V0;
    public final w9u0 X;
    public final v8r0 Y;
    public final w8r0 Z;
    public final psq0 a;
    public final cir0 b;
    public final ujp c;
    public final ri41 d;
    public final kly0 e;
    public final cx0 f;
    public final nu g;
    public final vep h;
    public final fxp i;
    public final Flowable t;

    public osq0(psq0 psq0Var, cir0 cir0Var, ujp ujpVar, ri41 ri41Var, ywp ywpVar, cx0 cx0Var, nu nuVar, vep vepVar, fxp fxpVar, Flowable flowable, w9u0 w9u0Var, v8r0 v8r0Var, w8r0 w8r0Var, n9r0 n9r0Var, t8r0 t8r0Var, ts50 ts50Var, d0r d0rVar) {
        this.a = psq0Var;
        this.b = cir0Var;
        this.c = ujpVar;
        this.d = ri41Var;
        this.e = ywpVar;
        this.f = cx0Var;
        this.g = nuVar;
        this.h = vepVar;
        this.i = fxpVar;
        this.t = flowable;
        this.X = w9u0Var;
        this.Y = v8r0Var;
        this.Z = w8r0Var;
        this.N0 = n9r0Var;
        this.O0 = t8r0Var;
        this.P0 = ts50Var;
        this.Q0 = d0rVar;
        cnp0 cnp0Var = new cnp0(this, (byte) 26);
        this.S0 = w3p1.o(new l4r(hjx0.a, 1, rfq0.S0, new j4r(cnp0Var), rfq0.T0), rfq0.R0);
        rfq0 rfq0Var = rfq0.Q0;
        fns fnsVar = igu.a;
        this.T0 = h7w.B(rfq0Var, pyf0.a, (iu30) null, new msq0(this, (byte) 0), 4);
        this.U0 = n3o1.q(this).a(new msq0(this, (byte) 1), jgq0.f);
        j2i j2iVar = new j2i(-1866110268, new aso0(this, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.V0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.U0;
    }

    public final jsw c() {
        return this.V0;
    }

    public final d0r e() {
        return this.Q0;
    }

    public final void f(boolean z, b0k b0kVar, int i) {
        int i2;
        qim0 qim0VarX;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-838508761);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(this) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            if (z) {
                x340Var.i0(1122468529);
                uwr uwrVar = cbx.a;
                qim0VarX = uyn1.z(cbx.b(x340Var).b.b, 0.0f, 2, nim0Var);
                x340Var.r(false);
            } else {
                x340Var.i0(1122470692);
                uwr uwrVar2 = cbx.a;
                qim0VarX = uyn1.x(nim0Var, cbx.b(x340Var).b.b);
                x340Var.r(false);
            }
            qim0 qim0VarThen = qim0VarF.then(qim0VarX);
            era eraVar = een.Q0;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = this.h.a(new njm(this.b.g()), new oxa0(this, (lnm) null, (byte) 22));
                x340Var.s0(objT);
            }
            otw.c((nqu) objT, new lqu(2, 1), (qim0) null, (ipb1) null, x340Var, 8, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new se5(this, z, i, (byte) 4);
        }
    }

    public final void g(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-437573624);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarX = uyn1.x(qim0VarF, cbx.b(x340Var).b.b);
            era eraVar = een.Q0;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                this.i.getClass();
                objT = new hkb1(function0);
                x340Var.s0(objT);
            }
            otw.c((hkb1) objT, rih1.a, (qim0) null, (ipb1) null, x340Var, 56, 12);
            uwo1.e(cwl1.o0(x340Var, 2131959463), u291.f(nim0Var, 1.0f), cbx.d(x340Var).m, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2016);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hsq0(this, function0, i);
        }
    }

    public final mqw getBehavior() {
        return this.T0;
    }

    public final f4r getData() {
        return this.S0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:61:0x0129  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:64:0x0136  */
    /* JADX WARN: Code duplicated, block: B:67:0x019f  */
    /* JADX WARN: Code duplicated, block: B:68:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x021d  */
    /* JADX WARN: Code duplicated, block: B:78:0x024c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0252  */
    /* JADX WARN: Code duplicated, block: B:81:0x0272  */
    /* JADX WARN: Code duplicated, block: B:83:0x0283  */
    /* JADX WARN: Code duplicated, block: B:85:0x0288  */
    /* JADX WARN: Code duplicated, block: B:88:0x0297  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public final void h(isq0 isq0Var, boolean z, boolean z2, Function0 function0, b0k b0kVar, int i, int i2) {
        int i3;
        Function0 function1;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        boolean z4;
        osq0 osq0Var;
        boolean z5;
        Function0 function2;
        h311 h311VarV;
        boolean z6;
        Function0 function3;
        wsq0 wsq0Var;
        boolean zEquals;
        Object objT;
        o95 o95Var;
        Object objT2;
        o95 o95Var2;
        Object objT3;
        tob1 tob1Var;
        boolean zH;
        Object objT4;
        tob1 tob1Var2;
        o95 o95Var3;
        o95 o95Var4;
        nim0 nim0Var;
        gra graVar;
        gfh0 gfh0VarC;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        boolean z7;
        n4k n4kVar;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        llj lljVar4;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objT5;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(282994520);
        j06 j06Var = x340Var.a;
        int i8 = (x340Var.g(isq0Var) ? 4 : 2) | i;
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                i8 |= x340Var.h(z2) ? 256 : 128;
            }
            i3 = i2 & 8;
            if (i3 != 0) {
                i5 = i8 | 3072;
                function1 = function0;
            } else {
                function1 = function0;
                if (x340Var.i(function1)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i5 = i8 | i4;
            }
            if (x340Var.i(this)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i7 = i5 | i6;
            if ((i7 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i7 & 1, z3)) {
                if (i9 != 0) {
                    z6 = false;
                } else {
                    z6 = z2;
                }
                if (i3 != 0) {
                    objT5 = x340Var.T();
                    if (objT5 == m4cVar) {
                        objT5 = wso0.Y0;
                        x340Var.s0(objT5);
                    }
                    function3 = (Function0) objT5;
                } else {
                    function3 = function1;
                }
                wsq0Var = isq0Var.a;
                zEquals = wsq0Var.equals(ssq0.a);
                objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = c97.b(1.0f);
                    x340Var.s0(objT);
                }
                o95Var = (o95) objT;
                objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = c97.b(0.0f);
                    x340Var.s0(objT2);
                }
                o95Var2 = (o95) objT2;
                objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = v8r.q(Boolean.FALSE);
                    x340Var.s0(objT3);
                }
                tob1Var = (ven0) objT3;
                Boolean boolValueOf = Boolean.valueOf(zEquals);
                zH = x340Var.h(zEquals) | x340Var.i(o95Var) | x340Var.i(tob1Var) | x340Var.i(o95Var2);
                objT4 = x340Var.T();
                if (!zH || objT4 == m4cVar) {
                    tob1Var2 = tob1Var;
                    o95Var3 = o95Var;
                    o95Var4 = o95Var2;
                    objT4 = new kv1(zEquals, o95Var3, o95Var4, tob1Var2, (lnm) null, (byte) 15);
                    x340Var.s0(objT4);
                } else {
                    tob1Var2 = tob1Var;
                    o95Var3 = o95Var;
                    o95Var4 = o95Var2;
                }
                qxd0.t(boolValueOf, x340Var, (vu30) objT4);
                nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                graVar = een.d;
                gfh0VarC = t1c.c(graVar, false);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0VarF);
                hzj.A.getClass();
                if (j06Var != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                z7 = x340Var.S;
                n4kVar = hmb0.t1;
                if (z7) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar);
                lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                qim0 qim0VarK = d9y0.k(u291.f(nim0Var, 1.0f), ((Number) o95Var3.e()).floatValue());
                era eraVar = een.Q0;
                uwr uwrVar = cbx.a;
                z8 = z6;
                cvx cvxVar = cbx.b(x340Var).b;
                mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 0);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarK);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(mbhVarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                if (z8) {
                    x340Var.i0(-987624750);
                    osq0Var = this;
                    yto1.f(3120, apo.r(2005433596, new hsq0(osq0Var, function3), x340Var), x340Var, uyn1.z(cbx.b(x340Var).b.b, 0.0f, 2, nim0Var), wsq0Var.equals(rsq0.a));
                    z9 = false;
                    x340Var.r(false);
                } else {
                    z9 = false;
                    osq0Var = this;
                    x340Var.i0(-987136562);
                    x340Var.r(false);
                }
                Function0 function4 = function3;
                z4 = z;
                otw.c(osq0Var.g, new prq0(z4), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(true);
                if (((Boolean) tob1Var2.getValue()).booleanValue()) {
                    x340Var.i0(142718234);
                    qim0 qim0VarK2 = d9y0.k(nim0Var, ((Number) o95Var4.e()).floatValue());
                    gfh0 gfh0VarC2 = t1c.c(graVar, z9);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarK2);
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var, lljVar);
                    nko1.H(xos0VarM3, x340Var, lljVar2);
                    x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE3, x340Var, lljVar4);
                    osq0Var.f(z4, x340Var, ((i7 >> 9) & 112) | 6);
                    z10 = true;
                    x340Var.r(true);
                    x340Var.r(z9);
                } else {
                    z10 = true;
                    x340Var.i0(142820100);
                    x340Var.r(z9);
                }
                x340Var.r(z10);
                function2 = function4;
                z5 = z8;
            } else {
                z4 = z;
                osq0Var = this;
                x340Var.b0();
                z5 = z2;
                function2 = function1;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new no6(osq0Var, isq0Var, z4, z5, function2, i, i2, (byte) 1);
            }
        }
        i8 |= 384;
        i3 = i2 & 8;
        if (i3 != 0) {
            i5 = i8 | 3072;
            function1 = function0;
        } else {
            function1 = function0;
            if (x340Var.i(function1)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i5 = i8 | i4;
        }
        if (x340Var.i(this)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        i7 = i5 | i6;
        if ((i7 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i7 & 1, z3)) {
            if (i9 != 0) {
                z6 = false;
            } else {
                z6 = z2;
            }
            if (i3 != 0) {
                objT5 = x340Var.T();
                if (objT5 == m4cVar) {
                    objT5 = wso0.Y0;
                    x340Var.s0(objT5);
                }
                function3 = (Function0) objT5;
            } else {
                function3 = function1;
            }
            wsq0Var = isq0Var.a;
            zEquals = wsq0Var.equals(ssq0.a);
            objT = x340Var.T();
            if (objT == m4cVar) {
                objT = c97.b(1.0f);
                x340Var.s0(objT);
            }
            o95Var = (o95) objT;
            objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = c97.b(0.0f);
                x340Var.s0(objT2);
            }
            o95Var2 = (o95) objT2;
            objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            tob1Var = (ven0) objT3;
            Boolean boolValueOf2 = Boolean.valueOf(zEquals);
            zH = x340Var.h(zEquals) | x340Var.i(o95Var) | x340Var.i(tob1Var) | x340Var.i(o95Var2);
            objT4 = x340Var.T();
            if (zH) {
                tob1Var2 = tob1Var;
                o95Var3 = o95Var;
                o95Var4 = o95Var2;
                objT4 = new kv1(zEquals, o95Var3, o95Var4, tob1Var2, (lnm) null, (byte) 15);
                x340Var.s0(objT4);
            } else {
                tob1Var2 = tob1Var;
                o95Var3 = o95Var;
                o95Var4 = o95Var2;
                objT4 = new kv1(zEquals, o95Var3, o95Var4, tob1Var2, (lnm) null, (byte) 15);
                x340Var.s0(objT4);
            }
            qxd0.t(boolValueOf2, x340Var, (vu30) objT4);
            nim0Var = nim0.a;
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            graVar = een.d;
            gfh0VarC = t1c.c(graVar, false);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0VarF2);
            hzj.A.getClass();
            if (j06Var != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            z7 = x340Var.S;
            n4kVar = hmb0.t1;
            if (z7) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            lljVar3 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar3);
            nko1.F(x340Var);
            lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarK3 = d9y0.k(u291.f(nim0Var, 1.0f), ((Number) o95Var3.e()).floatValue());
            era eraVar2 = een.Q0;
            uwr uwrVar2 = cbx.a;
            z8 = z6;
            cvx cvxVar2 = cbx.b(x340Var).b;
            mbh mbhVarA2 = jbh.a(new d36(16.0f, true, new um5(false)), eraVar2, x340Var, 0);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, qim0VarK3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM4, x340Var, lljVar2);
            x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar4);
            if (z8) {
                x340Var.i0(-987624750);
                osq0Var = this;
                yto1.f(3120, apo.r(2005433596, new hsq0(osq0Var, function3), x340Var), x340Var, uyn1.z(cbx.b(x340Var).b.b, 0.0f, 2, nim0Var), wsq0Var.equals(rsq0.a));
                z9 = false;
                x340Var.r(false);
            } else {
                z9 = false;
                osq0Var = this;
                x340Var.i0(-987136562);
                x340Var.r(false);
            }
            Function0 function5 = function3;
            z4 = z;
            otw.c(osq0Var.g, new prq0(z4), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
            if (((Boolean) tob1Var2.getValue()).booleanValue()) {
                x340Var.i0(142718234);
                qim0 qim0VarK4 = d9y0.k(nim0Var, ((Number) o95Var4.e()).floatValue());
                gfh0 gfh0VarC3 = t1c.c(graVar, z9);
                int iHashCode5 = Long.hashCode(x340Var.T);
                xos0 xos0VarM5 = x340Var.m();
                qim0 qim0VarE5 = zr7.E(x340Var, qim0VarK4);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, lljVar);
                nko1.H(xos0VarM5, x340Var, lljVar2);
                x0d.q(iHashCode5, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE5, x340Var, lljVar4);
                osq0Var.f(z4, x340Var, ((i7 >> 9) & 112) | 6);
                z10 = true;
                x340Var.r(true);
                x340Var.r(z9);
            } else {
                z10 = true;
                x340Var.i0(142820100);
                x340Var.r(z9);
            }
            x340Var.r(z10);
            function2 = function5;
            z5 = z8;
        } else {
            z4 = z;
            osq0Var = this;
            x340Var.b0();
            z5 = z2;
            function2 = function1;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new no6(osq0Var, isq0Var, z4, z5, function2, i, i2, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:72:0x0151  */
    public final void i(wsq0 wsq0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        String strK;
        String strK2;
        Float fValueOf;
        zuq0 zuq0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(370725561);
        int i2 = i | (x340Var.g(wsq0Var) ? 4 : 2) | (x340Var.i(this) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            tsq0 tsq0Var = tsq0.a;
            boolean zEquals = wsq0Var.equals(tsq0Var);
            ssq0 ssq0Var = ssq0.a;
            srq0 srq0Var = srq0.a;
            rrq0 rrq0Var = rrq0.a;
            qrq0 qrq0Var = qrq0.a;
            trq0 trq0Var = trq0.a;
            vsq0 vsq0Var = vsq0.a;
            rsq0 rsq0Var = rsq0.a;
            if (zEquals) {
                x340Var.i0(1315460833);
                x340Var.r(false);
                strK = null;
            } else if (wsq0Var.equals(rsq0Var)) {
                strK = x0d.k(x340Var, -373206132, 2131959471, x340Var, false);
            } else if (wsq0Var.equals(vsq0Var)) {
                strK = x0d.k(x340Var, -373203286, 2131959464, x340Var, false);
            } else if (wsq0Var instanceof usq0) {
                x340Var.i0(1315707997);
                urq0 urq0Var = ((usq0) wsq0Var).b;
                if (urq0Var.equals(trq0Var)) {
                    strK = x0d.k(x340Var, -373197745, 2131959465, x340Var, false);
                } else if (urq0Var.equals(qrq0Var)) {
                    strK = x0d.k(x340Var, -373194702, 2131959466, x340Var, false);
                } else if (urq0Var.equals(rrq0Var)) {
                    strK = x0d.k(x340Var, -373191665, 2131959468, x340Var, false);
                } else {
                    if (!urq0Var.equals(srq0Var)) {
                        throw p3d1.k(x340Var, -373199803, false);
                    }
                    strK = x0d.k(x340Var, -373188622, 2131959469, x340Var, false);
                }
                x340Var.r(false);
            } else {
                if (!wsq0Var.equals(ssq0Var)) {
                    throw p3d1.k(x340Var, -373209091, false);
                }
                strK = x0d.k(x340Var, -373185134, 2131959467, x340Var, false);
            }
            if (wsq0Var.equals(rsq0Var)) {
                strK2 = x0d.k(x340Var, -1009158881, 2131959470, x340Var, false);
            } else {
                x340Var.i0(-1219090223);
                x340Var.r(false);
                strK2 = null;
            }
            boolean z = wsq0Var instanceof usq0;
            usq0 usq0Var = z ? (usq0) wsq0Var : null;
            tg41 tg41Var = usq0Var != null ? usq0Var.a : null;
            if (tg41Var instanceof sg41) {
                fValueOf = Float.valueOf(((sg41) usq0Var.a).a);
            } else if (u890.j(tg41Var, rg41.a)) {
                fValueOf = Float.valueOf(0.0f);
            } else {
                if (tg41Var != null) {
                    eg.o();
                    return;
                }
                fValueOf = null;
            }
            if (wsq0Var.equals(rsq0Var)) {
                zuq0Var = yuq0.a;
            } else {
                xuq0 xuq0Var = xuq0.a;
                if (z) {
                    usq0 usq0Var2 = (usq0) wsq0Var;
                    urq0 urq0Var2 = usq0Var2.b;
                    boolean zEquals2 = urq0Var2.equals(srq0Var);
                    wuq0 wuq0Var = wuq0.a;
                    if (zEquals2) {
                        zuq0Var = wuq0Var;
                    } else {
                        boolean zEquals3 = urq0Var2.equals(rrq0Var);
                        vuq0 vuq0Var = vuq0.a;
                        if (!zEquals3) {
                            if (urq0Var2.equals(qrq0Var)) {
                                tg41 tg41Var2 = usq0Var2.a;
                                sg41 sg41Var = tg41Var2 instanceof sg41 ? (sg41) tg41Var2 : null;
                                if (sg41Var == null || sg41Var.a >= 0.0f) {
                                    zuq0Var = wuq0Var;
                                }
                            } else if (!urq0Var2.equals(trq0Var)) {
                                eg.o();
                                return;
                            }
                        }
                        zuq0Var = vuq0Var;
                    }
                } else if (!wsq0Var.equals(tsq0Var) && !wsq0Var.equals(vsq0Var) && !wsq0Var.equals(ssq0Var)) {
                    eg.o();
                    return;
                }
                zuq0Var = xuq0Var;
            }
            bjk1 bjk1Var = new bjk1(zuq0Var, fValueOf, strK, strK2);
            jsq0 jsq0Var = jsq0.b;
            ksq0 ksq0Var = ksq0.b;
            op71.c(bjk1Var, u291.f(nim0.a, 1.0f), apo.r(-465588037, new qsn0(this, (byte) 29), x340Var), x340Var, 1600512);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lsq0(this, wsq0Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(onm onmVar) {
        nsq0 nsq0Var;
        if (onmVar instanceof nsq0) {
            nsq0Var = (nsq0) onmVar;
            int i = nsq0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nsq0Var.c = i - Integer.MIN_VALUE;
            } else {
                nsq0Var = new nsq0(this, onmVar);
            }
        } else {
            nsq0Var = new nsq0(this, onmVar);
        }
        Object objI = nsq0Var.a;
        int i2 = nsq0Var.c;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            vbm[] vbmVarArr = q601.a;
            kge kgeVar = new kge(this.t);
            nsq0Var.c = 1;
            objI = b5p1.i(kgeVar, nsq0Var);
            if (objI != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objI);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objI);
        PlayerState playerState = (PlayerState) objI;
        if (playerState.isPlaying() && !playerState.isPaused() && u890.j(playerState.contextUri(), this.a.b)) {
            Single singleA = this.X.a(new d9u0("pagematch", false));
            nsq0Var.c = 2;
            if (fc11.j(singleA, nsq0Var) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }
}
