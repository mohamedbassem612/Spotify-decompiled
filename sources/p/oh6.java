package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oh6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i2c b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oh6(i2c i2cVar, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.b = i2cVar;
        this.c = z;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        boolean z = this.c;
        i2c i2cVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                who1.a(i2cVar, z, b0kVar, czo1.p(i | 1));
                break;
            default:
                who1.a(i2cVar, z, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
