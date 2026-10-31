package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.widgets.npvwidget.WidgetUpdateCoordinator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class aeu0 {
    public static final void a(Context context) {
        Intent intent = new Intent(context, (Class<?>) WidgetUpdateCoordinator.class);
        intent.setAction("com.spotify.widgets.widgets.ACTION_UPDATE");
        context.sendBroadcast(intent);
    }

    public static a b(Context context) {
        fns fnsVar = igu.a;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        coroutinesSubtypeEffectHandlerBuilderI.a(rc11.a.b(wdu0.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new zdu0(context)));
        return new a(fnsVar, coroutinesSubtypeEffectHandlerBuilderI);
    }
}
