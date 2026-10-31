package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gzq0 implements hzq0 {
    public final ArrayList a;

    public gzq0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean a(kf30 kf30Var) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (u890.j(((ezq0) ((dzq0) it.next())).f, kf30Var)) {
                return false;
            }
        }
        return true;
    }

    public final void b(kf30 kf30Var, ArrayList arrayList) {
        for (Object obj : this.a) {
            if (u890.j(((ezq0) ((dzq0) obj)).f, kf30Var)) {
                arrayList.add(obj);
            }
        }
    }

    public final List c(kf30 kf30Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (u890.j(((ezq0) ((dzq0) obj)).f, kf30Var)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Collection i(kf30 kf30Var, iu30 iu30Var) {
        return z561.k0(z561.T(new p1k(kf30Var, (byte) 1), new sgg1(zqb0.Z, new i46(this.a, (byte) 1))));
    }
}
