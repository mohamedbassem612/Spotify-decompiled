package p;

import android.util.Pair;
import androidx.media3.common.ParserException;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cdl1 implements ec10 {
    public gc10 a;
    public gtf1 b;
    public adl1 e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    @Override // p.ec10
    public final void a(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        adl1 adl1Var = this.e;
        if (adl1Var != null) {
            adl1Var.c(j2);
        }
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        this.a = gc10Var;
        this.b = gc10Var.w(0, 1);
        gc10Var.s();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:67:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x0202  */
    /* JADX WARN: Code duplicated, block: B:80:0x020b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0214  */
    /* JADX WARN: Code duplicated, block: B:85:0x0226  */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0226, please report this as an issue */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) throws ParserException {
        byte[] bArr;
        int iW;
        w8h w8hVar;
        int I;
        int i;
        this.b.getClass();
        String str = zoi1.a;
        int i2 = this.c;
        if (i2 == 0) {
            dm5.y(fc10Var.getPosition() == 0);
            int i3 = this.f;
            if (i3 != -1) {
                fc10Var.u(i3);
                this.c = 4;
                return 0;
            }
            if (!loo1.s(fc10Var)) {
                throw ParserException.a((RuntimeException) null, "Unsupported or unrecognized wav file type.");
            }
            fc10Var.u((int) (fc10Var.j() - fc10Var.getPosition()));
            this.c = 1;
            return 0;
        }
        long jT = -1;
        if (i2 == 1) {
            izr0 izr0Var = new izr0(8);
            o4t o4tVarF = o4t.f(fc10Var, izr0Var);
            if (o4tVarF.a != 1685272116) {
                fc10Var.f();
            } else {
                fc10Var.k(8);
                izr0Var.R(0);
                fc10Var.h(0, izr0Var.a, 8);
                jT = izr0Var.t();
                fc10Var.u(((int) o4tVarF.b) + 8);
            }
            this.d = jT;
            this.c = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    bhn0.w();
                    return 0;
                }
                dm5.y(this.g != -1);
                long position = this.g - fc10Var.getPosition();
                adl1 adl1Var = this.e;
                adl1Var.getClass();
                return adl1Var.b(fc10Var, position) ? -1 : 0;
            }
            fc10Var.f();
            o4t o4tVarA = loo1.A(1684108385, fc10Var, new izr0(8));
            fc10Var.u(8);
            Pair pairCreate = Pair.create(Long.valueOf(fc10Var.getPosition()), Long.valueOf(o4tVarA.b));
            this.f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j = this.d;
            if (j != -1 && jLongValue == 4294967295L) {
                jLongValue = j;
            }
            this.g = ((long) this.f) + jLongValue;
            long length = fc10Var.getLength();
            if (length != -1 && this.g > length) {
                oon1.H("Data exceeds input length: " + this.g + ", " + length);
                this.g = length;
            }
            adl1 adl1Var2 = this.e;
            adl1Var2.getClass();
            adl1Var2.a(this.f, this.g);
            this.c = 4;
            return 0;
        }
        izr0 izr0Var2 = new izr0(16);
        long j2 = loo1.A(1718449184, fc10Var, izr0Var2).b;
        dm5.y(j2 >= 16);
        fc10Var.h(0, izr0Var2.a, 16);
        izr0Var2.R(0);
        int iX = izr0Var2.x();
        int iX2 = izr0Var2.x();
        int iW2 = izr0Var2.w();
        izr0Var2.w();
        int iX3 = izr0Var2.x();
        int iX4 = izr0Var2.x();
        int i4 = ((int) j2) - 16;
        if (i4 > 0) {
            bArr = new byte[i4];
            fc10Var.h(0, bArr, i4);
            if (iX == 65534 && i4 == 24) {
                izr0 izr0Var3 = new izr0(bArr);
                izr0Var3.x();
                int iX5 = izr0Var3.x();
                if (iX5 != 0 && iX5 != iX4) {
                    throw ParserException.d("validBits ( " + iX5 + ")  != bitsPerSample( " + iX4 + ") are not supported");
                }
                iW = izr0Var3.w();
                if ((iW >> 18) != 0 || (iW != 0 && Integer.bitCount(iW) != iX2)) {
                    throw ParserException.d("Channel mask " + iW + " is invalid or does not match channel count " + iX2);
                }
                int iX6 = izr0Var3.x();
                byte[] bArr2 = new byte[14];
                izr0Var3.o(0, bArr2, 14);
                if (!Arrays.equals(bArr2, loo1.a) && !Arrays.equals(bArr2, loo1.b)) {
                    throw ParserException.d("invalid wav format extension guid");
                }
                iX = iX6;
            }
            fc10Var.u((int) (fc10Var.j() - fc10Var.getPosition()));
            w8hVar = new w8h();
            w8hVar.a = iX2;
            w8hVar.b = iW2;
            w8hVar.c = iX3;
            w8hVar.d = iX4;
            w8hVar.e = bArr;
            w8hVar.f = iW;
            if (iX == 17) {
                this.e = new zcl1(this.a, this.b, w8hVar);
            } else if (iX == 6) {
                this.e = new bdl1(this.a, this.b, w8hVar, "audio/g711-alaw", -1);
            } else if (iX == 7) {
                this.e = new bdl1(this.a, this.b, w8hVar, "audio/g711-mlaw", -1);
            } else {
                if (iX == 1) {
                    I = zoi1.I(iX4, ByteOrder.LITTLE_ENDIAN);
                    i = I;
                } else if (iX != 3) {
                    I = zoi1.G(iX4, ByteOrder.LITTLE_ENDIAN);
                    i = I;
                } else if (iX != 65534) {
                    i = 0;
                } else {
                    I = zoi1.I(iX4, ByteOrder.LITTLE_ENDIAN);
                    i = I;
                }
                if (i != 0) {
                    throw ParserException.d("Unsupported WAV format type: " + iX);
                }
                this.e = new bdl1(this.a, this.b, w8hVar, "audio/raw", i);
            }
            this.c = 3;
            return 0;
        }
        bArr = zoi1.b;
        iW = 0;
        fc10Var.u((int) (fc10Var.j() - fc10Var.getPosition()));
        w8hVar = new w8h();
        w8hVar.a = iX2;
        w8hVar.b = iW2;
        w8hVar.c = iX3;
        w8hVar.d = iX4;
        w8hVar.e = bArr;
        w8hVar.f = iW;
        if (iX == 17) {
            this.e = new zcl1(this.a, this.b, w8hVar);
        } else if (iX == 6) {
            this.e = new bdl1(this.a, this.b, w8hVar, "audio/g711-alaw", -1);
        } else if (iX == 7) {
            this.e = new bdl1(this.a, this.b, w8hVar, "audio/g711-mlaw", -1);
        } else {
            if (iX == 1) {
                I = zoi1.I(iX4, ByteOrder.LITTLE_ENDIAN);
                i = I;
            } else if (iX != 3) {
                I = zoi1.G(iX4, ByteOrder.LITTLE_ENDIAN);
                i = I;
            } else if (iX != 65534) {
                i = 0;
            } else {
                I = zoi1.I(iX4, ByteOrder.LITTLE_ENDIAN);
                i = I;
            }
            if (i != 0) {
                throw ParserException.d("Unsupported WAV format type: " + iX);
            }
            this.e = new bdl1(this.a, this.b, w8hVar, "audio/raw", i);
        }
        this.c = 3;
        return 0;
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) {
        return loo1.s(fc10Var);
    }

    @Override // p.ec10
    public final void release() {
    }
}
