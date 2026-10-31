package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
import java.util.logging.Level;
import p.ghc;
import p.k290;
import p.loi1;
import p.mvb0;
import p.ohc;
import p.rm41;
import p.soi1;
import p.u8;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d {
    public final c a;

    public d(c cVar) {
        k290.a(cVar, "output");
        this.a = cVar;
        cVar.a = this;
    }

    public static d a(c cVar) {
        d dVar = cVar.a;
        return dVar != null ? dVar : new d(cVar);
    }

    public final void A(int i, long j) {
        c cVar = this.a;
        cVar.p(i, 1);
        cVar.n(j);
    }

    public final void B(int i, List list, boolean z) {
        int i2 = 0;
        c cVar = this.a;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                cVar.p(i, 1);
                cVar.n(jLongValue);
                i2++;
            }
            return;
        }
        cVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        cVar.q(i3);
        while (i2 < list.size()) {
            cVar.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void C(int i, int i2) {
        c cVar = this.a;
        cVar.p(i, 0);
        cVar.q((i2 >> 31) ^ (i2 << 1));
    }

    public final void D(int i, List list, boolean z) {
        c cVar = this.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                cVar.p(i, 0);
                cVar.q((iIntValue >> 31) ^ (iIntValue << 1));
            }
            return;
        }
        cVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += c.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        cVar.q(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            int iIntValue3 = ((Integer) list.get(i5)).intValue();
            cVar.q((iIntValue3 >> 31) ^ (iIntValue3 << 1));
        }
    }

    public final void E(int i, long j) {
        c cVar = this.a;
        cVar.p(i, 0);
        cVar.r((j >> 63) ^ (j << 1));
    }

    public final void F(int i, List list, boolean z) {
        c cVar = this.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                cVar.p(i, 0);
                cVar.r((jLongValue >> 63) ^ (jLongValue << 1));
            }
            return;
        }
        cVar.p(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iJ += c.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        cVar.q(iJ);
        for (int i4 = 0; i4 < list.size(); i4++) {
            long jLongValue3 = ((Long) list.get(i4)).longValue();
            cVar.r((jLongValue3 >> 63) ^ (jLongValue3 << 1));
        }
    }

    public final void G(int i) {
        this.a.p(i, 3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.loi1 */
    public final void H(int i, String str) throws CodedOutputStream.OutOfSpaceException {
        c cVar = this.a;
        cVar.p(i, 2);
        int i2 = cVar.c;
        byte[] bArr = cVar.b;
        int i3 = cVar.d;
        try {
            int i4 = c.i(str.length() * 3);
            int i5 = c.i(str.length());
            if (i5 != i4) {
                cVar.q(soi1.a(str));
                int i6 = cVar.d;
                cVar.d = soi1.a.v(str, bArr, i6, i2 - i6);
                return;
            }
            int i7 = i3 + i5;
            cVar.d = i7;
            int iV = soi1.a.v(str, bArr, i7, i2 - i7);
            cVar.d = i3;
            cVar.q((iV - i3) - i5);
            cVar.d = iV;
        } catch (IndexOutOfBoundsException e) {
            throw new CodedOutputStream.OutOfSpaceException(e);
        } catch (loi1 e2) {
            cVar.d = i3;
            c.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e2);
            byte[] bytes = str.getBytes(k290.a);
            try {
                cVar.q(bytes.length);
                cVar.l(bytes, 0, bytes.length);
            } catch (CodedOutputStream.OutOfSpaceException e3) {
                throw e3;
            } catch (IndexOutOfBoundsException e4) {
                throw new CodedOutputStream.OutOfSpaceException(e4);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.crypto.tink.shaded.protobuf.CodedOutputStream$OutOfSpaceException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.loi1 */
    public final void I(int i, List list) throws CodedOutputStream.OutOfSpaceException {
        boolean z = list instanceof mvb0;
        c cVar = this.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str = (String) list.get(i2);
                cVar.p(i, 2);
                int i3 = cVar.c;
                byte[] bArr = cVar.b;
                int i4 = cVar.d;
                try {
                    int i5 = c.i(str.length() * 3);
                    int i6 = c.i(str.length());
                    if (i6 == i5) {
                        int i7 = i4 + i6;
                        cVar.d = i7;
                        int iV = soi1.a.v(str, bArr, i7, i3 - i7);
                        cVar.d = i4;
                        cVar.q((iV - i4) - i6);
                        cVar.d = iV;
                    } else {
                        cVar.q(soi1.a(str));
                        int i8 = cVar.d;
                        cVar.d = soi1.a.v(str, bArr, i8, i3 - i8);
                    }
                } catch (loi1 e) {
                    cVar.d = i4;
                    c.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
                    byte[] bytes = str.getBytes(k290.a);
                    try {
                        cVar.q(bytes.length);
                        cVar.l(bytes, 0, bytes.length);
                    } catch (CodedOutputStream.OutOfSpaceException e2) {
                        throw e2;
                    } catch (IndexOutOfBoundsException e3) {
                        throw new CodedOutputStream.OutOfSpaceException(e3);
                    }
                } catch (IndexOutOfBoundsException e4) {
                    throw new CodedOutputStream.OutOfSpaceException(e4);
                }
            }
            return;
        }
        mvb0 mvb0Var = (mvb0) list;
        for (int i9 = 0; i9 < list.size(); i9++) {
            Object objJ = mvb0Var.j(i9);
            if (objJ instanceof String) {
                String str2 = (String) objJ;
                cVar.p(i, 2);
                int i10 = cVar.c;
                byte[] bArr2 = cVar.b;
                int i11 = cVar.d;
                try {
                    int i12 = c.i(str2.length() * 3);
                    int i13 = c.i(str2.length());
                    if (i13 == i12) {
                        int i14 = i11 + i13;
                        cVar.d = i14;
                        int iV2 = soi1.a.v(str2, bArr2, i14, i10 - i14);
                        cVar.d = i11;
                        cVar.q((iV2 - i11) - i13);
                        cVar.d = iV2;
                    } else {
                        cVar.q(soi1.a(str2));
                        int i15 = cVar.d;
                        cVar.d = soi1.a.v(str2, bArr2, i15, i10 - i15);
                    }
                } catch (loi1 e5) {
                    cVar.d = i11;
                    c.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e5);
                    byte[] bytes2 = str2.getBytes(k290.a);
                    try {
                        cVar.q(bytes2.length);
                        cVar.l(bytes2, 0, bytes2.length);
                    } catch (CodedOutputStream.OutOfSpaceException e6) {
                        throw e6;
                    } catch (IndexOutOfBoundsException e7) {
                        throw new CodedOutputStream.OutOfSpaceException(e7);
                    }
                } catch (IndexOutOfBoundsException e8) {
                    throw new CodedOutputStream.OutOfSpaceException(e8);
                }
            } else {
                ghc ghcVar = (ohc) objJ;
                cVar.p(i, 2);
                cVar.q(ghcVar.size());
                ghc ghcVar2 = ghcVar;
                cVar.l(ghcVar2.d, ghcVar2.k(), ghcVar2.size());
            }
        }
    }

    public final void J(int i, int i2) {
        c cVar = this.a;
        cVar.p(i, 0);
        cVar.q(i2);
    }

    public final void K(int i, List list, boolean z) {
        c cVar = this.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                cVar.p(i, 0);
                cVar.q(iIntValue);
            }
            return;
        }
        cVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += c.i(((Integer) list.get(i4)).intValue());
        }
        cVar.q(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            cVar.q(((Integer) list.get(i5)).intValue());
        }
    }

    public final void L(int i, long j) {
        c cVar = this.a;
        cVar.p(i, 0);
        cVar.r(j);
    }

    public final void M(int i, List list, boolean z) {
        c cVar = this.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                cVar.p(i, 0);
                cVar.r(jLongValue);
            }
            return;
        }
        cVar.p(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += c.j(((Long) list.get(i3)).longValue());
        }
        cVar.q(iJ);
        for (int i4 = 0; i4 < list.size(); i4++) {
            cVar.r(((Long) list.get(i4)).longValue());
        }
    }

    public final void b(int i, boolean z) {
        c cVar = this.a;
        cVar.p(i, 0);
        cVar.k(z ? (byte) 1 : (byte) 0);
    }

    public final void c(int i, List list, boolean z) {
        c cVar = this.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                boolean zBooleanValue = ((Boolean) list.get(i2)).booleanValue();
                cVar.p(i, 0);
                cVar.k(zBooleanValue ? (byte) 1 : (byte) 0);
            }
            return;
        }
        cVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        cVar.q(i3);
        for (int i5 = 0; i5 < list.size(); i5++) {
            cVar.k(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
        }
    }

    public final void d(int i, ohc ohcVar) {
        c cVar = this.a;
        cVar.p(i, 2);
        cVar.q(ohcVar.size());
        ghc ghcVar = (ghc) ohcVar;
        cVar.l(ghcVar.d, ghcVar.k(), ghcVar.size());
    }

    public final void e(int i, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            ghc ghcVar = (ohc) list.get(i2);
            c cVar = this.a;
            cVar.p(i, 2);
            cVar.q(ghcVar.size());
            ghc ghcVar2 = ghcVar;
            cVar.l(ghcVar2.d, ghcVar2.k(), ghcVar2.size());
        }
    }

    public final void f(double d, int i) {
        c cVar = this.a;
        cVar.getClass();
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        cVar.p(i, 1);
        cVar.n(jDoubleToRawLongBits);
    }

    public final void g(int i, List list, boolean z) {
        int i2 = 0;
        c cVar = this.a;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                cVar.getClass();
                long jDoubleToRawLongBits = Double.doubleToRawLongBits(dDoubleValue);
                cVar.p(i, 1);
                cVar.n(jDoubleToRawLongBits);
                i2++;
            }
            return;
        }
        cVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        cVar.q(i3);
        while (i2 < list.size()) {
            cVar.n(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public final void h(int i) {
        this.a.p(i, 4);
    }

    public final void i(int i, int i2) {
        c cVar = this.a;
        cVar.p(i, 0);
        cVar.o(i2);
    }

    public final void j(int i, List list, boolean z) {
        c cVar = this.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                cVar.p(i, 0);
                cVar.o(iIntValue);
            }
            return;
        }
        cVar.p(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF += c.f(((Integer) list.get(i3)).intValue());
        }
        cVar.q(iF);
        for (int i4 = 0; i4 < list.size(); i4++) {
            cVar.o(((Integer) list.get(i4)).intValue());
        }
    }

    public final void k(int i, int i2) {
        c cVar = this.a;
        cVar.p(i, 5);
        cVar.m(i2);
    }

    public final void l(int i, List list, boolean z) {
        int i2 = 0;
        c cVar = this.a;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                cVar.p(i, 5);
                cVar.m(iIntValue);
                i2++;
            }
            return;
        }
        cVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        cVar.q(i3);
        while (i2 < list.size()) {
            cVar.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void m(int i, long j) {
        c cVar = this.a;
        cVar.p(i, 1);
        cVar.n(j);
    }

    public final void n(int i, List list, boolean z) {
        int i2 = 0;
        c cVar = this.a;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                cVar.p(i, 1);
                cVar.n(jLongValue);
                i2++;
            }
            return;
        }
        cVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        cVar.q(i3);
        while (i2 < list.size()) {
            cVar.n(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void o(float f, int i) {
        c cVar = this.a;
        cVar.getClass();
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        cVar.p(i, 5);
        cVar.m(iFloatToRawIntBits);
    }

    public final void p(int i, List list, boolean z) {
        int i2 = 0;
        c cVar = this.a;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                cVar.getClass();
                int iFloatToRawIntBits = Float.floatToRawIntBits(fFloatValue);
                cVar.p(i, 5);
                cVar.m(iFloatToRawIntBits);
                i2++;
            }
            return;
        }
        cVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        cVar.q(i3);
        while (i2 < list.size()) {
            cVar.m(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public final void q(int i, Object obj, rm41 rm41Var) {
        c cVar = this.a;
        cVar.p(i, 3);
        rm41Var.d((u8) obj, cVar.a);
        cVar.p(i, 4);
    }

    public final void r(int i, List list, rm41 rm41Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            q(i, list.get(i2), rm41Var);
        }
    }

    public final void s(int i, int i2) {
        c cVar = this.a;
        cVar.p(i, 0);
        cVar.o(i2);
    }

    public final void t(int i, List list, boolean z) {
        c cVar = this.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                cVar.p(i, 0);
                cVar.o(iIntValue);
            }
            return;
        }
        cVar.p(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF += c.f(((Integer) list.get(i3)).intValue());
        }
        cVar.q(iF);
        for (int i4 = 0; i4 < list.size(); i4++) {
            cVar.o(((Integer) list.get(i4)).intValue());
        }
    }

    public final void u(int i, long j) {
        c cVar = this.a;
        cVar.p(i, 0);
        cVar.r(j);
    }

    public final void v(int i, List list, boolean z) {
        c cVar = this.a;
        if (!z) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                cVar.p(i, 0);
                cVar.r(jLongValue);
            }
            return;
        }
        cVar.p(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += c.j(((Long) list.get(i3)).longValue());
        }
        cVar.q(iJ);
        for (int i4 = 0; i4 < list.size(); i4++) {
            cVar.r(((Long) list.get(i4)).longValue());
        }
    }

    public final void w(int i, Object obj, rm41 rm41Var) {
        e eVar = (u8) obj;
        c cVar = this.a;
        cVar.p(i, 2);
        eVar.getClass();
        e eVar2 = eVar;
        int iG = eVar2.memoizedSerializedSize;
        if (iG == -1) {
            iG = rm41Var.g(eVar);
            eVar2.memoizedSerializedSize = iG;
        }
        cVar.q(iG);
        rm41Var.d(eVar, cVar.a);
    }

    public final void x(int i, List list, rm41 rm41Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            w(i, list.get(i2), rm41Var);
        }
    }

    public final void y(int i, int i2) {
        c cVar = this.a;
        cVar.p(i, 5);
        cVar.m(i2);
    }

    public final void z(int i, List list, boolean z) {
        int i2 = 0;
        c cVar = this.a;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                cVar.p(i, 5);
                cVar.m(iIntValue);
                i2++;
            }
            return;
        }
        cVar.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        cVar.q(i3);
        while (i2 < list.size()) {
            cVar.m(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }
}
