package p;

import android.util.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class muq0 {
    public final Size a;
    public final String b;
    public final e9h c;
    public final long d;

    public muq0() {
        Size size = new Size(1080, 1920);
        e9h e9hVar = new e9h();
        ytw0 ytw0Var = jfv.b;
        long jU = jfv.u(fdg1.k0(5, ngv.e), ngv.c);
        this.a = size;
        this.b = "video/avc";
        this.c = e9hVar;
        this.d = jU;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muq0)) {
            return false;
        }
        muq0 muq0Var = (muq0) obj;
        return this.a.equals(muq0Var.a) && this.b.equals(muq0Var.b) && this.c.equals(muq0Var.c) && this.d == muq0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + kaa0.f(10, kaa0.f(30, kaa0.f(8000000, cy30.d((this.a.hashCode() + (Integer.hashCode(0) * 31)) * 31, 31, this.b), 31), 31), 31)) * 31);
    }
}
