package p;

import android.graphics.RenderEffect;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pkb extends vc21 {
    public final float b;
    public final float c;
    public final int d;

    public pkb(int i, float f, float f2) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    @Override // p.vc21
    public final RenderEffect b() {
        return mb4.g(this.d, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkb)) {
            return false;
        }
        pkb pkbVar = (pkb) obj;
        return this.b == pkbVar.b && this.c == pkbVar.c && this.d == pkbVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + x0d.f(Float.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return l1d.n(lap1.r(this.d), ")", gvg.m("BlurEffect(renderEffect=null, radiusX=", this.b, ", radiusY=", this.c, ", edgeTreatment="));
    }
}
