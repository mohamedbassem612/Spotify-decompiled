package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cre extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cre(byte b, float f, Object obj, boolean z) {
        super(1);
        this.a = b;
        this.b = z;
        this.c = f;
        this.d = obj;
    }

    public final Object invoke(Object obj) {
        boolean z;
        byte b = this.a;
        Object obj2 = this.d;
        float f = this.c;
        boolean z2 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                drr0 drr0Var = (drr0) obj2;
                float fS = drr0Var.s() + ((Number) obj).floatValue();
                if (z2) {
                    if (fS <= f) {
                    }
                    drr0Var.t(f);
                    return rih1.a;
                }
                float f2 = -f;
                if (fS < f2) {
                    fS = f2;
                }
                f = fS;
                drr0Var.t(f);
                return rih1.a;
            default:
                float fFloatValue = ((Number) obj).floatValue();
                if (z2) {
                    z = false;
                } else {
                    float fFloatValue2 = ((Number) yoi1.u(Float.valueOf(fFloatValue), foo1.a)).floatValue();
                    if (fFloatValue2 != f) {
                        ((iu30) obj2).invoke(Float.valueOf(fFloatValue2));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
