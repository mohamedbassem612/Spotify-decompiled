package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.widgets.npvwidget.WidgetUpdateCoordinator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y9p0 implements dwo {
    public final Context a;
    public final MobiusLoop.Controller b;

    public y9p0(q9m0 q9m0Var, Context context) {
        this.a = context;
        Intent intent = new Intent(context, (Class<?>) WidgetUpdateCoordinator.class);
        intent.setAction("com.spotify.widgets.widgets.ACTION_USER_LOGIN");
        context.sendBroadcast(intent);
        MobiusLoop.Controller controllerA = MobiusAndroid.a(gvg.d("Widget PlayerStateMonitor", Mobius.d(o9m0.a, aeu0.b(q9m0Var.a)).d(new p9m0(q9m0Var)).h(deu0.a(q9m0Var.b, q9m0Var.c))), new ydu0("", false, false, false, false, false, false, iko.b));
        this.b = controllerA;
        controllerA.c(hqd.d);
        controllerA.start();
    }

    @Override // p.dwo
    public final void shutdown() {
        this.b.stop();
        Context context = this.a;
        Intent intent = new Intent(context, (Class<?>) WidgetUpdateCoordinator.class);
        intent.setAction("com.spotify.widgets.widgets.ACTION_END_SESSION");
        context.sendBroadcast(intent);
    }
}
