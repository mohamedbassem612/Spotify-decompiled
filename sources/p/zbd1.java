package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public class zbd1 {
    public static final zbd1[] i = {new zbd1(false, 3, 5, 8, 8, 1, 3, 5), new zbd1(false, 5, 7, 10, 10, 1, 5, 7), new zbd1(true, 5, 7, 16, 6, 1, 5, 7), new zbd1(false, 8, 10, 12, 12, 1, 8, 10), new zbd1(true, 10, 11, 14, 6, 2, 10, 11), new zbd1(false, 12, 12, 14, 14, 1, 12, 12), new zbd1(true, 16, 14, 24, 10, 1, 16, 14), new zbd1(false, 18, 14, 16, 16, 1, 18, 14), new zbd1(false, 22, 18, 18, 18, 1, 22, 18), new zbd1(true, 22, 18, 16, 10, 2, 22, 18), new zbd1(false, 30, 20, 20, 20, 1, 30, 20), new zbd1(true, 32, 24, 16, 14, 2, 32, 24), new zbd1(false, 36, 24, 22, 22, 1, 36, 24), new zbd1(false, 44, 28, 24, 24, 1, 44, 28), new zbd1(true, 49, 28, 22, 14, 2, 49, 28), new zbd1(false, 62, 36, 14, 14, 4, 62, 36), new zbd1(false, 86, 42, 16, 16, 4, 86, 42), new zbd1(false, 114, 48, 18, 18, 4, 114, 48), new zbd1(false, 144, 56, 20, 20, 4, 144, 56), new zbd1(false, 174, 68, 22, 22, 4, 174, 68), new zbd1(false, 204, 84, 24, 24, 4, 102, 42), new zbd1(false, 280, 112, 14, 14, 16, 140, 56), new zbd1(false, 368, 144, 16, 16, 16, 92, 36), new zbd1(false, 456, 192, 18, 18, 16, 114, 48), new zbd1(false, 576, 224, 20, 20, 16, 144, 56), new zbd1(false, 696, 272, 22, 22, 16, 174, 68), new zbd1(false, 816, 336, 24, 24, 16, 136, 56), new zbd1(false, 1050, 408, 18, 18, 36, 175, 68), new zbd1(false, 1304, 496, 20, 20, 36, 163, 62), new zzq(false, 1558, 620, 22, 22, 36, -1, 62)};
    public final boolean a;
    public final short b;
    public final short c;
    public final byte d;
    public final byte e;
    public final byte f;
    public final int g;
    public final byte h;

    /* JADX WARN: Multi-variable type inference failed */
    public zbd1(boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = z;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }

    public static zbd1 e(int i2, acd1 acd1Var) {
        for (int i3 = 0; i3 < 30; i3++) {
            zbd1 zbd1Var = i[i3];
            if (!(acd1Var == acd1.b && zbd1Var.a) && ((acd1Var != acd1.c || zbd1Var.a) && i2 <= zbd1Var.b)) {
                return zbd1Var;
            }
        }
        hhg1.n("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i2)));
        return null;
    }

    public int a(int i2) {
        return this.g;
    }

    public final int b() {
        byte b = this.f;
        int i2 = 1;
        if (b != 1) {
            i2 = 2;
            if (b != 2 && b != 4) {
                if (b == 16) {
                    return 4;
                }
                if (b == 36) {
                    return 6;
                }
                eg.m("Cannot handle this number of data regions");
                return 0;
            }
        }
        return i2;
    }

    public int c() {
        return this.b / this.g;
    }

    public final int d() {
        byte b = this.f;
        if (b == 1 || b == 2) {
            return 1;
        }
        if (b == 4) {
            return 2;
        }
        if (b == 16) {
            return 4;
        }
        if (b == 36) {
            return 6;
        }
        eg.m("Cannot handle this number of data regions");
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        byte b = this.d;
        sb.append((int) b);
        sb.append('x');
        byte b2 = this.e;
        sb.append((int) b2);
        sb.append(", symbol size ");
        sb.append((b() * b) + (b() << 1));
        sb.append('x');
        sb.append((d() * b2) + (d() << 1));
        sb.append(", symbol data size ");
        sb.append(b() * b);
        sb.append('x');
        sb.append(d() * b2);
        sb.append(", codewords ");
        sb.append((int) this.b);
        sb.append('+');
        sb.append((int) this.c);
        return sb.toString();
    }
}
