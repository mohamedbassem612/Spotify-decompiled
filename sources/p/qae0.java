package p;

import com.spotify.mainlayout.ui.view.containers.MainLayoutContentContainerView;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qae0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qae0(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bzn1.b((lik1) obj3, ((a001) obj4).a, (idm) obj5, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                x8p1.h((oie0) obj3, (iu30) obj4, (j2i) obj5, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                i9p1.h((ome0) obj3, (iu30) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                s9p1.f((nhe0) obj3, (Function0) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                s9p1.w((y7e1) obj3, (Function0) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                t9p1.c((aoe0) obj3, (Function0) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                j2i j2iVar = (j2i) obj5;
                iu30 iu30Var = (iu30) obj4;
                are0 are0Var = (are0) obj3;
                xoe0 xoe0Var = are0Var.a;
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    kbh kbhVar = xoe0Var.b;
                    if (kbhVar instanceof kbh) {
                        x340Var4.i0(-51178884);
                        jap1.d(xoe0Var.a, are0Var, kbhVar, iu30Var, j2iVar, x340Var4, 24576);
                        x340Var4.r(false);
                    } else {
                        if (!(kbhVar instanceof tj51)) {
                            throw p3d1.k(x340Var4, -51181175, false);
                        }
                        x340Var4.i0(-51170302);
                        jap1.m(xoe0Var.a, are0Var, (tj51) kbhVar, iu30Var, j2iVar, x340Var4, 24576);
                        x340Var4.r(false);
                    }
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 7:
                String str = (String) obj5;
                i3g1 i3g1Var = ((ccs0) obj4).X;
                ((LinkedHashSet) obj3).add(new jgw(i3g1Var.a, i3g1Var.b, str, c921.r((String) obj), (String) obj2));
                return rih1Var;
            case 8:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qze0 qze0Var = (qze0) obj3;
                    qze0Var.getClass();
                    sze0 sze0Var = (sze0) obj5;
                    vbe.p(0, x340Var6, sze0Var.e, (iu30) obj4, sze0Var.g, qze0Var, (qim0) null);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                vbe.l((w6e0) obj3, (Function0) obj4, (Function0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    r0f0 r0f0Var = (r0f0) obj3;
                    r0f0Var.getClass();
                    t0f0 t0f0Var = (t0f0) obj5;
                    sqe.h(r0f0Var, (iu30) obj4, t0f0Var.e, t0f0Var.f, t0f0Var.h, null, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                sqe.l((jqp) obj3, (r0f0) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                ((y1f0) obj3).e((c380) obj4, (uzg1) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                ((y1f0) obj3).j((String) obj4, (c380) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                ((a2f0) obj3).e((c380) obj4, (uzg1) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                ((a2f0) obj3).j((String) obj4, (c380) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                u7n0.e((c9) obj3, (xym) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                poz0.d((bff0) obj3, (Function0) obj4, (Function0) obj5, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 18:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                float fFloatValue = ((Number) obj2).floatValue();
                ((ven0) obj3).setValue(bool);
                if (zBooleanValue) {
                    ((ven0) obj4).setValue(Boolean.TRUE);
                }
                drr0 drr0Var = (drr0) obj5;
                drr0Var.t(yoi1.o(drr0Var.s() * fFloatValue, 0.73f, 1.52f));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                ((ng20) obj3).g(czo1.p(1), (Function0) obj4, (b0k) obj, (qim0) obj5);
                return rih1Var;
            case 20:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                gzf0 gzf0Var = (gzf0) obj3;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ely0 ely0VarA = k2r0.b.a(gzf0Var.b);
                    kiv kivVar = gfe0.a;
                    mod.c(new ely0[]{ely0VarA, gfe0.d(gzf0Var.c, x340Var10), szf0.a.a(gzf0Var.e), szf0.b.a(gzf0Var.f), kzf0.a.a(MainLayoutContentContainerView.D((MainLayoutContentContainerView) obj4))}, apo.r(1910856740, new d0e0((Object) gzf0Var, obj5, (byte) 28), x340Var10), x340Var10, 56);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                t3k1.a((bbr0) obj3, (eq80) obj4, (m1g0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                n1g0 n1g0Var = (n1g0) obj3;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    ely0 ely0VarA2 = k2r0.b.a(n1g0Var.b);
                    kiv kivVar2 = gfe0.a;
                    mod.c(new ely0[]{ely0VarA2, gfe0.d((Function0) obj4, x340Var12), szf0.a.a(n1g0Var.a.d)}, apo.r(1851733371, new ak10((j2i) obj5, (byte) 21), x340Var12), x340Var12, 56);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                nmn1.e((iyr0) obj3, (String) obj4, (j2i) obj5, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                qqn1.b((ygg0) obj3, (keg0) obj4, (iu30) obj5, (b0k) obj, czo1.p(49));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                irn1.d((plg0) obj3, (iu30) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                irn1.B((String) obj3, (grn1) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                lrn1.c((gmg0) obj3, (iu30) obj4, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                ftg0.i((String) obj3, (ctg0) obj4, (Function0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                String str2 = (String) obj5;
                o0g1 o0g1Var = (o0g1) obj4;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    String str3 = (String) obj3;
                    ctg0 ctg0Var = (ctg0) o0g1Var.c;
                    boolean zI = x340Var14.i(o0g1Var) | x340Var14.g(str2);
                    Object objT = x340Var14.T();
                    if (zI || objT == fkj0.X) {
                        objT = new bsc0(o0g1Var, str2, (byte) 29);
                        x340Var14.s0(objT);
                    }
                    ftg0.i(str3, ctg0Var, (Function0) objT, x340Var14, 0);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qae0(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
