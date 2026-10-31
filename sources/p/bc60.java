package p;

import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bc60 extends hab0 implements xu30 {
    public final /* synthetic */ float X;
    public final /* synthetic */ jkr0 a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ db60 d;
    public final /* synthetic */ slx0 e;
    public final /* synthetic */ gc60 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ cmt h;
    public final /* synthetic */ String i;
    public final /* synthetic */ hdn0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc60(jkr0 jkr0Var, ArrayList arrayList, boolean z, db60 db60Var, slx0 slx0Var, gc60 gc60Var, String str, cmt cmtVar, String str2, hdn0 hdn0Var, float f) {
        super(3);
        this.a = jkr0Var;
        this.b = arrayList;
        this.c = z;
        this.d = db60Var;
        this.e = slx0Var;
        this.f = gc60Var;
        this.g = str;
        this.h = cmtVar;
        this.i = str2;
        this.t = hdn0Var;
        this.X = f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        x340 x340Var = (b0k) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= x340Var.e(iIntValue) ? 4 : 2;
        }
        int i = iIntValue2;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(i & 1, (i & 19) != 18);
        j06 j06Var = x340Var2.a;
        if (zY) {
            boolean z2 = iIntValue == ((err0) this.a.d.c).s();
            rb60 rb60Var = (rb60) this.b.get(iIntValue);
            qim0 qim0Var = nim0.a;
            qim0 qim0VarA = z2 ? qim0Var : s161.a(qim0Var, z860.h);
            era eraVar = een.Q0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            jkr0 jkr0Var = this.a;
            boolean z4 = this.c;
            qmo1.b(rb60Var, iIntValue, jkr0Var, z4, this.d, this.e, kk0.q(x340Var2, qim0VarE, lljVar4, 1.0f, false), false, x340Var2, ((i << 3) & 112) | 294912, 128);
            if (rb60Var instanceof pb60) {
                x340Var2.i0(-1985734026);
                fc60 fc60Var = new fc60(((pb60) rb60Var).b, this.g, this.h, iIntValue, this.i, false);
                qim0 qim0VarB = uyn1.B(qim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                hdn0 hdn0Var = this.t;
                boolean zI = x340Var2.i(hdn0Var);
                Object objT = x340Var2.T();
                if (zI || objT == fkj0.X) {
                    objT = new tu9(hdn0Var, (byte) 19);
                    x340Var2.s0(objT);
                }
                wmo1.h(this.f, fc60Var, iIntValue, jkr0Var, z4, lrn1.u(qim0VarB, (iu30) objT), x340Var2, ((i << 6) & 896) | 72);
                x340Var2.r(false);
                z = true;
            } else {
                if (!(rb60Var instanceof qb60)) {
                    throw p3d1.k(x340Var2, 351584198, false);
                }
                x340Var2.i0(-1985017430);
                mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0Var);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                op71.g(x340Var2, u291.h(qim0Var, 16.0f));
                op71.g(x340Var2, u291.h(qim0Var, this.X));
                z = true;
                x340Var2.r(true);
                x340Var2.r(false);
            }
            x340Var2.r(z);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
