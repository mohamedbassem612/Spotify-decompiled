package p;

import androidx.media3.common.ParserException;
import app.p000rive.semantics.SemanticState;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p72 implements ec10 {
    public final boolean a;
    public final izr0 d;
    public final bae e;
    public gc10 f;
    public long g;
    public boolean j;
    public boolean k;
    public boolean l;
    public final q72 b = new q72(0, null, "audio/mp4a-latm", true);
    public final izr0 c = new izr0(SemanticState.Modal);
    public int i = -1;
    public long h = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public p72(int i) {
        this.a = i;
        izr0 izr0Var = new izr0(10);
        this.d = izr0Var;
        byte[] bArr = izr0Var.a;
        this.e = new bae(bArr, bArr.length);
    }

    @Override // p.ec10
    public final void a(long j, long j2) {
        this.k = false;
        this.b.b();
        this.g = j2;
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        this.f = gc10Var;
        this.b.d(gc10Var, new wwg1(0, 1));
        gc10Var.s();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:56:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f8  */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) throws ParserException {
        q72 q72Var;
        q72 q72Var2;
        this.f.getClass();
        long length = fc10Var.getLength();
        int i = -1;
        boolean z = this.a;
        if (z && length != -1) {
            bae baeVar = this.e;
            izr0 izr0Var = this.d;
            if (!this.j) {
                this.i = -1;
                fc10Var.f();
                long j = 0;
                if (fc10Var.getPosition() == 0) {
                    f(fc10Var);
                }
                int i2 = 0;
                while (fc10Var.d(izr0Var.a, 0, 2, true)) {
                    try {
                        izr0Var.R(0);
                        if (!((izr0Var.L() & 65526) == 65520)) {
                            i2 = 0;
                            break;
                        }
                        if (!fc10Var.d(izr0Var.a, 0, 4, true)) {
                            break;
                        }
                        baeVar.m(14);
                        int iG = baeVar.g(13);
                        if (iG <= 6) {
                            this.j = true;
                            throw ParserException.a((RuntimeException) null, "Malformed ADTS stream");
                        }
                        j += (long) iG;
                        i2++;
                        if (i2 == 1000 || !fc10Var.v(iG - 6, true)) {
                            break;
                            break;
                        }
                    } catch (EOFException unused) {
                    }
                }
                fc10Var.f();
                if (i2 > 0) {
                    this.i = (int) (j / ((long) i2));
                } else {
                    this.i = -1;
                }
                this.j = true;
            }
        }
        izr0 izr0Var2 = this.c;
        int i3 = fc10Var.read(izr0Var2.a, 0, SemanticState.Modal);
        boolean z2 = i3 == -1;
        boolean z3 = this.l;
        q72 q72Var3 = this.b;
        if (z3) {
            i = -1;
            q72Var = q72Var3;
        } else {
            boolean z4 = z && this.i > 0;
            if (z4 && q72Var3.s == -9223372036854775807L && !z2) {
                i = -1;
                q72Var = q72Var3;
            } else {
                if (z4) {
                    long j2 = q72Var3.s;
                    if (j2 != -9223372036854775807L) {
                        gc10 gc10Var = this.f;
                        int i4 = this.i;
                        q72Var = q72Var3;
                        gc10Var.c(new pgl(length, this.h, false, (int) ((((long) i4) * 8000000) / j2), i4, true));
                    } else {
                        q72Var = q72Var3;
                        this.f.c(new bc9(-9223372036854775807L));
                    }
                } else {
                    q72Var = q72Var3;
                    this.f.c(new bc9(-9223372036854775807L));
                }
                this.l = true;
            }
        }
        if (z2) {
            return i;
        }
        izr0Var2.R(0);
        izr0Var2.Q(i3);
        if (this.k) {
            q72Var2 = q72Var;
        } else {
            q72Var2 = q72Var;
            q72Var2.u = this.g;
            this.k = true;
        }
        q72Var2.a(izr0Var2);
        return 0;
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) throws InterruptedIOException {
        int iF = f(fc10Var);
        int i = iF;
        int i2 = 0;
        int i3 = 0;
        do {
            izr0 izr0Var = this.d;
            uyr uyrVar = (uyr) fc10Var;
            uyrVar.d(izr0Var.a, 0, 2, false);
            izr0Var.R(0);
            if ((izr0Var.L() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                uyrVar.d(izr0Var.a, 0, 4, false);
                bae baeVar = this.e;
                baeVar.m(14);
                int iG = baeVar.g(13);
                if (iG <= 6) {
                    i++;
                    uyrVar.f = 0;
                    uyrVar.v(i, false);
                } else {
                    uyrVar.v(iG - 6, false);
                    i3 += iG;
                }
            } else {
                i++;
                uyrVar.f = 0;
                uyrVar.v(i, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iF < 8192);
        return false;
    }

    public final int f(fc10 fc10Var) {
        int i = 0;
        while (true) {
            izr0 izr0Var = this.d;
            fc10Var.h(0, izr0Var.a, 10);
            izr0Var.R(0);
            if (izr0Var.H() != 4801587) {
                break;
            }
            izr0Var.S(3);
            int iD = izr0Var.D();
            i += iD + 10;
            fc10Var.k(iD);
        }
        fc10Var.f();
        fc10Var.k(i);
        if (this.h == -1) {
            this.h = i;
        }
        return i;
    }

    @Override // p.ec10
    public final void release() {
    }
}
