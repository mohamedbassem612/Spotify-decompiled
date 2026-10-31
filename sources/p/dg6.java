package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dg6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ short c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dg6(byte b, int i, int i2, Object obj, Object obj2, qim0 qim0Var) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = qim0Var;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.e;
        rih1 rih1Var = rih1.a;
        short s = this.c;
        Object obj4 = this.f;
        Object obj5 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                fho1.h((yj41) obj3, (qim0) obj5, (j6m) obj4, (b0k) obj, czo1.p(s | 1), this.d);
                break;
            case 1:
                ((Number) obj2).intValue();
                oap1.a((String) obj3, (qim0) obj5, (al70) obj4, (b0k) obj, czo1.p(s | 1), this.d);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP = czo1.p(s | 1);
                byte b2 = this.d;
                Object obj6 = this.e;
                ebp1.b(obj6, (qyl) obj5, (j2i) obj4, (b0k) obj, iP, b2);
                break;
            case 3:
                ((Number) obj2).intValue();
                r4p1.c((n6r) obj3, (qim0) obj5, (String) obj4, (b0k) obj, czo1.p(s | 1), this.d);
                break;
            case 4:
                ((Number) obj2).intValue();
                wro1.p((c380) obj3, (qim0) obj5, (vu30) obj4, (b0k) obj, czo1.p(s | 1), this.d);
                break;
            case 5:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(s | 1);
                byte b3 = this.d;
                nln.d(iP2, b3, (String) obj3, (Function0) obj4, (b0k) obj, (qim0) obj5);
                break;
            case 6:
                ((Number) obj2).intValue();
                lro1.c((String) obj3, (qim0) obj5, (xu30) obj4, (b0k) obj, czo1.p(s | 1), this.d);
                break;
            case 7:
                ((Number) obj2).intValue();
                l061.b((zen0) obj3, (qim0) obj5, (j2i) obj4, (b0k) obj, czo1.p(s | 1), this.d);
                break;
            case 8:
                ((Number) obj2).intValue();
                ejo1.k((ufd) obj3, (String) obj4, (qim0) obj5, (b0k) obj, czo1.p(s | 1), this.d);
                break;
            case 9:
                ((Number) obj2).intValue();
                i0p1.l((Function0) obj3, (qim0) obj5, (vu30) obj4, (b0k) obj, czo1.p(s | 1), this.d);
                break;
            default:
                ((Number) obj2).intValue();
                b2p1.t((qij1) obj3, (qim0) obj5, (vu30) obj4, (b0k) obj, czo1.p(s | 1), this.d);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dg6(Object obj, Object obj2, Object obj3, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.b = obj2;
        this.f = obj3;
        this.c = i;
        this.d = i2;
    }
}
