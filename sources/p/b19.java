package p;

import android.graphics.Matrix;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b19 implements rt70 {
    public final tod1 a;
    public final long b;
    public final int c;
    public final Matrix d;

    public b19(tod1 tod1Var, long j, int i, Matrix matrix) {
        if (tod1Var == null) {
            bhn0.i("Null tagBundle");
            throw null;
        }
        this.a = tod1Var;
        this.b = j;
        this.c = i;
        this.d = matrix;
    }

    @Override // p.rt70
    public final tod1 a() {
        return this.a;
    }

    @Override // p.rt70
    public final int b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b19)) {
            return false;
        }
        b19 b19Var = (b19) obj;
        return this.a.equals(b19Var.a) && this.b == b19Var.b && this.c == b19Var.c && this.d.equals(b19Var.d);
    }

    @Override // p.rt70
    public final long getTimestamp() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return this.d.hashCode() ^ ((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.a + ", timestamp=" + this.b + ", rotationDegrees=" + this.c + ", sensorToBufferTransformMatrix=" + this.d + "}";
    }
}
