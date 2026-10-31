package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n0o implements cvl1, tyq {
    public final Object X;
    public final Object Y;
    public final /* synthetic */ byte a;
    public final d0r b;
    public final js20 c;
    public final psw d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public n0o(gw70 gw70Var, lzn0 lzn0Var, fza fzaVar, vgm vgmVar, hvp0 hvp0Var, fiv0 fiv0Var, nwt nwtVar, aru0 aru0Var, ycm ycmVar, aru0 aru0Var2, myq0 myq0Var, cua cuaVar, n801 n801Var, e9g1 e9g1Var, dnc dncVar, yqg yqgVar, ytp0 ytp0Var, clm clmVar, tbw0 tbw0Var, iuj iujVar, ytp0 ytp0Var2, yy4 yy4Var, Context context, oyo oyoVar, mev mevVar, d0r d0rVar, p1f0 p1f0Var, eci0 eci0Var, gci0 gci0Var) {
        this.a = (byte) 1;
        this.b = d0rVar;
        this.e = gci0Var;
        kko kkoVar = (kko) p1f0Var.b;
        this.f = kkoVar;
        Function0 function0 = (Function0) p1f0Var.a;
        Function0 function1 = (Function0) p1f0Var.d;
        p731 p731Var = (p731) p1f0Var.e;
        this.g = p731Var;
        this.h = (vu30) p1f0Var.f;
        this.i = (vu30) p1f0Var.g;
        ojv0 ojv0Var = (ojv0) p1f0Var.c;
        this.t = new AtomicBoolean(false);
        this.c = x3p1.n(new z1(this, nwtVar, clmVar, ytp0Var2, eci0Var, p1f0Var, yy4Var, (byte) 14), nbi0.Z, new n(eci0Var, context, fzaVar, hvp0Var, yqgVar, ytp0Var, fiv0Var, this, (byte) 15), (o8n) null, new j96(lzn0Var, vgmVar, dncVar, ytp0Var2, this, eci0Var, (byte) 21), 8);
        this.X = n3o1.q(this).a(ytg0.T0, ytg0.U0);
        boolean z = eci0Var.j;
        j2i j2iVar = new j2i(-518968702, new t20(new aci0(eci0Var.b.a, eci0Var.h, z), new qq(gw70Var, function1, function0, p731Var, kkoVar, ojv0Var, aru0Var, ycmVar, aru0Var2, myq0Var, cuaVar, n801Var, e9g1Var, tbw0Var, iujVar, yqgVar, z ? mevVar : null, z ? (zob1) p1f0Var.h : null, z ? oyoVar : null), (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
        jd11 jd11Var = rc11.a;
        int i = 2;
        this.Y = w3p1.f(new l4r(new xv00(jd11Var.b(nbw0.class)), 1, qci0.t, new j4r(nbi0.N0), qci0.X), new l4r(new xv00(jd11Var.b(yo60.class)), gci0Var.b ? 2 : 1, qci0.f, new j4r(nbi0.O0), qci0.g), new l4r(new xv00(jd11Var.b(jo70.class)), 1, qci0.Y, new j4r(nbi0.P0), qci0.Z), new l4r(new xv00(jd11Var.b(prl.class)), 2, nbi0.a1, new j4r(nbi0.Q0), nbi0.b1), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, nbi0.c1, new j4r(nbi0.R0), nbi0.d1), new l4r(new xv00(jd11Var.b(e2k1.class)), 2, nbi0.e1, new j4r(new oci0(this, (byte) 1)), qci0.b), new l4r(new xv00(jd11Var.b(nbw0.class)), 2, qci0.c, new j4r(nbi0.S0), qci0.d), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, qci0.e, new j4r(nbi0.T0), nbi0.V0), new l4r(new xv00(jd11Var.b(w281.class)), 2, nbi0.W0, new j4r(nbi0.U0), nbi0.X0), new l4r(new xv00(jd11Var.b(l1z.class)), 2, nbi0.Y0, new j4r(new z8b0(this, (byte) 21)), nbi0.Z0), new l4r(new xv00(jd11Var.b(mtl.class)), gci0Var.c ? 1 : i, qci0.h, new j4r(new oci0(this, (byte) 0)), qci0.i), pci0.b);
    }

    public static k7l1 f(j7l1 j7l1Var) {
        return new k7l1(j7l1Var.a, j7l1Var.b, "", j7l1Var.c, "", "", "", "", null, "", "", 0L, 0L, null, false);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return (l0o) this.X;
            case 1:
                return (ia00) this.X;
            case 2:
                return (ia00) this.Y;
            case 3:
                return (ia00) this.Y;
            case 4:
                return (gq6) this.Y;
            default:
                return (hy00) this.Y;
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.d;
    }

    public final d0r e() {
        byte b = this.a;
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    public t541 g(p541 p541Var, k1r k1rVar) {
        String str;
        String str2;
        String str3;
        ArrayList arrayList;
        List list;
        my7 my7Var;
        z1u0 z1u0Var;
        io70 io70Var;
        io70 io70Var2;
        ((vi11) this.t).getClass();
        String str4 = p541Var.a;
        i641 i641Var = (i641) u890.G(k1rVar);
        jfv jfvVar = null;
        if (i641Var != null) {
            jo70 jo70Var = i641Var.a;
            Set set = s4b1.f;
            boolean z = uic.x(str4).c == blc0.Ef;
            if (!z) {
                str = str4;
            } else if (jo70Var == null || (io70Var2 = jo70Var.e) == null) {
                str = null;
            } else {
                str4 = io70Var2.b;
                str = str4;
            }
            if (z) {
                if (jo70Var == null || (io70Var = jo70Var.e) == null) {
                    str3 = null;
                } else {
                    str2 = io70Var.a;
                    str3 = str2;
                }
            } else if (jo70Var != null) {
                str2 = jo70Var.a;
                str3 = str2;
            } else {
                str3 = null;
            }
            if (str != null && str3 != null) {
                if (z) {
                    d7u0 d7u0Var = i641Var.e;
                    if (d7u0Var != null && (my7Var = (my7) o7h.s0(d7u0Var.a)) != null && (z1u0Var = my7Var.c) != null) {
                        jfvVar = new jfv(z1u0Var.a);
                    }
                } else {
                    String str5 = p541Var.e;
                    if (str5 != null) {
                        long j = Long.parseLong(str5);
                        ytw0 ytw0Var = jfv.b;
                        jfvVar = new jfv(fdg1.l0(j, ngv.e));
                    }
                }
                jfv jfvVar2 = jfvVar;
                String strConcat = str.concat(":dna");
                List list2 = i641Var.c;
                int iP = list2 != null ? qxd0.P(list2) : 0;
                Long l = i641Var.d;
                if (jo70Var == null || (list = jo70Var.d) == null) {
                    arrayList = z6x.a;
                } else {
                    List list3 = list;
                    arrayList = new ArrayList(q7h.U(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ho70) it.next()).a);
                    }
                }
                ArrayList arrayList2 = arrayList;
                String str6 = i641Var.b;
                qtt0 qtt0Var = i641Var.f;
                if (qtt0Var == null) {
                    qtt0Var = qtt0.b;
                }
                jfvVar = new j641(str, str3, strConcat, iP, l, arrayList2, str6, jfvVar2, qtt0Var);
            }
        }
        String str7 = p541Var.a;
        return jfvVar == null ? new s541(str7) : new r541(str7, jfvVar.b, jfvVar.e, jfvVar.f, jfvVar.g, jfvVar.h, p541Var.c, p541Var.e, p541Var.d, jfvVar.c, jfvVar.d, jfvVar.i, p541Var.b, jfvVar.a, p541Var.f);
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return this.c;
    }

    public final f4r getData() {
        switch (this.a) {
            case 0:
                return (km1) this.Y;
            case 1:
                return (o3r) this.Y;
            case 2:
                return (o3r) this.X;
            case 3:
                return (o3r) this.X;
            case 4:
                return (iik0) this.X;
            default:
                return (n7l1) this.X;
        }
    }

    public n0o(kt91 kt91Var, ynb0 ynb0Var, s880 s880Var, gw70 gw70Var, s4w0 s4w0Var, d0r d0rVar) {
        this.a = (byte) 3;
        this.e = kt91Var;
        this.f = ynb0Var;
        this.g = s880Var;
        this.h = gw70Var;
        this.i = s4w0Var;
        this.b = d0rVar;
        this.t = nik1.p1.a;
        jd11 jd11Var = rc11.a;
        this.X = w3p1.m(new l4r(new xv00(jd11Var.b(jo70.class)), 1, xuv0.U0, new j4r(xuv0.R0), xuv0.V0), new l4r(new xv00(jd11Var.b(xkk1.class)), 1, xuv0.W0, new j4r(xuv0.S0), xuv0.X0), new l4r(new xv00(jd11Var.b(zoy0.class)), 1, xuv0.Y0, new j4r(xuv0.T0), xuv0.Z0), mgn0.U0);
        this.c = x3p1.n(new xzv0(this, (byte) 0), new xzv0(this, (byte) 1), new t1t0(this, (byte) 29), (o8n) null, new xzv0(this, (byte) 2), 8);
        this.Y = n3o1.q(this).a(nzv0.d, new ixt0(this, (byte) 12));
        j2i j2iVar = new j2i(1271971433, new qsu0(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public n0o(lzn0 lzn0Var, sd41 sd41Var, gw70 gw70Var, fod0 fod0Var, qaq0 qaq0Var, lag lagVar, d0r d0rVar) {
        this.a = (byte) 2;
        this.e = lzn0Var;
        this.f = sd41Var;
        this.g = gw70Var;
        this.h = fod0Var;
        this.i = qaq0Var;
        this.t = lagVar;
        this.b = d0rVar;
        this.X = w3p1.o(new l4r(pwc0.g, 1, cwp0.a1, new j4r(cwp0.Y0), cwp0.b1), cwp0.Z0);
        this.c = x3p1.n(new f9q0(this, (byte) 0), cwp0.X0, w0q0.f, (o8n) null, new f9q0(this, (byte) 1), 8);
        this.Y = n3o1.q(this).a(rmp0.S0, rmp0.T0);
        j2i j2iVar = new j2i(1560638146, new aso0(this, (byte) 18), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public n0o(lzn0 lzn0Var, d0r d0rVar, String str, ttq ttqVar, bpb1 bpb1Var, bpb1 bpb1Var2) {
        this.a = (byte) 5;
        this.e = lzn0Var;
        this.b = d0rVar;
        this.f = str;
        this.g = ttqVar;
        this.h = bpb1Var;
        this.i = bpb1Var2;
        this.t = w3p1.o(new l4r(new xv00(rc11.a.b(bbl1.class)), 2, v5l1.X, new j4r(new m7l1(this, (byte) 2)), v5l1.Y), o7l1.a);
        this.X = new n7l1(this, (byte) 0);
        this.c = x3p1.n(new m7l1(this, (byte) 0), new yvf1(this, (byte) 15), new fak1(this, (byte) 7), (o8n) null, new m7l1(this, (byte) 1), 8);
        this.Y = n3o1.r(this).c(new zyf1(this, (byte) 25), cxj1.a1);
        j2i j2iVar = new j2i(1016193823, new l6i1(this, (byte) 23), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public n0o(f1n0 f1n0Var, xgc xgcVar, cp31 cp31Var, ubc ubcVar, mnk0 mnk0Var, t4o t4oVar, mdq mdqVar, d0r d0rVar) {
        this.a = (byte) 0;
        this.e = f1n0Var;
        this.f = cp31Var;
        this.g = ubcVar;
        this.h = mnk0Var;
        this.i = t4oVar;
        this.b = d0rVar;
        this.t = mdqVar.a(d0rVar);
        this.c = x3p1.n(new k0o(this, (byte) 0), new qrk((Object) this, (byte) 5), wmn.h, (o8n) null, new k0o(this, (byte) 1), 8);
        this.X = new l0o(n3o1.r(this).c(cnn.h, cnn.i), (byte) 0);
        this.d = new psw(new j2i(1980217051, new bfm(this, (byte) 17), true), (byte) 0);
        this.Y = new km1(this, (byte) 15);
    }

    public n0o(woq woqVar, ycm ycmVar, jyo jyoVar, xoq xoqVar, d0r d0rVar, njm njmVar) {
        this.a = (byte) 4;
        this.e = jyoVar;
        this.f = xoqVar;
        this.b = d0rVar;
        this.g = njmVar;
        this.h = woqVar.a(d0rVar);
        this.i = ycm.a(ycmVar);
        vi11 vi11Var = new vi11(d0rVar);
        this.t = vi11Var;
        this.X = (iik0) vi11Var.f;
        this.c = x3p1.n(new u541(this, (byte) 0), new u541(this, (byte) 1), new ps11(this, (byte) 29), (o8n) null, new u541(this, (byte) 2), 8);
        this.Y = new gq6((byte) 1);
        j2i j2iVar = new j2i(991436969, new hg31(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }
}
