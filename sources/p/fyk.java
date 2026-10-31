package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fyk implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yyk a;

    public fyk(yyk yykVar) {
        this.a = yykVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        String str;
        String str2;
        if (((kvk) obj).a) {
            str = nik1.o6.a;
            str2 = "?config=BLUEJAY_CONFIRMED_NOTIFICATIONS";
        } else {
            str = nik1.o6.a;
            str2 = "?config=BLUEJAY_REQUEST_NOTIFICATIONS";
        }
        String strE = f4i1.e(str, str2);
        yyk yykVar = this.a;
        Object objY = fn31.Y(yykVar.e, new zti(yykVar, strE, (lnm) null, (byte) 19), onmVar);
        return objY == d9n.a ? objY : rih1.a;
    }
}
