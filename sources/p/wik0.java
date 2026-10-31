package p;

import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wik0 implements tyq {
    public final nm1 N0;
    public final et90 O0;
    public final qlb P0;
    public final hvj0 Q0;
    public final hvj0 R0;
    public final nm1 S0;
    public final res T0;
    public final el9 U0;
    public final svh0 V0;
    public final o3r W0;
    public final t6k0 X;
    public final o3r X0;
    public final el9 Y;
    public final rey0 Y0;
    public final hvj0 Z;
    public final ia00 Z0;
    public final d0r a;
    public final iik0 a1;
    public final rxj0 b;
    public final psw b1;
    public final cbk0 c;
    public final ulk0 d;
    public final vsp e;
    public final bnj0 f;
    public final j3u g;
    public final r7j0 h;
    public final psy i;
    public final nm1 t;

    public wik0(d0r d0rVar, xjl0 xjl0Var, qsp qspVar, tsp tspVar, usp uspVar, rxj0 rxj0Var, cbk0 cbk0Var, ulk0 ulk0Var, vsp vspVar, bnj0 bnj0Var, j3u j3uVar, yfq yfqVar, xsp xspVar, hsp hspVar, ksp kspVar, lsp lspVar, msp mspVar, nsp nspVar, r7j0 r7j0Var) {
        this.a = d0rVar;
        this.b = rxj0Var;
        this.c = cbk0Var;
        this.d = ulk0Var;
        this.e = vspVar;
        this.f = bnj0Var;
        this.g = j3uVar;
        this.h = r7j0Var;
        jzo jzoVar = (jzo) qspVar.a.c;
        yqg yqgVar = (yqg) ((ryj0) jzoVar.e).b.get();
        c8o.l(yqgVar);
        d0r d0rVar2 = (d0r) jzoVar.b.get();
        rsp rspVar = (rsp) jzoVar.c.get();
        ssp sspVar = (ssp) jzoVar.f.get();
        agq agqVar = (agq) ((ryj0) jzoVar.e).L.get();
        c8o.l(agqVar);
        this.i = new psy(yqgVar, d0rVar2, rspVar, sspVar, agqVar, r7j0Var);
        this.t = yfqVar.a(d0rVar, new tik0(this, (byte) 0));
        jzo jzoVar2 = (jzo) tspVar.a.c;
        mnk0 mnk0Var = (mnk0) ((ryj0) jzoVar2.e).q.get();
        c8o.l(mnk0Var);
        this.X = new t6k0(r7j0Var, mnk0Var, new bnj0(jzoVar2.h, jzoVar2.c()));
        jzo jzoVar3 = (jzo) uspVar.a.c;
        d0r d0rVar3 = (d0r) jzoVar3.b.get();
        xsk xskVar = (xsk) jzoVar3.j.get();
        ryj0 ryj0Var = (ryj0) jzoVar3.e;
        rxj0 rxj0VarD = ryj0Var.d();
        c8o.l(rxj0VarD);
        bbk0 bbk0Var = (bbk0) ryj0Var.o.get();
        c8o.l(bbk0Var);
        zfq zfqVar = (zfq) ryj0Var.K.get();
        c8o.l(zfqVar);
        this.Y = new el9(r7j0Var, d0rVar3, xskVar, rxj0VarD, bbk0Var, zfqVar);
        this.Z = new hvj0(r7j0Var, (byte) 4);
        this.N0 = new nm1((d0r) ((jzo) xspVar.a.c).b.get(), r7j0Var);
        jzo jzoVar4 = (jzo) mspVar.a.c;
        this.O0 = new et90(r7j0Var, (cbk0) jzoVar4.l.get(), jzoVar4.h);
        jzo jzoVar5 = (jzo) hspVar.a.c;
        this.P0 = new qlb(r7j0Var, (d0r) jzoVar5.b.get(), (xsk) jzoVar5.j.get());
        this.Q0 = new hvj0(r7j0Var, (byte) 1);
        this.R0 = new hvj0(r7j0Var, (byte) 3);
        jzo jzoVar6 = (jzo) kspVar.a.c;
        d0r d0rVar4 = (d0r) jzoVar6.b.get();
        rxj0 rxj0VarD2 = ((ryj0) jzoVar6.e).d();
        c8o.l(rxj0VarD2);
        this.S0 = new nm1(d0rVar4, rxj0VarD2, r7j0Var);
        jzo jzoVar7 = (jzo) lspVar.a.c;
        cdk0 cdk0VarL = ((ryj0) jzoVar7.e).l();
        c8o.l(cdk0VarL);
        c0k0 c0k0Var = (c0k0) jzoVar7.d;
        yqg yqgVar2 = (yqg) ((ryj0) jzoVar7.e).b.get();
        c8o.l(yqgVar2);
        this.T0 = new res(cdk0VarL, c0k0Var, yqgVar2, jzoVar7.h, r7j0Var);
        jzo jzoVar8 = (jzo) nspVar.a.c;
        d0r d0rVar5 = (d0r) jzoVar8.b.get();
        xsk xskVar2 = (xsk) jzoVar8.j.get();
        bbk0 bbk0Var2 = (bbk0) ((ryj0) jzoVar8.e).o.get();
        c8o.l(bbk0Var2);
        this.U0 = new el9(r7j0Var, d0rVar5, xskVar2, bbk0Var2);
        this.V0 = new svh0((byte) 4, false);
        pwc0 pwc0Var = pwc0.n;
        this.W0 = w3p1.o(new l4r(pwc0Var, 2, uak0.P0, new j4r(uak0.N0), uak0.Q0), uak0.O0);
        this.X0 = w3p1.m(d7p1.j(td80.c), new l4r(pwc0Var, 2, uak0.R0, new j4r(uak0.Y), uak0.S0), new l4r(pwc0.m, 2, uak0.T0, new j4r(uak0.Z), uak0.U0), gce0.T0);
        this.Y0 = k1o1.p();
        this.Z0 = n3o1.q(this).a(new pah0(xjl0Var, (byte) 19), w7k0.X0);
        this.a1 = new iik0(this, (byte) 0);
        this.b1 = new psw(new j2i(-1091964822, new t20(this, xjl0Var, (byte) 16), true), (byte) 0);
    }

    public static vvj0 k(t4h1 t4h1Var) {
        xyb xybVar = (azb) t4h1Var.a.b.getValue();
        if (!(xybVar instanceof ryb)) {
            xybVar = xyb.a;
        }
        return new vvj0(xybVar);
    }

    public static obk0 p(kak0 kak0Var, boolean z) {
        mbk0 mbk0Var;
        ruq0 ruq0Var = kak0Var.S0.b;
        String str = ruq0Var.c;
        String str2 = ruq0Var.d;
        ycu0 ycu0Var = kak0Var.g;
        if (ycu0Var instanceof vcu0) {
            mbk0Var = mbk0.a;
        } else if (ycu0Var instanceof rcu0) {
            mbk0Var = mbk0.c;
        } else {
            if (!(ycu0Var instanceof wcu0)) {
                eg.o();
                return null;
            }
            mbk0Var = mbk0.b;
        }
        return new obk0(str, str2, mbk0Var, z);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    public static rck0 r(kak0 kak0Var, t4h1 t4h1Var, boolean z) {
        boolean z2;
        boolean z3;
        hce1 hce1Var;
        hce1 hce1Var2;
        m8w0 m8w0Var = kak0Var.W0;
        lhg1 lhg1Var = kak0Var.S0;
        q6w0 q6w0Var = lhg1Var.a;
        b8w0 b8w0Var = q6w0Var.a;
        boolean z4 = kak0Var.R0 != null;
        buk1 buk1Var = q6w0Var.b;
        hez hezVar = q6w0Var.c;
        boolean z5 = z4;
        fa20 fa20Var = q6w0Var.d;
        boolean z6 = true;
        px30 px30Var = q6w0Var.e;
        k7f0 k7f0Var = q6w0Var.g;
        taa0 taa0Var = q6w0Var.f;
        boolean zBooleanValue = (t4h1Var == null || (hce1Var2 = t4h1Var.A) == null) ? false : ((Boolean) ((mdt) hce1Var2.b).getValue()).booleanValue();
        boolean zBooleanValue2 = (t4h1Var == null || (hce1Var = t4h1Var.A) == null) ? false : ((Boolean) ((mdt) hce1Var.c).getValue()).booleanValue();
        q6w0 q6w0Var2 = lhg1Var.a;
        if (q6w0Var2.h == null && q6w0Var2.i == null) {
            z6 = false;
        }
        gez gezVar = q6w0Var2.t;
        if ((gezVar != null ? gezVar.a : null) != null) {
            z2 = true;
        } else {
            gez gezVar2 = q6w0Var2.X;
            if ((gezVar2 != null ? gezVar2.a : null) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        r920 r920Var = q6w0Var2.Y;
        if ((r920Var != null ? r920Var.a : null) != null) {
            z3 = true;
        } else {
            r920 r920Var2 = q6w0Var2.Z;
            if ((r920Var2 != null ? r920Var2.a : null) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return new rck0(m8w0Var, b8w0Var, z5, buk1Var, hezVar, fa20Var, px30Var, k7f0Var, taa0Var, zBooleanValue, zBooleanValue2, z6, z2, z3, (q6w0Var2.N0 == null && q6w0Var2.O0 == null) ? false : true, z, k8p1.f(kak0Var), kak0Var.t != null, kak0Var.Y, kak0Var.N0, kak0Var.O0);
    }

    public final rqw a() {
        return this.Z0;
    }

    public final jsw c() {
        return this.b1;
    }

    public final d0r e() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean, int] */
    public final void f(kak0 kak0Var, boolean z, t4h1 t4h1Var, hdn0 hdn0Var, int i, wat watVar, b0k b0kVar, int i2) {
        int i3;
        boolean z2;
        ?? r11;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1954885298);
        int i4 = i2 & 6;
        h2c h2cVar = h2c.a;
        if (i4 == 0) {
            i3 = (x340Var.g(h2cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(kak0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.g(t4h1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.g(hdn0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.e(i) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= x340Var.g(watVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= x340Var.i(this) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            jkk0 jkk0VarS = s(kak0Var, t4h1Var, z);
            giq0 giq0Var = kak0Var.g1;
            otw.c(this.U0, jkk0VarS, (qim0) null, (ipb1) null, x340Var, 0, 12);
            if (this.b.U) {
                z2 = false;
                x340Var.i0(-1767659792);
                x340Var.r(false);
            } else {
                x340Var.i0(-1768146058);
                int iS = i - ((err0) hdn0Var).s();
                if (iS < 0) {
                    iS = 0;
                }
                qim0 qim0VarH = u291.h(u291.f(nim0.a, 1.0f), watVar.M0(iS));
                gra graVar = een.X;
                qim0 qim0VarA = h2cVar.a(qim0VarH, graVar);
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                otw.c(this.P0, k(t4h1Var), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(true);
                z2 = false;
                x340Var.r(false);
            }
            bfm0.a(this.V0, apo.r(1807171477, new cik0(kak0Var, this, z2 ? (byte) 1 : (byte) 0), x340Var), x340Var, 48);
            v3u v3uVar = (v3u) rwq.h(this.g.b, x340Var, z2 ? 1 : 0).getValue();
            if (v3uVar == null) {
                x340Var.i0(-1766008764);
                r11 = z2;
            } else {
                x340Var.i0(-1766008763);
                otw.c(this.O0, new dyj0(v3uVar, giq0Var), (qim0) null, (ipb1) null, x340Var, 0, 12);
                r11 = 0;
            }
            x340Var.r((boolean) r11);
            z1p1.d(giq0Var.a(), x340Var, (int) r11);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c0e(this, kak0Var, z, t4h1Var, hdn0Var, i, watVar, i2);
        }
    }

    public final void g(kak0 kak0Var, ihh1 ihh1Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1960666168);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(h2c.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(kak0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.e(ihh1Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            lyj0 lyj0Var = kak0Var.v1;
            boolean z = lyj0Var.c;
            boolean z2 = lyj0Var.d;
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new eik0(this, (byte) 0);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean zI2 = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new eik0(this, (byte) 1);
                x340Var.s0(objT2);
            }
            n3p1.d(ihh1Var, z, z2, function0, (Function0) objT2, x340Var, (i2 & 14) | ((i2 >> 3) & 112));
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(this, kak0Var, ihh1Var, i, (byte) 28);
        }
    }

    public final mqw getBehavior() {
        return this.Y0;
    }

    public final f4r getData() {
        return this.a1;
    }

    public final void h(boolean z, obk0 obk0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1484205648);
        j06 j06Var = x340Var2.a;
        int i3 = i & 6;
        h2c h2cVar = h2c.a;
        if (i3 == 0) {
            i2 = (x340Var2.g(h2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(obk0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(this) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gra graVar = een.h;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarA = h2cVar.a(nim0Var, graVar);
            gra graVar2 = een.d;
            gfh0 gfh0VarC = t1c.c(graVar2, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            int i4 = i2;
            fq7.g(!z, (qim0) null, xay.e(2, irn1.o0(150, 0, (dlv) null, 6)), xay.f(2, irn1.o0(150, 0, (dlv) null, 6)), (String) null, apo.r(1947077298, new fik0(this, obk0Var, (byte) 0), x340Var2), x340Var2, 200064, 18);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0 qim0VarA2 = h2cVar.a(nim0Var, new gra(0.0f, 0.95f));
            gfh0 gfh0VarC2 = t1c.c(graVar2, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            fq7.g(z, (qim0) null, xay.e(2, irn1.o0(150, 0, (dlv) null, 6)), xay.f(2, irn1.o0(150, 0, (dlv) null, 6)), (String) null, apo.r(2026614427, new fik0(this, obk0Var, (byte) 1), x340Var), x340Var, ((i4 >> 3) & 14) | 200064, 18);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(this, z, obk0Var, i, (byte) 20);
        }
    }

    public final void i(kak0 kak0Var, t4h1 t4h1Var, boolean z, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1728727965);
        if ((i & 48) == 0) {
            i2 = (x340Var.i(kak0Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(t4h1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9361) != 9360)) {
            jkk0 jkk0VarS = s(kak0Var, t4h1Var, z);
            giq0 giq0Var = kak0Var.g1;
            otw.c(this.U0, jkk0VarS, (qim0) null, (ipb1) null, x340Var, 0, 12);
            if (this.b.U) {
                x340Var.i0(418696735);
                x340Var.r(false);
            } else {
                x340Var.i0(418429577);
                qim0 qim0VarD = u291.d(nim0.a, 1.0f);
                gfh0 gfh0VarC = t1c.c(een.X, false);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                otw.c(this.P0, k(t4h1Var), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(true);
                x340Var.r(false);
            }
            bfm0.a(this.V0, apo.r(-1978070880, new cik0(kak0Var, this, (byte) 1), x340Var), x340Var, 48);
            v3u v3uVar = (v3u) rwq.h(this.g.b, x340Var, 0).getValue();
            if (v3uVar == null) {
                x340Var.i0(420427123);
            } else {
                x340Var.i0(420427124);
                otw.c(this.O0, new dyj0(v3uVar, giq0Var), (qim0) null, (ipb1) null, x340Var, 0, 12);
            }
            x340Var.r(false);
            z1p1.d(giq0Var.a(), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h8i0(this, kak0Var, t4h1Var, z, i, (byte) 2);
        }
    }

    public final void j(kak0 kak0Var, t4h1 t4h1Var, b0k b0kVar, int i) {
        int i2;
        Object ur1Var;
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1998635089);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kak0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(t4h1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            lhg1 lhg1Var = kak0Var.S0;
            lyj0 lyj0Var = kak0Var.v1;
            Integer numValueOf = Integer.valueOf(lhg1Var.b.i);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new gik0(t4h1Var, null, (byte) 0);
                x340Var.s0(objT);
            }
            qxd0.t(numValueOf, x340Var, (vu30) objT);
            ruq0 ruq0Var = lhg1Var.b;
            q6w0 q6w0Var = lhg1Var.a;
            Integer numValueOf2 = Integer.valueOf(ruq0Var.t);
            boolean z3 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new gik0(t4h1Var, null, (byte) 1);
                x340Var.s0(objT2);
            }
            qxd0.t(numValueOf2, x340Var, (vu30) objT2);
            b8w0 b8w0Var = q6w0Var.a;
            boolean zI = (i3 == 32) | x340Var.i(kak0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new hik0(t4h1Var, kak0Var, null, (byte) 0);
                x340Var.s0(objT3);
            }
            qxd0.t(b8w0Var, x340Var, (vu30) objT3);
            hrr0 hrr0Var = t4h1Var.a.b;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = d3p1.H(this.a, this.W0, rih1.a);
                x340Var.s0(objT4);
            }
            ven0 ven0VarH = rwq.h((zob1) objT4, x340Var, 0);
            Object[] objArr = {(azb) hrr0Var.getValue(), q6w0Var.a, q6w0Var.b, q6w0Var.c, q6w0Var.d, (Map) ven0VarH.getValue()};
            boolean zI2 = x340Var.i(this) | x340Var.g(hrr0Var) | x340Var.i(kak0Var) | x340Var.g(ven0VarH) | (i3 == 32);
            Object objT5 = x340Var.T();
            if (zI2 || objT5 == m4cVar) {
                ur1Var = new ur1(this, kak0Var, t4h1Var, hrr0Var, ven0VarH, (lnm) null, (byte) 22);
                x340Var.s0(ur1Var);
            } else {
                ur1Var = objT5;
            }
            qxd0.u(objArr, (vu30) ur1Var, x340Var);
            Boolean boolValueOf = Boolean.valueOf(kak0Var.X0);
            boolean zI3 = x340Var.i(kak0Var) | (i3 == 32);
            Object objT6 = x340Var.T();
            if (zI3 || objT6 == m4cVar) {
                z = true;
                objT6 = new hik0(t4h1Var, kak0Var, null, (byte) 1);
                x340Var.s0(objT6);
            } else {
                z = true;
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT6);
            Long lValueOf = Long.valueOf(lyj0Var.b);
            boolean zI4 = x340Var.i(kak0Var) | (i3 == 32 ? z : false);
            Object objT7 = x340Var.T();
            if (zI4 || objT7 == m4cVar) {
                objT7 = new hik0(t4h1Var, kak0Var, null, (byte) 2);
                x340Var.s0(objT7);
            }
            qxd0.t(lValueOf, x340Var, (vu30) objT7);
            boolean zI5 = x340Var.i(kak0Var) | (i3 == 32 ? z : false);
            Object objT8 = x340Var.T();
            if (zI5 || objT8 == m4cVar) {
                objT8 = new hik0(t4h1Var, kak0Var, null, (byte) 3);
                x340Var.s0(objT8);
            }
            qxd0.t(lyj0Var, x340Var, (vu30) objT8);
            ruq0 ruq0Var2 = lhg1Var.b;
            Object[] objArr2 = {ruq0Var2.a, ruq0Var2.g, ruq0Var2.b, ruq0Var2.h, q6w0Var.b, q6w0Var.h, q6w0Var.i, q6w0Var.c, q6w0Var.t, q6w0Var.X, q6w0Var.d, q6w0Var.Y, q6w0Var.Z, q6w0Var.e, q6w0Var.N0, q6w0Var.O0};
            boolean zI6 = x340Var.i(kak0Var) | (i3 == 32);
            Object objT9 = x340Var.T();
            if (zI6 || objT9 == m4cVar) {
                objT9 = new hik0(kak0Var, t4h1Var, null);
                x340Var.s0(objT9);
            }
            qxd0.u(objArr2, (vu30) objT9, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vqd0(this, kak0Var, t4h1Var, i, (byte) 29);
        }
    }

    public final o6k0 l(kak0 kak0Var, ihh1 ihh1Var) {
        boolean z = !kak0Var.a && !kak0Var.g1.a() && i2p1.p(kak0Var) && (l2p1.m(kak0Var) || kak0Var.o1);
        boolean zM = l2p1.m(kak0Var);
        rxj0 rxj0Var = this.b;
        boolean z2 = rxj0Var.f;
        boolean z3 = kak0Var.a;
        boolean z4 = rxj0Var.D;
        boolean z5 = rxj0Var.V;
        lyj0 lyj0Var = kak0Var.v1;
        return new o6k0(z, zM, z3, z2, z4, z5, ihh1Var, lyj0Var.c, lyj0Var.d);
    }

    public final void m(kak0 kak0Var, vzq0 vzq0Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        hdn0 hdn0Var;
        ihh1 ihh1Var;
        boolean z2;
        es41 es41Var;
        int i3;
        int i4;
        hdn0 hdn0Var2;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(890347451);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kak0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(vzq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        int i5 = i2 | 3072;
        if ((i & 24576) == 0) {
            i5 |= x340Var.i(this) ? 16384 : 8192;
        }
        int i6 = i5;
        if (x340Var.Y(i6 & 1, (i6 & 9363) != 9362)) {
            int iA = (int) (((crl1) x340Var.k(t4k.u)).a() & 4294967295L);
            wat watVar = (wat) x340Var.k(t4k.h);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(0, x340Var);
            }
            hdn0 hdn0Var3 = (hdn0) objT;
            t4h1 t4h1VarN = d1o1.n(this.e, x340Var);
            j(kak0Var, t4h1VarN, x340Var, (i6 & 14) | ((i6 >> 6) & 896));
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT2);
            }
            c9n c9nVar = (c9n) objT2;
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = bb00.h(0, x340Var);
            }
            hdn0 hdn0Var4 = (hdn0) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = bb00.h(0, x340Var);
            }
            err0 err0Var2 = (hdn0) objT5;
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = bb00.h(0, x340Var);
            }
            err0 err0Var3 = (hdn0) objT6;
            int iI0 = watVar.i0(182.0f);
            err0 err0Var4 = (err0) hdn0Var4;
            int iS = err0Var4.s() * 2;
            float fO = iS > 0 ? yoi1.o(es41VarC.a.s() / iS, 0.0f, 1.0f) : 0.0f;
            err0 err0Var5 = err0Var;
            err0 err0Var6 = err0Var2;
            int iS2 = (err0Var3.s() + err0Var5.s()) - err0Var6.s();
            if (iS2 < 0) {
                iS2 = 0;
            }
            int i7 = iS2 + iS;
            int iS3 = es41VarC.f.s();
            if (i7 > iS3) {
                i7 = iS3;
            }
            qim0 qim0VarN = n(t4h1VarN, fO, x340Var);
            boolean zG = x340Var.g(es41VarC);
            Object objT7 = x340Var.T();
            if (zG || objT7 == m4cVar) {
                xh6 xh6Var = new xh6(hdn0Var4, (byte) 2);
                k7h0 k7h0Var = new k7h0(err0Var, err0Var3, err0Var2, hdn0Var4, (byte) 4);
                hdn0Var = hdn0Var4;
                rzg1 rzg1Var = new rzg1(new oik0(t4h1VarN, this, (byte) 0), k7h0Var, es41VarC, xh6Var);
                x340Var.s0(rzg1Var);
                objT7 = rzg1Var;
            } else {
                hdn0Var = hdn0Var4;
            }
            d6o0 d6o0Var = (d6o0) objT7;
            Boolean bool = (Boolean) ((mdt) t4h1VarN.A.e).getValue();
            boolean zBooleanValue = bool.booleanValue();
            if (((Boolean) ((hrr0) t4h1VarN.x.b).getValue()).booleanValue()) {
                ihh1Var = zBooleanValue ? ihh1.c : ihh1.b;
            } else {
                ihh1Var = ihh1.a;
            }
            boolean zH = x340Var.h(zBooleanValue) | x340Var.g(es41VarC);
            Object objT8 = x340Var.T();
            if (zH || objT8 == m4cVar) {
                objT8 = new hl0(zBooleanValue, es41VarC, hdn0Var, (lnm) null, (byte) 15);
                z2 = zBooleanValue;
                x340Var.s0(objT8);
            } else {
                z2 = zBooleanValue;
            }
            qxd0.t(bool, x340Var, (vu30) objT8);
            if (this.b.U) {
                hdn0Var = hdn0Var;
                ihh1Var = ihh1Var;
                x340Var.i0(-1373921049);
                x340Var.r(false);
            } else {
                x340Var.i0(-1374264126);
                boolean z4 = t4h1VarN.a.b.getValue() instanceof ryb;
                Boolean boolValueOf = Boolean.valueOf(z4);
                boolean zH2 = x340Var.h(z4) | x340Var.g(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0239: ARITH (r16v27 'zH2' boolean) = (wrap boolean:0x0231: INVOKE (r14v1 'x340Var' p.x340), (r0v46 'z4' boolean) VIRTUAL call: p.x340.h(boolean):boolean A[WRAPPED]) | (wrap boolean:0x0235: INVOKE (r14v1 'x340Var' p.x340), (r18v2 p.es41) VIRTUAL call: p.x340.g(java.lang.Object):boolean A[WRAPPED]) A[DECLARE_VAR] in method: p.wik0.m(p.kak0, p.vzq0, boolean, p.qim0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes10.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v2 p.es41
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 2174
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p.wik0.m(p.kak0, p.vzq0, boolean, p.qim0, p.b0k, int):void");
            }

            public final qim0 n(t4h1 t4h1Var, float f, b0k b0kVar) {
                float fO = yoi1.o(1.0f - f, 0.0f, 1.0f) * ((Number) z95.b((this.b.I && ((Boolean) ((mdt) t4h1Var.y.d).getValue()).booleanValue()) ? 0.8f : 0.0f, irn1.o0(300, 0, (dlv) null, 6), "minimapDimOverlay", (iu30) null, b0kVar, 3120, 20).getValue()).floatValue();
                uwr uwrVar = cbx.a;
                long j = cbx.a(b0kVar).a.c;
                x340 x340Var = (x340) b0kVar;
                boolean zD = x340Var.d(fO) | x340Var.f(j);
                Object objT = x340Var.T();
                if (zD || objT == fkj0.X) {
                    objT = new qf0(fO, j, (byte) 2);
                    x340Var.s0(objT);
                }
                return exd0.s(nim0.a, (iu30) objT);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0041  */
            public final cak0 o(kak0 kak0Var, ijf1 ijf1Var, t4h1 t4h1Var) {
                hrr0 hrr0Var;
                Integer num;
                hrr0 hrr0Var2;
                hrr0 hrr0Var3;
                hrr0 hrr0Var4;
                mdt mdtVar;
                ywv0 ywv0Var = t4h1Var.z;
                ruq0 ruq0Var = kak0Var.S0.b;
                ijf1 ijf1Var2 = ijf1.a;
                String str = ijf1Var == ijf1Var2 ? ruq0Var.c : ruq0Var.d;
                int iIntValue = ijf1Var == ijf1Var2 ? ruq0Var.i : ruq0Var.t;
                dxy dxyVar = t4h1Var.y;
                boolean zBooleanValue = (dxyVar == null || (mdtVar = (mdt) dxyVar.d) == null) ? false : ((Boolean) mdtVar.getValue()).booleanValue();
                Integer num2 = null;
                if (ijf1Var == ijf1Var2) {
                    if (ywv0Var == null || (hrr0Var4 = (hrr0) ywv0Var.f) == null) {
                        num = null;
                    } else {
                        num = (Integer) hrr0Var4.getValue();
                    }
                } else if (ywv0Var == null || (hrr0Var = (hrr0) ywv0Var.g) == null) {
                    num = null;
                } else {
                    num = (Integer) hrr0Var.getValue();
                }
                if (ijf1Var == ijf1Var2) {
                    if (ywv0Var != null && (hrr0Var3 = (hrr0) ywv0Var.h) != null) {
                        num2 = (Integer) hrr0Var3.getValue();
                    }
                } else if (ywv0Var != null && (hrr0Var2 = (hrr0) ywv0Var.i) != null) {
                    num2 = (Integer) hrr0Var2.getValue();
                }
                boolean z = zBooleanValue;
                if (num != null) {
                    iIntValue = num.intValue();
                } else if (num2 != null) {
                    iIntValue = num2.intValue();
                }
                int i = iIntValue;
                int i2 = ruq0Var.X;
                rxj0 rxj0Var = this.b;
                return new cak0(ijf1Var, str, i, i2, rxj0Var.I && z, rxj0Var.J, new loi0(t4h1Var, ijf1Var, (byte) 12), new pik0(t4h1Var, (byte) 0));
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void q(kak0 kak0Var, vzq0 vzq0Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
                int i2;
                qim0 qim0Var2;
                int i3;
                hdn0 hdn0Var;
                ihh1 ihh1Var;
                int i4;
                es41 es41Var;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-825378451);
                j06 j06Var = x340Var.a;
                if ((i & 6) == 0) {
                    i2 = (x340Var.i(kak0Var) ? 4 : 2) | i;
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= x340Var.g(vzq0Var) ? 32 : 16;
                }
                if ((i & 384) == 0) {
                    i2 |= x340Var.h(z) ? 256 : 128;
                }
                int i5 = i2 | 3072;
                if ((i & 24576) == 0) {
                    i5 |= x340Var.i(this) ? 16384 : 8192;
                }
                if (x340Var.Y(i5 & 1, (i5 & 9363) != 9362)) {
                    wat watVar = (wat) x340Var.k(t4k.h);
                    long jA = ((crl1) x340Var.k(t4k.u)).a();
                    int iM0 = (int) watVar.M0((int) (jA >> 32));
                    int iM1 = (int) watVar.M0((int) (jA & 4294967295L));
                    float fO = yoi1.o(1.0f - ((nko1.I(iM0, iM1) + 24.0f) / (iM1 - 72.0f)), 0.25f, 0.5f);
                    t4h1 t4h1VarN = d1o1.n(this.e, x340Var);
                    j(kak0Var, t4h1VarN, x340Var, (i5 & 14) | ((i5 >> 6) & 896));
                    Object objT = x340Var.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = bb00.h(0, x340Var);
                    }
                    hdn0 hdn0Var2 = (hdn0) objT;
                    Object objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = qxd0.M(o6x.a, x340Var);
                        x340Var.s0(objT2);
                    }
                    c9n c9nVar = (c9n) objT2;
                    es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
                    Object objT3 = x340Var.T();
                    if (objT3 == m4cVar) {
                        objT3 = bb00.h(0, x340Var);
                    }
                    err0 err0Var = (hdn0) objT3;
                    Object objT4 = x340Var.T();
                    if (objT4 == m4cVar) {
                        objT4 = bb00.h(0, x340Var);
                    }
                    err0 err0Var2 = (hdn0) objT4;
                    Object objT5 = x340Var.T();
                    if (objT5 == m4cVar) {
                        objT5 = bb00.h(0, x340Var);
                    }
                    err0 err0Var3 = (hdn0) objT5;
                    Object objT6 = x340Var.T();
                    if (objT6 == m4cVar) {
                        objT6 = bb00.h(0, x340Var);
                    }
                    hdn0 hdn0Var3 = (hdn0) objT6;
                    int iI0 = watVar.i0(182.0f);
                    err0 err0Var4 = err0Var;
                    int iS = ((int) ((1.0f - fO) * err0Var4.s())) - watVar.i0(12.0f);
                    if (iS < 0) {
                        iS = 0;
                    }
                    int iS2 = err0Var4.s();
                    err0 err0Var5 = err0Var2;
                    int iS3 = err0Var5.s();
                    err0 err0Var6 = err0Var3;
                    int iS4 = err0Var6.s();
                    if (iS2 <= 0 || iS3 <= 0 || (i3 = (((iS2 - (iS3 * 2)) - iS4) - iI0) / 2) < 0) {
                        i3 = 0;
                    }
                    int iS5 = err0Var5.s() + i3;
                    float fO2 = iS5 > 0 ? yoi1.o(es41VarC.a.s() / iS5, 0.0f, 1.0f) : 0.0f;
                    int iS6 = (((err0) hdn0Var3).s() + err0Var6.s()) - err0Var4.s();
                    int i6 = iS6 < 0 ? 0 : iS6;
                    int iS7 = ((err0Var6.s() + (err0Var5.s() * 2)) + iI0) - err0Var4.s();
                    int iMax = Math.max(i6, iS7 < 0 ? 0 : iS7) + iS5;
                    int iS8 = es41VarC.f.s();
                    if (iMax > iS8) {
                        iMax = iS8;
                    }
                    qim0 qim0VarN = n(t4h1VarN, fO2, x340Var);
                    boolean zG = x340Var.g(es41VarC);
                    Object objT7 = x340Var.T();
                    if (zG || objT7 == m4cVar) {
                        hdn0Var = hdn0Var3;
                        rzg1 rzg1Var = new rzg1(new oik0(t4h1VarN, this, (byte) 1), new lzm(iI0, err0Var, err0Var2, err0Var3, hdn0Var), es41VarC, new ka0(iI0, err0Var, err0Var2, err0Var3, (byte) 9));
                        x340Var.s0(rzg1Var);
                        objT7 = rzg1Var;
                    } else {
                        hdn0Var = hdn0Var3;
                    }
                    d6o0 d6o0Var = (d6o0) objT7;
                    Boolean bool = (Boolean) ((mdt) t4h1VarN.A.e).getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    if (((Boolean) ((hrr0) t4h1VarN.x.b).getValue()).booleanValue()) {
                        ihh1Var = zBooleanValue ? ihh1.c : ihh1.b;
                    } else {
                        ihh1Var = ihh1.a;
                    }
                    Integer numValueOf = Integer.valueOf(iS5);
                    boolean zH = x340Var.h(zBooleanValue) | x340Var.e(iS5) | x340Var.g(es41VarC);
                    Object objT8 = x340Var.T();
                    ihh1 ihh1Var2 = ihh1Var;
                    if (zH || objT8 == m4cVar) {
                        objT8 = new qik0(zBooleanValue, iS5, es41VarC, null);
                        x340Var.s0(objT8);
                    }
                    qxd0.s(bool, numValueOf, (vu30) objT8, x340Var);
                    if (this.b.U) {
                        t4h1VarN = t4h1VarN;
                        i4 = 0;
                        x340Var.i0(-156469035);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-156887070);
                        boolean z2 = t4h1VarN.a.b.getValue() instanceof ryb;
                        Boolean boolValueOf = Boolean.valueOf(z2);
                        boolean zH2 = x340Var.h(z2) | x340Var.g(es41VarC);
                        Object objT9 = x340Var.T();
                        if (zH2 || objT9 == m4cVar) {
                            objT9 = new jik0(z2, es41VarC, null, (byte) 1);
                            x340Var.s0(objT9);
                        }
                        qxd0.t(boolValueOf, x340Var, (vu30) objT9);
                        i4 = 0;
                        x340Var.r(false);
                    }
                    boolean z3 = i4;
                    t4h1 t4h1Var = t4h1VarN;
                    int i7 = iS;
                    tob1 tob1VarB = z95.b(zBooleanValue ? 1.0f : 0.0f, irn1.o0(200, i4, (dlv) null, 6), "waveformCentering", (iu30) null, x340Var, 3120, 20);
                    boolean zG2 = x340Var.g(es41VarC) | x340Var.e(iS5) | x340Var.e(iMax) | x340Var.i(c9nVar);
                    Object objT10 = x340Var.T();
                    if (zG2 || objT10 == m4cVar) {
                        objT10 = new nik0(es41VarC, iS5, iMax, c9nVar, (byte) 1);
                        x340Var.s0(objT10);
                    }
                    Function0 function0 = (Function0) objT10;
                    qim0 qim0Var3 = nim0.a;
                    qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
                    gra graVar = een.d;
                    gfh0 gfh0VarC = t1c.c(graVar, z3);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    boolean z4 = x340Var.S;
                    n4k n4kVar = hmb0.t1;
                    if (z4) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var, lljVar2);
                    Integer numValueOf2 = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf2, x340Var, lljVar3);
                    nko1.F(x340Var);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar4);
                    qim0 qim0VarW = uyn1.w(u291.d(qim0Var3, 1.0f), vzq0Var);
                    int i8 = iMax;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarW);
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
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
                    bby bbyVarA = xay.e(2, irn1.o0(200, 0, (dlv) null, 6)).a(xay.d(irn1.o0(200, 0, (dlv) null, 6), (fra) null, 14));
                    ln00 ln00VarA = xay.f(2, irn1.o0(200, 0, (dlv) null, 6)).a(xay.l(14, irn1.o0(200, 0, (dlv) null, 6)));
                    j2i j2iVarR = apo.r(-1615179239, new iwf0(this, kak0Var, ihh1Var2, (byte) 22), x340Var);
                    pbh pbhVar = pbh.a;
                    fq7.b(pbhVar, !zBooleanValue, (qim0) null, bbyVarA, ln00VarA, (String) null, j2iVarR, x340Var, 1600518, 18);
                    qim0 qim0VarR = i1p1.r(pbhVar.a(1.0f, qim0Var3, true));
                    Object objT11 = x340Var.T();
                    if (objT11 == m4cVar) {
                        objT11 = new myg0(err0Var, (byte) 12);
                        x340Var.s0(objT11);
                    }
                    qim0 qim0VarU = lrn1.u(qim0VarR, (iu30) objT11);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode3 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM3 = x340Var.m();
                    qim0 qim0VarE3 = zr7.E(x340Var, qim0VarU);
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
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
                    qim0 qim0VarH = l6o1.H(bmq0.L(qim0Var3, d6o0Var, (g6o0) null), es41VarC, false, 14);
                    boolean zE = x340Var.e(iI0) | x340Var.e(i7) | x340Var.g(es41VarC) | x340Var.g(tob1VarB) | x340Var.h(zBooleanValue);
                    Object objT12 = x340Var.T();
                    if (zE || objT12 == m4cVar) {
                        objT12 = new sik0(iI0, i7, err0Var2, err0Var3, hdn0Var, err0Var, es41VarC, zBooleanValue, tob1VarB);
                        es41Var = es41VarC;
                        x340Var.s0(objT12);
                    } else {
                        es41Var = es41VarC;
                    }
                    gfh0 gfh0Var = (gfh0) objT12;
                    int iHashCode4 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM4 = x340Var.m();
                    qim0 qim0VarE4 = zr7.E(x340Var, qim0VarH);
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0Var, x340Var, lljVar);
                    nko1.H(xos0VarM4, x340Var, lljVar2);
                    x0d.q(iHashCode4, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE4, x340Var, lljVar4);
                    qim0 qim0VarX = t3k1.x(u291.f(qim0Var3, 1.0f), "trackA");
                    gfh0 gfh0VarC3 = t1c.c(graVar, false);
                    int iHashCode5 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM5 = x340Var.m();
                    qim0 qim0VarE5 = zr7.E(x340Var, qim0VarX);
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
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
                    ijf1 ijf1Var = ijf1.a;
                    es41 es41Var2 = es41Var;
                    i1o1.e(this.t, t(kak0Var, ijf1Var), this.a, (qim0) null, (ipb1) null, h2j.b, (xu30) null, 0, (xu30) null, x340Var, 196672, 236);
                    cak0 cak0VarO = o(kak0Var, ijf1Var, t4h1Var);
                    h2c h2cVar = h2c.a;
                    otw.c(this.N0, cak0VarO, h2cVar.b(qim0Var3), (ipb1) null, x340Var, 0, 8);
                    x340Var.r(true);
                    qim0 qim0VarX2 = t3k1.x(u291.f(qim0Var3, 1.0f), "trackB");
                    gfh0 gfh0VarC4 = t1c.c(graVar, false);
                    int iHashCode6 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM6 = x340Var.m();
                    qim0 qim0VarE6 = zr7.E(x340Var, qim0VarX2);
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC4, x340Var, lljVar);
                    nko1.H(xos0VarM6, x340Var, lljVar2);
                    x0d.q(iHashCode6, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE6, x340Var, lljVar4);
                    ijf1 ijf1Var2 = ijf1.b;
                    i1o1.e(this.t, t(kak0Var, ijf1Var2), this.a, (qim0) null, (ipb1) null, h2j.c, (xu30) null, 0, (xu30) null, x340Var, 196672, 236);
                    otw.c(this.N0, o(kak0Var, ijf1Var2, t4h1Var), h2cVar.b(qim0Var3), (ipb1) null, x340Var, 0, 8);
                    x340Var.r(true);
                    qim0 qim0VarX3 = t3k1.x(u291.f(qim0Var3, 1.0f), "waveform");
                    gfh0 gfh0VarC5 = t1c.c(graVar, false);
                    int iHashCode7 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM7 = x340Var.m();
                    qim0 qim0VarE7 = zr7.E(x340Var, qim0VarX3);
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC5, x340Var, lljVar);
                    nko1.H(xos0VarM7, x340Var, lljVar2);
                    x0d.q(iHashCode7, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE7, x340Var, lljVar4);
                    i1o1.e(this.i, u(kak0Var, t4h1Var), this.a, (qim0) null, (ipb1) null, h2j.d, (xu30) null, 0, (xu30) null, x340Var, 196608, 236);
                    int i9 = (i5 >> 3) & 7168;
                    h(((Boolean) ((mdt) t4h1Var.A.e).getValue()).booleanValue(), p(kak0Var, ((Boolean) ((mdt) t4h1Var.y.e).getValue()).booleanValue()), x340Var, 6 | i9);
                    int i10 = i5 << 3;
                    int i11 = 6 | (i10 & 112);
                    g(kak0Var, ihh1Var2, x340Var, i11 | i9);
                    x340Var.r(true);
                    qim0 qim0VarX4 = t3k1.x(u291.f(qim0Var3, 1.0f), "presets");
                    Object objT13 = x340Var.T();
                    if (objT13 == m4cVar) {
                        objT13 = new myg0(hdn0Var2, (byte) 13);
                        x340Var.s0(objT13);
                    }
                    qim0 qim0VarThen = ern1.x(qim0VarX4, (iu30) objT13).then(qim0VarN);
                    gfh0 gfh0VarC6 = t1c.c(graVar, false);
                    int iHashCode8 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM8 = x340Var.m();
                    qim0 qim0VarE8 = zr7.E(x340Var, qim0VarThen);
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(n4kVar);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(gfh0VarC6, x340Var, lljVar);
                    nko1.H(xos0VarM8, x340Var, lljVar2);
                    x0d.q(iHashCode8, x340Var, lljVar3, x340Var);
                    nko1.H(qim0VarE8, x340Var, lljVar4);
                    uwr uwrVar = cbx.a;
                    wpo1.f(fO2, cbx.a(x340Var).a.c, function0, (qim0) null, apo.r(-915815941, new kik0(this, kak0Var, t4h1Var, z, (byte) 1), x340Var), x340Var, 196656);
                    x340Var = x340Var;
                    x340Var.r(true);
                    x340Var.r(true);
                    mqn1.b(0, cbx.a(x340Var).a.c, function0, x340Var, h2cVar.a(qim0Var3, een.X), i8 > 0 && es41Var2.a.s() < i8 && !zBooleanValue);
                    x340Var.r(true);
                    x340Var.r(true);
                    i(kak0Var, t4h1Var, z, x340Var, i11 | (i10 & 7168) | (i5 & 57344));
                    x340Var.r(true);
                    qim0Var2 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                }
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new lik0(this, kak0Var, vzq0Var, z, qim0Var2, i, (byte) 1);
                }
            }

            /* JADX WARN: Code duplicated, block: B:68:0x00fa  */
            /* JADX WARN: Code duplicated, block: B:81:0x014c  */
            public final jkk0 s(kak0 kak0Var, t4h1 t4h1Var, boolean z) {
                fkc1 fkc1Var;
                boolean z2;
                boolean z3;
                oyb oybVar = t4h1Var.a;
                r4h1 r4h1Var = t4h1Var.w;
                azb azbVar = (azb) oybVar.b.getValue();
                boolean z4 = (azbVar instanceof zyb) || (azbVar instanceof syb) || (azbVar instanceof tyb) || (azbVar instanceof uyb) || (azbVar instanceof wyb) || (azbVar instanceof vyb);
                Parcelable.Creator<fkc1> creator = fkc1.CREATOR;
                if (azbVar instanceof zyb) {
                    fkc1Var = fkc1.Volume;
                } else if (azbVar instanceof syb) {
                    fkc1Var = fkc1.Eq;
                } else if (azbVar instanceof tyb) {
                    fkc1Var = fkc1.Filter;
                } else if (azbVar instanceof uyb) {
                    fkc1Var = fkc1.Effects;
                } else if (azbVar instanceof wyb) {
                    fkc1Var = fkc1.Looping;
                } else {
                    fkc1Var = azbVar instanceof vyb ? fkc1.Jogwheel : fkc1.Volume;
                }
                fkc1 fkc1Var2 = fkc1Var;
                lhg1 lhg1Var = kak0Var.S0;
                q6w0 q6w0Var = lhg1Var.a;
                b8w0 b8w0Var = q6w0Var.a;
                buk1 buk1Var = q6w0Var.b;
                duk1 duk1Var = buk1Var != null ? buk1Var.a : null;
                hez hezVar = q6w0Var.c;
                jez jezVar = hezVar != null ? hezVar.a : null;
                fa20 fa20Var = q6w0Var.d;
                ha20 ha20Var = fa20Var != null ? fa20Var.a : null;
                hce1 hce1Var = (hce1) r4h1Var.a;
                hce1 hce1Var2 = (hce1) r4h1Var.a;
                hce1 hce1Var3 = (hce1) r4h1Var.d;
                hce1 hce1Var4 = (hce1) r4h1Var.c;
                hce1 hce1Var5 = (hce1) r4h1Var.b;
                boolean zBooleanValue = ((Boolean) ((mdt) hce1Var.e).getValue()).booleanValue();
                q6w0 q6w0Var2 = lhg1Var.a;
                q6w0 q6w0Var3 = lhg1Var.a;
                boolean z5 = (q6w0Var2.h == null && q6w0Var2.i == null) ? false : true;
                s69 s69Var = (s69) ((hrr0) hce1Var2.b).getValue();
                ha20 ha20Var2 = ha20Var;
                s69 s69Var2 = (s69) ((hrr0) hce1Var2.c).getValue();
                duk1 duk1Var2 = (duk1) ((hrr0) hce1Var2.d).getValue();
                boolean zBooleanValue2 = ((Boolean) ((mdt) hce1Var5.e).getValue()).booleanValue();
                gez gezVar = q6w0Var3.t;
                if ((gezVar != null ? gezVar.a : null) != null) {
                    z2 = true;
                } else {
                    gez gezVar2 = q6w0Var3.X;
                    if ((gezVar2 != null ? gezVar2.a : null) != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                gez gezVar3 = (gez) ((hrr0) hce1Var5.b).getValue();
                gez gezVar4 = (gez) ((hrr0) hce1Var5.c).getValue();
                jez jezVar2 = (jez) ((hrr0) hce1Var5.d).getValue();
                boolean zBooleanValue3 = ((Boolean) ((mdt) hce1Var4.e).getValue()).booleanValue();
                r920 r920Var = q6w0Var3.Y;
                if ((r920Var != null ? r920Var.a : null) != null) {
                    z3 = true;
                } else {
                    r920 r920Var2 = q6w0Var3.Z;
                    if ((r920Var2 != null ? r920Var2.a : null) != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                r920 r920Var3 = (r920) ((hrr0) hce1Var4.b).getValue();
                r920 r920Var4 = (r920) ((hrr0) hce1Var4.c).getValue();
                ha20 ha20Var3 = (ha20) ((hrr0) hce1Var4.d).getValue();
                boolean zBooleanValue4 = ((Boolean) ((mdt) hce1Var3.e).getValue()).booleanValue();
                boolean z6 = (q6w0Var3.N0 == null && q6w0Var3.O0 == null) ? false : true;
                ox30 ox30Var = (ox30) ((hrr0) hce1Var3.b).getValue();
                ox30 ox30Var2 = (ox30) ((hrr0) hce1Var3.c).getValue();
                rx30 rx30Var = (rx30) ((hrr0) hce1Var3.d).getValue();
                boolean zBooleanValue5 = ((Boolean) ((mdt) r4h1Var.e).getValue()).booleanValue();
                px30 px30Var = q6w0Var3.e;
                rx30 rx30Var2 = px30Var != null ? px30Var.a : null;
                k7f0 k7f0Var = q6w0Var3.g;
                m7f0 m7f0Var = k7f0Var != null ? k7f0Var.a : null;
                taa0 taa0Var = q6w0Var3.f;
                return new jkk0(z4, fkc1Var2, b8w0Var, duk1Var, jezVar, ha20Var2, zBooleanValue, z5, s69Var, s69Var2, duk1Var2, zBooleanValue2, z2, gezVar3, gezVar4, jezVar2, zBooleanValue3, z3, r920Var3, r920Var4, ha20Var3, zBooleanValue4, z6, ox30Var, ox30Var2, rx30Var, zBooleanValue5, rx30Var2, m7f0Var, z, taa0Var != null ? taa0Var.a : null, this.b.l);
            }

            public final mlk0 t(kak0 kak0Var, ijf1 ijf1Var) {
                String str;
                Float f;
                lhg1 lhg1Var = kak0Var.S0;
                int iOrdinal = ijf1Var.ordinal();
                if (iOrdinal == 0) {
                    str = lhg1Var.b.a;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    str = lhg1Var.b.b;
                }
                boolean z = kak0Var.c;
                int iOrdinal2 = ijf1Var.ordinal();
                if (iOrdinal2 == 0) {
                    f = kak0Var.l1;
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    f = kak0Var.m1;
                }
                rxj0 rxj0Var = this.b;
                int i = rxj0Var.k0;
                if (ijf1Var != ijf1.b || !rxj0Var.Y || !kak0Var.c) {
                    i = 0;
                }
                return new mlk0(str, lhg1Var, z, f, i, k8p1.f(kak0Var) == 2, 320);
            }

            public final cok0 u(kak0 kak0Var, t4h1 t4h1Var) {
                azb azbVar;
                ywv0 ywv0Var;
                hrr0 hrr0Var;
                ywv0 ywv0Var2;
                hrr0 hrr0Var2;
                ywv0 ywv0Var3;
                mdt mdtVar;
                hce1 hce1Var;
                ywv0 ywv0Var4;
                mdt mdtVar2;
                ywv0 ywv0Var5;
                mdt mdtVar3;
                dxy dxyVar;
                dxy dxyVar2;
                dxy dxyVar3;
                ywv0 ywv0Var6;
                mdt mdtVar4;
                ywv0 ywv0Var7;
                mdt mdtVar5;
                dxy dxyVar4;
                hce1 hce1Var2;
                mdt mdtVar6;
                boolean z = ((t4h1Var == null || (dxyVar4 = t4h1Var.y) == null) ? true : ((Boolean) ((mdt) dxyVar4.f).getValue()).booleanValue()) && !((t4h1Var == null || (hce1Var2 = t4h1Var.A) == null || (mdtVar6 = (mdt) hce1Var2.e) == null) ? false : ((Boolean) mdtVar6.getValue()).booleanValue());
                ycu0 ycu0Var = kak0Var.g;
                lhg1 lhg1Var = kak0Var.S0;
                if (t4h1Var == null || (azbVar = (azb) t4h1Var.a.b.getValue()) == null) {
                    azbVar = xyb.a;
                }
                azb azbVar2 = azbVar;
                rxj0 rxj0Var = this.b;
                hdl1 hdl1Var = rxj0Var.e;
                boolean zBooleanValue = (t4h1Var == null || (ywv0Var7 = t4h1Var.z) == null || (mdtVar5 = (mdt) ywv0Var7.a) == null) ? false : ((Boolean) mdtVar5.getValue()).booleanValue();
                boolean zBooleanValue2 = (t4h1Var == null || (ywv0Var6 = t4h1Var.z) == null || (mdtVar4 = (mdt) ywv0Var6.b) == null) ? false : ((Boolean) mdtVar4.getValue()).booleanValue();
                boolean zBooleanValue3 = (t4h1Var == null || (dxyVar3 = t4h1Var.y) == null) ? false : ((Boolean) ((mdt) dxyVar3.g).getValue()).booleanValue();
                boolean zBooleanValue4 = (t4h1Var == null || (dxyVar2 = t4h1Var.y) == null) ? false : ((Boolean) ((hrr0) dxyVar2.b).getValue()).booleanValue();
                boolean zBooleanValue5 = (t4h1Var == null || (dxyVar = t4h1Var.y) == null) ? false : ((Boolean) ((hrr0) dxyVar.c).getValue()).booleanValue();
                boolean zBooleanValue6 = (t4h1Var == null || (ywv0Var5 = t4h1Var.z) == null || (mdtVar3 = (mdt) ywv0Var5.c) == null) ? true : ((Boolean) mdtVar3.getValue()).booleanValue();
                boolean zBooleanValue7 = (t4h1Var == null || (ywv0Var4 = t4h1Var.z) == null || (mdtVar2 = (mdt) ywv0Var4.d) == null) ? false : ((Boolean) mdtVar2.getValue()).booleanValue();
                boolean zBooleanValue8 = (t4h1Var == null || (hce1Var = t4h1Var.A) == null) ? true : ((Boolean) ((mdt) hce1Var.d).getValue()).booleanValue();
                boolean zBooleanValue9 = (t4h1Var == null || (ywv0Var3 = t4h1Var.z) == null || (mdtVar = (mdt) ywv0Var3.e) == null) ? true : ((Boolean) mdtVar.getValue()).booleanValue();
                boolean z2 = kak0Var.X0;
                int i = rxj0Var.x;
                boolean z3 = rxj0Var.y;
                int i2 = rxj0Var.B;
                Integer num = null;
                Integer num2 = (t4h1Var == null || (ywv0Var2 = t4h1Var.z) == null || (hrr0Var2 = (hrr0) ywv0Var2.f) == null) ? null : (Integer) hrr0Var2.getValue();
                if (t4h1Var != null && (ywv0Var = t4h1Var.z) != null && (hrr0Var = (hrr0) ywv0Var.g) != null) {
                    num = (Integer) hrr0Var.getValue();
                }
                Integer num3 = num;
                ArrayList arrayListJ = i2p1.j(kak0Var);
                boolean z4 = rxj0Var.U;
                boolean z5 = rxj0Var.O;
                Float f = kak0Var.j1;
                Float f2 = kak0Var.l1;
                return new cok0(lhg1Var, azbVar2, hdl1Var, ycu0Var, zBooleanValue, zBooleanValue2, zBooleanValue3, z, zBooleanValue4, zBooleanValue5, zBooleanValue6, zBooleanValue7, zBooleanValue8, zBooleanValue9, z2, i, z3, num2, num3, new vik0(t4h1Var, (byte) 0), new pik0(t4h1Var, (byte) 1), new pik0(t4h1Var, (byte) 2), new vik0(t4h1Var, (byte) 1), i2, arrayListJ, z4, z5, f, f2 != null ? f2.floatValue() : 1.0f);
            }
        }
