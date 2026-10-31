package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vz2 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz2(float f, z7l1 z7l1Var, xtb0 xtb0Var, l6k1 l6k1Var, lvd lvdVar, iac0 iac0Var, a9l1 a9l1Var, zau0 zau0Var) {
        super(3);
        this.b = f;
        this.c = z7l1Var;
        this.d = xtb0Var;
        this.e = l6k1Var;
        this.f = lvdVar;
        this.g = iac0Var;
        this.h = a9l1Var;
        this.i = zau0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        boolean z;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        float f2 = this.b;
        Object obj6 = this.i;
        Object obj7 = this.h;
        Object obj8 = this.g;
        Object obj9 = this.f;
        Object obj10 = this.e;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                mih1 mih1Var = (mih1) obj7;
                List listM = p7h.M(new vu30[]{(j2i) obj5, apo.r(-599643931, new pu2((j2i) obj9, (byte) 2), x340Var), (j2i) obj4, (j2i) obj10});
                ixq0 ixq0Var = (ixq0) obj6;
                ArrayList arrayList = new ArrayList(q7h.U(listM, 10));
                Iterator it = listM.iterator();
                while (it.hasNext()) {
                    arrayList.add(new j2i(-1681849027, new n2(ixq0Var, (vu30) it.next(), (byte) 25), true));
                }
                qim0 qim0VarJ = too1.j((qim0) obj8, mih1Var);
                x340 x340Var2 = x340Var;
                boolean zI = x340Var2.i(mih1Var) | x340Var2.d(f2);
                Object objT = x340Var2.T();
                if (zI || objT == m4cVar) {
                    objT = new uz2(mih1Var, f2);
                    x340Var2.s0(objT);
                }
                lqm0 lqm0Var = (lqm0) objT;
                j2i j2iVarQ = who1.q(arrayList);
                boolean zG = x340Var2.g(lqm0Var);
                Object objT2 = x340Var2.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new mqm0(lqm0Var);
                    x340Var2.s0(objT2);
                }
                gfh0 gfh0Var = (gfh0) objT2;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarJ);
                hzj.A.getClass();
                if (x340Var2.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(hmb0.t1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0Var, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                dv20.l(0, j2iVarQ, x340Var2, true);
                return rih1Var;
            default:
                i2c i2cVar = (i2c) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                z7l1 z7l1Var = (z7l1) obj5;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var3.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x340Var4.b0();
                    return rih1Var;
                }
                float fA0 = cwl1.a0(x340Var4);
                float fD = i2cVar.d() - (f2 * 2.0f);
                y7l1 y7l1Var = z7l1Var.a;
                if (y7l1Var.c) {
                    x340Var4.i0(1451340040);
                    float fA1 = cwl1.a0(x340Var4);
                    boolean zD = x340Var4.d(fD) | x340Var4.d(fA1);
                    Object objT3 = x340Var4.T();
                    if (zD || objT3 == m4cVar2) {
                        float fE = ktd.e(fA1, 2.0f, fD, 2.5f);
                        if (fE > 164.0f) {
                            fE = 164.0f;
                        }
                        objT3 = ktd.k(fE, x340Var4);
                    }
                    f = ((p3v) objT3).a;
                    z = false;
                    x340Var4.r(false);
                    rih1Var = rih1Var;
                } else {
                    obj10 = obj10;
                    x340Var4.i0(1451418656);
                    int size = y7l1Var.a.b.size();
                    float fA2 = cwl1.a0(x340Var4);
                    boolean zE = x340Var4.e(size) | x340Var4.d(fD) | x340Var4.d(fA2);
                    Object objT4 = x340Var4.T();
                    if (zE || objT4 == m4cVar2) {
                        float fP = (fD - (fA2 * yoi1.p(size - 1, 2, 3))) / yoi1.o(size, 3.0f, 3.3f);
                        if (p3v.b(fP, 140.0f) > 0) {
                            fP = 140.0f;
                        }
                        objT4 = ktd.k(fP, x340Var4);
                    }
                    f = ((p3v) objT4).a;
                    z = false;
                    x340Var4.r(false);
                }
                float f3 = y7l1Var.c ? 8.0f : 0.0f;
                d36 d36Var = new d36(fA0, true, new um5(z));
                zzq0 zzq0VarJ = uyn1.j(f2, 0.0f, f3 + f2, 0.0f, 10);
                qim0 qim0VarZ = u291.z(u291.f(nim0.a, 1.0f), (fra) null, 3);
                xtb0 xtb0Var = (xtb0) obj4;
                boolean zI2 = x340Var4.i(z7l1Var) | x340Var4.i((l6k1) obj10) | x340Var4.i((lvd) obj9) | x340Var4.i((iac0) obj8) | x340Var4.i((a9l1) obj7) | x340Var4.i(e4y.Z0) | x340Var4.d(f) | x340Var4.i((zau0) obj6);
                zau0 zau0Var = (zau0) obj6;
                l6k1 l6k1Var = (l6k1) obj10;
                lvd lvdVar = (lvd) obj9;
                iac0 iac0Var = (iac0) obj8;
                a9l1 a9l1Var = (a9l1) obj7;
                Object objT5 = x340Var4.T();
                if (zI2 || objT5 == m4cVar2) {
                    objT5 = new s8s(z7l1Var, f, zau0Var, l6k1Var, lvdVar, iac0Var, a9l1Var);
                    x340Var4.s0(objT5);
                }
                ujo1.e(qim0VarZ, xtb0Var, zzq0VarJ, d36Var, (pl3) null, (iq20) null, false, (hxq0) null, (iu30) objT5, x340Var4, 6, 488);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz2(j2i j2iVar, j2i j2iVar2, j2i j2iVar3, qim0 qim0Var, mih1 mih1Var, float f, j2i j2iVar4, ixq0 ixq0Var) {
        super(3);
        this.c = j2iVar;
        this.d = j2iVar2;
        this.e = j2iVar3;
        this.g = qim0Var;
        this.h = mih1Var;
        this.b = f;
        this.f = j2iVar4;
        this.i = ixq0Var;
    }
}
