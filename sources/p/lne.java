package p;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lne {
    public boolean a;
    public char b;
    public final Object c;
    public final Object d;
    public final Object e;

    public lne(FileInputStream fileInputStream, Charset charset) {
        this.c = fileInputStream;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.d = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(lgc.c.A(8196));
        this.e = byteBufferWrap;
        byteBufferWrap.flip();
    }

    public c9d0 a() {
        return (c9d0) ((dbm) this.c).b;
    }

    public pl10[] b() {
        return (pl10[]) this.d;
    }

    public int c(char[] cArr, int i, int i2) throws CharacterCodingException {
        int i3;
        char c;
        char c2;
        char c3;
        char c4;
        if (i2 == 0) {
            return 0;
        }
        if (i < 0 || i >= cArr.length || i2 < 0 || i + i2 > cArr.length) {
            t8e1.l(cArr.length, cy30.q(i, i2, "Unexpected arguments: ", ", ", ", "));
            return 0;
        }
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            cArr[i] = this.b;
            i++;
            i2--;
            this.a = false;
            if (i2 == 0) {
                return 1;
            }
            z = false;
            i3 = 1;
        } else {
            i3 = 0;
        }
        if (i2 == 1) {
            if (z) {
                this.a = false;
                c4 = this.b;
            } else {
                char[] cArr2 = new char[2];
                int iC = c(cArr2, 0, 2);
                if (iC == -1) {
                    c = 65535;
                } else if (iC == 1) {
                    c2 = cArr2[0];
                } else {
                    if (iC != 2) {
                        bhn0.x(iC, "Unreachable state: ");
                        return 0;
                    }
                    this.b = cArr2[1];
                    this.a = true;
                    c3 = cArr2[0];
                }
            }
            if (c != 65535) {
                c = c2;
                c = c3;
                c = c4;
                cArr[i] = c;
                return i3 + 1;
            }
            if (i3 == 0) {
                return -1;
            }
            return i3;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.e;
        CharsetDecoder charsetDecoder = (CharsetDecoder) this.d;
        CharBuffer charBufferWrap = CharBuffer.wrap(cArr, i, i2);
        if (charBufferWrap.position() != 0) {
            charBufferWrap = charBufferWrap.slice();
        }
        CharBuffer charBuffer = charBufferWrap;
        boolean z3 = false;
        while (true) {
            CoderResult coderResultDecode = charsetDecoder.decode(byteBuffer, charBuffer, z3);
            if (coderResultDecode.isUnderflow()) {
                if (z3 || !charBuffer.hasRemaining()) {
                    z2 = z3;
                    break;
                }
                byteBuffer.compact();
                try {
                    int iLimit = byteBuffer.limit();
                    int iPosition = byteBuffer.position();
                    int iRemaining = ((FileInputStream) this.c).read(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, iPosition <= iLimit ? iLimit - iPosition : 0);
                    if (iRemaining < 0) {
                        byteBuffer.flip();
                    } else {
                        byteBuffer.position(iPosition + iRemaining);
                        byteBuffer.flip();
                        iRemaining = byteBuffer.remaining();
                    }
                    if (iRemaining < 0) {
                        if (charBuffer.position() == 0 && !byteBuffer.hasRemaining()) {
                            break;
                        }
                        charsetDecoder.reset();
                        z3 = true;
                    } else {
                        continue;
                    }
                } catch (Throwable th) {
                    byteBuffer.flip();
                    throw th;
                }
            } else {
                if (coderResultDecode.isOverflow()) {
                    charBuffer.position();
                    z2 = z3;
                    break;
                }
                coderResultDecode.throwException();
            }
        }
        if (z2) {
            charsetDecoder.reset();
        }
        return (charBuffer.position() != 0 ? charBuffer.position() : -1) + i3;
    }

    public void d(px40 px40Var, bsd1 bsd1Var) {
        ((nf11) this.e).a.accept(px40Var, bsd1Var);
    }

    public int e() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lne(nf11 nf11Var, dbm dbmVar, pl10[] pl10VarArr, boolean z, int i) {
        this.e = nf11Var;
        this.c = dbmVar;
        this.d = pl10VarArr;
        this.a = z;
        this.b = i;
    }
}
