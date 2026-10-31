package p;

import android.view.ViewGroup;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.ComposeView;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import j$.time.Clock;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n7m extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7m(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        int i;
        Object obj3;
        Object obj4;
        Object obj5;
        String str;
        Object obj6;
        byte b = this.a;
        int i2 = 4;
        nim0 nim0Var = nim0.a;
        byte b2 = 7;
        boolean z = false;
        byte b3 = 1;
        rih1 rih1Var = rih1.a;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ((f8m) ((br0) obj10).c).n((m7m) obj9, (iu30) obj8, ((hdn0) obj7).s(), x340Var2, 3072);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                grn1.b(czo1.p(7), (j2i) obj10, (b0k) obj, (vu30) obj9, (vu30) obj8, (qim0) obj7);
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                ((cfm) obj10).e((pem) obj9, (jhm) obj8, (ihm) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ((cfm) obj10).i((pem) obj9, (Map) obj8, (qim0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                long j = ((Offset) obj).a;
                drr0 drr0Var = (drr0) obj10;
                drr0Var.t(yoi1.o(drr0Var.s() * ((Number) obj2).floatValue(), 1.0f, 3.0f));
                ven0 ven0Var = (ven0) obj9;
                if (drr0Var.s() > 1.0f) {
                    kaa0.j(frm.a(Offset.g(((Offset) ven0Var.getValue()).a, j), ((ni7) obj8).i(), ((yr80) ((ven0) obj7).getValue()).a, drr0Var.s()), ven0Var);
                } else {
                    kaa0.j(0L, ven0Var);
                }
                return rih1Var;
            case 5:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj8;
                pt ptVar = (pt) obj9;
                boh0 boh0Var = (boh0) obj7;
                List list = boh0Var.a;
                ynh0 ynh0Var = (aoh0) obj10;
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (ynh0Var instanceof ynh0) {
                    x340Var4.i0(899732511);
                    eth.a(ynh0Var.a, (qim0) null, (ni20) null, "preview_crossfade", apo.r(-1670343045, new drm(ptVar, boh0Var, iu30Var), x340Var4), x340Var4, 27648, 6);
                    x340Var4.r(false);
                } else if (ynh0Var instanceof znh0) {
                    x340Var4.i0(899746229);
                    vy30 vy30Var = ((znh0) ynh0Var).a;
                    ptVar.x(vy30Var, false, list.indexOf(vy30Var), list.size(), iu30Var, x340Var4, 48);
                    x340Var4.r(false);
                } else {
                    if (!(ynh0Var instanceof xnh0)) {
                        throw p3d1.k(x340Var4, 899730690, false);
                    }
                    x340Var4.i0(899755910);
                    ptVar.m(((xnh0) ynh0Var).a, iu30Var, x340Var4, 0);
                    x340Var4.r(false);
                }
                return rih1Var;
            case 6:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    i1o1.e((tyq) obj10, new hyf1((String) obj9, ((gym) obj8).a, (String) null, (qyf1) null, "a2c9be1164c24a8994bfac08e8ec5561", 12), (d0r) obj7, (qim0) null, (ipb1) null, ngi.a, (xu30) null, 0, (xu30) null, x340Var6, 196672, 236);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                dio1.e((zzm) obj10, (Function0) obj9, (Function0) obj8, (qim0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                ((xcn) obj10).a((adn) obj9, (iu30) obj8, (qim0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                ((ldo) obj10).k((hux) obj9, (List) obj8, (qim0) obj7, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                bro1.a((ohm0) obj10, (pzn) obj9, (qim0) obj7, (iu30) obj8, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                ((wzn) obj10).a((fso) obj9, (fw20) obj8, (qim0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                h4p1.a((v720) obj10, (iu30) obj8, (qim0) obj9, (Clock) obj7, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                l4p1.c((x5r) obj10, (iu30) obj8, (Function0) obj9, (qim0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                kub1 kub1Var = (kub1) obj2;
                mwb mwbVar = ((qor) obj10).c;
                UUID uuid = (UUID) obj9;
                int iOrdinal = ((bh91) obj).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            i2 = 3;
                            if (iOrdinal != 3) {
                                eg.o();
                                return null;
                            }
                        } else {
                            i2 = 5;
                        }
                    }
                    i = i2;
                } else {
                    i = 2;
                }
                mwbVar.a(uuid, i, kub1Var, (t6l) obj8, (m6l) obj7);
                return rih1Var;
            case 15:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                ComposeView composeView = (ComposeView) obj8;
                ViewGroup viewGroup = (ViewGroup) obj9;
                lls0 lls0Var = (lls0) obj10;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objT = x340Var8.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        obj3 = objT;
                        hrr0 hrr0VarQ = v8r.q(Boolean.TRUE);
                        x340Var8.s0(hrr0VarQ);
                        obj3 = hrr0VarQ;
                    }
                    obj3 = objT;
                    ven0 ven0Var2 = (ven0) obj3;
                    if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                        x340Var8.i0(1077465715);
                        nyx.a(1, (wux) null, apo.r(619301795, new won(ven0Var2, lls0Var, (String) obj7, b2), x340Var8), x340Var8, 3078, 6);
                        x340Var8.r(false);
                    } else {
                        x340Var8.i0(1078147405);
                        boolean zI = x340Var8.i(lls0Var) | x340Var8.i(viewGroup) | x340Var8.i(composeView);
                        Object objT2 = x340Var8.T();
                        if (zI || objT2 == m4cVar) {
                            gke gkeVar = new gke(lls0Var, viewGroup, composeView, (lnm) null, (byte) 23);
                            x340Var8.s0(gkeVar);
                            objT2 = gkeVar;
                        }
                        qxd0.t(rih1Var, x340Var8, (vu30) objT2);
                        x340Var8.r(false);
                    }
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                ((its) obj10).a((j2i) obj9, (iu30) obj8, (op80) obj7, (b0k) obj, czo1.p(3127));
                return rih1Var;
            case 17:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qsw.c(new obk1((ComposeView) obj10), apo.r(-775548490, new iys((gw70) obj9, (jys) obj8, (ng20) obj7, b3), x340Var10), x340Var10, 48);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ((l6s) obj10).b((q160) obj9, (iu30) obj8, (vu30) obj7, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                ((l2u) obj10).a((mso) obj9, (Function0) obj8, (Function0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 20:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                iu30 iu30Var2 = (iu30) obj8;
                ziu ziuVar = (ziu) obj10;
                fiu fiuVar = (fiu) obj9;
                aiu aiuVar = fiuVar.b;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Boolean bool = (Boolean) ((ven0) obj7).getValue();
                    bool.getClass();
                    boolean zI2 = x340Var12.i(ziuVar) | x340Var12.g(iu30Var2);
                    Object objT3 = x340Var12.T();
                    if (zI2 || objT3 == fkj0.X) {
                        obj4 = null;
                        n5s n5sVar = new n5s(ziuVar, iu30Var2, (lnm) null, (byte) 29);
                        x340Var12.s0(n5sVar);
                        obj5 = n5sVar;
                    } else {
                        obj4 = null;
                        obj5 = objT3;
                    }
                    qxd0.t(bool, x340Var12, (vu30) obj5);
                    int iC = l1d.C(aiuVar.c);
                    if (iC == 0) {
                        str = zyd1.a;
                    } else if (iC == 1) {
                        str = zyd1.b;
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return obj4;
                        }
                        str = zyd1.c;
                    }
                    qim0 qim0VarN = anm1.N(str, nim0Var);
                    int iC2 = l1d.C(aiuVar.c);
                    if (iC2 == 0) {
                        x340Var12.i0(1655919674);
                        cso1.i(0, x340Var12, ziuVar, iu30Var2, qim0VarN);
                        x340Var12.r(false);
                    } else if (iC2 == 1) {
                        x340Var12.i0(1655922615);
                        if (fiuVar.e.f()) {
                            x340Var12.i0(1655923479);
                            nho1.f(0, x340Var12, ziuVar, iu30Var2, qim0VarN);
                            x340Var12.r(false);
                        } else {
                            x340Var12.i0(1655925653);
                            iho1.d(0, x340Var12, ziuVar, iu30Var2, qim0VarN);
                            x340Var12.r(false);
                        }
                        x340Var12.r(false);
                    } else {
                        if (iC2 != 2) {
                            throw p3d1.k(x340Var12, 1655918324, false);
                        }
                        x340Var12.i0(1655928019);
                        ppo1.h(0, x340Var12, ziuVar, iu30Var2, qim0VarN);
                        x340Var12.r(false);
                    }
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ((vqv) obj10).f.d((String) obj7, ((htb) obj9).a, (iu30) obj8, x340Var14, 0);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ((tjq) obj10).d((String) obj9, (bek0) obj7, (iu30) obj8, (b0k) obj, czo1.p(1));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                k6a1 k6a1Var = (k6a1) obj7;
                iu30 iu30Var3 = (iu30) obj8;
                jut jutVar = (jut) obj9;
                m3w m3wVar = (m3w) obj10;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    j2i j2iVarR = apo.r(-513753790, new won((Object) m3wVar, iu30Var3, (Object) jutVar, (byte) 28), x340Var16);
                    boolean zI3 = x340Var16.i(m3wVar) | x340Var16.i(jutVar) | x340Var16.i(k6a1Var) | x340Var16.g(iu30Var3);
                    Object objT4 = x340Var16.T();
                    if (zI3 || objT4 == fkj0.X) {
                        jzm jzmVar = new jzm(m3wVar, jutVar, k6a1Var, iu30Var3, (byte) 11);
                        x340Var16.s0(jzmVar);
                        objT4 = jzmVar;
                    }
                    bzn1.e((qim0) null, (vu30) null, false, j2iVarR, (sgr0) null, (ngr0) null, (ygr0) null, (Function0) objT4, x340Var16, 3072, 119);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                o2w.e((y7e1) obj10, (job1) obj9, (iu30) obj8, (qim0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                rrn1.k((String) obj10, (String) obj9, (u7h) obj8, (qim0) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ((q3b1) ((efr) obj10).b).b(70, apo.r(-52489366, new g6w((ViewGroup) obj9, (xpw) obj8, (k331) obj7, (byte) 4), x340Var18), x340Var18);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 27:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var4 = (iu30) obj8;
                ad80 ad80Var = (g0x) obj10;
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ad80 ad80Var2 = ad80Var;
                    e441 e441Var = ad80Var2.m;
                    e441Var.getClass();
                    wat watVar = (wat) x340Var20.k(t4k.h);
                    qim0 qim0VarW = uyn1.w(nim0Var, new zzq0(watVar.M0(e441Var.a), watVar.M0(e441Var.c), watVar.M0(e441Var.b), watVar.M0(e441Var.d)));
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var20).g;
                    qim0 qim0VarZ = uyn1.z(0.0f, 12.0f, 1, qim0VarW);
                    boolean zG = x340Var20.g(iu30Var4);
                    Object objT5 = x340Var20.T();
                    if (zG || objT5 == m4cVar2) {
                        obj6 = objT5;
                        hws hwsVar = new hws(iu30Var4, (byte) 25);
                        x340Var20.s0(hwsVar);
                        obj6 = hwsVar;
                    }
                    qim0 qim0VarU = lrn1.u(qim0VarZ, (iu30) obj6);
                    pzw pzwVar = (pzw) obj9;
                    ven0 ven0Var3 = (ven0) obj7;
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var20.T);
                    xos0 xos0VarM = x340Var20.m();
                    qim0 qim0VarE = zr7.E(x340Var20, qim0VarU);
                    hzj.A.getClass();
                    if (x340Var20.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var20.m0();
                    if (x340Var20.S) {
                        x340Var20.l(hmb0.t1);
                    } else {
                        x340Var20.v0();
                    }
                    nko1.H(gfh0VarC, x340Var20, y580.O0);
                    nko1.H(xos0VarM, x340Var20, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var20, y580.R0);
                    nko1.F(x340Var20);
                    nko1.H(qim0VarE, x340Var20, y580.Y);
                    boolean zE = ad80Var2.e();
                    boolean zI4 = x340Var20.i(pzwVar) | x340Var20.i(ad80Var);
                    Object objT6 = x340Var20.T();
                    Object obj11 = objT6;
                    if (zI4 || objT6 == m4cVar2) {
                        w3w w3wVar = new w3w(pzwVar, ad80Var, (byte) 10);
                        x340Var20.s0(w3wVar);
                        obj11 = w3wVar;
                    }
                    vgo1.p(zE, (iu30) obj11, apo.r(-1694112852, new ozw(ven0Var3, ad80Var, z ? (byte) 1 : (byte) 0), x340Var20), apo.r(-471510227, new hzw(ad80Var, (byte) 1), x340Var20), x340Var20, 3456);
                    x340Var20.r(true);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    foo1.e((gdx) obj10, (vu30) obj9, (j2i) obj8, (vu30) obj7, x340Var22, 0);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                foo1.e((gdx) obj10, (vu30) obj9, (vu30) obj8, (vu30) obj7, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7m(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7m(Object obj, Object obj2, Object obj3, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7m(Object obj, Object obj2, Object obj3, iu30 iu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.e = obj3;
        this.d = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7m(Object obj, iu30 iu30Var, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = iu30Var;
        this.c = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7m(Object obj, iu30 iu30Var, xpw xpwVar, ven0 ven0Var, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = iu30Var;
        this.c = xpwVar;
        this.e = ven0Var;
    }
}
