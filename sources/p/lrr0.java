package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lrr0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qrr0 a;

    public lrr0(qrr0 qrr0Var) {
        this.a = qrr0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        qrr0 qrr0Var = this.a;
        String strEncode = Uri.encode(qrr0Var.c.a);
        String str = nik1.Q3 + "?session=" + strEncode;
        qrr0Var.a.a(str, qrr0Var.d.a(str), (Bundle) null);
        return rih1.a;
    }
}
