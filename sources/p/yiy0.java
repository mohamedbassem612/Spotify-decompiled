package p;

import kotlinx.serialization.protobuf.internal.ProtobufDecodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yiy0 {
    public final pyp0 a;
    public int b = -1;
    public jiy0 c = jiy0.c;
    public boolean d;
    public int e;

    public yiy0(pyp0 pyp0Var) {
        this.a = pyp0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.protobuf.internal.ProtobufDecodingException */
    public static void a(int i) throws ProtobufDecodingException {
        if (i < 0) {
            throw new ProtobufDecodingException(f4i1.c(i, "Unexpected negative length: "), null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059 A[LOOP:0: B:22:0x003d->B:29:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x004d A[SYNTHETIC] */
    public final int b(uhy0 uhy0Var) {
        int i;
        int i2;
        int iU;
        int iOrdinal = uhy0Var.ordinal();
        pyp0 pyp0Var = this.a;
        if (iOrdinal == 0) {
            return (int) pyp0Var.v(false);
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                return p();
            }
            eg.o();
            return 0;
        }
        int i3 = pyp0Var.c;
        int i4 = pyp0Var.b;
        if (i3 == i4) {
            uh61.j("Unexpected EOF");
            return 0;
        }
        byte[] bArr = (byte[]) pyp0Var.d;
        int i5 = i3 + 1;
        int i6 = bArr[i3];
        if (i6 >= 0) {
            pyp0Var.c = i5;
        } else {
            if (i4 - i3 <= 1) {
                i2 = 0;
                for (i = 0; i < 32; i += 7) {
                    iU = pyp0Var.u();
                    i2 |= (iU & 127) << i;
                    if ((iU & 128) == 0) {
                        i6 = i2;
                    }
                }
                uh61.j("Input stream is malformed: Varint too long (exceeded 32 bits)");
                return 0;
            }
            int i7 = i3 + 2;
            int i8 = (bArr[i5] << 7) ^ i6;
            if (i8 >= 0) {
                i2 = 0;
                while (i < 32) {
                    iU = pyp0Var.u();
                    i2 |= (iU & 127) << i;
                    if ((iU & 128) == 0) {
                        i6 = i2;
                    }
                }
                uh61.j("Input stream is malformed: Varint too long (exceeded 32 bits)");
                return 0;
            }
            pyp0Var.c = i7;
            i6 = (i8 == true ? 1 : 0) ^ (-128);
        }
        return (((((i6 << 31) >> 31) ^ i6) == true ? 1 : 0) >> 1) ^ (Integer.MIN_VALUE & i6);
    }

    public final long c(uhy0 uhy0Var) {
        int iOrdinal = uhy0Var.ordinal();
        pyp0 pyp0Var = this.a;
        if (iOrdinal == 0) {
            return pyp0Var.v(false);
        }
        if (iOrdinal == 1) {
            long jV = pyp0Var.v(false);
            return (jV & Long.MIN_VALUE) ^ ((((jV << 63) >> 63) ^ jV) >> 1);
        }
        if (iOrdinal == 2) {
            return r();
        }
        eg.o();
        return 0L;
    }

    public final boolean d() {
        if (this.d) {
            return false;
        }
        pyp0 pyp0Var = this.a;
        return pyp0Var.b - pyp0Var.c == 0;
    }

    public final pyp0 e() {
        jiy0 jiy0Var = jiy0.f;
        if (this.c == jiy0Var) {
            return f();
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(jiy0Var);
        nkx0.k(this.c, sb);
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.protobuf.internal.ProtobufDecodingException */
    public final pyp0 f() throws ProtobufDecodingException {
        int iB = b(uhy0.b);
        a(iB);
        pyp0 pyp0Var = this.a;
        pyp0Var.p(iB);
        byte[] bArr = (byte[]) pyp0Var.d;
        int i = pyp0Var.c;
        pyp0 pyp0Var2 = new pyp0(bArr, i + iB);
        pyp0Var2.c = i;
        pyp0Var.c += iB;
        return pyp0Var2;
    }

    public final void g() {
        this.d = true;
        int i = (this.b << 3) | this.c.a;
        x(this.e);
        this.e = i;
    }

    public final byte[] h() {
        jiy0 jiy0Var = jiy0.f;
        if (this.c == jiy0Var) {
            return i();
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(jiy0Var);
        nkx0.k(this.c, sb);
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.protobuf.internal.ProtobufDecodingException */
    public final byte[] i() throws ProtobufDecodingException {
        int iB = b(uhy0.b);
        a(iB);
        pyp0 pyp0Var = this.a;
        pyp0Var.p(iB);
        byte[] bArr = new byte[iB];
        int i = pyp0Var.b;
        int i2 = pyp0Var.c;
        int i3 = i - i2;
        if (i3 < iB) {
            iB = i3;
        }
        f46.O(0, i2, i2 + iB, (byte[]) pyp0Var.d, bArr);
        pyp0Var.c += iB;
        return bArr;
    }

    public final double j() {
        jiy0 jiy0Var = jiy0.e;
        if (this.c == jiy0Var) {
            return Double.longBitsToDouble(r());
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(jiy0Var);
        nkx0.k(this.c, sb);
        return 0.0d;
    }

    public final double k() {
        return Double.longBitsToDouble(r());
    }

    public final float l() {
        jiy0 jiy0Var = jiy0.g;
        if (this.c == jiy0Var) {
            return Float.intBitsToFloat(p());
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(jiy0Var);
        nkx0.k(this.c, sb);
        return 0.0f;
    }

    public final float m() {
        return Float.intBitsToFloat(p());
    }

    public final int n(uhy0 uhy0Var) {
        jiy0 jiy0Var = uhy0Var == uhy0.d ? jiy0.g : jiy0.d;
        if (this.c == jiy0Var) {
            return b(uhy0Var);
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(jiy0Var);
        nkx0.k(this.c, sb);
        return 0;
    }

    public final int o() {
        return b(uhy0.b);
    }

    public final int p() {
        int iU = 0;
        for (int i = 0; i < 4; i++) {
            iU |= (this.a.u() & 255) << (i * 8);
        }
        return iU;
    }

    public final long q(uhy0 uhy0Var) {
        jiy0 jiy0Var = uhy0Var == uhy0.d ? jiy0.e : jiy0.d;
        if (this.c == jiy0Var) {
            return c(uhy0Var);
        }
        StringBuilder sb = new StringBuilder("Expected wire type ");
        sb.append(jiy0Var);
        nkx0.k(this.c, sb);
        return 0L;
    }

    public final long r() {
        long jU = 0;
        for (int i = 0; i < 8; i++) {
            jU |= ((long) (this.a.u() & 255)) << (i * 8);
        }
        return jU;
    }

    public final long s() {
        return c(uhy0.b);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.protobuf.internal.ProtobufDecodingException */
    public final String t() throws ProtobufDecodingException {
        jiy0 jiy0Var = jiy0.f;
        if (this.c != jiy0Var) {
            StringBuilder sb = new StringBuilder("Expected wire type ");
            sb.append(jiy0Var);
            nkx0.k(this.c, sb);
            return null;
        }
        int iB = b(uhy0.b);
        a(iB);
        pyp0 pyp0Var = this.a;
        byte[] bArr = (byte[]) pyp0Var.d;
        int i = pyp0Var.c;
        String strQ = nhc1.Q(i, bArr, i + iB, 4);
        pyp0Var.c += iB;
        return strQ;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.protobuf.internal.ProtobufDecodingException */
    public final String u() throws ProtobufDecodingException {
        int iB = b(uhy0.b);
        a(iB);
        pyp0 pyp0Var = this.a;
        byte[] bArr = (byte[]) pyp0Var.d;
        int i = pyp0Var.c;
        String strQ = nhc1.Q(i, bArr, i + iB, 4);
        pyp0Var.c += iB;
        return strQ;
    }

    public final int v() {
        if (!this.d) {
            this.e = (this.b << 3) | this.c.a;
            return x((int) this.a.v(true));
        }
        this.d = false;
        int i = (this.b << 3) | this.c.a;
        int iX = x(this.e);
        this.e = i;
        return iX;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.protobuf.internal.ProtobufDecodingException */
    public final void w() throws ProtobufDecodingException {
        int iOrdinal = this.c.ordinal();
        uhy0 uhy0Var = uhy0.b;
        if (iOrdinal == 1) {
            n(uhy0Var);
            return;
        }
        uhy0 uhy0Var2 = uhy0.d;
        if (iOrdinal == 2) {
            q(uhy0Var2);
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                n(uhy0Var2);
                return;
            }
            throw new ProtobufDecodingException("Unsupported start group or end group wire type: " + this.c, null);
        }
        jiy0 jiy0Var = jiy0.f;
        if (this.c != jiy0Var) {
            StringBuilder sb = new StringBuilder("Expected wire type ");
            sb.append(jiy0Var);
            nkx0.k(this.c, sb);
        } else {
            int iB = b(uhy0Var);
            a(iB);
            pyp0 pyp0Var = this.a;
            pyp0Var.p(iB);
            pyp0Var.c += iB;
        }
    }

    public final int x(int i) {
        if (i == -1) {
            this.b = -1;
            this.c = jiy0.c;
            return -1;
        }
        int i2 = i >>> 3;
        this.b = i2;
        jiy0[] jiy0VarArr = jiy0.b;
        this.c = jiy0.b[i & 7];
        return i2;
    }
}
