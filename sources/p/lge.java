package p;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lge extends w9a {
    public u280 i;
    public u280 j;

    @Override // p.w9a
    public final c18 b(c18 c18Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i = c18Var.c;
        u280 u280Var = this.i;
        if (u280Var == null) {
            return c18.e;
        }
        int i2 = c18Var.b;
        if (!zoi1.P(i)) {
            throw new AudioProcessor$UnhandledAudioFormatException(c18Var);
        }
        int i3 = u280Var.b;
        boolean z = i2 != i3;
        int i4 = 0;
        while (i4 < i3) {
            int iB = u280Var.b(i4);
            if (iB >= i2) {
                throw new AudioProcessor$UnhandledAudioFormatException("Channel map (" + u280Var + ") trying to access non-existent input channel.", c18Var);
            }
            z |= iB != i4;
            i4++;
        }
        return z ? new c18(c18Var.a, i3, i) : c18.e;
    }

    @Override // p.w9a
    public final void c() {
        this.j = this.i;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Code duplicated, block: B:65:0x0117  */
    @Override // p.f18
    public final void g(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        u280 u280Var = this.j;
        u280Var.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferL = l(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i5 = 0; i5 < u280Var.b; i5++) {
                int iZ = (zoi1.z(this.b.c) * u280Var.b(i5)) + iPosition;
                int i6 = this.b.c;
                if (i6 == 2) {
                    byteBufferL.putShort(byteBuffer.getShort(iZ));
                } else if (i6 == 3) {
                    byteBufferL.put(byteBuffer.get(iZ));
                } else if (i6 == 4) {
                    byteBufferL.putFloat(byteBuffer.getFloat(iZ));
                } else if (i6 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iZ;
                    } else {
                        i = iZ + 2;
                    }
                    byte b = byteBuffer.get(i);
                    byte b2 = byteBuffer.get(iZ + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iZ += 2;
                    }
                    i2 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(iZ) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0 || (i2 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    dm5.o(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
                    dm5.m(byteBufferL.remaining() >= 3);
                    if (byteBufferL.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b3 = (byte) i3;
                    byte b4 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferL.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferL.put(b3).put(b4).put((byte) i4);
                } else if (i6 == 22) {
                    byteBufferL.putInt(byteBuffer.getInt(iZ));
                } else if (i6 == 268435456) {
                    byteBufferL.putShort(byteBuffer.getShort(iZ));
                } else if (i6 == 1342177280) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iZ;
                    } else {
                        i = iZ + 2;
                    }
                    byte b5 = byteBuffer.get(i);
                    byte b6 = byteBuffer.get(iZ + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iZ += 2;
                    }
                    i2 = ((((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680)) | ((byteBuffer.get(iZ) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0) {
                        z = true;
                    } else {
                        z = true;
                    }
                    dm5.o(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
                    dm5.m(byteBufferL.remaining() >= 3);
                    if (byteBufferL.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b7 = (byte) i3;
                    byte b8 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferL.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferL.put(b7).put(b8).put((byte) i4);
                } else if (i6 != 1610612736) {
                    if (i6 != 1879048192) {
                        if (i6 == 1895825408) {
                            byteBufferL.putFloat(byteBuffer.getFloat(iZ));
                        } else if (i6 != 1912602624) {
                            bhn0.r(this.b.c, "Unexpected encoding: ");
                            return;
                        }
                    }
                    byteBufferL.putDouble(byteBuffer.getDouble(iZ));
                } else {
                    byteBufferL.putInt(byteBuffer.getInt(iZ));
                }
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferL.flip();
    }

    @Override // p.w9a
    public final void k() {
        this.j = null;
        this.i = null;
    }
}
