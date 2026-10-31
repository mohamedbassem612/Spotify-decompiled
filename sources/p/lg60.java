package p;

import android.content.Context;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import j$.time.LocalDate;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lg60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg60(String str, lb50 lb50Var, int i) {
        super(2);
        this.a = (byte) 20;
        this.c = str;
        this.d = lb50Var;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                fqo1.i((mg60) obj4, (ltm1) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                ((bm00) obj4).d((qim0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                d0p1.f((q8d1) obj4, (Function0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                tw70.a((dq70) obj4, i, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                l2p1.c((r8d1) obj4, (Function0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 5:
                ((h8x0) ((g980) obj4).W0).J((zis0) obj, (obx0) obj3, Integer.valueOf(i), (tqw) obj2);
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                w5p1.e((mb80) obj4, (iu30) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 7:
                ((h8x0) ((g980) obj4).W0).J((zis0) obj, (obx0) obj3, Integer.valueOf(i), (tqw) obj2);
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                ((ouz) obj4).b((qim0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                rqt0.i((hux) obj4, (Function0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                sgc1.g((iba0) obj4, (String) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                fj30.p((c380) obj4, (n041) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 12:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    hdn0 hdn0Var = (hdn0) obj3;
                    int i2 = 0;
                    for (Object obj5 : ((yjd1) obj4).c) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            p7h.T();
                            throw null;
                        }
                        ued1 ued1Var = (ued1) obj5;
                        boolean z = i == i2;
                        boolean zI = x340Var2.i(hdn0Var) | x340Var2.e(i2);
                        Object objT = x340Var2.T();
                        if (zI || objT == fkj0.X) {
                            objT = new ojk(i2, hdn0Var, (byte) 1);
                            x340Var2.s0(objT);
                        }
                        m5n1.c(z, (Function0) objT, apo.r(10501928, new gs90(ued1Var, (byte) 25), x340Var2), (qim0) null, (vu30) null, (idn0) null, (max) null, (vu30) null, (hw61) null, (ga80) null, 0, x340Var2, 384, 0, 2040);
                        i2 = i3;
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                ((cob0) obj4).e(i, obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                qgc0.a((ygc0) obj4, (p3v) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                qgc0.b((ygc0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                myo1.g((h32) obj4, (iu30) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                u0p1.c((LocalDate) obj4, (qim0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                s1p1.e((gmd0) obj4, (vu30) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                d3p1.b((lb50) obj4, (qim0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                d3p1.e((String) obj4, (lb50) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                d3p1.p((wx60) obj4, (lb50) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                l3p1.h((Context) obj4, (Function0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                p6p1.m((vzq0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                s9p1.v((y7e1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                ((y1f0) obj4).f((c380) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                ((y1f0) obj4).g((String) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                ((a2f0) obj4).f((c380) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                ((a2f0) obj4).g((String) obj3, (b0k) obj, czo1.p(1 | i));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                brl.c(czo1.p(1 | i), (b0k) obj, (qim0) obj4, (tob1) obj3);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lg60(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lg60(Object obj, int i, Object obj2, int i2, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg60(ygc0 ygc0Var, p3v p3vVar, int i) {
        super(2);
        this.a = (byte) 14;
        this.c = ygc0Var;
        this.d = p3vVar;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg60(q8d1 q8d1Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 2;
        this.c = q8d1Var;
        this.d = function0;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg60(r8d1 r8d1Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 4;
        this.c = r8d1Var;
        this.d = function0;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg60(yjd1 yjd1Var, int i, hdn0 hdn0Var) {
        super(2);
        this.a = (byte) 12;
        this.c = yjd1Var;
        this.b = i;
        this.d = hdn0Var;
    }
}
