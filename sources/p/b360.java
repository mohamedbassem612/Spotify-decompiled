package p;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b360 extends hab0 implements xu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ j2i d;
    public final /* synthetic */ j2i e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b360(boolean z, boolean z2, float f, j2i j2iVar, j2i j2iVar2) {
        super(3);
        this.a = z;
        this.b = z2;
        this.c = f;
        this.d = j2iVar;
        this.e = j2iVar2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ecx ecxVar;
        float fM0;
        float f;
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        long j = i2cVar.b;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18);
        j06 j06Var = x340Var2.a;
        if (zY) {
            m4c m4cVar = fkj0.X;
            kiv kivVar = t4k.u;
            uvb0 uvb0Var = (crl1) x340Var2.k(kivVar);
            boolean zG = x340Var2.g(uvb0Var);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new yr80(uvb0Var.a());
                x340Var2.s0(objT);
            }
            long j2 = ((yr80) objT).a;
            kiv kivVar2 = t4k.h;
            long jT = ((wat) x340Var2.k(kivVar2)).t(o0c.R(j2));
            boolean zF = x340Var2.f(jT);
            Object objT2 = x340Var2.T();
            if (zF || objT2 == m4cVar) {
                objT2 = d9y0.n(s3v.b(jT), s3v.a(jT));
                x340Var2.s0(objT2);
            }
            ltl1 ltl1Var = ((htl1) objT2).a;
            int i = hjl.e(j) ? hjl.i(j) : hjl.k(j);
            boolean z = this.a;
            if (z && gho1.m(ltl1Var)) {
                x340Var2.i0(-336478722);
                int iA = (int) (((crl1) x340Var2.k(kivVar)).a() & 4294967295L);
                cbx.a.getClass();
                int i2 = (int) (i / ((ecx) uwr.d.getValue()).a);
                int iH = hjl.h(j);
                if (i2 > iH) {
                    i2 = iH;
                }
                int i3 = (int) (iA * 0.5f);
                if (i2 > i3) {
                    i2 = i3;
                }
                fM0 = ((wat) x340Var2.k(kivVar2)).M0(i2);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-335968090);
                if (((Configuration) x340Var2.k(AndroidCompositionLocals_androidKt.a)).orientation == 2) {
                    cbx.a.getClass();
                    ecxVar = (ecx) uwr.g.getValue();
                } else {
                    cbx.a.getClass();
                    ecxVar = (ecx) uwr.d.getValue();
                }
                int i4 = (int) (i / ecxVar.a);
                int iH2 = hjl.h(j);
                if (i4 > iH2) {
                    i4 = iH2;
                }
                fM0 = ((wat) x340Var2.k(kivVar2)).M0(i4);
                x340Var2.r(false);
            }
            if (z && gho1.m(ltl1Var)) {
                f = 0.5f * fM0;
            } else if (gho1.m(ltl1Var)) {
                f = fM0 * (this.b ? 0.4f : 0.3f);
            } else {
                f = Float.NaN;
            }
            float f2 = Float.isNaN(f) ? Float.NaN : f + this.c;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(nim0Var, 1.0f), fM0);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarH);
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
            this.d.invoke(x340Var2, 0);
            qim0 qim0VarA = h2c.a.a(u291.j(0.0f, f2, 1, u291.f(nim0Var, 1.0f)), een.t);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarA);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            ktd.s(this.e, x340Var2, 0, true, true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
