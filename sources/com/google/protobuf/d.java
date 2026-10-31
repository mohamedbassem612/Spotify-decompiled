package com.google.protobuf;

import java.nio.ByteBuffer;
import p.alh1;
import p.dlh1;
import p.hhc;
import p.jto1;
import p.l290;
import p.lwg;
import p.phc;
import p.toi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d extends lwg {
    public final ByteBuffer d;
    public final long e;
    public long f;
    public long g;
    public final long h;
    public int i;
    public int j;
    public int k = Integer.MAX_VALUE;

    public d(ByteBuffer byteBuffer, boolean z) {
        this.d = byteBuffer.duplicate();
        alh1 alh1Var = dlh1.c;
        long j = alh1Var.a.getLong(byteBuffer, dlh1.g);
        this.e = j;
        this.f = ((long) byteBuffer.limit()) + j;
        long jPosition = j + ((long) byteBuffer.position());
        this.g = jPosition;
        this.h = jPosition;
    }

    public static boolean E() {
        return dlh1.d;
    }

    public final int A() {
        return H();
    }

    public final long B() {
        return I();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException$InvalidWireTypeException */
    public final boolean C(int i) throws InvalidProtocolBufferException, InvalidProtocolBufferException.InvalidWireTypeException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (((int) (this.f - this.g)) >= 10) {
                while (i3 < 10) {
                    long j = this.g;
                    this.g = j + 1;
                    if (dlh1.c.c(j) < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.e();
            }
            while (i3 < 10) {
                long j2 = this.g;
                if (j2 == this.f) {
                    throw InvalidProtocolBufferException.h();
                }
                this.g = j2 + 1;
                if (dlh1.c.c(j2) < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.e();
            return true;
        }
        if (i2 == 1) {
            L(8);
            return true;
        }
        if (i2 == 2) {
            L(H());
            return true;
        }
        if (i2 == 3) {
            D();
            a(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            if (((lwg) this).b == 0) {
                a(0);
            }
            return false;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        L(4);
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public final int F() throws InvalidProtocolBufferException {
        long j = this.g;
        if (this.f - j < 4) {
            throw InvalidProtocolBufferException.h();
        }
        this.g = 4 + j;
        alh1 alh1Var = dlh1.c;
        return ((alh1Var.c(j + 3) & 255) << 24) | (alh1Var.c(j) & 255) | ((alh1Var.c(1 + j) & 255) << 8) | ((alh1Var.c(2 + j) & 255) << 16);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public final long G() throws InvalidProtocolBufferException {
        long j = this.g;
        if (this.f - j < 8) {
            throw InvalidProtocolBufferException.h();
        }
        this.g = 8 + j;
        alh1 alh1Var = dlh1.c;
        return ((((long) alh1Var.c(j + 7)) & 255) << 56) | (((long) alh1Var.c(j)) & 255) | ((((long) alh1Var.c(1 + j)) & 255) << 8) | ((((long) alh1Var.c(2 + j)) & 255) << 16) | ((((long) alh1Var.c(3 + j)) & 255) << 24) | ((((long) alh1Var.c(4 + j)) & 255) << 32) | ((((long) alh1Var.c(5 + j)) & 255) << 40) | ((((long) alh1Var.c(6 + j)) & 255) << 48);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0099 A[PHI: r6
      0x0099: PHI (r6v7 long) = (r6v6 long), (r6v8 long), (r6v10 long) binds: [B:25:0x006d, B:29:0x0080, B:33:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (r4.c(r8) < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int H() {
        /*
            r12 = this;
            long r0 = r12.g
            long r2 = r12.f
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L93
        La:
            r2 = 1
            long r2 = r2 + r0
            p.alh1 r4 = p.dlh1.c
            byte r5 = r4.c(r0)
            if (r5 < 0) goto L18
            r12.g = r2
            return r5
        L18:
            long r6 = r12.f
            long r6 = r6 - r2
            r8 = 9
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L23
            goto L93
        L23:
            r6 = 2
            long r6 = r6 + r0
            byte r2 = r4.c(r2)
            int r2 = r2 << 7
            r2 = r2 ^ r5
            if (r2 >= 0) goto L33
            r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
            goto La0
        L33:
            r10 = 3
            long r10 = r10 + r0
            byte r3 = r4.c(r6)
            int r3 = r3 << 14
            r2 = r2 ^ r3
            if (r2 < 0) goto L43
            r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
        L41:
            r6 = r10
            goto La0
        L43:
            r5 = 4
            long r6 = r0 + r5
            byte r3 = r4.c(r10)
            int r3 = r3 << 21
            r2 = r2 ^ r3
            if (r2 >= 0) goto L55
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto La0
        L55:
            r10 = 5
            long r10 = r10 + r0
            byte r3 = r4.c(r6)
            int r5 = r3 << 28
            r2 = r2 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r2 = r2 ^ r5
            if (r3 >= 0) goto L9e
            r5 = 6
            long r6 = r0 + r5
            byte r3 = r4.c(r10)
            if (r3 >= 0) goto L99
            r10 = 7
            long r10 = r10 + r0
            byte r3 = r4.c(r6)
            if (r3 >= 0) goto L9e
            r5 = 8
            long r6 = r0 + r5
            byte r3 = r4.c(r10)
            if (r3 >= 0) goto L99
            long r8 = r8 + r0
            byte r3 = r4.c(r6)
            if (r3 >= 0) goto L9b
            r5 = 10
            long r6 = r0 + r5
            byte r0 = r4.c(r8)
            if (r0 >= 0) goto L99
        L93:
            long r0 = r12.J()
            int r12 = (int) r0
            return r12
        L99:
            r0 = r2
            goto La0
        L9b:
            r0 = r2
            r6 = r8
            goto La0
        L9e:
            r0 = r2
            goto L41
        La0:
            r12.g = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.d.H():int");
    }

    public final long I() {
        long j;
        long j2;
        long j3;
        int i;
        long j4 = this.g;
        if (this.f != j4) {
            long j5 = 1 + j4;
            alh1 alh1Var = dlh1.c;
            byte bC = alh1Var.c(j4);
            if (bC >= 0) {
                this.g = j5;
                return bC;
            }
            if (this.f - j5 >= 9) {
                long j6 = 2 + j4;
                int iC = (alh1Var.c(j5) << 7) ^ bC;
                if (iC >= 0) {
                    long j7 = 3 + j4;
                    int iC2 = iC ^ (alh1Var.c(j6) << 14);
                    if (iC2 < 0) {
                        j6 = j4 + 4;
                        int iC3 = iC2 ^ (alh1Var.c(j7) << 21);
                        if (iC3 < 0) {
                            i = (-2080896) ^ iC3;
                        } else {
                            j7 = 5 + j4;
                            long jC = ((long) iC3) ^ (((long) alh1Var.c(j6)) << 28);
                            if (jC >= 0) {
                                j3 = 266354560;
                            } else {
                                long j8 = 6 + j4;
                                long jC2 = jC ^ (((long) alh1Var.c(j7)) << 35);
                                if (jC2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    j7 = 7 + j4;
                                    jC = jC2 ^ (((long) alh1Var.c(j8)) << 42);
                                    if (jC >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        j8 = 8 + j4;
                                        jC2 = jC ^ (((long) alh1Var.c(j7)) << 49);
                                        if (jC2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            long j9 = j4 + 9;
                                            long jC3 = (jC2 ^ (((long) alh1Var.c(j8)) << 56)) ^ 71499008037633920L;
                                            if (jC3 < 0) {
                                                long j10 = j4 + 10;
                                                if (alh1Var.c(j9) >= 0) {
                                                    j6 = j10;
                                                    j = jC3;
                                                }
                                            } else {
                                                j = jC3;
                                                j6 = j9;
                                            }
                                        }
                                    }
                                }
                                j = j2 ^ jC2;
                                j6 = j8;
                            }
                            j = j3 ^ jC;
                        }
                        this.g = j6;
                        return j;
                    }
                    j = iC2 ^ 16256;
                    j6 = j7;
                    this.g = j6;
                    return j;
                }
                i = iC ^ (-128);
                j = i;
                this.g = j6;
                return j;
            }
        }
        return J();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public final long J() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            long j2 = this.g;
            if (j2 == this.f) {
                throw InvalidProtocolBufferException.h();
            }
            this.g = 1 + j2;
            byte bC = dlh1.c.c(j2);
            j |= ((long) (bC & 127)) << i;
            if ((bC & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.e();
    }

    public final void K() {
        long j = this.f + ((long) this.i);
        this.f = j;
        int i = (int) (j - this.h);
        int i2 = this.k;
        if (i <= i2) {
            this.i = 0;
            return;
        }
        int i3 = i - i2;
        this.i = i3;
        this.f = j - ((long) i3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public final void L(int i) throws InvalidProtocolBufferException {
        if (i >= 0) {
            long j = this.f;
            long j2 = this.g;
            if (i <= ((int) (j - j2))) {
                this.g = j2 + ((long) i);
                return;
            }
        }
        if (i >= 0) {
            throw InvalidProtocolBufferException.h();
        }
        throw InvalidProtocolBufferException.f();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public final void a(int i) throws InvalidProtocolBufferException {
        if (this.j != i) {
            throw InvalidProtocolBufferException.a();
        }
    }

    public final int d() {
        return (int) (this.g - this.h);
    }

    public final boolean e() {
        return this.g == this.f;
    }

    public final void h(int i) {
        this.k = i;
        K();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public final int i(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.f();
        }
        int iD = d() + i;
        int i2 = this.k;
        if (iD > i2) {
            throw InvalidProtocolBufferException.h();
        }
        this.k = iD;
        K();
        return i2;
    }

    public final boolean j() {
        return I() != 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public final hhc k() throws InvalidProtocolBufferException {
        int iH = H();
        if (iH > 0) {
            long j = this.f;
            long j2 = this.g;
            if (iH <= ((int) (j - j2))) {
                byte[] bArr = new byte[iH];
                long j3 = iH;
                dlh1.c.a(j2, j3, bArr);
                this.g += j3;
                hhc hhcVar = phc.b;
                return new hhc(bArr);
            }
        }
        if (iH == 0) {
            return phc.b;
        }
        if (iH < 0) {
            throw InvalidProtocolBufferException.f();
        }
        throw InvalidProtocolBufferException.h();
    }

    public final double l() {
        return Double.longBitsToDouble(G());
    }

    public final int m() {
        return H();
    }

    public final int n() {
        return F();
    }

    public final long o() {
        return G();
    }

    public final float p() {
        return Float.intBitsToFloat(F());
    }

    public final int q() {
        return H();
    }

    public final long r() {
        return I();
    }

    public final int t() {
        return F();
    }

    public final long u() {
        return G();
    }

    public final int v() {
        return lwg.b(H());
    }

    public final long w() {
        return lwg.c(I());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public final String x() throws InvalidProtocolBufferException {
        int iH = H();
        if (iH > 0) {
            long j = this.f;
            long j2 = this.g;
            if (iH <= ((int) (j - j2))) {
                byte[] bArr = new byte[iH];
                long j3 = iH;
                dlh1.c.a(j2, j3, bArr);
                String str = new String(bArr, l290.a);
                this.g += j3;
                return str;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH < 0) {
            throw InvalidProtocolBufferException.f();
        }
        throw InvalidProtocolBufferException.h();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public final String y() throws InvalidProtocolBufferException {
        String strT;
        int iH = H();
        if (iH > 0) {
            long j = this.f;
            long j2 = this.g;
            if (iH <= ((int) (j - j2))) {
                int i = (int) (j2 - this.e);
                jto1 jto1Var = toi1.a;
                jto1Var.getClass();
                ByteBuffer byteBuffer = this.d;
                if (byteBuffer.hasArray()) {
                    strT = jto1Var.r(byteBuffer.arrayOffset() + i, byteBuffer.array(), iH);
                } else {
                    strT = byteBuffer.isDirect() ? jto1Var.t(byteBuffer, i, iH) : jto1.s(byteBuffer, i, iH);
                }
                this.g += (long) iH;
                return strT;
            }
        }
        if (iH == 0) {
            return "";
        }
        if (iH <= 0) {
            throw InvalidProtocolBufferException.f();
        }
        throw InvalidProtocolBufferException.h();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public final int z() throws InvalidProtocolBufferException {
        if (e()) {
            this.j = 0;
            return 0;
        }
        int iH = H();
        this.j = iH;
        if ((iH >>> 3) != 0) {
            return iH;
        }
        throw InvalidProtocolBufferException.b();
    }
}
