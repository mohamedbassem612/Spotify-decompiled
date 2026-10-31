package p;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tl70 implements o2r {
    public final o2r a;
    public final int b;
    public final ujx0 c;
    public final byte[] d;
    public int e;

    public tl70(o2r o2rVar, int i, ujx0 ujx0Var) {
        dm5.m(i > 0);
        this.a = o2rVar;
        this.b = i;
        this.c = ujx0Var;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // p.o2r
    public final void a(yeg1 yeg1Var) {
        yeg1Var.getClass();
        this.a.a(yeg1Var);
    }

    @Override // p.o2r
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // p.o2r
    public final Map e() {
        return this.a.e();
    }

    @Override // p.o2r
    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        o2r o2rVar = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (o2rVar.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = o2rVar.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        izr0 izr0Var = new izr0(bArr3, i5);
                        ujx0 ujx0Var = this.c;
                        long jMax = !ujx0Var.m ? ujx0Var.j : Math.max(ujx0Var.n.B(true), ujx0Var.j);
                        int iA = izr0Var.a();
                        gtf1 gtf1Var = ujx0Var.l;
                        gtf1Var.getClass();
                        gtf1Var.f(iA, izr0Var);
                        gtf1Var.b(jMax, 1, iA, 0, null);
                        ujx0Var.m = true;
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int i8 = o2rVar.read(bArr, i, Math.min(i3, i2));
        if (i8 != -1) {
            this.e -= i8;
        }
        return i8;
    }

    @Override // p.o2r
    public final long t(n3r n3rVar) {
        throw new UnsupportedOperationException();
    }
}
