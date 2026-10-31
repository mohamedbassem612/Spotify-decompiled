package p;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class jd01 extends y6 {
    public final n490 g;
    public final char[] h;
    public int i;
    public final j36 t;

    public jd01(n490 n490Var, char[] cArr, vfa0 vfa0Var) {
        super(vfa0Var);
        this.g = n490Var;
        this.h = cArr;
        this.i = 128;
        this.t = new j36(cArr);
        M(0);
    }

    @Override // p.y6
    public final int D(int i) {
        j36 j36Var = this.t;
        if (i < j36Var.b) {
            return i;
        }
        this.b = i;
        s();
        return (this.b != 0 || j36Var.length() == 0) ? -1 : 0;
    }

    @Override // p.y6
    public int G() {
        int iD;
        char c;
        int i = this.b;
        while (true) {
            iD = D(i);
            if (iD == -1 || !((c = this.t.a[iD]) == ' ' || c == '\n' || c == '\r' || c == '\t')) {
                break;
            }
            i = iD + 1;
        }
        this.b = iD;
        return iD;
    }

    @Override // p.y6
    public final String H(int i, int i2) {
        j36 j36Var = this.t;
        char[] cArr = j36Var.a;
        int iMin = Math.min(i2, j36Var.b);
        eqr0.o(i, iMin, cArr.length);
        return new String(cArr, i, iMin - i);
    }

    public final void M(int i) {
        j36 j36Var = this.t;
        char[] cArr = j36Var.a;
        if (i != 0) {
            int i2 = this.b;
            f46.R(cArr, cArr, 0, i2, i2 + i);
        }
        int i3 = j36Var.b;
        while (i != i3) {
            int iA = this.g.a(cArr, i, i3 - i);
            if (iA == -1) {
                j36Var.b = Math.min(j36Var.a.length, i);
                this.i = -1;
                break;
            }
            i += iA;
        }
        this.b = 0;
    }

    public final void N() {
        kme kmeVar = kme.c;
        char[] cArr = this.h;
        if (cArr.length == 16384) {
            kmeVar.S0(cArr);
            return;
        }
        kmeVar.getClass();
        throw new IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + cArr.length).toString());
    }

    @Override // p.y6
    public final void d(int i, int i2) {
        ((StringBuilder) this.f).append(this.t.a, i, i2 - i);
    }

    @Override // p.y6
    public boolean e() {
        s();
        int i = this.b;
        while (true) {
            int iD = D(i);
            if (iD == -1) {
                this.b = iD;
                return false;
            }
            char c = this.t.a[iD];
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t') {
                this.b = iD;
                return y6.z(c);
            }
            i = iD + 1;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    @Override // p.y6
    public final String h() throws SerializationException {
        k('\"');
        int i = this.b;
        j36 j36Var = this.t;
        int i2 = j36Var.b;
        char[] cArr = j36Var.a;
        int i3 = i;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (cArr[i3] == '\"') {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            int iD = D(i);
            int i4 = this.b;
            if (iD != -1) {
                return o(i4, iD, j36Var);
            }
            int i5 = i4 > 0 ? i4 - 1 : i4;
            y6.v(this, f4i1.f("Expected quotation mark '\"', but had '", (i4 == j36Var.b || i5 < 0) ? "EOF" : String.valueOf(j36Var.a[i5]), "' instead"), i5, null, 4);
            throw null;
        }
        for (int i6 = i; i6 < i3; i6++) {
            if (cArr[i6] == '\\') {
                return o(this.b, i6, j36Var);
            }
        }
        this.b = i3 + 1;
        int iMin = Math.min(i3, j36Var.b);
        eqr0.o(i, iMin, cArr.length);
        return new String(cArr, i, iMin - i);
    }

    @Override // p.y6
    public byte i() {
        s();
        int i = this.b;
        while (true) {
            int iD = D(i);
            if (iD == -1) {
                this.b = iD;
                return (byte) 10;
            }
            int i2 = iD + 1;
            byte bM = cto1.m(this.t.a[iD]);
            if (bM != 3) {
                this.b = i2;
                return bM;
            }
            i = i2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.serialization.SerializationException */
    @Override // p.y6
    public void k(char c) throws SerializationException {
        s();
        int i = this.b;
        while (true) {
            int iD = D(i);
            if (iD == -1) {
                this.b = iD;
                L(c);
                throw null;
            }
            int i2 = iD + 1;
            char c2 = this.t.a[iD];
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t') {
                this.b = i2;
                if (c2 == c) {
                    return;
                }
                L(c);
                throw null;
            }
            i = i2;
        }
    }

    @Override // p.y6
    public final void s() {
        int i = this.t.b - this.b;
        if (i > this.i) {
            return;
        }
        M(i);
    }

    @Override // p.y6
    public final CharSequence y() {
        return this.t;
    }
}
