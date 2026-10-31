package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Header;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lk0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk0(bf00 bf00Var, xfx xfxVar, p40 p40Var, iu30 iu30Var, int i, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 10;
        this.d = xfxVar;
        this.e = p40Var;
        this.f = iu30Var;
        this.b = i;
        this.g = qim0Var;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.c;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarW = uyn1.w(l6o1.H(nim0.a, l6o1.C(0, 0, 1, x340Var2), false, 14), (vzq0) obj6);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarZ = uyn1.z(0.0f, 16.0f, 1, qim0VarW);
                    oj80 oj80Var = (oj80) obj5;
                    Integer num = (Integer) obj4;
                    List list = (List) obj3;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
                    hzj.A.getClass();
                    String strK = null;
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
                    tm tmVar = (tm) oj80Var.c;
                    String strO0 = cwl1.o0(x340Var2, i);
                    if (num == null) {
                        x340Var2.i0(-1623994966);
                        x340Var2.r(false);
                    } else {
                        strK = kk0.k(x340Var2, -1623994965, num, x340Var2, false);
                    }
                    x340Var2.i0(1471636791);
                    List<uk0> list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    for (uk0 uk0Var : list2) {
                        arrayList.add(new qk0(uk0Var.a, cwl1.o0(x340Var2, uk0Var.b)));
                    }
                    x340Var2.r(false);
                    otw.c(tmVar, new pk0(this.b, strO0, strK, arrayList), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                int iP = czo1.p(i | 1);
                lmt0.a((hx3) obj6, this.b, (km3) obj5, (iu30) obj4, atomicBoolean, (b0k) obj, iP);
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                ((lf6) obj6).a((i2c) obj5, this.b, (rk41) obj4, (Function0) obj3, (b0k) obj, iP2);
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                qim0 qim0Var = (qim0) obj3;
                int iP3 = czo1.p(i | 1);
                dko1.d((n5m) obj6, this.b, (d0r) obj5, (bnr) obj4, qim0Var, (b0k) obj, iP3);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                ((b87) obj6).f((aqb0) obj5, (l77) obj4, this.b, (n8b1) obj3, (b0k) obj, iP4);
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                ((q87) obj6).d((rb7) obj5, (iu30) obj4, this.b, (qim0) obj3, (b0k) obj, iP5);
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                int iP6 = czo1.p(i | 1);
                pap1.d((llw0) obj6, this.b, (String) obj5, (String) obj4, (qim0) obj3, (b0k) obj, iP6);
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                int iP7 = czo1.p(i | 1);
                prn1.b((e6d) obj6, (pt) obj5, this.b, (kly0) obj4, (qim0) obj3, (b0k) obj, iP7);
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                int iP8 = czo1.p(i | 1);
                sqe.b((x5k) obj6, this.b, (c380) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, iP8);
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = (qim0) obj3;
                int iP9 = czo1.p(i | 1);
                ozn1.d((vzq0) obj6, this.b, (yxa0) obj5, (Function0) obj4, qim0Var2, (b0k) obj, iP9);
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                int iP10 = czo1.p(i | 1);
                l4o1.c((bf00) null, (xfx) obj6, (p40) obj5, (iu30) obj4, this.b, (qim0) obj3, (b0k) obj, iP10);
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                int iP11 = czo1.p(i | 1);
                don1.b(this.b, (String) obj6, (nb50) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, iP11);
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                int iP12 = czo1.p(1);
                suo1.j((r370) obj6, this.b, this.c, (wgh1) obj5, (mev) obj4, (qim0) obj3, (b0k) obj, iP12);
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                int iP13 = czo1.p(i | 1);
                suo1.l((w370) obj6, this.b, (wgh1) obj5, (dh30) obj4, (qim0) obj3, (b0k) obj, iP13);
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                int iP14 = czo1.p(i | 1);
                ((aid0) obj6).a((i2c) obj5, this.b, (rk41) obj4, (Function0) obj3, (b0k) obj, iP14);
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                int iP15 = czo1.p(i | 1);
                y9j0.g((Header) obj6, (MessageTemplate) obj5, (qim0) obj4, this.b, (djc0) obj3, (b0k) obj, iP15);
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                int iP16 = czo1.p(i | 1);
                ryn1.a((op41) obj6, (xmu0) obj5, (Function0) obj4, this.b, (List) obj3, (b0k) obj, iP16);
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                int iP17 = czo1.p(i | 1);
                ((f311) obj6).a((i2c) obj5, this.b, (rk41) obj4, (Function0) obj3, (b0k) obj, iP17);
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                int iP18 = czo1.p(i | 1);
                ((ej31) obj6).a((i2c) obj5, this.b, (rk41) obj4, (Function0) obj3, (b0k) obj, iP18);
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                int iP19 = czo1.p(i | 1);
                c2p1.h(this.b, (xtb0) obj6, (btd) obj5, (wat) obj4, (iu30) obj3, (b0k) obj, iP19);
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                int iP20 = czo1.p(i | 1);
                ((lf6) obj6).a((i2c) obj5, this.b, (rk41) obj4, (Function0) obj3, (b0k) obj, iP20);
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                int iP21 = czo1.p(i | 1);
                ((lcf1) obj6).a((i2c) obj5, this.b, (rk41) obj4, (Function0) obj3, (b0k) obj, iP21);
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                int iP22 = czo1.p(i | 1);
                ((fyg1) obj6).a((i2c) obj5, this.b, (rk41) obj4, (Function0) obj3, (b0k) obj, iP22);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                int iP23 = czo1.p(i | 1);
                ((zyg1) obj6).a((i2c) obj5, this.b, (rk41) obj4, (Function0) obj3, (b0k) obj, iP23);
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                int iP24 = czo1.p(i | 1);
                ((lcf1) obj6).a((i2c) obj5, this.b, (rk41) obj4, (Function0) obj3, (b0k) obj, iP24);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                int iP25 = czo1.p(i | 1);
                z47.p((String) obj6, (String) obj5, (iu30) obj4, this.b, (qim0) obj3, (b0k) obj, iP25);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                wpb1.p((o4m1) obj6, (b2m1) obj5, (zxl1) obj4, (Function0) obj3, this.b, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lk0(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = i;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lk0(Object obj, Object obj2, int i, Object obj3, Object obj4, int i2, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = i;
        this.f = obj3;
        this.g = obj4;
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lk0(Object obj, Object obj2, Object obj3, int i, Object obj4, int i2, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = i;
        this.g = obj4;
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lk0(int i, Object obj, Object obj2, Object obj3, Object obj4, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.c = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk0(r370 r370Var, int i, int i2, wgh1 wgh1Var, mev mevVar, qim0 qim0Var, int i3) {
        super(2);
        this.a = (byte) 12;
        this.d = r370Var;
        this.b = i;
        this.c = i2;
        this.e = wgh1Var;
        this.f = mevVar;
        this.g = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk0(vzq0 vzq0Var, oj80 oj80Var, int i, int i2, Integer num, List list) {
        super(2);
        this.a = (byte) 0;
        this.d = vzq0Var;
        this.e = oj80Var;
        this.b = i;
        this.c = i2;
        this.f = num;
        this.g = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk0(o4m1 o4m1Var, b2m1 b2m1Var, zxl1 zxl1Var, Function0 function0, int i, int i2) {
        super(2);
        this.a = (byte) 26;
        this.d = o4m1Var;
        this.e = b2m1Var;
        this.f = zxl1Var;
        this.g = function0;
        this.b = i;
        this.c = i2;
    }
}
