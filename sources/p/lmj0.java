package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lmj0 implements syq {
    public final eih1 N0;
    public final js20 O0;
    public final nsw P0;
    public final o3r X;
    public final o3r Y;
    public final f4r Z;
    public final d0r a;
    public final qtw b;
    public final opv0 c;
    public final pfv d;
    public final ofx e;
    public final yqg f;
    public final idd1 g;
    public final o3r h;
    public final o3r i;
    public final o3r t;

    public lmj0(d0r d0rVar, qtw qtwVar, opv0 opv0Var, pfv pfvVar, ofx ofxVar, yqg yqgVar) {
        this.a = d0rVar;
        this.b = qtwVar;
        this.c = opv0Var;
        this.d = pfvVar;
        this.e = ofxVar;
        this.f = yqgVar;
        idd1 idd1Var = new idd1(new z8i0(this, (byte) 19));
        this.g = idd1Var;
        ppa0 ppa0Var = lo70.a;
        jd11 jd11Var = rc11.a;
        l4r l4rVar = new l4r(new xv00(jd11Var.b(a7q0.class)), 2, jmj0.N0, new j4r(ojj0.R0), jmj0.Y0);
        l4r l4rVar2 = new l4r(new xv00(jd11Var.b(hll.class)), 2, jmj0.a1, new j4r(ojj0.S0), jmj0.b1);
        l4r l4rVar3 = new l4r(new xv00(jd11Var.b(e2k1.class)), 2, jmj0.c1, new j4r(ojj0.T0), jmj0.d1);
        l4r l4rVar4 = new l4r(new xv00(jd11Var.b(zoy0.class)), 2, jmj0.e1, new j4r(ojj0.U0), kmj0.b);
        ojj0 ojj0Var = ojj0.V0;
        o3r o3rVarI = w3p1.i(l4rVar, l4rVar2, l4rVar3, l4rVar4, new l4r(hjx0.a, 2, kmj0.c, new j4r(ojj0Var), jmj0.d), new l4r(jd0.g, 2, jmj0.e, new j4r(ojj0.W0), jmj0.f), new l4r(hvm.d, 2, jmj0.g, new j4r(ojj0.X0), jmj0.h), a4r.d);
        this.h = o3rVarI;
        o3r o3rVarM = w3p1.m(d7p1.j(td80.c), new l4r(new xv00(jd11Var.b(l1z.class)), 2, jmj0.i, new j4r(ojj0.a1), jmj0.t), new l4r(new xv00(jd11Var.b(v740.class)), 2, jmj0.X, new j4r(ojj0.b1), jmj0.Y), gce0.O0);
        this.i = o3rVarM;
        o3r o3rVarL = w3p1.l(new l4r(new wlu(jd11Var.b(jo70.class)), 2, jmj0.Z, new j4r(ojj0.e1), jmj0.O0), new l4r(new wlu(jd11Var.b(hzy.class)), 2, jmj0.P0, new k4r(new z8b0(this, (byte) 29), ppa0Var), jmj0.Q0), new l4r(new xv00(jd11Var.b(l1z.class)), 2, jmj0.R0, new j4r(jmj0.b), jmj0.S0), new l4r(new xv00(jd11Var.b(v740.class)), 2, jmj0.T0, new j4r(jmj0.c), jmj0.U0), eej0.N0);
        this.t = o3rVarL;
        o3r o3rVarO = w3p1.o(new l4r(new xv00(jd11Var.b(mdz.class)), 2, jmj0.V0, new j4r(ojj0.Y0), jmj0.W0), ojj0.Z0);
        this.X = o3rVarO;
        o3r o3rVarO2 = w3p1.o(new l4r(pwc0.b, 2, jmj0.X0, new j4r(ojj0.c1), jmj0.Z0), ojj0.d1);
        this.Y = o3rVarO2;
        g4r g4rVar = new g4r((byte) 0);
        g4rVar.j(o3rVarI, ojj0.N0);
        g4rVar.j(o3rVarM, new z8b0(this, (byte) 27));
        g4rVar.j(o3rVarL, new z8b0(this, (byte) 28));
        g4rVar.j(o3rVarO, ojj0.O0);
        g4rVar.j(o3rVarO2, ojj0.P0);
        g4rVar.j(((vl90) idd1Var.getValue()).c, ojj0.Q0);
        this.Z = g4rVar.k();
        this.N0 = new eih1();
        this.O0 = w3p1.q(new r7j0(this, (byte) 7), new z8b0(this, (byte) 26), new ry90(this, (byte) 24), (o8n) null, ojj0.Z, 8);
        this.P0 = jch0.j(new pah0(this, (byte) 10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList f(gd91 gd91Var, fmj0 fmj0Var) {
        String str;
        nnj0 nnj0Var;
        List listSingletonList;
        Object mnj0Var;
        String str2 = fmj0Var.a;
        fju fjuVar = fmj0Var.b;
        boolean z = gd91Var.c;
        Long l = gd91Var.j;
        boolean z2 = gd91Var.a;
        String str3 = gd91Var.o;
        afv0 afv0Var = gd91Var.d;
        jnj0 jnj0Var = z ? jnj0.b : null;
        lnj0 lnj0Var = afv0Var != null ? new lnj0(afv0Var) : null;
        k4m k4mVar = gd91Var.h;
        dnj0 dnj0Var = k4mVar != null ? new dnj0(k4mVar) : null;
        d2k1 d2k1Var = gd91Var.g;
        rnj0 rnj0Var = d2k1Var != null ? new rnj0(d2k1Var) : null;
        String str4 = gd91Var.n;
        fnj0 fnj0Var = str4 != null ? new fnj0(str4) : null;
        knj0 knj0Var = (!gd91Var.e || gd91Var.m) ? null : new knj0(gd91Var.f);
        fy50 fy50Var = gd91Var.b;
        if (fy50Var != null) {
            str = null;
            nnj0Var = new nnj0(fy50Var, fjuVar.g);
        } else {
            str = null;
            nnj0Var = null;
        }
        Object obj = gd91Var.l ? cnj0.b : str;
        String str5 = str3.length() > 0 ? str3 : str;
        Object obj2 = obj;
        Object hnj0Var = str5 != null ? new hnj0(str5) : str;
        String str6 = gd91Var.f4p;
        if (str6.length() <= 0) {
            str6 = str;
        }
        Object obj3 = hnj0Var;
        Object gnj0Var = str6 != null ? new gnj0(str6) : str;
        String str7 = fmj0Var.c;
        ArrayList arrayList = fmj0Var.d;
        List listI0 = f46.i0(new snj0[]{jnj0Var, lnj0Var, dnj0Var, rnj0Var, fnj0Var, knj0Var, str, nnj0Var, obj2, obj3, gnj0Var, str7 != null ? new enj0(str7) : str});
        if (afv0Var == null || o7h.s0(arrayList) == null) {
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new qnj0((String) it.next()));
            }
            listSingletonList = arrayList2;
        } else {
            listSingletonList = Collections.singletonList(new qnj0((String) o7h.q0(arrayList)));
        }
        ArrayList arrayListN0 = o7h.N0(listSingletonList, listI0);
        Object onj0Var = (!z2 || l == null) ? str : new onj0(l.longValue());
        Object pnj0Var = (z2 && fjuVar.c && str3.length() == 0 && !gd91Var.q && l != null) ? new pnj0(l.longValue()) : str;
        boolean z3 = gd91Var.k;
        if (fjuVar.m) {
            mnj0Var = new mnj0(str2, str, 2);
        } else {
            String str8 = str;
            if (z3) {
                jfv jfvVar = gd91Var.i;
                mnj0Var = new mnj0(str2, jfvVar != null ? Long.valueOf(jfv.h(jfvVar.a)) : str8, 4);
            } else {
                mnj0Var = str8;
            }
        }
        return o7h.N0(f46.i0(new snj0[]{onj0Var, pnj0Var, mnj0Var}), arrayListN0);
    }

    public static boolean g(String str) {
        Set set = s4b1.f;
        if (uic.g(str, blc0.M3)) {
            return true;
        }
        Set set2 = s4b1.f;
        return uic.g(str, blc0.ed);
    }

    public final rqw a() {
        return this.N0;
    }

    public final rsw c() {
        return this.P0;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.O0;
    }

    public final f4r getData() {
        return this.Z;
    }
}
