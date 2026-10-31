package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hv11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ hv11(Object obj, long j, int i, int i2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                byte b2 = this.d;
                u4p1.m((c380) obj3, this.c, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                byte b3 = this.d;
                u4p1.m((c380) obj3, this.c, (b0k) obj, iP2, b3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                byte b4 = this.d;
                j1e1.f((qim0) obj3, this.c, (b0k) obj, iP3, b4);
                break;
        }
        return rih1Var;
    }
}
