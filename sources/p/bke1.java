package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bke1 {
    public final Function0 a;
    public final long b;

    public bke1(Function0 function0) {
        long jU = sgc1.u(0.5f, 2.0f);
        this.a = function0;
        this.b = jU;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bke1)) {
            return false;
        }
        bke1 bke1Var = (bke1) obj;
        return u890.j(this.a, bke1Var.a) && Float.compare(45.0f, 45.0f) == 0 && Float.compare(0.4f, 0.4f) == 0 && Float.compare(125.0f, 125.0f) == 0 && ofg1.a(this.b, bke1Var.b);
    }

    public final int hashCode() {
        int iF = x0d.f(x0d.f(x0d.f(this.a.hashCode() * 31, 31, 45.0f), 31, 0.4f), 31, 125.0f);
        int i = ofg1.c;
        return Long.hashCode(this.b) + iF;
    }
}
