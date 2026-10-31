package p;

import android.widget.FrameLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j951 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ esw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j951(esw eswVar, byte b) {
        super(0);
        this.a = b;
        this.b = eswVar;
    }

    public final Object invoke() {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        esw eswVar = this.b;
        switch (b) {
            case 0:
                return q1o1.u((l9e0) eswVar.J.get(), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
            default:
                return q1o1.u((z331) eswVar.E.get(), u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 4);
        }
    }
}
