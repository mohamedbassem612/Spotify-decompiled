package p;

import android.app.ApplicationExitInfo;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ycc implements xm5 {
    public final Set a;

    public ycc(Set set) {
        this.a = set;
    }

    @Override // p.xm5
    public final void a(ApplicationExitInfo applicationExitInfo) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((xm5) it.next()).a(applicationExitInfo);
        }
    }
}
