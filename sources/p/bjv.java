package p;

import android.app.Application;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class bjv implements jly0 {
    public static fsw0 A(Application application) {
        return ph5.M(application);
    }

    public static y0w B() {
        return new y0w();
    }

    public static m4c C() {
        return new m4c((byte) 8);
    }

    public static m441 a(hce1 hce1Var) {
        return new m441(new hxn(hce1Var, (lnm) null, (byte) 26));
    }

    public static i0x b(fdq fdqVar, kcq kcqVar, ge4 ge4Var) {
        return ge4Var.k() ? kcqVar : fdqVar;
    }

    public static zcp c(l8a l8aVar) {
        return new zcp(l8aVar);
    }

    public static h21 d(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 23);
    }

    public static odc e(ynb0 ynb0Var, ynb0 ynb0Var2) {
        odc odcVar = new odc((byte) 29);
        odcVar.b = ynb0Var;
        odcVar.c = ynb0Var2;
        return odcVar;
    }

    public static npv f(caq caqVar) {
        npv npvVar = new npv();
        npvVar.a = caqVar;
        return npvVar;
    }

    public static vwv g(caq caqVar, caq caqVar2, caq caqVar3, jo80 jo80Var, kly0 kly0Var, caq caqVar4, kly0 kly0Var2, r7q r7qVar, kly0 kly0Var3, r7q r7qVar2, caq caqVar5, jly0 jly0Var, r7q r7qVar3, r7q r7qVar4, r7q r7qVar5, caq caqVar6, kly0 kly0Var4, caq caqVar7) {
        vwv vwvVar = new vwv();
        vwvVar.a = caqVar;
        vwvVar.b = caqVar2;
        vwvVar.c = caqVar3;
        vwvVar.d = jo80Var;
        vwvVar.e = kly0Var;
        vwvVar.f = caqVar4;
        vwvVar.g = kly0Var2;
        vwvVar.h = r7qVar;
        vwvVar.i = kly0Var3;
        vwvVar.j = r7qVar2;
        vwvVar.k = caqVar5;
        vwvVar.l = jly0Var;
        vwvVar.m = r7qVar3;
        vwvVar.n = r7qVar4;
        vwvVar.o = r7qVar5;
        vwvVar.f46p = caqVar6;
        vwvVar.q = kly0Var4;
        vwvVar.r = caqVar7;
        return vwvVar;
    }

    public static jyv h(caq caqVar, caq caqVar2, caq caqVar3, jo80 jo80Var, kly0 kly0Var, caq caqVar4, kly0 kly0Var2, r7q r7qVar, kly0 kly0Var3, caq caqVar5, r7q r7qVar2, caq caqVar6, jly0 jly0Var, r7q r7qVar3, r7q r7qVar4, r7q r7qVar5, caq caqVar7, kly0 kly0Var4, caq caqVar8) {
        jyv jyvVar = new jyv();
        jyvVar.a = caqVar;
        jyvVar.b = caqVar2;
        jyvVar.c = caqVar3;
        jyvVar.d = jo80Var;
        jyvVar.e = kly0Var;
        jyvVar.f = caqVar4;
        jyvVar.g = kly0Var2;
        jyvVar.h = r7qVar;
        jyvVar.i = kly0Var3;
        jyvVar.j = caqVar5;
        jyvVar.k = r7qVar2;
        jyvVar.l = caqVar6;
        jyvVar.m = jly0Var;
        jyvVar.n = r7qVar3;
        jyvVar.o = r7qVar4;
        jyvVar.f23p = r7qVar5;
        jyvVar.q = caqVar7;
        jyvVar.r = kly0Var4;
        jyvVar.s = caqVar8;
        return jyvVar;
    }

    public static nyv i(caq caqVar, caq caqVar2, caq caqVar3, caq caqVar4, jo80 jo80Var, r7q r7qVar, kly0 kly0Var, kly0 kly0Var2, caq caqVar5, kly0 kly0Var3, caq caqVar6, caq caqVar7, r7q r7qVar2, caq caqVar8, r7q r7qVar3, caq caqVar9, kly0 kly0Var4, kly0 kly0Var5, kly0 kly0Var6, kly0 kly0Var7) {
        nyv nyvVar = new nyv();
        nyvVar.a = caqVar;
        nyvVar.b = caqVar2;
        nyvVar.c = caqVar3;
        nyvVar.d = caqVar4;
        nyvVar.e = jo80Var;
        nyvVar.f = r7qVar;
        nyvVar.g = kly0Var;
        nyvVar.h = kly0Var2;
        nyvVar.i = caqVar5;
        nyvVar.j = kly0Var3;
        nyvVar.k = caqVar6;
        nyvVar.l = caqVar7;
        nyvVar.m = r7qVar2;
        nyvVar.n = caqVar8;
        nyvVar.o = r7qVar3;
        nyvVar.f34p = caqVar9;
        nyvVar.q = kly0Var4;
        nyvVar.r = kly0Var5;
        nyvVar.s = kly0Var6;
        nyvVar.t = kly0Var7;
        return nyvVar;
    }

    public static x0w j(ynb0 ynb0Var) {
        x0w x0wVar = new x0w((byte) 0);
        x0wVar.b = ynb0Var;
        return x0wVar;
    }

    public static v8w k(kly0 kly0Var, thq thqVar) {
        v8w v8wVar = new v8w();
        v8wVar.a = kly0Var;
        v8wVar.b = thqVar;
        return v8wVar;
    }

    public static h21 l(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 24);
    }

    public static h21 m(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 25);
    }

    public static h21 n(ynb0 ynb0Var) {
        return new h21(ynb0Var, (byte) 26);
    }

    public static p1b0 o() {
        return new p1b0();
    }

    public static q57 p() {
        return new q57("confirmation.mp3", "https://dj-earcons.spotifycdn.com/confirmation.mp3");
    }

    public static q57 q() {
        return new q57("listening.mp3", "https://dj-earcons.spotifycdn.com/listening.mp3");
    }

    public static sam0 r(xm41 xm41Var, caq caqVar, dn41 dn41Var) {
        ym41 ym41Var = new ym41("EIS");
        ym41Var.a = dn41Var;
        jge jgeVarE = hu20.e(eqr0.m(xm41Var), new ms4((lnm) null, new hf31(new fc3(caqVar, (byte) 4), ym41Var, (byte) 17), (byte) 9));
        AtomicInteger atomicInteger = ym41.c;
        return hwb.u("EIS", jgeVarE, Collections.singleton(xm41Var), ym41Var.b, ym41Var.a);
    }

    public static Observable s(xm41 xm41Var) {
        return eth.X(xm41Var);
    }

    public static y1t0 t(zcp zcpVar) {
        l8a l8aVar = zcpVar.a;
        zww zwwVar = (zww) ((RetrofitMaker) l8aVar.a.get()).createWebgateService(zww.class, "android-email-remote-service");
        return new y1t0(zwwVar, (byte) 8);
    }

    public static e241 u(zcp zcpVar) {
        e241 e241Var = (e241) zcpVar.b.get();
        c8o.m(e241Var);
        return e241Var;
    }

    public static kge v(Flowable flowable) {
        vbm[] vbmVarArr = q601.a;
        return new kge(flowable);
    }

    public static thn w(kzp kzpVar) {
        return new thn(kzpVar, (byte) 18);
    }

    public static thn x(nzp nzpVar) {
        return new thn(nzpVar, (byte) 25);
    }

    public static thn y(ozp ozpVar) {
        return new thn(ozpVar, (byte) 20);
    }

    public static thn z(ozp ozpVar) {
        return new thn(ozpVar, (byte) 26);
    }
}
