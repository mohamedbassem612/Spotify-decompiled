package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ri60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri60(int i, Integer num, vl80 vl80Var, zl80 zl80Var) {
        super(2);
        this.a = (byte) 7;
        this.d = i;
        this.b = num;
        this.e = vl80Var;
        this.c = zl80Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        long j;
        hux huxVar;
        byte b = this.a;
        int i = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.e;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                ((bm00) obj5).c((xh60) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                ((bm00) obj5).f((zh60) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                xto1.j((cw60) obj5, (String) obj4, (String) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                suo1.i((t370) obj5, this.d, (wgh1) obj4, (qim0) obj3, (b0k) obj, iP);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                suo1.m((x370) obj5, this.d, (wgh1) obj4, (qim0) obj3, (b0k) obj, iP2);
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                i1p1.h((yr70) obj5, (Function0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                oh80.b((lh80) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 7:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                String strO0 = cwl1.o0(x340Var2, i);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var2).j;
                Integer num = (Integer) obj5;
                u7h u7hVar = num != null ? new u7h(z4p1.e(num.intValue())) : null;
                if (u7hVar == null) {
                    x340Var2.i0(341095889);
                    j = cbx.a(x340Var2).b.a;
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(341094246);
                    x340Var2.r(false);
                    j = u7hVar.a;
                }
                uwo1.e(strO0, (qim0) null, lee1Var, j, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1714);
                cvx cvxVar = cbx.b(x340Var2).b;
                nim0 nim0Var = nim0.a;
                op71.g(x340Var2, u291.h(nim0Var, 12.0f));
                vl80 vl80Var = (vl80) obj4;
                zl80 zl80Var = (zl80) obj3;
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
                nko1.H(jw31VarA, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                Uri uri = Uri.parse(vl80Var.c);
                zov0 zov0Var = cbx.b(x340Var2).g;
                as80 as80Var = mif1.P0;
                qim0 qim0VarI = zr7.i(nim0Var, new gn50(zl80Var, (byte) 27));
                int iOrdinal = zl80Var.ordinal();
                if (iOrdinal == 0) {
                    huxVar = ltx.c;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    huxVar = nkx.c;
                }
                eso1.e(uri, isl.a, qim0VarI, new p3v(32.0f), (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, new nux(huxVar, huxVar), false, false, x340Var2, 1073741872, 0, 3504);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                op71.g(x340Var2, u291.v(nim0Var, 8.0f));
                b9p1.f(vl80Var, x340Var2, 0);
                x340Var2.r(true);
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                s9p1.n((wo80) obj5, (res) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                bin.d((c380) obj5, (sip) obj4, (qim0) obj3, true, 4000L, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ((da90) obj5).e((rk41) obj4, (d990) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                ((da90) obj5).f((rk41) obj4, (f990) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                qxd0.a((pu8) obj5, (kly0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                crm0.k((eyz0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                hqq0.c((y5a0) obj5, (String) obj4, (gx90) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                d9y0.c((p0a0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                ((y5a0) obj5).h((x5a0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                sgc1.p((no90) obj5, (iu30) obj3, (Function0) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                fj30.o((q041) obj5, (n041) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                xfo1.f((o860) obj5, (tv80) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                yoo1.i((bwd1) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                upo1.i((cp0) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                oto1.c(obj5, (o0i) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                cbc0.a((mr20) obj5, obj4, (uh0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                ((et90) obj5).e((bfc0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                yto1.h((p8i0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                dgd0.g((vfd0) obj5, (iu30) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                j1p1.k((zzg) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                m1p1.m((zkd0) obj5, this.d, (Function0) obj4, (qim0) obj3, (b0k) obj, iP3);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                o1p1.o((xld0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri60(byte b, int i, Object obj, Object obj2, iu30 iu30Var) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = iu30Var;
        this.e = obj2;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri60(byte b, int i, int i2, Object obj, Object obj2, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.b = obj;
        this.d = i;
        this.e = obj2;
        this.c = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ri60(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = obj3;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri60(bm00 bm00Var, xh60 xh60Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = bm00Var;
        this.e = xh60Var;
        this.c = iu30Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri60(bm00 bm00Var, zh60 zh60Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 1;
        this.b = bm00Var;
        this.e = zh60Var;
        this.c = iu30Var;
        this.d = i;
    }
}
