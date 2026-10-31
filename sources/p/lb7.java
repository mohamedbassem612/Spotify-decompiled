package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lb7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ drr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lb7(drr0 drr0Var, byte b) {
        super(2);
        this.a = b;
        this.b = drr0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        drr0 drr0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                float fFloatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                drr0Var.t(fFloatValue);
                break;
            case 1:
                float fFloatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                drr0Var.t(fFloatValue2);
                break;
            case 2:
                float fFloatValue3 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                drr0Var.t(fFloatValue3);
                break;
            default:
                float fFloatValue4 = ((Number) obj2).floatValue();
                ((hav0) obj).a();
                drr0Var.t(drr0Var.s() + fFloatValue4);
                break;
        }
        return rih1Var;
    }
}
