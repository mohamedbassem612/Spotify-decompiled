package p;

import android.util.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k29 {
    public final int a;
    public final h3d1 b;
    public final byte c;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public k29(int i, h3d1 h3d1Var, long j) {
        if (i == 0) {
            bhn0.i("Null configType");
            throw null;
        }
        this.a = i;
        this.b = h3d1Var;
        this.c = (int) j;
    }

    public static int a(int i) {
        if (i == 35) {
            return 2;
        }
        if (i == 256) {
            return 3;
        }
        if (i == 4101) {
            return 4;
        }
        return i == 32 ? 5 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008d  */
    public static k29 b(int i, int i2, Size size, p29 p29Var) {
        h3d1 h3d1Var;
        int iA = a(i2);
        int iA2 = d391.a(size);
        if (i != 1) {
            Size size2 = p29Var.a;
            if (iA2 <= size2.getHeight() * size2.getWidth()) {
                h3d1Var = h3d1.VGA;
            } else if (iA2 <= d391.a(p29Var.c)) {
                h3d1Var = h3d1.PREVIEW;
            } else if (iA2 <= d391.a(p29Var.e)) {
                h3d1Var = h3d1.RECORD;
            } else if (iA2 <= d391.a((Size) p29Var.f.get(Integer.valueOf(i2)))) {
                h3d1Var = h3d1.MAXIMUM;
            } else {
                Size size3 = (Size) p29Var.g.get(Integer.valueOf(i2));
                if (size3 != null) {
                    if (iA2 <= size3.getHeight() * size3.getWidth()) {
                        h3d1Var = h3d1.ULTRA_MAXIMUM;
                    } else {
                        h3d1Var = h3d1.NOT_SUPPORT;
                    }
                } else {
                    h3d1Var = h3d1.NOT_SUPPORT;
                }
            }
        } else if (iA2 <= d391.a((Size) p29Var.b.get(Integer.valueOf(i2)))) {
            h3d1Var = h3d1.s720p;
        } else if (iA2 <= d391.a((Size) p29Var.d.get(Integer.valueOf(i2)))) {
            h3d1Var = h3d1.s1440p;
        } else {
            h3d1Var = h3d1.NOT_SUPPORT;
        }
        return new k29(iA, h3d1Var, 0L);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k29)) {
            return false;
        }
        k29 k29Var = (k29) obj;
        return l1d.d(this.a, k29Var.a) && this.b.equals(k29Var.b) && ((long) this.c) == ((long) k29Var.c);
    }

    public final int hashCode() {
        int iC = (((l1d.C(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return ((int) (j ^ (j >>> 32))) ^ iC;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        int i = this.a;
        if (i == 1) {
            str = "PRIV";
        } else if (i == 2) {
            str = "YUV";
        } else if (i == 3) {
            str = "JPEG";
        } else if (i != 4) {
            str = i != 5 ? "null" : "RAW";
        } else {
            str = "JPEG_R";
        }
        sb.append(str);
        sb.append(", configSize=");
        sb.append(this.b);
        sb.append(", streamUseCase=");
        return pze0.h(this.c, "}", sb);
    }
}
