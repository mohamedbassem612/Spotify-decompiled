package p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s96 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    public /* synthetic */ s96(ven0 ven0Var, byte b) {
        this.a = b;
        this.b = ven0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ((Function0) ven0Var.getValue()).invoke();
                break;
            default:
                ((Consumer) ven0Var.getValue()).accept(m9u.a);
                break;
        }
    }
}
