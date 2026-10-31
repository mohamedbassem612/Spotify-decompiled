package p;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wv71 implements qfa1 {
    public int a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public wv71(xs71 xs71Var) {
        this.d = xs71Var;
        this.e = v8r.q(lbo0.a);
        this.f = new err0(0);
        this.b = 1;
        this.g = new err0(0);
    }

    @Override // p.qfa1
    public void a(int i, int i2) {
        for (int i3 = 0; i3 < ((rfa1) this.h).b * i2; i3++) {
            ((short[]) this.e)[i + i3] = 0;
        }
    }

    @Override // p.qfa1
    public void b(int i, int i2) {
        short[] sArr = (short[]) this.e;
        rfa1 rfa1Var = (rfa1) this.h;
        int i3 = rfa1Var.h / i2;
        int i4 = rfa1Var.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            ((short[]) this.d)[i7] = (short) (i8 / i5);
        }
    }

    @Override // p.qfa1
    public int c(int i, int i2, int i3) {
        return t((short[]) this.e, i, i2, i3);
    }

    @Override // p.qfa1
    public Object d() {
        return (short[]) this.e;
    }

    @Override // p.qfa1
    public void e(int i) {
        this.f = s((short[]) this.f, ((rfa1) this.h).k, i);
    }

    @Override // p.qfa1
    public boolean f() {
        int i = this.a;
        return i != 0 && ((rfa1) this.h).f126p != 0 && this.b <= i * 3 && i * 2 > this.c * 3;
    }

    @Override // p.qfa1
    public void flush() {
        this.c = 0;
        this.a = 0;
        this.b = 0;
    }

    @Override // p.qfa1
    public void g(int i, int i2, int i3, int i4, int i5) {
        short[] sArr = (short[]) this.f;
        short[] sArr2 = (short[]) this.e;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override // p.qfa1
    public void h(int i) {
        this.e = s((short[]) this.e, ((rfa1) this.h).j, i);
    }

    @Override // p.qfa1
    public int i(int i, int i2) {
        return t((short[]) this.d, 0, i, i2);
    }

    @Override // p.qfa1
    public void j(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            rfa1 rfa1Var = (rfa1) this.h;
            int i3 = rfa1Var.b;
            if (i2 >= i3) {
                return;
            }
            short[] sArr = (short[]) this.f;
            int i4 = (rfa1Var.k * i3) + i2;
            short[] sArr2 = (short[]) this.g;
            int i5 = (i * i3) + i2;
            short s = sArr2[i5];
            short s2 = sArr2[i5 + i3];
            long j3 = ((long) rfa1Var.n) * j;
            int i6 = rfa1Var.m;
            long j4 = ((long) (i6 + 1)) * j2;
            long j5 = j4 - j3;
            long j6 = j4 - (((long) i6) * j2);
            sArr[i4] = (short) ((((j6 - j5) * ((long) s2)) + (((long) s) * j5)) / j6);
            i2++;
        }
    }

    @Override // p.qfa1
    public void k() {
        this.c = this.a;
    }

    @Override // p.qfa1
    public Object l() {
        return (short[]) this.f;
    }

    @Override // p.qfa1
    public Object m() {
        return (short[]) this.g;
    }

    @Override // p.qfa1
    public void n(ByteBuffer byteBuffer, int i) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.e;
        rfa1 rfa1Var = (rfa1) this.h;
        shortBufferAsShortBuffer.get(sArr, rfa1Var.j * rfa1Var.b, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // p.qfa1
    public void o(int i) {
        this.g = s((short[]) this.g, ((rfa1) this.h).l, i);
    }

    @Override // p.qfa1
    public int p() {
        return 2;
    }

    @Override // p.qfa1
    public void q(ByteBuffer byteBuffer, int i) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = (short[]) this.f;
        int i2 = ((rfa1) this.h).b;
        shortBufferAsShortBuffer.put(sArr, 0, i * i2);
        byteBuffer.position((i * 2 * i2) + byteBuffer.position());
    }

    public void r(boolean z) {
        err0 err0Var = (err0) this.f;
        xs71 xs71Var = (xs71) this.d;
        if (xs71Var.c().size() > 1 && z) {
            this.b = 2;
            err0Var.t(this.a + 1);
        } else if (!xs71Var.b.c()) {
            y();
        } else if (!z) {
            this.b = 3;
            err0Var.t(this.a + 1);
        }
        w();
    }

    public short[] s(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = ((rfa1) this.h).b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public int t(short[] sArr, int i, int i2, int i3) {
        int i4 = i * ((rfa1) this.h).b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.a = i6 / i7;
        this.b = i8 / i5;
        return i7;
    }

    public boolean u() {
        return this.b == 2;
    }

    public vv71 v() {
        return (vv71) ((hrr0) this.e).getValue();
    }

    public void w() {
        Object obj;
        List listC = ((xs71) this.d).c();
        int size = listC.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = listC.get(i);
            if (((ys71) obj).o()) {
                break;
            } else {
                i++;
            }
        }
        ys71 ys71Var = (ys71) obj;
        if (ys71Var == null && ((yq71) this.h) == null) {
            return;
        }
        if (u890.j(ys71Var != null ? ys71Var.Z : null, (yq71) this.h)) {
            return;
        }
        ((err0) this.g).t(this.c + 1);
    }

    public void x() {
        Object obj;
        Object obj2;
        vv71 vv71VarV;
        err0 err0Var = (err0) this.g;
        xs71 xs71Var = (xs71) this.d;
        err0 err0Var2 = (err0) this.f;
        int i = 0;
        if (err0Var2.s() != this.a) {
            this.a = err0Var2.s();
            int iC = l1d.C(this.b);
            if (iC == 0) {
                vv71VarV = v();
            } else if (iC != 1) {
                vv71VarV = lbo0.a;
                if (iC == 2) {
                    List listC = xs71Var.c();
                    int size = listC.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            vv71VarV = v().h();
                            break;
                        } else if (u890.j(((ys71) listC.get(i2)).Z, (yq71) this.h)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                } else if (iC != 3) {
                    eg.o();
                    return;
                }
            } else {
                vv71VarV = v().g((yq71) this.h);
            }
            ((hrr0) this.e).setValue(vv71VarV);
            this.b = 1;
        }
        if (err0Var.s() != this.c) {
            yq71 yq71Var = null;
            if (xs71Var.b.c()) {
                List listC2 = xs71Var.c();
                int size2 = listC2.size();
                while (true) {
                    if (i >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = listC2.get(i);
                    if (((ys71) obj2).o()) {
                        break;
                    } else {
                        i++;
                    }
                }
                ys71 ys71Var = (ys71) obj2;
                if (ys71Var != null) {
                    yq71Var = ys71Var.Z;
                }
            } else {
                List listB = xs71Var.b();
                int size3 = listB.size();
                while (true) {
                    if (i >= size3) {
                        obj = null;
                        break;
                    }
                    obj = listB.get(i);
                    if (((ys71) obj).o()) {
                        break;
                    } else {
                        i++;
                    }
                }
                ys71 ys71Var2 = (ys71) obj;
                if (ys71Var2 != null) {
                    yq71Var = ys71Var2.Z;
                }
            }
            if (!u890.j(yq71Var, (yq71) this.h)) {
                this.h = yq71Var;
            }
            this.c = err0Var.s();
        }
    }

    public void y() {
        this.b = 1;
        this.a = ((err0) this.f).s();
        ((hrr0) this.e).setValue(lbo0.a);
    }

    public n511 z() {
        x();
        return v().f((xs71) this.d);
    }

    public wv71(rfa1 rfa1Var) {
        this.h = rfa1Var;
        int i = rfa1Var.h;
        this.d = new short[i];
        int i2 = i * rfa1Var.b;
        this.e = new short[i2];
        this.f = new short[i2];
        this.g = new short[i2];
    }
}
