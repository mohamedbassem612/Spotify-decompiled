package p;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ayf implements q2i1, ihr0 {
    public final /* synthetic */ izj a;
    public final /* synthetic */ sjq0 b;

    public ayf(izj izjVar, sjq0 sjq0Var) {
        this.b = sjq0Var;
        this.a = izjVar;
    }

    public final boolean a(Uri uri) {
        return this.a.a(uri);
    }

    public final boolean b(ehr0 ehr0Var) {
        Object next;
        if (!(ehr0Var instanceof xh0)) {
            return false;
        }
        xh0 xh0Var = (xh0) ehr0Var;
        if (!(xh0Var instanceof wh0)) {
            return false;
        }
        Iterator it = ((LinkedHashSet) this.b.c).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Boolean) ((f1r0) next).a.invoke(((wh0) xh0Var).a)).booleanValue());
        f1r0 f1r0Var = (f1r0) next;
        if (f1r0Var == null) {
            return false;
        }
        f1r0Var.b.invoke(((wh0) xh0Var).a);
        return true;
    }

    public final boolean c(Uri uri) {
        return this.a.c(uri);
    }
}
