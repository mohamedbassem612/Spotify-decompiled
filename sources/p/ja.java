package p;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ja implements h0h1 {
    public final /* synthetic */ jit a;

    public ja(jit jitVar) {
        this.a = jitVar;
    }

    public final Collection d() {
        return this.a.y1().t0().d();
    }

    public final g6b0 e() {
        return kht.e(this.a);
    }

    public final List getParameters() {
        List list = this.a.Q0;
        if (list != null) {
            return list;
        }
        u890.C("typeConstructorParameters");
        throw null;
    }

    public final jfg s() {
        return this.a;
    }

    public final boolean t() {
        return true;
    }

    public final String toString() {
        return "[typealias " + this.a.getName().b() + ']';
    }
}
