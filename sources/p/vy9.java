package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class vy9 {
    public static final long a = jhc1.c(700.0f, 337.0f);

    public static final float a(ty9 ty9Var, long j) {
        return yoi1.o(Math.min(s3v.b(j) / ty9Var.a, s3v.a(j) / ty9Var.b), 0.8f, 1.25f);
    }

    public static final long b(long j, long j2) {
        float fMin = Math.min(1.0f, Math.min(s3v.b(j2) / s3v.b(j), s3v.a(j2) / s3v.a(j)));
        return jhc1.c(s3v.b(j) * fMin, s3v.a(j) * fMin);
    }

    public static final ty9 c(ty9 ty9Var, long j) {
        float f;
        float fB;
        pkb0 pkb0VarA;
        float fB2 = s3v.b(j);
        float f2 = ty9Var.a;
        float fA = s3v.a(j);
        float f3 = ty9Var.b;
        float fMax = Math.max(fB2 / f2, fA / f3);
        float fE = ktd.e(f2, fMax, s3v.b(j), 2.0f);
        float fE2 = ktd.e(f3, fMax, s3v.a(j), 2.0f);
        float fA2 = a(ty9Var, j);
        float fE3 = ktd.e(f2, fA2, s3v.b(j), 2.0f);
        float fB3 = s3v.b(j);
        float fA3 = s3v.a(j);
        List list = ty9Var.c;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pkb0 pkb0Var = (pkb0) it.next();
            int i = pkb0Var.i;
            float f4 = pkb0Var.e;
            float f5 = pkb0Var.d;
            float f6 = pkb0Var.c;
            Iterator it2 = it;
            float f7 = pkb0Var.b;
            float f8 = fMax;
            if (uy9.a[l1d.C(i)] == 4) {
                pkb0VarA = pkb0.a(pkb0Var, (f7 * f8) + fE, (f6 * f8) + fE2, f5 * f8, f4 * f8, 993);
                f = f2;
            } else {
                int iC = l1d.C(i);
                f = f2;
                if (iC != 3) {
                    fB = iC != 4 ? (f7 * fA2) + fE3 : s3v.b(j) - ((f - f7) * fA2);
                } else {
                    fB = f7 * fA2;
                }
                int iC2 = l1d.C(i);
                pkb0VarA = pkb0.a(pkb0Var, fB, (iC2 == 1 || iC2 == 3) ? f6 * fA2 : s3v.a(j) - ((f3 - f6) * fA2), f5 * fA2, f4 * fA2, 993);
            }
            arrayList.add(pkb0VarA);
            it = it2;
            fMax = f8;
            f2 = f;
        }
        return new ty9(fB3, fA3, arrayList);
    }

    public static final String d(nbm1 nbm1Var) {
        return f4i1.f("wrapped_background_", nbm1Var.name().toLowerCase(Locale.ROOT), ":");
    }

    public static final f5t0 e(nbm1 nbm1Var) {
        int iOrdinal = nbm1Var.ordinal();
        if (iOrdinal == 0) {
            return new f5t0(1280, 721);
        }
        if (iOrdinal == 1) {
            return new f5t0(1050, 880);
        }
        if (iOrdinal == 2) {
            return new f5t0(640, 338);
        }
        if (iOrdinal == 3) {
            return new f5t0(480, 246);
        }
        if (iOrdinal == 4) {
            return new f5t0(300, 300);
        }
        eg.o();
        return null;
    }
}
