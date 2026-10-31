package p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class df01 implements fbc {
    public final c291 a;
    public final nac b = new nac();
    public boolean c;

    public df01(c291 c291Var) {
        this.a = c291Var;
    }

    @Override // p.fbc
    public final long B(fka1 fka1Var) {
        long j = 0;
        while (true) {
            long jO0 = fka1Var.O0(this.b, 8192L);
            if (jO0 == -1) {
                return j;
            }
            j += jO0;
            a();
        }
    }

    @Override // p.c291
    public final void B0(nac nacVar, long j) {
        if (this.c) {
            eg.m("closed");
        } else {
            this.b.B0(nacVar, j);
            a();
        }
    }

    @Override // p.fbc
    public final fbc O(byte[] bArr, int i) {
        if (this.c) {
            eg.m("closed");
            return null;
        }
        this.b.write(bArr, 0, i);
        a();
        return this;
    }

    @Override // p.fbc
    public final fbc P(ff01 ff01Var, long j) {
        while (j > 0) {
            long jO0 = ff01Var.O0(this.b, j);
            if (jO0 == -1) {
                eg.l();
                return null;
            }
            j -= jO0;
            a();
        }
        return this;
    }

    @Override // p.fbc
    public final fbc Q(String str) {
        if (this.c) {
            eg.m("closed");
            return null;
        }
        this.b.Y(str);
        a();
        return this;
    }

    @Override // p.fbc
    public final fbc T0(rhc rhcVar) {
        if (this.c) {
            eg.m("closed");
            return null;
        }
        this.b.N(rhcVar);
        a();
        return this;
    }

    public final fbc a() {
        if (this.c) {
            eg.m("closed");
            return null;
        }
        nac nacVar = this.b;
        long jD = nacVar.d();
        if (jD > 0) {
            this.a.B0(nacVar, jD);
        }
        return this;
    }

    public final fbc c(int i) {
        if (this.c) {
            eg.m("closed");
            return null;
        }
        this.b.U(i);
        a();
        return this;
    }

    @Override // p.c291, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c291 c291Var = this.a;
        if (this.c) {
            return;
        }
        nac nacVar = this.b;
        long j = nacVar.b;
        if (j > 0) {
            c291Var.B0(nacVar, j);
        }
        th = null;
        try {
            c291Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p.c291, java.io.Flushable
    public final void flush() {
        if (this.c) {
            eg.m("closed");
            return;
        }
        nac nacVar = this.b;
        long j = nacVar.b;
        c291 c291Var = this.a;
        if (j > 0) {
            c291Var.B0(nacVar, j);
        }
        c291Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // p.fbc
    public final nac k() {
        return this.b;
    }

    @Override // p.c291
    public final gve1 l() {
        return this.a.l();
    }

    @Override // p.fbc
    public final fbc m0(long j) {
        if (this.c) {
            eg.m("closed");
            return null;
        }
        this.b.S(j);
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // p.fbc
    public final fbc write(byte[] bArr) {
        if (this.c) {
            eg.m("closed");
            return null;
        }
        this.b.write(bArr, 0, bArr.length);
        a();
        return this;
    }

    @Override // p.fbc
    public final fbc writeByte(int i) {
        if (this.c) {
            eg.m("closed");
            return null;
        }
        this.b.R(i);
        a();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (!this.c) {
            int iWrite = this.b.write(byteBuffer);
            a();
            return iWrite;
        }
        eg.m("closed");
        return 0;
    }
}
