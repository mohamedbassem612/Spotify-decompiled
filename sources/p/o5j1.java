package p;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o5j1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ es41 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5j1(float f, es41 es41Var) {
        super(1);
        this.b = f;
        this.c = es41Var;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope;
        int i;
        byte b = this.a;
        es41 es41Var = this.c;
        float f = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                DrawScope drawScope2 = (lsl) obj;
                drawScope2.s1();
                float fO = yoi1.o(es41Var.a.s() / f, 0.0f, 1.0f);
                if (fO > 0.0f) {
                    long j = u7h.b;
                    mic0 mic0VarS = v9c.s(p7h.M(new u7h[]{new u7h(u7h.b(j, 1.0f - fO, 0.0f, 0.0f, 0.0f, 14)), new u7h(j)}), 0.0f, f, 8);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    long jB = Size.b(drawScope2.j(), 1, 0.0f, f);
                    drawScope = drawScope2;
                    i = 8;
                    DrawScope.S0(drawScope, mic0VarS, jFloatToRawIntBits, jB, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 56);
                } else {
                    drawScope = drawScope2;
                    i = 8;
                }
                float fO2 = yoi1.o((es41Var.f.s() - es41Var.a.s()) / f, 0.0f, 1.0f);
                if (fO2 > 0.0f) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) - f;
                    long j2 = u7h.b;
                    DrawScope.S0(drawScope, v9c.s(p7h.M(new u7h[]{new u7h(j2), new u7h(u7h.b(j2, 1.0f - fO2, 0.0f, 0.0f, 0.0f, 14))}), fIntBitsToFloat, Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)), i), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), Size.b(drawScope.j(), 1, 0.0f, f), 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 56);
                }
                return rih1.a;
            default:
                eqc eqcVar = (eqc) obj;
                return eqcVar.b(new o5j1(es41Var, eqcVar.h() * f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5j1(es41 es41Var, float f) {
        super(1);
        this.c = es41Var;
        this.b = f;
    }
}
