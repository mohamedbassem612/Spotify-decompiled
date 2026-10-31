package p;

import android.content.Context;
import android.os.Bundle;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class tq21 implements jly0 {
    public static wf2 A(xrk xrkVar) {
        return new wf2(xrkVar, (byte) 18);
    }

    public static Set B(ydh1 ydh1Var) {
        Set set = (Set) ydh1Var.b.getValue();
        c8o.m(set);
        return set;
    }

    public static uoq C(ll3 ll3Var) {
        return new uoq(ll3Var);
    }

    public static ppw0 a(ynb0 ynb0Var) {
        ppw0 ppw0Var = new ppw0((byte) 25);
        ppw0Var.b = ynb0Var;
        return ppw0Var;
    }

    public static pa31 b(r7q r7qVar, kly0 kly0Var, caq caqVar, kly0 kly0Var2, kly0 kly0Var3, kly0 kly0Var4, caq caqVar2, caq caqVar3, r7q r7qVar2, gbp gbpVar, kly0 kly0Var5, caq caqVar4, jo80 jo80Var) {
        pa31 pa31Var = new pa31();
        pa31Var.a = r7qVar;
        pa31Var.b = kly0Var;
        pa31Var.c = caqVar;
        pa31Var.d = kly0Var2;
        pa31Var.e = kly0Var3;
        pa31Var.f = kly0Var4;
        pa31Var.g = caqVar2;
        pa31Var.h = caqVar3;
        pa31Var.i = r7qVar2;
        pa31Var.j = gbpVar;
        pa31Var.k = kly0Var5;
        pa31Var.l = caqVar4;
        pa31Var.m = jo80Var;
        return pa31Var;
    }

    public static lh31 c(thq thqVar, kly0 kly0Var, kly0 kly0Var2, jo80 jo80Var, r7q r7qVar, kly0 kly0Var3, kly0 kly0Var4, kly0 kly0Var5, r7q r7qVar2, caq caqVar, r7q r7qVar3, g5t g5tVar, caq caqVar2, r7q r7qVar4, r7q r7qVar5, kly0 kly0Var6, caq caqVar3, caq caqVar4, caq caqVar5, caq caqVar6, kly0 kly0Var7, kly0 kly0Var8, r7q r7qVar6, r7q r7qVar7) {
        lh31 lh31Var = new lh31();
        lh31Var.a = thqVar;
        lh31Var.b = kly0Var;
        lh31Var.c = kly0Var2;
        lh31Var.d = jo80Var;
        lh31Var.e = r7qVar;
        lh31Var.f = kly0Var3;
        lh31Var.g = kly0Var4;
        lh31Var.h = kly0Var5;
        lh31Var.i = r7qVar2;
        lh31Var.j = caqVar;
        lh31Var.k = r7qVar3;
        lh31Var.l = g5tVar;
        lh31Var.m = caqVar2;
        lh31Var.n = r7qVar4;
        lh31Var.o = r7qVar5;
        lh31Var.f24p = kly0Var6;
        lh31Var.q = caqVar3;
        lh31Var.r = caqVar4;
        lh31Var.s = caqVar5;
        lh31Var.t = caqVar6;
        lh31Var.u = kly0Var7;
        lh31Var.v = kly0Var8;
        lh31Var.w = r7qVar6;
        lh31Var.x = r7qVar7;
        return lh31Var;
    }

    public static List d(twa1 twa1Var) {
        return Collections.singletonList(new k1v0(twa1Var, new ypa((byte) 20, false)));
    }

    public static List e(fna fnaVar, rpv0 rpv0Var, i3b i3bVar, jxp0 jxp0Var, a0b a0bVar, vee0 vee0Var, twa1 twa1Var, av8 av8Var, twa1 twa1Var2, twa1 twa1Var3, ujc1 ujc1Var) {
        return p7h.M(new k1v0[]{new k1v0(ujc1Var, a0bVar), new k1v0(av8Var, new uve0(r6p1.u(fnaVar, i3bVar))), new k1v0(vee0Var, new ypa((byte) 20, false)), new k1v0(twa1Var, new ypa((byte) 20, false)), new k1v0(twa1Var2, new n0v0(rpv0Var, (byte) 0)), new k1v0(twa1Var3, new uve0(r6p1.p(new n0v0(jxp0Var, (byte) 0), new n0v0(rpv0Var, (byte) 0))))});
    }

    public static List f(rpv0 rpv0Var, s8y0 s8y0Var) {
        return Collections.singletonList(new k1v0(s8y0Var, rpv0Var));
    }

    public static List g(fna fnaVar, sua suaVar, cua cuaVar, av8 av8Var, tz01 tz01Var, twa1 twa1Var, gna0 gna0Var, twa1 twa1Var2, vee0 vee0Var) {
        return p7h.M(new k1v0[]{new k1v0(av8Var, fnaVar), new k1v0(gna0Var, cuaVar), new k1v0(vee0Var, suaVar), new k1v0(twa1Var, tz01Var), new k1v0(twa1Var2, new ypa((byte) 20, false))});
    }

    public static List h(lhc lhcVar, zb91 zb91Var, rgm rgmVar, lqc lqcVar, i3b i3bVar, jc9 jc9Var, jxp0 jxp0Var, ujc1 ujc1Var, s8y0 s8y0Var, xbm1 xbm1Var, mlw0 mlw0Var, av8 av8Var) {
        return p7h.M(new k1v0[]{new k1v0(s8y0Var, new uve0(r6p1.p(jxp0Var, mlw0Var))), new k1v0(xbm1Var, lqcVar), new k1v0(rgmVar, jc9Var), new k1v0(ujc1Var, new uve0(r6p1.u(zb91Var, i3bVar))), new k1v0(av8Var, lhcVar)});
    }

    public static List i(ke90 ke90Var, sks0 sks0Var, s8y0 s8y0Var) {
        return p7h.M(new k1v0[]{new k1v0(ke90Var, new ypa((byte) 20, false)), new k1v0(s8y0Var, sks0Var)});
    }

    public static List j(fza fzaVar, n4b n4bVar, eea0 eea0Var, pvc pvcVar, lhc lhcVar, sua suaVar, dqu dquVar, jd1 jd1Var, av8 av8Var, s8y0 s8y0Var, twa twaVar, lqc lqcVar, wcr wcrVar, ks21 ks21Var, s8y0 s8y0Var2, rgm rgmVar, jxp0 jxp0Var, a42 a42Var, jd1 jd1Var2, s8y0 s8y0Var3, aod aodVar, ruc0 ruc0Var, tym0 tym0Var) {
        return p7h.M(new k1v0[]{new k1v0(s8y0Var2, new uve0(r6p1.p(ks21Var, new n0v0(jxp0Var, (byte) 0)).r(new n0v0(pvcVar, (byte) 0)).r(new n0v0(lqcVar, (byte) 0)).r(new n0v0(twaVar, (byte) 0)).s(r6p1.u(new n0v0(fzaVar, (byte) 0), dquVar)).s(r6p1.u(new n0v0(eea0Var, (byte) 0), wcrVar)).s(r6p1.u(new n0v0(suaVar, (byte) 0), tym0Var)).s(r6p1.u(new n0v0(lhcVar, (byte) 0), ruc0Var)).s(r6p1.u(new n0v0(n4bVar, (byte) 0), aodVar)))), new k1v0(jd1Var2, a42Var), new k1v0(s8y0Var3, new ypa((byte) 20, false)), new k1v0(av8Var, new ypa((byte) 20, false)), new k1v0(s8y0Var, new ypa((byte) 20, false)), new k1v0(rgmVar, new ypa((byte) 20, false)), new k1v0(jd1Var, new ypa((byte) 20, false))});
    }

    public static List k(v9c v9cVar, owf1 owf1Var, ep31 ep31Var, c4x0 c4x0Var, ujc1 ujc1Var, av8 av8Var, s8y0 s8y0Var) {
        return p7h.M(new k1v0[]{new k1v0(s8y0Var, ep31Var), new k1v0(av8Var, new uve0(r6p1.u(v9cVar, c4x0Var))), new k1v0(ujc1Var, owf1Var)});
    }

    public static List l(pxg pxgVar, lan1 lan1Var, n0v0 n0v0Var, jxp0 jxp0Var, a0b a0bVar, av8 av8Var, jd1 jd1Var, tpp0 tpp0Var, ujc1 ujc1Var) {
        return p7h.M(new k1v0[]{new k1v0(av8Var, pxgVar), new k1v0(jd1Var, lan1Var), new k1v0(tpp0Var, new uve0(r6p1.p(jxp0Var, n0v0Var))), new k1v0(ujc1Var, a0bVar)});
    }

    public static List m(e2x0 e2x0Var, twa1 twa1Var) {
        return Collections.singletonList(new k1v0(twa1Var, new n0v0(e2x0Var, (byte) 0)));
    }

    public static List n(ep31 ep31Var, oql oqlVar, twa1 twa1Var, s8y0 s8y0Var, rgm rgmVar) {
        return p7h.M(new k1v0[]{new k1v0(rgmVar, oqlVar), new k1v0(s8y0Var, ep31Var), new k1v0(twa1Var, new ypa((byte) 20, false))});
    }

    public static List o(v9c v9cVar, ep31 ep31Var, pvc pvcVar, sua suaVar, cua cuaVar, m4e0 m4e0Var, jim1 jim1Var, l7c l7cVar, av8 av8Var, gna0 gna0Var, xbm1 xbm1Var, twa1 twa1Var, s8y0 s8y0Var, vee0 vee0Var, vee0 vee0Var2, vee0 vee0Var3, vee0 vee0Var4, twa1 twa1Var2) {
        return p7h.M(new k1v0[]{new k1v0(av8Var, v9cVar), new k1v0(s8y0Var, ep31Var), new k1v0(vee0Var3, suaVar), new k1v0(xbm1Var, jim1Var), new k1v0(gna0Var, cuaVar), new k1v0(vee0Var, pvcVar), new k1v0(twa1Var2, l7cVar), new k1v0(vee0Var2, m4e0Var), new k1v0(vee0Var4, new ypa((byte) 20, false)), new k1v0(twa1Var, new ypa((byte) 20, false))});
    }

    public static Set p(pte0 pte0Var) {
        xj61 xj61Var = pte0Var.a;
        c8o.m(xj61Var);
        return xj61Var;
    }

    public static List q(bue0 bue0Var) {
        return bue0Var.a;
    }

    public static Set r(aue0 aue0Var) {
        return aue0Var.a;
    }

    public static LinkedHashSet s(e8q0 e8q0Var) {
        return e8q0Var.a;
    }

    public static tjs0 t(zhq0 zhq0Var) {
        return zhq0Var.j();
    }

    public static List u(ke90 ke90Var, rgm rgmVar, gna0 gna0Var, ke90 ke90Var2, gna0 gna0Var2, vee0 vee0Var, gna0 gna0Var3, ujc1 ujc1Var) {
        return p7h.M(new k1v0[]{new k1v0(ke90Var, new ypa((byte) 20, false)), new k1v0(rgmVar, new ypa((byte) 20, false)), new k1v0(gna0Var, new ypa((byte) 20, false)), new k1v0(gna0Var2, new ypa((byte) 20, false)), new k1v0(gna0Var3, new ypa((byte) 20, false)), new k1v0(ujc1Var, new ypa((byte) 20, false)), new k1v0(ke90Var2, new ypa((byte) 20, false)), new k1v0(vee0Var, new ypa((byte) 20, false))});
    }

    public static zs21 v(o0p0 o0p0Var, gh4 gh4Var) {
        Bundle bundle = ((zf30) o0p0Var).f;
        boolean z = false;
        boolean z2 = bundle != null ? bundle.getBoolean("embedded_in_bottom_sheet", false) : false;
        Bundle bundle2 = ((zf30) o0p0Var).f;
        boolean z3 = bundle2 != null ? bundle2.getBoolean("large_screen_layout_enabled", false) : false;
        if (gh4Var.c() && !z2 && !z3) {
            z = true;
        }
        return new zs21(z);
    }

    public static ti31 w(Context context, w5b1 w5b1Var) {
        return new ti31(context, w5b1Var);
    }

    public static mj31 x(tjs0 tjs0Var) {
        if (tjs0Var.equals(tjs0.a)) {
            return m9x0.h;
        }
        if (tjs0Var.equals(tjs0.c)) {
            return new lj31(30.0f);
        }
        if (tjs0Var.equals(tjs0.b)) {
            return new lj31(30.0f);
        }
        if (tjs0Var.equals(tjs0.d)) {
            return new lj31(30.0f);
        }
        eg.o();
        return null;
    }

    public static fub0 y(q8n q8nVar, kly0 kly0Var) {
        return new fub0(q8nVar, kly0Var);
    }

    public static jn7 z(CallbackRouter callbackRouter) {
        return new jn7(new CosmosCoroutineTransport(new q7v0(callbackRouter, (byte) 2)));
    }
}
