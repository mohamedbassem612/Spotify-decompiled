package p;

import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i1r0 {
    public final lzn0 a;

    public i1r0(lzn0 lzn0Var) {
        this.a = lzn0Var;
    }

    public final void a(String str) {
        this.a.f(new p1f0(new Uri.Builder().encodedPath("spotify:audiobook:consumptioncap").appendQueryParameter("bookUri", str).build().toString()).h());
    }
}
