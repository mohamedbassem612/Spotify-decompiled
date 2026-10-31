package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class sc60 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sc60(Object obj, float f, float f2, float f3, float f4, float f5, byte b) {
        super(1);
        this.a = b;
        this.g = obj;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float f = this.d;
        float f2 = this.c;
        float f3 = this.b;
        Object obj2 = this.g;
        switch (b) {
            case 0:
                mic0 mic0Var = (mic0) obj2;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(this.e)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
                float f4 = this.f;
                DrawScope.c0((DrawScope) obj, mic0Var, jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), 0.0f, (DrawStyle) null, 112);
                break;
            case 1:
                DrawScope drawScope = (DrawScope) obj;
                yvg1 yvg1Var = (yvg1) obj2;
                if (yvg1Var != null) {
                    for (mmr0 mmr0Var : p7h.M(new mmr0[]{new mmr0((u8s0) yvg1Var.a, new u7h(iel1.a)), new mmr0((u8s0) yvg1Var.b, new u7h(iel1.b)), new mmr0((u8s0) yvg1Var.c, new u7h(iel1.c))})) {
                        iel1.e(drawScope, (u8s0) mmr0Var.a, ((u7h) mmr0Var.b).a, this.b, this.e, this.f, this.c, this.d);
                    }
                }
                iel1.d(drawScope, f3, f2, f);
                break;
            default:
                DrawScope drawScope2 = (DrawScope) obj;
                u8s0 u8s0Var = (u8s0) obj2;
                if (u8s0Var != null) {
                    iel1.e(drawScope2, u8s0Var, u7h.f, this.b, this.e, this.f, this.c, this.d);
                }
                iel1.d(drawScope2, f3, f2, f);
                break;
        }
        return rih1Var;
    }
}
