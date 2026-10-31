package p;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class n7v {
    public static final lw4 a;

    static {
        lw4 lw4VarL = fdg1.l();
        lw4VarL.g(1);
        a = lw4VarL;
        fdg1.l().g(1);
    }

    public static void a(DrawScope drawScope, float f, long j, float f2, long j2, float f3) {
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        fid fidVarP = drawScope.a1().p();
        lw4 lw4Var = a;
        lw4Var.c(j2);
        lw4Var.f(f3);
        lw4Var.a.setMaskFilter(new BlurMaskFilter(f2, blur));
        fidVarP.o(f, j, lw4Var);
    }
}
