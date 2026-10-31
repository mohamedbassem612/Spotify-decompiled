package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i9f1 extends hab0 implements xu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9f1(float f, ArrayList arrayList, boolean z, boolean z2) {
        super(3);
        this.a = f;
        this.b = arrayList;
        this.c = z;
        this.d = z2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        fra fraVar = een.Z;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18);
        j06 j06Var = x340Var2.a;
        if (zY) {
            float fD = i2cVar.d();
            float fMin = Math.min(i2cVar.c() * 0.6f, fD / 2.0f);
            float f = fMin * 2.0f;
            float f2 = f / 3.0f;
            boolean z2 = p3v.b(i2cVar.c(), this.a * 0.2f) <= 0;
            List listD1 = o7h.d1(this.b, 5);
            boolean z3 = z2;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 54);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z4 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar4);
            nko1.H(xos0VarM, x340Var2, lljVar3);
            x0d.q(iHashCode, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE, x340Var2, lljVar);
            c36 c36Var = h36.a;
            boolean z5 = this.c;
            boolean z6 = this.d;
            if (z3) {
                x340Var2.i0(-1969724768);
                float f3 = fD / 5.0f;
                qim0 qim0VarH = u291.h(u291.D(nim0Var, (era) null, 3), f3);
                jw31 jw31VarA = ew31.a(c36Var, fraVar, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarH);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, lljVar4);
                nko1.H(xos0VarM2, x340Var2, lljVar3);
                x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar);
                x340Var2.i0(-1802626992);
                int i = 0;
                for (Object obj4 : listD1) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    es70 es70Var = (es70) obj4;
                    yto.e(es70Var.a, (vnr0) es70Var.b.invoke(x340Var2, 0), i, f3, z5, z6, null, x340Var2, 64, 64);
                    i = i2;
                }
                z = true;
                us71.m(x340Var2, false, true, false);
            } else {
                x340Var2.i0(-1969221266);
                List list = listD1;
                List listD2 = o7h.d1(list, 2);
                List listK0 = o7h.k0(list, 2);
                qim0 qim0VarH2 = u291.h(u291.v(nim0Var, f), fMin);
                jw31 jw31VarA2 = ew31.a(c36Var, fraVar, x340Var2, 0);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarH2);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA2, x340Var2, lljVar4);
                nko1.H(xos0VarM3, x340Var2, lljVar3);
                x0d.q(iHashCode3, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar);
                x340Var2.i0(509775544);
                int i3 = 0;
                for (Object obj5 : listD2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p7h.T();
                        throw null;
                    }
                    es70 es70Var2 = (es70) obj5;
                    yto.e(es70Var2.a, (vnr0) es70Var2.b.invoke(x340Var2, 0), i3, fMin, z5, z6, u291.r(nim0Var, fMin), x340Var2, 64, 0);
                    i3 = i4;
                }
                x340Var2.r(false);
                x340Var2.r(true);
                qim0 qim0VarV = u291.v(nim0Var, f);
                float f4 = f2;
                qim0 qim0VarH3 = u291.h(qim0VarV, f4);
                int size = listK0.size();
                jw31 jw31VarA3 = ew31.a((size == 1 || size == 2) ? h36.e : c36Var, fraVar, x340Var2, 0);
                int iHashCode4 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM4 = x340Var2.m();
                qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarH3);
                hzj.A.getClass();
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA3, x340Var2, lljVar4);
                nko1.H(xos0VarM4, x340Var2, lljVar3);
                x0d.q(iHashCode4, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE4, x340Var2, lljVar);
                x340Var2.i0(465235714);
                int i5 = 0;
                for (Object obj6 : listK0) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        p7h.T();
                        throw null;
                    }
                    es70 es70Var3 = (es70) obj6;
                    float f5 = f4;
                    yto.e(es70Var3.a, (vnr0) es70Var3.b.invoke(x340Var2, 0), i5 + 2, f5, z5, z6, u291.r(nim0Var, f4), x340Var2, 64, 0);
                    i5 = i6;
                    f4 = f5;
                }
                z = true;
                us71.m(x340Var2, false, true, false);
            }
            x340Var2.r(z);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
