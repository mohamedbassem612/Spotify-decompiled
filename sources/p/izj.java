package p;

import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class izj implements q2i1 {
    public final List a;

    public izj(List list) {
        this.a = list;
    }

    @Override // p.q2i1
    public final boolean a(Uri uri) {
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((q2i1) it.next()).a(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // p.q2i1
    public final boolean c(Uri uri) {
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((q2i1) it.next()).c(uri)) {
                return true;
            }
        }
        return false;
    }
}
