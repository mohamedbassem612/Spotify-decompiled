package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oqb0 implements hzq0 {
    public final o860 a;
    public final qoe0 b;

    public oqb0(uw0 uw0Var) {
        this.a = new o860(uw0Var, w1x0.Z0, new bd80(null));
        this.b = new qoe0((voe0) uw0Var.d, new ConcurrentHashMap(3, 1.0f, 2), new ryq((byte) 6), (byte) 0);
    }

    public final boolean a(kf30 kf30Var) {
        return false;
    }

    public final void b(kf30 kf30Var, ArrayList arrayList) {
        arrayList.add(d(kf30Var));
    }

    public final List c(kf30 kf30Var) {
        return k4p1.x(d(kf30Var));
    }

    public final nqb0 d(kf30 kf30Var) {
        Object objInvoke = this.b.invoke(new roe0(kf30Var, new na(this, new wb11(kf30Var), (byte) 29)));
        if (objInvoke != null) {
            return (nqb0) objInvoke;
        }
        qoe0.a(3);
        throw null;
    }

    public final Collection i(kf30 kf30Var, iu30 iu30Var) {
        z6x z6xVar = (List) d(kf30Var).Y.invoke();
        if (z6xVar == null) {
            z6xVar = z6x.a;
        }
        return (Collection) z6xVar;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((ajm0) ((uw0) this.a.b).X);
    }
}
