package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ba30 implements z930 {
    public final float[] a;
    public final float[] b;

    static {
        new hwb((byte) 11);
    }

    public ba30(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            hhg1.n("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // p.z930
    public final float a(float f) {
        return hwb.t(f, this.b, this.a);
    }

    @Override // p.z930
    public final float b(float f) {
        return hwb.t(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ba30)) {
            return false;
        }
        ba30 ba30Var = (ba30) obj;
        return Arrays.equals(this.a, ba30Var.a) && Arrays.equals(this.b, ba30Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return cy30.p("FontScaleConverter{fromSpValues=", Arrays.toString(this.a), ", toDpValues=", Arrays.toString(this.b), "}");
    }
}
