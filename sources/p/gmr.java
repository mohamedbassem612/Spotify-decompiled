package p;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gmr implements gw70, bxg {
    public final Context a;
    public final rf01 b;

    public gmr(Context context, rf01 rf01Var) {
        this.a = context;
        this.b = rf01Var;
    }

    @Override // p.gw70
    public final void a(Uri uri) {
        g(uri);
    }

    @Override // p.gw70
    public final ixg b(Uri uri) {
        return h(uri);
    }

    @Override // p.gw70
    public final ixg c(c3i1 c3i1Var) {
        return h(c3i1Var);
    }

    @Override // p.gw70
    public final void d(ImageView imageView) {
        r2p1.k(imageView);
    }

    public final rf01 e() {
        return this.b;
    }

    @Override // p.gw70
    public final ixg f(String str) {
        return h(str);
    }

    public final ixg h(Object obj) {
        vy70 vy70Var = new vy70(this.a);
        vy70Var.c = obj;
        return new ixg(this.b, vy70Var, null);
    }
}
