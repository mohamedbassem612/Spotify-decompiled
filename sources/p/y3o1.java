package p;

import android.view.View;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.SearchTemplate;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.g;
import com.google.crypto.tink.shaded.protobuf.k;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class y3o1 {
    public static final nf50 a = new nf50(0.0f, 0, 0, false);
    public static b180 b;

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int A(rm41 rm41Var, byte[] bArr, int i, int i2, m36 m36Var) throws InvalidProtocolBufferException {
        int iS = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iS = S(i3, bArr, iS, m36Var);
            i3 = m36Var.b;
        }
        int i4 = iS;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.e();
        }
        Object objC = rm41Var.c();
        int i5 = i4 + i3;
        rm41Var.i(objC, bArr, i4, i5, m36Var);
        rm41Var.a(objC);
        m36Var.a = objC;
        return i5;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int B(rm41 rm41Var, int i, byte[] bArr, int i2, int i3, g290 g290Var, m36 m36Var) throws InvalidProtocolBufferException {
        int iA = A(rm41Var, bArr, i2, i3, m36Var);
        g290Var.add(m36Var.a);
        while (iA < i3) {
            int iT = T(bArr, iA, m36Var);
            if (i != m36Var.b) {
                break;
            }
            iA = A(rm41Var, bArr, iT, i3, m36Var);
            g290Var.add(m36Var.a);
        }
        return iA;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int C(byte[] bArr, int i, g290 g290Var, m36 m36Var) throws InvalidProtocolBufferException {
        yob yobVar = (yob) g290Var;
        int iT = T(bArr, i, m36Var);
        int i2 = m36Var.b + iT;
        while (iT < i2) {
            iT = V(bArr, iT, m36Var);
            yobVar.c(m36Var.c != 0);
        }
        if (iT == i2) {
            return iT;
        }
        throw InvalidProtocolBufferException.e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int D(byte[] bArr, int i, g290 g290Var, m36 m36Var) throws InvalidProtocolBufferException {
        tqu tquVar = (tqu) g290Var;
        int iT = T(bArr, i, m36Var);
        int i2 = m36Var.b + iT;
        while (iT < i2) {
            tquVar.c(Double.longBitsToDouble(u(bArr, iT)));
            iT += 8;
        }
        if (iT == i2) {
            return iT;
        }
        throw InvalidProtocolBufferException.e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int E(byte[] bArr, int i, g290 g290Var, m36 m36Var) throws InvalidProtocolBufferException {
        dr80 dr80Var = (dr80) g290Var;
        int iT = T(bArr, i, m36Var);
        int i2 = m36Var.b + iT;
        while (iT < i2) {
            dr80Var.c(s(bArr, iT));
            iT += 4;
        }
        if (iT == i2) {
            return iT;
        }
        throw InvalidProtocolBufferException.e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int F(byte[] bArr, int i, g290 g290Var, m36 m36Var) throws InvalidProtocolBufferException {
        s4f0 s4f0Var = (s4f0) g290Var;
        int iT = T(bArr, i, m36Var);
        int i2 = m36Var.b + iT;
        while (iT < i2) {
            s4f0Var.c(u(bArr, iT));
            iT += 8;
        }
        if (iT == i2) {
            return iT;
        }
        throw InvalidProtocolBufferException.e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int G(byte[] bArr, int i, g290 g290Var, m36 m36Var) throws InvalidProtocolBufferException {
        xq20 xq20Var = (xq20) g290Var;
        int iT = T(bArr, i, m36Var);
        int i2 = m36Var.b + iT;
        while (iT < i2) {
            xq20Var.c(Float.intBitsToFloat(s(bArr, iT)));
            iT += 4;
        }
        if (iT == i2) {
            return iT;
        }
        throw InvalidProtocolBufferException.e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int H(byte[] bArr, int i, g290 g290Var, m36 m36Var) throws InvalidProtocolBufferException {
        dr80 dr80Var = (dr80) g290Var;
        int iT = T(bArr, i, m36Var);
        int i2 = m36Var.b + iT;
        while (iT < i2) {
            iT = T(bArr, iT, m36Var);
            dr80Var.c(ngc.b(m36Var.b));
        }
        if (iT == i2) {
            return iT;
        }
        throw InvalidProtocolBufferException.e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int I(byte[] bArr, int i, g290 g290Var, m36 m36Var) throws InvalidProtocolBufferException {
        s4f0 s4f0Var = (s4f0) g290Var;
        int iT = T(bArr, i, m36Var);
        int i2 = m36Var.b + iT;
        while (iT < i2) {
            iT = V(bArr, iT, m36Var);
            s4f0Var.c(ngc.c(m36Var.c));
        }
        if (iT == i2) {
            return iT;
        }
        throw InvalidProtocolBufferException.e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int J(byte[] bArr, int i, g290 g290Var, m36 m36Var) throws InvalidProtocolBufferException {
        dr80 dr80Var = (dr80) g290Var;
        int iT = T(bArr, i, m36Var);
        int i2 = m36Var.b + iT;
        while (iT < i2) {
            iT = T(bArr, iT, m36Var);
            dr80Var.c(m36Var.b);
        }
        if (iT == i2) {
            return iT;
        }
        throw InvalidProtocolBufferException.e();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int K(byte[] bArr, int i, g290 g290Var, m36 m36Var) throws InvalidProtocolBufferException {
        s4f0 s4f0Var = (s4f0) g290Var;
        int iT = T(bArr, i, m36Var);
        int i2 = m36Var.b + iT;
        while (iT < i2) {
            iT = V(bArr, iT, m36Var);
            s4f0Var.c(m36Var.c);
        }
        if (iT == i2) {
            return iT;
        }
        throw InvalidProtocolBufferException.e();
    }

    public static int L(int i, byte[] bArr, int i2, int i3, g290 g290Var, m36 m36Var) {
        dr80 dr80Var = (dr80) g290Var;
        int iT = T(bArr, i2, m36Var);
        dr80Var.c(ngc.b(m36Var.b));
        while (iT < i3) {
            int iT2 = T(bArr, iT, m36Var);
            if (i != m36Var.b) {
                break;
            }
            iT = T(bArr, iT2, m36Var);
            dr80Var.c(ngc.b(m36Var.b));
        }
        return iT;
    }

    public static int M(int i, byte[] bArr, int i2, int i3, g290 g290Var, m36 m36Var) {
        s4f0 s4f0Var = (s4f0) g290Var;
        int iV = V(bArr, i2, m36Var);
        s4f0Var.c(ngc.c(m36Var.c));
        while (iV < i3) {
            int iT = T(bArr, iV, m36Var);
            if (i != m36Var.b) {
                break;
            }
            iV = V(bArr, iT, m36Var);
            s4f0Var.c(ngc.c(m36Var.c));
        }
        return iV;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int N(byte[] bArr, int i, m36 m36Var) throws InvalidProtocolBufferException {
        int iT = T(bArr, i, m36Var);
        int i2 = m36Var.b;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.c();
        }
        if (i2 == 0) {
            m36Var.a = "";
            return iT;
        }
        m36Var.a = new String(bArr, iT, i2, k290.a);
        return iT + i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int O(int i, byte[] bArr, int i2, int i3, g290 g290Var, m36 m36Var) throws InvalidProtocolBufferException {
        int iT = T(bArr, i2, m36Var);
        int i4 = m36Var.b;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.c();
        }
        if (i4 == 0) {
            g290Var.add("");
        } else {
            g290Var.add(new String(bArr, iT, i4, k290.a));
            iT += i4;
        }
        while (iT < i3) {
            int iT2 = T(bArr, iT, m36Var);
            if (i != m36Var.b) {
                break;
            }
            iT = T(bArr, iT2, m36Var);
            int i5 = m36Var.b;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.c();
            }
            if (i5 == 0) {
                g290Var.add("");
            } else {
                g290Var.add(new String(bArr, iT, i5, k290.a));
                iT += i5;
            }
        }
        return iT;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int P(int i, byte[] bArr, int i2, int i3, g290 g290Var, m36 m36Var) throws InvalidProtocolBufferException {
        int iT = T(bArr, i2, m36Var);
        int i4 = m36Var.b;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.c();
        }
        if (i4 == 0) {
            g290Var.add("");
        } else {
            int i5 = iT + i4;
            if (!soi1.a.w(iT, bArr, i5)) {
                throw InvalidProtocolBufferException.a();
            }
            g290Var.add(new String(bArr, iT, i4, k290.a));
            iT = i5;
        }
        while (iT < i3) {
            int iT2 = T(bArr, iT, m36Var);
            if (i != m36Var.b) {
                break;
            }
            iT = T(bArr, iT2, m36Var);
            int i6 = m36Var.b;
            if (i6 < 0) {
                throw InvalidProtocolBufferException.c();
            }
            if (i6 == 0) {
                g290Var.add("");
            } else {
                int i7 = iT + i6;
                if (!soi1.a.w(iT, bArr, i7)) {
                    throw InvalidProtocolBufferException.a();
                }
                g290Var.add(new String(bArr, iT, i6, k290.a));
                iT = i7;
            }
        }
        return iT;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int Q(byte[] bArr, int i, m36 m36Var) throws InvalidProtocolBufferException {
        int iT = T(bArr, i, m36Var);
        int i2 = m36Var.b;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.c();
        }
        if (i2 == 0) {
            m36Var.a = "";
            return iT;
        }
        m36Var.a = soi1.a.r(iT, bArr, i2);
        return iT + i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int R(int i, byte[] bArr, int i2, int i3, k kVar, m36 m36Var) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iV = V(bArr, i2, m36Var);
            kVar.c(i, Long.valueOf(m36Var.c));
            return iV;
        }
        if (i4 == 1) {
            kVar.c(i, Long.valueOf(u(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iT = T(bArr, i2, m36Var);
            int i5 = m36Var.b;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.c();
            }
            if (i5 > bArr.length - iT) {
                throw InvalidProtocolBufferException.e();
            }
            if (i5 == 0) {
                kVar.c(i, ohc.b);
            } else {
                kVar.c(i, ohc.d(iT, bArr, i5));
            }
            return iT + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
            }
            kVar.c(i, Integer.valueOf(s(bArr, i2)));
            return i2 + 4;
        }
        k kVarB = k.b();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (i2 < i3) {
            int iT2 = T(bArr, i2, m36Var);
            int i8 = m36Var.b;
            if (i8 == i6) {
                i7 = i8;
                i2 = iT2;
                break;
            }
            i2 = R(i8, bArr, iT2, i3, kVarB, m36Var);
            i7 = i8;
        }
        if (i2 > i3 || i7 != i6) {
            throw InvalidProtocolBufferException.d();
        }
        kVar.c(i, kVarB);
        return i2;
    }

    public static int S(int i, byte[] bArr, int i2, m36 m36Var) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            m36Var.b = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & 127) << 7);
        int i6 = i2 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            m36Var.b = i5 | (b3 << 14);
            return i6;
        }
        int i7 = i5 | ((b3 & 127) << 14);
        int i8 = i2 + 3;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            m36Var.b = i7 | (b4 << 21);
            return i8;
        }
        int i9 = i7 | ((b4 & 127) << 21);
        int i10 = i2 + 4;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            m36Var.b = i9 | (b5 << 28);
            return i10;
        }
        int i11 = i9 | ((b5 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                m36Var.b = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int T(byte[] bArr, int i, m36 m36Var) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return S(b2, bArr, i2, m36Var);
        }
        m36Var.b = b2;
        return i2;
    }

    public static int U(int i, byte[] bArr, int i2, int i3, g290 g290Var, m36 m36Var) {
        dr80 dr80Var = (dr80) g290Var;
        int iT = T(bArr, i2, m36Var);
        dr80Var.c(m36Var.b);
        while (iT < i3) {
            int iT2 = T(bArr, iT, m36Var);
            if (i != m36Var.b) {
                break;
            }
            iT = T(bArr, iT2, m36Var);
            dr80Var.c(m36Var.b);
        }
        return iT;
    }

    public static int V(byte[] bArr, int i, m36 m36Var) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            m36Var.c = j;
            return i2;
        }
        int i3 = i + 2;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & 127)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & 127)) << i4;
            b2 = b3;
            i3 = i5;
        }
        m36Var.c = j2;
        return i3;
    }

    public static int W(int i, byte[] bArr, int i2, int i3, g290 g290Var, m36 m36Var) {
        s4f0 s4f0Var = (s4f0) g290Var;
        int iV = V(bArr, i2, m36Var);
        s4f0Var.c(m36Var.c);
        while (iV < i3) {
            int iT = T(bArr, iV, m36Var);
            if (i != m36Var.b) {
                break;
            }
            iV = V(bArr, iT, m36Var);
            s4f0Var.c(m36Var.c);
        }
        return iV;
    }

    public static poy0 X(iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, iu30 iu30Var3, int i) {
        bhh1 bhh1Var = igu.b;
        if ((i & 16) != 0) {
            iu30Var3 = ucy0.P0;
        }
        return h4o1.q(iu30Var, iu30Var2, vu30Var, bhh1Var, iu30Var3);
    }

    public static poy0 Y(moy0 moy0Var, iu30 iu30Var, vu30 vu30Var, iu30 iu30Var2, int i) {
        bhh1 bhh1Var = igu.b;
        if ((i & 16) != 0) {
            iu30Var2 = ucy0.Q0;
        }
        return h4o1.q(new qoy0(moy0Var, (byte) 0), iu30Var, vu30Var, bhh1Var, iu30Var2);
    }

    public static final gmh1 Z(qx81 qx81Var, qx81 qx81Var2) {
        return qx81Var.equals(qx81Var2) ? qx81Var : new fq20(qx81Var, qx81Var2);
    }

    public static final void a(cbo0 cbo0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(985876208);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(cbo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            bbo0 bbo0Var = cbo0Var.c;
            if (bbo0Var == null) {
                x340Var.i0(1251822802);
            } else {
                x340Var.i0(1251822803);
                f(0, bbo0Var.a, bbo0Var.b, x340Var);
            }
            x340Var.r(false);
            bbo0 bbo0Var2 = cbo0Var.d;
            if (bbo0Var2 == null) {
                x340Var.i0(1251912144);
            } else {
                x340Var.i0(1251912145);
                j(0, bbo0Var2.a, bbo0Var2.b, x340Var);
            }
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ug50(cbo0Var, i, (byte) 15);
        }
    }

    public static final nux a0(xsb1 xsb1Var) {
        switch (xsb1Var.ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
            case 1:
            case 4:
            case 7:
            case 8:
            case 9:
                box boxVar = box.c;
                return new nux(boxVar, boxVar);
            case 2:
                ltx ltxVar = ltx.c;
                return new nux(ltxVar, ltxVar);
            case 3:
                nkx nkxVar = nkx.c;
                return new nux(nkxVar, nkxVar);
            case 5:
                nkx nkxVar2 = nkx.c;
                return new nux(nkxVar2, nkxVar2);
            case 6:
                ltx ltxVar2 = ltx.c;
                return new nux(ltxVar2, ltxVar2);
            default:
                eg.o();
                return null;
        }
    }

    public static final void b(etd etdVar, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1030383694);
        byte b2 = 2;
        int i2 = (b0kVar3.i(etdVar) ? 4 : 2) | i | (b0kVar3.i(function0) ? 32 : 16);
        byte b3 = 0;
        byte b4 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarJ = u291.j(220.0f, 0.0f, 2, u291.v(nim0.a, 156.0f));
            boolean zI = b0kVar3.i(etdVar);
            Object objT = b0kVar3.T();
            if (zI || objT == fkj0.X) {
                objT = new m4d(etdVar, (byte) 5);
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarJ, false, (iu30) objT);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            vzq0.a.getClass();
            ydx ydxVar = new ydx(2.0f, 6.0f, 8.0f, uzq0.b);
            gbx gbxVar = new gbx(z50.c, function0);
            j2i j2iVarR2 = apo.r(186146775, new jtd(etdVar, b3), b0kVar3);
            if (etdVar.c.length() <= 0 && !etdVar.i) {
                b0kVar3.i0(-27507718);
                b0kVar3.r(false);
                j2iVarR = null;
            } else {
                b0kVar3.i0(-28215882);
                j2iVarR = apo.r(-1552148578, new jtd(etdVar, b4), b0kVar3);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            ioo1.c(qim0VarB, null, ydxVar, null, null, null, null, gbxVar, null, j2iVarR2, null, null, j2iVarR, null, null, null, apo.r(2001650141, new jtd(etdVar, b2), b0kVar3), b0kVar2, 805306880, 1572864, 60794);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hj8(etdVar, function0, i, (byte) 28);
        }
    }

    public static final void b0(drw drwVar, View view, yfu yfuVar) {
        h6t h6tVar = new h6t();
        h6tVar.a(view);
        drwVar.a(h6tVar, yfuVar);
    }

    public static final void c(int i, b0k b0kVar, int i2) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1845343120);
        int i3 = i2 | (x340Var.e(i) ? 4 : 2);
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            x340Var.d0();
            if ((i2 & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            String strO0 = cwl1.o0(x340Var, i);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, uyn1.y(nim0Var, 16.0f, 16.0f), cbx.d(x340Var).h, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
            t1c.a(dug.f(u291.h(u291.f(nim0Var, 1.0f), 1.0f), cbx.a(x340Var).a.b.a(), d4o1.a), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vx1((byte) 20, i, i2);
        }
    }

    public static final boolean c0(ContextTrack contextTrack) {
        return u890.j(contextTrack.metadata().get("ad.companion.type"), "canvas_image") || u890.j(contextTrack.metadata().get("ad.companion.type"), "canvas_video");
    }

    public static final void d(cbo0 cbo0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2110045084);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(cbo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = u291.f(u291.j(if71.c, 0.0f, 2, qim0Var), 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarA = uyn1.A(qim0VarF, 16.0f, 8.0f, 16.0f, cbx.b(x340Var).b.c);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = htn0.S0;
                x340Var.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarA, true, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(cbo0Var.a, null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            cvx cvxVar4 = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.h(nim0Var, 8.0f));
            uwo1.e(cbo0Var.b, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, new a0e1(3), null, 0, false, null, 0, null, x340Var, 0, 0, 2018);
            cvx cvxVar5 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            a(cbo0Var, x340Var, i3 & 14);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(cbo0Var, qim0Var, i, (byte) 22);
        }
    }

    public static final boolean d0(float f, float f2, int i, b0k b0kVar, boolean z) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(905376628);
        float f3 = z ? 44.0f : 48.0f;
        if (p3v.b(f, f3) < 0 || p3v.b(f2, f3) < 0) {
            x340Var.r(false);
            return false;
        }
        if (i <= 0) {
            x340Var.r(false);
            return true;
        }
        x340Var.i0(-1811406898);
        float fK = w6p1.k(nee1.g, x340Var);
        x340Var.r(false);
        boolean z2 = m(i, f, f2, f3, fK, null, 464).b > 0;
        x340Var.r(false);
        return z2;
    }

    public static final void e(c9n c9nVar, vy71 vy71Var, lbt0 lbt0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1080437410);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(c9nVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(vy71Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(lbt0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            c10 c10Var = (c10) lbt0Var.c.get(t80.Z);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cua cuaVar2 = cbx.b(b0kVar3).f;
            cr31 cr31VarD = er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("bottomsheet_confirm", uyn1.B(u291.z(qim0Var3, (fra) null, 3), 0.0f, 0.0f, 0.0f, 32.0f, 7));
            boolean z = (i3 & 7168) == 2048;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new dgq0(iu30Var, (byte) 17);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            dem0.a((Function0) objT, qim0VarN, vy71Var, 0.0f, false, cr31VarD, 0L, 0L, 0.0f, 0L, (vu30) null, w0q0.Q0, (eem0) null, apo.r(637283972, new jb1((Object) lbt0Var, (Object) c9nVar, (Object) vy71Var, iu30Var, (Object) c10Var, (byte) 24), b0kVar3), b0kVar2, (i3 << 3) & 896, 3072, 6104);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new xmr0(c9nVar, vy71Var, lbt0Var, iu30Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final boolean e0(ContextTrack contextTrack) {
        Object next;
        String str = (String) contextTrack.metadata().get("ad.video_orientation");
        d7 d7Var = new d7(a6k1.f, (byte) 0);
        do {
            if (!d7Var.hasNext()) {
                next = null;
                break;
            }
            next = d7Var.next();
        } while (!((a6k1) next).a.equals(str));
        a6k1 a6k1Var = (a6k1) next;
        if (a6k1Var == null) {
            a6k1Var = a6k1.UNKNOWN;
        }
        return a6k1Var == a6k1.PORTRAIT;
    }

    public static final void f(int i, String str, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1282008287);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else {
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(str), function0);
            idx idxVar = new idx();
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            foo1.c(gbxVar, idxVar, uyn1.B(nim0.a, 0.0f, 12.0f, 0.0f, 0.0f, 13), null, null, null, null, null, null, null, apo.r(-487164386, new tej0(str, (byte) 12), x340Var), x340Var, 0, 48, 2040);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ql(str, function0, i, (byte) 21);
        }
    }

    public static td00 f0(e290 e290Var) {
        if (e290Var.size() > qd00.d) {
            return null;
        }
        td00 td00Var = new td00();
        int i = 0;
        for (Object obj : e290Var) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            td00Var.a[i].a += ((Number) obj).longValue();
            i = i2;
        }
        return td00Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x0081  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x0110  */
    /* JADX WARN: Code duplicated, block: B:71:0x011e  */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    public static final void g(c380 c380Var, mp10 mp10Var, float f, float f2, gt40 gt40Var, boolean z, boolean z2, boolean z3, fg50 fg50Var, b0k b0kVar, int i, int i2) {
        boolean z4;
        int i3;
        boolean z5;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z6;
        boolean z7;
        fg50 fg50Var2;
        boolean z8;
        h311 h311VarV;
        fg50 fg50Var3;
        boolean z9;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1471084913);
        int i8 = i | (x340Var.i(c380Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i8 |= x340Var.g(mp10Var) ? 32 : 16;
        }
        int i9 = i8 | (x340Var.d(f) ? 256 : 128) | (x340Var.d(f2) ? 2048 : 1024) | (x340Var.i(gt40Var) ? 16384 : 8192);
        int i10 = i2 & 32;
        if (i10 == 0) {
            if ((i & 196608) == 0) {
                z4 = z;
                i9 |= x340Var.h(z4) ? 131072 : 65536;
            }
            i3 = i2 & 64;
            if (i3 != 0) {
                i5 = i9 | 1572864;
                z5 = z2;
            } else {
                z5 = z2;
                if (x340Var.h(z5)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i5 = i9 | i4;
            }
            int i11 = i5 | 4194304;
            if (x340Var.h(z3)) {
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i7 = i11 | i6 | 268435456;
            if ((306783379 & i7) != 306783378) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (x340Var.Y(i7 & 1, z6)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    boolean z10 = i10 == 0 ? z4 : true;
                    if (i3 != 0) {
                        z5 = false;
                    }
                    fg50Var3 = (fg50) x340Var.k(r4k.b);
                    z9 = z10;
                } else {
                    x340Var.b0();
                    fg50Var3 = fg50Var;
                    z9 = z4;
                }
                boolean z11 = z5;
                x340Var.s();
                j2h1.b(dm5.I(et40.a).c(gt40Var), (ql3) null, apo.r(-1743335955, new l011(c380Var, mp10Var, (String) x340Var.k(wol1.a), f, f2, z9, z11, z3, fg50Var3), x340Var), x340Var, 384, 2);
                z8 = z9;
                z7 = z11;
                fg50Var2 = fg50Var3;
            } else {
                x340Var.b0();
                z7 = z5;
                fg50Var2 = fg50Var;
                z8 = z4;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new m011(c380Var, mp10Var, f, f2, gt40Var, z8, z7, z3, fg50Var2, i, i2);
            }
        }
        i9 |= 196608;
        z4 = z;
        i3 = i2 & 64;
        if (i3 != 0) {
            i5 = i9 | 1572864;
            z5 = z2;
        } else {
            z5 = z2;
            if (x340Var.h(z5)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i5 = i9 | i4;
        }
        int i12 = i5 | 4194304;
        if (x340Var.h(z3)) {
            i6 = 67108864;
        } else {
            i6 = 33554432;
        }
        i7 = i12 | i6 | 268435456;
        if ((306783379 & i7) != 306783378) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (x340Var.Y(i7 & 1, z6)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i10 == 0) {
                }
                if (i3 != 0) {
                    z5 = false;
                }
                fg50Var3 = (fg50) x340Var.k(r4k.b);
                z9 = z10;
            } else {
                if (i10 == 0) {
                }
                if (i3 != 0) {
                    z5 = false;
                }
                fg50Var3 = (fg50) x340Var.k(r4k.b);
                z9 = z10;
            }
            boolean z12 = z5;
            x340Var.s();
            j2h1.b(dm5.I(et40.a).c(gt40Var), (ql3) null, apo.r(-1743335955, new l011(c380Var, mp10Var, (String) x340Var.k(wol1.a), f, f2, z9, z12, z3, fg50Var3), x340Var), x340Var, 384, 2);
            z8 = z9;
            z7 = z12;
            fg50Var2 = fg50Var3;
        } else {
            x340Var.b0();
            z7 = z5;
            fg50Var2 = fg50Var;
            z8 = z4;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m011(c380Var, mp10Var, f, f2, gt40Var, z8, z7, z3, fg50Var2, i, i2);
        }
    }

    public static SearchTemplate g0(String str, ArrayList arrayList, nwc nwcVar, String str2, xaz0 xaz0Var, int i) {
        if ((i & 2) != 0) {
            arrayList = z6x.a;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        pb51 pb51Var = new pb51(xaz0Var);
        pb51Var.e = true;
        Action action = Action.BACK;
        v90 v90Var = v90.l;
        Objects.requireNonNull(action);
        v90Var.a(Collections.singletonList(action));
        pb51Var.f = action;
        pb51Var.c = str;
        dk90 dk90Var = new dk90();
        if (nwcVar != null) {
            CharSequence charSequenceB = hon1.B(nwcVar);
            Objects.requireNonNull(charSequenceB);
            dk90Var.e = CarText.create(charSequenceB);
            for (qi90 qi90Var : arrayList) {
                Objects.requireNonNull(qi90Var);
                dk90Var.a.add(qi90Var);
            }
        }
        ItemList itemListA = dk90Var.a();
        gw31 gw31Var = gw31.e;
        gw31Var.getClass();
        if (itemListA.getOnSelectedDelegate() != null && !gw31Var.c) {
            hhg1.n("Selectable lists are not allowed");
            return null;
        }
        gw31Var.a(itemListA.getItems());
        pb51Var.d = itemListA;
        if (str2 != null) {
            pb51Var.b = str2;
            pb51Var.e = false;
        }
        return new SearchTemplate(pb51Var);
    }

    public static final void h(c380 c380Var, mp10 mp10Var, String str, float f, float f2, gt40 gt40Var, boolean z, boolean z2, boolean z3, fg50 fg50Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        gt40 gt40Var2;
        float fK;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-405038357);
        int i2 = i | (b0kVar3.i(c380Var) ? 4 : 2) | (b0kVar3.g(mp10Var) ? 32 : 16) | (b0kVar3.g(str) ? 256 : 128) | (b0kVar3.d(f) ? 2048 : 1024) | (b0kVar3.d(f2) ? 16384 : 8192) | (b0kVar3.h(false) ? 131072 : 65536) | 1572864 | (b0kVar3.h(z) ? 8388608 : 4194304) | (b0kVar3.h(z2) ? 67108864 : 33554432) | (b0kVar3.h(z3) ? 536870912 : 268435456);
        if (b0kVar3.Y(i2 & 1, ((306783379 & i2) == 306783378 && ((b0kVar3.e(fg50Var == null ? -1 : fg50Var.ordinal()) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            kee1 kee1Var = nee1.g;
            float f3 = 0.0f;
            if (z) {
                b0kVar3.i0(1600180677);
                fK = w6p1.k(kee1Var, b0kVar3);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(1600181741);
                b0kVar3.r(false);
                fK = 0.0f;
            }
            float f4 = fK;
            nf50 nf50VarM = m(c380Var.size(), f, f2, z2 ? 44.0f : 48.0f, f4, fg50Var, 208);
            float f5 = nf50VarM.a;
            int i3 = nf50VarM.b;
            int i4 = nf50VarM.c;
            boolean z4 = nf50VarM.d;
            c380 c380VarA = mqo1.A(o7h.d1(c380Var, i4 * i3));
            if (i3 > 1 && i3 > 1) {
                f3 = zjy.p(8.0f, new p3v((f2 - ((i3 * f5) + (z4 ? f4 * i3 : 0.0f))) / (i3 + 1))).a;
            }
            String str2 = (String) b0kVar3.k(wol1.b);
            String str3 = (String) b0kVar3.k(wol1.c);
            boolean z5 = i4 <= 5;
            gt40 gt40Var3 = et40.a;
            gt40 gt40VarI = dm5.I(gt40Var3);
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = zx01.Y0;
                b0kVar3.s0(objT);
            }
            gt40 gt40VarX = iko1.x(gt40VarI, (iu30) objT);
            j2i j2iVarR = apo.r(-385210935, new p011(f, f2, nf50VarM, i3, i4, c380VarA, f3, z5, f5, mp10Var, str2, str3, str, z4, kee1Var, z3), b0kVar3);
            b0kVar2 = b0kVar3;
            j2h1.b(gt40VarX, ql3.g, j2iVarR, b0kVar2, 384, 0);
            gt40Var2 = gt40Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            gt40Var2 = gt40Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new q011(c380Var, mp10Var, str, f, f2, gt40Var2, z, z2, z3, fg50Var, i);
        }
    }

    public static final qx81 h0(e0h1 e0h1Var, beg begVar, List list) {
        return i0(list, e0h1Var, begVar.g(), false);
    }

    public static final gt40 i(int i, int i2, boolean z) {
        et40 et40Var = et40.a;
        if (z) {
            return ow31.a(et40Var);
        }
        float f = i;
        return eqr0.H(ow31.a(et40Var), (i2 * 8.0f) / f, 0.0f, (8.0f * ((i - 1) - i2)) / f, 0.0f, 10);
    }

    public static qx81 i0(List list, e0h1 e0h1Var, h0h1 h0h1Var, boolean z) {
        zpi0 zpi0VarQ;
        wim0 wim0Var;
        zpi0 zpi0VarF;
        zpi0 zpi0Var;
        zpi0 zpi0VarC0;
        if (e0h1Var.isEmpty() && list.isEmpty() && !z && h0h1Var.s() != null) {
            jfg jfgVarS = h0h1Var.s();
            jfgVarS.getClass();
            return jfgVarS.m();
        }
        y0h1 y0h1VarS = h0h1Var.s();
        if (y0h1VarS instanceof y0h1) {
            zpi0VarQ = y0h1VarS.m().E();
        } else {
            if (y0h1VarS instanceof beg) {
                int i = kht.a;
                kht.h(iht.c(y0h1VarS));
                boolean zIsEmpty = list.isEmpty();
                g8b0 g8b0Var = g8b0.b;
                if (zIsEmpty) {
                    beg begVar = (beg) y0h1VarS;
                    wim0Var = begVar instanceof wim0 ? (wim0) begVar : null;
                    if (wim0Var == null || (zpi0VarC0 = wim0Var.c0(g8b0Var)) == null) {
                        zpi0VarQ = begVar.R();
                    } else {
                        zpi0Var = zpi0VarC0;
                    }
                } else {
                    beg begVar2 = (beg) y0h1VarS;
                    j1h1 j1h1VarI = j0h1.b.i(h0h1Var, list);
                    wim0Var = begVar2 instanceof wim0 ? (wim0) begVar2 : null;
                    if (wim0Var == null || (zpi0VarF = wim0Var.f(j1h1VarI, g8b0Var)) == null) {
                        zpi0VarQ = begVar2.y(j1h1VarI);
                    } else {
                        zpi0Var = zpi0VarF;
                    }
                }
                return k0(e0h1Var, h0h1Var, list, z, zpi0Var, new d8b0(list, e0h1Var, h0h1Var, z));
            }
            if (y0h1VarS instanceof jit) {
                zpi0VarQ = bkz.a(4, true, new String[]{((jit) y0h1VarS).getName().a});
            } else {
                if (!(h0h1Var instanceof e890)) {
                    ncn0.f("Unsupported classifier: ", y0h1VarS, " for constructor: ", h0h1Var);
                    return null;
                }
                zpi0VarQ = ryn1.q("member scope for intersection type", ((e890) h0h1Var).b);
            }
        }
        zpi0Var = zpi0VarQ;
        return k0(e0h1Var, h0h1Var, list, z, zpi0Var, new d8b0(list, e0h1Var, h0h1Var, z));
    }

    public static final void j(int i, String str, Function0 function0, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1563734609);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else {
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(str), function0), jdx.c, null, null, null, null, null, null, null, null, apo.r(-2099122224, new tej0(str, (byte) 13), x340Var), x340Var, 48, 48, 2044);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ql(str, function0, i, (byte) 22);
        }
    }

    public static final qx81 j0(List list, zpi0 zpi0Var, e0h1 e0h1Var, h0h1 h0h1Var, boolean z) {
        rx81 rx81Var = new rx81(h0h1Var, list, z, zpi0Var, new d8b0(list, zpi0Var, e0h1Var, h0h1Var, z));
        return e0h1Var.isEmpty() ? rx81Var : new tx81(rx81Var, e0h1Var);
    }

    public static final void k(p8h1 p8h1Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2085553293);
        int i2 = (x340Var.i(p8h1Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            l480 l480Var = l480.a;
            s480 s480Var = new s480(p8h1Var, j2iVar);
            qim0 qim0Var3 = nim0.a;
            otw.c(l480Var, s480Var, qim0Var3, (ipb1) null, x340Var, 384, 8);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wpg1((Object) p8h1Var, qim0Var2, j2iVar, i, (byte) 5);
        }
    }

    public static final qx81 k0(e0h1 e0h1Var, h0h1 h0h1Var, List list, boolean z, zpi0 zpi0Var, iu30 iu30Var) {
        rx81 rx81Var = new rx81(h0h1Var, list, z, zpi0Var, iu30Var);
        return e0h1Var.isEmpty() ? rx81Var : new tx81(rx81Var, e0h1Var);
    }

    public static int l(pyp0 pyp0Var, boolean z) {
        int i = pyp0Var.b;
        int i2 = pyp0Var.c;
        int i3 = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        byte[][] bArr = (byte[][]) pyp0Var.d;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            byte b2 = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                byte b3 = z ? bArr[i5][i7] : bArr[i7][i5];
                if (b3 == b2) {
                    i6++;
                } else {
                    if (i6 >= 5) {
                        i4 += i6 - 2;
                    }
                    i6 = 1;
                    b2 = b3;
                }
            }
            if (i6 >= 5) {
                i4 = (i6 - 2) + i4;
            }
        }
        return i4;
    }

    public static void l0(int i, int i2) {
        String strR;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strR = h4o1.r("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    hhg1.n(f4i1.c(i2, "negative size: "));
                    return;
                }
                strR = h4o1.r("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strR);
        }
    }

    public static nf50 m(int i, float f, float f2, float f3, float f4, fg50 fg50Var, int i2) {
        int i3;
        Object mmr0Var;
        yxh yxhVarS;
        nf50 nf50Var;
        float fE;
        fg50 fg50Var2 = (i2 & 256) != 0 ? fg50.a : fg50Var;
        if (i > 0 && p3v.b(f, f3) >= 0 && p3v.b(f2, f3) >= 0) {
            float f5 = zjy.p(8.0f, new p3v(8.0f)).a;
            int i4 = (int) ((f + 8.0f) / (f3 + 8.0f));
            if (i4 > 10) {
                i4 = 10;
            }
            if (i4 >= 1) {
                float f6 = f2 - f5;
                int i5 = (int) (f6 / (f3 + f5));
                if (i5 > 5) {
                    i5 = 5;
                }
                boolean z = false;
                if (p3v.b(f4, 0.0f) > 0) {
                    i3 = (int) (f6 / ((f3 + f4) + f5));
                    if (i3 > 5) {
                        i3 = 5;
                    }
                } else {
                    i3 = 0;
                }
                boolean z2 = p3v.b(f4, 0.0f) > 0;
                smc0 smc0VarN = k4p1.n();
                if (1 <= i4) {
                    int i6 = 1;
                    while (true) {
                        int i7 = i / i6;
                        if (z2) {
                            smc0VarN.add(new of50(i6, 1, z));
                            if (i3 >= 2) {
                                if (i7 > i3) {
                                    i7 = i3;
                                }
                                if (i7 < 2) {
                                    i7 = 2;
                                }
                                smc0VarN.add(new of50(i6, i7, true));
                            } else if (i5 >= 2) {
                                if (i7 > i5) {
                                    i7 = i5;
                                }
                                if (i7 < 2) {
                                    i7 = 2;
                                }
                                smc0VarN.add(new of50(i6, i7, false));
                            }
                        } else {
                            boolean z3 = z;
                            if (i7 > i5) {
                                i7 = i5;
                            }
                            if (i7 < 1) {
                                i7 = 1;
                            }
                            smc0VarN.add(new of50(i6, i7, z3));
                        }
                        if (i6 == i4) {
                            break;
                        }
                        i6++;
                        z = false;
                    }
                }
                smc0 smc0VarK = k4p1.k(smc0VarN);
                ArrayList arrayList = new ArrayList();
                rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
                while (true) {
                    rmc0 rmc0Var = rmc0VarListIterator;
                    mmr0Var = null;
                    if (!rmc0Var.hasNext()) {
                        break;
                    }
                    of50 of50Var = (of50) rmc0Var.next();
                    int i8 = of50Var.a;
                    int i9 = of50Var.b;
                    boolean z4 = of50Var.c;
                    if (i9 != 1 || !z4) {
                        float f7 = (f - ((i8 - 1) * 8.0f)) / i8;
                        if (i9 == 1) {
                            fE = f2;
                        } else if (z4) {
                            float f8 = i9;
                            fE = ktd.e(f4, f8, f2 - ((i9 + 1) * f5), f8);
                        } else {
                            fE = (f2 - ((i9 + 1) * f5)) / i9;
                        }
                        float fMin = Math.min(77.0f, Math.min(f7, fE));
                        if (p3v.b(fMin, f3) >= 0) {
                            int i10 = i9 * i8;
                            int iMin = Math.min(i, i10);
                            mmr0Var = new mmr0(new nf50(fMin, i9, i8, z4), new pg50(-(i10 - iMin), iMin * fMin * fMin, iMin, z4, i8));
                        }
                    }
                    if (mmr0Var != null) {
                        arrayList.add(mmr0Var);
                    }
                }
                int iOrdinal = fg50Var2.ordinal();
                if (iOrdinal == 0) {
                    yxhVarS = pap1.s(zx01.b1, zx01.c1, zx01.d1, zx01.e1, t011.b);
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    yxhVarS = pap1.s(t011.c, t011.d, t011.e, t011.f, zx01.a1);
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    loop2: while (true) {
                        mmr0Var = next;
                        do {
                            if (!it.hasNext()) {
                                break loop2;
                            }
                            next = it.next();
                        } while (yxhVarS.compare((pg50) ((mmr0) mmr0Var).b, (pg50) ((mmr0) next).b) >= 0);
                    }
                }
                mmr0 mmr0Var2 = (mmr0) mmr0Var;
                if (mmr0Var2 != null && (nf50Var = (nf50) mmr0Var2.a) != null) {
                    return nf50Var;
                }
            }
        }
        return a;
    }

    public static void m0(int i, int i2, int i3) {
        String strN0;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strN0 = n0(i, i3, "start index");
            } else {
                strN0 = (i2 < 0 || i2 > i3) ? n0(i2, i3, "end index") : h4o1.r("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strN0);
        }
    }

    public static int n(int i, byte[] bArr, int i2, int i3, g290 g290Var, m36 m36Var) {
        yob yobVar = (yob) g290Var;
        int iV = V(bArr, i2, m36Var);
        yobVar.c(m36Var.c != 0);
        while (iV < i3) {
            int iT = T(bArr, iV, m36Var);
            if (i != m36Var.b) {
                break;
            }
            iV = V(bArr, iT, m36Var);
            yobVar.c(m36Var.c != 0);
        }
        return iV;
    }

    public static String n0(int i, int i2, String str) {
        if (i < 0) {
            return h4o1.r("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return h4o1.r("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        hhg1.n(f4i1.c(i2, "negative size: "));
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int o(byte[] bArr, int i, m36 m36Var) throws InvalidProtocolBufferException {
        int iT = T(bArr, i, m36Var);
        int i2 = m36Var.b;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.c();
        }
        if (i2 > bArr.length - iT) {
            throw InvalidProtocolBufferException.e();
        }
        if (i2 == 0) {
            m36Var.a = ohc.b;
            return iT;
        }
        m36Var.a = ohc.d(iT, bArr, i2);
        return iT + i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException */
    public static int p(int i, byte[] bArr, int i2, int i3, g290 g290Var, m36 m36Var) throws InvalidProtocolBufferException {
        int iT = T(bArr, i2, m36Var);
        int i4 = m36Var.b;
        if (i4 < 0) {
            throw InvalidProtocolBufferException.c();
        }
        if (i4 > bArr.length - iT) {
            throw InvalidProtocolBufferException.e();
        }
        if (i4 == 0) {
            g290Var.add(ohc.b);
        } else {
            g290Var.add(ohc.d(iT, bArr, i4));
            iT += i4;
        }
        while (iT < i3) {
            int iT2 = T(bArr, iT, m36Var);
            if (i != m36Var.b) {
                break;
            }
            iT = T(bArr, iT2, m36Var);
            int i5 = m36Var.b;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.c();
            }
            if (i5 > bArr.length - iT) {
                throw InvalidProtocolBufferException.e();
            }
            if (i5 == 0) {
                g290Var.add(ohc.b);
            } else {
                g290Var.add(ohc.d(iT, bArr, i5));
                iT += i5;
            }
        }
        return iT;
    }

    public static double q(byte[] bArr, int i) {
        return Double.longBitsToDouble(u(bArr, i));
    }

    public static int r(int i, byte[] bArr, int i2, int i3, g290 g290Var, m36 m36Var) {
        tqu tquVar = (tqu) g290Var;
        tquVar.c(q(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iT = T(bArr, i4, m36Var);
            if (i != m36Var.b) {
                break;
            }
            tquVar.c(Double.longBitsToDouble(u(bArr, iT)));
            i4 = iT + 8;
        }
        return i4;
    }

    public static int s(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int t(int i, byte[] bArr, int i2, int i3, g290 g290Var, m36 m36Var) {
        dr80 dr80Var = (dr80) g290Var;
        dr80Var.c(s(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iT = T(bArr, i4, m36Var);
            if (i != m36Var.b) {
                break;
            }
            dr80Var.c(s(bArr, iT));
            i4 = iT + 4;
        }
        return i4;
    }

    public static long u(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int v(int i, byte[] bArr, int i2, int i3, g290 g290Var, m36 m36Var) {
        s4f0 s4f0Var = (s4f0) g290Var;
        s4f0Var.c(u(bArr, i2));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int iT = T(bArr, i4, m36Var);
            if (i != m36Var.b) {
                break;
            }
            s4f0Var.c(u(bArr, iT));
            i4 = iT + 8;
        }
        return i4;
    }

    public static float w(byte[] bArr, int i) {
        return Float.intBitsToFloat(s(bArr, i));
    }

    public static int x(int i, byte[] bArr, int i2, int i3, g290 g290Var, m36 m36Var) {
        xq20 xq20Var = (xq20) g290Var;
        xq20Var.c(w(bArr, i2));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int iT = T(bArr, i4, m36Var);
            if (i != m36Var.b) {
                break;
            }
            xq20Var.c(Float.intBitsToFloat(s(bArr, iT)));
            i4 = iT + 4;
        }
        return i4;
    }

    public static int y(rm41 rm41Var, byte[] bArr, int i, int i2, int i3, m36 m36Var) {
        g gVar = (g) rm41Var;
        Object objC = gVar.c();
        int iA = gVar.A(objC, bArr, i, i2, i3, m36Var);
        gVar.a(objC);
        m36Var.a = objC;
        return iA;
    }

    public static int z(rm41 rm41Var, int i, byte[] bArr, int i2, int i3, g290 g290Var, m36 m36Var) {
        int i4 = (i & (-8)) | 4;
        int iY = y(rm41Var, bArr, i2, i3, i4, m36Var);
        g290Var.add(m36Var.a);
        while (iY < i3) {
            int iT = T(bArr, iY, m36Var);
            if (i != m36Var.b) {
                break;
            }
            iY = y(rm41Var, bArr, iT, i3, i4, m36Var);
            g290Var.add(m36Var.a);
        }
        return iY;
    }
}
