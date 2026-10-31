package p;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ff01 implements gbc {
    public final fka1 a;
    public final nac b = new nac();
    public boolean c;

    public ff01(fka1 fka1Var) {
        this.a = fka1Var;
    }

    @Override // p.gbc
    public final String I0(Charset charset) {
        fka1 fka1Var = this.a;
        nac nacVar = this.b;
        nacVar.B(fka1Var);
        return nacVar.G(nacVar.b, charset);
    }

    @Override // p.gbc
    public final int L0() {
        q(1L);
        nac nacVar = this.b;
        byte bG = nacVar.g(0L);
        if ((bG & 224) == 192) {
            q(2L);
        } else if ((bG & 240) == 224) {
            q(3L);
        } else if ((bG & 248) == 240) {
            q(4L);
        }
        return nacVar.L0();
    }

    @Override // p.fka1
    public final long O0(nac nacVar, long j) {
        if (j < 0) {
            hhg1.f(l1d.l(j, "byteCount < 0: "));
            return 0L;
        }
        if (this.c) {
            eg.m("closed");
            return 0L;
        }
        nac nacVar2 = this.b;
        if (nacVar2.b == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.a.O0(nacVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return nacVar2.O0(nacVar, Math.min(j, nacVar2.b));
    }

    @Override // p.gbc
    public final long Z0(fbc fbcVar) {
        nac nacVar;
        long j = 0;
        while (true) {
            fka1 fka1Var = this.a;
            nacVar = this.b;
            if (fka1Var.O0(nacVar, 8192L) == -1) {
                break;
            }
            long jD = nacVar.d();
            if (jD > 0) {
                j += jD;
                fbcVar.B0(nacVar, jD);
            }
        }
        long j2 = nacVar.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        fbcVar.B0(nacVar, j2);
        return j3;
    }

    public final long a(byte b, long j, long j2) {
        if (this.c) {
            eg.m("closed");
            return 0L;
        }
        if (0 > j2) {
            hhg1.f(l1d.l(j2, "fromIndex=0 toIndex="));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            nac nacVar = this.b;
            byte b2 = b;
            long j3 = j2;
            long jH = nacVar.h(b2, jMax, j3);
            if (jH != -1) {
                return jH;
            }
            long j4 = nacVar.b;
            if (j4 >= j3 || this.a.O0(nacVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    public final long c(rhc rhcVar) {
        long jMax = 0;
        if (this.c) {
            eg.m("closed");
            return 0L;
        }
        while (true) {
            nac nacVar = this.b;
            long jI = nacVar.i(jMax, rhcVar);
            if (jI != -1) {
                return jI;
            }
            long j = nacVar.b;
            if (this.a.O0(nacVar, 8192L) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.a();
    }

    public final byte d() {
        q(1L);
        return this.b.u();
    }

    public final rhc e(long j) {
        q(j);
        return this.b.w(j);
    }

    public final void f(nac nacVar, long j) throws EOFException {
        nac nacVar2 = this.b;
        try {
            q(j);
            long j2 = nacVar2.b;
            if (j2 >= j) {
                nacVar.B0(nacVar2, j);
            } else {
                nacVar.B0(nacVar2, j2);
                eg.l();
            }
        } catch (EOFException e) {
            nacVar.B(nacVar2);
            throw e;
        }
    }

    public final int g() {
        q(4L);
        return this.b.C();
    }

    public final int h() {
        q(4L);
        return zod.M(this.b.C());
    }

    @Override // p.gbc
    public final InputStream h1() {
        return new ef01(this);
    }

    public final long i() {
        q(8L);
        return zod.N(this.b.D());
    }

    @Override // p.gbc
    public final boolean i0(long j, rhc rhcVar) {
        int iD = rhcVar.d();
        if (!this.c) {
            return iD >= 0 && j >= 0 && iD <= rhcVar.d() && (iD == 0 || iro1.k(this, rhcVar, iD, j, j + 1) != -1);
        }
        eg.m("closed");
        return false;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final short j() {
        q(2L);
        return this.b.E();
    }

    @Override // p.gbc
    public final nac k() {
        return this.b;
    }

    @Override // p.fka1
    public final gve1 l() {
        return this.a.l();
    }

    public final short m() {
        q(2L);
        return this.b.F();
    }

    public final String o(long j) {
        q(j);
        return this.b.G(j, nne.a);
    }

    public final String p(long j) throws EOFException {
        if (j < 0) {
            hhg1.f(l1d.l(j, "limit < 0: "));
            return null;
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jA = a((byte) 10, 0L, j2);
        nac nacVar = this.b;
        if (jA != -1) {
            return b.c(nacVar, jA);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && nacVar.g(j2 - 1) == 13 && request(j2 + 1) && nacVar.g(j2) == 10) {
            return b.c(nacVar, j2);
        }
        nac nacVar2 = new nac();
        nacVar.e(nacVar2, 0L, Math.min(32L, nacVar.b));
        throw new EOFException("\\n not found: limit=" + Math.min(nacVar.b, j) + " content=" + nacVar2.w(nacVar2.b).e() + (char) 8230);
    }

    @Override // p.gbc
    public final ff01 peek() {
        return sj1.g(new xes0(this));
    }

    public final void q(long j) {
        if (request(j)) {
            return;
        }
        eg.l();
    }

    @Override // p.gbc
    public final int read(byte[] bArr) {
        int length = bArr.length;
        long j = length;
        zod.u(bArr.length, 0L, j);
        nac nacVar = this.b;
        if (nacVar.b == 0) {
            if (length == 0) {
                return 0;
            }
            if (this.a.O0(nacVar, 8192L) == -1) {
                return -1;
            }
        }
        return nacVar.read(bArr, 0, (int) Math.min(j, nacVar.b));
    }

    @Override // p.gbc
    public final boolean request(long j) {
        nac nacVar;
        if (j < 0) {
            hhg1.f(l1d.l(j, "byteCount < 0: "));
            return false;
        }
        if (this.c) {
            eg.m("closed");
            return false;
        }
        do {
            nacVar = this.b;
            if (nacVar.b >= j) {
                return true;
            }
        } while (this.a.O0(nacVar, 8192L) != -1);
        return false;
    }

    @Override // p.gbc
    public final int s0(cqq0 cqq0Var) {
        nac nacVar;
        if (this.c) {
            eg.m("closed");
            return 0;
        }
        do {
            nacVar = this.b;
            int iD = b.d(nacVar, cqq0Var, true);
            if (iD != -2) {
                if (iD == -1) {
                    break;
                }
                nacVar.skip(cqq0Var.a[iD].d());
                return iD;
            }
        } while (this.a.O0(nacVar, 8192L) != -1);
        return -1;
    }

    @Override // p.gbc
    public final void skip(long j) {
        if (this.c) {
            eg.m("closed");
            return;
        }
        while (j > 0) {
            nac nacVar = this.b;
            if (nacVar.b == 0 && this.a.O0(nacVar, 8192L) == -1) {
                eg.l();
                return;
            } else {
                long jMin = Math.min(j, nacVar.b);
                nacVar.skip(jMin);
                j -= jMin;
            }
        }
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // p.gbc
    public final byte[] y0() {
        fka1 fka1Var = this.a;
        nac nacVar = this.b;
        nacVar.B(fka1Var);
        return nacVar.v(nacVar.b);
    }

    @Override // p.gbc
    public final boolean z0() {
        if (this.c) {
            eg.m("closed");
            return false;
        }
        nac nacVar = this.b;
        return nacVar.z0() && this.a.O0(nacVar, 8192L) == -1;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        nac nacVar = this.b;
        if (nacVar.b == 0 && this.a.O0(nacVar, 8192L) == -1) {
            return -1;
        }
        return nacVar.read(byteBuffer);
    }
}
