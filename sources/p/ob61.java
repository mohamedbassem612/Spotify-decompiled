package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ob61 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ tw4 c;
    public final /* synthetic */ mic0 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float[] f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ob61(Object obj, float f, tw4 tw4Var, mic0 mic0Var, float f2, float[] fArr, byte b) {
        super(1);
        this.a = b;
        this.g = obj;
        this.b = f;
        this.c = tw4Var;
        this.d = mic0Var;
        this.e = f2;
        this.f = fArr;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        float[] fArr = this.f;
        float f = this.b;
        Object obj2 = this.g;
        switch (b) {
            case 0:
                DrawScope.j1((DrawScope) obj, this.c, this.d, 0.0f, new phc1(this.e, 0.0f, 0, 0, cgj1.t((((Number) ((o95) obj2).e()).floatValue() * f) - (f / 2.0f), fArr), 14), 52);
                break;
            default:
                DrawScope.j1((DrawScope) obj, this.c, this.d, 0.0f, new phc1(this.e, 0.0f, 0, 0, cgj1.t((((Number) ((ez71) obj2).T0.e()).floatValue() * f) - (f / 2.0f), fArr), 14), 52);
                break;
        }
        return rih1Var;
    }
}
