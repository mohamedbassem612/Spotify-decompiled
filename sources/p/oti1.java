package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class oti1 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pti1 b;

    public /* synthetic */ oti1(pti1 pti1Var, byte b) {
        this.a = b;
        this.b = pti1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pti1 pti1Var = this.b;
        switch (b) {
            case 0:
                pti1Var.d = true;
                pti1Var.f.invoke();
                return rih1Var;
            default:
                DrawScope drawScope = (DrawScope) obj;
                ej50 ej50Var = pti1Var.b;
                float f = pti1Var.k;
                float f2 = pti1Var.l;
                cab cabVarA1 = drawScope.a1();
                long jU = cabVarA1.u();
                cabVarA1.p().q();
                try {
                    ((dg8) cabVarA1.b).t(f, f2, 0L);
                    ej50Var.a(drawScope);
                    return rih1Var;
                } finally {
                    i3a.n(cabVarA1, jU);
                }
        }
    }
}
