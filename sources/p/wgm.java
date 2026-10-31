package p;

import android.os.Parcelable;
import io.reactivex.rxjava3.core.Observable;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wgm implements vgm {
    public final ynb0 a;
    public final ynb0 b;
    public final ynb0 c;
    public final ynb0 d;
    public final ynb0 e;
    public final agc0 f;
    public final ynb0 g;
    public final i4q h;
    public final yhm i;
    public final em6 j;
    public final hs00 k;
    public final p5y l;
    public final ynb0 m;
    public final ynb0 n;
    public final wvd1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f134p;
    public final efr q;
    public final xe01 r;

    public wgm(dg30 dg30Var, ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3, ynb0 ynb0Var4, ynb0 ynb0Var5, agc0 agc0Var, ynb0 ynb0Var6, i4q i4qVar, yhm yhmVar, em6 em6Var, hs00 hs00Var, p5y p5yVar, ynb0 ynb0Var7, ynb0 ynb0Var8, wvd1 wvd1Var, boolean z, efr efrVar, ov20 ov20Var) {
        this.a = ynb0Var;
        this.b = ynb0Var2;
        this.c = ynb0Var3;
        this.d = ynb0Var4;
        this.e = ynb0Var5;
        this.f = agc0Var;
        this.g = ynb0Var6;
        this.h = i4qVar;
        this.i = yhmVar;
        this.j = em6Var;
        this.k = hs00Var;
        this.l = p5yVar;
        this.m = ynb0Var7;
        this.n = ynb0Var8;
        this.o = wvd1Var;
        this.f134p = z;
        this.q = efrVar;
        this.r = d5p1.t(((bw20) ov20Var).a("taste-profile-eligible", false), cto1.q(dg30Var), ey71.a, Boolean.FALSE);
    }

    public static ugo0 e(wgm wgmVar, String str, boolean z, boolean z2, String str2, mgo0 mgo0Var, int i) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        String str3 = (i & 8) != 0 ? null : str2;
        mgo0 mgo0Var2 = (i & 16) != 0 ? null : mgo0Var;
        if (z) {
            return new ugo0(wgmVar.k.b().contains(str), str, str3, false, z3, (String) null, mgo0Var2, 172);
        }
        return null;
    }

    public static String f(String str) {
        Set set = s4b1.f;
        String strF = uic.x(str).F();
        if (strF != null) {
            str = strF;
        }
        s4b1 s4b1VarX = uic.x(str);
        blc0 blc0Var = s4b1VarX.c;
        return (blc0Var == blc0.R3 || blc0Var == blc0.T3) ? s4b1VarX.G(0, 2) : str;
    }

    @Override // p.vgm
    public final boolean c(String str, tgm tgmVar) {
        if (!xzn1.l(str)) {
            return false;
        }
        if (tgmVar.i != null) {
            return true;
        }
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(f(str));
        v5b1 v5b1Var = s4b1VarX.d;
        b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
        return u890.j(type, wyu0.f) || u890.j(type, nyu0.e) || xgm.a().contains(s4b1VarX.c);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:115:0x031b  */
    @Override // p.vgm
    public final void d(String str, String str2, tv80 tv80Var, tgm tgmVar) throws NoWhenBranchMatchedException {
        lik1 lik1VarI;
        p860 p860Var;
        yhm yhmVar;
        int i;
        boolean z;
        int i2;
        String str3;
        String str4;
        ugo0 ugo0Var;
        boolean z2;
        int i3;
        String str5;
        wgm wgmVar;
        ugo0 ugo0VarE;
        vsf1 vsf1Var;
        ugo0 ugo0VarE2;
        r6h1 r6h1VarA;
        if (xzn1.l(str)) {
            String strF = f(str);
            if (str2 != null) {
                Parcelable.Creator creator = lik1.CREATOR;
                lik1VarI = oap1.i(str2);
            } else {
                lik1VarI = nik1.K1;
            }
            lik1 lik1Var = lik1VarI;
            yh10 yh10Var = tgmVar.i;
            p860 p860VarA = tgmVar.A;
            if (p860VarA != null) {
                d8h1 d8h1Var = (d8h1) o7h.C0(tv80Var.g.a);
                if (d8h1Var != null && (r6h1VarA = d8h1Var.a()) != null) {
                    p860VarA = p860.a(p860VarA, r6h1VarA);
                }
                p860Var = p860VarA;
            } else {
                p860Var = null;
            }
            tgm tgmVarA = tgm.a(tgmVar, false, false, 0, false, null, null, p860Var, false, -268435457);
            boolean z3 = tgmVarA.b;
            if (tgmVar.j && yh10Var != null) {
                h(lik1Var, strF, yh10Var, tv80Var, tgmVarA.A);
            }
            String str6 = strF;
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(str6);
            String str7 = lik1Var.a;
            String str8 = lik1Var.a;
            blc0 blc0Var = uic.x(str7).c;
            yh10 yh10Var2 = tgmVarA.i;
            int i4 = tgmVarA.F;
            boolean z4 = tgmVarA.w;
            String strA = yh10Var2 != null ? yh10Var2.b().a() : null;
            v5b1 v5b1Var = s4b1VarX.d;
            b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
            boolean zJ = u890.j(type, wyu0.f);
            agc0 agc0Var = this.f;
            if (zJ || u890.j(type, nyu0.e)) {
                agc0Var.getClass();
                j(lik1Var, sto1.m(str6) ? "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ" : str6, tgmVarA.b, tv80Var, strA, tgmVarA.w, tgmVarA.A);
                return;
            }
            int iOrdinal = s4b1VarX.c.ordinal();
            hs00 hs00Var = this.k;
            yhm yhmVar2 = this.i;
            switch (iOrdinal) {
                case 30:
                    String str9 = str6;
                    ugo0 ugo0Var2 = null;
                    p860 p860Var2 = tgmVarA.A;
                    boolean z5 = blc0Var != blc0.u1;
                    boolean z6 = tgmVarA.g;
                    if (z3) {
                        yhmVar = yhmVar2;
                        i = 2;
                        ugo0Var2 = new ugo0(hs00Var.b().contains(str9), str9, strA, false, false, (String) null, (mgo0) null, 492);
                        str9 = str9;
                    } else {
                        yhmVar = yhmVar2;
                        i = 2;
                    }
                    ugo0 ugo0Var3 = ugo0Var2;
                    boolean z7 = tgmVarA.k;
                    int iC = l1d.C(i4);
                    if (iC != 0) {
                        z = true;
                        if (iC == 1) {
                            i2 = 1;
                        } else if (iC != i) {
                            eg.o();
                        } else {
                            i2 = 3;
                        }
                    } else {
                        z = true;
                        i2 = i;
                    }
                    yhmVar.a(new z73(str9, lik1Var, new mb3(z6, z5, false, ugo0Var3, (String) null, z7, i2, tgmVarA.l, tgmVarA.n, (ok51) null, (z4 && g()) ? z : false, p860Var2, 34613)), tv80Var);
                    break;
                case 44:
                    p860 p860Var3 = tgmVarA.A;
                    blc0 blc0Var2 = blc0.u1;
                    fm6 fm6Var = new fm6(str6, lik1Var, new bm6(blc0Var == blc0Var2, false, blc0Var == blc0Var2, false, false, (ok51) null, z4 && g(), p860Var3, 498));
                    if (!this.j.a.a()) {
                        Observable observableA = ((js6) this.b.get()).a(fm6Var);
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        i(lik1Var, observableA, yon1.V0(), tv80Var);
                    } else {
                        yhmVar2.a(fm6Var, tv80Var);
                    }
                    break;
                case 88:
                    yhmVar2.a(new co8(str6, lik1Var, null, new wn8(z4 && g(), tgmVarA.A, 3)), tv80Var);
                    break;
                case 166:
                case 652:
                    Observable observable = rqt0.G(new x4c(this, lik1Var, str6, tgmVarA, (lnm) null)).toObservable();
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    i(lik1Var, observable, yon1.X0(), tv80Var);
                    break;
                case 203:
                    String str10 = strA;
                    agc0Var.getClass();
                    if (sto1.m(str6)) {
                        str6 = "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ";
                    }
                    j(lik1Var, str6, tgmVarA.b, tv80Var, str10, tgmVarA.w, tgmVarA.A);
                    break;
                case 247:
                    yhmVar2.a(new xml(str6, lik1Var, tgmVarA.E), tv80Var);
                    break;
                case 416:
                    zma0 zma0Var = (zma0) this.n.get();
                    if (z4) {
                        g();
                    }
                    Observable observableA2 = zma0.a(zma0Var);
                    AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                    i(lik1Var, observableA2, yon1.H5(), tv80Var);
                    break;
                case 844:
                    String str11 = strA;
                    String str12 = tgmVarA.a;
                    boolean z8 = tgmVarA.c;
                    boolean z9 = tgmVarA.d;
                    boolean z10 = tgmVarA.e;
                    boolean z11 = tgmVarA.m;
                    boolean z12 = tgmVarA.h;
                    boolean z13 = tgmVarA.o;
                    boolean z14 = tgmVarA.f115p;
                    iu30 iu30Var = tgmVarA.r;
                    boolean z15 = tgmVarA.s;
                    c821 c821Var = tgmVarA.v;
                    boolean z16 = tgmVarA.t;
                    boolean z17 = tgmVarA.q;
                    sgm sgmVar = tgmVarA.y;
                    iu30 iu30Var2 = tgmVarA.z;
                    String str13 = tgmVarA.x;
                    p860 p860Var4 = tgmVarA.A;
                    mgo0 mgo0Var = tgmVarA.B;
                    ytw0 ytw0Var = iu30Var2 != null ? new ytw0((byte) 12) : cee.v;
                    a6z a6zVar = (a6z) this.d.get();
                    boolean z18 = z9 && blc0Var != blc0.fh;
                    boolean z19 = i4 == 2;
                    boolean z20 = z8 && sgmVar == null;
                    if (z3) {
                        str3 = str12;
                        ugo0Var = new ugo0(hs00Var.b().contains(str6), str6, str11, false, z14, (String) null, mgo0Var, 172);
                    } else {
                        str3 = str12;
                        ugo0Var = null;
                    }
                    if (z4) {
                        str4 = str6;
                        if (g()) {
                            str4 = str6;
                            z2 = true;
                        } else {
                            str4 = str6;
                            str4 = str6;
                            str4 = str6;
                            z2 = false;
                        }
                    } else {
                        str4 = str6;
                        str4 = str6;
                        str4 = str6;
                        z2 = false;
                    }
                    Observable observableSwitchMap = a6z.a(a6zVar, str4, (String) null, (Map) null, lik1Var, new r6z(str3, true, false, z18, z19, false, z10, false, false, z20, z13, z15, false, false, z16, true, ugo0Var, c821Var, false, z12, z11, z17, (ok51) null, z2, str13, false, p860Var4, 313798692), ytw0Var, 6).switchMap(new v1k(sgmVar, this, iu30Var, (byte) 17));
                    AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
                    i(lik1Var, observableSwitchMap, yon1.Y0(), tv80Var);
                    break;
                case 860:
                    String str14 = tgmVarA.a;
                    boolean z21 = tgmVarA.b;
                    boolean z22 = tgmVarA.c;
                    boolean z23 = tgmVarA.h;
                    int i5 = tgmVarA.G;
                    c821 c821Var2 = tgmVarA.v;
                    String str15 = tgmVarA.x;
                    p860 p860Var5 = tgmVarA.A;
                    mgo0 mgo0Var2 = tgmVarA.B;
                    k781 k781Var = (k781) this.a.get();
                    int iC2 = l1d.C(i5);
                    if (iC2 == 0) {
                        i3 = 1;
                    } else if (iC2 == 1) {
                        i3 = 2;
                    } else if (iC2 != 2) {
                        eg.o();
                    } else {
                        i3 = 3;
                    }
                    Observable observableA3 = k781Var.a(str6, lik1Var, new l781(str14, (String) null, false, z23, c821Var2, e(this, str6, z21, false, strA, mgo0Var2, 4), (ok51) null, i3, z22, false, (r6h1) null, z4 && g(), str15, p860Var5, 435710));
                    AtomicReferenceArray atomicReferenceArray5 = p6r0.e;
                    i(lik1Var, observableA3, yon1.c1(), tv80Var);
                    break;
                case 926:
                    boolean z24 = tgmVarA.C;
                    String str16 = tgmVarA.a;
                    if (z24) {
                        if (yh10Var2 != null) {
                            ugo0VarE2 = yh10Var2.b();
                            str5 = str6;
                        } else {
                            str5 = str6;
                            ugo0VarE2 = e(this, str5, tgmVarA.b, false, null, null, 28);
                        }
                        vsf1Var = new vsf1((String) null, str16, false, (String) null, false, false, false, false, false, true, (String) null, false, false, false, false, false, ugo0VarE2, (ok51) null, false, tgmVarA.u, false, false, false, false, false, false, false, false, (p860) null, (String) null, false, true, -4326403, 31);
                        wgmVar = this;
                    } else {
                        str5 = str6;
                        boolean z25 = blc0Var != blc0.g1;
                        boolean z26 = blc0Var != blc0.u1;
                        boolean zJ2 = u890.j(str8, nik1.p2.a);
                        boolean z27 = tgmVarA.D;
                        boolean z28 = i4 == 2;
                        if (yh10Var2 != null) {
                            ugo0VarE = yh10Var2.b();
                            wgmVar = this;
                        } else {
                            wgmVar = this;
                            ugo0VarE = e(wgmVar, str5, tgmVarA.b, false, null, null, 28);
                        }
                        vsf1Var = new vsf1((String) null, str16, true, (String) null, false, z27, z25, zJ2, z28, z26, (String) null, false, false, false, true, false, ugo0VarE, (ok51) null, false, tgmVarA.u, false, false, false, false, false, false, false, z4 && wgmVar.g(), tgmVarA.A, (String) null, false, false, 2143123993, 62);
                    }
                    ((ssf1) wgmVar.c.get()).b(new dmf1(str5, lik1Var, str8, vsf1Var), tv80Var);
                    break;
                default:
                    if (yh10Var2 != null) {
                        h(lik1Var, str6, yh10Var2, tv80Var, tgmVarA.A);
                    }
                    break;
            }
        }
    }

    public final boolean g() {
        return this.o.a() && ((Boolean) this.r.a.getValue()).booleanValue();
    }

    public final void h(lik1 lik1Var, String str, yh10 yh10Var, tv80 tv80Var, p860 p860Var) {
        Observable observableA = ((ei10) this.m.get()).a(str, new di10(yh10Var.e(), yh10Var.a(), yh10Var.c(), yh10Var.b(), p860Var, yh10Var.d()));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        i(lik1Var, observableA, yon1.H5(), tv80Var);
    }

    public final void i(lik1 lik1Var, Observable observable, p6r0 p6r0Var, tv80 tv80Var) {
        mfm.b(this.h.a(lik1Var), observable, p6r0Var, null, tv80Var, 20);
    }

    public final void j(lik1 lik1Var, String str, boolean z, tv80 tv80Var, String str2, boolean z2, p860 p860Var) {
        this.l.getClass();
        boolean z3 = false;
        boolean z4 = p5y.a(str) != null;
        gn10 gn10Var = mno1.q0;
        ugo0 ugo0VarE = !z4 ? e(this, str, z, false, str2, null, 20) : null;
        if (z2 && g()) {
            z3 = true;
        }
        oim eoc0Var = new eoc0(str, lik1Var, gn10Var, new dpu0(ugo0VarE, (ok51) null, z3, p860Var));
        if (this.f134p) {
            this.i.a(eoc0Var, tv80Var);
            return;
        }
        Observable observableA = ((ywc0) this.e.get()).a(eoc0Var);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        i(lik1Var, observableA, yon1.a1(), tv80Var);
    }
}
