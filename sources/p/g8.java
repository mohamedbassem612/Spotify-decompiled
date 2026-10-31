package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g8 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g8(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                gto1.a((c380) obj4, (n041) obj3, b0kVar, czo1.p(b2 | 1));
                break;
            case 1:
                wu.c((ev) obj4, (qim0) obj3, b0kVar, czo1.p(1), b2);
                break;
            case 2:
                m0p1.f((c90) obj4, (qim0) obj3, b0kVar, czo1.p(1), b2);
                break;
            case 3:
                qp0.a((kp0) obj4, (qim0) obj3, b0kVar, czo1.p(1), b2);
                break;
            case 4:
                oap1.b((xxh) obj4, (qim0) obj3, b0kVar, czo1.p(1), b2);
                break;
            case 5:
                hqq0.g((p1v) obj4, (qim0) obj3, b0kVar, czo1.p(1), b2);
                break;
            case 6:
                qsw.b((u601) obj4, (j2i) obj3, b0kVar, czo1.p(b2 | 1));
                break;
            case 7:
                cuo1.l((jj10) obj4, (String) obj3, b0kVar, czo1.p(b2 | 1));
                break;
            case 8:
                cuo1.y((jj10) obj4, (qim0) obj3, b0kVar, czo1.p(1), b2);
                break;
            case 9:
                mgo1.a((xzz0) obj4, (qim0) obj3, b0kVar, czo1.p(1), b2);
                break;
            case 10:
                ((ouz) obj4).g((qt90) obj3, b0kVar, czo1.p(b2 | 1));
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                hqq0.q((ix90) obj4, (iu30) obj3, b0kVar, czo1.p(b2 | 1));
                break;
            case grn1.d /* 12 */:
                who1.l((qim0) obj4, (cr31) obj3, b0kVar, czo1.p(1), b2);
                break;
            case 13:
                pxd0.n((vnr0) obj4, (iu30) obj3, b0kVar, czo1.p(b2 | 1));
                break;
            case 14:
                b3o1.f((lee1) obj4, (vu30) obj3, b0kVar, czo1.p(b2 | 1));
                break;
            case 15:
                zho1.q((z6d1) obj4, (qim0) obj3, b0kVar, czo1.p(1), b2);
                break;
            case 16:
                u4p1.E((dw71) obj4, (ew71) obj3, b0kVar, czo1.p(1), b2);
                break;
            case 17:
                c680.q((qim0) obj4, (vzq0) obj3, b0kVar, czo1.p(1), b2);
                break;
            case 18:
                crm0.m((qim0) obj4, (hw61) obj3, b0kVar, czo1.p(1), b2);
                break;
            case 19:
                u1p1.c((txd1) obj4, (qim0) obj3, b0kVar, czo1.p(1), b2);
                break;
            default:
                mp10.i(czo1.p(b2 | 1), (String) obj4, (Function0) obj3, b0kVar);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g8(Object obj, Object obj2, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i2;
    }
}
