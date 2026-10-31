package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x5 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y5 b;

    public /* synthetic */ x5(y5 y5Var, byte b) {
        this.a = b;
        this.b = y5Var;
    }

    public final Object invoke() {
        byte b = this.a;
        y5 y5Var = this.b;
        switch (b) {
            case 0:
                zpi0 zpi0VarR = y5Var.R();
                p5 p5Var = new p5(this, (byte) 1);
                wjz wjzVar = o1h1.a;
                if (bkz.e(y5Var)) {
                    return bkz.b(zjz.X, y5Var.toString());
                }
                h0h1 h0h1VarG = y5Var.g();
                if (h0h1VarG == null) {
                    o1h1.a(12);
                    throw null;
                }
                if (zpi0VarR == null) {
                    o1h1.a(13);
                    throw null;
                }
                List listD = o1h1.d(h0h1VarG.getParameters());
                e0h1.b.getClass();
                return y3o1.k0(e0h1.c, h0h1VarG, listD, false, zpi0VarR, p5Var);
            case 1:
                return new ph80(y5Var.R());
            default:
                return new rob0(y5Var);
        }
    }
}
