package p;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.scrollsita.v1.Section;
import com.spotify.searchview.proto.Entity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ef8 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef8(jd6 jd6Var, yza yzaVar, String str) {
        super(3);
        this.a = (byte) 7;
        this.b = yzaVar;
        this.c = str;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        a0g a0gVar = (a0g) this.b;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean z = a0gVar.c;
            String str = (String) this.c;
            hax haxVar = str != null ? new hax(str) : jax.a;
            qim0 qim0VarN = anm1.N("managed_account_request_setting_switch_".concat(a0gVar.a), nim0.a);
            Object objT = x340Var2.T();
            if (objT == fkj0.X) {
                objT = oqi.i;
                x340Var2.s0(objT);
            }
            anm1.c(z, (iu30) null, s161.a(qim0VarN, (iu30) objT), haxVar, (idn0) null, x340Var2, 48, 16);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        ldx ldxVar = ldx.c;
        iu30 iu30Var = (iu30) this.b;
        x340 x340Var = (b0k) obj2;
        boolean zG = x340Var.g(iu30Var);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new c1j(iu30Var, (byte) 7);
            x340Var.s0(objT);
        }
        foo1.c(new gbx(z50.c, (Function0) objT), ldxVar, anm1.N("mixing_bar_picker_button", nfc.a(u291.D(u291.h(nim0.a, 32.0f), (era) null, 3))), (max) null, (gdx) null, new zzq0(12.0f, 7.0f, 12.0f, 7.0f), (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1599370484, new l8i((evj0) this.c, (byte) 20), x340Var), x340Var, 1572912, 48, 1976);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            lvj0 lvj0Var = (lvj0) this.b;
            iu30 iu30Var = (iu30) this.c;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String strO0 = cwl1.o0(x340Var2, 2131958616);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).h;
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            cvx cvxVar = cbx.b(x340Var2).b;
            uwo1.e(strO0, anm1.N("mixing_bars_bottom_sheet_title", uyn1.z(0.0f, 16.0f, 1, qim0VarF2)), lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2024);
            long jC = cbx.a(x340Var2).a.b.c();
            x340 x340Var3 = x340Var2;
            hr80.d((qim0) null, 1.0f, jC, x340Var3, 48, 1);
            x340Var3.i0(1971906131);
            int i = 0;
            for (Object obj4 : lvj0Var.b) {
                int i2 = i + 1;
                if (i < 0) {
                    p7h.T();
                    throw null;
                }
                int iIntValue2 = ((Number) obj4).intValue();
                boolean z = iIntValue2 == lvj0Var.a;
                String strN0 = cwl1.n0(2131958684, new Object[]{String.valueOf(iIntValue2)}, x340Var3);
                uvx uvxVar = new uvx((pgx) null, 3, (tvx) null, (p3v) null, 26);
                xu30 xu30Var = z ? o1j.a : null;
                boolean zG = x340Var3.g(iu30Var) | x340Var3.e(iIntValue2) | x340Var3.e(i);
                Object objT = x340Var3.T();
                if (zG || objT == fkj0.X) {
                    objT = new n1j((byte) 0, iIntValue2, i, iu30Var);
                    x340Var3.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                if (ihc1.y0(strN0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                gbx gbxVar = new gbx(new y50(strN0), function0);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var3).b;
                x340 x340Var4 = x340Var3;
                jto1.b(anm1.N("mixing_bottom_sheet_bar_chip_type_" + iIntValue2 + "_" + z, uyn1.z(12.0f, 0.0f, 2, nim0Var)), uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, xu30Var, (xu30) null, (xu30) null, apo.r(815965008, new kaf(strN0, (byte) 12), x340Var3), x340Var4, 64, 196608, 28604);
                x340Var3 = x340Var4;
                i = i2;
            }
            x340Var3.r(false);
            uwr uwrVar3 = cbx.a;
            cvx cvxVar3 = cbx.b(x340Var3).b;
            op71.g(x340Var3, u291.h(nim0Var, 16.0f));
            WeakHashMap weakHashMap = osl1.x;
            op71.g(x340Var3, yoo1.D(nim0Var, lhc.g(x340Var3).g));
            x340Var3.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        ((iu30) this.b).invoke(new bak0(((dak0) this.c).a.a, ((Number) obj).intValue(), ((Boolean) obj2).booleanValue(), (ssj0) obj3));
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        Object obj5;
        gdx gdxVarR;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        byte b = this.a;
        byte b2 = 21;
        u5j1 u5j1Var = d4o1.a;
        z50 z50Var = z50.c;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj13 = this.c;
        Object obj14 = this.b;
        switch (b) {
            case 0:
                df8 df8Var = (df8) obj;
                if (!((bf8) obj2).equals(bf8.a)) {
                    eg.o();
                    return null;
                }
                Uri uri = Uri.parse(df8Var.a);
                xxf xxfVar = jxf.b;
                xxf xxfVar2 = xxf.b;
                if (xxfVar == xxfVar2) {
                    n57.e("CheckoutSource must not be " + xxfVar2);
                }
                zhh1 zhh1Var = ((ff8) obj14).a;
                Activity activity = (Activity) obj13;
                x8g x8gVar = zhh1Var.a;
                v5g v5gVarB = x8gVar.c(uri) ? x8gVar.b(xxfVar, uri) : null;
                activity.startActivity(v5gVarB != null ? x8g.a(activity, v5gVarB) : zhh1Var.b.a(activity, new lyf(xxfVar, new jyf(activity.getString(2131953829)), uri)));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                iu30 iu30Var = (iu30) obj13;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean z = ((qn8) obj14).f;
                    qim0 qim0VarB = u291.B(nim0Var, (gra) null, 3);
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        obj4 = objT;
                        ib2 ib2Var = new ib2(iu30Var, (byte) 22);
                        x340Var2.s0(ib2Var);
                        obj4 = ib2Var;
                    }
                    obj4 = objT;
                    qro1.d(z, (iu30) obj4, "", qim0VarB, false, (idn0) null, (max) null, x340Var2, 3456, 112);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                iu30 iu30Var2 = (iu30) obj13;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean z2 = ((ep8) obj14).c;
                    qim0 qim0VarB2 = u291.B(nim0Var, (gra) null, 3);
                    boolean zG2 = x340Var4.g(iu30Var2);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        obj5 = objT2;
                        ib2 ib2Var2 = new ib2(iu30Var2, (byte) 23);
                        x340Var4.s0(ib2Var2);
                        obj5 = ib2Var2;
                    }
                    obj5 = objT2;
                    qro1.d(z2, (iu30) obj5, "", qim0VarB2, false, (idn0) null, (max) null, x340Var4, 3456, 112);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    u39 u39Var = (u39) obj14;
                    Function0 function0 = (Function0) obj13;
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var6, 48);
                    int iHashCode = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM = x340Var6.m();
                    qim0 qim0VarE = zr7.E(x340Var6, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(jw31VarA, x340Var6, y580.O0);
                    nko1.H(xos0VarM, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE, x340Var6, y580.Y);
                    af5 af5Var = u39Var.b;
                    cjc0 cjc0Var = new cjc0(u39Var.f ? 2 : 1);
                    uwr uwrVar = cbx.a;
                    uwo1.f(af5Var, new wnb0(1.0f, true), cbx.d(x340Var6).g, (x9h) null, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, (cqs0) null, x340Var6, 1572864, 0, 3768);
                    mta mtaVar = cbx.b(x340Var6).d;
                    qim0 qim0VarV = u291.v(nim0Var, 48.0f);
                    if (u39Var.g) {
                        x340Var6.i0(1639046496);
                        gdxVarR = yla.s(x340Var6);
                    } else {
                        x340Var6.i0(1639047393);
                        gdxVarR = yla.r(x340Var6);
                    }
                    x340Var6.r(false);
                    wro1.h(new gbx(z50Var, function0), ldx.c, qim0VarV, (max) null, gdxVarR, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(1222196996, new mu6(u39Var, (byte) 17), x340Var6), x340Var6, 12582960, 6, 856);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj3).intValue();
                phx phxVar = (phx) obj14;
                bmq0.a(Uri.parse(phxVar.a), (qim0) null, (hcx) obj13, phxVar.b, phxVar.c, phxVar.d, 0L, false, (b0k) obj2, 0, 194);
                return rih1Var;
            case 5:
                nw31 nw31Var = (nw31) obj;
                ((Number) obj3).intValue();
                x340 x340Var7 = (b0k) obj2;
                x340Var7.i0(-927155269);
                c380 c380Var = (c380) obj14;
                j2i j2iVar = (j2i) obj13;
                int i = 0;
                for (Object obj15 : c380Var) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    j2iVar.c1(Integer.valueOf(i), (ao9) obj15, nw31Var.a(1.0f, nim0Var, true), x340Var7, 0);
                    i = i2;
                }
                x340Var7.r(false);
                int size = 4 - c380Var.size();
                for (int i3 = 0; i3 < size; i3++) {
                    op71.g(x340Var7, nw31Var.a(1.0f, nim0Var, true));
                }
                return rih1Var;
            case 6:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                gka gkaVar = (gka) obj14;
                z8p1.b(0, gkaVar.d, b0kVar, ((g2c) obj).b(nim0Var));
                z8p1.d(gkaVar, (Function0) obj13, b0kVar, 0);
                return rih1Var;
            case 7:
                x340 x340Var8 = (b0k) obj2;
                ((Number) obj3).intValue();
                yza yzaVar = (yza) obj14;
                String str = (String) obj13;
                jw31 jw31VarA2 = ew31.a(h36.a, een.N0, x340Var8, 0);
                x340 x340Var9 = x340Var8;
                int iHashCode2 = Long.hashCode(x340Var9.T);
                xos0 xos0VarM2 = x340Var9.m();
                qim0 qim0VarE2 = zr7.E(x340Var8, nim0Var);
                hzj.A.getClass();
                x340 x340Var10 = x340Var8;
                if (x340Var10.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var10.m0();
                if (x340Var10.S) {
                    x340Var10.l(n4kVar);
                } else {
                    x340Var10.v0();
                }
                nko1.H(jw31VarA2, x340Var8, y580.O0);
                nko1.H(xos0VarM2, x340Var8, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var8, y580.R0);
                nko1.F(x340Var8);
                nko1.H(qim0VarE2, x340Var8, y580.Y);
                uza uzaVar = yzaVar.b;
                String str2 = uzaVar.c;
                phx phxVar2 = new phx(10, 0L, str2 == null ? "" : str2, (String) null, uzaVar.b);
                uza uzaVar2 = yzaVar.a;
                String str3 = uzaVar2.c;
                n1p1.a(mqo1.s(new phx[]{phxVar2, new phx(10, 0L, str3 == null ? "" : str3, (String) null, uzaVar2.b)}), (qim0) null, hcx.b, 4.0f, 2.0f, x340Var8, 24584);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var8).b;
                op71.g(x340Var8, u291.v(nim0Var, 8.0f));
                uwo1.e(str, (qim0) null, cbx.d(x340Var8).k, cbx.a(x340Var8).b.a, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var8, 0, 0, 1778);
                x340Var10.r(true);
                return rih1Var;
            case 8:
                tqw tqwVar = (tqw) obj3;
                if (((wcg) obj2) != wcg.a) {
                    eg.o();
                    return null;
                }
                if (tqwVar != null) {
                    ((lzn0) obj14).a((String) obj13, n3o1.y(tqwVar), (Bundle) null);
                }
                return rih1Var;
            case 9:
                return new rd8((cir0) obj, (q59) obj14, (ymd0) obj2, (j2i) obj13, (Function0) obj3);
            case 10:
                ((Number) obj3).intValue();
                otw.c((xpw) obj14, (j3f1) obj13, u291.f(nim0Var, 1.0f), (ipb1) null, (b0k) obj2, 0, 8);
                return rih1Var;
            case 11:
                x340 x340Var11 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                uwr uwrVar3 = cbx.a;
                qim0 qim0VarB3 = uyn1.B(qim0VarF2, 0.0f, 0.0f, 0.0f, cbx.b(x340Var11).b.d, 7);
                iu30 iu30Var3 = (iu30) obj14;
                scx scxVar = (scx) obj13;
                mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var11, 0);
                x340 x340Var12 = x340Var11;
                int iHashCode3 = Long.hashCode(x340Var12.T);
                xos0 xos0VarM3 = x340Var12.m();
                qim0 qim0VarE3 = zr7.E(x340Var11, qim0VarB3);
                hzj.A.getClass();
                x340 x340Var13 = x340Var11;
                if (x340Var13.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                nko1.H(mbhVarA, x340Var11, y580.O0);
                nko1.H(xos0VarM3, x340Var11, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var11, y580.R0);
                nko1.F(x340Var11);
                nko1.H(qim0VarE3, x340Var11, y580.Y);
                String strO0 = cwl1.o0(x340Var11, 2131953124);
                lee1 lee1Var = cbx.d(x340Var11).h;
                long j = cbx.a(x340Var11).b.a;
                tq60 tq60Var = new tq60(een.Q0);
                cvx cvxVar2 = cbx.b(x340Var11).b;
                uwo1.e(strO0, uyn1.x(tq60Var, 16.0f), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var11, 0, 0, 2016);
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                avw0 avw0Var = cbx.b(x340Var11).c;
                op71.g(x340Var11, dug.f(u291.h(qim0VarF3, 1.0f), u7h.b(cbx.a(x340Var11).d.a, 0.3f, 0.0f, 0.0f, 0.0f, 14), u5j1Var));
                String strO1 = cwl1.o0(x340Var11, 2131953123);
                lee1 lee1Var2 = cbx.d(x340Var11).g;
                long j2 = cbx.a(x340Var11).b.a;
                cvx cvxVar3 = cbx.b(x340Var11).b;
                qim0 qim0VarX = uyn1.x(nim0Var, 16.0f);
                boolean zG3 = x340Var13.g(iu30Var3) | x340Var13.i(scxVar);
                Object objT3 = x340Var13.T();
                Object obj16 = objT3;
                if (zG3 || objT3 == m4cVar) {
                    h6d h6dVar = new h6d(iu30Var3, scxVar, (byte) 0);
                    x340Var13.s0(h6dVar);
                    obj16 = h6dVar;
                }
                uwo1.e(strO1, bin.x(qim0VarX, false, (String) null, (pm31) null, (idn0) null, (Function0) obj16, 15), lee1Var2, j2, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var11, 0, 0, 2016);
                String strO2 = cwl1.o0(x340Var11, 2131953122);
                lee1 lee1Var3 = cbx.d(x340Var11).g;
                long j3 = cbx.a(x340Var11).b.a;
                cvx cvxVar4 = cbx.b(x340Var11).b;
                qim0 qim0VarX2 = uyn1.x(nim0Var, 16.0f);
                boolean zG4 = x340Var13.g(iu30Var3) | x340Var13.i(scxVar);
                Object objT4 = x340Var13.T();
                Object obj17 = objT4;
                if (zG4 || objT4 == m4cVar) {
                    h6d h6dVar2 = new h6d(iu30Var3, scxVar, (byte) 1);
                    x340Var13.s0(h6dVar2);
                    obj17 = h6dVar2;
                }
                uwo1.e(strO2, bin.x(qim0VarX2, false, (String) null, (pm31) null, (idn0) null, (Function0) obj17, 15), lee1Var3, j3, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var11, 0, 0, 2016);
                x340Var13.r(true);
                return rih1Var;
            case 12:
                x340 x340Var14 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                iu30 iu30Var4 = (iu30) obj13;
                evl evlVar = (evl) obj14;
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    Uri uri2 = Uri.parse(evlVar.a);
                    jsl jslVar = new jsl(evlVar.b);
                    as80 as80Var = mif1.P0;
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    cr31 cr31Var = er31.a;
                    tyy0 tyy0VarF = nko1.f(16.0f);
                    qim0 qim0VarQ = i1p1.q(qim0VarD, new cr31(tyy0VarF, tyy0VarF, tyy0VarF, tyy0VarF));
                    boolean zG5 = x340Var15.g(iu30Var4) | x340Var15.g(evlVar);
                    Object objT5 = x340Var15.T();
                    if (zG5 || objT5 == fkj0.X) {
                        obj6 = objT5;
                        rqa rqaVar = new rqa(iu30Var4, evlVar, b2);
                        x340Var15.s0(rqaVar);
                        obj6 = rqaVar;
                    }
                    obj6 = objT5;
                    eso1.e(uri2, jslVar, bin.x(qim0VarQ, false, (String) null, (pm31) null, (idn0) null, (Function0) obj6, 15), (p3v) null, (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var15, 1572864, 0, 4024);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var16 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    qim0 qim0VarQ2 = i1p1.q(nim0Var, er31.b(8.0f));
                    jvl jvlVar = (jvl) obj14;
                    iu30 iu30Var5 = (iu30) obj13;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode4 = Long.hashCode(x340Var17.T);
                    xos0 xos0VarM4 = x340Var17.m();
                    qim0 qim0VarE4 = zr7.E(x340Var17, qim0VarQ2);
                    hzj.A.getClass();
                    if (x340Var17.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var17.m0();
                    if (x340Var17.S) {
                        x340Var17.l(n4kVar);
                    } else {
                        x340Var17.v0();
                    }
                    nko1.H(gfh0VarC, x340Var17, y580.O0);
                    nko1.H(xos0VarM4, x340Var17, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode4), x340Var17, y580.R0);
                    nko1.F(x340Var17);
                    nko1.H(qim0VarE4, x340Var17, y580.Y);
                    String str4 = jvlVar.a;
                    String str5 = jvlVar.b;
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    boolean zG6 = x340Var17.g(iu30Var5) | x340Var17.g(jvlVar);
                    Object objT6 = x340Var17.T();
                    if (zG6 || objT6 == fkj0.X) {
                        obj7 = objT6;
                        rqa rqaVar2 = new rqa((Object) iu30Var5, (Object) jvlVar, (byte) 22);
                        x340Var17.s0(rqaVar2);
                        obj7 = rqaVar2;
                    }
                    obj7 = objT6;
                    q7f0.a("image-carousel-looping-video", str4, str5, bin.x(qim0VarD2, false, (String) null, (pm31) null, (idn0) null, (Function0) obj7, 15), b3k1.c, false, x340Var17, 24582, 32);
                    x340Var17.r(true);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 14:
                i2c i2cVar = (i2c) obj;
                x340 x340Var18 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarH = l6o1.H(u291.d(nim0Var, 1.0f), (es41) obj14, false, 14);
                j2i j2iVar2 = (j2i) obj13;
                gfh0 gfh0VarC2 = t1c.c(een.e, false);
                x340 x340Var19 = x340Var18;
                int iHashCode5 = Long.hashCode(x340Var19.T);
                xos0 xos0VarM5 = x340Var19.m();
                qim0 qim0VarE5 = zr7.E(x340Var18, qim0VarH);
                hzj.A.getClass();
                x340 x340Var20 = x340Var18;
                if (x340Var20.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var20.m0();
                if (x340Var20.S) {
                    x340Var20.l(n4kVar);
                } else {
                    x340Var20.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC2, x340Var18, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM5, x340Var18, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode5);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var18, lljVar3);
                nko1.F(x340Var18);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE5, x340Var18, lljVar4);
                qim0 qim0VarJ = u291.j(i2cVar.c(), 0.0f, 2, u291.f(u291.x(0.0f, dsa0.m(x340Var18, 2131166901), 1, nim0Var), 1.0f));
                gfh0 gfh0VarC3 = t1c.c(een.d, true);
                int iHashCode6 = Long.hashCode(x340Var20.T);
                xos0 xos0VarM6 = x340Var20.m();
                qim0 qim0VarE6 = zr7.E(x340Var18, qim0VarJ);
                x340Var20.m0();
                if (x340Var20.S) {
                    x340Var20.l(n4kVar);
                } else {
                    x340Var20.v0();
                }
                nko1.H(gfh0VarC3, x340Var18, lljVar);
                nko1.H(xos0VarM6, x340Var18, lljVar2);
                i3a.l(iHashCode6, x340Var18, lljVar3, x340Var18);
                nko1.H(qim0VarE6, x340Var18, lljVar4);
                j2iVar2.invoke(x340Var18, 0);
                x340Var20.r(true);
                x340Var20.r(true);
                return rih1Var;
            case 15:
                ((Number) obj3).intValue();
                uwo1.e(((yve) obj14).b.a(((wve) obj13).g), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (b0k) obj2, 0, 0, Entity.AUTOCOMPLETE_FIELD_NUMBER);
                return rih1Var;
            case 16:
                int iIntValue6 = ((Number) obj).intValue();
                x340 x340Var21 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= x340Var21.e(iIntValue6) ? 4 : 2;
                }
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    m4f m4fVar = (m4f) ((List) obj14).get(iIntValue6);
                    x340Var22.i0(1216138269);
                    otw.c((p4f) obj13, m4fVar, (qim0) null, (ipb1) null, x340Var22, 64, 12);
                    x340Var22.r(false);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj3).intValue();
                x340 x340Var23 = (b0k) obj2;
                x340Var23.i0(241731954);
                w4i1 w4i1Var = (w4i1) obj14;
                c380 c380VarA = mqo1.A(Collections.singletonList(w4i1Var));
                Parcelable.Creator creator = w4i1.CREATOR;
                aqo1.f(6, 4, x340Var23, hcx.e, c380VarA, (qim0) null);
                String str6 = w4i1Var.b;
                uwr uwrVar4 = cbx.a;
                lee1 lee1Var4 = cbx.d(x340Var23).e;
                long j4 = cbx.a(x340Var23).b.a;
                cjc0 cjc0Var2 = new cjc0(1);
                cvx cvxVar5 = cbx.b(x340Var23).b;
                uwo1.e(str6, uyn1.z(0.0f, 8.0f, 1, nim0Var), lee1Var4, j4, (a0e1) null, (iu30) null, 2, false, cjc0Var2, 0, (qx8) null, x340Var23, 0, 0, 1712);
                x340Var23.r(false);
                iu30 iu30Var6 = (iu30) obj13;
                boolean zG7 = x340Var23.g(iu30Var6) | x340Var23.i(w4i1Var);
                Object objT7 = x340Var23.T();
                if (zG7 || objT7 == fkj0.X) {
                    obj8 = objT7;
                    g5f g5fVar = new g5f(iu30Var6, w4i1Var, (byte) 0);
                    x340Var23.s0(g5fVar);
                    obj8 = g5fVar;
                }
                obj8 = objT7;
                foo1.c(new gbx(z50Var, (Function0) obj8), jdx.c, (qim0) null, (max) null, yla.s(x340Var23), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, sbi.b, x340Var23, 0, 48, 2012);
                return rih1Var;
            case 18:
                x340 x340Var24 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                iu30 iu30Var7 = (iu30) obj13;
                m4c m4cVar2 = fkj0.X;
                skf skfVar = (skf) obj14;
                ctf ctfVar = skfVar.b;
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    w4i1 w4i1Var2 = skfVar.c;
                    ArrayList arrayListN0 = skfVar.d;
                    boolean zG8 = x340Var25.g(ctfVar) | x340Var25.g(arrayListN0) | x340Var25.g(w4i1Var2);
                    Object objT8 = x340Var25.T();
                    if (zG8 || objT8 == m4cVar2) {
                        obj9 = objT8;
                        if ((ctfVar instanceof btf) && arrayListN0.size() == 1) {
                            arrayListN0 = o7h.N0(arrayListN0, Collections.singletonList(w4i1Var2));
                        }
                        c380 c380VarA2 = mqo1.A(arrayListN0);
                        x340Var25.s0(c380VarA2);
                        obj9 = c380VarA2;
                    }
                    c380 c380Var2 = (c380) obj9;
                    boolean zG9 = x340Var25.g(iu30Var7);
                    Object objT9 = x340Var25.T();
                    Object obj18 = objT9;
                    if (zG9 || objT9 == m4cVar2) {
                        ggf ggfVar = new ggf(iu30Var7, (byte) 18);
                        x340Var25.s0(ggfVar);
                        obj18 = ggfVar;
                    }
                    qim0 qim0VarX3 = bin.x(nim0.a, false, (String) null, (pm31) null, (idn0) null, (Function0) obj18, 15);
                    Parcelable.Creator creator2 = w4i1.CREATOR;
                    aqo1.f(6, 0, x340Var25, hcx.d, c380Var2, qim0VarX3);
                } else {
                    x340Var25.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj3).intValue();
                anm1.c(((enf) obj14).c, (iu30) null, (qim0) null, (max) obj13, (idn0) null, (b0k) obj2, 48, 20);
                return rih1Var;
            case 20:
                int iIntValue9 = ((Number) obj).intValue();
                x340 x340Var26 = (b0k) obj2;
                int iIntValue10 = ((Number) obj3).intValue();
                iu30 iu30Var8 = (iu30) obj13;
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= x340Var26.e(iIntValue9) ? 4 : 2;
                }
                x340 x340Var27 = x340Var26;
                if (x340Var27.Y(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    s4g s4gVar = (s4g) ((ArrayList) obj14).get(iIntValue9);
                    x340Var27.i0(-987110098);
                    boolean z3 = iIntValue9 == 0;
                    boolean zG10 = ((((iIntValue10 & 14) ^ 6) > 4 && x340Var27.e(iIntValue9)) || (iIntValue10 & 6) == 4) | x340Var27.g(iu30Var8);
                    Object objT10 = x340Var27.T();
                    if (zG10 || objT10 == fkj0.X) {
                        obj10 = objT10;
                        z0e z0eVar = new z0e(iu30Var8, iIntValue9, (byte) 1);
                        x340Var27.s0(z0eVar);
                        obj10 = z0eVar;
                    }
                    obj10 = objT10;
                    poo1.g(z3, (iu30) obj10, new nex(4), yoo1.z(x340Var27), (qim0) null, 0, (qex) null, (String) null, (max) null, (vu30) null, (vu30) null, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(1521805491, new qff(s4gVar, (byte) 8), x340Var27), x340Var27, 0, 196608, 32752);
                    x340Var27.r(false);
                } else {
                    x340Var27.b0();
                }
                return rih1Var;
            case 21:
                i2c i2cVar2 = (i2c) obj;
                x340 x340Var28 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarF4 = u291.f(u291.x(0.0f, dsa0.m(x340Var28, 2131166901), 1, (qim0) obj14), 1.0f);
                j2i j2iVar3 = (j2i) obj13;
                mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var28, 0);
                x340 x340Var29 = x340Var28;
                int iHashCode7 = Long.hashCode(x340Var29.T);
                xos0 xos0VarM7 = x340Var29.m();
                qim0 qim0VarE7 = zr7.E(x340Var28, qim0VarF4);
                hzj.A.getClass();
                x340 x340Var30 = x340Var28;
                if (x340Var30.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var30.m0();
                if (x340Var30.S) {
                    x340Var30.l(n4kVar);
                } else {
                    x340Var30.v0();
                }
                nko1.H(mbhVarA2, x340Var28, y580.O0);
                nko1.H(xos0VarM7, x340Var28, y580.N0);
                nko1.H(Integer.valueOf(iHashCode7), x340Var28, y580.R0);
                nko1.F(x340Var28);
                nko1.H(qim0VarE7, x340Var28, y580.Y);
                j2iVar3.J(pbh.a, new hjl(i2cVar2.b), x340Var28, 6);
                x340Var30.r(true);
                return rih1Var;
            case 22:
                ((Number) obj3).intValue();
                a4p1.c((adj1) obj14, (paj1) obj13, (b0k) obj2, 0);
                return rih1Var;
            case 23:
                int iIntValue11 = ((Number) obj3).intValue();
                qzf qzfVar = (qzf) obj14;
                qzfVar.getClass();
                fyo1.b(qzfVar, (vzq0) obj, (iu30) obj13, (b0k) obj2, (iIntValue11 << 3) & 112);
                return rih1Var;
            case 24:
                ((Number) obj3).intValue();
                String str7 = ((o2g0) obj14).c;
                String str8 = (String) obj13;
                x340 x340Var31 = (b0k) obj2;
                boolean zG11 = x340Var31.g(str8);
                Object objT11 = x340Var31.T();
                if (zG11 || objT11 == fkj0.X) {
                    obj11 = objT11;
                    irf irfVar = new irf(str8, (byte) 23);
                    x340Var31.s0(irfVar);
                    obj11 = irfVar;
                }
                obj11 = objT11;
                qim0 qim0VarB4 = s161.b(nim0Var, false, (iu30) obj11);
                uwr uwrVar5 = cbx.a;
                uwo1.e(str7, qim0VarB4, cbx.d(x340Var31).j, cbx.a(x340Var31).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var31, 0, 0, 2032);
                return rih1Var;
            case 25:
                return a(obj, obj2, obj3);
            case 26:
                return d(obj, obj2, obj3);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return e(obj, obj2, obj3);
            case 28:
                return f(obj, obj2, obj3);
            default:
                ((Number) obj3).intValue();
                iu30 iu30Var9 = (iu30) obj14;
                x340 x340Var32 = (b0k) obj2;
                obk0 obk0Var = (obk0) obj13;
                boolean zG12 = x340Var32.g(iu30Var9) | x340Var32.g(obk0Var);
                Object objT12 = x340Var32.T();
                if (zG12 || objT12 == fkj0.X) {
                    obj12 = objT12;
                    dfi dfiVar = new dfi(iu30Var9, obk0Var, (byte) 15);
                    x340Var32.s0(dfiVar);
                    obj12 = dfiVar;
                }
                obj12 = objT12;
                gbx gbxVar = new gbx(z50Var, (Function0) obj12);
                ldx ldxVar = ldx.c;
                gdx gdxVarS = yla.s(x340Var32);
                cr31 cr31Var2 = nfc.e;
                foo1.c(gbxVar, ldxVar, exd0.s(dug.f(i1p1.q(u291.h(u291.v(nim0Var, 48.0f), 32.0f), nfc.f), nfc.c, u5j1Var), iub.Y0), (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-1600000160, new l8i(obk0Var, (byte) 21), x340Var32), x340Var32, 48, 48, 2008);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ef8(Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
