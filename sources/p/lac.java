package p;

import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lac implements Closeable {
    public nac a;
    public boolean b;
    public ip51 c;
    public byte[] e;
    public long d = -1;
    public int f = -1;
    public int g = -1;

    public final void a(long j) {
        nac nacVar = this.a;
        if (nacVar == null) {
            eg.m("not attached to a buffer");
            return;
        }
        if (!this.b) {
            eg.m("resizeBuffer() only permitted for read/write buffers");
            return;
        }
        long j2 = nacVar.b;
        if (j <= j2) {
            if (j < 0) {
                hhg1.f(l1d.l(j, "newSize < 0: "));
                return;
            }
            long j3 = j2 - j;
            while (j3 > 0) {
                ip51 ip51Var = nacVar.a;
                ip51Var.getClass();
                ip51 ip51Var2 = ip51Var.g;
                ip51Var2.getClass();
                int i = ip51Var2.c;
                long j4 = i - ip51Var2.b;
                if (j4 > j3) {
                    ip51Var2.c = i - ((int) j3);
                    break;
                } else {
                    nacVar.a = ip51Var2.a();
                    pq51.a(ip51Var2);
                    j3 -= j4;
                }
            }
            this.c = null;
            this.d = j;
            this.e = null;
            this.f = -1;
            this.g = -1;
        } else if (j > j2) {
            long j5 = j - j2;
            int i2 = 1;
            boolean z = true;
            for (long j6 = 0; j5 > j6; j6 = 0) {
                ip51 ip51VarM = nacVar.M(i2);
                int iMin = (int) Math.min(j5, 8192 - ip51VarM.c);
                int i3 = ip51VarM.c + iMin;
                ip51VarM.c = i3;
                j5 -= (long) iMin;
                if (z) {
                    this.c = ip51VarM;
                    this.d = j2;
                    this.e = ip51VarM.a;
                    this.f = i3 - iMin;
                    this.g = i3;
                    z = false;
                }
                i2 = 1;
            }
        }
        nacVar.b = j;
    }

    public final int c(long j) {
        nac nacVar = this.a;
        if (nacVar == null) {
            eg.m("not attached to a buffer");
            return 0;
        }
        if (j >= -1) {
            long j2 = nacVar.b;
            if (j <= j2) {
                if (j == -1 || j == j2) {
                    this.c = null;
                    this.d = j;
                    this.e = null;
                    this.f = -1;
                    this.g = -1;
                    return -1;
                }
                ip51 ip51Var = nacVar.a;
                ip51 ip51Var2 = this.c;
                long j3 = 0;
                if (ip51Var2 != null) {
                    long j4 = this.d - ((long) (this.f - ip51Var2.b));
                    if (j4 > j) {
                        ip51Var2 = ip51Var;
                        ip51Var = ip51Var2;
                        j2 = j4;
                    } else {
                        j3 = j4;
                    }
                } else {
                    ip51Var2 = ip51Var;
                }
                if (j2 - j > j - j3) {
                    while (true) {
                        ip51Var2.getClass();
                        long j5 = ((long) (ip51Var2.c - ip51Var2.b)) + j3;
                        if (j < j5) {
                            break;
                        }
                        ip51Var2 = ip51Var2.f;
                        j3 = j5;
                    }
                } else {
                    while (j2 > j) {
                        ip51Var.getClass();
                        ip51Var = ip51Var.g;
                        ip51Var.getClass();
                        j2 -= (long) (ip51Var.c - ip51Var.b);
                    }
                    ip51Var2 = ip51Var;
                    j3 = j2;
                }
                if (this.b) {
                    ip51Var2.getClass();
                    if (ip51Var2.d) {
                        byte[] bArr = ip51Var2.a;
                        ip51 ip51Var3 = new ip51(Arrays.copyOf(bArr, bArr.length), ip51Var2.b, ip51Var2.c, false, true);
                        if (nacVar.a == ip51Var2) {
                            nacVar.a = ip51Var3;
                        }
                        ip51Var2.b(ip51Var3);
                        ip51 ip51Var4 = ip51Var3.g;
                        ip51Var4.getClass();
                        ip51Var4.a();
                        ip51Var2 = ip51Var3;
                    }
                }
                this.c = ip51Var2;
                this.d = j;
                ip51Var2.getClass();
                this.e = ip51Var2.a;
                int i = ip51Var2.b + ((int) (j - j3));
                this.f = i;
                int i2 = ip51Var2.c;
                this.g = i2;
                return i2 - i;
            }
        }
        StringBuilder sbS = cy30.s(j, "offset=", " > size=");
        sbS.append(nacVar.b);
        throw new ArrayIndexOutOfBoundsException(sbS.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.a == null) {
            eg.m("not attached to a buffer");
            return;
        }
        this.a = null;
        this.c = null;
        this.d = -1L;
        this.e = null;
        this.f = -1;
        this.g = -1;
    }
}
