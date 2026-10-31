package p;

import java.io.InterruptedIOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class usc {
    public final xpc a;
    public final zv81 b;
    public final n3r c;
    public final String d;
    public final byte[] e;
    public final tsc f;
    public long g;
    public long h;
    public long i;
    public volatile boolean j;

    public usc(xpc xpcVar, n3r n3rVar, byte[] bArr, tsc tscVar) {
        this.a = xpcVar;
        this.b = xpcVar.a;
        this.c = n3rVar;
        this.e = bArr == null ? new byte[131072] : bArr;
        this.f = tscVar;
        this.d = xpcVar.e.a(n3rVar);
        this.g = n3rVar.f;
    }

    public final void a() throws Exception {
        long j;
        long jT;
        long j2;
        long j3;
        long j4;
        if (this.j) {
            throw new InterruptedIOException();
        }
        zv81 zv81Var = this.b;
        String str = this.d;
        n3r n3rVar = this.c;
        this.i = zv81Var.e(n3rVar.f, n3rVar.g, str);
        long j5 = n3rVar.g;
        long j6 = -1;
        if (j5 != -1) {
            j = n3rVar.f + j5;
            this.h = j;
        } else {
            long jA = hyl.a(this.b.g(this.d));
            j = jA == -1 ? -1L : jA;
            this.h = j;
        }
        tsc tscVar = this.f;
        if (tscVar != null) {
            tscVar.a(j == -1 ? -1L : j - this.c.f, this.i, 0L);
        }
        while (true) {
            long j7 = this.h;
            if (j7 != j6 && this.g >= j7) {
                return;
            }
            if (this.j) {
                throw new InterruptedIOException();
            }
            long j8 = this.h;
            long jF = this.b.f(this.g, j8 == j6 ? Long.MAX_VALUE : j8 - this.g, this.d);
            if (jF > 0) {
                this.g += jF;
                j2 = j6;
            } else {
                long j9 = -jF;
                if (j9 == Long.MAX_VALUE) {
                    j9 = j6;
                }
                long j10 = this.g;
                xpc xpcVar = this.a;
                boolean z = true;
                int i = 0;
                boolean z2 = j10 + j9 == this.h || j9 == j6;
                if (j9 != j6) {
                    m3r m3rVarA = n3rVar.a();
                    m3rVarA.f = j10;
                    m3rVarA.g = j9;
                    try {
                        jT = xpcVar.t(m3rVarA.a());
                    } catch (Exception unused) {
                        n3p1.k(xpcVar);
                        jT = j6;
                        z = false;
                    }
                } else {
                    jT = j6;
                    z = false;
                }
                if (!z) {
                    if (this.j) {
                        throw new InterruptedIOException();
                    }
                    m3r m3rVarA2 = n3rVar.a();
                    m3rVarA2.f = j10;
                    m3rVarA2.g = j6;
                    try {
                        jT = xpcVar.t(m3rVarA2.a());
                    } catch (Exception e) {
                        n3p1.k(xpcVar);
                        throw e;
                    }
                }
                if (z2 && jT != j6) {
                    long j11 = jT + j10;
                    try {
                        if (this.h != j11) {
                            this.h = j11;
                            tsc tscVar2 = this.f;
                            if (tscVar2 != null) {
                                tscVar2.a(j11 == j6 ? j6 : j11 - this.c.f, this.i, 0L);
                            }
                        }
                    } catch (Exception e2) {
                        n3p1.k(xpcVar);
                        throw e2;
                    }
                }
                int i2 = 0;
                int i3 = 0;
                while (i2 != -1) {
                    if (this.j) {
                        throw new InterruptedIOException();
                    }
                    byte[] bArr = this.e;
                    i2 = xpcVar.read(bArr, i, bArr.length);
                    if (i2 != -1) {
                        long j12 = i2;
                        long j13 = this.i + j12;
                        this.i = j13;
                        tsc tscVar3 = this.f;
                        if (tscVar3 != null) {
                            j3 = j6;
                            long j14 = this.h;
                            if (j14 == j3) {
                                j4 = j3;
                            } else {
                                tscVar3 = tscVar3;
                                j4 = j14 - this.c.f;
                            }
                            tscVar3.a(j4, j13, j12);
                        } else {
                            j3 = j6;
                        }
                        i3 += i2;
                        j6 = j3;
                        i = 0;
                    }
                }
                j2 = j6;
                if (z2) {
                    long j15 = ((long) i3) + j10;
                    if (this.h != j15) {
                        this.h = j15;
                        tsc tscVar4 = this.f;
                        if (tscVar4 != null) {
                            tscVar4.a(j15 == j2 ? j2 : j15 - this.c.f, this.i, 0L);
                        }
                    }
                }
                xpcVar.close();
                this.g = j10 + ((long) i3);
            }
            j6 = j2;
        }
    }
}
