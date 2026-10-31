package p;

import android.content.Context;
import android.os.StatFs;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;
import com.spotify.listuxplatformconsumers.likedsongs.shared.filtertagsdata.FilterTagsDatabase;
import io.reactivex.rxjava3.core.Scheduler;
import java.io.File;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class t4c0 implements jly0 {
    public static gc31 A(w5b1 w5b1Var, i8b0 i8b0Var, Scheduler scheduler) {
        return o0c.J(w5b1Var.d.c(), "spclient.wg.spotify.com", i8b0Var, scheduler);
    }

    public static RetrofitMaker B(w5b1 w5b1Var, i8b0 i8b0Var, Scheduler scheduler) {
        yyp0 yyp0Var = w5b1Var.d;
        return new RetrofitMaker(o0c.J(yyp0Var.c(), "spclient.wg.spotify.com", i8b0Var, scheduler), yyp0Var, (gc31) null, (l270) null, o610.t);
    }

    public static azp0 C(w5b1 w5b1Var) {
        azp0 azp0Var = w5b1Var.b;
        c8o.m(azp0Var);
        return azp0Var;
    }

    public static bz81 D(boolean z, lkl1 lkl1Var, q8n q8nVar) {
        return new bz81(lkl1Var, z, q8nVar);
    }

    public static j6c0 a(RetrofitMaker retrofitMaker) {
        return (j6c0) retrofitMaker.createWebgateService(j6c0.class, "android-libraryimport-matchresult-impl");
    }

    public static FilterTagsDatabase b(Context context, String str) {
        bn31 bn31VarT = u890.t(context, FilterTagsDatabase.class, "list_platform_liked_songs_filter_tags_db_" + str.hashCode());
        bn31VarT.d();
        return bn31VarT.c();
    }

    public static zq50 c() {
        return new zq50();
    }

    public static xf01 d(Context context) {
        return new xf01(new File(context.getApplicationContext().getCacheDir(), "http-cache"), 5242880L);
    }

    public static czp0 e(w5b1 w5b1Var) {
        czp0 czp0Var = w5b1Var.g;
        c8o.m(czp0Var);
        return czp0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set f(ltp0 ltp0Var, zq50 zq50Var, mu4 mu4Var, glg glgVar) {
        return f46.S0(new p090[]{ltp0Var, zq50Var, mu4Var, glgVar});
    }

    public static x8c0 g() {
        tac0 tac0Var = krw0.i.f;
        c8o.m(tac0Var);
        return tac0Var;
    }

    public static ccc0 h(Context context, iyc0 iyc0Var, agc0 agc0Var, r5h r5hVar, q8n q8nVar, spq0 spq0Var) {
        return new ccc0(context, iyc0Var, agc0Var, r5hVar, q8nVar, spq0Var);
    }

    public static zwa i(wp20 wp20Var) {
        return new zwa(wp20Var, (byte) 24);
    }

    public static List j(owf1 owf1Var, pvc pvcVar, sua suaVar, zb91 zb91Var, fp8 fp8Var, av8 av8Var, av8 av8Var2, jxp0 jxp0Var, m7y0 m7y0Var, ujc1 ujc1Var, tpp0 tpp0Var, s8y0 s8y0Var, tpp0 tpp0Var2, lqr lqrVar, rgm rgmVar, wb00 wb00Var, gna0 gna0Var, vee0 vee0Var, vqv0 vqv0Var, tpp0 tpp0Var3, r961 r961Var, s8y0 s8y0Var2, y281 y281Var, twa1 twa1Var, ij01 ij01Var, s8y0 s8y0Var3, uqv0 uqv0Var, tpp0 tpp0Var4, jkp0 jkp0Var, tpp0 tpp0Var5, hfb hfbVar, tpp0 tpp0Var6, ujc1 ujc1Var2, ujc1 ujc1Var3, gna0 gna0Var2, m7y0 m7y0Var2, tpp0 tpp0Var7, ujc1 ujc1Var4, tpp0 tpp0Var8, hvp0 hvp0Var, s8y0 s8y0Var4, tpp0 tpp0Var9, tpp0 tpp0Var10, m980 m980Var, rgm rgmVar2) {
        return p7h.M(new k1v0[]{new k1v0(av8Var, new ypa((byte) 20, false)), new k1v0(tpp0Var, new ypa((byte) 20, false)), new k1v0(tpp0Var2, new ypa((byte) 20, false)), new k1v0(tpp0Var4, new ypa((byte) 20, false)), new k1v0(rgmVar, lqrVar), new k1v0(rgmVar2, m980Var), new k1v0(tpp0Var3, vqv0Var), new k1v0(gna0Var, wb00Var), new k1v0(tpp0Var6, hfbVar), new k1v0(ujc1Var, new ypa((byte) 20, false)), new k1v0(av8Var2, new n0v0(fp8Var, (byte) 0)), new k1v0(tpp0Var7, new ypa((byte) 20, false)), new k1v0(vee0Var, new ypa((byte) 20, false)), new k1v0(twa1Var, y281Var), new k1v0(s8y0Var3, ij01Var), new k1v0(s8y0Var4, hvp0Var), new k1v0(tpp0Var5, new ypa((byte) 20, false)), new k1v0(s8y0Var2, r961Var), new k1v0(gna0Var2, pvcVar), new k1v0(s8y0Var, m7y0Var), new k1v0(tpp0Var10, new uve0(r6p1.p(jxp0Var, m7y0Var2))), new k1v0(tpp0Var9, new uve0(r6p1.p(jxp0Var, uqv0Var).r(jkp0Var))), new k1v0(ujc1Var4, zb91Var), new k1v0(tpp0Var8, suaVar), new k1v0(ujc1Var2, owf1Var), new k1v0(ujc1Var3, owf1Var)});
    }

    public static dss0 k(RetrofitMaker retrofitMaker) {
        return (dss0) retrofitMaker.createWebgateService(dss0.class, "android-list-platform-endpoints-impl");
    }

    public static xf01 l(Context context) {
        long blockCount;
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            blockCount = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 50;
        } catch (IllegalArgumentException unused) {
            blockCount = 5242880;
        }
        return new xf01(file, Math.max(Math.min(blockCount, 52428800L), 5242880L));
    }

    public static bzp0 m(hb4 hb4Var) {
        return new bzp0(hb4Var.n(), hb4Var.o(), hb4Var.m(), hb4Var.l(), hb4Var.k(), hb4Var.p(), hb4Var.r(), hb4Var.j(), hb4Var.q());
    }

    public static jn7 n(CallbackRouter callbackRouter) {
        return new jn7(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 22)));
    }

    public static bf70 o(izp izpVar) {
        return new bf70(izpVar, (byte) 18);
    }

    public static bf70 p(kzp kzpVar) {
        return new bf70(kzpVar, (byte) 15);
    }

    public static bf70 q(nzp nzpVar) {
        return new bf70(nzpVar, (byte) 17);
    }

    public static bf70 r(ozp ozpVar) {
        return new bf70(ozpVar, (byte) 16);
    }

    public static bf70 s(rzp rzpVar) {
        return new bf70(rzpVar, (byte) 20);
    }

    public static bf70 t(vzp vzpVar) {
        return new bf70(vzpVar, (byte) 21);
    }

    public static bf70 u(d1q d1qVar) {
        return new bf70(d1qVar, (byte) 19);
    }

    public static mna0 v(xgc xgcVar) {
        return new mna0(xgcVar, (byte) 4);
    }

    public static mna0 w(khc khcVar) {
        return new mna0(khcVar, (byte) 5);
    }

    public static mna0 x(lhc lhcVar) {
        return new mna0(lhcVar, (byte) 6);
    }

    public static mna0 y(mhc mhcVar) {
        return new mna0(mhcVar, (byte) 7);
    }

    public static fo71 z(zwa zwaVar) {
        wp20 wp20Var = (wp20) zwaVar.b;
        return new fo71((zwz0) wp20Var.c, new ao71(new g971(new l7c((byte) 24), new twb((byte) 21)), (byte) 1), new ao71(zwaVar.q(), (byte) 0), (o3q0) wp20Var.d, (g871) wp20Var.b, (u690) wp20Var.e);
    }
}
