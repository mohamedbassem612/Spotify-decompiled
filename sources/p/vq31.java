package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vq31 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    static {
        ila0.g(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public vq31(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
    }

    public final float a() {
        return this.d - this.b;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vq31)) {
            return false;
        }
        vq31 vq31Var = (vq31) obj;
        return Float.compare(this.a, vq31Var.a) == 0 && Float.compare(this.b, vq31Var.b) == 0 && Float.compare(this.c, vq31Var.c) == 0 && Float.compare(this.d, vq31Var.d) == 0 && iko1.s(this.e, vq31Var.e) && iko1.s(this.f, vq31Var.f) && iko1.s(this.g, vq31Var.g) && iko1.s(this.h, vq31Var.h);
    }

    public final int hashCode() {
        return iko1.u(this.h) + ((iko1.u(this.g) + ((iko1.u(this.f) + ((iko1.u(this.e) + x0d.f(x0d.f(x0d.f(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String strZ = yah0.z(this.a);
        String strZ2 = yah0.z(this.b);
        String strZ3 = yah0.z(this.c);
        String strZ4 = yah0.z(this.d);
        StringBuilder sb = new StringBuilder();
        sb.append(strZ);
        sb.append(", ");
        sb.append(strZ2);
        sb.append(", ");
        sb.append(strZ3);
        String strN = l1d.n(", ", strZ4, sb);
        long j = this.e;
        long j2 = this.f;
        boolean zS = iko1.s(j, j2);
        long j3 = this.g;
        long j4 = this.h;
        if (zS && iko1.s(j2, j3) && iko1.s(j3, j4)) {
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
                return cy30.p("RoundRect(rect=", strN, ", radius=", yah0.z(Float.intBitsToFloat(i)), ")");
            }
            return l1d.n(yah0.z(Float.intBitsToFloat(i2)), ")", gvg.n("RoundRect(rect=", strN, ", x=", yah0.z(Float.intBitsToFloat(i)), ", y="));
        }
        String strZ5 = iko1.z(j);
        String strZ6 = iko1.z(j2);
        String strZ7 = iko1.z(j3);
        String strZ8 = iko1.z(j4);
        StringBuilder sbN = gvg.n("RoundRect(rect=", strN, ", topLeft=", strZ5, ", topRight=");
        bb00.j(sbN, strZ6, ", bottomRight=", strZ7, ", bottomLeft=");
        return l1d.n(strZ8, ")", sbN);
    }
}
