package p;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dms0 {
    public final Activity a;

    public Intent a() {
        Intent intent = (Intent) ila0.s(this.a.getIntent(), "intent", Intent.class);
        if (intent != null) {
            return intent;
        }
        eg.m("Source Intent was missing");
        return null;
    }
}
