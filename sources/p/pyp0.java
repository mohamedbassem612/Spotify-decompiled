package p;

import android.graphics.Canvas;
import android.graphics.Rect;
import app.p000rive.semantics.SemanticState;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pyp0 implements a2c, f4b1, hyp0, hui1 {
    public static final byte[] e = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    public static final byte[] f = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public Object d;

    public pyp0(npm0 npm0Var, ie30 ie30Var) {
        this.a = (byte) 1;
        izr0 izr0Var = npm0Var.e;
        this.d = izr0Var;
        izr0Var.R(12);
        int I = izr0Var.I();
        if ("audio/raw".equals(ie30Var.f66p)) {
            int iZ = zoi1.z(ie30Var.M) * ie30Var.J;
            if (I % iZ != 0) {
                oon1.H("Audio sample size mismatch. stsd sample size: " + iZ + ", stsz sample size: " + I);
                I = iZ;
            }
        }
        this.b = I == 0 ? -1 : I;
        this.c = izr0Var.I();
    }

    public static void z(ByteBuffer byteBuffer, long j, int i, int i2, boolean z) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i);
        byteBuffer.putInt(0);
        byteBuffer.put(o0c.s(i2));
    }

    public int a() {
        int i = this.b;
        return i == -1 ? ((izr0) this.d).I() : i;
    }

    public void c(Canvas canvas) {
        int iSave = canvas.save();
        g4b1 g4b1Var = (g4b1) this.d;
        g4b1Var.getBounds();
        canvas.translate(this.b - g4b1Var.i.left, 0.0f + g4b1Var.k);
        canvas.drawText(g4b1Var.a(), 0, 1, 0.0f, 0.0f, g4b1Var.g);
        canvas.restoreToCount(iSave);
    }

    public int d() {
        return this.b;
    }

    public int f() {
        return this.b;
    }

    public oe5 g(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        return ((hce1) this.d).g(j, oe5Var, oe5Var2, oe5Var3);
    }

    public int h() {
        return this.c;
    }

    public int i(int i) {
        int i2 = ((hyp0) this.d).i(i);
        if (i >= 0 && i <= this.c) {
            qri1.c(i2, this.b, i);
        }
        return i2;
    }

    public int j() {
        return ((g4b1) this.d).i.height();
    }

    public int k() {
        return this.c;
    }

    public int l() {
        Rect rect = ((g4b1) this.d).i;
        return (rect.right - rect.left) + this.b + this.c;
    }

    public oe5 n(long j, oe5 oe5Var, oe5 oe5Var2, oe5 oe5Var3) {
        return ((hce1) this.d).n(j, oe5Var, oe5Var2, oe5Var3);
    }

    public int o(int i) {
        int iO = ((hyp0) this.d).o(i);
        if (i >= 0 && i <= this.b) {
            qri1.b(iO, this.c, i);
        }
        return iO;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public void p(int i) throws SerializationException {
        int i2 = this.b;
        if (i <= i2 - this.c) {
            return;
        }
        throw new SerializationException("Unexpected EOF, available " + (i2 - this.c) + " bytes, requested: " + i);
    }

    public byte q(int i, int i2) {
        return ((byte[][]) this.d)[i2][i];
    }

    public int r() {
        return this.c;
    }

    public Function0 s() {
        return (Function0) this.d;
    }

    public int t() {
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                int i = this.b;
                int i2 = this.c;
                StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.d)[i3];
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b = bArr[i4];
                        if (b == 0) {
                            sb.append(" 0");
                        } else if (b != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public int u() {
        int i = this.c;
        if (i >= this.b) {
            return -1;
        }
        byte[] bArr = (byte[]) this.d;
        this.c = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    public long v(boolean z) throws SerializationException {
        int i = this.c;
        int i2 = this.b;
        if (i == i2) {
            if (z) {
                return -1L;
            }
            uh61.j("Unexpected EOF");
            return 0L;
        }
        byte[] bArr = (byte[]) this.d;
        int i3 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            this.c = i3;
            return j;
        }
        if (i2 - i > 1) {
            int i4 = i + 2;
            long j2 = j ^ (((long) bArr[i3]) << 7);
            if (j2 < 0) {
                this.c = i4;
                return (-128) ^ j2;
            }
        }
        long j3 = 0;
        for (int i5 = 0; i5 < 64; i5 += 7) {
            int iU = u();
            j3 |= ((long) (iU & 127)) << i5;
            if ((iU & SemanticState.Focused) == 0) {
                return j3;
            }
        }
        uh61.j("Input stream is malformed: Varint too long (exceeded 64 bits)");
        return 0L;
    }

    public void w(int i, int i2, int i3) {
        ((byte[][]) this.d)[i2][i] = (byte) i3;
    }

    public void x(int i, int i2, boolean z) {
        ((byte[][]) this.d)[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public void y(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ pyp0(int i, int i2, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = obj;
    }

    public /* synthetic */ pyp0(Object obj, int i, int i2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pyp0(byte[] bArr) {
        this(bArr, bArr.length);
        this.a = (byte) 2;
    }

    public pyp0(byte[] bArr, int i) {
        this.a = (byte) 2;
        this.d = bArr;
        this.b = i;
    }

    public pyp0(int i, int i2) {
        this.a = (byte) 3;
        this.d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.b = i;
        this.c = i2;
    }

    public pyp0(g4b1 g4b1Var) {
        this.a = (byte) 8;
        this.d = g4b1Var;
    }

    public pyp0(int i, int i2, dlv dlvVar) {
        this.a = (byte) 12;
        this.b = i;
        this.c = i2;
        this.d = new hce1(new hr20(i, i2, dlvVar));
    }
}
