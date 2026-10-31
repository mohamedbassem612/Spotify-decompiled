package p;

import java.io.InterruptedIOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ta implements ec10 {
    public final ua a = new ua("audio/ac3");
    public final izr0 b = new izr0(2786);
    public boolean c;

    @Override // p.ec10
    public final void a(long j, long j2) {
        this.c = false;
        this.a.b();
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        this.a.d(gc10Var, new wwg1(0, 1));
        gc10Var.s();
        gc10Var.c(new bc9(-9223372036854775807L));
    }

    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) {
        izr0 izr0Var = this.b;
        int i = fc10Var.read(izr0Var.a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        izr0Var.R(0);
        izr0Var.Q(i);
        boolean z = this.c;
        ua uaVar = this.a;
        if (!z) {
            uaVar.o = 0L;
            this.c = true;
        }
        uaVar.a(izr0Var);
        return 0;
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) throws InterruptedIOException {
        uyr uyrVar;
        int iS;
        izr0 izr0Var = new izr0(10);
        int i = 0;
        while (true) {
            uyrVar = (uyr) fc10Var;
            uyrVar.d(izr0Var.a, 0, 10, false);
            izr0Var.R(0);
            if (izr0Var.H() != 4801587) {
                break;
            }
            izr0Var.S(3);
            int iD = izr0Var.D();
            i += iD + 10;
            uyrVar.v(iD, false);
        }
        uyrVar.f = 0;
        uyrVar.v(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            uyrVar.d(izr0Var.a, 0, 6, false);
            izr0Var.R(0);
            if (izr0Var.L() != 2935) {
                uyrVar.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                uyrVar.v(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = izr0Var.a;
                if (bArr.length < 6) {
                    iS = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iS = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iS = sj1.s((b & 192) >> 6, b & 63);
                }
                if (iS == -1) {
                    break;
                }
                uyrVar.v(iS - 6, false);
            }
        }
        return false;
    }

    @Override // p.ec10
    public final void release() {
    }
}
