package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xtb extends hab0 implements iu30 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ zd60 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtb(Function0 function0, long j, zd60 zd60Var, boolean z, float f, float f2, long j2, long j3) {
        super(1);
        this.a = function0;
        this.b = j;
        this.c = zd60Var;
        this.d = z;
        this.e = f;
        this.f = f2;
        this.g = j2;
        this.h = j3;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        float fFloatValue = ((Number) this.a.invoke()).floatValue();
        DrawScope.b0(drawScope, z4p1.A(fFloatValue, this.b, this.c.a), 0.0f, 0L, 0.0f, (DrawStyle) null, 126);
        if (this.d) {
            float f = this.e;
            float fE = l1d.e(this.f, f, fFloatValue, f);
            if (fE > 0.0f) {
                DrawScope.b0(drawScope, z4p1.A(fFloatValue, this.g, this.h), hrt.f(drawScope, 2.0f) - (fE / 2.0f), 0L, 0.0f, new phc1(fE, 0.0f, 0, 0, (uw4) null, 30), 108);
            }
        }
        return rih1.a;
    }
}
