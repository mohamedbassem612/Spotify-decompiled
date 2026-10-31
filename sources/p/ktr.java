package p;

import android.content.Context;
import android.os.Handler;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ktr implements x4l {
    public final vku a = new vku();
    public final Handler b;
    public View c;

    public ktr(Context context) {
        this.b = new Handler(context.getApplicationContext().getMainLooper());
    }

    public final void a(View view) {
        this.c = view;
    }

    public final void b() {
    }
}
