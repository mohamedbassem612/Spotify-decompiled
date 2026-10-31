package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class m37 {
    public static final List a;
    public static final List b;
    public static final List c;
    public static final int d;

    static {
        Float fValueOf = Float.valueOf(48.0f);
        List listM = p7h.M(new Float[]{fValueOf, Float.valueOf(52.0f), fValueOf, Float.valueOf(50.0f)});
        a = listM;
        Float fValueOf2 = Float.valueOf(0.0f);
        List listM2 = p7h.M(new Float[]{fValueOf2, Float.valueOf(4.0f), fValueOf2, Float.valueOf(8.0f)});
        b = listM2;
        List listM3 = p7h.M(new Float[]{Float.valueOf(-16.0f), Float.valueOf(-2.0f), Float.valueOf(-8.0f), Float.valueOf(-4.0f)});
        c = listM3;
        d = Math.min(listM.size(), Math.min(listM2.size(), listM3.size()));
    }

    public static final void a(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        cr31 cr31VarB;
        qim0 qim0Var3;
        pre0 pre0Var;
        boolean z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(775872569);
        char c2 = 2;
        int i2 = (x340Var.g(c380Var) ? 4 : 2) | i | 48;
        boolean z2 = false;
        int i3 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z3 = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                Iterator it = c380Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kvd1) it.next()).b);
                }
                objT = b(arrayList);
                x340Var.s0(objT);
            }
            pre0 pre0Var2 = (pre0) objT;
            float f = pre0Var2.b;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(u291.h(qim0Var4, f), 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(696679794);
            int i4 = 0;
            for (Object obj : o7h.d1(c380Var, d)) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                kvd1 kvd1Var = (kvd1) obj;
                String str = kvd1Var.a;
                if (str == null) {
                    pre0Var = pre0Var2;
                    qim0Var3 = qim0Var4;
                    z = z2;
                } else {
                    qre0 qre0Var = (qre0) pre0Var2.a.get(i4);
                    int iOrdinal = kvd1Var.b.ordinal();
                    if (iOrdinal == 0) {
                        cr31VarB = er31.a;
                    } else {
                        if (iOrdinal != i3) {
                            eg.o();
                            return;
                        }
                        cr31VarB = er31.b(8.0f);
                    }
                    qim0Var3 = qim0Var4;
                    pre0Var = pre0Var2;
                    z = z2;
                    eso1.e(Uri.parse(str), isl.a, i1p1.q(u291.r(k1u.u(lrn1.x(eqr0.C(qim0Var4, qre0Var.a, qre0Var.b), i4), qre0Var.d), qre0Var.c), cr31VarB), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4088);
                }
                c2 = 2;
                i3 = 1;
                z2 = z;
                i4 = i5;
                qim0Var4 = qim0Var3;
                pre0Var2 = pre0Var;
            }
            x340Var.r(z2);
            x340Var.r(true);
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e(c380Var, qim0Var2, i, (byte) 2);
        }
    }

    public static final pre0 b(List list) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fSin;
        List listD1 = o7h.d1(list, d);
        ArrayList arrayList = new ArrayList(q7h.U(listD1, 10));
        int i = 0;
        float fMax = 0.0f;
        float f = 0.0f;
        for (Object obj : listD1) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            qvd1 qvd1Var = (qvd1) obj;
            int iOrdinal = qvd1Var.ordinal();
            if (iOrdinal == 0) {
                fFloatValue = ((Number) a.get(i)).floatValue();
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                fFloatValue = 48.0f;
            }
            int iOrdinal2 = qvd1Var.ordinal();
            if (iOrdinal2 == 0) {
                fFloatValue2 = ((Number) b.get(i)).floatValue();
            } else {
                if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                fFloatValue2 = 0.0f;
            }
            int iOrdinal3 = qvd1Var.ordinal();
            if (iOrdinal3 == 0) {
                fFloatValue3 = 0.0f;
            } else {
                if (iOrdinal3 != 1) {
                    eg.o();
                    return null;
                }
                fFloatValue3 = ((Number) c.get(i)).floatValue();
            }
            if (fFloatValue3 == 0.0f) {
                fSin = fFloatValue;
            } else {
                double radians = Math.toRadians(Math.abs(fFloatValue3));
                fSin = (float) (((Math.sin(radians) + Math.cos(radians)) * ((double) (fFloatValue - 16.0f))) + 16.0d);
            }
            float f2 = (fSin - fFloatValue) / 2.0f;
            qre0 qre0Var = new qre0(f + f2, f2 + fFloatValue2, fFloatValue, fFloatValue3);
            f += fSin - 8.0f;
            fMax = Math.max(fMax, fFloatValue2 + fSin);
            arrayList.add(qre0Var);
            i = i2;
        }
        return new pre0(fMax, arrayList);
    }
}
