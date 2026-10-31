package p;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ciu0 extends hab0 implements xu30 {
    public final /* synthetic */ tob1 a;
    public final /* synthetic */ tob1 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ Integer h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciu0(tob1 tob1Var, tob1 tob1Var2, List list, List list2, boolean z, boolean z2, iu30 iu30Var, Integer num) {
        super(3);
        this.a = tob1Var;
        this.b = tob1Var2;
        this.c = list;
        this.d = list2;
        this.e = z;
        this.f = z2;
        this.g = iu30Var;
        this.h = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        pxg1 pxg1VarJ0;
        int i;
        qim0 qim0VarC;
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
        }
        int i2 = 0;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            float fD = i2cVar.d();
            float fC = i2cVar.c();
            float f = 1.23f * fD;
            float f2 = (f - fD) / 2.0f;
            gra graVar = een.h;
            qim0 qim0Var = nim0.a;
            qim0 qim0VarC2 = u291.c(u291.p(i2cVar.a(qim0Var, graVar), f), 1.0f);
            tob1 tob1Var = this.a;
            boolean zG = x340Var2.g(tob1Var);
            tob1 tob1Var2 = this.b;
            boolean zG2 = zG | x340Var2.g(tob1Var2);
            Object objT = x340Var2.T();
            if (zG2 || objT == m4cVar) {
                objT = new dy(tob1Var, tob1Var2, (byte) 6);
                x340Var2.s0(objT);
            }
            qim0 qim0VarC3 = i541.C(qim0VarC2, (iu30) objT);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarC3);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            x340Var2.i0(496920869);
            Iterator it = this.c.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                yj41 yj41Var = (yj41) next;
                t6t0 t6t0Var = (t6t0) this.d.get(i3);
                tzg1 tzg1Var = hiu0.a;
                boolean z = this.f;
                if (z) {
                    ilv.a.getClass();
                    pxg1VarJ0 = irn1.o0(600, i2, flv.e, 2);
                } else {
                    pxg1VarJ0 = irn1.j0();
                }
                tob1 tob1Var3 = tob1Var;
                qim0 qim0Var2 = qim0Var;
                boolean z2 = this.e;
                tob1 tob1Var4 = tob1Var2;
                t6t0 t6t0Var2 = (t6t0) zod.G(t6t0Var, z2, tzg1Var, pxg1VarJ0, x340Var2, 0);
                float f3 = t6t0Var2.d;
                float f4 = fD * f3;
                float f5 = f;
                float f6 = yoi1.t(new p3v(((t6t0Var2.a - (f3 / 2.0f)) * fD) + f2), new p3v(0.0f), yoi1.l(new p3v(f5 - f4), new p3v(0.0f))).a;
                float f7 = yoi1.t(new p3v((t6t0Var2.b * fC) - ((t6t0Var2.d * fD) / 2.0f)), new p3v(0.0f), yoi1.l(new p3v(fC - f4), new p3v(0.0f))).a;
                x340 x340Var3 = x340Var2;
                int i5 = i3;
                ven0 ven0VarU = xto.u(f4i1.c(i3, "topPlaylistsCoverIntro-"), (i3 * 100) + 200, z2, z, (Function0) null, x340Var3, 0, 16);
                x340Var2 = x340Var3;
                iu30 iu30Var = this.g;
                boolean zG3 = x340Var2.g(iu30Var);
                Integer num = this.h;
                boolean zG4 = zG3 | x340Var2.g(num) | x340Var2.e(i4);
                Object objT2 = x340Var2.T();
                if (zG4 || objT2 == m4cVar) {
                    objT2 = new wv1(iu30Var, num, i4, (byte) 21);
                    x340Var2.s0(objT2);
                }
                Function0 function0 = (Function0) objT2;
                qim0 qim0VarR = u291.r(eqr0.C(lrn1.x(qim0Var2, t6t0Var2.c), f6, f7), f4);
                boolean zG5 = x340Var2.g(ven0VarU);
                Object objT3 = x340Var2.T();
                if (zG5 || objT3 == m4cVar) {
                    objT3 = new lws0(ven0VarU, (byte) 2);
                    x340Var2.s0(objT3);
                }
                qim0 qim0VarC4 = i541.C(qim0VarR, (iu30) objT3);
                if (i5 == 0) {
                    x340Var2.i0(-1602545296);
                    boolean zG6 = x340Var2.g(tob1Var3) | x340Var2.g(tob1Var4);
                    Object objT4 = x340Var2.T();
                    if (zG6 || objT4 == m4cVar) {
                        objT4 = new dy(tob1Var3, tob1Var4, (byte) 7);
                        x340Var2.s0(objT4);
                    }
                    qim0VarC = i541.C(qim0Var2, (iu30) objT4);
                    i = 0;
                    x340Var2.r(false);
                } else {
                    i = 0;
                    x340Var2.i0(-1602280246);
                    x340Var2.r(false);
                    qim0VarC = qim0Var2;
                }
                giu0.a(yj41Var, function0, qim0VarC4.then(qim0VarC), x340Var2, 8);
                i3 = i4;
                tob1Var2 = tob1Var4;
                qim0Var = qim0Var2;
                tob1Var = tob1Var3;
                it = it;
                fD = fD;
                fC = fC;
                f = f5;
                i2 = i;
            }
            x340Var2.r(i2);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
