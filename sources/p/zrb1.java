package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zrb1 extends hab0 implements iu30 {
    public final /* synthetic */ o95 a;
    public final /* synthetic */ qoz0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zrb1(o95 o95Var, qoz0 qoz0Var, float f, float f2, float f3) {
        super(1);
        this.a = o95Var;
        this.b = qoz0Var;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    public final Object invoke(Object obj) {
        lsl lslVar = (lsl) obj;
        lslVar.s1();
        float fFloatValue = ((Number) this.a.e()).floatValue();
        if (fFloatValue > 0.0f) {
            DrawScope.o(lslVar, this.b, this.c, (((long) Float.floatToRawIntBits(this.e)) & 4294967295L) | (Float.floatToRawIntBits(this.d) << 32), fFloatValue, (phc1) null, 112);
        }
        return rih1.a;
    }
}
