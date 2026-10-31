package p;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m1b0 implements f4h1 {
    public final /* synthetic */ byte a;
    public final ViewGroup b;
    public final Object c;

    public /* synthetic */ m1b0(ViewGroup viewGroup, Object obj, byte b) {
        this.a = b;
        this.b = viewGroup;
        this.c = obj;
    }

    public final Object getView() {
        byte b = this.a;
        ConstraintLayout constraintLayout = this.b;
        switch (b) {
            case 0:
                return constraintLayout;
            default:
                return (LinearLayout) constraintLayout;
        }
    }

    public final void start() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((w9h) obj).start();
                break;
            default:
                ((yuf0) obj).a();
                break;
        }
    }

    public final void stop() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((w9h) obj).stop();
                break;
            default:
                ((yuf0) obj).b();
                break;
        }
    }
}
