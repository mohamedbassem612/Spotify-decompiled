package p;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.a;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p5z implements f4h1 {
    public final MobiusLoop.Controller a;
    public final qn b;

    public p5z(MobiusLoop.Controller controller, qn qnVar) {
        this.a = controller;
        this.b = qnVar;
    }

    public final Object getView() {
        return this.b.getView();
    }

    public final Bundle serialize() {
        Parcelable parcelableX0;
        Bundle bundle = new Bundle();
        a layoutManager = ((u800) ((r5z) this.b.b).b).a().getLayoutManager();
        if (layoutManager != null && (parcelableX0 = layoutManager.x0()) != null) {
            bundle.putParcelable("EpisodeLimitsPageViewBinderImpl.savedState", parcelableX0);
        }
        return bundle;
    }

    public final void start() {
        qn qnVar = this.b;
        MobiusLoop.Controller controller = this.a;
        controller.c(qnVar);
        controller.start();
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.a;
        controller.stop();
        controller.disconnect();
    }
}
