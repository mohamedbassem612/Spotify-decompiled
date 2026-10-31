package p;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class br50 implements fka1 {
    public byte a;
    public final ff01 b;
    public final Inflater c;
    public final fb80 d;
    public final CRC32 e;

    public br50(gbc gbcVar) {
        ff01 ff01Var = new ff01(gbcVar);
        this.b = ff01Var;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new fb80(ff01Var, inflater);
        this.e = new CRC32();
    }

    public static void a(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        StringBuilder sbG = dv20.g(str, ": actual 0x");
        sbG.append(ihc1.F0(8, zod.W(i2)));
        sbG.append(" != expected 0x");
        sbG.append(ihc1.F0(8, zod.W(i)));
        throw new IOException(sbG.toString());
    }

    @Override // p.fka1
    public final long O0(nac nacVar, long j) throws IOException {
        byte b;
        br50 br50Var = this;
        ff01 ff01Var = br50Var.b;
        nac nacVar2 = ff01Var.b;
        if (j < 0) {
            hhg1.f(l1d.l(j, "byteCount < 0: "));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b2 = br50Var.a;
        CRC32 crc32 = br50Var.e;
        if (b2 == 0) {
            ff01Var.q(10L);
            byte bG = nacVar2.g(3L);
            boolean z = ((bG >> 1) & 1) == 1;
            if (z) {
                br50Var.c(nacVar2, 0L, 10L);
            }
            a(8075, ff01Var.j(), "ID1ID2");
            ff01Var.skip(8L);
            if (((bG >> 2) & 1) == 1) {
                ff01Var.q(2L);
                if (z) {
                    c(nacVar2, 0L, 2L);
                }
                long jF = nacVar2.F() & 65535;
                ff01Var.q(jF);
                if (z) {
                    c(nacVar2, 0L, jF);
                }
                ff01Var.skip(jF);
            }
            if (((bG >> 3) & 1) == 1) {
                long jA = ff01Var.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA == -1) {
                    eg.l();
                    return 0L;
                }
                if (z) {
                    c(nacVar2, 0L, jA + 1);
                }
                ff01Var.skip(jA + 1);
            }
            if (((bG >> 4) & 1) == 1) {
                long jA2 = ff01Var.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA2 == -1) {
                    eg.l();
                    return 0L;
                }
                if (z) {
                    br50Var = this;
                    br50Var.c(nacVar2, 0L, jA2 + 1);
                } else {
                    br50Var = this;
                }
                ff01Var.skip(jA2 + 1);
            } else {
                br50Var = this;
            }
            if (z) {
                a(ff01Var.m(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            br50Var.a = (byte) 1;
            b2 = 1;
        }
        if (b2 == 1) {
            long j2 = nacVar.b;
            long jO0 = br50Var.d.O0(nacVar, j);
            if (jO0 != -1) {
                br50Var.c(nacVar, j2, jO0);
                return jO0;
            }
            b = 2;
            br50Var.a = (byte) 2;
            b2 = 2;
        } else {
            b = 2;
        }
        if (b2 == b) {
            a(ff01Var.h(), (int) crc32.getValue(), "CRC");
            a(ff01Var.h(), (int) br50Var.c.getBytesWritten(), "ISIZE");
            br50Var.a = (byte) 3;
            if (!ff01Var.z0()) {
                k220.i("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    public final void c(nac nacVar, long j, long j2) {
        ip51 ip51Var = nacVar.a;
        ip51Var.getClass();
        while (true) {
            long j3 = ip51Var.c - ip51Var.b;
            if (j < j3) {
                break;
            }
            j -= j3;
            ip51Var = ip51Var.f;
            ip51Var.getClass();
        }
        while (j2 > 0) {
            int i = (int) (((long) ip51Var.b) + j);
            int iMin = (int) Math.min(ip51Var.c - i, j2);
            this.e.update(ip51Var.a, i, iMin);
            j2 -= (long) iMin;
            ip51Var = ip51Var.f;
            ip51Var.getClass();
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // p.fka1
    public final gve1 l() {
        return this.b.a.l();
    }
}
