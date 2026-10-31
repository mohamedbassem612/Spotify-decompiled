package p;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c1i0 extends mh70 {
    public final WeakReference l;
    public final Handler m;
    public final Set n;

    public c1i0(d1i0 d1i0Var) {
        super((byte) 0);
        attachInterface(this, "androidx.media3.session.IMediaSessionService");
        this.l = new WeakReference(d1i0Var);
        this.m = new Handler(d1i0Var.getApplicationContext().getMainLooper());
        this.n = Collections.synchronizedSet(new HashSet());
    }

    public final void b1() {
        this.l.clear();
        this.m.removeCallbacksAndMessages(null);
        Set set = this.n;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            iqo1.r((eh70) it.next());
        }
        set.clear();
    }
}
