package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ip0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ip0(byte b, Object obj, iu30 iu30Var) {
        super(3);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        byte b = this.a;
        z50 z50Var = z50.c;
        nim0 nim0Var = nim0.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                xx10 xx10Var = (xx10) obj2;
                mmr0 mmr0Var = (mmr0) obj3;
                if (mmr0Var != null) {
                    iu30Var.invoke(new yo0(str, xx10Var, mmr0Var));
                } else {
                    iu30Var.invoke(new po0(str, xx10Var));
                }
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                zma1 zma1Var = new zma1(cbx.a(x340Var).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.c, (Shadow) null, (PlatformSpanStyle) null, 61438);
                x340 x340Var2 = x340Var;
                boolean zG = x340Var2.g(iu30Var);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    obj4 = objT;
                    ib2 ib2Var = new ib2(iu30Var, (byte) 14);
                    x340Var2.s0(ib2Var);
                    obj4 = ib2Var;
                }
                obj4 = objT;
                uwo1.f(wmo1.y(2131952256, 2131952258, "view_followers", zma1Var, (iu30) obj4, x340Var2, 0), (qim0) null, (lee1) null, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var2, 0, 0, 4094);
                return rih1Var;
            case 2:
                long j = ((hjl) obj3).a;
                q5t0 q5t0VarH = ((afh0) obj2).H(hjl.b(j, 0, 0, 0, Integer.MAX_VALUE, 3));
                return ((ifh0) obj).S(q5t0VarH.a, hjl.h(j), b7x.a, new xg6(q5t0VarH, iu30Var, (byte) 5));
            case 3:
                iu30Var.invoke((yym1) obj2);
                return rih1Var;
            case 4:
                tv80 tv80VarY = null;
                z39 z39Var = (z39) obj;
                y39 y39Var = (y39) obj2;
                tqw tqwVar = (tqw) obj3;
                String str2 = z39Var.e;
                String str3 = z39Var.a;
                if (y39Var.equals(v39.a)) {
                    if (tqwVar != null) {
                        tv80VarY = n3o1.y(tqwVar);
                    }
                    iu30Var.invoke(new dz41(str3, str2, tv80VarY));
                } else if (y39Var.equals(x39.a)) {
                    iu30Var.invoke(new j151(str2.concat(" ")));
                } else {
                    if (!y39Var.equals(w39.a)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new fz41(str3));
                }
                return rih1Var;
            case 5:
                iu30Var.invoke((yym1) obj2);
                return rih1Var;
            case 6:
                iu30Var.invoke((d8t0) obj2);
                return rih1Var;
            case 7:
                ((Number) obj3).intValue();
                qim0 qim0VarN = anm1.N("more button", nim0Var);
                x340 x340Var3 = (b0k) obj2;
                boolean zG2 = x340Var3.g(iu30Var);
                Object objT2 = x340Var3.T();
                if (zG2 || objT2 == fkj0.X) {
                    obj5 = objT2;
                    gob gobVar = new gob(iu30Var, (byte) 21);
                    x340Var3.s0(gobVar);
                    obj5 = gobVar;
                }
                obj5 = objT2;
                qim0 qim0VarX = bin.x(qim0VarN, false, (String) null, (pm31) null, (idn0) null, (Function0) obj5, 15);
                gpx gpxVar = gpx.c;
                uwr uwrVar2 = cbx.a;
                w0h1.a(gpxVar, isl.a, qim0VarX, cbx.a(x340Var3).b.b, 0L, false, x340Var3, gpx.d | 48, 48);
                return rih1Var;
            case 8:
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var4 = (b0k) obj2;
                boolean zG3 = x340Var4.g(iu30Var);
                Object objT3 = x340Var4.T();
                Object obj15 = objT3;
                if (zG3 || objT3 == m4cVar) {
                    ggf ggfVar = new ggf(iu30Var, (byte) 12);
                    x340Var4.s0(ggfVar);
                    obj15 = ggfVar;
                }
                gbx gbxVar = new gbx(z50Var, (Function0) obj15);
                jdx jdxVar = jdx.c;
                foo1.c(gbxVar, jdxVar, (qim0) null, (max) null, yla.s(x340Var4), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, zbi.a, x340Var4, 0, 48, 2012);
                boolean zG4 = x340Var4.g(iu30Var);
                Object objT4 = x340Var4.T();
                Object obj16 = objT4;
                if (zG4 || objT4 == m4cVar) {
                    ggf ggfVar2 = new ggf(iu30Var, (byte) 13);
                    x340Var4.s0(ggfVar2);
                    obj16 = ggfVar2;
                }
                foo1.c(new gbx(z50Var, (Function0) obj16), jdxVar, (qim0) null, (max) null, yla.s(x340Var4), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, zbi.b, x340Var4, 0, 48, 2012);
                boolean zG5 = x340Var4.g(iu30Var);
                Object objT5 = x340Var4.T();
                Object obj17 = objT5;
                if (zG5 || objT5 == m4cVar) {
                    ggf ggfVar3 = new ggf(iu30Var, (byte) 14);
                    x340Var4.s0(ggfVar3);
                    obj17 = ggfVar3;
                }
                foo1.c(new gbx(z50Var, (Function0) obj17), new idx(4), (qim0) null, (max) null, yla.s(x340Var4), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, zbi.c, x340Var4, 0, 48, 2012);
                return rih1Var;
            case 9:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar = cbx.b(b0kVar).b;
                qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                cvx cvxVar2 = cbx.b(b0kVar).b;
                k5p1.d(qim0VarB, new d36(16.0f, true, new g21(een.Q0, (byte) 29)), (g36) null, (pl3) null, 0, 0, apo.r(-2103200788, new ip0(iu30Var, (byte) 8), b0kVar), b0kVar, 1572864, 60);
                return rih1Var;
            case 10:
                syg sygVar = (syg) obj;
                ((Number) obj3).intValue();
                x340 x340Var5 = (b0k) obj2;
                Object objT6 = x340Var5.T();
                if (objT6 == fkj0.X) {
                    cab0 cab0Var = new cab0(new wqf(iu30Var, (byte) 4));
                    x340Var5.s0(cab0Var);
                    objT6 = cab0Var;
                }
                otw.c((cab0) objT6, new bab0(cwl1.o0(x340Var5, 2131956787), cwl1.o0(x340Var5, 2131956788), sygVar.a), (qim0) null, (ipb1) null, x340Var5, 8, 12);
                return rih1Var;
            case 11:
                dwl dwlVar = (dwl) obj;
                x340 x340Var6 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? x340Var6.g(dwlVar) : x340Var6.i(dwlVar) ? 4 : 2;
                }
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zG6 = x340Var7.g(iu30Var);
                    Object objT7 = x340Var7.T();
                    if (zG6 || objT7 == fkj0.X) {
                        obj6 = objT7;
                        wqf wqfVar = new wqf(iu30Var, (byte) 10);
                        x340Var7.s0(wqfVar);
                        obj6 = wqfVar;
                    }
                    obj6 = objT7;
                    d1e.d(dwlVar, (iu30) obj6, nim0Var, x340Var7, (iIntValue & 14) | 384);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 12:
                iu30Var.invoke(new dv2((String) obj, (String) obj3, ((Boolean) obj2).booleanValue()));
                return rih1Var;
            case 13:
                x340 x340Var8 = (b0k) obj2;
                ((Number) obj3).intValue();
                xmx xmxVar = xmx.c;
                String strO0 = cwl1.o0(x340Var8, ((kke) obj).b);
                x340 x340Var9 = x340Var8;
                boolean zG7 = x340Var9.g(iu30Var);
                Object objT8 = x340Var9.T();
                if (zG7 || objT8 == fkj0.X) {
                    obj7 = objT8;
                    y8i y8iVar = new y8i(iu30Var, (byte) 24);
                    x340Var9.s0(y8iVar);
                    obj7 = y8iVar;
                }
                obj7 = objT8;
                r4o1.p(xmx.d, strO0, (Function0) obj7, x340Var9, xmxVar, (qim0) null);
                return rih1Var;
            case 14:
                ((Number) obj3).intValue();
                x340 x340Var10 = (b0k) obj2;
                boolean zG8 = x340Var10.g(iu30Var);
                Object objT9 = x340Var10.T();
                if (zG8 || objT9 == fkj0.X) {
                    obj8 = objT9;
                    roi roiVar = new roi(iu30Var, (byte) 1);
                    x340Var10.s0(roiVar);
                    obj8 = roiVar;
                }
                obj8 = objT9;
                z1p1.c(0, (Function0) obj8, x340Var10, (qim0) null);
                return rih1Var;
            case 15:
                x340 x340Var11 = (b0k) obj2;
                ((Number) obj3).intValue();
                xmx xmxVar2 = xmx.c;
                String strO1 = cwl1.o0(x340Var11, ((m3i0) obj).b);
                x340 x340Var12 = x340Var11;
                boolean zG9 = x340Var12.g(iu30Var);
                Object objT10 = x340Var12.T();
                if (zG9 || objT10 == fkj0.X) {
                    obj9 = objT10;
                    exi exiVar = new exi(iu30Var, (byte) 16);
                    x340Var12.s0(exiVar);
                    obj9 = exiVar;
                }
                obj9 = objT10;
                r4o1.p(xmx.d, strO1, (Function0) obj9, x340Var12, xmxVar2, (qim0) null);
                return rih1Var;
            case 16:
                x340 x340Var13 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    bfm0.b(x340Var14, 0);
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    uwr uwrVar4 = cbx.a;
                    qim0 qim0VarY = uyn1.y(qim0VarF2, cbx.b(x340Var14).e.c, cbx.b(x340Var14).e.b);
                    mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var14, 48);
                    int iHashCode = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM = x340Var14.m();
                    qim0 qim0VarE = zr7.E(x340Var14, qim0VarY);
                    hzj.A.getClass();
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
                    nko1.H(mbhVarA, x340Var14, y580.O0);
                    nko1.H(xos0VarM, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE, x340Var14, y580.Y);
                    uwo1.e(cwl1.o0(x340Var14, 2131958626), (qim0) null, cbx.d(x340Var14).e, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2026);
                    cvx cvxVar3 = cbx.b(x340Var14).b;
                    uwo1.e(ydh.g(8.0f, 2131958623, x340Var14, x340Var14, nim0Var), (qim0) null, cbx.d(x340Var14).j, cbx.a(x340Var14).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var14, 0, 0, 2018);
                    cvx cvxVar4 = cbx.b(x340Var14).b;
                    op71.g(x340Var14, u291.h(nim0Var, 16.0f));
                    j2i j2iVar = z1j.a;
                    u2p1.f(x340Var14, 6);
                    op71.g(x340Var14, u291.h(nim0Var, cbx.b(x340Var14).b.b));
                    boolean zG10 = x340Var14.g(iu30Var);
                    Object objT11 = x340Var14.T();
                    Object obj18 = objT11;
                    if (zG10 || objT11 == m4cVar2) {
                        c1j c1jVar = new c1j(iu30Var, (byte) 10);
                        x340Var14.s0(c1jVar);
                        obj18 = c1jVar;
                    }
                    foo1.c(new gbx(z50Var, (Function0) obj18), new idx(4), anm1.N("mixing_dialog_primary_button", nim0Var), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, z1j.b, x340Var14, 384, 48, 2040);
                    cvx cvxVar5 = cbx.b(x340Var14).b;
                    op71.g(x340Var14, u291.h(nim0Var, 8.0f));
                    boolean zG11 = x340Var14.g(iu30Var);
                    Object objT12 = x340Var14.T();
                    Object obj19 = objT12;
                    if (zG11 || objT12 == m4cVar2) {
                        c1j c1jVar2 = new c1j(iu30Var, (byte) 11);
                        x340Var14.s0(c1jVar2);
                        obj19 = c1jVar2;
                    }
                    foo1.c(new gbx(z50Var, (Function0) obj19), ldx.c, anm1.N("mixing_dialog_secondary_button", nim0Var), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, z1j.c, x340Var14, 432, 48, 2040);
                    WeakHashMap weakHashMap = osl1.x;
                    op71.g(x340Var14, yoo1.D(nim0Var, lhc.g(x340Var14).g));
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 17:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                nyx.a(2, (wux) null, apo.r(-1586509027, new v0j(iu30Var, (byte) 6), b0kVar2), b0kVar2, 3078, 6);
                return rih1Var;
            case 18:
                yaa1 yaa1Var = (yaa1) obj;
                x340 x340Var15 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var15.g(yaa1Var) ? 4 : 2;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(1 & iIntValue3, (iIntValue3 & 19) != 18)) {
                    String str4 = yaa1Var.a;
                    String str5 = yaa1Var.b;
                    boolean z2 = yaa1Var.c;
                    boolean zG12 = x340Var16.g(iu30Var);
                    Object objT13 = x340Var16.T();
                    if (zG12 || objT13 == fkj0.X) {
                        obj10 = objT13;
                        ogj ogjVar = new ogj(iu30Var, (byte) 20);
                        x340Var16.s0(ogjVar);
                        obj10 = ogjVar;
                    }
                    obj10 = objT13;
                    x2g0.v(0, str4, str5, (Function0) obj10, x340Var16, (qim0) null, z2);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 19:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                gfx.b(6, apo.r(-660388742, new v0j(iu30Var, (byte) 11), b0kVar3), b0kVar3, 54);
                return rih1Var;
            case 20:
                bek bekVar = (bek) obj;
                tqw tqwVar2 = (tqw) obj3;
                iu30Var.invoke(new v051(new z951(bekVar.a, 3, false, (p7w) null, false, false, (Integer) null, false, u951.a, (String) null, bekVar.c, (String) null, false, 0, false, false, false, 259568), tqwVar2 != null ? n3o1.y(tqwVar2) : null, ((aek) obj2).a));
                return rih1Var;
            case 21:
                iu30Var.invoke((yym1) obj2);
                return rih1Var;
            case 22:
                jkl jklVar = (jkl) obj;
                mkl mklVar = (okl) obj2;
                tqw tqwVar3 = (tqw) obj3;
                if (mklVar instanceof mkl) {
                    mkl mklVar2 = mklVar;
                    iu30Var.invoke(new ukl(jklVar.a, jklVar.b, mklVar2.a, mklVar2.b, tqwVar3 != null ? n3o1.y(tqwVar3) : null));
                } else {
                    if (!(mklVar instanceof nkl)) {
                        eg.o();
                        return null;
                    }
                    nkl nklVar = (nkl) mklVar;
                    iu30Var.invoke(new ykl(jklVar.a, jklVar.b, nklVar.a, nklVar.b, tqwVar3 != null ? n3o1.y(tqwVar3) : null));
                }
                return rih1Var;
            case 23:
                iu30Var.invoke(new vkl(((Number) obj2).intValue(), ((Number) obj3).intValue(), (String) obj));
                return rih1Var;
            case 24:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var17 = (b0k) obj2;
                x340Var17.i0(1246216658);
                wat watVar = (wat) x340Var17.k(t4k.h);
                boolean zG13 = x340Var17.g(iu30Var) | x340Var17.i(watVar);
                Object objT14 = x340Var17.T();
                if (zG13 || objT14 == fkj0.X) {
                    obj11 = objT14;
                    jbe jbeVar = new jbe(iu30Var, watVar, (byte) 1);
                    x340Var17.s0(jbeVar);
                    obj11 = jbeVar;
                }
                obj11 = objT14;
                qim0 qim0VarU = lrn1.u(qim0Var, (iu30) obj11);
                x340Var17.r(false);
                return qim0VarU;
            case 25:
                ((Number) obj3).intValue();
                qim0 qim0VarN2 = anm1.N("create_new_folder_row", u291.f(nim0Var, 1.0f));
                uvx uvxVar = new uvx(1, (pgx) null, 3, uyn1.h(2, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498);
                x340 x340Var18 = (b0k) obj2;
                boolean zG14 = x340Var18.g(iu30Var);
                Object objT15 = x340Var18.T();
                if (zG14 || objT15 == fkj0.X) {
                    obj12 = objT15;
                    qzn qznVar = new qzn(iu30Var, (byte) 28);
                    x340Var18.s0(qznVar);
                    obj12 = qznVar;
                }
                obj12 = objT15;
                jto1.b(qim0VarN2, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(z50Var, (Function0) obj12), (gbx) null, (xu30) null, o2j.c, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, o2j.d, x340Var18, 805306432, 196608, 32188);
                return rih1Var;
            case 26:
                ((Number) obj3).intValue();
                qim0 qim0VarN3 = anm1.N("move_to_folder_full_tree_create_new_folder_row", u291.f(nim0Var, 1.0f));
                uvx uvxVar2 = new uvx(1, (pgx) null, 3, uyn1.h(2, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 498);
                x340 x340Var19 = (b0k) obj2;
                boolean zG15 = x340Var19.g(iu30Var);
                Object objT16 = x340Var19.T();
                if (zG15 || objT16 == fkj0.X) {
                    obj13 = objT16;
                    hbs hbsVar = new hbs(iu30Var, z ? 1 : 0);
                    x340Var19.s0(hbsVar);
                    obj13 = hbsVar;
                }
                obj13 = objT16;
                jto1.b(qim0VarN3, uvxVar2, (max) null, false, (idn0) null, (ga80) null, new gbx(z50Var, (Function0) obj13), (gbx) null, (xu30) null, p2j.d, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, p2j.e, x340Var19, 805306432, 196608, 32188);
                return rih1Var;
            case 27:
                iu30Var.invoke((u8t) obj2);
                return rih1Var;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                iu30Var.invoke((d8t0) obj2);
                return rih1Var;
            default:
                v820 v820Var = (v820) obj;
                x340 x340Var20 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var20.g(v820Var) ? 4 : 2;
                }
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    boolean z3 = v820Var.b;
                    String strC = v820Var.a.c();
                    String str6 = v820Var.c;
                    boolean z4 = v820Var.d;
                    boolean zG16 = ((iIntValue4 & 14) == 4) | x340Var21.g(iu30Var);
                    Object objT17 = x340Var21.T();
                    if (zG16 || objT17 == fkj0.X) {
                        obj14 = objT17;
                        w3w w3wVar = new w3w(v820Var, iu30Var, (byte) 14);
                        x340Var21.s0(w3wVar);
                        obj14 = w3wVar;
                    }
                    obj14 = objT17;
                    lro1.f(z3, (iu30) obj14, strC, (qim0) null, str6, z4, x340Var21, 0);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ip0(iu30 iu30Var, byte b) {
        super(3);
        this.a = b;
        this.b = iu30Var;
    }
}
