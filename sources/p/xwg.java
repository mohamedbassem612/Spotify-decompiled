package p;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xwg {
    public final WeakReference a;
    public final String b;

    public xwg(View view, String str) {
        this.a = new WeakReference(view);
        this.b = str;
    }

    public final View a() {
        return (View) this.a.get();
    }
}
