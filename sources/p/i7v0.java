package p;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class i7v0 implements jly0 {
    public static t700 a(ynb0 ynb0Var) {
        return new t700(ynb0Var, (byte) 29);
    }

    public static yqu0 b(Context context, jpa0 jpa0Var) {
        return new yqu0(context, jpa0Var, (byte) 7);
    }

    public static rgv0 c(jly0 jly0Var, jly0 jly0Var2) {
        rgv0 rgv0Var = new rgv0();
        rgv0Var.a = jly0Var;
        rgv0Var.b = jly0Var2;
        return rgv0Var;
    }

    public static aov0 d(jo80 jo80Var, kly0 kly0Var, g5t g5tVar, caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, kly0 kly0Var2, jly0 jly0Var, caq caqVar5) {
        aov0 aov0Var = new aov0();
        aov0Var.a = jo80Var;
        aov0Var.b = kly0Var;
        aov0Var.c = g5tVar;
        aov0Var.d = caqVar;
        aov0Var.e = caqVar2;
        aov0Var.f = caqVar3;
        aov0Var.g = caqVar4;
        aov0Var.h = kly0Var2;
        aov0Var.i = jly0Var;
        aov0Var.j = caqVar5;
        return aov0Var;
    }

    public static hwv0 e(jly0 jly0Var, caq caqVar, jly0 jly0Var2, jly0 jly0Var3, caq caqVar2) {
        hwv0 hwv0Var = new hwv0();
        hwv0Var.a = jly0Var;
        hwv0Var.b = caqVar;
        hwv0Var.c = jly0Var2;
        hwv0Var.d = jly0Var3;
        hwv0Var.e = caqVar2;
        return hwv0Var;
    }

    public static egn0 f(ynb0 ynb0Var) {
        egn0 egn0Var = new egn0((byte) 24);
        egn0Var.b = ynb0Var;
        return egn0Var;
    }

    public static egn0 g(ynb0 ynb0Var) {
        egn0 egn0Var = new egn0((byte) 25);
        egn0Var.b = ynb0Var;
        return egn0Var;
    }

    public static chs h(Scheduler scheduler, dpv0 dpv0Var) {
        return new chs(new zov0((byte) 3), new jkp0(dpv0Var, (byte) 27), apv0.a, "ro.csc.spotify.music.referrerid", "ro.csc.spotify.music.partnerid", scheduler);
    }

    public static Map i() {
        Boolean bool = Boolean.TRUE;
        return sqg0.T(f46.i0(new mmr0[]{new mmr0("link", bool), new mmr0("name", bool), new mmr0("offline", bool), new mmr0("isNew", bool), new mmr0("isInListenLater", bool), new mmr0("isPlayed", bool), new mmr0("length", bool), new mmr0("timeLeft", bool), new mmr0("playable", bool), new mmr0("available", bool), new mmr0("covers", bool), new mmr0("isExplicit", bool), new mmr0("covers", bool), new mmr0("isExplicit", bool), new mmr0("is19PlusOnly", bool), new mmr0("freezeFrames", bool), new mmr0("manifestId", bool), new mmr0("mediaTypeEnum", bool), new mmr0("description", bool), new mmr0("publishDate", bool), new mmr0("addTime", bool), new mmr0("syncProgress", bool), new mmr0("isMusicAndTalk", bool), new mmr0("isCurated", bool)}));
    }

    public static List j() {
        return p7h.M(new Integer[]{4, 22, 58, 164, 30});
    }

    public static flk1 k(Scheduler scheduler, dpv0 dpv0Var) {
        return new flk1(new hlk1(), "spotify_channel.txt", "vivo_in_preload", scheduler, dpv0Var);
    }

    public static orj0 l(Scheduler scheduler) {
        return new orj0(new zov0((byte) 3), scheduler);
    }

    public static g5l0 m() {
        return new g5l0(r6h1.c, (byte) 4);
    }

    public static qlr0 n(rlr0 rlr0Var, InstallReferrerClient installReferrerClient, qib qibVar, et50 et50Var, Scheduler scheduler) {
        return new qlr0(rlr0Var, installReferrerClient, qibVar, et50Var, scheduler);
    }

    public static pjq0 o(k3q k3qVar) {
        return new pjq0(k3qVar, (byte) 21);
    }

    public static q6v0 p() {
        return new q6v0();
    }

    public static llm q(q8n q8nVar) {
        return i3a.k(q8nVar);
    }

    public static List r(cua cuaVar, s8y0 s8y0Var, a4x0 a4x0Var, jd1 jd1Var, wgz0 wgz0Var, xbm1 xbm1Var, h2x0 h2x0Var, jd1 jd1Var2, d4e0 d4e0Var, vee0 vee0Var) {
        return p7h.M(new k1v0[]{new k1v0(s8y0Var, cuaVar), new k1v0(jd1Var, a4x0Var), new k1v0(jd1Var2, h2x0Var), new k1v0(vee0Var, d4e0Var), new k1v0(xbm1Var, wgz0Var)});
    }

    public static ojv0 s(r7q r7qVar) {
        return new ojv0(r7qVar);
    }

    public static sam0 t(BehaviorSubject behaviorSubject, xm41 xm41Var, lxg lxgVar, dn41 dn41Var) {
        ym41 ym41Var = new ym41("PreSessionTemporary");
        ym41Var.a = dn41Var;
        jge jgeVarE = hu20.e(eqr0.m(xm41Var), new ms4((lnm) null, new hf31(new hws0(behaviorSubject, lxgVar, (byte) 20), ym41Var, (byte) 17), (byte) 9));
        AtomicInteger atomicInteger = ym41.c;
        return hwb.u("PreSessionTemporary", jgeVarE, Collections.singleton(xm41Var), ym41Var.b, ym41Var.a);
    }

    public static u3h u() {
        Boolean bool = Boolean.TRUE;
        return new u3h(sqg0.H(new mmr0[]{new mmr0("name", bool), new mmr0("link", bool), new mmr0("inCollection", bool), new mmr0("covers", bool)}));
    }

    public static iih1 v(s3h s3hVar) {
        nia1 nia1Var = v3h.a;
        d1z d1zVar = d1z.a;
        return new iih1(s3hVar, new gih1(false), new hih1(), 11);
    }

    public static izj w(byf byfVar, ch0 ch0Var, e4b1 e4b1Var, dg30 dg30Var, zxf zxfVar, iac0 iac0Var) {
        return new izj(p7h.M(new q2i1[]{byf.c(byfVar, ch0Var, e4b1Var, dg30Var, zxfVar, iac0Var), new w8g(new mhc((byte) 16), new hod0(e4b1Var, (byte) 20))}));
    }

    public static orj0 x(Scheduler scheduler, dpv0 dpv0Var) {
        return new orj0(new hlk1(), scheduler, dpv0Var);
    }

    public static dpv0 y(g420 g420Var) {
        return new dpv0(g420Var.a());
    }

    public static yeu0 z(gma1 gma1Var, Context context) {
        return new yeu0(gma1Var.a(), context.getApplicationContext(), (byte) 13);
    }
}
