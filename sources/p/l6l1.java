package p;

import com.google.protobuf.Any;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class l6l1 {
    public final gg11 a;
    public final idd1 b = new idd1(new bkk1(this, (byte) 8));

    public l6l1(gg11 gg11Var) {
        this.a = gg11Var;
    }

    public final ArrayList a(h290 h290Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = h290Var.iterator();
        while (it.hasNext()) {
            z0i z0iVarB = b((Any) it.next());
            if (z0iVarB != null) {
                arrayList.add(z0iVarB);
            }
        }
        return arrayList;
    }

    public final z0i b(Any any) {
        kly0 kly0Var = (kly0) this.a.get(any.p());
        j0i j0iVar = kly0Var != null ? (j0i) kly0Var.get() : null;
        if (j0iVar != null) {
            try {
                return j0iVar.a(any);
            } catch (Exception e) {
                Logger.l(e, gvg.h("Can't parse ", any.p(), " using ", rc11.a.b(j0iVar.getClass()).r()), new Object[0]);
            }
        }
        return null;
    }
}
