package p;

import java.io.EOFException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class nha0 extends eha0 {
    public static final rhc N0;
    public static final rhc Y;
    public static final rhc Z;
    public String X;
    public final ff01 f;
    public final nac g;
    public int h;
    public long i;
    public int t;

    static {
        rhc rhcVar = new rhc(ryn1.m("'\\"));
        rhcVar.c = "'\\";
        Y = rhcVar;
        rhc rhcVar2 = new rhc(ryn1.m("\"\\"));
        rhcVar2.c = "\"\\";
        Z = rhcVar2;
        rhc rhcVar3 = new rhc(ryn1.m("{}[]:, \n\t\r\f/\\;#="));
        rhcVar3.c = "{}[]:, \n\t\r\f/\\;#=";
        N0 = rhcVar3;
        ryn1.m("\n\r");
        ryn1.m("*/");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    public nha0(ff01 ff01Var) throws meh {
        this.b = new int[32];
        this.c = new String[32];
        this.d = new int[32];
        this.h = 0;
        this.f = ff01Var;
        this.g = ff01Var.b;
        p(6);
    }

    public final int A(String str, ye90 ye90Var) {
        int length = ((String[]) ye90Var.b).length;
        for (int i = 0; i < length; i++) {
            if (str.equals(((String[]) ye90Var.b)[i])) {
                this.h = 0;
                this.c[this.a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    public final boolean C(int i) throws kga0 {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        y();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    public final String D() throws kga0, meh, EOFException {
        String strF;
        int iZ = this.h;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 14) {
            strF = G();
        } else if (iZ == 13) {
            strF = F(Z);
        } else if (iZ == 12) {
            strF = F(Y);
        } else {
            if (iZ != 15) {
                k220.j("Expected a name but was ", cy30.z(o()), f());
                return null;
            }
            strF = this.X;
        }
        this.h = 0;
        this.c[this.a - 1] = strF;
        return strF;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    public final int E(boolean z) throws kga0, EOFException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            ff01 ff01Var = this.f;
            if (!ff01Var.request(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            long j = i;
            nac nacVar = this.g;
            byte bG = nacVar.g(j);
            if (bG != 10 && bG != 32 && bG != 13 && bG != 9) {
                nacVar.skip(j);
                if (bG == 47) {
                    if (ff01Var.request(2L)) {
                        y();
                        throw null;
                    }
                } else if (bG == 35) {
                    y();
                    throw null;
                }
                return bG;
            }
            i = i2;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    public final String F(rhc rhcVar) throws kga0 {
        StringBuilder sb = null;
        while (true) {
            long jC = this.f.c(rhcVar);
            if (jC == -1) {
                w("Unterminated string");
                throw null;
            }
            nac nacVar = this.g;
            if (nacVar.g(jC) != 92) {
                if (sb == null) {
                    String strG = nacVar.G(jC, nne.a);
                    nacVar.u();
                    return strG;
                }
                sb.append(nacVar.G(jC, nne.a));
                nacVar.u();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(nacVar.G(jC, nne.a));
            nacVar.u();
            sb.append(I());
        }
    }

    public final String G() {
        long jC = this.f.c(N0);
        nac nacVar = this.g;
        if (jC == -1) {
            return nacVar.I();
        }
        nacVar.getClass();
        return nacVar.G(jC, nne.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    public final char I() throws kga0, EOFException {
        int i;
        ff01 ff01Var = this.f;
        if (!ff01Var.request(1L)) {
            w("Unterminated escape sequence");
            throw null;
        }
        nac nacVar = this.g;
        byte bU = nacVar.u();
        if (bU == 10 || bU == 34 || bU == 39 || bU == 47 || bU == 92) {
            return (char) bU;
        }
        if (bU == 98) {
            return '\b';
        }
        if (bU == 102) {
            return '\f';
        }
        if (bU == 110) {
            return '\n';
        }
        if (bU == 114) {
            return '\r';
        }
        if (bU == 116) {
            return '\t';
        }
        if (bU != 117) {
            w("Invalid escape sequence: \\" + ((char) bU));
            throw null;
        }
        if (!ff01Var.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path ".concat(f()));
        }
        char c = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            byte bG = nacVar.g(i2);
            char c2 = (char) (c << 4);
            if (bG >= 48 && bG <= 57) {
                i = bG - 48;
            } else if (bG >= 97 && bG <= 102) {
                i = bG - 87;
            } else {
                if (bG < 65 || bG > 70) {
                    w("\\u".concat(nacVar.G(4L, nne.a)));
                    throw null;
                }
                i = bG - 55;
            }
            c = (char) (i + c2);
        }
        nacVar.skip(4L);
        return c;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    public final void J(rhc rhcVar) throws kga0, EOFException {
        while (true) {
            long jC = this.f.c(rhcVar);
            if (jC == -1) {
                w("Unterminated string");
                throw null;
            }
            nac nacVar = this.g;
            if (nacVar.g(jC) != 92) {
                nacVar.skip(jC + 1);
                return;
            } else {
                nacVar.skip(jC + 1);
                I();
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    @Override // p.eha0
    public final void a() throws kga0, meh, EOFException {
        int iZ = this.h;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ != 3) {
            k220.j("Expected BEGIN_ARRAY but was ", cy30.z(o()), f());
            return;
        }
        p(1);
        this.d[this.a - 1] = 0;
        this.h = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    @Override // p.eha0
    public final void c() throws kga0, meh, EOFException {
        int iZ = this.h;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ != 1) {
            k220.j("Expected BEGIN_OBJECT but was ", cy30.z(o()), f());
        } else {
            p(3);
            this.h = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.h = 0;
        this.b[0] = 8;
        this.a = 1;
        this.g.a();
        this.f.close();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    @Override // p.eha0
    public final void d() throws kga0, meh, EOFException {
        int iZ = this.h;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ != 4) {
            k220.j("Expected END_ARRAY but was ", cy30.z(o()), f());
            return;
        }
        int i = this.a;
        this.a = i - 1;
        int[] iArr = this.d;
        int i2 = i - 2;
        iArr[i2] = iArr[i2] + 1;
        this.h = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    @Override // p.eha0
    public final void e() throws kga0, meh, EOFException {
        int iZ = this.h;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ != 2) {
            k220.j("Expected END_OBJECT but was ", cy30.z(o()), f());
            return;
        }
        int i = this.a;
        int i2 = i - 1;
        this.a = i2;
        this.c[i2] = null;
        int[] iArr = this.d;
        int i3 = i - 2;
        iArr[i3] = iArr[i3] + 1;
        this.h = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    @Override // p.eha0
    public final boolean g() throws kga0, EOFException {
        int iZ = this.h;
        if (iZ == 0) {
            iZ = z();
        }
        return (iZ == 2 || iZ == 4 || iZ == 18) ? false : true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    @Override // p.eha0
    public final boolean h() throws kga0, meh, EOFException {
        int iZ = this.h;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 5) {
            this.h = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iZ != 6) {
            k220.j("Expected a boolean but was ", cy30.z(o()), f());
            return false;
        }
        this.h = 0;
        int[] iArr2 = this.d;
        int i2 = this.a - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    @Override // p.eha0
    public final double i() throws kga0, meh, EOFException {
        int iZ = this.h;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 16) {
            this.h = 0;
            int[] iArr = this.d;
            int i = this.a - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iZ == 17) {
            long j = this.t;
            nac nacVar = this.g;
            nacVar.getClass();
            this.X = nacVar.G(j, nne.a);
        } else if (iZ == 9) {
            this.X = F(Z);
        } else if (iZ == 8) {
            this.X = F(Y);
        } else if (iZ == 10) {
            this.X = G();
        } else if (iZ != 11) {
            k220.j("Expected a double but was ", cy30.z(o()), f());
            return 0.0d;
        }
        this.h = 11;
        try {
            double d = Double.parseDouble(this.X);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new kga0("JSON forbids NaN and infinities: " + d + " at path " + f());
            }
            this.X = null;
            this.h = 0;
            int[] iArr2 = this.d;
            int i2 = this.a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            k220.j("Expected a double but was ", this.X, f());
            return 0.0d;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    @Override // p.eha0
    public final int j() throws kga0, meh, EOFException {
        int iZ = this.h;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 16) {
            long j = this.i;
            int i = (int) j;
            if (j == i) {
                this.h = 0;
                int[] iArr = this.d;
                int i2 = this.a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new meh("Expected an int but was " + this.i + " at path " + f());
        }
        if (iZ == 17) {
            long j2 = this.t;
            nac nacVar = this.g;
            nacVar.getClass();
            this.X = nacVar.G(j2, nne.a);
        } else if (iZ == 9 || iZ == 8) {
            String strF = iZ == 9 ? F(Z) : F(Y);
            this.X = strF;
            try {
                int i3 = Integer.parseInt(strF);
                this.h = 0;
                int[] iArr2 = this.d;
                int i4 = this.a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iZ != 11) {
            k220.j("Expected an int but was ", cy30.z(o()), f());
            return 0;
        }
        this.h = 11;
        try {
            double d = Double.parseDouble(this.X);
            int i5 = (int) d;
            if (i5 != d) {
                k220.j("Expected an int but was ", this.X, f());
                return 0;
            }
            this.X = null;
            this.h = 0;
            int[] iArr3 = this.d;
            int i6 = this.a - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            k220.j("Expected an int but was ", this.X, f());
            return 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    @Override // p.eha0
    public final String m() throws kga0, meh, EOFException {
        String strG;
        int iZ = this.h;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 10) {
            strG = G();
        } else if (iZ == 9) {
            strG = F(Z);
        } else if (iZ == 8) {
            strG = F(Y);
        } else if (iZ == 11) {
            strG = this.X;
            this.X = null;
        } else if (iZ == 16) {
            strG = Long.toString(this.i);
        } else {
            if (iZ != 17) {
                k220.j("Expected a string but was ", cy30.z(o()), f());
                return null;
            }
            long j = this.t;
            nac nacVar = this.g;
            nacVar.getClass();
            strG = nacVar.G(j, nne.a);
        }
        this.h = 0;
        int[] iArr = this.d;
        int i = this.a - 1;
        iArr[i] = iArr[i] + 1;
        return strG;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    @Override // p.eha0
    public final int o() throws kga0, EOFException {
        int iZ = this.h;
        if (iZ == 0) {
            iZ = z();
        }
        switch (iZ) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                hhg1.c();
                return 0;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    @Override // p.eha0
    public final int q(ye90 ye90Var) throws kga0, meh, EOFException {
        int iZ = this.h;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ < 12 || iZ > 15) {
            return -1;
        }
        if (iZ == 15) {
            return A(this.X, ye90Var);
        }
        int iS0 = this.f.s0((cqq0) ye90Var.c);
        if (iS0 != -1) {
            this.h = 0;
            this.c[this.a - 1] = ((String[]) ye90Var.b)[iS0];
            return iS0;
        }
        String str = this.c[this.a - 1];
        String strD = D();
        int iA = A(strD, ye90Var);
        if (iA == -1) {
            this.h = 15;
            this.X = strD;
            this.c[this.a - 1] = str;
        }
        return iA;
    }

    public final String toString() {
        return "JsonReader(" + this.f + ")";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    @Override // p.eha0
    public final void u() throws kga0, meh, EOFException {
        int iZ = this.h;
        if (iZ == 0) {
            iZ = z();
        }
        if (iZ == 14) {
            long jC = this.f.c(N0);
            nac nacVar = this.g;
            if (jC == -1) {
                jC = nacVar.b;
            }
            nacVar.skip(jC);
        } else if (iZ == 13) {
            J(Z);
        } else if (iZ == 12) {
            J(Y);
        } else if (iZ != 15) {
            k220.j("Expected a name but was ", cy30.z(o()), f());
            return;
        }
        this.h = 0;
        this.c[this.a - 1] = "null";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.meh */
    @Override // p.eha0
    public final void v() throws kga0, meh, EOFException {
        int i = 0;
        do {
            int iZ = this.h;
            if (iZ == 0) {
                iZ = z();
            }
            if (iZ == 3) {
                p(1);
            } else {
                if (iZ == 1) {
                    p(3);
                } else if (iZ == 4) {
                    i--;
                    if (i < 0) {
                        k220.j("Expected a value but was ", cy30.z(o()), f());
                        return;
                    }
                    this.a--;
                } else if (iZ == 2) {
                    i--;
                    if (i < 0) {
                        k220.j("Expected a value but was ", cy30.z(o()), f());
                        return;
                    }
                    this.a--;
                } else {
                    nac nacVar = this.g;
                    if (iZ == 14 || iZ == 10) {
                        long jC = this.f.c(N0);
                        if (jC == -1) {
                            jC = nacVar.b;
                        }
                        nacVar.skip(jC);
                    } else if (iZ == 9 || iZ == 13) {
                        J(Z);
                    } else if (iZ == 8 || iZ == 12) {
                        J(Y);
                    } else if (iZ == 17) {
                        nacVar.skip(this.t);
                    } else if (iZ == 18) {
                        k220.j("Expected a value but was ", cy30.z(o()), f());
                        return;
                    }
                }
                this.h = 0;
            }
            i++;
            this.h = 0;
        } while (i != 0);
        int[] iArr = this.d;
        int i2 = this.a - 1;
        iArr[i2] = iArr[i2] + 1;
        this.c[i2] = "null";
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    public final void y() throws kga0 {
        w("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.kga0 */
    /* JADX WARN: Code duplicated, block: B:148:0x01c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:164:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:167:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:172:0x01fa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:173:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:175:0x0207  */
    /* JADX WARN: Code duplicated, block: B:177:0x020d  */
    /* JADX WARN: Code duplicated, block: B:230:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0120  */
    /* JADX WARN: Code duplicated, block: B:92:0x0132  */
    /* JADX WARN: Code duplicated, block: B:94:0x013b  */
    public final int z() throws kga0, EOFException {
        String str;
        String str2;
        int i;
        long j;
        char cG;
        int i2;
        int i3;
        int i4;
        int i5;
        byte bG;
        int i6;
        int[] iArr = this.b;
        int i7 = this.a - 1;
        int i8 = iArr[i7];
        int i9 = 0;
        nac nacVar = this.g;
        if (i8 == 1) {
            iArr[i7] = 2;
        } else if (i8 == 2) {
            int iE = E(true);
            nacVar.u();
            if (iE != 44) {
                if (iE == 59) {
                    y();
                    throw null;
                }
                if (iE == 93) {
                    this.h = 4;
                    return 4;
                }
                w("Unterminated array");
                throw null;
            }
        } else {
            if (i8 == 3 || i8 == 5) {
                iArr[i7] = 4;
                if (i8 == 5) {
                    int iE2 = E(true);
                    nacVar.u();
                    if (iE2 != 44) {
                        if (iE2 == 59) {
                            y();
                            throw null;
                        }
                        if (iE2 == 125) {
                            this.h = 2;
                            return 2;
                        }
                        w("Unterminated object");
                        throw null;
                    }
                }
                int iE3 = E(true);
                if (iE3 == 34) {
                    nacVar.u();
                    this.h = 13;
                    return 13;
                }
                if (iE3 == 39) {
                    nacVar.u();
                    y();
                    throw null;
                }
                if (iE3 != 125) {
                    y();
                    throw null;
                }
                if (i8 == 5) {
                    w("Expected name");
                    throw null;
                }
                nacVar.u();
                this.h = 2;
                return 2;
            }
            if (i8 == 4) {
                iArr[i7] = 5;
                int iE4 = E(true);
                nacVar.u();
                if (iE4 != 58) {
                    if (iE4 != 61) {
                        w("Expected ':'");
                        throw null;
                    }
                    y();
                    throw null;
                }
            } else if (i8 == 6) {
                iArr[i7] = 7;
            } else {
                if (i8 == 7) {
                    if (E(false) == -1) {
                        this.h = 18;
                        return 18;
                    }
                    y();
                    throw null;
                }
                if (i8 == 8) {
                    eg.m("JsonReader is closed");
                    return 0;
                }
            }
        }
        int iE5 = E(true);
        if (iE5 == 34) {
            nacVar.u();
            this.h = 9;
            return 9;
        }
        if (iE5 == 39) {
            y();
            throw null;
        }
        if (iE5 != 44 && iE5 != 59) {
            if (iE5 == 91) {
                nacVar.u();
                this.h = 3;
                return 3;
            }
            if (iE5 != 93) {
                if (iE5 == 123) {
                    nacVar.u();
                    this.h = 1;
                    return 1;
                }
                byte bG2 = nacVar.g(0L);
                ff01 ff01Var = this.f;
                if (bG2 == 116 || bG2 == 84) {
                    str = "true";
                    str2 = "TRUE";
                    i = 5;
                } else {
                    if (bG2 != 102 && bG2 != 70) {
                        if (bG2 == 110 || bG2 == 78) {
                            str = "null";
                            str2 = "NULL";
                            i = 7;
                        } else {
                            j = 0;
                            i = 0;
                            i9 = 0;
                        }
                        if (i != 0) {
                            return i;
                        }
                        int i10 = 1;
                        i2 = i9;
                        i3 = i2;
                        int i11 = i3;
                        long j2 = j;
                        while (true) {
                            i4 = i3 + 1;
                            if (ff01Var.request(i4)) {
                                bG = nacVar.g(i3);
                                if (bG != 43) {
                                    if (bG != 69 || bG == 101) {
                                        i6 = 6;
                                        if (i2 != 2 || i2 == 4) {
                                            i2 = 5;
                                            i3 = i4;
                                        } else {
                                            i5 = i9;
                                        }
                                    } else if (bG == 45) {
                                        i6 = 6;
                                        if (i2 == 0) {
                                            i2 = 1;
                                            i11 = 1;
                                        } else {
                                            if (i2 != 5) {
                                                i5 = i9;
                                            }
                                            i2 = i6;
                                        }
                                        i3 = i4;
                                    } else if (bG != 46) {
                                        if (bG >= 48 && bG <= 57) {
                                            if (i2 == 1 || i2 == 0) {
                                                i6 = 6;
                                                j2 = -(bG - 48);
                                                i2 = 2;
                                            } else {
                                                if (i2 == 2) {
                                                    if (j2 != j) {
                                                        long j3 = (10 * j2) - ((long) (bG - 48));
                                                        i10 &= (j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2)) ? 1 : i9;
                                                        j2 = j3;
                                                    }
                                                } else if (i2 == 3) {
                                                    i2 = 4;
                                                } else {
                                                    i6 = 6;
                                                    if (i2 == 5 || i2 == 6) {
                                                        i2 = 7;
                                                    }
                                                }
                                                i6 = 6;
                                                i3 = i4;
                                            }
                                            i3 = i4;
                                        } else if (!C(bG)) {
                                        }
                                        i5 = i9;
                                    } else {
                                        i6 = 6;
                                        if (i2 == 2) {
                                            i2 = 3;
                                            i3 = i4;
                                        } else {
                                            i5 = i9;
                                        }
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (C(nacVar.g(j))) {
                                        y();
                                        throw null;
                                    }
                                    w("Expected value");
                                    throw null;
                                }
                                i6 = 6;
                                if (i2 != 5) {
                                    i5 = i9;
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (C(nacVar.g(j))) {
                                        w("Expected value");
                                        throw null;
                                    }
                                    y();
                                    throw null;
                                }
                                i2 = i6;
                                i3 = i4;
                            }
                            if (i2 != 2 && i10 != 0 && ((j2 != Long.MIN_VALUE || i11 != 0) && (j2 != j || i11 == 0))) {
                                if (i11 == 0) {
                                    j2 = -j2;
                                }
                                this.i = j2;
                                nacVar.skip(i3);
                                i5 = 16;
                                this.h = 16;
                            } else if (i2 != 2 || i2 == 4 || i2 == 7) {
                                this.t = i3;
                                i5 = 17;
                                this.h = 17;
                            } else {
                                i5 = i9;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (C(nacVar.g(j))) {
                                w("Expected value");
                                throw null;
                            }
                            y();
                            throw null;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i = 6;
                }
                int length = str.length();
                j = 0;
                int i12 = 1;
                while (true) {
                    if (i12 >= length) {
                        if (!ff01Var.request(length + 1) || !C(nacVar.g(length))) {
                            nacVar.skip(length);
                            this.h = i;
                            break;
                        }
                    } else {
                        int i13 = i12 + 1;
                        if (ff01Var.request(i13) && ((cG = nacVar.g(i12)) == str.charAt(i12) || cG == str2.charAt(i12))) {
                            i12 = i13;
                        }
                    }
                    i = i9;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                int i14 = 1;
                i2 = i9;
                i3 = i2;
                int i15 = i3;
                long j4 = j;
                while (true) {
                    i4 = i3 + 1;
                    if (ff01Var.request(i4)) {
                        bG = nacVar.g(i3);
                        if (bG != 43) {
                            if (bG != 69) {
                                i6 = 6;
                                if (i2 != 2) {
                                }
                                i2 = 5;
                                i3 = i4;
                            } else {
                                i6 = 6;
                                if (i2 != 2) {
                                }
                                i2 = 5;
                                i3 = i4;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (C(nacVar.g(j))) {
                                w("Expected value");
                                throw null;
                            }
                            y();
                            throw null;
                        }
                        i6 = 6;
                        if (i2 != 5) {
                            i5 = i9;
                            if (i5 != 0) {
                                return i5;
                            }
                            if (C(nacVar.g(j))) {
                                w("Expected value");
                                throw null;
                            }
                            y();
                            throw null;
                        }
                        i2 = i6;
                        i3 = i4;
                    }
                    if (i2 != 2) {
                        if (i2 != 2) {
                        }
                        this.t = i3;
                        i5 = 17;
                        this.h = 17;
                    } else {
                        if (i2 != 2) {
                        }
                        this.t = i3;
                        i5 = 17;
                        this.h = 17;
                    }
                    if (i5 != 0) {
                        return i5;
                    }
                    if (C(nacVar.g(j))) {
                        w("Expected value");
                        throw null;
                    }
                    y();
                    throw null;
                }
            }
            if (i8 == 1) {
                nacVar.u();
                this.h = 4;
                return 4;
            }
        }
        if (i8 == 1 || i8 == 2) {
            y();
            throw null;
        }
        w("Unexpected value");
        throw null;
    }
}
