package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xul1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xul1(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                yul1 yul1Var = (yul1) obj2;
                return d3p1.H(yul1Var.e(), yul1Var.getData(), obj);
            default:
                DrawScope drawScope = (DrawScope) obj;
                be50 be50Var = (be50) obj2;
                u8s0 u8s0Var = be50Var.l;
                if (be50Var.n && be50Var.A && u8s0Var != null) {
                    cab cabVarA1 = drawScope.a1();
                    long jU = cabVarA1.u();
                    cabVarA1.p().q();
                    try {
                        cabVarA1.v().i(u8s0Var, 1);
                        be50Var.d(drawScope);
                    } finally {
                        i3a.n(cabVarA1, jU);
                    }
                } else {
                    be50Var.d(drawScope);
                }
                return rih1.a;
        }
    }
}
