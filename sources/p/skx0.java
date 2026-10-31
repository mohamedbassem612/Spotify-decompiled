package p;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class skx0 {
    public final Context a;
    public final mr20 b;

    public skx0(Context context, q8n q8nVar) {
        this.a = context;
        this.b = Build.VERSION.SDK_INT >= 36 ? rqt0.u(h4p1.f(new qkx0(q8nVar, context, (lnm) null))) : h4p1.m(Boolean.FALSE);
    }
}
