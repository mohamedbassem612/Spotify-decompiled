package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bwg1 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(gtf1 gtf1Var, ftf1 ftf1Var) {
        if (this.c > 0) {
            gtf1Var.b(this.d, this.e, this.f, this.g, ftf1Var);
            this.c = 0;
        }
    }

    public final void b(gtf1 gtf1Var, long j, int i, int i2, int i3, ftf1 ftf1Var) {
        dm5.z(this.g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(gtf1Var, ftf1Var);
            }
        }
    }

    public final void c(fc10 fc10Var) {
        if (this.b) {
            return;
        }
        int i = 0;
        byte[] bArr = this.a;
        fc10Var.h(0, bArr, 10);
        fc10Var.f();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                i = 40 << ((bArr[((b & 255) == 187 ? 1 : 0) != 0 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.b = true;
    }
}
