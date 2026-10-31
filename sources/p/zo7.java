package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zo7 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zo7(int i, Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        int i;
        String str;
        String strN0;
        String strN1;
        byte b = this.a;
        z50 z50Var = z50.c;
        nim0 nim0Var = nim0.a;
        c380 c380VarA = null;
        int i2 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    qim0 qim0VarH = pqo.h(nim0Var, !(i2 == 1));
                    zc8 zc8Var = (zc8) obj5;
                    if (zc8Var != null) {
                        ArrayList arrayList = zc8Var.c.a;
                        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((l6o) it.next()).a);
                        }
                        c380VarA = mqo1.A(arrayList2);
                    }
                    ((fp7) obj4).h(c380VarA, qim0VarH, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                jdx jdxVar = jdx.c;
                qvv qvvVar = (qvv) obj5;
                x340 x340Var3 = (b0k) obj2;
                iu30 iu30Var = (iu30) obj4;
                boolean zI = x340Var3.i(qvvVar) | x340Var3.g(iu30Var);
                Object objT = x340Var3.T();
                if (zI || objT == m4cVar) {
                    objT = new ovv(qvvVar, iu30Var, (byte) 0);
                    x340Var3.s0(objT);
                }
                foo1.c(new gbx(z50Var, (Function0) objT), jdxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1857523227, new vx1(i2, (byte) 14), x340Var3), x340Var3, 0, 48, 2044);
                idx idxVar = new idx(4);
                boolean zI2 = x340Var3.i(qvvVar) | x340Var3.g(iu30Var);
                Object objT2 = x340Var3.T();
                if (zI2 || objT2 == m4cVar) {
                    objT2 = new ovv(qvvVar, iu30Var, (byte) 1);
                    x340Var3.s0(objT2);
                }
                foo1.c(new gbx(z50Var, (Function0) objT2), idxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1605984334, new vx1(i2, (byte) 15), x340Var3), x340Var3, 0, 48, 2044);
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                ((j2i) obj5).J(Integer.valueOf(i2), (String) obj4, (b0k) obj2, 0);
                return rih1Var;
            case 3:
                x340 x340Var4 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    suo1.i((t370) obj5, this.b, (wgh1) obj4, (qim0) null, x340Var5, 0);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var6 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    suo1.m((x370) obj5, this.b, (wgh1) obj4, (qim0) null, x340Var7, 0);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var8 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    c0c1 c0c1Var = (c0c1) obj5;
                    String str2 = ((hdg0) obj4).a;
                    boolean z = i2 == 1;
                    int iC = l1d.C(i2);
                    if (iC == 0) {
                        i = 2131958133;
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        i = 2131958134;
                    }
                    otw.c(c0c1Var, new b0c1(str2, cwl1.o0(x340Var9, i), z), (qim0) null, (ipb1) null, x340Var9, 0, 12);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var10 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                String strO0 = cwl1.o0(x340Var10, 2131963625);
                vu30 vu30Var = (vu30) obj5;
                x340 x340Var11 = x340Var10;
                okm0 okm0Var = (okm0) obj4;
                boolean zG = x340Var11.g(vu30Var) | x340Var11.g(okm0Var) | x340Var11.e(i2);
                Object objT3 = x340Var11.T();
                if (zG || objT3 == m4cVar2) {
                    objT3 = new hkm0(vu30Var, okm0Var, i2, (byte) 3);
                    x340Var11.s0(objT3);
                }
                gbx gbxVar = new gbx(new y50(strO0), (Function0) objT3);
                ldx ldxVar = ldx.c;
                yla.r(x340Var11);
                yla.r(x340Var11);
                yla.r(x340Var11);
                zzq0 zzq0VarJ = uyn1.j(12.0f, 12.0f, 0.0f, 12.0f, 4);
                boolean zE = x340Var11.e(i2);
                Object objT4 = x340Var11.T();
                if (zE || objT4 == m4cVar2) {
                    objT4 = new po60(i2, (byte) 16);
                    x340Var11.s0(objT4);
                }
                wro1.h(gbxVar, ldxVar, s161.b(nim0Var, false, (iu30) objT4), (max) null, (gdx) null, zzq0VarJ, false, (idn0) null, (ga80) null, n2j.a, x340Var11, 0, 6, 952);
                return rih1Var;
            case 7:
                x340 x340Var12 = (b0k) obj2;
                ((Number) obj3).intValue();
                d36 d36Var = new d36(8.0f, true, new um5(false));
                qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 0.0f, 16.0f, 0.0f, 11);
                z6d1 z6d1Var = (z6d1) obj5;
                iu30 iu30Var2 = (iu30) obj4;
                mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var12, 0);
                x340 x340Var13 = x340Var12;
                int iHashCode = Long.hashCode(x340Var13.T);
                xos0 xos0VarM = x340Var13.m();
                qim0 qim0VarE = zr7.E(x340Var12, qim0VarB);
                hzj.A.getClass();
                x340 x340Var14 = x340Var12;
                if (x340Var14.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var14.m0();
                if (x340Var14.S) {
                    x340Var14.l(hmb0.t1);
                } else {
                    x340Var14.v0();
                }
                nko1.H(mbhVarA, x340Var12, y580.O0);
                nko1.H(xos0VarM, x340Var12, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var12, y580.R0);
                nko1.F(x340Var12);
                nko1.H(qim0VarE, x340Var12, y580.Y);
                x340Var14.i0(1865343399);
                int i3 = 0;
                for (Object obj6 : z6d1Var.e) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p7h.T();
                        throw null;
                    }
                    y6d1 y6d1Var = (y6d1) obj6;
                    boolean zG2 = x340Var14.g(iu30Var2) | x340Var14.e(i2) | x340Var14.e(i3);
                    Object objT5 = x340Var14.T();
                    if (zG2 || objT5 == fkj0.X) {
                        objT5 = new n1j((byte) 4, i2, i3, iu30Var2);
                        x340Var14.s0(objT5);
                    }
                    zho1.m((Function0) objT5, y6d1Var, z6d1Var.d == 2, (qim0) null, x340Var12, 0);
                    i3 = i4;
                }
                x340Var14.r(false);
                x340Var14.r(true);
                return rih1Var;
            case 8:
                nbh nbhVar = (nbh) obj;
                x340 x340Var15 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                gmt gmtVar = (gmt) zex.a.c;
                op71.g(x340Var15, u291.h(nim0Var, cbx.b(x340Var15).b.c));
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                cua cuaVar = cbx.b(x340Var15).f;
                qim0 qim0VarQ = i1p1.q(qim0VarF, er31.b(8.0f));
                hct0 hct0Var = (hct0) obj5;
                boolean z2 = hct0Var instanceof fct0;
                ect0 ect0Var = ect0.a;
                if (z2) {
                    str = "https://cdn-spotify-gen-alpha.spotifycdn.com/kids-graduation/TeenGraduationAgeOutPremium.webp";
                } else {
                    if (!u890.j(hct0Var, ect0Var)) {
                        eg.o();
                        return null;
                    }
                    str = "https://cdn-spotify-gen-alpha.spotifycdn.com/kids-graduation/TeenGraduationAgeOutFree.webp";
                }
                Uri uri = Uri.parse(str);
                as80 as80Var = mif1.P0;
                cbx.a.getClass();
                eso1.e(uri, isl.a, qim0VarQ, (p3v) null, (zvx) null, uwr.b(), as80Var, (tl3) null, (ColorFilter) null, oux.a, false, false, x340Var15, 3120, 0, 3472);
                cvx cvxVar = cbx.b(x340Var15).b;
                op71.g(x340Var15, u291.h(nim0Var, 16.0f));
                if (z2) {
                    x340 x340Var16 = x340Var15;
                    x340Var16.i0(1369870516);
                    strN0 = cwl1.n0(2131956417, new Object[]{Integer.valueOf(i2)}, x340Var15);
                    x340Var16.r(false);
                } else {
                    if (!u890.j(hct0Var, ect0Var)) {
                        throw p3d1.k(x340Var15, 1369868662, false);
                    }
                    x340 x340Var17 = x340Var15;
                    x340Var17.i0(1369873612);
                    String strO1 = cwl1.o0(x340Var15, 2131956411);
                    x340Var17.r(false);
                    strN0 = strO1;
                }
                lee1 lee1Var = cbx.d(x340Var15).a;
                long j = ((xex) gmtVar.b).g;
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                x340 x340Var18 = x340Var15;
                Object objT6 = x340Var18.T();
                if (objT6 == fkj0.X) {
                    objT6 = pod1.e1;
                    x340Var18.s0(objT6);
                }
                uwo1.e(strN0, s161.b(qim0VarF2, false, (iu30) objT6), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var15, 0, 0, 2032);
                cvx cvxVar2 = cbx.b(x340Var15).b;
                op71.g(x340Var15, u291.h(nim0Var, 8.0f));
                if (z2) {
                    x340Var18.i0(1369886789);
                    strN1 = cwl1.n0(2131956416, new Object[]{((fct0) hct0Var).a}, x340Var15);
                    x340Var18.r(false);
                } else {
                    if (!u890.j(hct0Var, ect0Var)) {
                        throw p3d1.k(x340Var18, 1369884943, false);
                    }
                    x340Var18.i0(1369890420);
                    strN1 = cwl1.n0(2131956410, new Object[]{Integer.valueOf(i2)}, x340Var15);
                    x340Var18.r(false);
                }
                uwo1.e(strN1, u291.f(nim0Var, 1.0f), cbx.d(x340Var15).e, cbx.a(x340Var15).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var15, 0, 0, 2032);
                cvx cvxVar3 = cbx.b(x340Var15).b;
                op71.g(x340Var15, u291.h(nim0Var, 16.0f));
                if (z2) {
                    x340Var18.i0(1369901156);
                    p1p1.q(x340Var15, 0);
                    x340Var18.r(false);
                } else {
                    if (!u890.j(hct0Var, ect0Var)) {
                        throw p3d1.k(x340Var18, 1369899747, false);
                    }
                    x340Var18.i0(1369902593);
                    p1p1.n(x340Var15, 0);
                    x340Var18.r(false);
                }
                op71.g(x340Var15, nbhVar.a(1.0f, nim0Var, true));
                foo1.c(new gbx(z50Var, (Function0) obj4), new idx(6), anm1.N("teen_graduation_message_button", uyn1.B(nbhVar.c(een.Q0, nim0Var), 0.0f, cbx.b(x340Var15).b.b, 0.0f, 0.0f, 13)), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, smj.a, x340Var15, 0, 48, 2040);
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                x340 x340Var19 = (b0k) obj2;
                x340Var19.i0(321336750);
                String str3 = (String) obj5;
                iu30 iu30Var3 = (iu30) obj4;
                ye5 ye5Var = new ye5();
                ye5Var.g(cwl1.o0(x340Var19, i2));
                ye5Var.g(" ");
                boolean zG3 = x340Var19.g(iu30Var3);
                Object objT7 = x340Var19.T();
                if (zG3 || objT7 == fkj0.X) {
                    objT7 = new ceg1(iu30Var3, (byte) 19);
                    x340Var19.s0(objT7);
                }
                vhg.d(ye5Var, str3, "https://support.spotify.com/article/ai-persona-badge/", (iu30) objT7);
                af5 af5VarP = ye5Var.p();
                x340Var19.r(false);
                uwr uwrVar2 = cbx.a;
                uwo1.d(af5VarP, cbx.a(x340Var19).b.b, (qim0) null, cbx.d(x340Var19).j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var19, 0, 0, 4084);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zo7(Object obj, int i, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zo7(Object obj, Object obj2, int i, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
