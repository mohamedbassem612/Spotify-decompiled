package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a4i1 {
    public final Context a;
    public final lzn0 b;
    public final t44 c;

    public a4i1(Context context, lzn0 lzn0Var, t44 t44Var) {
        this.a = context;
        this.b = lzn0Var;
        this.c = t44Var;
    }

    public final void a(boolean z) {
        if (this.c.a()) {
            this.b.h("spotify:internal:ai-usage-limits");
        } else {
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(z ? "https://support.spotify.com/article/prompted-playlists/" : "https://support.spotify.com/article/ai-usage-limits/")).addFlags(268435456));
        }
    }
}
