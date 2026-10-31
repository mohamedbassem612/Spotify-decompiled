package p;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wym0 extends bmq0 {
    public final ByteBuffer b = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    public long c = 0;
    public long d = 0;
    public int e = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p.bmq0
    public final wt50 C() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        n0();
        ByteBuffer byteBuffer = this.b;
        byteBuffer.flip();
        if (byteBuffer.remaining() > 0) {
            this.e = byteBuffer.remaining() + this.e;
            long j8 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j = 0;
                    j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                    this.c = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.c;
                    this.d ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 2:
                    j2 = 0;
                    j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                    this.c = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.c;
                    this.d ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 3:
                    j3 = 0;
                    j2 = j3 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                    j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                    this.c = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.c;
                    this.d ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 4:
                    j4 = 0;
                    j3 = j4 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                    j2 = j3 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                    j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                    this.c = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.c;
                    this.d ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 5:
                    j5 = 0;
                    j4 = j5 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                    j3 = j4 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                    j2 = j3 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                    j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                    this.c = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.c;
                    this.d ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 6:
                    j6 = 0;
                    j5 = (((long) (byteBuffer.get(5) & 255)) << 40) ^ j6;
                    j4 = j5 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                    j3 = j4 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                    j2 = j3 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                    j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                    this.c = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.c;
                    this.d ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 7:
                    j6 = ((long) (byteBuffer.get(6) & 255)) << 48;
                    j5 = (((long) (byteBuffer.get(5) & 255)) << 40) ^ j6;
                    j4 = j5 ^ (((long) (byteBuffer.get(4) & 255)) << 32);
                    j3 = j4 ^ (((long) (byteBuffer.get(3) & 255)) << 24);
                    j2 = j3 ^ (((long) (byteBuffer.get(2) & 255)) << 16);
                    j = j2 ^ (((long) (byteBuffer.get(1) & 255)) << 8);
                    j7 = j ^ ((long) (byteBuffer.get(0) & 255));
                    this.c = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.c;
                    this.d ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 8:
                    j7 = byteBuffer.getLong();
                    this.c = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.c;
                    this.d ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 9:
                    j8 ^= (long) (byteBuffer.get(8) & 255);
                    j7 = byteBuffer.getLong();
                    this.c = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.c;
                    this.d ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 10:
                    j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & 255);
                    j7 = byteBuffer.getLong();
                    this.c = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.c;
                    this.d ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 11:
                    j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                    j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & 255);
                    j7 = byteBuffer.getLong();
                    this.c = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.c;
                    this.d ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 12:
                    j8 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                    j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                    j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & 255);
                    j7 = byteBuffer.getLong();
                    this.c = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.c;
                    this.d ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 13:
                    j8 ^= ((long) (byteBuffer.get(12) & 255)) << 32;
                    j8 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                    j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                    j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & 255);
                    j7 = byteBuffer.getLong();
                    this.c = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.c;
                    this.d ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 14:
                    j8 ^= ((long) (byteBuffer.get(13) & 255)) << 40;
                    j8 ^= ((long) (byteBuffer.get(12) & 255)) << 32;
                    j8 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                    j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                    j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & 255);
                    j7 = byteBuffer.getLong();
                    this.c = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.c;
                    this.d ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                case 15:
                    j8 = ((long) (byteBuffer.get(14) & 255)) << 48;
                    j8 ^= ((long) (byteBuffer.get(13) & 255)) << 40;
                    j8 ^= ((long) (byteBuffer.get(12) & 255)) << 32;
                    j8 ^= ((long) (byteBuffer.get(11) & 255)) << 24;
                    j8 ^= ((long) (byteBuffer.get(10) & 255)) << 16;
                    j8 ^= ((long) (byteBuffer.get(9) & 255)) << 8;
                    j8 ^= (long) (byteBuffer.get(8) & 255);
                    j7 = byteBuffer.getLong();
                    this.c = (Long.rotateLeft(j7 * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.c;
                    this.d ^= Long.rotateLeft(j8 * 5545529020109919103L, 33) * (-8663945395140668459L);
                    byteBuffer.position(byteBuffer.limit());
                    break;
                default:
                    eg.f("Should never get here.");
                    return null;
            }
        }
        long j9 = this.c;
        long j10 = this.e;
        long j11 = j9 ^ j10;
        long j12 = j10 ^ this.d;
        long j13 = j11 + j12;
        long j14 = j12 + j13;
        long j15 = (j13 ^ (j13 >>> 33)) * (-49064778989728563L);
        long j16 = (j15 ^ (j15 >>> 33)) * (-4265267296055464877L);
        long j17 = (j14 ^ (j14 >>> 33)) * (-49064778989728563L);
        long j18 = (j17 ^ (j17 >>> 33)) * (-4265267296055464877L);
        long j19 = j18 ^ (j18 >>> 33);
        long j20 = (j16 ^ (j16 >>> 33)) + j19;
        this.c = j20;
        this.d = j19 + j20;
        return new ut50(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.c).putLong(this.d).array());
    }

    @Override // p.bmq0
    public final bmq0 U(byte[] bArr, int i) {
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr, 0, i).order(ByteOrder.LITTLE_ENDIAN);
        int iRemaining = byteBufferOrder.remaining();
        ByteBuffer byteBuffer = this.b;
        if (iRemaining <= byteBuffer.remaining()) {
            byteBuffer.put(byteBufferOrder);
            if (byteBuffer.remaining() < 8) {
                n0();
            }
            return this;
        }
        int iPosition = 16 - byteBuffer.position();
        for (int i2 = 0; i2 < iPosition; i2++) {
            byteBuffer.put(byteBufferOrder.get());
        }
        n0();
        while (byteBufferOrder.remaining() >= 16) {
            o0(byteBufferOrder);
        }
        byteBuffer.put(byteBufferOrder);
        return this;
    }

    @Override // p.bmq0
    public final bmq0 V(char c) {
        ByteBuffer byteBuffer = this.b;
        byteBuffer.putChar(c);
        if (byteBuffer.remaining() < 8) {
            n0();
        }
        return this;
    }

    public final void n0() {
        ByteBuffer byteBuffer = this.b;
        byteBuffer.flip();
        while (byteBuffer.remaining() >= 16) {
            o0(byteBuffer);
        }
        byteBuffer.compact();
    }

    public final void o0(ByteBuffer byteBuffer) {
        long j = byteBuffer.getLong();
        long j2 = byteBuffer.getLong();
        long jRotateLeft = (Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L) ^ this.c;
        this.c = jRotateLeft;
        long jRotateLeft2 = Long.rotateLeft(jRotateLeft, 27);
        long j3 = this.d;
        this.c = ((jRotateLeft2 + j3) * 5) + 1390208809;
        long jRotateLeft3 = (Long.rotateLeft(j2 * 5545529020109919103L, 33) * (-8663945395140668459L)) ^ j3;
        this.d = jRotateLeft3;
        this.d = ((Long.rotateLeft(jRotateLeft3, 31) + this.c) * 5) + 944331445;
        this.e += 16;
    }
}
