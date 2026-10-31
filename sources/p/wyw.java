package p;

import android.view.KeyEvent;
import android.widget.TextView;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wyw implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ wyw(Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                if (i != 5) {
                    return false;
                }
                consumer.accept(cxw.a);
                return true;
            default:
                if (i != 5) {
                    return false;
                }
                consumer.accept(h6s0.a);
                return true;
        }
    }
}
