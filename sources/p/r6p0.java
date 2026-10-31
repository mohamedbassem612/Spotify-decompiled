package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r6p0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s6p0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r6p0(s6p0 s6p0Var, byte b) {
        super(0);
        this.a = b;
        this.b = s6p0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        s6p0 s6p0Var = this.b;
        switch (b) {
            case 0:
                return s6p0Var.b.k() instanceof d6w0 ? (View) s6p0Var.d.getValue() : s6p0Var.a;
            default:
                return new View(s6p0Var.c);
        }
    }
}
