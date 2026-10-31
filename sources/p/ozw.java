package p;

import android.net.Uri;
import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ozw extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozw(k0t k0tVar, ven0 ven0Var) {
        super(2);
        this.a = (byte) 21;
        this.c = k0tVar;
        this.b = ven0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        float f;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xpw xpwVar = (xpw) ((ven0) obj3).getValue();
                    if (xpwVar == null) {
                        x340Var2.i0(844734106);
                    } else {
                        x340Var2.i0(844734107);
                        otw.c(xpwVar, ((g0x) obj4).a, (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    }
                    x340Var2.r(false);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                vgo1.a((Uri) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                taj1 taj1Var = (taj1) obj;
                ((Function0) obj3).invoke();
                rmr rmrVar = ((l2x) obj4).f;
                raj1 raj1Var = taj1Var.c;
                String str = raj1Var.a;
                String str2 = raj1Var.b;
                String str3 = raj1Var.c;
                List list = taj1Var.e;
                fq0 fq0Var = taj1Var.a;
                String strA = fq0Var.a();
                String strK = fq0Var.k();
                String strH = fq0Var.h();
                String str4 = taj1Var.b;
                saj1 saj1Var = taj1Var.d;
                a1r0.j((a1r0) rmrVar.b, "spotify:internal:video-ad-overlay", (String) obj2, mno1.h(new mmr0[]{new mmr0("video_ad_overlay_parameters", new rcj1(str, str2, str3, list, strA, strK, strH, str4, saj1Var.b.g(), saj1Var.a, taj1Var.f, taj1Var.g, taj1Var.h, taj1Var.i))}), false, 8);
                return rih1Var;
            case 3:
                taj1 taj1Var2 = (taj1) obj;
                ((Function0) obj3).invoke();
                yje yjeVar = ((n2x) obj4).e;
                raj1 raj1Var2 = taj1Var2.c;
                String str5 = raj1Var2.a;
                String str6 = raj1Var2.b;
                String str7 = raj1Var2.c;
                List list2 = taj1Var2.e;
                fq0 fq0Var2 = taj1Var2.a;
                String strA2 = fq0Var2.a();
                String strK2 = fq0Var2.k();
                String strH2 = fq0Var2.h();
                String str8 = taj1Var2.b;
                saj1 saj1Var2 = taj1Var2.d;
                a1r0.j(yjeVar.a, "spotify:internal:video-ad-overlay", (String) obj2, mno1.h(new mmr0[]{new mmr0("video_ad_overlay_parameters", new rcj1(str5, str6, str7, list2, strA2, strK2, strH2, str8, saj1Var2.b.g(), saj1Var2.a, taj1Var2.f, taj1Var2.g, taj1Var2.h, taj1Var2.i))}), false, 8);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ajo1.g((t6x) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                flo1.b((b9x) obj3, (qim0) obj4, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ilo1.f((jdv) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                yyr yyrVar = (yyr) obj3;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ven0 ven0VarC = b2p1.C(yyrVar.c, x340Var4);
                    boolean zG = x340Var4.g(yyrVar.b);
                    Object objT = x340Var4.T();
                    if (zG || objT == fkj0.X) {
                        Object obj5 = yyrVar.b;
                        if (obj5 == null) {
                            obj5 = s8x.Y;
                        }
                        objT = obj5;
                        x340Var4.s0(objT);
                    }
                    iu30 iu30Var = (iu30) objT;
                    Object value = ven0VarC.getValue();
                    if (value == null) {
                        x340Var4.i0(-1301303008);
                    } else {
                        x340Var4.i0(-1301303007);
                        ((zu30) obj4).J(value, iu30Var, x340Var4, 0);
                    }
                    x340Var4.r(false);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tm80.a((if3) obj3, (qim0) null, (iu30) obj4, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    t6p1.b((zih) obj3, (iu30) obj4, (qim0) null, x340Var8, 0, 4);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    sj1.c((gg21) obj3, (iu30) obj4, (qim0) null, x340Var10, 8, 4);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    hux huxVar = (hux) obj3;
                    switch (((hcx) obj4).ordinal()) {
                        case 0:
                            x340Var12.i0(-1045363940);
                            x340Var12.r(false);
                            f = 8.0f;
                            break;
                        case 1:
                            x340Var12.i0(-1045365940);
                            uwr uwrVar = cbx.a;
                            zov0 zov0Var = cbx.b(x340Var12).g;
                            x340Var12.r(false);
                            f = 12.0f;
                            break;
                        case 2:
                            x340Var12.i0(-1045368725);
                            uwr uwrVar2 = cbx.a;
                            zov0 zov0Var2 = cbx.b(x340Var12).g;
                            x340Var12.r(false);
                            f = 16.0f;
                            break;
                        case 3:
                            x340Var12.i0(-1045371256);
                            uwr uwrVar3 = cbx.a;
                            zov0 zov0Var3 = cbx.b(x340Var12).g;
                            x340Var12.r(false);
                            f = 24.0f;
                            break;
                        case 4:
                            x340Var12.i0(-1045373444);
                            x340Var12.r(false);
                            f = 28.0f;
                            break;
                        case 5:
                            x340Var12.i0(-1045375094);
                            uwr uwrVar4 = cbx.a;
                            zov0 zov0Var4 = cbx.b(x340Var12).g;
                            x340Var12.r(false);
                            f = 32.0f;
                            break;
                        case 6:
                            x340Var12.i0(-1045362500);
                            x340Var12.r(false);
                            f = 10.0f;
                            break;
                        default:
                            throw p3d1.k(x340Var12, -1045377281, false);
                    }
                    w0h1.a(huxVar, isl.a, u291.r(nim0Var, f), 0L, 0L, false, x340Var12, 56, 56);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                fc11.b((phx) obj3, (hcx) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                hcx hcxVar = (hcx) obj4;
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                c380 c380Var = (c380) obj3;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    int size = c380Var.size();
                    if (size == 0) {
                        x340Var14.i0(1731459939);
                        op71.g(x340Var14, u291.r(nim0Var, hcxVar.a(x340Var14)));
                        x340Var14.r(false);
                    } else if (size == 1) {
                        x340Var14.i0(1731462253);
                        shx.c((phx) o7h.q0(c380Var), hcxVar, (qim0) null, x340Var14, 0);
                        x340Var14.r(false);
                    } else if (size != 2) {
                        x340Var14.i0(1731466445);
                        shx.b(c380Var, hcxVar, (qim0) null, x340Var14, 0);
                        x340Var14.r(false);
                    } else {
                        x340Var14.i0(1731464001);
                        shx.d((phx) c380Var.get(0), (phx) c380Var.get(1), (hcx) obj4, (qim0) null, x340Var14, 0);
                        x340Var14.r(false);
                    }
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    Boolean boolValueOf = Boolean.valueOf(!((tix) obj3).b.equals(qix.a));
                    Object objT2 = x340Var16.T();
                    if (objT2 == fkj0.X) {
                        objT2 = s8x.R0;
                        x340Var16.s0(objT2);
                    }
                    hm5.a(boolValueOf, (qim0) null, (iu30) objT2, (tl3) null, "Clear/More button transition", (iu30) null, apo.r(-779098809, new t7i((iu30) obj4, (byte) 3), x340Var16), x340Var16, 1597824, 42);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    wro1.j((gdx) obj3, (j2i) obj4, x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                vvx.a((xu30) obj3, (j2i) obj4, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 17:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ((xu30) obj3).invoke((ArrayList) obj4, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ((dyx) obj3).f(czo1.p(7), (j2i) obj4, (b0k) obj);
                return rih1Var;
            case 19:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    rus rusVar = m4f1.c;
                    uwr uwrVar5 = cbx.a;
                    v4f1.a((r5f1) obj3, (qim0) null, rusVar, 0.0f, (hw61) null, cbx.a(x340Var22).b.a, cbx.a(x340Var22).a.c, apo.r(-1307322865, new qeu((String) obj4, (byte) 21), x340Var22), x340Var22, 805306368, 205);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 20:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    cev0.e((v9y) obj3, (iu30) obj4, u291.d(nim0Var, 1.0f), x340Var24, 0);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 21:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                k0t k0tVar = (k0t) obj4;
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    Object objT3 = x340Var26.T();
                    m4c m4cVar = fkj0.X;
                    if (objT3 == m4cVar) {
                        objT3 = vay.X;
                        x340Var26.s0(objT3);
                    }
                    iu30 iu30Var2 = (iu30) objT3;
                    boolean zI = x340Var26.i(k0tVar);
                    ven0 ven0Var = (ven0) obj3;
                    Object objT4 = x340Var26.T();
                    if (zI || objT4 == m4cVar) {
                        objT4 = new jgy(k0tVar, ven0Var, (byte) 0);
                        x340Var26.s0(objT4);
                    }
                    dm5.a(iu30Var2, (qim0) null, (iu30) objT4, x340Var26, 6, 2);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 22:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    j541.d((xhy) obj3, (qim0) null, (iu30) obj4, x340Var28, 0);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                sgc1.q((fgx0) obj3, (n4b) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                ((ouy) obj3).e((String) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                tlc1 tlc1Var = (tlc1) obj;
                ((iu30) obj4).invoke(Integer.valueOf(((afh0) o7h.q0(tlc1Var.P(0, (j2i) obj3))).H(((hjl) obj2).a).b));
                return tlc1Var.S(0, 0, b7x.a, auy.b1);
            case 26:
                return l6o1.A(new jpg0(f6o1.A(new xho((kko) ((iu30) obj3).invoke((iac0) obj2), (q8n) obj4), new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2), new w8z((ymd0) obj, (byte) 1)));
            case 27:
                ymd0 ymd0Var = (ymd0) obj;
                d771 d771Var = (d771) obj3;
                lao laoVarA = d771Var.a();
                mr20 mr20VarI = t5p1.i(ymd0Var);
                u9c0 u9c0VarQ = cto1.q((iac0) obj2);
                alb1 alb1Var = new alb1(0L, Long.MAX_VALUE);
                ioj0 ioj0Var = (ioj0) ymd0Var.e();
                if (ioj0Var == null) {
                    ioj0Var = new ioj0();
                }
                return l6o1.A(new jpg0(new rt01(laoVarA, new hzw(d771Var, (byte) 12), d5p1.t(mr20VarI, u9c0VarQ, alb1Var, ioj0Var), (q8n) obj4), new f0z(ymd0Var, d771Var, (byte) 5)));
            case 28:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    ((xu30) obj3).invoke((rcz) obj4, x340Var30, 0);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                hqn1.e((i091) obj3, (yqg) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ozw(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ozw(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
