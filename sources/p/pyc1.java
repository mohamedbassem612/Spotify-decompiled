package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pyc1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jq70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pyc1(jq70 jq70Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = jq70Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        jq70 jq70Var = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                kto1.p(jq70Var, nim0Var, b0kVar, czo1.p(1));
                break;
            default:
                kto1.p(jq70Var, nim0Var, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
