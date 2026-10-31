package p;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vbe1 implements xpw {
    public final /* synthetic */ byte a;
    public final rqw b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final mqw h;
    public final jsw i;

    /* JADX WARN: Code duplicated, block: B:35:0x00de  */
    public vbe1(Context context, ffe1 ffe1Var, los losVar, lzn0 lzn0Var, g05 g05Var, ole1 ole1Var, le71 le71Var, a0i1 a0i1Var) {
        dh30 dh30Var;
        ia00 ia00VarA;
        this.a = (byte) 1;
        String str = ole1Var.a;
        this.c = context;
        this.d = lzn0Var;
        this.e = g05Var;
        boolean z = ole1Var.b;
        this.f = z ? "spotify:upsell:premium_in_app_destination" : "spotify:premium-destination";
        String str2 = null;
        String strConcat = str != null ? "spotify:track:".concat(str) : null;
        if (strConcat == null || (!z && !g05Var.a())) {
            strConcat = null;
        }
        this.g = strConcat;
        qwc1 qwc1Var = new qwc1(this, (byte) 22);
        dh30 hce1Var = new hce1((yzh1) ffe1Var.b, (nke1) ffe1Var.c, z ? at50.c : at50.b, context.getResources(), (byte) 1);
        if (strConcat != null) {
            dh30Var = new dh30(hce1Var, o4p1.r(new lt20(rqt0.u(new mpy0(yoi1.g(le71Var.a.b(new oi("time_cap_upsell_page", false, new hqa1(strConcat, (byte) 28)))), strConcat, le71Var, (byte) 23)), new q8t0(3, (lnm) null, (byte) 19), (byte) 0), le71Var.b), (byte) 24);
        } else {
            dh30Var = hce1Var;
        }
        this.h = bzn1.p(this, qwc1Var, dh30Var, a0i1Var, losVar, new bu51((Object) this, (lnm) str2, (byte) 12));
        String strConcat2 = str != null ? "spotify:track:".concat(str) : null;
        if (strConcat2 == null) {
            ia00VarA = n3o1.q(this).a(kle1.b, kle1.c);
        } else {
            str2 = z ? strConcat2 : null;
            if (str2 != null) {
                ia00VarA = n3o1.q(this).a(new pm6(str2, (byte) 9), i6d1.e1);
            } else {
                ia00VarA = n3o1.q(this).a(kle1.b, kle1.c);
            }
        }
        this.b = ia00VarA;
        this.i = new f70((byte) 14);
    }

    public final rqw a() {
        byte b = this.a;
        eih1 eih1Var = this.b;
        switch (b) {
            case 0:
                return (ia00) eih1Var;
            case 1:
                return (ia00) eih1Var;
            case 2:
                return (u7h1) eih1Var;
            case 3:
                return (ia00) eih1Var;
            case 4:
                return (ia00) eih1Var;
            case 5:
                return (ia00) eih1Var;
            default:
                return eih1Var;
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
            case 5:
                break;
        }
        return this.i;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        k8d1 k8d1Var = this.h;
        switch (b) {
            case 0:
                return (rey0) k8d1Var;
            case 1:
                return (js20) k8d1Var;
            case 2:
                return (rey0) k8d1Var;
            case 3:
                return (rey0) k8d1Var;
            case 4:
                return (js20) k8d1Var;
            case 5:
                return (js20) k8d1Var;
            default:
                return k8d1Var;
        }
    }

    public vbe1(yqg yqgVar, f1n0 f1n0Var, c9n c9nVar, q8n q8nVar, fta ftaVar) {
        this.a = (byte) 0;
        this.c = yqgVar;
        this.d = f1n0Var;
        this.e = c9nVar;
        this.f = q8nVar;
        this.g = ftaVar;
        this.h = new rey0(new bxb1(this, (byte) 21));
        j2i j2iVar = new j2i(-1395673506, new vsb1(this, (byte) 22), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
        this.b = n3o1.q(this).a(i6d1.V0, i6d1.W0);
    }

    public vbe1(lzn0 lzn0Var, a1r0 a1r0Var, w1i1 w1i1Var, zhh1 zhh1Var, Activity activity) {
        this.a = (byte) 2;
        this.c = lzn0Var;
        this.d = a1r0Var;
        this.e = w1i1Var;
        this.f = zhh1Var;
        this.g = activity;
        this.h = new rey0(new q1i1(this, (byte) 0));
        this.b = new u7h1(new muh1((Object) this, (byte) 3), new q1i1(this, (byte) 1));
        j2i j2iVar = ipj.a;
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public vbe1(String str, uqv0 uqv0Var, koc0 koc0Var, nfa0 nfa0Var, o7m1 o7m1Var, q8n q8nVar) {
        this.a = (byte) 6;
        this.c = str;
        this.d = uqv0Var;
        this.e = o7m1Var;
        this.f = ((k511) uqv0Var.b).a(str);
        this.g = kln1.C(koc0Var, nfa0Var, q8nVar);
        this.h = k1o1.u(new td1((Object) this, (lnm) null, (byte) 16));
        this.b = new eih1();
        j2i j2iVar = new j2i(-1692608154, new l6i1(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public vbe1(Activity activity, jly0 jly0Var, z710 z710Var) {
        this.a = (byte) 3;
        this.c = activity;
        this.d = jly0Var;
        this.e = z710Var;
        this.h = new rey0(new g2j1(this, (byte) 4));
        this.b = n3o1.q(this).a(k3j1.e, new zyf1(this, (byte) 15));
        j2i j2iVar = jqj.a;
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
        this.f = new idd1(new v4j1(this, (byte) 1));
        this.g = new idd1(new v4j1(this, (byte) 0));
    }

    public vbe1(String str, koc0 koc0Var, y4m1 y4m1Var, eoc eocVar, quc0 quc0Var, d0r d0rVar, a1r0 a1r0Var) {
        this.a = (byte) 5;
        this.c = str;
        this.d = quc0Var;
        this.e = d0rVar;
        this.f = a1r0Var;
        this.g = w3p1.o(new l4r(new xv00(rc11.a.b(ro7.class)), 3, owl1.X0, new j4r(owl1.V0), owl1.Y0), owl1.W0);
        roc0 roc0Var = (roc0) koc0Var;
        this.h = x3p1.m(h5p1.s(rqt0.u(new vlj1(roc0Var.d(), this, (byte) 13)), y4m1Var.b(str), new ht20(rqt0.u(hu20.e(rqt0.u(new kr41(roc0Var.c(), (byte) 19)), new afb1((lnm) null, (Object) this, (byte) 18))), new e5m1(2, null, (byte) 0)), new cj81(4, (lnm) null, (byte) 5)), owl1.U0, u5l1.Y0, (o8n) null, new c4m1(this, (byte) 2), 8);
        this.b = n3o1.q(this).a(yxl1.e, new zyf1(this, (byte) 28));
        j2i j2iVar = new j2i(-1289224575, new l6i1(this, (byte) 26), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public vbe1(Context context, String str, koc0 koc0Var, sua suaVar, qpj1 qpj1Var) {
        this.a = (byte) 4;
        this.c = str;
        this.d = koc0Var;
        this.e = suaVar;
        this.f = qpj1Var;
        this.g = context.getString(2131963880);
        this.h = x3p1.n(new tak1(this, (byte) 28), owl1.Q0, u5l1.X0, (o8n) null, (iu30) null, 24);
        this.b = n3o1.q(this).a(yxl1.c, yxl1.d);
        j2i j2iVar = isj.a;
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }
}
