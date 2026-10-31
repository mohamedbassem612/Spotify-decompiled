package p;

import android.net.Uri;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g90(fv2 fv2Var, xu30 xu30Var, int i) {
        super(2);
        this.a = (byte) 8;
        this.d = fv2Var;
        this.b = xu30Var;
        this.c = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                m0p1.c((a90) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                rf0.a((lf0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                    return rih1Var;
                }
                jkr0 jkr0Var = (jkr0) obj4;
                int iN = (int) u2o1.n(jkr0Var);
                int i2 = iN + 1;
                float fT = 0.0f;
                if (i == iN) {
                    fT = dm5.T(1.0f, 0.0f, u2o1.n(jkr0Var) % 1.0f);
                } else if (i == i2) {
                    fT = dm5.T(0.0f, 1.0f, u2o1.n(jkr0Var) % 1.0f);
                }
                qim0 qim0VarA = h2c.a.a(d9y0.k(nim0.a, fT), een.Y);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                qim0 qim0VarY = uyn1.y(qim0VarA, 4.0f, 4.0f);
                long j = cbx.a(x340Var2).a.c;
                cua cuaVar = cbx.b(x340Var2).f;
                qim0 qim0VarF = dug.f(qim0VarY, j, er31.b(4.0f));
                lj0 lj0Var = (lj0) obj3;
                gfh0 gfh0VarC = t1c.c(een.d, false);
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
                nko1.H(gfh0VarC, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                if ((lj0Var instanceof jj0) || (lj0Var instanceof kj0)) {
                    x340Var2.r(true);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 3:
                ((Number) obj2).intValue();
                j2p1.c((zq0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                h5p1.h((wc1) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                n9p1.d((tu1) obj4, (bx1) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                v9p1.e((String) obj4, (qng) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                ((ly1) obj4).e((iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                e9k.a((fv2) obj4, (xu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                s110.a((Uri) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                crm0.b((ot3) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                fho1.b((zyq0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                ((hw2) obj4).h((el6) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                zm6.b((um6) obj4, (Integer) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                zm6.e((wm6) obj4, (Integer) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                nko1.a((cp6) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 16:
                ((zu30) obj4).J((zis0) obj, (obx0) obj3, Integer.valueOf(i), (tqw) obj2);
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                ((fp7) obj4).i((String) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                apo.b((eob) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                x760.j((swb) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                ((vxc) obj4).e((yxc) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 21:
                ((k8e) ((an) obj4).g).a.onNext(new t7e(i, (kfe) obj, (rh90) obj3, ((Boolean) obj2).booleanValue()));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ((yhf) obj4).c((goe) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj2).intValue();
                yto1.i((tkf) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                ((smf) obj4).c((goe) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj2).intValue();
                fyo1.a((vzq0) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                x2p1.a((fyg) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                x2p1.c((iyg) obj4, (iu30) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                c4p1.l((sxq0) obj4, (String) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                k5p1.b((o8d1) obj4, (Function0) obj3, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g90(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g90(wc1 wc1Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 4;
        this.d = wc1Var;
        this.b = iu30Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g90(Object obj, int i, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.c = i;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g90(o8d1 o8d1Var, Function0 function0, int i) {
        super(2);
        this.a = (byte) 29;
        this.d = o8d1Var;
        this.b = function0;
        this.c = i;
    }
}
