package p;

import android.os.Bundle;
import androidx.recyclerview.widget.a;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class se7 implements f4h1 {
    public final mg7 a;
    public final MobiusLoop.Controller b;

    public se7(mg7 mg7Var, MobiusLoop.Controller controller) {
        this.a = mg7Var;
        this.b = controller;
    }

    public final Object getView() {
        return this.a.g;
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        a layoutManager = this.a.i.getLayoutManager();
        bundle.putParcelable("RECYCLER_VIEW_SAVED_STATE", layoutManager != null ? layoutManager.x0() : null);
        return bundle;
    }

    public final void start() {
        mg7 mg7Var = this.a;
        MobiusLoop.Controller controller = this.b;
        controller.c(mg7Var);
        controller.start();
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.b;
        controller.stop();
        controller.disconnect();
    }
}
