package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final /* synthetic */ class bkg0 implements Update {
    public final Next a(Object obj, Object obj2) {
        boolean zJ;
        hkg0 hkg0Var = (hkg0) obj;
        yjg0 yjg0Var = (yjg0) obj2;
        boolean z = hkg0Var.d;
        fae1 fae1Var = hkg0Var.b;
        boolean z2 = hkg0Var.i;
        rrn1 rrn1Var = hkg0Var.g;
        boolean z3 = yjg0Var instanceof njg0;
        ndr0 ndr0Var = ndr0.c;
        if (z3) {
            tb0 tb0Var = ((njg0) yjg0Var).a;
            if ((tb0Var instanceof ob0) || (tb0Var instanceof sb0)) {
                if (!rrn1Var.equals(ndr0Var)) {
                    return Next.h(hkg0.a(hkg0Var, null, false, tb0Var, 1023));
                }
                boolean z4 = hkg0Var.d;
                return Next.h(new hkg0(hkg0Var.a, hkg0Var.b, hkg0Var.c, z4, hkg0Var.e, hkg0Var.f, z4 ? new idr0() : new aer0(), hkg0Var.h, hkg0Var.i, hkg0Var.j, tb0Var));
            }
            if (tb0Var.equals(qb0.a) || tb0Var.equals(pb0.a)) {
                return Next.h(new hkg0(hkg0Var.a, hkg0Var.b, hkg0Var.c, hkg0Var.d, hkg0Var.e, hkg0Var.f, ndr0Var, hkg0Var.h, hkg0Var.i, hkg0Var.j, tb0Var));
            }
            eg.o();
            return null;
        }
        if (yjg0Var instanceof kjg0) {
            return rrn1Var.equals(ndr0Var) ? Next.a(Collections.singleton(new vig0(false))) : Next.a(Collections.singleton(new vig0(z2)));
        }
        boolean z5 = yjg0Var instanceof hjg0;
        jdr0 jdr0Var = jdr0.c;
        qdr0 qdr0Var = qdr0.c;
        if (z5) {
            if ((rrn1Var instanceof aer0) || (rrn1Var instanceof idr0)) {
                return hkg0Var.a ? Next.a(Collections.singleton(new yig0(z2))) : Next.a(Collections.singleton(new zig0(z2)));
            }
            if (rrn1Var.equals(ndr0Var)) {
                return Next.a(Collections.singleton(new vig0(false)));
            }
            if (rrn1Var.equals(qdr0Var)) {
                return Next.a(Collections.singleton(new vig0(z2)));
            }
            if (rrn1Var.equals(jdr0Var)) {
                return Next.h(hkg0.a(hkg0Var, z ? new idr0() : new aer0(), false, null, 1983));
            }
            eg.o();
            return null;
        }
        if (yjg0Var instanceof ljg0) {
            ljg0 ljg0Var = (ljg0) yjg0Var;
            for (mig0 mig0Var : hkg0Var.h) {
                cpa1 cpa1Var = ljg0Var.a;
                if (cpa1Var instanceof cpa1) {
                    zJ = u890.j(mig0Var.a.a, cpa1Var.a);
                } else {
                    if (!(cpa1Var instanceof jz3)) {
                        eg.o();
                        return null;
                    }
                    zJ = u890.j(mig0Var.a.a, ((jz3) cpa1Var).a);
                }
                if (zJ) {
                    return Next.i(hkg0.a(hkg0Var, jdr0Var, false, null, 1983), Collections.singleton(new wig0(mig0Var.a)));
                }
            }
            bhn0.t("Collection contains no element matching the predicate.");
            return null;
        }
        if (yjg0Var instanceof wjg0) {
            String str = ((wjg0) yjg0Var).a;
            if (rrn1Var instanceof idr0) {
                return Next.h(hkg0.a(hkg0Var, new idr0(str), false, null, 1983));
            }
            return rrn1Var instanceof aer0 ? Next.h(hkg0.a(hkg0Var, new aer0(str), false, null, 1983)) : Next.j();
        }
        if (yjg0Var.equals(xjg0.a)) {
            return Next.a(Collections.singleton(new vig0(z2)));
        }
        if (yjg0Var.equals(qjg0.a)) {
            return Next.h(hkg0.a(hkg0Var, z ? new idr0() : new aer0(), false, null, 1983));
        }
        if (yjg0Var.equals(vjg0.a)) {
            return Next.a(Collections.singleton(new vig0(false)));
        }
        if (yjg0Var instanceof tjg0) {
            le20 le20Var = ((tjg0) yjg0Var).a;
            if (rrn1Var instanceof jdr0) {
                return Next.a(Collections.singleton(new uig0(le20Var)));
            }
            if (rrn1Var instanceof idr0) {
                return Next.j();
            }
            if (rrn1Var.equals(ndr0Var)) {
                return Next.j();
            }
            if (rrn1Var.equals(qdr0Var)) {
                return Next.j();
            }
            if (rrn1Var instanceof aer0) {
                return Next.j();
            }
            eg.o();
            return null;
        }
        if (yjg0Var.equals(sjg0.a)) {
            return Next.h(hkg0.a(hkg0Var, qdr0Var, false, null, 1983));
        }
        if (yjg0Var instanceof pjg0) {
            pjg0 pjg0Var = (pjg0) yjg0Var;
            le20 le20Var2 = pjg0Var.a;
            woa1 woa1Var = le20Var2.c;
            boolean z6 = fae1Var instanceof bnv0;
            return Next.a(Collections.singleton(new bjg0(le20Var2, pjg0Var.b, new hpq0(woa1Var != null, z6, hkg0Var.c, true, hkg0Var.d, z6 ? ((bnv0) fae1Var).e : null, z6 ? ((bnv0) fae1Var).f : null, woa1Var != null ? woa1Var.c : null, woa1Var != null ? woa1Var.d : null, fae1Var != null ? fae1Var.m() : null), hkg0Var.k)));
        }
        if (yjg0Var.equals(ojg0.a)) {
            return Next.h(hkg0.a(hkg0Var, qdr0Var, false, null, 1983));
        }
        if (yjg0Var instanceof mjg0) {
            return !((mjg0) yjg0Var).a ? Next.a(Collections.singleton(new vig0(z2))) : Next.j();
        }
        if (yjg0Var.equals(ijg0.a)) {
            return Next.h(hkg0.a(hkg0Var, new aer0(), false, null, 1975));
        }
        if (yjg0Var.equals(jjg0.a)) {
            if (hkg0Var.j) {
                return Next.i(hkg0.a(hkg0Var, jdr0Var, false, null, 1983), Collections.singleton(xig0.c));
            }
            boolean z7 = fae1Var instanceof bnv0;
            return Next.a(Collections.singleton(new cjg0(z2, new q560(fae1Var != null ? fae1Var.m() : null, z7 ? ((bnv0) fae1Var).e : null, z7 ? ((bnv0) fae1Var).f : null, z7))));
        }
        if (!(yjg0Var instanceof ujg0)) {
            if (yjg0Var instanceof rjg0) {
                return Next.h(hkg0.a(hkg0Var, null, ((rjg0) yjg0Var).a, null, 1535));
            }
            eg.o();
            return null;
        }
        if (rrn1Var instanceof jdr0) {
            return Next.a(Collections.singleton(new ajg0(z2)));
        }
        if (rrn1Var instanceof idr0) {
            return Next.j();
        }
        if (rrn1Var.equals(ndr0Var)) {
            return Next.j();
        }
        if (rrn1Var.equals(qdr0Var)) {
            return Next.j();
        }
        if (rrn1Var instanceof aer0) {
            return Next.j();
        }
        eg.o();
        return null;
    }
}
