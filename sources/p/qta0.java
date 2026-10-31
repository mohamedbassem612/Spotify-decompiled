package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qta0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qta0(long j, iu30 iu30Var, iu30 iu30Var2, j2i j2iVar, j2i j2iVar2, qim0 qim0Var, j2i j2iVar3, int i) {
        super(2);
        this.c = j;
        this.e = iu30Var;
        this.f = iu30Var2;
        this.b = j2iVar;
        this.g = j2iVar2;
        this.h = qim0Var;
        this.i = j2iVar3;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object objH;
        int i;
        byte b = this.a;
        int i2 = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.b;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i2 | 1);
                ltn1.e((String) obj8, (g9m) obj7, (Function0) obj6, this.c, (qim0) obj4, (Long) obj3, (Function0) obj5, (b0k) obj, iP);
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj6;
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (!zY) {
                    x340Var2.b0();
                    return rih1Var;
                }
                Object objT = x340Var2.T();
                if (objT == m4cVar) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                tob1 tob1VarB = z95.b(((Boolean) ven0Var.getValue()).booleanValue() ? 1.0f : 0.0f, irn1.o0(80, 0, null, 6), (String) null, (iu30) null, x340Var2, 48, 28);
                nim0 nim0Var = nim0.a;
                qim0 qim0VarK = d9y0.k(u291.d(nim0Var, 1.0f), ((Number) tob1VarB.getValue()).floatValue());
                uwr uwrVar = cbx.a;
                qim0 qim0VarF = dug.f(qim0VarK, ((vex) zex.a.e).f, d4o1.a);
                boolean zG = x340Var2.g(function0);
                Object objT2 = x340Var2.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new lpx0(function0, (byte) 19);
                    x340Var2.s0(objT2);
                }
                qim0 qim0VarX = bin.x(qim0VarF, false, null, null, null, (Function0) objT2, 15);
                b0i0 b0i0Var = (b0i0) obj7;
                String str = (String) obj8;
                c380 c380Var = (c380) obj5;
                String str2 = (String) obj4;
                vu30 vu30Var = (vu30) obj3;
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                boolean z = x340Var2.S;
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
                int i3 = ((Context) x340Var2.k(AndroidCompositionLocals_androidKt.b)).getResources().getDisplayMetrics().widthPixels;
                Object objT3 = x340Var2.T();
                if (objT3 == m4cVar) {
                    i = 0;
                    objH = bb00.h(0, x340Var2);
                } else {
                    objH = objT3;
                    i = 0;
                }
                hdn0 hdn0Var = (hdn0) objH;
                Object objT4 = x340Var2.T();
                if (objT4 == m4cVar) {
                    objT4 = bb00.h(i, x340Var2);
                }
                hdn0 hdn0Var2 = (hdn0) objT4;
                long j = this.c;
                boolean zF = x340Var2.f(j);
                int i4 = this.d;
                boolean zE = zF | x340Var2.e(i4) | x340Var2.g(tob1VarB) | x340Var2.e(i3);
                Object objT5 = x340Var2.T();
                if (zE || objT5 == m4cVar) {
                    objT5 = new j301(j, i4, i3, hdn0Var, tob1VarB, hdn0Var2);
                    x340Var2.s0(objT5);
                }
                qim0 qim0VarB = eqr0.B(nim0Var, (iu30) objT5);
                Object objT6 = x340Var2.T();
                if (objT6 == m4cVar) {
                    objT6 = new tih(hdn0Var, hdn0Var2, (byte) 3);
                    x340Var2.s0(objT6);
                }
                qim0 qim0VarX2 = ern1.x(qim0VarB, (iu30) objT6);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarX2);
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
                u201 u201VarA = ((h4q) b0i0Var.d).a(str, false);
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                Iterator it = c380Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(new s201((String) it.next()));
                }
                boolean zG2 = x340Var2.g(vu30Var) | x340Var2.g(function0);
                Object objT7 = x340Var2.T();
                if (zG2 || objT7 == m4cVar) {
                    objT7 = new kpw0((Object) vu30Var, (Object) function0, (byte) 17);
                    x340Var2.s0(objT7);
                }
                otw.c(u201VarA, new t201(arrayList, str2, (vu30) objT7, (iu30) null, 8), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                x340Var2.r(true);
                x340Var2.r(true);
                Object objT8 = x340Var2.T();
                if (objT8 == m4cVar) {
                    objT8 = new vk1(ven0Var, (lnm) null, (byte) 26);
                    x340Var2.s0(objT8);
                }
                qxd0.t(rih1Var, x340Var2, (vu30) objT8);
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(3073);
                g2p1.z((c380) obj8, this.c, (c380) obj7, (List) obj6, this.d, (qim0) obj4, (iu30) obj5, (vu30) obj3, (b0k) obj, iP2);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i2 | 1);
                rqo1.p(this.c, (iu30) obj8, (iu30) obj7, (j2i) obj6, (j2i) obj5, (qim0) obj4, (j2i) obj3, (b0k) obj, iP3);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qta0(String str, g9m g9mVar, Function0 function0, long j, qim0 qim0Var, Long l, Function0 function1, int i) {
        super(2);
        this.e = str;
        this.f = g9mVar;
        this.b = function0;
        this.c = j;
        this.h = qim0Var;
        this.i = l;
        this.g = function1;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qta0(Function0 function0, long j, int i, b0i0 b0i0Var, String str, c380 c380Var, String str2, vu30 vu30Var) {
        super(2);
        this.b = function0;
        this.c = j;
        this.d = i;
        this.f = b0i0Var;
        this.e = str;
        this.g = c380Var;
        this.h = str2;
        this.i = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qta0(c380 c380Var, long j, c380 c380Var2, List list, int i, qim0 qim0Var, iu30 iu30Var, vu30 vu30Var, int i2) {
        super(2);
        this.e = c380Var;
        this.c = j;
        this.f = c380Var2;
        this.b = list;
        this.d = i;
        this.h = qim0Var;
        this.g = iu30Var;
        this.i = vu30Var;
    }
}
