package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gr6 {
    public final Context a;
    public final a1r0 b;
    public final lzn0 c;
    public final Activity d;

    public gr6(Context context, a1r0 a1r0Var, lzn0 lzn0Var, Activity activity) {
        this.a = context;
        this.b = a1r0Var;
        this.c = lzn0Var;
        this.d = activity;
    }

    public final void a(String str, List list) {
        Bundle bundle = new Bundle();
        bundle.putString("TITLE", str == null ? this.a.getString(2131952458) : str);
        bundle.putStringArrayList("ARTIST_URI_LIST", new ArrayList<>(list));
        Activity activity = this.d;
        lzn0 lzn0Var = this.c;
        if (lzn0Var.j(activity)) {
            lzn0Var.i(new dwn0("spotify:internal:artist-list", "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), bundle);
        } else {
            a1r0.j(this.b, "spotify:internal:artist-list", (String) null, bundle, false, 10);
        }
    }
}
