package p;

import android.net.Uri;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m1x0 {
    public final c4n0 a;
    public final jl21 b;
    public final j0j0 c;
    public final d7b d;
    public final oh41 e;
    public final igh1 f;
    public final ae71 g;
    public final i7x0 h;
    public final okw0 i;
    public final boolean j;
    public final wmy k;
    public final x860 l;
    public final hgd0 m;
    public final jed0 n;
    public final vcd0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gdx0 f28p;
    public final y621 q;
    public final egd r;
    public final eb s;
    public final mfm t;

    public m1x0(c4n0 c4n0Var, jl21 jl21Var, od90 od90Var, j0j0 j0j0Var, d7b d7bVar, oh41 oh41Var, igh1 igh1Var, i4q i4qVar, ae71 ae71Var, i7x0 i7x0Var, okw0 okw0Var, boolean z, wmy wmyVar, x860 x860Var, hgd0 hgd0Var, jed0 jed0Var, vcd0 vcd0Var, gdx0 gdx0Var, y621 y621Var, egd egdVar, eb ebVar) {
        this.a = c4n0Var;
        this.b = jl21Var;
        this.c = j0j0Var;
        this.d = d7bVar;
        this.e = oh41Var;
        this.f = igh1Var;
        this.g = ae71Var;
        this.h = i7x0Var;
        this.i = okw0Var;
        this.j = z;
        this.k = wmyVar;
        this.l = x860Var;
        this.m = hgd0Var;
        this.n = jed0Var;
        this.o = vcd0Var;
        this.f28p = gdx0Var;
        this.q = y621Var;
        this.r = egdVar;
        this.s = ebVar;
        this.t = i4qVar.a(c4n0Var.getViewUri());
    }

    public final void a(smc0 smc0Var, z6x0 z6x0Var, String str) {
        Enum r1;
        String str2;
        int i;
        ghm ghmVar;
        boolean z = z6x0Var.h;
        Enum r3 = h7x0.a;
        Enum r4 = h7x0.c;
        Enum r5 = h7x0.b;
        if (z) {
            r1 = r4;
        } else {
            boolean z2 = z6x0Var.d;
            if (z2 && z6x0Var.e) {
                r1 = r5;
            } else {
                r1 = z2 ? r3 : null;
            }
        }
        if (r1 == null || str == null) {
            return;
        }
        String str3 = z6x0Var.Z;
        i7x0 i7x0Var = this.h;
        if (r1 != r4 || i7x0Var.g.a.l()) {
            r3 = r1;
        }
        int iOrdinal = r3.ordinal();
        if (iOrdinal == 0) {
            str2 = "follow";
        } else if (iOrdinal == 1) {
            str2 = "unfollow";
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return;
            }
            str2 = "follow_back";
        }
        String str4 = str2;
        ttx ttxVar = r1 == r5 ? ttx.c : hnx.c;
        int iOrdinal2 = r3.ordinal();
        if (iOrdinal2 == 0) {
            i = 2131954372;
        } else if (iOrdinal2 == 1) {
            i = 2131954469;
        } else {
            if (iOrdinal2 != 2) {
                eg.o();
                return;
            }
            i = 2131954370;
        }
        Integer numValueOf = Integer.valueOf(i);
        ygm ygmVar = new ygm(2);
        int iOrdinal3 = r3.ordinal();
        if (iOrdinal3 == 0) {
            ghmVar = new ghm(k1x0.g, new zqu0(str, (byte) 19));
        } else if (iOrdinal3 == 1) {
            ghmVar = new ghm(k1x0.h, new zqu0(str, (byte) 20));
        } else {
            if (iOrdinal3 != 2) {
                eg.o();
                return;
            }
            ghmVar = new ghm(k1x0.f, new zqu0(str, (byte) 18));
        }
        smc0Var.add(new jhm(str4, (hux) ttxVar, (fhm) null, numValueOf, (String) null, false, (tm81) null, new ihm(ygmVar, ghmVar, new vvu0(i7x0Var, str, str3, r1, (byte) 6)), 244));
    }

    public final void b(smc0 smc0Var, z6x0 z6x0Var) {
        String str = z6x0Var.a.a;
        boolean zJ = u890.j(z6x0Var.f, Boolean.TRUE);
        g1x0 g1x0Var = new g1x0(this, z6x0Var, (byte) 1);
        smc0Var.add(this.c.a(str, z6x0Var.g, g1x0Var, zJ));
    }

    public final kjm c(z6x0 z6x0Var, jhm jhmVar, n1r n1rVar, n1r n1rVar2) {
        String str;
        String str2;
        smc0 smc0VarK;
        String str3;
        String str4;
        String str5 = z6x0Var.Z;
        m3x0 m3x0Var = z6x0Var.a;
        boolean z = m3x0Var.h1;
        jl21 jl21Var = this.b;
        oh41 oh41Var = this.e;
        c4n0 c4n0Var = this.a;
        boolean z2 = this.j;
        ae71 ae71Var = this.g;
        if (z) {
            smc0 smc0VarN = k4p1.n();
            String str6 = m3x0Var.j1;
            String strD = d(m3x0Var);
            if (strD == null) {
                strD = "";
            }
            smc0VarN.add(ae71Var.a(strD));
            if (z2 && !m3x0Var.h && (str4 = m3x0Var.N0) != null && str4.length() != 0 && str6 != null && !ihc1.y0(str6)) {
                smc0VarN.add(jl21.b(jl21Var, str6, c4n0Var.getViewUri()));
            }
            smc0VarN.add(oh41Var.a(str6 != null ? str6 : ""));
            smc0VarK = k4p1.k(smc0VarN);
            str = null;
        } else {
            smc0 smc0VarN2 = k4p1.n();
            wbk1 wbk1Var = z6x0Var.Y;
            str = null;
            boolean z3 = z6x0Var.t;
            String str7 = m3x0Var.j1;
            String str8 = m3x0Var.c;
            String strD2 = d(m3x0Var);
            smc0VarN2.add(ae71Var.a(strD2 == null ? "" : strD2));
            boolean z4 = m3x0Var.c1;
            q730 q730Var = m3x0Var.X;
            boolean z5 = m3x0Var.a1;
            wbk1 wbk1Var2 = wbk1.a;
            if (z4) {
                str2 = "";
                int iC = l1d.C(z6x0Var.X);
                eb ebVar = this.s;
                switch (iC) {
                    case 0:
                    case 1:
                        a(smc0VarN2, z6x0Var, str7);
                        break;
                    case 2:
                        if (z3) {
                            smc0VarN2.add(od90.a(n1rVar, false));
                        }
                        a(smc0VarN2, z6x0Var, str7);
                        break;
                    case 3:
                        if (str7 != null) {
                            String str9 = z3 ? str7 : null;
                            if (str9 != null) {
                                smc0VarN2.add(ebVar.a(str9, str5, n1rVar2, false));
                            }
                        }
                        a(smc0VarN2, z6x0Var, str7);
                        break;
                    case 4:
                        if (str7 != null) {
                            String str10 = z3 ? str7 : null;
                            if (str10 != null) {
                                smc0VarN2.add(ebVar.a(str10, str5, n1rVar2, true));
                            }
                        }
                        a(smc0VarN2, z6x0Var, str7);
                        break;
                    case 5:
                        if (z3) {
                            smc0VarN2.add(od90.a(n1rVar, true));
                        }
                        a(smc0VarN2, z6x0Var, str7);
                        break;
                    case 6:
                        if (str7 != null) {
                            String str11 = z3 ? str7 : null;
                            if (str11 != null) {
                                smc0VarN2.add(this.r.a(str11, str5));
                            }
                        }
                        a(smc0VarN2, z6x0Var, str7);
                        break;
                    case 7:
                        if (z5) {
                            b(smc0VarN2, z6x0Var);
                        }
                        if (str7 != null) {
                            smc0VarN2.add(this.q.a(str7, str5));
                        }
                        break;
                    default:
                        eg.o();
                        return null;
                }
            } else {
                a(smc0VarN2, z6x0Var, str7);
                if (wbk1Var != wbk1Var2 && z5 && !q730Var.b && !m3x0Var.f) {
                    b(smc0VarN2, z6x0Var);
                }
                str2 = "";
            }
            if (jhmVar != null) {
                smc0VarN2.add(jhmVar);
            }
            if (wbk1Var == wbk1Var2 && str7 != null) {
                smc0VarN2.add(new jhm("profile_preview", (hux) nrx.c, (fhm) null, (Integer) 2131959449, (String) null, false, (tm81) null, new ihm(ahm.c, new ghm(p7w0.N0, new zqu0(str7, (byte) 17)), new hzu0(this.i, str7, (byte) 23)), 244));
            }
            if (wbk1Var != wbk1Var2 && str7 != null) {
                if (q730Var.b) {
                    smc0VarN2.add(igh1.a(this.f, str7, str8));
                } else {
                    smc0VarN2.add(this.d.a(str7, str8, new h7b(3)));
                }
            }
            if (z2 && !m3x0Var.h && (str3 = m3x0Var.N0) != null && str3.length() != 0 && str7 != null && !ihc1.y0(str7)) {
                smc0VarN2.add(jl21.b(jl21Var, str7, c4n0Var.getViewUri()));
            }
            smc0VarN2.add(oh41Var.a(str7 == null ? str2 : str7));
            smc0VarK = k4p1.k(smc0VarN2);
        }
        String str12 = m3x0Var.d;
        Uri uri = str12 != null ? Uri.parse(str12) : Uri.EMPTY;
        uri.getClass();
        return new kjm(new igm(str5, new wfm(uri, new hgm(m3x0Var.a, m3x0Var.c)), str, 4), (List) smc0VarK, 4);
    }

    public final String d(m3x0 m3x0Var) {
        String str;
        if (!this.f28p.a.r() || (str = m3x0Var.S0) == null || str.length() == 0) {
            return m3x0Var.j1;
        }
        Set set = s4b1.f;
        return uic.x("spotify:id:" + m3x0Var.V0 + ":username:" + m3x0Var.S0).z();
    }
}
