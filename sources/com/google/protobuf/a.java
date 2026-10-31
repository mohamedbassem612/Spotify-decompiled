package com.google.protobuf;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.Arrays;
import p.eg;
import p.er80;
import p.f4i1;
import p.gf40;
import p.grn1;
import p.h290;
import p.if40;
import p.kul1;
import p.l220;
import p.l290;
import p.l36;
import p.lwg;
import p.oiy0;
import p.phc;
import p.rz00;
import p.s2j0;
import p.sm41;
import p.t4f0;
import p.toi1;
import p.uqu;
import p.v190;
import p.yq20;
import p.zob;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class a {
    public static int A(int i, byte[] bArr, int i2, int i3, h290 h290Var, l36 l36Var) {
        t4f0 t4f0Var = (t4f0) h290Var;
        int iJ = J(bArr, i2, l36Var);
        t4f0Var.c(lwg.c(l36Var.b));
        while (iJ < i3) {
            int iH = H(bArr, iJ, l36Var);
            if (i != l36Var.a) {
                break;
            }
            iJ = J(bArr, iH, l36Var);
            t4f0Var.c(lwg.c(l36Var.b));
        }
        return iJ;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int B(byte[] bArr, int i, l36 l36Var) throws InvalidProtocolBufferException {
        int iH = H(bArr, i, l36Var);
        int i2 = l36Var.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i2 == 0) {
            l36Var.c = "";
            return iH;
        }
        l36Var.c = new String(bArr, iH, i2, l290.a);
        return iH + i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int C(int i, byte[] bArr, int i2, int i3, h290 h290Var, l36 l36Var) throws InvalidProtocolBufferException {
        int iH = H(bArr, i2, l36Var);
        int i4 = l36Var.a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i4 == 0) {
            h290Var.add("");
        } else {
            h290Var.add(new String(bArr, iH, i4, l290.a));
            iH += i4;
        }
        while (iH < i3) {
            int iH2 = H(bArr, iH, l36Var);
            if (i != l36Var.a) {
                break;
            }
            iH = H(bArr, iH2, l36Var);
            int i5 = l36Var.a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i5 == 0) {
                h290Var.add("");
            } else {
                h290Var.add(new String(bArr, iH, i5, l290.a));
                iH += i5;
            }
        }
        return iH;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int D(int i, byte[] bArr, int i2, int i3, h290 h290Var, l36 l36Var) throws InvalidProtocolBufferException {
        int iH = H(bArr, i2, l36Var);
        int i4 = l36Var.a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i4 == 0) {
            h290Var.add("");
        } else {
            int i5 = iH + i4;
            if (!toi1.a.A(iH, bArr, i5)) {
                throw InvalidProtocolBufferException.c();
            }
            h290Var.add(new String(bArr, iH, i4, l290.a));
            iH = i5;
        }
        while (iH < i3) {
            int iH2 = H(bArr, iH, l36Var);
            if (i != l36Var.a) {
                break;
            }
            iH = H(bArr, iH2, l36Var);
            int i6 = l36Var.a;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i6 == 0) {
                h290Var.add("");
            } else {
                int i7 = iH + i6;
                if (!toi1.a.A(iH, bArr, i7)) {
                    throw InvalidProtocolBufferException.c();
                }
                h290Var.add(new String(bArr, iH, i6, l290.a));
                iH = i7;
            }
        }
        return iH;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int E(byte[] bArr, int i, l36 l36Var) throws InvalidProtocolBufferException {
        int iH = H(bArr, i, l36Var);
        int i2 = l36Var.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i2 == 0) {
            l36Var.c = "";
            return iH;
        }
        l36Var.c = toi1.a.r(iH, bArr, i2);
        return iH + i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int F(int i, byte[] bArr, int i2, int i3, n nVar, l36 l36Var) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iJ = J(bArr, i2, l36Var);
            nVar.f(i, Long.valueOf(l36Var.b));
            return iJ;
        }
        if (i4 == 1) {
            nVar.f(i, Long.valueOf(i(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iH = H(bArr, i2, l36Var);
            int i5 = l36Var.a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i5 > bArr.length - iH) {
                throw InvalidProtocolBufferException.h();
            }
            if (i5 == 0) {
                nVar.f(i, phc.b);
            } else {
                nVar.f(i, phc.e(iH, bArr, i5));
            }
            return iH + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            nVar.f(i, Integer.valueOf(g(bArr, i2)));
            return i2 + 4;
        }
        n nVar2 = new n();
        int i6 = (i & (-8)) | 4;
        int i7 = l36Var.e + 1;
        l36Var.e = i7;
        if (i7 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = 0;
        while (i2 < i3) {
            int iH2 = H(bArr, i2, l36Var);
            i8 = l36Var.a;
            if (i8 == i6) {
                i2 = iH2;
                break;
            }
            i2 = F(i8, bArr, iH2, i3, nVar2, l36Var);
        }
        l36Var.e--;
        if (i2 > i3 || i8 != i6) {
            throw InvalidProtocolBufferException.g();
        }
        nVar.f(i, nVar2);
        return i2;
    }

    public static int G(int i, byte[] bArr, int i2, l36 l36Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            l36Var.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            l36Var.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            l36Var.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            l36Var.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                l36Var.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int H(byte[] bArr, int i, l36 l36Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return G(b, bArr, i2, l36Var);
        }
        l36Var.a = b;
        return i2;
    }

    public static int I(int i, byte[] bArr, int i2, int i3, h290 h290Var, l36 l36Var) {
        er80 er80Var = (er80) h290Var;
        int iH = H(bArr, i2, l36Var);
        er80Var.c(l36Var.a);
        while (iH < i3) {
            int iH2 = H(bArr, iH, l36Var);
            if (i != l36Var.a) {
                break;
            }
            iH = H(bArr, iH2, l36Var);
            er80Var.c(l36Var.a);
        }
        return iH;
    }

    public static int J(byte[] bArr, int i, l36 l36Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            l36Var.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        l36Var.b = j2;
        return i3;
    }

    public static int K(int i, byte[] bArr, int i2, int i3, h290 h290Var, l36 l36Var) {
        t4f0 t4f0Var = (t4f0) h290Var;
        int iJ = J(bArr, i2, l36Var);
        t4f0Var.c(l36Var.b);
        while (iJ < i3) {
            int iH = H(bArr, iJ, l36Var);
            if (i != l36Var.a) {
                break;
            }
            iJ = J(bArr, iH, l36Var);
            t4f0Var.c(l36Var.b);
        }
        return iJ;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int L(Object obj, sm41 sm41Var, byte[] bArr, int i, int i2, int i3, l36 l36Var) throws InvalidProtocolBufferException {
        j jVar = (j) sm41Var;
        int i4 = l36Var.e + 1;
        l36Var.e = i4;
        if (i4 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = jVar.E(obj, bArr, i, i2, i3, l36Var);
        l36Var.e--;
        l36Var.c = obj;
        return iE;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int M(Object obj, sm41 sm41Var, byte[] bArr, int i, int i2, l36 l36Var) throws InvalidProtocolBufferException {
        int iG = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iG = G(i3, bArr, iG, l36Var);
            i3 = l36Var.a;
        }
        int i4 = iG;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.h();
        }
        int i5 = l36Var.e + 1;
        l36Var.e = i5;
        if (i5 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i6 = i4 + i3;
        sm41Var.i(obj, bArr, i4, i6, l36Var);
        l36Var.e--;
        l36Var.c = obj;
        return i6;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int N(int i, byte[] bArr, int i2, int i3, l36 l36Var) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return J(bArr, i2, l36Var);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return H(bArr, i2, l36Var) + l36Var.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.b();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = H(bArr, i2, l36Var);
            i6 = l36Var.a;
            if (i6 == i5) {
                break;
            }
            i2 = N(i6, bArr, i2, i3, l36Var);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.g();
        }
        return i2;
    }

    public static int a(int i, byte[] bArr, int i2, int i3, h290 h290Var, l36 l36Var) {
        zob zobVar = (zob) h290Var;
        int iJ = J(bArr, i2, l36Var);
        zobVar.c(l36Var.b != 0);
        while (iJ < i3) {
            int iH = H(bArr, iJ, l36Var);
            if (i != l36Var.a) {
                break;
            }
            iJ = J(bArr, iH, l36Var);
            zobVar.c(l36Var.b != 0);
        }
        return iJ;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int b(byte[] bArr, int i, l36 l36Var) throws InvalidProtocolBufferException {
        int iH = H(bArr, i, l36Var);
        int i2 = l36Var.a;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i2 > bArr.length - iH) {
            throw InvalidProtocolBufferException.h();
        }
        if (i2 == 0) {
            l36Var.c = phc.b;
            return iH;
        }
        l36Var.c = phc.e(iH, bArr, i2);
        return iH + i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int c(int i, byte[] bArr, int i2, int i3, h290 h290Var, l36 l36Var) throws InvalidProtocolBufferException {
        int iH = H(bArr, i2, l36Var);
        int i4 = l36Var.a;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.f();
        }
        if (i4 > bArr.length - iH) {
            throw InvalidProtocolBufferException.h();
        }
        if (i4 == 0) {
            h290Var.add(phc.b);
        } else {
            h290Var.add(phc.e(iH, bArr, i4));
            iH += i4;
        }
        while (iH < i3) {
            int iH2 = H(bArr, iH, l36Var);
            if (i != l36Var.a) {
                break;
            }
            iH = H(bArr, iH2, l36Var);
            int i5 = l36Var.a;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.f();
            }
            if (i5 > bArr.length - iH) {
                throw InvalidProtocolBufferException.h();
            }
            if (i5 == 0) {
                h290Var.add(phc.b);
            } else {
                h290Var.add(phc.e(iH, bArr, i5));
                iH += i5;
            }
        }
        return iH;
    }

    public static double d(byte[] bArr, int i) {
        return Double.longBitsToDouble(i(bArr, i));
    }

    public static int e(int i, byte[] bArr, int i2, int i3, h290 h290Var, l36 l36Var) {
        uqu uquVar = (uqu) h290Var;
        uquVar.c(d(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iH = H(bArr, i4, l36Var);
            if (i != l36Var.a) {
                break;
            }
            uquVar.c(Double.longBitsToDouble(i(bArr, iH)));
            i4 = iH + 8;
        }
        return i4;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int f(int i, byte[] bArr, int i2, int i3, Object obj, s2j0 s2j0Var, m mVar, l36 l36Var) throws InvalidProtocolBufferException {
        int i4;
        int i5;
        int iJ;
        int iH;
        if40 if40Var = (if40) l36Var.d.a.get(new rz00(i >>> 3, s2j0Var));
        if (if40Var == null) {
            return F(i, bArr, i2, i3, j.r(obj), l36Var);
        }
        GeneratedMessageLite.ExtendableMessage extendableMessage = (GeneratedMessageLite.ExtendableMessage) obj;
        l220 l220Var = extendableMessage.a;
        if (l220Var.b) {
            extendableMessage.a = l220Var.b();
        }
        l220 l220Var2 = extendableMessage.a;
        int i6 = i >>> 3;
        gf40 gf40Var = if40Var.c;
        kul1 kul1Var = gf40Var.c;
        s2j0 s2j0Var2 = if40Var.b;
        boolean z = gf40Var.d;
        if (!gf40Var.d || !gf40Var.e) {
            Object objValueOf = null;
            if (kul1Var != kul1.Y) {
                switch (kul1Var.ordinal()) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        i4 = i2;
                        objValueOf = Double.valueOf(d(bArr, i4));
                        iJ = i4 + 8;
                        break;
                    case 1:
                        i5 = i2;
                        objValueOf = Float.valueOf(k(bArr, i5));
                        iJ = i5 + 4;
                        break;
                    case 2:
                    case 3:
                        iJ = J(bArr, i2, l36Var);
                        objValueOf = Long.valueOf(l36Var.b);
                        break;
                    case 4:
                    case grn1.d /* 12 */:
                        iJ = H(bArr, i2, l36Var);
                        objValueOf = Integer.valueOf(l36Var.a);
                        break;
                    case 5:
                    case 15:
                        i4 = i2;
                        objValueOf = Long.valueOf(i(bArr, i4));
                        iJ = i4 + 8;
                        break;
                    case 6:
                    case 14:
                        i5 = i2;
                        objValueOf = Integer.valueOf(g(bArr, i5));
                        iJ = i5 + 4;
                        break;
                    case 7:
                        iJ = J(bArr, i2, l36Var);
                        objValueOf = Boolean.valueOf(l36Var.b != 0);
                        break;
                    case 8:
                        iJ = B(bArr, i2, l36Var);
                        objValueOf = l36Var.c;
                        break;
                    case 9:
                        int i7 = (i6 << 3) | 4;
                        sm41 sm41VarA = oiy0.c.a(s2j0Var2.getClass());
                        if (z) {
                            int iM = m(sm41VarA, bArr, i2, i3, i7, l36Var);
                            l220Var2.a(gf40Var, l36Var.c);
                            return iM;
                        }
                        Object objC = l220Var2.a.get(gf40Var);
                        if (objC == null) {
                            objC = sm41VarA.c();
                            l220Var2.l(gf40Var, objC);
                        }
                        return L(objC, sm41VarA, bArr, i2, i3, i7, l36Var);
                    case 10:
                        sm41 sm41VarA2 = oiy0.c.a(s2j0Var2.getClass());
                        if (z) {
                            int iO = o(sm41VarA2, bArr, i2, i3, l36Var);
                            l220Var2.a(gf40Var, l36Var.c);
                            return iO;
                        }
                        Object objC2 = l220Var2.a.get(gf40Var);
                        if (objC2 == null) {
                            objC2 = sm41VarA2.c();
                            l220Var2.l(gf40Var, objC2);
                        }
                        return M(objC2, sm41VarA2, bArr, i2, i3, l36Var);
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        iJ = b(bArr, i2, l36Var);
                        objValueOf = l36Var.c;
                        break;
                    case 13:
                        eg.m("Shouldn't reach here.");
                        return 0;
                    case 16:
                        iJ = H(bArr, i2, l36Var);
                        objValueOf = Integer.valueOf(lwg.b(l36Var.a));
                        break;
                    case 17:
                        iJ = J(bArr, i2, l36Var);
                        objValueOf = Long.valueOf(lwg.c(l36Var.b));
                        break;
                    default:
                        iJ = i2;
                        break;
                }
            } else {
                iH = H(bArr, i2, l36Var);
                v190 v190VarFindValueByNumber = gf40Var.a.findValueByNumber(l36Var.a);
                int i8 = l36Var.a;
                if (v190VarFindValueByNumber == null) {
                    l.o(extendableMessage, i6, i8, (Object) null, mVar);
                } else {
                    objValueOf = Integer.valueOf(i8);
                    iJ = iH;
                }
            }
            if (z) {
                l220Var2.a(gf40Var, objValueOf);
            } else {
                l220Var2.l(gf40Var, objValueOf);
            }
            return iJ;
        }
        switch (kul1Var.ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                uqu uquVar = new uqu(uqu.d, 0, true);
                int iR = r(bArr, i2, uquVar, l36Var);
                l220Var2.l(gf40Var, uquVar);
                return iR;
            case 1:
                yq20 yq20Var = new yq20(yq20.d, 0, true);
                int iU = u(bArr, i2, yq20Var, l36Var);
                l220Var2.l(gf40Var, yq20Var);
                return iU;
            case 2:
            case 3:
                t4f0 t4f0Var = new t4f0();
                int iY = y(bArr, i2, t4f0Var, l36Var);
                l220Var2.l(gf40Var, t4f0Var);
                return iY;
            case 4:
            case grn1.d /* 12 */:
                er80 er80Var = new er80();
                int iX = x(bArr, i2, er80Var, l36Var);
                l220Var2.l(gf40Var, er80Var);
                return iX;
            case 5:
            case 15:
                t4f0 t4f0Var2 = new t4f0();
                int iT = t(bArr, i2, t4f0Var2, l36Var);
                l220Var2.l(gf40Var, t4f0Var2);
                return iT;
            case 6:
            case 14:
                er80 er80Var2 = new er80();
                int iS = s(bArr, i2, er80Var2, l36Var);
                l220Var2.l(gf40Var, er80Var2);
                return iS;
            case 7:
                zob zobVar = new zob(zob.d, 0, true);
                int iQ = q(bArr, i2, zobVar, l36Var);
                l220Var2.l(gf40Var, zobVar);
                return iQ;
            case 8:
            case 9:
            case 10:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
            default:
                eg.m("Type cannot be packed: ".concat(String.valueOf(gf40Var.c)));
                return 0;
            case 13:
                er80 er80Var3 = new er80();
                iH = x(bArr, i2, er80Var3, l36Var);
                l.j(extendableMessage, i6, er80Var3, gf40Var.a, (Object) null, mVar);
                l220Var2.l(gf40Var, er80Var3);
                break;
            case 16:
                er80 er80Var4 = new er80();
                int iV = v(bArr, i2, er80Var4, l36Var);
                l220Var2.l(gf40Var, er80Var4);
                return iV;
            case 17:
                t4f0 t4f0Var3 = new t4f0();
                int iW = w(bArr, i2, t4f0Var3, l36Var);
                l220Var2.l(gf40Var, t4f0Var3);
                return iW;
        }
        return iH;
    }

    public static int g(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int h(int i, byte[] bArr, int i2, int i3, h290 h290Var, l36 l36Var) {
        er80 er80Var = (er80) h290Var;
        er80Var.c(g(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iH = H(bArr, i4, l36Var);
            if (i != l36Var.a) {
                break;
            }
            er80Var.c(g(bArr, iH));
            i4 = iH + 4;
        }
        return i4;
    }

    public static long i(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int j(int i, byte[] bArr, int i2, int i3, h290 h290Var, l36 l36Var) {
        t4f0 t4f0Var = (t4f0) h290Var;
        t4f0Var.c(i(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iH = H(bArr, i4, l36Var);
            if (i != l36Var.a) {
                break;
            }
            t4f0Var.c(i(bArr, iH));
            i4 = iH + 8;
        }
        return i4;
    }

    public static float k(byte[] bArr, int i) {
        return Float.intBitsToFloat(g(bArr, i));
    }

    public static int l(int i, byte[] bArr, int i2, int i3, h290 h290Var, l36 l36Var) {
        yq20 yq20Var = (yq20) h290Var;
        yq20Var.c(k(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iH = H(bArr, i4, l36Var);
            if (i != l36Var.a) {
                break;
            }
            yq20Var.c(Float.intBitsToFloat(g(bArr, iH)));
            i4 = iH + 4;
        }
        return i4;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int m(sm41 sm41Var, byte[] bArr, int i, int i2, int i3, l36 l36Var) throws InvalidProtocolBufferException {
        Object objC = sm41Var.c();
        int iL = L(objC, sm41Var, bArr, i, i2, i3, l36Var);
        sm41Var.a(objC);
        l36Var.c = objC;
        return iL;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int n(sm41 sm41Var, int i, byte[] bArr, int i2, int i3, h290 h290Var, l36 l36Var) throws InvalidProtocolBufferException {
        int i4 = (i & (-8)) | 4;
        int iM = m(sm41Var, bArr, i2, i3, i4, l36Var);
        h290Var.add(l36Var.c);
        while (iM < i3) {
            int iH = H(bArr, iM, l36Var);
            if (i != l36Var.a) {
                break;
            }
            iM = m(sm41Var, bArr, iH, i3, i4, l36Var);
            h290Var.add(l36Var.c);
        }
        return iM;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int o(sm41 sm41Var, byte[] bArr, int i, int i2, l36 l36Var) throws InvalidProtocolBufferException {
        Object objC = sm41Var.c();
        int iM = M(objC, sm41Var, bArr, i, i2, l36Var);
        sm41Var.a(objC);
        l36Var.c = objC;
        return iM;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int p(sm41 sm41Var, int i, byte[] bArr, int i2, int i3, h290 h290Var, l36 l36Var) throws InvalidProtocolBufferException {
        int iO = o(sm41Var, bArr, i2, i3, l36Var);
        h290Var.add(l36Var.c);
        while (iO < i3) {
            int iH = H(bArr, iO, l36Var);
            if (i != l36Var.a) {
                break;
            }
            iO = o(sm41Var, bArr, iH, i3, l36Var);
            h290Var.add(l36Var.c);
        }
        return iO;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int q(byte[] bArr, int i, h290 h290Var, l36 l36Var) throws InvalidProtocolBufferException {
        zob zobVar = (zob) h290Var;
        int iH = H(bArr, i, l36Var);
        int i2 = l36Var.a + iH;
        while (iH < i2) {
            iH = J(bArr, iH, l36Var);
            zobVar.c(l36Var.b != 0);
        }
        if (iH == i2) {
            return iH;
        }
        throw InvalidProtocolBufferException.h();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int r(byte[] bArr, int i, h290 h290Var, l36 l36Var) throws InvalidProtocolBufferException {
        uqu uquVar = (uqu) h290Var;
        int iH = H(bArr, i, l36Var);
        int i2 = l36Var.a;
        int i3 = iH + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.h();
        }
        int i4 = (i2 / 8) + uquVar.c;
        double[] dArr = uquVar.b;
        if (i4 > dArr.length) {
            if (dArr.length == 0) {
                uquVar.b = new double[Math.max(i4, 10)];
            } else {
                int length = dArr.length;
                while (length < i4) {
                    length = f4i1.a(length, 3, 2, 1, 10);
                }
                uquVar.b = Arrays.copyOf(uquVar.b, length);
            }
        }
        while (iH < i3) {
            uquVar.c(Double.longBitsToDouble(i(bArr, iH)));
            iH += 8;
        }
        if (iH == i3) {
            return iH;
        }
        throw InvalidProtocolBufferException.h();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int s(byte[] bArr, int i, h290 h290Var, l36 l36Var) throws InvalidProtocolBufferException {
        er80 er80Var = (er80) h290Var;
        int iH = H(bArr, i, l36Var);
        int i2 = l36Var.a;
        int i3 = iH + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.h();
        }
        int i4 = (i2 / 4) + er80Var.c;
        int[] iArr = er80Var.b;
        if (i4 > iArr.length) {
            if (iArr.length == 0) {
                er80Var.b = new int[Math.max(i4, 10)];
            } else {
                int length = iArr.length;
                while (length < i4) {
                    length = f4i1.a(length, 3, 2, 1, 10);
                }
                er80Var.b = Arrays.copyOf(er80Var.b, length);
            }
        }
        while (iH < i3) {
            er80Var.c(g(bArr, iH));
            iH += 4;
        }
        if (iH == i3) {
            return iH;
        }
        throw InvalidProtocolBufferException.h();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int t(byte[] bArr, int i, h290 h290Var, l36 l36Var) throws InvalidProtocolBufferException {
        t4f0 t4f0Var = (t4f0) h290Var;
        int iH = H(bArr, i, l36Var);
        int i2 = l36Var.a;
        int i3 = iH + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.h();
        }
        int i4 = (i2 / 8) + t4f0Var.c;
        long[] jArr = t4f0Var.b;
        if (i4 > jArr.length) {
            if (jArr.length == 0) {
                t4f0Var.b = new long[Math.max(i4, 10)];
            } else {
                int length = jArr.length;
                while (length < i4) {
                    length = f4i1.a(length, 3, 2, 1, 10);
                }
                t4f0Var.b = Arrays.copyOf(t4f0Var.b, length);
            }
        }
        while (iH < i3) {
            t4f0Var.c(i(bArr, iH));
            iH += 8;
        }
        if (iH == i3) {
            return iH;
        }
        throw InvalidProtocolBufferException.h();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int u(byte[] bArr, int i, h290 h290Var, l36 l36Var) throws InvalidProtocolBufferException {
        yq20 yq20Var = (yq20) h290Var;
        int iH = H(bArr, i, l36Var);
        int i2 = l36Var.a;
        int i3 = iH + i2;
        if (i3 > bArr.length) {
            throw InvalidProtocolBufferException.h();
        }
        int i4 = (i2 / 4) + yq20Var.c;
        float[] fArr = yq20Var.b;
        if (i4 > fArr.length) {
            if (fArr.length == 0) {
                yq20Var.b = new float[Math.max(i4, 10)];
            } else {
                int length = fArr.length;
                while (length < i4) {
                    length = f4i1.a(length, 3, 2, 1, 10);
                }
                yq20Var.b = Arrays.copyOf(yq20Var.b, length);
            }
        }
        while (iH < i3) {
            yq20Var.c(Float.intBitsToFloat(g(bArr, iH)));
            iH += 4;
        }
        if (iH == i3) {
            return iH;
        }
        throw InvalidProtocolBufferException.h();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int v(byte[] bArr, int i, h290 h290Var, l36 l36Var) throws InvalidProtocolBufferException {
        er80 er80Var = (er80) h290Var;
        int iH = H(bArr, i, l36Var);
        int i2 = l36Var.a + iH;
        while (iH < i2) {
            iH = H(bArr, iH, l36Var);
            er80Var.c(lwg.b(l36Var.a));
        }
        if (iH == i2) {
            return iH;
        }
        throw InvalidProtocolBufferException.h();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int w(byte[] bArr, int i, h290 h290Var, l36 l36Var) throws InvalidProtocolBufferException {
        t4f0 t4f0Var = (t4f0) h290Var;
        int iH = H(bArr, i, l36Var);
        int i2 = l36Var.a + iH;
        while (iH < i2) {
            iH = J(bArr, iH, l36Var);
            t4f0Var.c(lwg.c(l36Var.b));
        }
        if (iH == i2) {
            return iH;
        }
        throw InvalidProtocolBufferException.h();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int x(byte[] bArr, int i, h290 h290Var, l36 l36Var) throws InvalidProtocolBufferException {
        er80 er80Var = (er80) h290Var;
        int iH = H(bArr, i, l36Var);
        int i2 = l36Var.a + iH;
        while (iH < i2) {
            iH = H(bArr, iH, l36Var);
            er80Var.c(l36Var.a);
        }
        if (iH == i2) {
            return iH;
        }
        throw InvalidProtocolBufferException.h();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.protobuf.InvalidProtocolBufferException */
    public static int y(byte[] bArr, int i, h290 h290Var, l36 l36Var) throws InvalidProtocolBufferException {
        t4f0 t4f0Var = (t4f0) h290Var;
        int iH = H(bArr, i, l36Var);
        int i2 = l36Var.a + iH;
        while (iH < i2) {
            iH = J(bArr, iH, l36Var);
            t4f0Var.c(l36Var.b);
        }
        if (iH == i2) {
            return iH;
        }
        throw InvalidProtocolBufferException.h();
    }

    public static int z(int i, byte[] bArr, int i2, int i3, h290 h290Var, l36 l36Var) {
        er80 er80Var = (er80) h290Var;
        int iH = H(bArr, i2, l36Var);
        er80Var.c(lwg.b(l36Var.a));
        while (iH < i3) {
            int iH2 = H(bArr, iH, l36Var);
            if (i != l36Var.a) {
                break;
            }
            iH = H(bArr, iH2, l36Var);
            er80Var.c(lwg.b(l36Var.a));
        }
        return iH;
    }
}
