package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mg6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rx7 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ xgm1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mg6(rx7 rx7Var, String str, boolean z, xgm1 xgm1Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = rx7Var;
        this.c = str;
        this.d = z;
        this.e = xgm1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                xgm1 xgm1Var = this.e;
                int iP = czo1.p(1);
                nho1.a(this.b, this.c, this.d, xgm1Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                xgm1 xgm1Var2 = this.e;
                int iP2 = czo1.p(1);
                nho1.a(this.b, this.c, this.d, xgm1Var2, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }
}
