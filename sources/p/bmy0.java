package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bmy0 {
    public final /* synthetic */ byte a;
    public final yve1 b;
    public final izr0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public bmy0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new yve1(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new izr0();
                break;
            default:
                this.b = new yve1(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new izr0();
                break;
        }
    }

    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(izr0 izr0Var) {
        int i = izr0Var.b;
        if (izr0Var.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        izr0Var.o(0, bArr, 9);
        izr0Var.R(i);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        return ((j2 & 3) << 13) | ((((long) bArr[1]) & 255) << 20) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
    }

    public final void a(fc10 fc10Var) {
        byte b = this.a;
        izr0 izr0Var = this.c;
        switch (b) {
            case 0:
                byte[] bArr = zoi1.b;
                izr0Var.P(bArr, bArr.length);
                this.d = true;
                fc10Var.f();
                break;
            default:
                byte[] bArr2 = zoi1.b;
                izr0Var.P(bArr2, bArr2.length);
                this.d = true;
                fc10Var.f();
                break;
        }
    }
}
