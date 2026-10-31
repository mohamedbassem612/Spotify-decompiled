package p;

import android.graphics.RenderEffect;
import android.graphics.Shader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dpe0 extends hab0 implements iu30 {
    public final /* synthetic */ tob1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpe0(tob1 tob1Var) {
        super(1);
        this.a = tob1Var;
    }

    public final Object invoke(Object obj) {
        kd31 kd31Var = (kd31) obj;
        float fFloatValue = ((Number) this.a.getValue()).floatValue();
        if (fFloatValue < 1.0f) {
            fFloatValue = 1.0f;
        }
        kd31Var.k(new n05(RenderEffect.createBlurEffect(fFloatValue, fFloatValue, Shader.TileMode.CLAMP)));
        return rih1.a;
    }
}
