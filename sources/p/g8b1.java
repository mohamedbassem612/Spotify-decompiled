package p;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g8b1 extends i8b1 {
    public final RuntimeShader P0;

    public g8b1(k8b1 k8b1Var) {
        super(k8b1Var);
        this.P0 = rqb.f();
    }

    @Override // p.i8b1
    public final void H1(kd31 kd31Var, float f, float f2) {
        this.P0.setFloatUniform("height", f2);
        this.P0.setFloatUniform("overscroll", f);
        kd31Var.k(new n05(RenderEffect.createRuntimeShaderEffect(this.P0, "content")));
    }
}
