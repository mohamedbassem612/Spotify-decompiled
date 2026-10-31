package p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class p59 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o59 b;

    public /* synthetic */ p59(o59 o59Var, byte b) {
        this.a = b;
        this.b = o59Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        kr60 kr60Var = this.b;
        switch (b) {
            case 0:
                Consumer consumer = (Consumer) ((s59) kr60Var.b).b;
                if (consumer != null) {
                    consumer.accept(p49.a);
                }
                break;
            default:
                Consumer consumer2 = (Consumer) ((s59) kr60Var.b).b;
                if (consumer2 != null) {
                    consumer2.accept(b59.a);
                }
                break;
        }
    }
}
