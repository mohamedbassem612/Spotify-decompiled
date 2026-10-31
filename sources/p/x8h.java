package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x8h {
    public static final x8h h = new x8h(1, 2, 3, null, -1, -1);
    public static final x8h i = new x8h(1, 1, 2, null, -1, -1);
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        String str = zoi1.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
    }

    public x8h(int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = bArr;
        this.e = i5;
        this.f = i6;
    }

    public static String b(int i2) {
        if (i2 == -1) {
            return "Unset color range";
        }
        if (i2 != 1) {
            return i2 != 2 ? f4i1.c(i2, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    public static String c(int i2) {
        if (i2 == -1) {
            return "Unset color space";
        }
        if (i2 == 6) {
            return "BT2020";
        }
        if (i2 != 1) {
            return i2 != 2 ? f4i1.c(i2, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    public static int d(int i2) {
        if (i2 == 1) {
            return 8;
        }
        if (i2 == 2) {
            return 13;
        }
        if (i2 == 6) {
            return 16;
        }
        if (i2 != 7) {
            return i2 != 10 ? 1 : 4;
        }
        return 18;
    }

    public static String e(int i2) {
        if (i2 == -1) {
            return "Unset color transfer";
        }
        if (i2 == 10) {
            return "Gamma 2.2";
        }
        if (i2 == 1) {
            return "Linear";
        }
        if (i2 == 2) {
            return "sRGB";
        }
        if (i2 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i2 != 6) {
            return i2 != 7 ? f4i1.c(i2, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    public static boolean g(x8h x8hVar) {
        if (x8hVar == null) {
            return true;
        }
        int i2 = x8hVar.a;
        if (i2 != -1 && i2 != 1 && i2 != 2) {
            return false;
        }
        int i3 = x8hVar.b;
        if (i3 != -1 && i3 != 2) {
            return false;
        }
        int i4 = x8hVar.c;
        if ((i4 != -1 && i4 != 3) || x8hVar.d != null) {
            return false;
        }
        int i5 = x8hVar.f;
        if (i5 != -1 && i5 != 8) {
            return false;
        }
        int i6 = x8hVar.e;
        return i6 == -1 || i6 == 8;
    }

    public static boolean h(x8h x8hVar) {
        if (x8hVar == null) {
            return false;
        }
        int i2 = x8hVar.c;
        return i2 == 7 || i2 == 6;
    }

    public static int i(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int j(int i2) {
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 4) {
            return 10;
        }
        if (i2 == 13) {
            return 2;
        }
        if (i2 == 16) {
            return 6;
        }
        if (i2 != 18) {
            return (i2 == 6 || i2 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final w8h a() {
        w8h w8hVar = new w8h();
        w8hVar.a = this.a;
        w8hVar.b = this.b;
        w8hVar.c = this.c;
        w8hVar.e = this.d;
        w8hVar.d = this.e;
        w8hVar.f = this.f;
        return w8hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x8h.class == obj.getClass()) {
            x8h x8hVar = (x8h) obj;
            if (this.a == x8hVar.a && this.b == x8hVar.b && this.c == x8hVar.c && Arrays.equals(this.d, x8hVar.d) && this.e == x8hVar.e && this.f == x8hVar.f) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return (this.a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final int hashCode() {
        int i2 = this.g;
        if (i2 != 0) {
            return i2;
        }
        int iF = ((ktd.f((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31, this.d, 31) + this.e) * 31) + this.f;
        this.g = iF;
        return iF;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(c(this.a));
        sb.append(", ");
        sb.append(b(this.b));
        sb.append(", ");
        sb.append(e(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        String str2 = "NA";
        int i2 = this.e;
        if (i2 != -1) {
            str = i2 + "bit Luma";
        } else {
            str = "NA";
        }
        sb.append(str);
        sb.append(", ");
        int i3 = this.f;
        if (i3 != -1) {
            str2 = i3 + "bit Chroma";
        }
        return l1d.n(str2, ")", sb);
    }
}
