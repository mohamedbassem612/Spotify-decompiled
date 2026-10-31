package p;

import android.graphics.PointF;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class beo {
    public final PointF a;
    public final PointF b;
    public final PointF c;
    public final PointF d;

    public beo(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        this.a = pointF;
        this.b = pointF2;
        this.c = pointF3;
        this.d = pointF4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof beo)) {
            return false;
        }
        beo beoVar = (beo) obj;
        return this.a.equals(beoVar.a) && u890.j(this.b, beoVar.b) && u890.j(this.c, beoVar.c) && this.d.equals(beoVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
