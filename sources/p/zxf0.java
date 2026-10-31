package p;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zxf0 implements bkl {
    public final /* synthetic */ Activity a;

    public zxf0(Activity activity) {
        this.a = activity;
    }

    public final void accept(Object obj) {
        this.a.startActivity((Intent) obj);
    }
}
