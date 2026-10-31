package p;

import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class psy implements tyq {
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final /* synthetic */ byte a;
    public final d0r b;
    public final Object c;
    public final psw d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public psy(yqg yqgVar, d0r d0rVar, rsp rspVar, ssp sspVar, agq agqVar, r7j0 r7j0Var) {
        this.a = (byte) 3;
        this.e = yqgVar;
        this.b = d0rVar;
        this.f = agqVar;
        this.g = r7j0Var;
        this.h = new hvj0(r7j0Var, (byte) 0);
        this.i = new hvj0(r7j0Var, (byte) 2);
        this.Y = n3o1.q(this).a(fmk0.d, new kds(this, (byte) 23));
        this.t = new iik0(this, (byte) 2);
        jd11 jd11Var = rc11.a;
        l4r l4rVar = new l4r(new xv00(jd11Var.b(uia.class)), 2, nok0.P0, new j4r(qkk0.d1), nok0.Q0);
        l4r l4rVar2 = new l4r(new xv00(jd11Var.b(uia.class)), 2, nok0.R0, new j4r(qkk0.e1), nok0.S0);
        l4r l4rVar3 = new l4r(new xv00(jd11Var.b(hll.class)), 1, nok0.Y0, new j4r(nok0.b), nok0.Z0);
        l4r l4rVar4 = new l4r(new xv00(jd11Var.b(hll.class)), 1, nok0.a1, new j4r(nok0.c), nok0.b1);
        l4r l4rVar5 = new l4r(pwc0.p, 2, nok0.T0, new j4r(nok0.d), nok0.U0);
        l4r l4rVar6 = new l4r(pwc0.j, 2, nok0.V0, new j4r(nok0.e), nok0.W0);
        l4r l4rVar7 = new l4r(pwc0.k, 2, nok0.X0, new j4r(nok0.f), nok0.i);
        l4r l4rVar8 = new l4r(pwc0.l, 2, nok0.t, new j4r(nok0.g), nok0.X);
        l4r l4rVar9 = new l4r(pwc0.n, 2, nok0.Y, new j4r(nok0.h), nok0.Z);
        l4r l4rVar10 = new l4r(pwc0.m, 2, nok0.N0, new j4r(qkk0.c1), nok0.O0);
        this.X = new o3r(p7h.M(new l4r[]{l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, l4rVar6, l4rVar7, l4rVar8, l4rVar9, l4rVar10}), new u3r(cfi0.c, l4rVar, l4rVar2, l4rVar3, l4rVar4, l4rVar5, l4rVar6, l4rVar7, l4rVar8, l4rVar9, l4rVar10), false);
        this.c = w3p1.n(new l4r(new xv00(jd11Var.b(zge1.class)), 3, nok0.c1, new j4r(ook0.c), nok0.d1), new l4r(new xv00(jd11Var.b(zge1.class)), 3, nok0.e1, new j4r(ook0.d), ook0.b), qlk0.t);
        this.Z = x3p1.n(new mok0(this, (byte) 0), qkk0.b1, qlk0.i, (o8n) null, new mok0(this, (byte) 1), 8);
        j2i j2iVar = new j2i(418663922, new hmk0(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public static int f(yoo yooVar) {
        int iOrdinal = yooVar.ordinal();
        if (iOrdinal == 0) {
            return 1;
        }
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2) {
            return 3;
        }
        eg.o();
        return 0;
    }

    public static int g(bpo bpoVar) {
        switch (bpoVar.ordinal()) {
            case 0:
                return 9;
            case 1:
                return 18;
            case 2:
                return 6;
            case 3:
                return 15;
            case 4:
                return 3;
            case 5:
                return 12;
            case 6:
                return 2;
            case 7:
                return 11;
            case 8:
                return 8;
            case 9:
                return 17;
            case 10:
            case 12:
                return 1;
            case 11:
            case 13:
                return 10;
            default:
                eg.o();
                return 0;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return (ia00) this.Y;
            case 1:
                return (eih1) this.Z;
            case 2:
                return (eih1) this.Z;
            case 3:
                return (ia00) this.Y;
            default:
                return (ia00) this.Y;
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
        }
        return this.d;
    }

    public final d0r e() {
        byte b = this.a;
        return this.b;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                return (rey0) this.Z;
            case 1:
                return (js20) this.Y;
            case 2:
                return (ljm0) this.Y;
            case 3:
                return (js20) this.Z;
            default:
                return (e7m0) this.Z;
        }
    }

    public final f4r getData() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return (f4r) obj;
            case 1:
                return (f4r) obj;
            case 2:
                return (o3r) obj;
            case 3:
                return (iik0) this.t;
            default:
                return i13.z;
        }
    }

    public psy(d0r d0rVar, tuz tuzVar, w9u0 w9u0Var, gtc1 gtc1Var, uu00 uu00Var, g5p0 g5p0Var, sks0 sks0Var, mr20 mr20Var, o241 o241Var, eh4 eh4Var, Scheduler scheduler, q8n q8nVar, q8n q8nVar2) {
        this.a = (byte) 4;
        this.b = d0rVar;
        this.e = tuzVar;
        this.f = gtc1Var;
        this.g = sks0Var;
        this.h = mr20Var;
        this.i = o241Var;
        this.t = eh4Var;
        this.X = scheduler;
        this.c = q8nVar;
        ymg1 ymg1Var = new ymg1(this, (byte) 12);
        wam0 wam0Var = new wam0((byte) 23);
        nmh1 nmh1Var = new nmh1(uu00Var, w9u0Var, g5p0Var, q8nVar2);
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(y4z0.class, new lmh1(nmh1Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(z4z0.class, new lmh1(nmh1Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(e5z0.class, new lmh1(nmh1Var, (byte) 2));
        subtypeEffectHandlerBuilderC.g(j5z0.class, new lmh1(nmh1Var, (byte) 3));
        subtypeEffectHandlerBuilderC.g(l5z0.class, new lmh1(nmh1Var, (byte) 4));
        subtypeEffectHandlerBuilderC.b(h5z0.class, new ruz0(nmh1Var, (byte) 22), w0h1.m(q8nVar2));
        subtypeEffectHandlerBuilderC.g(r5z0.class, nm3.Q0);
        subtypeEffectHandlerBuilderC.g(d5z0.class, nm3.R0);
        subtypeEffectHandlerBuilderC.g(u4z0.class, nm3.P0);
        this.Z = sbl.A(ymg1Var, wam0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()), lbg1.S0, new kmh1(this));
        this.Y = n3o1.q(this).a(swg1.N0, swg1.O0);
        j2i j2iVar = new j2i(1950392199, new y2f1(this, (byte) 24), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public psy(bxo bxoVar, cxo cxoVar, hlp hlpVar, ilp ilpVar, jlp jlpVar, axo axoVar, klp klpVar, llp llpVar, flp flpVar, kg90 kg90Var, w8r0 w8r0Var, d0r d0rVar, lzn0 lzn0Var, q7r0 q7r0Var) {
        this.a = (byte) 2;
        this.e = bxoVar;
        this.f = cxoVar;
        this.g = ilpVar;
        this.h = jlpVar;
        this.i = axoVar;
        this.b = d0rVar;
        this.t = lzn0Var;
        this.X = q7r0Var;
        j9b0 j9b0Var = j9b0.c1;
        this.c = w3p1.m(new l4r(hjx0.a, 1, rab0.d, new j4r(j9b0Var), rab0.e), new l4r(pwc0.B, 2, rab0.b, new j4r(j9b0.d1), rab0.c), new l4r(new xv00(rc11.a.b(dd8.class)), 3, rab0.f, new j4r(j9b0.e1), rab0.g), j830.S0);
        j9b0 j9b0Var2 = j9b0.b1;
        fns fnsVar = igu.a;
        this.Y = h7w.D(j9b0Var2, pyf0.a, (iu30) null, new j2i(-856953558, new sw1(this, (byte) 19), true), 4);
        this.Z = new eih1();
        j2i j2iVar = new j2i(-1415286462, new pba0(this, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public psy(z710 z710Var, lzn0 lzn0Var, i8h1 i8h1Var, d0r d0rVar) {
        i13 mchVar;
        byte b = 1;
        this.a = (byte) 1;
        this.e = z710Var;
        this.f = lzn0Var;
        this.g = i8h1Var;
        this.b = d0rVar;
        this.h = gio1.b(Boolean.FALSE);
        jd11 jd11Var = rc11.a;
        o3r o3rVarO = w3p1.o(new l4r(new wlu(jd11Var.b(a7q0.class)), 2, aw50.c, new j4r(em50.e1), aw50.d), aw50.b);
        this.i = o3rVarO;
        o3r o3rVarO2 = w3p1.o(new l4r(new xv00(jd11Var.b(uxn.class)), 2, aw50.e, new j4r(em50.Z0), aw50.f), em50.a1);
        this.t = o3rVarO2;
        o3r o3rVarO3 = w3p1.o(new l4r(new xv00(jd11Var.b(pn30.class)), 2, aw50.g, new j4r(em50.c1), aw50.h), em50.d1);
        this.X = o3rVarO3;
        ArrayList arrayList = new ArrayList();
        arrayList.add(o3rVarO);
        arrayList.add(o3rVarO2);
        arrayList.add(o3rVarO3);
        if (arrayList.isEmpty()) {
            mchVar = i13.j;
        } else {
            mchVar = arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        }
        this.c = mchVar;
        this.Y = x3p1.n(new zv50(this, (byte) 0), em50.b1, oq50.e, (o8n) null, new zv50(this, b), 8);
        this.Z = new eih1();
        j2i j2iVar = new j2i(159955022, new zq30(this, (byte) 20), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public psy(d0r d0rVar, lik1 lik1Var, ogr ogrVar, fjb fjbVar, qdp qdpVar, kl1 kl1Var, k9q k9qVar, w460 w460Var) {
        i13 mchVar;
        this.a = (byte) 0;
        this.b = d0rVar;
        this.e = lik1Var;
        this.f = ogrVar;
        this.g = fjbVar;
        this.h = qdpVar;
        this.i = kl1Var;
        this.t = k9qVar;
        this.X = w460Var;
        ys11 ys11VarJ = ogrVar.J(lik1Var, d0rVar, (try) null, new dgb((byte) 9), oxx.X);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h4r(rqy.N0, ys11VarJ.l1));
        if (arrayList.isEmpty()) {
            mchVar = i13.j;
        } else {
            mchVar = arrayList.size() == 1 ? (f4r) o7h.q0(arrayList) : new mch(arrayList);
        }
        this.c = mchVar;
        this.Y = n3o1.q(this).a(c9x.W0, c9x.X0);
        this.Z = new rey0(gft.W0);
        j2i j2iVar = new j2i(-1342301936, new yhy(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }
}
