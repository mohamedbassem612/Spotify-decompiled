package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x3d implements z3d {
    public final Function0 a;
    public final iu30 b;
    public final vu30 c;

    public x3d(Function0 function0, iu30 iu30Var, vu30 vu30Var) {
        this.a = function0;
        this.b = iu30Var;
        this.c = vu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3d)) {
            return false;
        }
        x3d x3dVar = (x3d) obj;
        return this.a.equals(x3dVar.a) && this.b.equals(x3dVar.b) && this.c.equals(x3dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ktd.g(this.b, this.a.hashCode() * 31, 31);
    }
}
