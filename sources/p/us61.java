package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.a;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class us61 implements f4h1 {
    public final MobiusLoop.Controller a;
    public final bfz b;
    public final idd1 c = new idd1(new ts61(this));

    public us61(MobiusLoop.Controller controller, bfz bfzVar) {
        this.a = controller;
        this.b = bfzVar;
    }

    public final Object getView() {
        return (View) this.c.getValue();
    }

    public final Bundle serialize() {
        Parcelable parcelableX0;
        Bundle bundle = new Bundle();
        a layoutManager = ((u800) ((cr6) this.b.b).b).a().getLayoutManager();
        if (layoutManager != null && (parcelableX0 = layoutManager.x0()) != null) {
            bundle.putParcelable("SettingsPageViewBinderImpl.savedState", parcelableX0);
        }
        return bundle;
    }

    public final void start() {
        bfz bfzVar = this.b;
        MobiusLoop.Controller controller = this.a;
        controller.c(bfzVar);
        controller.start();
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.a;
        controller.stop();
        controller.disconnect();
    }
}
