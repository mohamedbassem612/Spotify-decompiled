package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qx1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qx1(int i, String str, Function0 function0, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 11;
        this.f = str;
        this.e = function0;
        this.b = qim0Var;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.c;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                v9p1.c((Function0) obj5, (qim0) obj3, (hux) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 1:
                ((Number) obj2).intValue();
                vi6.b((yj41) obj5, (qim0) obj3, (j6m) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 2:
                ((Number) obj2).intValue();
                mp10.b((otn0) obj5, (qim0) obj3, (bv30) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 3:
                ((Number) obj2).intValue();
                j2h1.b((gt40) obj5, (ql3) obj3, (j2i) obj4, (b0k) obj, i | 1, this.d);
                break;
            case 4:
                ((Number) obj2).intValue();
                ujo1.a((qim0) obj3, (es41) obj5, (j2i) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 5:
                ((Number) obj2).intValue();
                c4p1.d((String) obj5, (qim0) obj3, (ksl) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 6:
                ((Number) obj2).intValue();
                h7w.e((pqk) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 7:
                ((Number) obj2).intValue();
                ((aor) obj5).f((g3l) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 8:
                ((Number) obj2).intValue();
                suo1.g((qim0) obj3, (String) obj5, (j2i) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 9:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.d;
                suo1.h(iP, b2, (String) obj5, (String) obj4, (b0k) obj, (qim0) obj3);
                break;
            case 10:
                ((Number) obj2).intValue();
                kln1.c((p60) obj4, (qim0) obj3, (Function0) obj5, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                byte b3 = this.d;
                lrn1.h(iP2, b3, (String) obj4, (Function0) obj5, (b0k) obj, (qim0) obj3);
                break;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                qim0 qim0Var = (qim0) obj3;
                int iP3 = czo1.p(this.d | 1);
                int i2 = this.c;
                s3o1.g((hux) obj4, i2, (gbx) obj5, qim0Var, (b0k) obj, iP3);
                break;
            case 13:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                byte b4 = this.d;
                xto1.g(iP4, b4, (b0k) obj, (hcx) obj4, (c380) obj5, (qim0) obj3);
                break;
            case 14:
                ((Number) obj2).intValue();
                boo1.l((z9i0) obj5, (qim0) obj3, (qim0) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 15:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                byte b5 = this.d;
                ((b6n0) obj5).e(iP5, b5, (String) obj4, (b0k) obj, (qim0) obj3);
                break;
            case 16:
                ((Number) obj2).intValue();
                ((otn0) obj5).b((lee1) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 17:
                ((Number) obj2).intValue();
                int iP6 = czo1.p(1);
                byte b6 = this.d;
                int i3 = this.c;
                sjo0.c((jtl1) obj4, b6, i3, (qim0) obj3, (Function0) obj5, (b0k) obj, iP6);
                break;
            case 18:
                ((Number) obj2).intValue();
                tro1.c((qim0) obj3, (qim0) obj5, (j2i) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 19:
                ((Number) obj2).intValue();
                wxo1.h((p7t0) obj5, (qim0) obj3, (iu30) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                fc11.e((String) obj3, (Function0) obj5, (hux) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 21:
                ((Number) obj2).intValue();
                i9p1.q((vu30) obj5, (vu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 22:
                ((Number) obj2).intValue();
                w9b1.a((bab1) obj5, (qim0) obj3, (j2i) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 23:
                ((Number) obj2).intValue();
                a8o.s((Function0) obj5, (qim0) obj3, (xu30) obj4, (b0k) obj, czo1.p(i | 1), this.d);
                break;
            case 24:
                ((Number) obj2).intValue();
                ((thd0) obj5).f(czo1.p(i | 1), this.d, (b0k) obj, (vu30) obj4, (qim0) obj3);
                break;
            default:
                ((Number) obj2).intValue();
                xzo1.h((String) obj5, (mmr0) obj4, (qim0) obj3, (b0k) obj, czo1.p(i | 1), this.d);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qx1(byte b, int i, int i2, Object obj, Object obj2, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = qim0Var;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qx1(Object obj, Object obj2, Object obj3, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.f = obj3;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qx1(String str, Function0 function0, hux huxVar, int i, int i2) {
        super(2);
        this.a = (byte) 20;
        this.b = str;
        this.e = function0;
        this.f = huxVar;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qx1(p60 p60Var, qim0 qim0Var, Function0 function0, int i, int i2) {
        super(2);
        this.a = (byte) 10;
        this.f = p60Var;
        this.b = qim0Var;
        this.e = function0;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qx1(hux huxVar, int i, gbx gbxVar, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 12;
        this.f = huxVar;
        this.c = i;
        this.e = gbxVar;
        this.b = qim0Var;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qx1(qim0 qim0Var, Object obj, j2i j2iVar, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = qim0Var;
        this.e = obj;
        this.f = j2iVar;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qx1(jtl1 jtl1Var, int i, int i2, qim0 qim0Var, Function0 function0, int i3) {
        super(2);
        this.a = (byte) 17;
        this.f = jtl1Var;
        this.d = i;
        this.c = i2;
        this.b = qim0Var;
        this.e = function0;
    }
}
