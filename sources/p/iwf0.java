package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class iwf0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwf0(String str, b6n0 b6n0Var, String str2) {
        super(3);
        this.a = (byte) 28;
        this.c = str;
        this.b = b6n0Var;
        this.d = str2;
    }

    private final Object a(Object obj, Object obj2, Object obj3) throws Throwable {
        View viewFindViewById;
        View viewFindViewById2;
        Throwable th;
        err0 err0Var;
        rbn rbnVar;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        long j = ((i2c) obj).b;
        int i = hjl.i(j);
        int iH = hjl.h(j);
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = x340Var;
        x340Var2.i0(-1841838817);
        View view = (View) x340Var2.k(AndroidCompositionLocals_androidKt.f);
        wat watVar = (wat) x340Var2.k(t4k.h);
        boolean zG = x340Var2.g(view);
        Object objT = x340Var2.T();
        if (zG || objT == m4cVar) {
            ViewGroup viewGroupQ = x3p1.q(view);
            objT = (viewGroupQ == null || ((viewFindViewById = viewGroupQ.findViewById(2131427919)) == null && (viewFindViewById = viewGroupQ.findViewById(2131430422)) == null) || ((viewFindViewById2 = viewGroupQ.findViewById(2131427918)) == null && (viewFindViewById2 = viewGroupQ.findViewById(2131430421)) == null)) ? null : new mmr0(viewFindViewById, viewFindViewById2);
            x340Var2.s0(objT);
        }
        mmr0 mmr0Var = (mmr0) objT;
        if (mmr0Var == null) {
            x340Var2.r(false);
            th = null;
            rbnVar = null;
        } else {
            View view2 = (View) mmr0Var.a;
            View view3 = (View) mmr0Var.b;
            Resources resources = view.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(2131167050);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(2131167051);
            int dimensionPixelSize3 = resources.getDimensionPixelSize(2131167049);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = bb00.h(view2.getBottom(), x340Var2);
            }
            err0 err0Var2 = (hdn0) objT2;
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = bb00.h(view3.getTop(), x340Var2);
            }
            err0 err0Var3 = (hdn0) objT3;
            boolean zI = x340Var2.i(err0Var2) | x340Var2.i(view2) | x340Var2.i(err0Var3) | x340Var2.i(view3);
            th = null;
            Object objT4 = x340Var2.T();
            if (zI || objT4 == m4cVar) {
                err0Var = err0Var3;
                ntf0 ntf0Var = new ntf0(view3, view2, err0Var2, err0Var, (byte) 13);
                x340Var2.s0(ntf0Var);
                objT4 = ntf0Var;
            } else {
                err0Var = err0Var3;
            }
            qxd0.i(view3, (iu30) objT4, x340Var2);
            int iS = err0Var2.s() + dimensionPixelSize2;
            int iS2 = err0Var.s() - dimensionPixelSize3;
            int iMin = (int) (((double) Math.min(i, iH)) * 0.1d);
            int iMin2 = Math.min((i - dimensionPixelSize) - dimensionPixelSize, iS2 - iS);
            if (iMin2 < 0) {
                iMin2 = 0;
            }
            if (iMin2 < iMin) {
                iMin2 = 0;
            }
            if (iMin2 <= 0) {
                x340Var2.r(false);
                rbnVar = null;
            } else {
                float fM0 = watVar.M0(iMin2);
                float fM1 = watVar.M0(iS);
                int i2 = iH - iS2;
                if (i2 < 0) {
                    i2 = 0;
                }
                rbnVar = new rbn(fM0, fM1, watVar.M0(i2));
                x340Var2.r(false);
            }
        }
        if (rbnVar != null) {
            qim0 qim0VarB = uyn1.B(u291.d(nim0.a, 1.0f), 0.0f, rbnVar.b, 0.0f, rbnVar.c, 5);
            gra graVar = een.h;
            hnk0 hnk0Var = (hnk0) this.b;
            String str = (String) this.c;
            String str2 = (String) this.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            x340 x340Var3 = x340Var;
            if (x340Var3.a == null) {
                tgp1.p();
                throw th;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x3p1.a(rbnVar.a, hnk0Var, str, str2, x340Var, 0);
            x340Var3.r(true);
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        float fM0;
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        dok0 dok0Var = (dok0) this.b;
        cok0 cok0Var = dok0Var.a;
        Object obj4 = fkj0.X;
        long j = i2cVar.b;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18);
        j06 j06Var = x340Var2.a;
        if (zY) {
            kiv kivVar = t4k.h;
            int iM0 = (int) ((wat) x340Var2.k(kivVar)).M0(hjl.i(j));
            Integer num = cok0Var.a.b.N0;
            int iIntValue2 = num != null ? num.intValue() : 0;
            x340Var2.i0(807712434);
            int iM1 = (int) ((wat) x340Var2.k(kivVar)).M0((int) (((crl1) x340Var2.k(t4k.u)).a() & 4294967295L));
            x340Var2.r(false);
            if (iko1.v(x340Var2)) {
                x340Var2.i0(-730528073);
                boolean zE = x340Var2.e(iM0) | x340Var2.e(iM1);
                Object objT = x340Var2.T();
                if (zE || objT == obj4) {
                    objT = Float.valueOf(nko1.I(iM0, iM1));
                    x340Var2.s0(objT);
                }
                fM0 = ((Number) objT).floatValue();
                x340Var2.r(false);
            } else {
                x340Var2.i0(-730443381);
                fM0 = ((wat) x340Var2.k(kivVar)).M0(hjl.h(j));
                x340Var2.r(false);
            }
            boolean zD = x340Var2.d(fM0);
            Object objT2 = x340Var2.T();
            if (zD || objT2 == obj4) {
                objT2 = Float.valueOf(0.085f * fM0);
                x340Var2.s0(objT2);
            }
            float fFloatValue = ((Number) objT2).floatValue();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = u291.h(u291.v(nim0Var, iM0), fM0);
            psy psyVar = (psy) this.c;
            iu30 iu30Var = (iu30) this.d;
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int i = iIntValue2;
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarH);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            float f = fM0;
            n4k n4kVar = hmb0.t1;
            if (z) {
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
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            gra graVar2 = een.h;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(qim0VarF, graVar2);
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
            yqg yqgVar = (yqg) psyVar.e;
            agq agqVar = (agq) psyVar.f;
            ycu0 ycu0Var = cok0Var.d;
            int i2 = cok0Var.a.b.i;
            float f2 = cok0Var.C;
            float f3 = f - (2.0f * fFloatValue);
            boolean z2 = cok0Var.e;
            boolean z3 = cok0Var.f;
            boolean z4 = cok0Var.g;
            boolean z5 = cok0Var.i;
            boolean z6 = cok0Var.j;
            boolean z7 = cok0Var.k;
            boolean z8 = cok0Var.l;
            boolean z9 = cok0Var.m;
            boolean z10 = cok0Var.n;
            boolean z11 = cok0Var.o;
            boolean z12 = cok0Var.A;
            Integer num2 = cok0Var.r;
            Integer num3 = cok0Var.s;
            vik0 vik0Var = cok0Var.t;
            pik0 pik0Var = cok0Var.u;
            pik0 pik0Var2 = cok0Var.v;
            vik0 vik0Var2 = cok0Var.w;
            boolean zG = x340Var2.g(iu30Var);
            Object objT3 = x340Var2.T();
            if (zG || objT3 == obj4) {
                objT3 = new t7i(iu30Var, (byte) 8);
                x340Var2.s0(objT3);
            }
            zu30 zu30Var = (zu30) objT3;
            boolean zG2 = x340Var2.g(iu30Var);
            Object objT4 = x340Var2.T();
            if (zG2 || objT4 == obj4) {
                objT4 = new t7i(iu30Var, (byte) 9);
                x340Var2.s0(objT4);
            }
            zu30 zu30Var2 = (zu30) objT4;
            boolean zG3 = x340Var2.g(iu30Var);
            Object objT5 = x340Var2.T();
            if (zG3 || objT5 == obj4) {
                objT5 = new t7i(iu30Var, (byte) 10);
                x340Var2.s0(objT5);
            }
            zu30 zu30Var3 = (zu30) objT5;
            boolean zG4 = x340Var2.g(iu30Var);
            Object objT6 = x340Var2.T();
            if (zG4 || objT6 == obj4) {
                objT6 = new t7i(iu30Var, (byte) 11);
                x340Var2.s0(objT6);
            }
            b2u.k(dok0Var, yqgVar, agqVar, i, iM0, i2, ycu0Var, f3, iu30Var, (qim0) null, z2, z3, z4, z5, z6, z7, z8, z9, z10, num2, num3, vik0Var, pik0Var, pik0Var2, vik0Var2, zu30Var, zu30Var2, zu30Var3, (zu30) objT6, 0, f2, z11, z12, x340Var2, 6);
            gra graVar3 = een.X;
            qim0 qim0VarD = eqr0.D(0.0f, 16.0f, 1, h2cVar.a(nim0Var, graVar3));
            gfh0 gfh0VarC3 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarD);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC3, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, lljVar4);
            otw.c((hvj0) psyVar.h, new evj0(i, cok0Var.h, cok0Var.y, cok0Var.z), (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(true);
            qim0 qim0VarD2 = eqr0.D(0.0f, 16.0f, 1, h2cVar.a(nim0Var, graVar3));
            gfh0 gfh0VarC4 = t1c.c(graVar, false);
            int iHashCode4 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM4 = x340Var2.m();
            qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarD2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC4, x340Var2, lljVar);
            nko1.H(xos0VarM4, x340Var2, lljVar2);
            x0d.q(iHashCode4, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE4, x340Var2, lljVar4);
            otw.c((hvj0) psyVar.i, new yxj0(1, false), (qim0) null, (ipb1) null, x340Var2, 0, 12);
            x340Var2.r(true);
            x340Var2.r(true);
            op71.g(x340Var2, u291.h(nim0Var, fFloatValue));
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0.a);
        qx6 qx6Var = (qx6) this.b;
        rqm0 rqm0Var = (rqm0) this.c;
        d0r d0rVar = (d0r) this.d;
        gfh0 gfh0VarC = t1c.c(een.d, false);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(gfh0VarC, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        String str = rqm0Var.c;
        List list = rqm0Var.b;
        i1o1.e(qx6Var, new gx6(str, cwl1.U(2131820578, list.size(), new Object[]{Integer.valueOf(list.size())}, x340Var), false), d0rVar, null, null, q2j.a, null, 0, null, x340Var, 196616, 236);
        x340Var3.r(true);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        boolean z;
        Integer num;
        String strK;
        Integer num2;
        String strK2;
        max maxVar;
        x340 x340Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hwf0 hwf0Var = (hwf0) obj;
                tqw tqwVar = (tqw) obj3;
                if (!((ewf0) obj2).equals(ewf0.a)) {
                    eg.o();
                    return null;
                }
                jwf0 jwf0Var = (jwf0) obj6;
                fn31.T(jwf0Var.d, (o8n) null, 0, new og5((byte) 27, jwf0Var, hwf0Var, (String) obj5, (String) obj4, tqwVar, (lnm) null), 3);
                return rih1Var;
            case 1:
                Context context = (Context) obj;
                ((Number) obj3).intValue();
                x340 x340Var2 = (b0k) obj2;
                View view = (View) x340Var2.k(AndroidCompositionLocals_androidKt.f);
                m0g0 m0g0Var = (m0g0) obj6;
                boolean zG = x340Var2.g(m0g0Var);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    siq siqVar = m0g0Var.a;
                    boolean z2 = m0g0Var.c;
                    teq teqVar = siqVar.a.c;
                    j0g0 j0g0Var = new j0g0((tiq) teqVar.b.Ba.get(), (viq) teqVar.b.Ca.get(), z2, context, view);
                    x340Var2.s0(j0g0Var);
                    objT = j0g0Var;
                }
                mod.b(AndroidCompositionLocals_androidKt.b.a(context), apo.r(-1636392651, new w0f0(obj5, obj4, (Object) m0g0Var, objT, (byte) 3), x340Var2), x340Var2, 56);
                return rih1Var;
            case 2:
                vzq0 vzq0Var = (vzq0) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                z6g0 z6g0Var = (z6g0) obj5;
                r6g0 r6g0Var = (r6g0) obj6;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var3.g(vzq0Var) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zG2 = x340Var4.g(r6g0Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        List list = r6g0Var.f;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj7 : list) {
                            if (!((f7g0) obj7).Y) {
                                arrayList.add(obj7);
                            }
                        }
                        List list2 = r6g0Var.g;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj8 : list2) {
                            if (!((y4g0) obj8).g) {
                                arrayList2.add(obj8);
                            }
                        }
                        String str = r6g0Var.a;
                        iyr0 iyr0Var = r6g0Var.c;
                        i7g0 i7g0Var = r6g0Var.d;
                        boolean z3 = r6g0Var.e;
                        i7g0 i7g0Var2 = i7g0.a;
                        objT2 = new g7g0(str, iyr0Var, i7g0Var, z3, i7g0Var == i7g0Var2 || i7g0Var == i7g0.c, arrayList, i7g0Var == i7g0Var2, i7g0Var == i7g0Var2 || i7g0Var == i7g0.b, arrayList2);
                        x340Var4.s0(objT2);
                    }
                    men1.g((g7g0) objT2, vzq0Var, z6g0Var.e, (iu30) obj4, x340Var4, (iIntValue << 3) & 112);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                ven0 ven0Var = (ven0) obj4;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    otw.c((xx21) obj6, new wx21(((ffs0) ((ven0) obj5).getValue()).getRequestId(), ((a9g0) ven0Var.getValue()).a, ((a9g0) ven0Var.getValue()).b), (qim0) null, (ipb1) null, x340Var6, 0, 12);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var7 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String str2 = ((hfs0) obj5).a;
                    bp6 bp6Var = new bp6(str2, !((b9g0) obj4).e.contains(str2));
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var8).b;
                    otw.c((ep6) obj6, bp6Var, uyn1.B(nim0.a, 16.0f, 0.0f, 0.0f, 0.0f, 14), (ipb1) null, x340Var8, 0, 8);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var9 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    otw.c((mwa) obj6, new lwa(((bx) obj5).b, ((fli0) obj4).a), (qim0) null, (ipb1) null, x340Var10, 6, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var11 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    otw.c((nyr0) obj6, new lyr0(((bx) obj5).a, ((fli0) obj4).a), (qim0) null, (ipb1) null, x340Var12, 6, 12);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var13 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    a81 a81Var = (a81) obj6;
                    String str3 = ((xag0) obj5).a;
                    int i = ((v7g0) obj4).a;
                    z = i == 2;
                    int iC = l1d.C(i);
                    if (iC == 2) {
                        num = 2131958093;
                    } else if (iC != 3) {
                        num = iC != 4 ? null : 2131958094;
                    } else {
                        num = 2131958095;
                    }
                    if (num == null) {
                        x340Var14.i0(1217634554);
                        x340Var14.r(false);
                        strK = null;
                    } else {
                        strK = kk0.k(x340Var14, 1217634555, num, x340Var14, false);
                    }
                    otw.c(a81Var, new z71(str3, strK, z), (qim0) null, (ipb1) null, x340Var14, 0, 12);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var15 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    a81 a81Var2 = (a81) obj6;
                    String str4 = ((hdg0) obj5).a;
                    int i2 = ((nn1) obj4).a;
                    z = i2 == 2;
                    int iC2 = l1d.C(i2);
                    if (iC2 == 2) {
                        num2 = 2131958093;
                    } else if (iC2 != 3) {
                        num2 = iC2 != 4 ? null : 2131958094;
                    } else {
                        num2 = 2131958095;
                    }
                    if (num2 == null) {
                        x340Var16.i0(1783857708);
                        x340Var16.r(false);
                        strK2 = null;
                    } else {
                        strK2 = kk0.k(x340Var16, 1783857709, num2, x340Var16, false);
                    }
                    otw.c(a81Var2, new z71(str4, strK2, z), (qim0) null, (ipb1) null, x340Var16, 0, 12);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var17 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                qim0 qim0VarF = nho1.F(uyn1.w(l6o1.H(u291.d(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var17), false, 14), (vzq0) obj));
                ceg0 ceg0Var = (ceg0) obj6;
                o3e0 o3e0Var = (o3e0) obj5;
                iu30 iu30Var = (iu30) obj4;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var17, 0);
                x340 x340Var18 = x340Var17;
                int iHashCode = Long.hashCode(x340Var18.T);
                xos0 xos0VarM = x340Var18.m();
                qim0 qim0VarE = zr7.E(x340Var17, qim0VarF);
                hzj.A.getClass();
                x340 x340Var19 = x340Var17;
                if (x340Var19.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var19.m0();
                if (x340Var19.S) {
                    x340Var19.l(n4kVar);
                } else {
                    x340Var19.v0();
                }
                nko1.H(mbhVarA, x340Var17, y580.O0);
                nko1.H(xos0VarM, x340Var17, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var17, y580.R0);
                nko1.F(x340Var17);
                nko1.H(qim0VarE, x340Var17, y580.Y);
                String strO0 = cwl1.o0(x340Var17, 2131958139);
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var = cbx.d(x340Var17).j;
                long j = cbx.a(x340Var17).b.b;
                cvx cvxVar2 = cbx.b(x340Var17).b;
                cvx cvxVar3 = cbx.b(x340Var17).b;
                uwo1.e(strO0, uyn1.y(nim0Var, 16.0f, 12.0f), lee1Var, j, null, null, 0, false, null, 0, null, x340Var17, 0, 0, 2032);
                String strO1 = cwl1.o0(x340Var17, 2131958144);
                String strO2 = cwl1.o0(x340Var17, 2131958145);
                boolean z4 = ceg0Var.c;
                boolean z5 = !ceg0Var.d;
                boolean zI = x340Var19.i(o3e0Var) | x340Var19.g(iu30Var);
                Object objT3 = x340Var19.T();
                if (zI || objT3 == m4cVar) {
                    objT3 = new pdg0(o3e0Var, iu30Var, (byte) 0);
                    x340Var19.s0(objT3);
                }
                bqn1.o(strO1, strO2, z4, z5, (Function0) objT3, x340Var17, 0);
                String strO3 = cwl1.o0(x340Var17, 2131958142);
                String strO4 = cwl1.o0(x340Var17, 2131958143);
                boolean z6 = !ceg0Var.c;
                boolean zI2 = x340Var19.i(o3e0Var) | x340Var19.g(iu30Var);
                Object objT4 = x340Var19.T();
                if (zI2 || objT4 == m4cVar) {
                    objT4 = new pdg0(o3e0Var, iu30Var, (byte) 1);
                    x340Var19.s0(objT4);
                }
                bqn1.o(strO3, strO4, z6, z5, (Function0) objT4, x340Var17, 0);
                x340Var19.r(true);
                return rih1Var;
            case 10:
                vzq0 vzq0Var2 = (vzq0) obj;
                int iIntValue8 = ((Number) obj3).intValue();
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                ofg0 ofg0Var = (ofg0) obj6;
                x340 x340Var20 = (b0k) obj2;
                o3e0 o3e0Var2 = (o3e0) obj5;
                iu30 iu30Var2 = (iu30) obj4;
                boolean zG3 = x340Var20.g(ofg0Var) | x340Var20.i(o3e0Var2) | x340Var20.g(iu30Var2);
                Object objT5 = x340Var20.T();
                if (zG3 || objT5 == fkj0.X) {
                    objT5 = new gnf0(ofg0Var, o3e0Var2, iu30Var2, (byte) 4);
                    x340Var20.s0(objT5);
                }
                ujo1.d(qim0VarD, null, vzq0Var2, false, null, null, null, false, null, (iu30) objT5, x340Var20, (iIntValue8 << 6) & 896, 506);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                vzq0 vzq0Var3 = (vzq0) obj;
                x340 x340Var21 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                keg0 keg0Var = (keg0) obj4;
                ygg0 ygg0Var = (ygg0) obj5;
                iu30 iu30Var3 = (iu30) obj6;
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= x340Var21.g(vzq0Var3) ? 4 : 2;
                }
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    boolean zG4 = x340Var22.g(iu30Var3) | x340Var22.i(ygg0Var) | x340Var22.g(keg0Var);
                    Object objT6 = x340Var22.T();
                    if (zG4 || objT6 == fkj0.X) {
                        objT6 = new gnf0(ygg0Var, iu30Var3, keg0Var, (byte) 5);
                        x340Var22.s0(objT6);
                    }
                    s3o1.d(qim0VarD2, null, vzq0Var3, null, null, null, false, null, (iu30) objT6, x340Var22, ((iIntValue9 << 6) & 896) | 6, 506);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj3).intValue();
                nm1 nm1Var = (nm1) obj6;
                irn1.v((bv40) nm1Var.g, (mjm) nm1Var.f, (d0r) nm1Var.b, (plg0) obj5, (iu30) obj4, ((g2c) obj).a(u291.f(nim0Var, 1.0f), een.e), (b0k) obj2, 0);
                return rih1Var;
            case 13:
                ((Number) obj3).intValue();
                nm1 nm1Var2 = (nm1) obj6;
                lrn1.m((d0r) nm1Var2.b, (gmg0) obj5, (iu30) obj4, (njm) nm1Var2.f, (bv40) nm1Var2.g, ((g2c) obj).a(nim0Var, een.e), (b0k) obj2, 0);
                return rih1Var;
            case 14:
                vzq0 vzq0Var4 = (vzq0) obj;
                x340 x340Var23 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarI = too1.i(uyn1.w(u291.d(nim0Var, 1.0f), vzq0Var4), vzq0Var4);
                w5i0 w5i0Var = (w5i0) obj6;
                n5i0 n5i0Var = (n5i0) obj5;
                ipb1 ipb1Var = (ipb1) obj4;
                gfh0 gfh0VarC = t1c.c(een.e, false);
                x340 x340Var24 = x340Var23;
                int iHashCode2 = Long.hashCode(x340Var24.T);
                xos0 xos0VarM2 = x340Var24.m();
                qim0 qim0VarE2 = zr7.E(x340Var23, qim0VarI);
                hzj.A.getClass();
                x340 x340Var25 = x340Var23;
                if (x340Var25.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var25.m0();
                if (x340Var25.S) {
                    x340Var25.l(n4kVar);
                } else {
                    x340Var25.v0();
                }
                nko1.H(gfh0VarC, x340Var23, y580.O0);
                nko1.H(xos0VarM2, x340Var23, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var23, y580.R0);
                nko1.F(x340Var23);
                nko1.H(qim0VarE2, x340Var23, y580.Y);
                otw.c(w5i0Var, n5i0Var, u291.d(u291.x(0.0f, dsa0.m(x340Var23, 2131166901), 1, nim0Var), 1.0f), ipb1Var, x340Var23, 64, 0);
                x340Var25.r(true);
                return rih1Var;
            case 15:
                ((Number) obj3).intValue();
                yqg yqgVar = (yqg) obj4;
                m4c m4cVar2 = fkj0.X;
                qim0 qim0VarX = u291.x(0.0f, 160.0f, 1, nim0Var);
                hdn0 hdn0Var = (hdn0) obj6;
                x340 x340Var26 = (b0k) obj2;
                boolean zI3 = x340Var26.i(hdn0Var);
                Object objT7 = x340Var26.T();
                if (zI3 || objT7 == m4cVar2) {
                    objT7 = new myg0(hdn0Var, (byte) 1);
                    x340Var26.s0(objT7);
                }
                qim0 qim0VarU = lrn1.u(qim0VarX, (iu30) objT7);
                oiw0 oiw0Var = (oiw0) obj5;
                boolean zG5 = x340Var26.g(yqgVar);
                Object objT8 = x340Var26.T();
                if (zG5 || objT8 == m4cVar2) {
                    objT8 = new zai0(yqgVar, (byte) 0);
                    x340Var26.s0(objT8);
                }
                fiw0.a(oiw0Var, (Function0) objT8, true, qim0VarU, true, x340Var26, 24960, 0);
                return rih1Var;
            case 16:
                x340 x340Var27 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, ((vzq0) obj).d(), 0.0f, 0.0f, 13);
                fpi0 fpi0Var = (fpi0) obj6;
                gw70 gw70Var = (gw70) obj5;
                iu30 iu30Var4 = (iu30) obj4;
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                x340 x340Var28 = x340Var27;
                int iHashCode3 = Long.hashCode(x340Var28.T);
                xos0 xos0VarM3 = x340Var28.m();
                qim0 qim0VarE3 = zr7.E(x340Var27, qim0VarB);
                hzj.A.getClass();
                x340 x340Var29 = x340Var27;
                if (x340Var29.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var29.m0();
                if (x340Var29.S) {
                    x340Var29.l(n4kVar);
                } else {
                    x340Var29.v0();
                }
                nko1.H(gfh0VarC2, x340Var27, y580.O0);
                nko1.H(xos0VarM3, x340Var27, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var27, y580.R0);
                nko1.F(x340Var27);
                nko1.H(qim0VarE3, x340Var27, y580.Y);
                otw.c(new koi0(!fpi0Var.c.equals(lpi0.a), gw70Var, iu30Var4), new ioi0(fpi0Var.b), (qim0) null, (ipb1) null, x340Var27, 0, 12);
                x340Var29.r(true);
                return rih1Var;
            case 17:
                ixi0 ixi0Var = (ixi0) obj6;
                x340 x340Var30 = (b0k) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                x340 x340Var31 = x340Var30;
                if (x340Var31.Y(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    wxo1.g(ixi0Var, ((add) ((qj0) obj5).d).a.J() && ixi0Var.j, (iu30) obj4, null, x340Var31, 0);
                } else {
                    x340Var31.b0();
                }
                return rih1Var;
            case 18:
                x340 x340Var32 = (b0k) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                x340 x340Var33 = x340Var32;
                if (x340Var33.Y(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    bfm0.b(x340Var33, 0);
                    rxj0 rxj0Var = (rxj0) ((nm1) obj4).f;
                    r2p1.c((nak0) obj6, (iu30) obj5, null, rxj0Var.E, rxj0Var.C, x340Var33, 0);
                } else {
                    x340Var33.b0();
                }
                return rih1Var;
            case 19:
                x340 x340Var34 = (b0k) obj2;
                int iIntValue12 = ((Number) obj3).intValue();
                el9 el9Var = (el9) obj5;
                x340 x340Var35 = x340Var34;
                boolean zY = x340Var35.Y(iIntValue12 & 1, (iIntValue12 & 17) != 16);
                rih1 rih1Var2 = rih1.a;
                if (!zY) {
                    x340Var35.b0();
                } else if (((sck0) obj6).c == uao0.d) {
                    x340Var35.i0(-1548311468);
                    boolean zG6 = x340Var35.g((zfq) el9Var.X);
                    iu30 iu30Var5 = (iu30) obj4;
                    Object objT9 = x340Var35.T();
                    if (zG6 || objT9 == fkj0.X) {
                        objT9 = new odk0(new wck0(iu30Var5, (byte) 1));
                        x340Var35.s0(objT9);
                    }
                    otw.c((odk0) objT9, rih1Var2, (qim0) null, (ipb1) null, x340Var35, 48, 12);
                    x340Var35.r(false);
                } else {
                    x340Var35.i0(-1547919380);
                    x340Var35.r(false);
                }
                return rih1Var2;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                iu30 iu30Var6 = (iu30) obj4;
                zgk0 zgk0Var = (zgk0) obj5;
                pek0 pek0Var = (pek0) obj6;
                x340 x340Var36 = (b0k) obj2;
                int iIntValue13 = ((Number) obj3).intValue();
                x340 x340Var37 = x340Var36;
                if (x340Var37.Y(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    pek0Var.g(zgk0Var, iu30Var6, x340Var37, 0);
                    if (zgk0Var.f) {
                        x340Var37.i0(-402852558);
                        pek0Var.h(iu30Var6, x340Var37, 0);
                        x340Var37.r(false);
                    } else {
                        x340Var37.i0(-402796820);
                        x340Var37.r(false);
                    }
                } else {
                    x340Var37.b0();
                }
                return rih1Var;
            case 21:
                ((Number) obj3).intValue();
                m4c m4cVar3 = fkj0.X;
                pek0 pek0Var2 = (pek0) obj6;
                iu30 iu30Var7 = (iu30) obj5;
                x340 x340Var38 = (b0k) obj2;
                boolean zG7 = x340Var38.g(iu30Var7);
                Object objT10 = x340Var38.T();
                if (zG7 || objT10 == m4cVar3) {
                    objT10 = new stj0(iu30Var7, (byte) 24);
                    x340Var38.s0(objT10);
                }
                Function0 function0 = (Function0) objT10;
                hdn0 hdn0Var2 = (hdn0) obj4;
                Object objT11 = x340Var38.T();
                if (objT11 == m4cVar3) {
                    objT11 = new myg0(hdn0Var2, (byte) 6);
                    x340Var38.s0(objT11);
                }
                pek0Var2.a(48, function0, x340Var38, lrn1.u(nim0Var, (iu30) objT11));
                return rih1Var;
            case 22:
                ((Number) obj3).intValue();
                wik0 wik0Var = (wik0) obj6;
                i1o1.e(wik0Var.X, wik0Var.l((kak0) obj5, (ihh1) obj4), wik0Var.a, null, null, h2j.a, null, 0, null, (b0k) obj2, 196608, 236);
                return rih1Var;
            case 23:
                kak0 kak0Var = (kak0) obj5;
                wik0 wik0Var2 = (wik0) obj6;
                vzq0 vzq0Var5 = (vzq0) obj;
                x340 x340Var39 = (b0k) obj2;
                int iIntValue14 = ((Number) obj3).intValue();
                tob1 tob1Var = (tob1) obj4;
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= x340Var39.g(vzq0Var5) ? 4 : 2;
                }
                x340 x340Var40 = x340Var39;
                if (!x340Var40.Y(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x340Var40.b0();
                } else if (iko1.v(x340Var40)) {
                    x340Var40.i0(539218949);
                    wik0Var2.q(kak0Var, vzq0Var5, ((g7f0) tob1Var.getValue()).b, (qim0) null, x340Var40, (iIntValue14 << 3) & 112);
                    x340Var40.r(false);
                } else {
                    x340Var40.i0(539390596);
                    wik0Var2.m(kak0Var, vzq0Var5, ((g7f0) tob1Var.getValue()).b, (qim0) null, x340Var40, (iIntValue14 << 3) & 112);
                    x340Var40.r(false);
                }
                return rih1Var;
            case 24:
                x340 x340Var41 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar3 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var41).b;
                d36 d36Var = new d36(16.0f, true, new um5(false));
                fra fraVar = een.N0;
                nm1 nm1Var3 = (nm1) obj6;
                mlk0 mlk0Var = ((nlk0) obj5).a;
                iu30 iu30Var8 = (iu30) obj4;
                jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var41, 0);
                x340 x340Var42 = x340Var41;
                int iHashCode4 = Long.hashCode(x340Var42.T);
                xos0 xos0VarM4 = x340Var42.m();
                qim0 qim0VarE4 = zr7.E(x340Var41, nim0Var);
                hzj.A.getClass();
                x340 x340Var43 = x340Var41;
                if (x340Var43.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var43.m0();
                if (x340Var43.S) {
                    x340Var43.l(n4kVar);
                } else {
                    x340Var43.v0();
                }
                nko1.H(jw31VarA, x340Var41, y580.O0);
                nko1.H(xos0VarM4, x340Var41, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var41, y580.R0);
                nko1.F(x340Var41);
                nko1.H(qim0VarE4, x340Var41, y580.Y);
                otw.c((jd6) nm1Var3.g, new r7k0(mlk0Var.a, mlk0Var.b, mlk0Var.c, mlk0Var.d, mlk0Var.f, mlk0Var.g, mlk0Var.h), (qim0) null, (ipb1) null, x340Var41, 64, 12);
                int i3 = mlk0Var.e;
                if (i3 == 0) {
                    x340Var43.i0(1613048376);
                    x340Var43.r(false);
                } else {
                    x340Var43.i0(1613048377);
                    boolean zG8 = x340Var43.g(iu30Var8);
                    Object objT12 = x340Var43.T();
                    if (zG8 || objT12 == fkj0.X) {
                        objT12 = new nfk0(iu30Var8, (byte) 3);
                        x340Var43.s0(objT12);
                    }
                    slk0.b(i3, 0, (Function0) objT12, x340Var41);
                    x340Var43.r(false);
                }
                x340Var43.r(true);
                return rih1Var;
            case 25:
                return a(obj, obj2, obj3);
            case 26:
                return d(obj, obj2, obj3);
            case 27:
                return e(obj, obj2, obj3);
            case 28:
                b6n0 b6n0Var = (b6n0) obj6;
                i2c i2cVar = (i2c) obj;
                x340 x340Var44 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str5 = (String) obj5;
                float fD = str5.length() > 0 ? i2cVar.d() * 0.18f : 0.0f;
                nim0 nim0Var2 = nim0.a;
                b6n0Var.e(0, 0, (String) obj4, x340Var44, i2cVar.a(uyn1.B(nim0Var2, 0.0f, 0.0f, 0.0f, fD, 7), een.d));
                if (str5.length() > 0) {
                    x340 x340Var45 = x340Var44;
                    x340Var45.i0(182898103);
                    qim0 qim0VarA = i2cVar.a(nim0Var2, een.Y);
                    uwr uwrVar4 = cbx.a;
                    b6n0Var.f(str5, qim0VarA, 0.5f, k1u.d(2.0f, ((vex) zex.a.e).g), x340Var45, 384, 0);
                    x340Var45.r(false);
                } else {
                    x340 x340Var46 = x340Var44;
                    x340Var46.i0(183150133);
                    x340Var46.r(false);
                }
                return rih1Var;
            default:
                x340 x340Var47 = (b0k) obj2;
                ((Number) obj3).intValue();
                eeo0 eeo0Var = (eeo0) obj6;
                boolean z7 = eeo0Var.g;
                max haxVar = jax.a;
                if (z7) {
                    x340 x340Var48 = x340Var47;
                    x340Var48.i0(-66546338);
                    x340Var48.r(false);
                    maxVar = haxVar;
                } else {
                    x340 x340Var49 = x340Var47;
                    x340Var49.i0(-66496707);
                    max haxVar2 = new hax(cwl1.o0(x340Var49, 2131957789));
                    x340Var49.r(false);
                    maxVar = haxVar2;
                }
                if (eeo0Var.f) {
                    x340Var = x340Var47;
                    x340Var.i0(-66327106);
                } else {
                    x340Var = x340Var47;
                    x340Var.i0(-66277475);
                    haxVar = new hax(cwl1.o0(x340Var, 2131957792));
                }
                x340Var.r(false);
                max maxVar2 = haxVar;
                int i4 = eeo0Var.e;
                String str6 = eeo0Var.j;
                String str7 = eeo0Var.k;
                String str8 = eeo0Var.h;
                String str9 = eeo0Var.i;
                Function0 function1 = (Function0) obj5;
                Function0 function2 = (Function0) obj4;
                qim0 qim0VarB2 = u291.B(nim0Var, (gra) null, 3);
                x340 x340Var50 = x340Var47;
                Object objT13 = x340Var50.T();
                if (objT13 == fkj0.X) {
                    objT13 = htn0.T0;
                    x340Var50.s0(objT13);
                }
                ggo1.w(i4, maxVar, maxVar2, str6, str7, str8, str9, function1, function2, s161.a(qim0VarB2, (iu30) objT13), x340Var50, 0);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iwf0(Object obj, Object obj2, Object obj3, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iwf0(pek0 pek0Var, zgk0 zgk0Var, iu30 iu30Var) {
        super(3);
        this.a = (byte) 20;
        this.b = pek0Var;
        this.c = zgk0Var;
        this.d = iu30Var;
    }
}
