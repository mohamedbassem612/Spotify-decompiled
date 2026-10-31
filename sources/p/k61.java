package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k61 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ byte c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ k61(byte b, int i, int i2, Object obj, boolean z) {
        super(2);
        this.a = b;
        this.e = obj;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.d;
        byte b3 = this.c;
        boolean z = this.b;
        Object obj3 = this.e;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                e4p1.a((iec) obj3, z, b0kVar, czo1.p(b3 | 1), b2);
                break;
            default:
                o6p1.c(czo1.p(b3 | 1), b2, b0kVar, (qim0) obj3, z);
                break;
        }
        return rih1Var;
    }
}
