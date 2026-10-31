package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ku6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pu6 b;
    public final /* synthetic */ i8h1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku6(pu6 pu6Var, i8h1 i8h1Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = pu6Var;
        this.c = i8h1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        i8h1 i8h1Var = this.c;
        pu6 pu6Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                smo1.c(pu6Var, i8h1Var, b0kVar, czo1.p(9));
                break;
            default:
                smo1.c(pu6Var, i8h1Var, b0kVar, czo1.p(9));
                break;
        }
        return rih1Var;
    }
}
