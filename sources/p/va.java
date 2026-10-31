package p;

import com.spotify.connect.artisanal_cast.TlsSocketProvider;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class va implements ec10 {
    public final ua a = new ua((byte) 1, 0, null, "audio/ac4");
    public final izr0 b = new izr0(TlsSocketProvider.READ_BUFFER_SIZE);
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
        int i = fc10Var.read(izr0Var.a, 0, TlsSocketProvider.READ_BUFFER_SIZE);
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
        int i;
        izr0 izr0Var = new izr0(10);
        int i2 = 0;
        while (true) {
            uyrVar = (uyr) fc10Var;
            uyrVar.d(izr0Var.a, 0, 10, false);
            izr0Var.R(0);
            if (izr0Var.H() != 4801587) {
                break;
            }
            izr0Var.S(3);
            int iD = izr0Var.D();
            i2 += iD + 10;
            uyrVar.v(iD, false);
        }
        uyrVar.f = 0;
        uyrVar.v(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            uyrVar.d(izr0Var.a, 0, 7, false);
            izr0Var.R(0);
            int iL = izr0Var.L();
            if (iL == 44096 || iL == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = izr0Var.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iL == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                uyrVar.v(i - 7, false);
            } else {
                uyrVar.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                uyrVar.v(i4, false);
                i3 = 0;
            }
        }
        return false;
    }

    @Override // p.ec10
    public final void release() {
    }
}
