package p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f65 {
    public final Context a;

    public f65(Context context) {
        this.a = context;
    }

    public final void a(String str) {
        try {
            this.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            throw new IllegalArgumentException(f4i1.f("Can't open ", str, "."), e);
        }
    }
}
