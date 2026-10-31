package j$.sun.nio.cs;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d9f8928238715ac698104c66898e5631a6796c71eabc0cbc140853337a7ef765 */
/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes13.dex */
public final class b extends CharsetEncoder {
    public final e a;

    public b(c cVar) {
        super(cVar, 1.0f, 1.0f);
        e eVar = new e();
        eVar.a = CoderResult.UNDERFLOW;
        this.a = eVar;
    }

    public static int a(char[] cArr, int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        if (i3 <= 0) {
            return 0;
        }
        Objects.requireNonNull(cArr);
        Objects.requireNonNull(bArr);
        if (i < 0 || i >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        if (i2 < 0 || i2 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i2);
        }
        int i5 = (i + i3) - 1;
        if (i5 < 0 || i5 >= cArr.length) {
            throw new ArrayIndexOutOfBoundsException(i5);
        }
        int i6 = (i2 + i3) - 1;
        if (i6 < 0 || i6 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i6);
        }
        while (i4 < i3) {
            int i7 = i + 1;
            char c = cArr[i];
            if (c > 255) {
                break;
            }
            bArr[i2] = (byte) c;
            i4++;
            i = i7;
            i2++;
        }
        return i4;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean canEncode(char c) {
        return c <= 255;
    }

    @Override // java.nio.charset.CharsetEncoder
    public final CoderResult encodeLoop(CharBuffer charBuffer, ByteBuffer byteBuffer) {
        int i;
        Buffer bufferPosition;
        int i2 = 2;
        if (!charBuffer.hasArray() || !byteBuffer.hasArray()) {
            int iPosition = charBuffer.position();
            while (charBuffer.hasRemaining()) {
                try {
                    char c = charBuffer.get();
                    if (c > 255) {
                        int iA = this.a.a(c, charBuffer);
                        e eVar = this.a;
                        if (iA < 0) {
                            CoderResult coderResult = eVar.a;
                            return coderResult;
                        }
                        if (!eVar.b) {
                            i2 = 1;
                        }
                        CoderResult coderResultUnmappableForLength = CoderResult.unmappableForLength(i2);
                        return coderResultUnmappableForLength;
                    }
                    if (!byteBuffer.hasRemaining()) {
                        CoderResult coderResult2 = CoderResult.OVERFLOW;
                        return coderResult2;
                    }
                    byteBuffer.put((byte) c);
                    iPosition++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            CoderResult coderResult3 = CoderResult.UNDERFLOW;
            return coderResult3;
        }
        char[] cArrArray = charBuffer.array();
        int iArrayOffset = charBuffer.arrayOffset();
        int iPosition2 = charBuffer.position() + iArrayOffset;
        int iLimit = charBuffer.limit() + iArrayOffset;
        if (iPosition2 > iLimit) {
            iPosition2 = iLimit;
        }
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset2 = byteBuffer.arrayOffset();
        int iPosition3 = byteBuffer.position() + iArrayOffset2;
        int iLimit2 = byteBuffer.limit() + iArrayOffset2;
        if (iPosition3 > iLimit2) {
            iPosition3 = iLimit2;
        }
        int i3 = iLimit2 - iPosition3;
        int i4 = iLimit - iPosition2;
        if (i3 >= i4) {
            i3 = i4;
        }
        try {
            int iA2 = a(cArrArray, iPosition2, bArrArray, iPosition3, i3);
            int i5 = iPosition2 + iA2;
            int i6 = iPosition3 + iA2;
            if (iA2 == i3) {
                if (i3 < i4) {
                    CoderResult coderResult4 = CoderResult.OVERFLOW;
                    i = i6 - iArrayOffset2;
                    return coderResult4;
                }
                CoderResult coderResult5 = CoderResult.UNDERFLOW;
                i = i6 - iArrayOffset2;
                return coderResult5;
            }
            int iB = this.a.b(cArrArray[i5], cArrArray, i5, iLimit);
            e eVar2 = this.a;
            if (iB < 0) {
                CoderResult coderResult6 = eVar2.a;
                i = i6 - iArrayOffset2;
                return coderResult6;
            }
            if (!eVar2.b) {
                i2 = 1;
            }
            CoderResult coderResultUnmappableForLength2 = CoderResult.unmappableForLength(i2);
            i = i6 - iArrayOffset2;
            return coderResultUnmappableForLength2;
        } finally {
        }
    }

    @Override // java.nio.charset.CharsetEncoder
    public final boolean isLegalReplacement(byte[] bArr) {
        return true;
    }
}
