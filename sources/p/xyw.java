package p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xyw implements View.OnFocusChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ xyw(Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        byte b = this.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                if (z) {
                    consumer.accept(bxw.a);
                }
                break;
            default:
                if (z) {
                    consumer.accept(g6s0.a);
                }
                break;
        }
    }
}
