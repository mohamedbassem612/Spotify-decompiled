package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hwx extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hwx(long j, qim0 qim0Var, long j2, int i, int i2) {
        super(2);
        this.b = j;
        this.c = qim0Var;
        this.d = j2;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                tto1.c(czo1.p(1), this.e, this.b, this.d, (b0k) obj, this.c);
                break;
            default:
                ((Number) obj2).intValue();
                i1p1.e(czo1.p(1), this.e, this.b, this.d, (b0k) obj, this.c);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hwx(qim0 qim0Var, long j, long j2, int i, int i2) {
        super(2);
        this.c = qim0Var;
        this.b = j;
        this.d = j2;
        this.e = i2;
    }
}
