package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class drf extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ drr0 b;
    public final /* synthetic */ drr0 c;
    public final /* synthetic */ drr0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ drf(drr0 drr0Var, drr0 drr0Var2, drr0 drr0Var3, byte b) {
        super(3);
        this.a = b;
        this.b = drr0Var;
        this.c = drr0Var2;
        this.d = drr0Var3;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        drr0 drr0Var = this.d;
        drr0 drr0Var2 = this.c;
        drr0 drr0Var3 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                float fFloatValue = ((Number) obj).floatValue();
                float fFloatValue2 = ((Number) obj2).floatValue();
                float fFloatValue3 = ((Number) obj3).floatValue();
                drr0Var3.t(fFloatValue);
                drr0Var2.t(fFloatValue2);
                drr0Var.t(fFloatValue3);
                break;
            default:
                float fFloatValue4 = ((Number) obj).floatValue();
                float fFloatValue5 = ((Number) obj2).floatValue();
                float fFloatValue6 = ((Number) obj3).floatValue();
                drr0Var3.t(fFloatValue4);
                drr0Var2.t(fFloatValue5);
                drr0Var.t(fFloatValue6);
                break;
        }
        return rih1Var;
    }
}
