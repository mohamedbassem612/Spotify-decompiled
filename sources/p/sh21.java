package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sh21 implements xpw {
    public final h7q a;
    public final o7q b;
    public final uq7 c;
    public final psw d;
    public final eih1 e;

    public sh21(h7q h7qVar, o7q o7qVar, p7q p7qVar, smt0 smt0Var) {
        uq7 uq7Var;
        this.a = h7qVar;
        this.b = o7qVar;
        switch (p7qVar.a) {
            case 0:
                s7q s7qVar = (s7q) p7qVar.b.d;
                bfd bfdVar = (bfd) s7qVar.X5.get();
                daq daqVar = s7qVar.b;
                uq7Var = new uq7(smt0Var, new xg21(new dc31(bfdVar, (yqg) daqVar.J1.get(), (byte) 17), new o860((bfd) s7qVar.X5.get(), (mr20) daqVar.cc.get(), (kbd) s7qVar.i6.get(), (ahu0) daqVar.gp.get(), (byte) 29), (kt91) daqVar.f8.get(), (uz5) daqVar.Ne.get(), (fwn0) daqVar.Pe.get(), (Context) daqVar.x1.a));
                break;
            default:
                teq teqVar = p7qVar.b.d;
                bfd bfdVar2 = (bfd) teqVar.O1.get();
                daq daqVar2 = teqVar.d;
                uq7Var = new uq7(smt0Var, new xg21(new dc31(bfdVar2, (yqg) daqVar2.J1.get(), (byte) 17), new o860((bfd) teqVar.O1.get(), (mr20) daqVar2.cc.get(), (kbd) teqVar.P1.get(), (ahu0) daqVar2.gp.get(), (byte) 29), (kt91) daqVar2.f8.get(), (uz5) daqVar2.Ne.get(), (fwn0) daqVar2.Pe.get(), (Context) daqVar2.x1.a));
                break;
        }
        this.c = uq7Var;
        j2i j2iVar = new j2i(-425605697, new dr01(this, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        this.e = new eih1();
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.d;
    }

    public final void e(goe goeVar, w4i1 w4i1Var, t7q0 t7q0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        s1m s1mVar;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1832426622);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(goeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(w4i1Var) : b0kVar3.i(w4i1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(t7q0Var) : b0kVar3.i(t7q0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(this) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, b0kVar3);
                b0kVar3.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            cir0 cir0Var = (cir0) b0kVar3.k(k2r0.a);
            boolean zG = b0kVar3.g(cir0Var) | b0kVar3.g(goeVar);
            Object objT2 = b0kVar3.T();
            if (zG || objT2 == m4cVar) {
                String str = goeVar.a;
                n601 n601Var = new n601(iu30Var, (byte) 11);
                iuy0 iuy0Var = new iuy0(iu30Var, (byte) 9);
                n601 n601Var2 = new n601(iu30Var, (byte) 12);
                o7q o7qVar = this.b;
                switch (o7qVar.a) {
                    case 0:
                        s1mVar = new s1m(str, cir0Var, n601Var, iuy0Var, n601Var2, (q8n) o7qVar.b.b.V2.get());
                        break;
                    default:
                        s1mVar = new s1m(str, cir0Var, n601Var, iuy0Var, n601Var2, (q8n) o7qVar.b.b.V2.get());
                        break;
                }
                objT2 = s1mVar;
                b0kVar3.s0(objT2);
            }
            s1m s1mVar2 = (s1m) objT2;
            boolean zG2 = b0kVar3.g(goeVar);
            Object objT3 = b0kVar3.T();
            if (zG2 || objT3 == m4cVar) {
                String str2 = goeVar.a;
                objT3 = this.a.a(str2, pcf.d(6, str2, (String) null), false, w4i1Var, new lz20(), null, null, null, new hl11(iu30Var, c9nVar, s1mVar2, (byte) 9));
                b0kVar3.s0(objT3);
            }
            b0kVar2 = b0kVar3;
            otw.c((h7f) objT3, new s6f(t7q0Var, 1, false, true, true, true), (qim0) null, (ipb1) null, b0kVar2, 0, 12);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0((byte) 25, i, this, goeVar, w4i1Var, t7q0Var, iu30Var);
        }
    }

    public final void f(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-534235148);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            qim0 qim0Var2 = nim0.a;
            t1c.a(cwl1.l0(dug.f(uyn1.y(u291.h(u291.f(qim0Var2, 1.0f), 60.0f), 16.0f, 8.0f), cbx.a(x340Var).a.b.a(), cr31VarB), 0L, cr31VarB, 13), x340Var, 0);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tc11(this, qim0Var, i, (byte) 15);
        }
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
