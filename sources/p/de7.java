package p;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class de7 implements f4h1 {
    public final he7 a;
    public final MobiusLoop.Controller b;

    public de7(he7 he7Var, MobiusLoop.Controller controller) {
        this.a = he7Var;
        this.b = controller;
    }

    public final Object getView() {
        return this.a.b;
    }

    public final Bundle serialize() {
        Bundle bundle = new Bundle();
        a layoutManager = ((RecyclerView) this.a.i).getLayoutManager();
        bundle.putParcelable("RECYCLER_VIEW_SAVED_STATE", layoutManager != null ? layoutManager.x0() : null);
        return bundle;
    }

    public final void start() {
        he7 he7Var = this.a;
        MobiusLoop.Controller controller = this.b;
        controller.c(he7Var);
        controller.start();
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.b;
        controller.stop();
        controller.disconnect();
    }
}
