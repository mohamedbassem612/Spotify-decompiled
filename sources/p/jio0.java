package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jio0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hio0 b;
    public final /* synthetic */ hcs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jio0(hio0 hio0Var, hcs hcsVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = hio0Var;
        this.c = hcsVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hcs hcsVar = this.c;
        hio0 hio0Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                oho1.n(hio0Var, hcsVar, b0kVar, czo1.p(1));
                break;
            default:
                oho1.n(hio0Var, hcsVar, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
