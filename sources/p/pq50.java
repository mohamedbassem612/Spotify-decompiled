package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pq50 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xtb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pq50(xtb0 xtb0Var, byte b) {
        super(1);
        this.a = b;
        this.b = xtb0Var;
    }

    public final Object invoke(Object obj) {
        DrawScope drawScope;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xtb0 xtb0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                lsl lslVar = (lsl) obj;
                lslVar.s1();
                float fX0 = lslVar.X0(12.0f);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (lslVar.j() >> 32)) / 2.0f;
                if (fX0 > fIntBitsToFloat) {
                    fX0 = fIntBitsToFloat;
                }
                boolean z = lslVar.getLayoutDirection() == flb0.a;
                boolean zC = z ? xtb0Var.c() : xtb0Var.d();
                boolean zD = z ? xtb0Var.d() : xtb0Var.c();
                if (zC) {
                    DrawScope.S0(lslVar, v9c.h(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(u7h.b)}), 0.0f, fX0, 8), 0L, (((long) Float.floatToRawIntBits(fX0)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() & 4294967295L)))) & 4294967295L), 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 58);
                }
                if (zD) {
                    DrawScope.S0(lslVar, v9c.h(p7h.M(new u7h[]{new u7h(u7h.b), new u7h(u7h.j)}), Float.intBitsToFloat((int) (lslVar.j() >> 32)) - fX0, Float.intBitsToFloat((int) (lslVar.j() >> 32)), 8), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar.j() >> 32)) - fX0)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 60);
                }
                break;
            case 1:
                lsl lslVar2 = (lsl) obj;
                lslVar2.s1();
                float fX1 = lslVar2.X0(24.0f);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (lslVar2.j() >> 32)) / 2.0f;
                if (fX1 > fIntBitsToFloat2) {
                    fX1 = fIntBitsToFloat2;
                }
                if (xtb0Var.c()) {
                    DrawScope.S0(lslVar2, v9c.h(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(u7h.b)}), 0.0f, fX1, 8), 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar2.j() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fX1)) << 32), 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 58);
                }
                if (xtb0Var.d()) {
                    DrawScope.S0(lslVar2, v9c.h(p7h.M(new u7h[]{new u7h(u7h.b), new u7h(u7h.j)}), Float.intBitsToFloat((int) (lslVar2.j() >> 32)) - fX1, Float.intBitsToFloat((int) (lslVar2.j() >> 32)), 8), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar2.j() >> 32)) - fX1)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 60);
                }
                break;
            case 2:
                DrawScope drawScope2 = (lsl) obj;
                drawScope2.s1();
                float fX2 = drawScope2.X0(10.0f);
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (drawScope2.j() >> 32)) / 2.0f;
                if (fX2 > fIntBitsToFloat3) {
                    fX2 = fIntBitsToFloat3;
                }
                if (xtb0Var.c()) {
                    drawScope = drawScope2;
                    DrawScope.S0(drawScope, v9c.h(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(u7h.b)}), 0.0f, fX2, 8), 0L, (((long) Float.floatToRawIntBits(fX2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope2.j() & 4294967295L)))) & 4294967295L), 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 58);
                } else {
                    drawScope = drawScope2;
                }
                if (xtb0Var.d()) {
                    DrawScope.S0(drawScope, v9c.h(p7h.M(new u7h[]{new u7h(u7h.b), new u7h(u7h.j)}), Float.intBitsToFloat((int) (drawScope.j() >> 32)) - fX2, Float.intBitsToFloat((int) (drawScope.j() >> 32)), 8), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.j() >> 32)) - fX2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 60);
                }
                break;
            default:
                lsl lslVar3 = (lsl) obj;
                lslVar3.s1();
                float fX3 = lslVar3.X0(24.0f);
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (lslVar3.j() >> 32)) / 2.0f;
                if (fX3 > fIntBitsToFloat4) {
                    fX3 = fIntBitsToFloat4;
                }
                if (xtb0Var.c()) {
                    DrawScope.S0(lslVar3, v9c.h(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(u7h.b)}), 0.0f, fX3, 8), 0L, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar3.j() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fX3)) << 32), 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 58);
                }
                if (xtb0Var.d()) {
                    DrawScope.S0(lslVar3, v9c.h(p7h.M(new u7h[]{new u7h(u7h.b), new u7h(u7h.j)}), Float.intBitsToFloat((int) (lslVar3.j() >> 32)) - fX3, Float.intBitsToFloat((int) (lslVar3.j() >> 32)), 8), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lslVar3.j() >> 32)) - fX3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 6, 60);
                }
                break;
        }
        return rih1Var;
    }
}
