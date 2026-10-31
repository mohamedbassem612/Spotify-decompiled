package p;

import com.spotify.wrapped.v1.proto.StoryCard;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fyg1 implements qj41 {
    public final cyg1 a;
    public final cyg1 b;
    public final boolean c;
    public final hcf1 d;
    public final qk41 e;

    public fyg1(cyg1 cyg1Var, cyg1 cyg1Var2, boolean z, hcf1 hcf1Var) {
        this.a = cyg1Var;
        this.b = cyg1Var2;
        this.c = z;
        this.d = hcf1Var;
        this.e = z ? new ok41(1800) : pk41.a;
    }

    @Override // p.qj41
    public final void a(i2c i2cVar, int i, rk41 rk41Var, Function0 function0, b0k b0kVar, int i2) {
        int i3;
        b0k b0kVar2;
        fyg1 fyg1Var;
        Object kxxVar;
        int i4;
        b0k b0kVar3;
        Float fValueOf = Float.valueOf(1.0f);
        m4c m4cVar = fkj0.X;
        Float fValueOf2 = Float.valueOf(0.0f);
        b0k b0kVar4 = (x340) b0kVar;
        b0kVar4.k0(324637036);
        if ((i2 & 6) == 0) {
            i3 = (b0kVar4.g(i2cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= b0kVar4.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? b0kVar4.g(rk41Var) : b0kVar4.i(rk41Var) ? 256 : 128;
        }
        if ((i2 & 24576) == 0) {
            i3 |= b0kVar4.i(this) ? 16384 : 8192;
        }
        if (b0kVar4.Y(i3 & 1, (i3 & 8339) != 8338)) {
            wat watVar = (wat) b0kVar4.k(t4k.h);
            int iI0 = watVar.i0(i2cVar.c());
            int iI1 = watVar.i0(96.0f);
            boolean zE = b0kVar4.e(iI0);
            Object objT = b0kVar4.T();
            if (zE || objT == m4cVar) {
                objT = bb00.h(0, b0kVar4);
            }
            err0 err0Var = (hdn0) objT;
            float fO = iI0 <= 0 ? 0.0f : yoi1.o(err0Var.s() / iI0, 0.0f, 1.0f);
            Integer numValueOf = Integer.valueOf(i);
            Float fValueOf3 = Float.valueOf(fO);
            boolean zG = b0kVar4.g(err0Var) | b0kVar4.i(this) | b0kVar4.d(fO);
            Object objT2 = b0kVar4.T();
            if (zG || objT2 == m4cVar) {
                i4 = iI1;
                b0kVar3 = b0kVar4;
                kxxVar = new kxx(err0Var, this, fO, (lnm) null, (byte) 3);
                b0kVar3.s0(kxxVar);
            } else {
                b0kVar3 = b0kVar4;
                kxxVar = objT2;
                i4 = iI1;
            }
            qxd0.s(numValueOf, fValueOf3, (vu30) kxxVar, b0kVar3);
            b0kVar3.f0(-1556399763, Integer.valueOf(i));
            ilv.a.getClass();
            pxg1 pxg1Var = new pxg1(700, 100, flv.g);
            tzg1 tzg1Var = rno1.a;
            fyg1Var = this;
            b0k b0kVar5 = b0kVar3;
            ven0 ven0VarS = zod.S(new hsi1("titleIn", fValueOf, fValueOf2, pxg1Var, tzg1Var), rk41Var.a, fyg1Var.c, (Function0) null, b0kVar5, 8, 8);
            b0kVar5.r(false);
            b0kVar5.f0(-1556381098, Integer.valueOf(i));
            b0kVar2 = b0kVar5;
            hsi1 hsi1Var = new hsi1("subtitleIn", fValueOf, fValueOf2, new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 800, flv.d), tzg1Var);
            boolean z = rk41Var.a;
            boolean z2 = (i3 & 896) == 256 || ((i3 & 512) != 0 && b0kVar2.i(rk41Var));
            Object objT3 = b0kVar2.T();
            if (z2 || objT3 == m4cVar) {
                objT3 = new kf6(rk41Var, (byte) 8);
                b0kVar2.s0(objT3);
            }
            ven0 ven0VarS2 = zod.S(hsi1Var, z, fyg1Var.c, (Function0) objT3, b0kVar2, 8, 0);
            b0kVar2.r(false);
            float fC = i2cVar.c() * 0.125f;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarA = i2cVar.a(u291.j(0.0f, i2cVar.c() * 0.875f, 1, u291.f(nim0Var, 1.0f)), een.e);
            boolean zG2 = b0kVar2.g(err0Var) | b0kVar2.e(i4);
            Object objT4 = b0kVar2.T();
            if (zG2 || objT4 == m4cVar) {
                objT4 = new ym(err0Var, i4, (byte) 28);
                b0kVar2.s0(objT4);
            }
            qim0 qim0VarU = lrn1.u(qim0VarA, (iu30) objT4);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar2, 48);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarU);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw 0;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            op71.g(b0kVar2, u291.h(nim0Var, fC));
            op71.g(b0kVar2, u291.h(nim0Var, 96.0f));
            uwr uwrVar = cbx.a;
            float f = cbx.b(b0kVar2).b.b;
            vnr0 vnr0Var = (vnr0) fyg1Var.a.invoke(b0kVar2, 0);
            qim0 qim0VarZ = uyn1.z(f, 0.0f, 2, u291.f(nim0Var, 1.0f));
            boolean zG3 = b0kVar2.g(ven0VarS);
            Object objT5 = b0kVar2.T();
            if (zG3 || objT5 == m4cVar) {
                objT5 = new ctd1(ven0VarS, (byte) 29);
                b0kVar2.s0(objT5);
            }
            qgo1.f(vnr0Var, i541.C(qim0VarZ, (iu30) objT5), (a0e1) null, 0, false, (iu30) null, b0kVar2, 8, 60);
            cvx cvxVar = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
            vnr0 vnr0Var2 = (vnr0) fyg1Var.b.invoke(b0kVar2, 0);
            qim0 qim0VarZ2 = uyn1.z(f, 0.0f, 2, u291.f(nim0Var, 1.0f));
            boolean zG4 = b0kVar2.g(ven0VarS2);
            Object objT6 = b0kVar2.T();
            if (zG4 || objT6 == m4cVar) {
                objT6 = new eyg1(ven0VarS2, (byte) 0);
                b0kVar2.s0(objT6);
            }
            qgo1.f(vnr0Var2, i541.C(qim0VarZ2, (iu30) objT6), (a0e1) null, 0, false, (iu30) null, b0kVar2, 8, 60);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
            op71.g(b0kVar2, u291.h(nim0Var, 96.0f));
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar4;
            fyg1Var = this;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(fyg1Var, i2cVar, i, rk41Var, function0, i2, (byte) 22);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        return this.e;
    }
}
