package p;

import android.graphics.Paint;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kv7 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kv7(float f, float f2, long j, byte b) {
        super(1);
        this.a = b;
        this.b = f;
        this.c = f2;
        this.d = j;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        float f = this.c;
        switch (b) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                float f2 = this.b;
                if (f2 > 0.0f) {
                    fid fidVarP = drawScope.a1().p();
                    lw4 lw4VarL = fdg1.l();
                    Paint paint = lw4VarL.a;
                    paint.setAntiAlias(true);
                    paint.setColor(z4p1.G(u7h.j));
                    paint.setShadowLayer(drawScope.X0(f), 0.0f, 0.0f, z4p1.G(u7h.b(this.d, f2, 0.0f, 0.0f, 0.0f, 14)));
                    fidVarP.o(hrt.f(drawScope, 2.0f), drawScope.g1(), lw4VarL);
                }
                return rih1.a;
            default:
                long jY = mue1.y(this.b, f, ((Number) obj).floatValue());
                long jT = z4p1.t(this.d, jY);
                float fT = mue1.T(jY);
                float fT2 = mue1.T(jT);
                return Float.valueOf((Math.max(fT, fT2) + 0.05f) / (Math.min(fT, fT2) + 0.05f));
        }
    }
}
