package p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ori0 {
    public final lzn0 a;
    public final asi0 b;

    public ori0(lzn0 lzn0Var, asi0 asi0Var) {
        this.a = lzn0Var;
        this.b = asi0Var;
    }

    public final boolean a(String str) {
        if (!this.b.a.a()) {
            return false;
        }
        String string = new Uri.Builder().encodedPath("spotify:internal:membership-upsell-sheet").appendQueryParameter("showUri", str).build().toString();
        if (string == null) {
            eg.m("uri was not set!");
            return false;
        }
        this.a.f(new dwn0(string, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
        return true;
    }
}
