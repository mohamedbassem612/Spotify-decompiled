package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.mediabrowserservice.allowlistpackagevalidator.denylist.cache.db.DenylistDatabase;
import com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService;
import com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ojq implements dl4 {
    public final jly0 N0;
    public final jly0 O0;
    public final jly0 P0;
    public final jly0 Q0;
    public final jly0 R0;
    public final jly0 S0;
    public final jly0 T0;
    public final jly0 U0;
    public final jly0 V0;
    public final jly0 W0;
    public final jly0 X;
    public final jly0 X0;
    public final jly0 Y;
    public final jly0 Y0;
    public final jly0 Z;
    public final jly0 Z0;
    public final /* synthetic */ byte a;
    public final jly0 a1;
    public final Object b;
    public final jly0 b1;
    public final jly0 c;
    public final jly0 c1;
    public final jly0 d;
    public final jly0 d1;
    public final jly0 e;
    public final jly0 e1;
    public final jly0 f;
    public final jly0 f1;
    public final jly0 g;
    public final jly0 g1;
    public final jly0 h;
    public final jly0 h1;
    public final jly0 i;
    public final Object i1;
    public final Object j1;
    public final Object k1;
    public final jly0 l1;
    public final jly0 m1;
    public final jly0 n1;
    public final jly0 o1;
    public final jly0 p1;
    public final jly0 q1;
    public final jly0 t;

    public ojq(daq daqVar, SpotifyMediaBrowserService spotifyMediaBrowserService) {
        this.a = (byte) 0;
        this.b = daqVar;
        this.i1 = spotifyMediaBrowserService;
        byte b = 5;
        this.j1 = new obq(daqVar, this, 1, b);
        this.c = xqu.b(new obq(daqVar, this, 7, b));
        this.d = byo.u(daqVar, this, 9);
        this.e = byo.u(daqVar, this, 10);
        this.f = byo.u(daqVar, this, 11);
        this.g = xqu.b(new obq(daqVar, this, 8, b));
        this.h = byo.u(daqVar, this, 6);
        this.i = byo.u(daqVar, this, 5);
        this.k1 = new obq(daqVar, this, 4, b);
        this.l1 = new obq(daqVar, this, 12, b);
        this.t = byo.u(daqVar, this, 13);
        this.X = byo.u(daqVar, this, 14);
        this.Y = byo.u(daqVar, this, 15);
        this.Z = byo.u(daqVar, this, 16);
        this.N0 = byo.u(daqVar, this, 17);
        this.O0 = byo.u(daqVar, this, 18);
        this.P0 = byo.u(daqVar, this, 19);
        this.Q0 = byo.u(daqVar, this, 20);
        this.R0 = byo.u(daqVar, this, 22);
        this.S0 = byo.u(daqVar, this, 23);
        this.T0 = xqu.b(new obq(daqVar, this, 24, b));
        this.U0 = byo.u(daqVar, this, 21);
        this.V0 = byo.u(daqVar, this, 25);
        this.m1 = new obq(daqVar, this, 26, b);
        this.W0 = xqu.b(new obq(daqVar, this, 29, b));
        this.X0 = byo.u(daqVar, this, 30);
        this.Y0 = byo.u(daqVar, this, 31);
        this.Z0 = byo.u(daqVar, this, 28);
        this.a1 = byo.u(daqVar, this, 27);
        this.b1 = byo.u(daqVar, this, 32);
        this.c1 = xqu.b(new obq(daqVar, this, 3, b));
        this.d1 = xqu.b(new obq(daqVar, this, 33, b));
        this.n1 = new obq(daqVar, this, 2, b);
        this.o1 = new obq(daqVar, this, 34, b);
        this.e1 = xqu.b(new obq(daqVar, this, 36, b));
        this.f1 = byo.u(daqVar, this, 35);
        this.p1 = new obq(daqVar, this, 37, b);
        this.g1 = xqu.b(new obq(daqVar, this, 38, b));
        this.q1 = new obq(daqVar, this, 39, b);
        this.h1 = byo.u(daqVar, this, 0);
    }

    public zx4 a() {
        switch (this.a) {
            case 0:
                break;
        }
        return new zx4((luk) ((daq) this.b).L1.get());
    }

    public xap b() {
        byte b = this.a;
        byte b2 = 19;
        Object obj = this.b;
        switch (b) {
            case 0:
                daq daqVar = (daq) obj;
                RetrofitMaker retrofitMaker = (RetrofitMaker) daqVar.Y3.get();
                k370 k370Var = new k370();
                k370Var.f((l370) null, "https://pme-config.spotifycdn.com/");
                iir iirVar = new iir((cbt) retrofitMaker.createCustomHostService(cbt.class, k370Var.b()), (Scheduler) daqVar.A2.get(), (byte) 28);
                Context context = (Context) daqVar.x1.a;
                dhc1 dhc1Var = new dhc1((nfa0) daqVar.b2.get());
                bn31 bn31VarT = u890.t(context.getApplicationContext(), DenylistDatabase.class, "denylist.db");
                bn31VarT.b(dhc1Var);
                bbt bbtVarU = bn31VarT.c().u();
                c8o.m(bbtVarU);
                return new xap(new l6s(iirVar, new jmq(bbtVarU, (Scheduler) daqVar.A2.get(), (yqg) daqVar.J1.get()), new zat((yqg) daqVar.J1.get())), b2);
            default:
                daq daqVar2 = (daq) obj;
                RetrofitMaker retrofitMaker2 = (RetrofitMaker) daqVar2.Y3.get();
                k370 k370Var2 = new k370();
                k370Var2.f((l370) null, "https://pme-config.spotifycdn.com/");
                iir iirVar2 = new iir((cbt) retrofitMaker2.createCustomHostService(cbt.class, k370Var2.b()), (Scheduler) daqVar2.A2.get(), (byte) 28);
                Context context2 = (Context) daqVar2.x1.a;
                dhc1 dhc1Var2 = new dhc1((nfa0) daqVar2.b2.get());
                bn31 bn31VarT2 = u890.t(context2.getApplicationContext(), DenylistDatabase.class, "denylist.db");
                bn31VarT2.b(dhc1Var2);
                bbt bbtVarU2 = bn31VarT2.c().u();
                c8o.m(bbtVarU2);
                return new xap(new l6s(iirVar2, new jmq(bbtVarU2, (Scheduler) daqVar2.A2.get(), (yqg) daqVar2.J1.get()), new zat((yqg) daqVar2.J1.get())), b2);
        }
    }

    public i6n0 c() {
        RetrofitMaker retrofitMaker = (RetrofitMaker) ((jiz0) this.b).g.get();
        c8o.l(retrofitMaker);
        return new i6n0((q7n0) retrofitMaker.createWebgateService(q7n0.class, "android-musicquiz-network-quiz"));
    }

    public k811 d() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                daq daqVar = (daq) obj;
                return new k811((Flowable) daqVar.z2.get(), (t2j0) daqVar.f2.get());
            default:
                daq daqVar2 = (daq) obj;
                return new k811((Flowable) daqVar2.z2.get(), (t2j0) daqVar2.f2.get());
        }
    }

    public kdy0 e() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                daq daqVar = (daq) obj;
                return new kdy0(((RetrofitMaker) daqVar.Y3.get()).createWebgateService(xmn0.class, "android-aipartner-ai-partner-api-wrapper"), daqVar.a3.get(), (Object) new by40((t2j0) daqVar.f2.get()), (Object) new hlr((t2j0) daqVar.f2.get()), (byte) 26);
            default:
                daq daqVar2 = (daq) obj;
                return new kdy0(((RetrofitMaker) daqVar2.Y3.get()).createWebgateService(xmn0.class, "android-aipartner-ai-partner-api-wrapper"), daqVar2.a3.get(), (Object) new by40((t2j0) daqVar2.f2.get()), (Object) new hlr((t2j0) daqVar2.f2.get()), (byte) 26);
        }
    }

    public q881 f() {
        switch (this.a) {
            case 0:
                break;
        }
        return new q881((aai0) ((daq) this.b).D9.get(), new p370(), new uic(false));
    }

    public tp7 g() {
        byte b = this.a;
        jly0 jly0Var = this.T0;
        jly0 jly0Var2 = this.S0;
        Object obj = this.i1;
        Object obj2 = this.b;
        byte b2 = 22;
        switch (b) {
            case 0:
                daq daqVar = (daq) obj2;
                return new tp7(((g0l) daqVar.E5.get()).j().filter(mm10.X0).map(ns80.U0).distinctUntilChanged(), xoi1.b((SpotifyMediaBrowserService) obj), (Flowable) daqVar.z2.get(), (Scheduler) daqVar.z1.get(), (Scheduler) daqVar.r3.get(), ulk1.o(), new r2a1(daqVar.b2(), (Scheduler) daqVar.z1.get(), (byte) 7), new g2j1((djq) jly0Var2.get(), (byte) 21), new bge0((Flowable) daqVar.D5.get(), (hyv0) jly0Var.get(), (a710) daqVar.ui.get()), new a77(tk00.c((ghp) daqVar.qa.get()), new tym0((t2j0) daqVar.f2.get(), (byte) 22)), new vna1(daqVar.b2(), (a710) daqVar.ui.get(), new a77(tk00.c((ghp) daqVar.qa.get()), new tym0((t2j0) daqVar.f2.get(), (byte) 22)), new peu0((Flowable) daqVar.D5.get()), (zle1) daqVar.a3.get(), (q8n) daqVar.V2.get(), (q8n) daqVar.r2.get(), (q8n) daqVar.E1.get(), i7v0.q((q8n) daqVar.r2.get())));
            default:
                daq daqVar2 = (daq) obj2;
                return new tp7(((g0l) daqVar2.E5.get()).j().filter(mm10.X0).map(ns80.U0).distinctUntilChanged(), xoi1.b((SpotifyMediaLibraryService) obj), (Flowable) daqVar2.z2.get(), (Scheduler) daqVar2.z1.get(), (Scheduler) daqVar2.r3.get(), ulk1.o(), new r2a1(daqVar2.b2(), (Scheduler) daqVar2.z1.get(), (byte) 7), new g2j1((djq) jly0Var2.get(), (byte) 21), new bge0((Flowable) daqVar2.D5.get(), (hyv0) jly0Var.get(), (a710) daqVar2.ui.get()), new a77(tk00.c((ghp) daqVar2.qa.get()), new tym0((t2j0) daqVar2.f2.get(), b2)), new vna1(daqVar2.b2(), (a710) daqVar2.ui.get(), new a77(tk00.c((ghp) daqVar2.qa.get()), new tym0((t2j0) daqVar2.f2.get(), (byte) 22)), new peu0((Flowable) daqVar2.D5.get()), (zle1) daqVar2.a3.get(), (q8n) daqVar2.V2.get(), (q8n) daqVar2.r2.get(), (q8n) daqVar2.E1.get(), i7v0.q((q8n) daqVar2.r2.get())));
        }
    }

    public void w(Object obj) {
        byte b = this.a;
        jly0 jly0Var = this.h1;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                SpotifyMediaBrowserService spotifyMediaBrowserService = (SpotifyMediaBrowserService) obj;
                spotifyMediaBrowserService.h = new c681((ejq) jly0Var.get(), (byte) 12);
                daq daqVar = (daq) obj2;
                spotifyMediaBrowserService.i = (oo70) daqVar.M2.get();
                spotifyMediaBrowserService.X = new hs41((zle1) daqVar.a3.get());
                spotifyMediaBrowserService.t = (zih0) this.c1.get();
                break;
            default:
                SpotifyMediaLibraryService spotifyMediaLibraryService = (SpotifyMediaLibraryService) obj;
                daq daqVar2 = (daq) obj2;
                spotifyMediaLibraryService.Z = (zph0) daqVar2.tf.get();
                spotifyMediaLibraryService.t = new c681((ejq) jly0Var.get(), (byte) 12);
                spotifyMediaLibraryService.X = (oo70) daqVar2.M2.get();
                spotifyMediaLibraryService.O0 = (v8l) daqVar2.Of.get();
                spotifyMediaLibraryService.Y = daqVar2.Uf;
                spotifyMediaLibraryService.N0 = new hs41((zle1) daqVar2.a3.get());
                break;
        }
    }

    public ojq(jiz0 jiz0Var, ivj ivjVar, niz0 niz0Var, q7r0 q7r0Var) {
        this.a = (byte) 2;
        this.i1 = ivjVar;
        this.b = jiz0Var;
        this.j1 = q7r0Var;
        this.k1 = niz0Var;
        this.c = byo.v(this, 1);
        this.d = xqu.b(new ykq(this, 4, (byte) 5));
        this.e = xqu.b(new ykq(this, 5, (byte) 5));
        this.f = xqu.b(new ykq(this, 3, (byte) 5));
        this.g = xqu.b(new ykq(this, 7, (byte) 5));
        this.h = byo.v(this, 6);
        this.i = xqu.b(new ykq(this, 9, (byte) 5));
        this.t = xqu.b(new ykq(this, 8, (byte) 5));
        this.X = byo.v(this, 2);
        this.Y = byo.v(this, 11);
        this.Z = byo.v(this, 12);
        this.N0 = byo.v(this, 14);
        this.O0 = byo.v(this, 15);
        this.P0 = byo.v(this, 17);
        this.Q0 = byo.v(this, 18);
        this.R0 = byo.v(this, 20);
        this.S0 = byo.v(this, 19);
        this.T0 = byo.v(this, 21);
        this.U0 = byo.v(this, 23);
        this.V0 = byo.v(this, 24);
        this.W0 = byo.v(this, 22);
        this.X0 = byo.v(this, 16);
        this.Y0 = xqu.b(new ykq(this, 28, (byte) 5));
        this.Z0 = byo.v(this, 27);
        this.a1 = byo.v(this, 26);
        this.b1 = xqu.b(new ykq(this, 31, (byte) 5));
        this.c1 = byo.v(this, 30);
        this.d1 = byo.v(this, 32);
        this.e1 = byo.v(this, 29);
        this.f1 = xqu.b(new ykq(this, 33, (byte) 5));
        this.g1 = byo.v(this, 25);
        this.h1 = byo.v(this, 13);
        this.l1 = byo.v(this, 10);
        this.m1 = byo.v(this, 35);
        this.n1 = byo.v(this, 34);
        this.o1 = byo.v(this, 0);
        this.p1 = byo.v(this, 36);
        this.q1 = xqu.b(new ykq(this, 37, (byte) 5));
    }

    public ojq(daq daqVar, SpotifyMediaLibraryService spotifyMediaLibraryService) {
        this.a = (byte) 1;
        this.b = daqVar;
        this.i1 = spotifyMediaLibraryService;
        byte b = 6;
        this.j1 = new obq(daqVar, this, 1, b);
        this.c = xqu.b(new obq(daqVar, this, 7, b));
        this.d = byo.D(daqVar, this, 9);
        this.e = byo.D(daqVar, this, 10);
        this.f = byo.D(daqVar, this, 11);
        this.g = xqu.b(new obq(daqVar, this, 8, b));
        this.h = byo.D(daqVar, this, 6);
        this.i = byo.D(daqVar, this, 5);
        this.k1 = new obq(daqVar, this, 4, b);
        this.l1 = new obq(daqVar, this, 12, b);
        this.t = byo.D(daqVar, this, 13);
        this.X = byo.D(daqVar, this, 14);
        this.Y = byo.D(daqVar, this, 15);
        this.Z = byo.D(daqVar, this, 16);
        this.N0 = byo.D(daqVar, this, 17);
        this.O0 = byo.D(daqVar, this, 18);
        this.P0 = byo.D(daqVar, this, 19);
        this.Q0 = byo.D(daqVar, this, 20);
        this.R0 = byo.D(daqVar, this, 22);
        this.S0 = byo.D(daqVar, this, 23);
        this.T0 = xqu.b(new obq(daqVar, this, 24, b));
        this.U0 = byo.D(daqVar, this, 21);
        this.V0 = byo.D(daqVar, this, 25);
        this.m1 = new obq(daqVar, this, 26, b);
        this.W0 = xqu.b(new obq(daqVar, this, 29, b));
        this.X0 = byo.D(daqVar, this, 30);
        this.Y0 = byo.D(daqVar, this, 31);
        this.Z0 = byo.D(daqVar, this, 28);
        this.a1 = byo.D(daqVar, this, 27);
        this.b1 = byo.D(daqVar, this, 32);
        this.c1 = xqu.b(new obq(daqVar, this, 3, b));
        this.d1 = xqu.b(new obq(daqVar, this, 33, b));
        this.n1 = new obq(daqVar, this, 2, b);
        this.o1 = new obq(daqVar, this, 34, b);
        this.e1 = xqu.b(new obq(daqVar, this, 36, b));
        this.f1 = byo.D(daqVar, this, 35);
        this.p1 = new obq(daqVar, this, 37, b);
        this.g1 = xqu.b(new obq(daqVar, this, 38, b));
        this.q1 = new obq(daqVar, this, 39, b);
        this.h1 = byo.D(daqVar, this, 0);
    }
}
