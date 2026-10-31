package p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r59 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s59 b;

    public /* synthetic */ r59(s59 s59Var, byte b) {
        this.a = b;
        this.b = s59Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        s59 s59Var = this.b;
        switch (b) {
            case 0:
                Consumer consumer = (Consumer) s59Var.b;
                if (consumer != null) {
                    consumer.accept(n49.a);
                }
                break;
            default:
                Consumer consumer2 = (Consumer) s59Var.b;
                if (consumer2 != null) {
                    consumer2.accept(o49.a);
                }
                break;
        }
    }
}
