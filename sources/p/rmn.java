package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rmn extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jmr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rmn(jmr0 jmr0Var, byte b) {
        super(1);
        this.a = b;
        this.b = jmr0Var;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                DrawScope drawScope = (DrawScope) obj;
                jmr0.g(this.b, drawScope, drawScope.j(), 0.0f, (f2b) null, 6);
                return rih1.a;
            default:
                return ((eqc) obj).b(new fz40(this.b, fdg1.l(), (byte) 5));
        }
    }
}
