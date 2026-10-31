package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zdx extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdx(int i, boolean z, int i2) {
        super(2);
        this.a = (byte) 4;
        this.c = i;
        this.b = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.b;
        int i = this.c;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                aex.a(z, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                vrq0.b(z, b0kVar, czo1.p(i | 1));
                break;
            case 2:
                epo1.r(z, b0kVar, czo1.p(i | 1));
                break;
            case 3:
                wpo1.g(i, czo1.p(1), b0kVar, z);
                break;
            default:
                rc2.k(i, czo1.p(1), b0kVar, z);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zdx(byte b, int i, boolean z) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdx(boolean z, int i, int i2) {
        super(2);
        this.a = (byte) 3;
        this.b = z;
        this.c = i;
    }
}
