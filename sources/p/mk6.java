package p;

import androidx.compose.ui.graphics.Brush;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mk6 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mk6(Object obj, boolean z, boolean z2, byte b) {
        super(3);
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = z2;
    }

    public static final float a(float f, float f2) {
        return (f2 / 44.0f) * f;
    }

    public static final float d(float f, float f2) {
        return (f2 / 336.0f) * f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        u7h u7hVar;
        long j;
        x340 x340Var;
        Throwable th;
        Brush brush;
        boolean z;
        qim0 qim0VarR;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                i2c i2cVar = (i2c) obj;
                x340 x340Var2 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                cj6 cj6Var = (cj6) obj4;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var2.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var3 = x340Var2;
                boolean zY = x340Var3.Y(iIntValue & 1, (iIntValue & 19) != 18);
                j06 j06Var = x340Var3.a;
                if (!zY) {
                    x340Var3.b0();
                    return rih1Var;
                }
                float fD = i2cVar.d();
                float fC = i2cVar.c();
                boolean z2 = cj6Var.e;
                ArrayList arrayList = cj6Var.f;
                qim0 qim0Var = nim0.a;
                boolean z3 = this.b;
                if (z2) {
                    x340Var3.i0(-1255994820);
                    x340Var3.r(false);
                } else {
                    x340Var3.i0(-1256344624);
                    qim0 qim0VarH = u291.h(u291.v(eqr0.C(qim0Var, a(fD, z3 ? 7.5f : 22.5f), d(fC, 274.0f)), a(fD, 14.0f)), d(fC, 0.5f));
                    boolean zG = x340Var3.g(cj6Var);
                    Object objT = x340Var3.T();
                    if (zG || objT == m4cVar) {
                        objT = new gk6(cj6Var, (byte) 1);
                        x340Var3.s0(objT);
                    }
                    t1c.a(exd0.r(qim0VarH, (iu30) objT), x340Var3, 0);
                    x340Var3.r(false);
                }
                boolean z4 = o7h.j0(arrayList).size() > 1;
                if (z4 || (u7hVar = (u7h) o7h.s0(arrayList)) == null) {
                    long j2 = u7h.f;
                    j = j2;
                } else {
                    x340Var3 = x340Var3;
                    j = u7hVar.a;
                }
                if (z4) {
                    x340Var = x340Var3;
                    x340Var.i0(-1255756833);
                    boolean zG2 = x340Var.g(arrayList);
                    th = null;
                    Object objT2 = x340Var.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = v9c.s(arrayList, 0.0f, 0.0f, 14);
                        x340Var.s0(objT2);
                    }
                    brush = (Brush) objT2;
                    x340Var.r(false);
                } else {
                    x340Var = x340Var3;
                    th = null;
                    x340Var.i0(-1255660826);
                    x340Var.r(false);
                    brush = null;
                }
                qim0 qim0VarH2 = u291.h(u291.v(qim0Var, fD), fC);
                if (brush != null) {
                    x340Var.i0(-1255486513);
                    qim0 qim0VarD = i541.D(qim0Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 1, (f2b) null, 983039);
                    boolean zG3 = x340Var.g(brush);
                    Object objT3 = x340Var.T();
                    if (zG3 || objT3 == m4cVar) {
                        objT3 = new hk6(brush, (byte) 1);
                        x340Var.s0(objT3);
                    }
                    qim0VarR = exd0.r(qim0VarD, (iu30) objT3);
                    z = false;
                    x340Var.r(false);
                } else {
                    rih1Var = rih1Var;
                    z = false;
                    x340Var.i0(-1255159370);
                    x340Var.r(false);
                    qim0VarR = qim0Var;
                }
                qim0 qim0VarThen = qim0VarH2.then(qim0VarR);
                cj6 cj6Var2 = (cj6) obj4;
                gfh0 gfh0VarC = t1c.c(een.d, z);
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw th;
                }
                x340Var.m0();
                boolean z5 = x340Var.S;
                n4k n4kVar = hmb0.t1;
                if (z5) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var, lljVar3);
                nko1.F(x340Var);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var, lljVar4);
                boolean zH = x340Var.h(z3) | x340Var.d(fD);
                Object objT4 = x340Var.T();
                if (zH || objT4 == m4cVar) {
                    objT4 = new ik6(z3, fD, (byte) 0);
                    x340Var.s0(objT4);
                }
                iu30 iu30Var = (iu30) objT4;
                boolean zD = x340Var.d(fD);
                Object objT5 = x340Var.T();
                if (zD || objT5 == m4cVar) {
                    objT5 = new jk6((byte) 0, fD);
                    x340Var.s0(objT5);
                }
                iu30 iu30Var2 = (iu30) objT5;
                boolean zD2 = x340Var.d(fC);
                Object objT6 = x340Var.T();
                if (zD2 || objT6 == m4cVar) {
                    objT6 = new jk6((byte) 1, fC);
                    x340Var.s0(objT6);
                }
                long j3 = j;
                x340 x340Var4 = x340Var;
                rk6.d(cj6Var2, j3, iu30Var, iu30Var2, (iu30) objT6, x340Var4, 0);
                float fA = a(fD, 29.0f);
                float fA2 = a(fD, z3 != 0 ? 0.0f : 15.0f);
                qim0 qim0VarH3 = u291.h(u291.v(eqr0.C(qim0Var, fA2, d(fC, 147.0f)), fA), d(fC, 120.0f));
                gra graVar = een.h;
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var4.T);
                xos0 xos0VarM2 = x340Var4.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarH3);
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                nko1.H(gfh0VarC2, x340Var4, lljVar);
                nko1.H(xos0VarM2, x340Var4, lljVar2);
                x0d.q(iHashCode2, x340Var4, lljVar3, x340Var4);
                nko1.H(qim0VarE2, x340Var4, lljVar4);
                boolean z6 = !this.c;
                rk6.b(z6, apo.r(-1501611520, new kk6(cj6Var2, j3, fC), x340Var4), x340Var4, 48);
                x340Var4.r(true);
                qim0 qim0VarH4 = u291.h(u291.v(eqr0.C(qim0Var, fA2, d(fC, 282.0f)), fA), d(fC, 47.0f));
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var4.T);
                xos0 xos0VarM3 = x340Var4.m();
                qim0 qim0VarE3 = zr7.E(x340Var4, qim0VarH4);
                x340Var4.m0();
                if (x340Var4.S) {
                    x340Var4.l(n4kVar);
                } else {
                    x340Var4.v0();
                }
                nko1.H(gfh0VarC3, x340Var4, lljVar);
                nko1.H(xos0VarM3, x340Var4, lljVar2);
                x0d.q(iHashCode3, x340Var4, lljVar3, x340Var4);
                nko1.H(qim0VarE3, x340Var4, lljVar4);
                rk6.b(z6, apo.r(2085399671, new lk6(cj6Var2, j3, fD, fC), x340Var4), x340Var4, 48);
                x340Var4.r(true);
                x340Var4.r(true);
                return rih1Var;
            default:
                i2c i2cVar2 = (i2c) obj;
                x340 x340Var5 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= x340Var5.g(i2cVar2) ? 4 : 2;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    oxj1 oxj1Var = (oxj1) obj4;
                    zr7.h(i2cVar2, oxj1Var.b, oxj1Var.c, oxj1Var.e, this.b, this.c, (qim0) null, 0, 0.0f, 0L, 0.0f, 0L, (iu30) null, (iu30) null, (String) null, 0.0f, 0.0f, (djc0) null, x340Var6, iIntValue2 & 14, 131040);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }
}
