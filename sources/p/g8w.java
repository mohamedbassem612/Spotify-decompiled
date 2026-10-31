package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g8w implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ i8w a;

    public g8w(i8w i8wVar) {
        this.a = i8wVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        e8w e8wVar = (e8w) obj;
        zeu zeuVar = this.a.a;
        String str = e8wVar.c;
        int i = e8wVar.d;
        tv80 tv80Var = e8wVar.e;
        swa0 swa0Var = (swa0) zeuVar.c;
        Parcelable.Creator creator = twa0.CREATOR;
        rzn1.t();
        swa0Var.d = twa0.N0;
        Bundle bundle = new Bundle();
        bundle.putInt("entry-point-pages-count", i + 1);
        ((lzn0) zeuVar.a).a(str, tv80Var, bundle);
        return rih1.a;
    }
}
