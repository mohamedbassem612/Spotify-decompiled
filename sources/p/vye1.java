package p;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vye1 extends w9a {
    public final /* synthetic */ byte i;

    public /* synthetic */ vye1(byte b) {
        this.i = b;
    }

    public static void m(ByteBuffer byteBuffer, int i) {
        float f = (float) (((double) i) * 4.656612875245797E-10d);
        byteBuffer.putInt(Float.isNaN(f) ? 0 : Float.floatToIntBits(f));
    }

    @Override // p.w9a
    public final c18 b(c18 c18Var) throws AudioProcessor$UnhandledAudioFormatException {
        switch (this.i) {
            case 0:
                int i = c18Var.c;
                if (zoi1.P(i)) {
                    return i != 4 ? new c18(c18Var.a, c18Var.b, 4) : c18.e;
                }
                throw new AudioProcessor$UnhandledAudioFormatException(c18Var);
            default:
                int i2 = c18Var.c;
                if (zoi1.P(i2)) {
                    return i2 != 2 ? new c18(c18Var.a, c18Var.b, 2) : c18.e;
                }
                throw new AudioProcessor$UnhandledAudioFormatException(c18Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0050  */
    @Override // p.f18
    public final void g(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferL;
        switch (this.i) {
            case 0:
                int iPosition = byteBuffer.position();
                int iLimit = byteBuffer.limit();
                int i = iLimit - iPosition;
                int i2 = this.b.c;
                if (i2 == 2) {
                    byteBufferL = l(i * 2);
                    while (iPosition < iLimit) {
                        m(byteBufferL, byteBuffer.getShort(iPosition) << 16);
                        iPosition += 2;
                    }
                } else if (i2 == 3) {
                    byteBufferL = l(i * 4);
                    while (iPosition < iLimit) {
                        m(byteBufferL, ((byteBuffer.get(iPosition) & 255) - 128) << 24);
                        iPosition++;
                    }
                } else if (i2 == 21) {
                    byteBufferL = l((i / 3) * 4);
                    while (iPosition < iLimit) {
                        m(byteBufferL, bmq0.u(byteBuffer.get(iPosition + 2), byteBuffer.get(iPosition + 1), byteBuffer.get(iPosition), (byte) 0));
                        iPosition += 3;
                    }
                } else if (i2 == 22) {
                    byteBufferL = l(i);
                    while (iPosition < iLimit) {
                        m(byteBufferL, byteBuffer.getInt(iPosition));
                        iPosition += 4;
                    }
                } else if (i2 == 268435456) {
                    byteBufferL = l(i * 2);
                    while (iPosition < iLimit) {
                        m(byteBufferL, Short.reverseBytes(byteBuffer.getShort(iPosition)) << 16);
                        iPosition += 2;
                    }
                } else if (i2 == 1342177280) {
                    byteBufferL = l((i / 3) * 4);
                    while (iPosition < iLimit) {
                        m(byteBufferL, bmq0.u(byteBuffer.get(iPosition), byteBuffer.get(iPosition + 1), byteBuffer.get(iPosition + 2), (byte) 0));
                        iPosition += 3;
                    }
                } else if (i2 == 1610612736) {
                    byteBufferL = l(i);
                    while (iPosition < iLimit) {
                        m(byteBufferL, Integer.reverseBytes(byteBuffer.getInt(iPosition)));
                        iPosition += 4;
                    }
                } else if (i2 == 1879048192) {
                    byteBufferL = l(i / 2);
                    while (iPosition < iLimit) {
                        byteBufferL.putFloat((float) byteBuffer.getDouble(iPosition));
                        iPosition += 8;
                    }
                } else if (i2 == 1895825408) {
                    byteBufferL = l(i);
                    while (iPosition < iLimit) {
                        byteBufferL.putFloat(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition))));
                        iPosition += 4;
                    }
                } else if (i2 != 1912602624) {
                    bhn0.w();
                } else {
                    byteBufferL = l(i / 2);
                    while (iPosition < iLimit) {
                        byteBufferL.putFloat((float) Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition))));
                        iPosition += 8;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                byteBufferL.flip();
                break;
            default:
                int iPosition2 = byteBuffer.position();
                int iLimit2 = byteBuffer.limit();
                int i3 = iLimit2 - iPosition2;
                int i4 = this.b.c;
                if (i4 == 3) {
                    i3 *= 2;
                } else if (i4 == 4) {
                    i3 /= 2;
                } else if (i4 == 21) {
                    i3 = (i3 / 3) * 2;
                } else if (i4 == 22) {
                    i3 /= 2;
                } else if (i4 != 268435456) {
                    if (i4 == 1342177280) {
                        i3 = (i3 / 3) * 2;
                    } else if (i4 == 1610612736) {
                        i3 /= 2;
                    } else {
                        if (i4 != 1879048192) {
                            if (i4 == 1895825408) {
                                i3 /= 2;
                            } else if (i4 != 1912602624) {
                                bhn0.w();
                            }
                        }
                        i3 /= 4;
                    }
                }
                ByteBuffer byteBufferL2 = l(i3);
                int i5 = this.b.c;
                if (i5 == 3) {
                    while (iPosition2 < iLimit2) {
                        byteBufferL2.put((byte) 0);
                        byteBufferL2.put((byte) ((byteBuffer.get(iPosition2) & 255) - 128));
                        iPosition2++;
                    }
                } else if (i5 == 4) {
                    while (iPosition2 < iLimit2) {
                        short sI = (short) (zoi1.i(byteBuffer.getFloat(iPosition2), -1.0f, 1.0f) * 32767.0f);
                        byteBufferL2.put((byte) (sI & 255));
                        byteBufferL2.put((byte) ((sI >> 8) & 255));
                        iPosition2 += 4;
                    }
                } else if (i5 == 21) {
                    while (iPosition2 < iLimit2) {
                        byteBufferL2.put(byteBuffer.get(iPosition2 + 1));
                        byteBufferL2.put(byteBuffer.get(iPosition2 + 2));
                        iPosition2 += 3;
                    }
                } else if (i5 == 22) {
                    while (iPosition2 < iLimit2) {
                        byteBufferL2.put(byteBuffer.get(iPosition2 + 2));
                        byteBufferL2.put(byteBuffer.get(iPosition2 + 3));
                        iPosition2 += 4;
                    }
                } else if (i5 == 268435456) {
                    while (iPosition2 < iLimit2) {
                        byteBufferL2.put(byteBuffer.get(iPosition2 + 1));
                        byteBufferL2.put(byteBuffer.get(iPosition2));
                        iPosition2 += 2;
                    }
                } else if (i5 == 1342177280) {
                    while (iPosition2 < iLimit2) {
                        byteBufferL2.put(byteBuffer.get(iPosition2 + 1));
                        byteBufferL2.put(byteBuffer.get(iPosition2));
                        iPosition2 += 3;
                    }
                } else if (i5 == 1610612736) {
                    while (iPosition2 < iLimit2) {
                        byteBufferL2.put(byteBuffer.get(iPosition2 + 1));
                        byteBufferL2.put(byteBuffer.get(iPosition2));
                        iPosition2 += 4;
                    }
                } else if (i5 == 1879048192) {
                    while (iPosition2 < iLimit2) {
                        short sMax = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(iPosition2), 1.0d)) * 32767.0d);
                        byteBufferL2.put((byte) (sMax & 255));
                        byteBufferL2.put((byte) ((sMax >> 8) & 255));
                        iPosition2 += 8;
                    }
                } else if (i5 == 1895825408) {
                    while (iPosition2 < iLimit2) {
                        short sI2 = (short) (zoi1.i(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt(iPosition2))), -1.0f, 1.0f) * 32767.0f);
                        byteBufferL2.put((byte) (sI2 & 255));
                        byteBufferL2.put((byte) ((sI2 >> 8) & 255));
                        iPosition2 += 4;
                    }
                } else if (i5 != 1912602624) {
                    bhn0.w();
                } else {
                    while (iPosition2 < iLimit2) {
                        short sMax2 = (short) (Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong(iPosition2))), 1.0d)) * 32767.0d);
                        byteBufferL2.put((byte) (sMax2 & 255));
                        byteBufferL2.put((byte) ((sMax2 >> 8) & 255));
                        iPosition2 += 8;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                byteBufferL2.flip();
                break;
        }
    }
}
