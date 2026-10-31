package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xh70 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uw0 b;

    public /* synthetic */ xh70(uw0 uw0Var, byte b) {
        this.a = b;
        this.b = uw0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        uw0 uw0Var = this.b;
        switch (b) {
            case 0:
                ((Function0) uw0Var.N0).invoke();
                break;
            default:
                ((Function0) uw0Var.O0).invoke();
                break;
        }
    }
}
