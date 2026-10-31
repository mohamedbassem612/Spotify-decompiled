package p;

import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d7x0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e7x0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d7x0(e7x0 e7x0Var, byte b) {
        super(0);
        this.a = b;
        this.b = e7x0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        e7x0 e7x0Var = this.b;
        switch (b) {
            case 0:
                return new m5k(new z511[]{((sdx0) e7x0Var.e.getValue()).e});
            default:
                return hap1.w((FrameLayout) e7x0Var.i.b);
        }
    }
}
