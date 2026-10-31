package p;

import android.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x9c extends jmr0 {
    public final /* synthetic */ byte f;
    public final Object g;

    public /* synthetic */ x9c(Object obj, byte b) {
        this.f = b;
        this.g = obj;
    }

    public final long i() {
        switch (this.f) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return 9205357640488583168L;
            default:
                oq70 oq70Var = (oq70) this.g;
                int width = oq70Var.getWidth();
                float f = width > 0 ? width : Float.NaN;
                int height = oq70Var.getHeight();
                return (((long) Float.floatToRawIntBits(height > 0 ? height : Float.NaN)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
        }
    }

    public final void j(DrawScope drawScope) {
        byte b = this.f;
        Object obj = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                DrawScope.S0(drawScope, (n6a1) obj, 0L, 0L, 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 126);
                return;
            default:
                oq70 oq70Var = (oq70) obj;
                int width = oq70Var.getWidth();
                float fIntBitsToFloat = width > 0 ? Float.intBitsToFloat((int) (drawScope.j() >> 32)) / width : 1.0f;
                int height = oq70Var.getHeight();
                float fIntBitsToFloat2 = height > 0 ? Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)) / height : 1.0f;
                cab cabVarA1 = drawScope.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    ((dg8) cabVarA1.b).t(fIntBitsToFloat, fIntBitsToFloat2, 0L);
                    u84 u84VarP = drawScope.a1().p();
                    Canvas canvas = v84.a;
                    oq70Var.c(u84VarP.a);
                    return;
                } finally {
                    i3a.n(cabVarA1, jU);
                }
        }
    }
}
