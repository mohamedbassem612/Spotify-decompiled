package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class qv50 implements jly0 {
    public static hn60 A(g420 g420Var) {
        return new hn60(g420Var.a(), (byte) 0);
    }

    public static w62 a(d2e d2eVar, yqg yqgVar, dp60 dp60Var, zsc zscVar, tp60 tp60Var, emm emmVar, w25 w25Var, Context context, zov0 zov0Var, yjq yjqVar) {
        return new w62(d2eVar, yqgVar, dp60Var, zscVar, tp60Var, emmVar, true, w25Var, context, zov0Var, yjqVar);
    }

    public static w62 b(d2e d2eVar, yqg yqgVar, dp60 dp60Var, zsc zscVar, tp60 tp60Var, emm emmVar, w25 w25Var, Context context, zov0 zov0Var, yjq yjqVar) {
        return new w62(d2eVar, yqgVar, dp60Var, zscVar, tp60Var, emmVar, false, w25Var, context, zov0Var, yjqVar);
    }

    public static lmo c() {
        return new lmo("default");
    }

    public static zsc d(t2j0 t2j0Var, dxz0 dxz0Var, yqg yqgVar) {
        return new zsc(t2j0Var, new lmo("default"), dxz0Var, yqgVar, (byte) 7);
    }

    public static d2e e(RetrofitMaker retrofitMaker) {
        return (d2e) retrofitMaker.createWebgateService(d2e.class, "android-home-evo-page");
    }

    public static kp00 f(w25 w25Var, xrk xrkVar) {
        return new kp00(w25Var, xrkVar, (byte) 26);
    }

    public static ArrayList g(List list, List list2, List list3, List list4) {
        return o7h.N0(list2, o7h.N0(list4, o7h.N0(list3, list)));
    }

    public static List h(owf1 owf1Var, jxp0 jxp0Var, ujc1 ujc1Var, tpp0 tpp0Var, jkp0 jkp0Var, tpp0 tpp0Var2) {
        return p7h.M(new k1v0[]{new k1v0(ujc1Var, new uve0(r6p1.p(jxp0Var, owf1Var))), new k1v0(tpp0Var2, new uve0(r6p1.p(jxp0Var, jkp0Var))), new k1v0(tpp0Var, new ypa((byte) 20, false))});
    }

    public static List i(n4b n4bVar, eea0 eea0Var, pvc pvcVar, lhc lhcVar, xq81 xq81Var, jxa jxaVar, twa1 twa1Var, ymm0 ymm0Var, nfb nfbVar, a1g1 a1g1Var, ilh1 ilh1Var, ujc1 ujc1Var) {
        return p7h.M(new k1v0[]{new k1v0(ujc1Var, new uve0(r6p1.p(new n0v0(pvcVar, (byte) 0), new n0v0(n4bVar, (byte) 0)).r(new n0v0(eea0Var, (byte) 0)).r(new n0v0(lhcVar, (byte) 0)).r(new n0v0(xq81Var, (byte) 0)).r(new n0v0(jxaVar, (byte) 0)).r(new n0v0(ymm0Var, (byte) 0)).r(new n0v0(nfbVar, (byte) 0)).r(new n0v0(a1g1Var, (byte) 0)).r(ilh1Var))), new k1v0(twa1Var, new uve0(r6p1.p(new n0v0(pvcVar, (byte) 0), new n0v0(n4bVar, (byte) 0)).r(new n0v0(eea0Var, (byte) 0)).r(new n0v0(lhcVar, (byte) 0)).r(new n0v0(xq81Var, (byte) 0)).r(new n0v0(jxaVar, (byte) 0)).r(new n0v0(ymm0Var, (byte) 0)).r(new n0v0(nfbVar, (byte) 0))))});
    }

    public static List j(e2x0 e2x0Var, n4b n4bVar, eea0 eea0Var, pvc pvcVar, lhc lhcVar, sua suaVar, zb91 zb91Var, xq81 xq81Var, jxa jxaVar, ymm0 ymm0Var, jxp0 jxp0Var, nfb nfbVar, y281 y281Var, jd1 jd1Var, av8 av8Var, vee0 vee0Var, a1g1 a1g1Var, ilh1 ilh1Var, twa1 twa1Var, gna0 gna0Var, vee0 vee0Var2, gna0 gna0Var2, vee0 vee0Var3, vee0 vee0Var4, ujc1 ujc1Var, tpp0 tpp0Var, twa1 twa1Var2, twa1 twa1Var3, tpp0 tpp0Var2, ujc1 ujc1Var2) {
        return p7h.M(new k1v0[]{new k1v0(gna0Var, eea0Var), new k1v0(vee0Var2, pvcVar), new k1v0(vee0Var4, suaVar), new k1v0(tpp0Var2, jxaVar), new k1v0(gna0Var2, lhcVar), new k1v0(twa1Var3, xq81Var), new k1v0(vee0Var3, new uve0(r6p1.u(ymm0Var, nfbVar))), new k1v0(av8Var, n4bVar), new k1v0(jd1Var, e2x0Var), new k1v0(twa1Var2, y281Var), new k1v0(tpp0Var, jxp0Var), new k1v0(vee0Var, new ypa((byte) 20, false)), new k1v0(ujc1Var2, new uve0(r6p1.p(new n0v0(a1g1Var, (byte) 0), ilh1Var))), new k1v0(ujc1Var, zb91Var), new k1v0(twa1Var, new ypa((byte) 20, false))});
    }

    public static List k(e2x0 e2x0Var, n4b n4bVar, eea0 eea0Var, pvc pvcVar, lhc lhcVar, sua suaVar, xam1 xam1Var, gmt gmtVar, xq81 xq81Var, jd1 jd1Var, ujc1 ujc1Var, jxa jxaVar, twa1 twa1Var, ymm0 ymm0Var, rgm rgmVar, jxp0 jxp0Var, nfb nfbVar, tpp0 tpp0Var) {
        return p7h.M(new k1v0[]{new k1v0(jd1Var, e2x0Var), new k1v0(rgmVar, gmtVar), new k1v0(ujc1Var, xam1Var), new k1v0(tpp0Var, jxp0Var), new k1v0(twa1Var, new uve0(r6p1.p(new n0v0(pvcVar, (byte) 0), new n0v0(suaVar, (byte) 0)).r(new n0v0(n4bVar, (byte) 0)).r(new n0v0(eea0Var, (byte) 0)).r(new n0v0(lhcVar, (byte) 0)).r(new n0v0(xq81Var, (byte) 0)).r(new n0v0(jxaVar, (byte) 0)).r(new n0v0(ymm0Var, (byte) 0)).r(new n0v0(nfbVar, (byte) 0))))});
    }

    public static List l(n4b n4bVar, i6b i6bVar, rgm rgmVar, twa1 twa1Var) {
        return p7h.M(new k1v0[]{new k1v0(rgmVar, i6bVar), new k1v0(twa1Var, new n0v0(n4bVar, (byte) 0))});
    }

    public static List m(e2x0 e2x0Var, n4b n4bVar, v9c v9cVar, ep31 ep31Var, eea0 eea0Var, lhc lhcVar, c4x0 c4x0Var, zb91 zb91Var, xq81 xq81Var, twa twaVar, uqv0 uqv0Var, s8y0 s8y0Var, jd1 jd1Var, av8 av8Var, rgm rgmVar, ymm0 ymm0Var, jxp0 jxp0Var, nfb nfbVar, twa1 twa1Var, gna0 gna0Var, gna0 gna0Var2, s8y0 s8y0Var2, ujc1 ujc1Var, tpp0 tpp0Var, twa1 twa1Var2) {
        return p7h.M(new k1v0[]{new k1v0(s8y0Var2, ep31Var), new k1v0(av8Var, new uve0(r6p1.u(v9cVar, c4x0Var))), new k1v0(jd1Var, e2x0Var), new k1v0(tpp0Var, jxp0Var), new k1v0(gna0Var, eea0Var), new k1v0(gna0Var2, lhcVar), new k1v0(twa1Var2, xq81Var), new k1v0(ujc1Var, zb91Var), new k1v0(rgmVar, twaVar), new k1v0(s8y0Var, uqv0Var), new k1v0(twa1Var, new uve0(r6p1.p(new n0v0(ymm0Var, (byte) 0), new n0v0(nfbVar, (byte) 0)).r(new n0v0(n4bVar, (byte) 0)).r(new n0v0(twaVar, (byte) 0)).r(new n0v0(uqv0Var, (byte) 0))))});
    }

    public static List n(owf1 owf1Var, ujc1 ujc1Var) {
        return Collections.singletonList(new k1v0(ujc1Var, owf1Var));
    }

    public static List o(e2x0 e2x0Var, m4e0 m4e0Var, jd1 jd1Var, ymm0 ymm0Var, jxp0 jxp0Var, nfb nfbVar, twa1 twa1Var, h0y h0yVar, tpp0 tpp0Var, jkp0 jkp0Var, vee0 vee0Var) {
        return p7h.M(new k1v0[]{new k1v0(tpp0Var, new uve0(r6p1.p(jxp0Var, jkp0Var))), new k1v0(vee0Var, new uve0(r6p1.p(m4e0Var, new n0v0(h0yVar, (byte) 0)).r(new n0v0(ymm0Var, (byte) 0)).r(new n0v0(nfbVar, (byte) 0)))), new k1v0(jd1Var, e2x0Var), new k1v0(twa1Var, new uve0(r6p1.p(new n0v0(ymm0Var, (byte) 0), new n0v0(nfbVar, (byte) 0))))});
    }

    public static List p(y281 y281Var, twa1 twa1Var, twa1 twa1Var2) {
        return p7h.M(new k1v0[]{new k1v0(twa1Var2, y281Var), new k1v0(twa1Var, new ypa((byte) 20, false))});
    }

    public static List q(rjn rjnVar, rgm rgmVar) {
        return Collections.singletonList(new k1v0(rgmVar, rjnVar));
    }

    public static List r(fza fzaVar, hwb hwbVar, av8 av8Var) {
        return Collections.singletonList(new k1v0(av8Var, new uve0(r6p1.u(fzaVar, hwbVar))));
    }

    public static List s(eea0 eea0Var, lhc lhcVar, sua suaVar, xq81 xq81Var, twa twaVar, y281 y281Var, djm djmVar, rgm rgmVar, twa1 twa1Var, h5a1 h5a1Var) {
        return p7h.M(new k1v0[]{new k1v0(twa1Var, y281Var), new k1v0(rgmVar, new uve0(r6p1.p(djmVar, new n0v0(eea0Var, (byte) 0)).r(new n0v0(lhcVar, (byte) 0)).r(new n0v0(xq81Var, (byte) 0)).r(new n0v0(suaVar, (byte) 0)).r(new n0v0(twaVar, (byte) 0)).s(r6p1.u(new n0v0(y281Var, (byte) 0), h5a1Var))))});
    }

    public static Observable t(kly0 kly0Var) {
        return Observable.defer(new yj1(kly0Var, (byte) 10));
    }

    public static mp60 u(w62 w62Var, w62 w62Var2, w25 w25Var, yqg yqgVar, lxg lxgVar, yjq yjqVar, kp00 kp00Var, pv00 pv00Var, dp60 dp60Var, tp60 tp60Var) {
        return new mp60(w62Var, w62Var2, w25Var, yqgVar, lxgVar, yjqVar, kp00Var, pv00Var, dp60Var, tp60Var);
    }

    public static iq60 v(zle1 zle1Var, lxg lxgVar, tif1 tif1Var, w25 w25Var) {
        return new iq60(zle1Var, lxgVar, tif1Var, w25Var);
    }

    public static List w(e2x0 e2x0Var, fza fzaVar, i2i1 i2i1Var, eea0 eea0Var, ep31 ep31Var, lhc lhcVar, sua suaVar, lhc lhcVar2, jd1 jd1Var, s8y0 s8y0Var, xq81 xq81Var, twa twaVar, rgm rgmVar, nl51 nl51Var, s8y0 s8y0Var2, pvc pvcVar, zwa zwaVar, o2b1 o2b1Var, ujc1 ujc1Var, m980 m980Var, av8 av8Var, vee0 vee0Var, gna0 gna0Var, rgm rgmVar2, gna0 gna0Var2) {
        return p7h.M(new k1v0[]{new k1v0(rgmVar2, new uve0(r6p1.p(i2i1Var, new n0v0(fzaVar, (byte) 0)).r(new n0v0(xq81Var, (byte) 0)).r(new n0v0(pvcVar, (byte) 0)).s(r6p1.p(new n0v0(zwaVar, (byte) 0), ep31Var)))), new k1v0(jd1Var, new uve0(r6p1.p(new n0v0(suaVar, (byte) 0), new n0v0(xq81Var, (byte) 0)).r(new n0v0(twaVar, (byte) 0)))), new k1v0(vee0Var, suaVar), new k1v0(s8y0Var, new uve0(r6p1.p(lhcVar2, ep31Var).r(new n0v0(xq81Var, (byte) 0)))), new k1v0(ujc1Var, new uve0(r6p1.p(o2b1Var, new n0v0(lhcVar, (byte) 0)).r(new n0v0(xq81Var, (byte) 0)).r(new n0v0(suaVar, (byte) 0)))), new k1v0(rgmVar, new uve0(r6p1.p(new n0v0(o2b1Var, (byte) 0), new n0v0(lhcVar, (byte) 0)).r(new n0v0(suaVar, (byte) 0)))), new k1v0(av8Var, fzaVar), new k1v0(s8y0Var, new uve0(r6p1.p(ep31Var, new n0v0(e2x0Var, (byte) 0)).r(new n0v0(eea0Var, (byte) 0)).r(new n0v0(lhcVar, (byte) 0)).r(new n0v0(xq81Var, (byte) 0)).r(new n0v0(suaVar, (byte) 0)).r(new n0v0(twaVar, (byte) 0)))), new k1v0(gna0Var, lhcVar), new k1v0(gna0Var2, m980Var), new k1v0(s8y0Var2, nl51Var)});
    }

    public static nay x(ozp ozpVar) {
        return new nay(ozpVar, (byte) 25);
    }

    public static List y(sua suaVar, xq81 xq81Var, twa twaVar, x5j1 x5j1Var, av8 av8Var) {
        return Collections.singletonList(new k1v0(av8Var, new uve0(r6p1.p(x5j1Var, new n0v0(twaVar, (byte) 0)).r(new n0v0(suaVar, (byte) 0)).r(new n0v0(xq81Var, (byte) 0)))));
    }

    public static List z(lhc lhcVar, xq81 xq81Var, ymm0 ymm0Var, nfb nfbVar, s8y0 s8y0Var) {
        return Collections.singletonList(new k1v0(s8y0Var, new uve0(r6p1.p(new n0v0(lhcVar, (byte) 0), new n0v0(xq81Var, (byte) 0)).r(new n0v0(ymm0Var, (byte) 0)).r(new n0v0(nfbVar, (byte) 0)))));
    }
}
