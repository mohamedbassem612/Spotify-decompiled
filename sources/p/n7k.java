package p;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n7k implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ x5j1 a;
    public final /* synthetic */ lzn0 b;

    public n7k(x5j1 x5j1Var, lzn0 lzn0Var) {
        this.a = x5j1Var;
        this.b = lzn0Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0051  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        tv80 tv80Var;
        lzn0 lzn0Var;
        d7k d7kVar = (d7k) obj;
        String str = d7kVar.a;
        Uri uri = Uri.parse(str);
        String scheme = uri.getScheme();
        String lowerCase = scheme != null ? scheme.toLowerCase(Locale.ROOT) : null;
        if (u890.j(lowerCase, "http") || u890.j(lowerCase, "https")) {
            Set set = s4b1.f;
            if (uic.u(str)) {
                tv80Var = d7kVar.b;
                lzn0Var = this.b;
                if (tv80Var != null) {
                    lzn0Var.a(d7kVar.a, tv80Var, (Bundle) null);
                } else {
                    lzn0Var.h(str);
                }
            } else {
                try {
                    ((dg30) this.a.b).startActivity(new Intent("android.intent.action.VIEW", uri));
                } catch (ActivityNotFoundException e) {
                    Logger.e(e, "Couldn't open external URL %s", new Object[]{str});
                }
            }
        } else {
            tv80Var = d7kVar.b;
            lzn0Var = this.b;
            if (tv80Var != null) {
                lzn0Var.a(d7kVar.a, tv80Var, (Bundle) null);
            } else {
                lzn0Var.h(str);
            }
        }
        return rih1.a;
    }
}
