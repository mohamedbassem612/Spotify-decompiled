package p;

import android.content.Context;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.video.c;
import androidx.media3.exoplayer.video.e;
import com.google.android.gms.tasks.Task;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import j$.time.Clock;
import j$.time.ZoneId;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class thn implements k2t, mnm, e9d0, v0i, Function, poj1, jn20, yg30, n0g1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ thn(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void a(VideoFrameProcessingException videoFrameProcessingException) {
        mym0 mym0Var = (mym0) ((z8c0) this.b).b;
        mym0Var.e.execute(new zyh0((Object) mym0Var, (Object) videoFrameProcessingException, (byte) 9));
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 7:
                return Single.just(new nmr0((LoggingParams) obj2, (feh) obj));
            case 8:
                return (Single) obj2;
            default:
                return Observable.create(new h341((l841) obj2, (dk70) obj, (byte) 4));
        }
    }

    public void b(lly0 lly0Var) {
        vhn vhnVar = (vhn) this.b;
        Log.isLoggable("FirebaseCrashlytics", 3);
        vhnVar.b.set((shn) lly0Var.get());
    }

    public Object c(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 2:
                bct bctVar = (bct) obj2;
                teq teqVar = ((m0q) obj3).a;
                ((qop) obj).getClass();
                bctVar.getClass();
                return new fb3(bctVar.d, new na9((lzn0) teqVar.i.get(), (byte) 4));
            case 3:
                nzp nzpVar = (nzp) obj3;
                daq daqVar = nzpVar.a;
                wzp wzpVar = new wzp(daqVar, nzpVar.b);
                ((qop) obj).getClass();
                ((sbt) obj2).getClass();
                b6p b6pVar = new b6p(wzpVar);
                Context context = (Context) daqVar.x1.a;
                c8o.l(context);
                me30 me30Var = (me30) daqVar.w7.get();
                c8o.l(me30Var);
                return new s7r(context, me30Var, new Locale(upn1.q()), ZoneId.of(Clock.systemDefaultZone().getZone().getId()), (qap) ((jly0) b6pVar.c).get());
            case 11:
                nzp nzpVar2 = (nzp) obj3;
                qop qopVar = (qop) obj;
                act actVar = (act) obj2;
                daq daqVar2 = nzpVar2.a;
                teq teqVar2 = nzpVar2.b;
                qopVar.getClass();
                actVar.getClass();
                lzn0 lzn0Var = (lzn0) teqVar2.i.get();
                c8o.l(lzn0Var);
                koc0 koc0Var = actVar.f;
                q8n q8nVar = (q8n) daqVar2.E1.get();
                c8o.l(q8nVar);
                bpb1 bpb1VarB = qopVar.b();
                q8n q8nVar2 = (q8n) daqVar2.V2.get();
                c8o.l(q8nVar2);
                return new p9t(lzn0Var, koc0Var, q8nVar, bpb1VarB, q8nVar2);
            case 13:
                ozp ozpVar = (ozp) obj3;
                qop qopVar2 = (qop) obj;
                lbt lbtVar = (lbt) obj2;
                daq daqVar3 = ozpVar.a;
                teq teqVar3 = ozpVar.b;
                p0q p0qVar = new p0q(daqVar3, teqVar3, (byte) 1);
                qopVar2.getClass();
                lbtVar.getClass();
                t7p t7pVar = new t7p(p0qVar, qopVar2, lbtVar);
                String strD = qopVar2.d();
                lik1 lik1VarG = qopVar2.g();
                n6r0 n6r0Var = qopVar2.c;
                c8o.l(n6r0Var);
                koc0 koc0Var2 = lbtVar.b;
                q5q q5qVar = (q5q) teqVar3.A6.get();
                c8o.l(q5qVar);
                c8c0 c8c0Var = qopVar2.b;
                ov20 ov20Var = (ov20) daqVar3.P5.get();
                c8o.l(ov20Var);
                pbp pbpVar = (pbp) ((jly0) t7pVar.a).get();
                h9n0 h9n0Var = (h9n0) teqVar3.S2.get();
                c8o.l(h9n0Var);
                return new mwu(strD, lik1VarG, n6r0Var, koc0Var2, q5qVar, c8c0Var, ov20Var, pbpVar, h9n0Var);
            case 16:
                kzp kzpVar = (kzp) obj3;
                qop qopVar3 = (qop) obj;
                daq daqVar4 = kzpVar.a;
                teq teqVar4 = kzpVar.b;
                qopVar3.getClass();
                ((act) obj2).getClass();
                f1n0 f1n0Var = (f1n0) teqVar4.T2.get();
                c8o.l(f1n0Var);
                xvo xvoVar = (xvo) daqVar4.H8.get();
                c8o.l(xvoVar);
                q8n q8nVar3 = (q8n) daqVar4.E1.get();
                c8o.l(q8nVar3);
                return new bbv(f1n0Var, xvoVar, q8nVar3, qopVar3.b());
            case 17:
                nzp nzpVar3 = (nzp) obj3;
                qop qopVar4 = (qop) obj;
                jbt jbtVar = (jbt) obj2;
                daq daqVar5 = nzpVar3.a;
                teq teqVar5 = nzpVar3.b;
                ozp ozpVar2 = new ozp(daqVar5, teqVar5);
                qopVar4.getClass();
                jbtVar.getClass();
                t7p t7pVar2 = new t7p(ozpVar2, qopVar4, jbtVar);
                koc0 koc0Var3 = jbtVar.d;
                String strD2 = qopVar4.d();
                d2f1 d2f1VarP3 = teqVar5.P3();
                j7p j7pVar = (j7p) t7pVar2.d;
                me30 me30Var2 = (me30) daqVar5.w7.get();
                c8o.l(me30Var2);
                return new dfv(koc0Var3, strD2, d2f1VarP3, j7pVar, me30Var2);
            case 18:
                kzp kzpVar2 = (kzp) obj3;
                qop qopVar5 = (qop) obj;
                jbt jbtVar2 = (jbt) obj2;
                daq daqVar6 = kzpVar2.a;
                nzp nzpVar4 = new nzp(daqVar6, kzpVar2.b);
                qopVar5.getClass();
                jbtVar2.getClass();
                t7p t7pVar3 = new t7p(nzpVar4, qopVar5, jbtVar2);
                Context context2 = (Context) daqVar6.x1.a;
                c8o.l(context2);
                return new jov(context2, qopVar5.d(), jbtVar2.d, (j7p) t7pVar3.d);
            case 20:
                ozp ozpVar3 = (ozp) obj3;
                qop qopVar6 = (qop) obj;
                qbt qbtVar = (qbt) obj2;
                kzp kzpVar3 = new kzp(ozpVar3.a, ozpVar3.b);
                qopVar6.getClass();
                qbtVar.getClass();
                return new ca3(qopVar6.d(), new x2p(kzpVar3, qopVar6, qbtVar).b);
            case 25:
                nzp nzpVar5 = (nzp) obj3;
                qop qopVar7 = (qop) obj;
                daq daqVar7 = nzpVar5.a;
                teq teqVar6 = nzpVar5.b;
                q2q q2qVar = new q2q(daqVar7, teqVar6);
                qopVar7.getClass();
                ((bct) obj2).getClass();
                t7p t7pVar4 = new t7p(q2qVar, qopVar7);
                String strD3 = qopVar7.d();
                ay0 ay0VarL = daqVar7.a.l();
                iac0 iac0VarC = qopVar7.c();
                adp adpVar = (adp) ((jly0) t7pVar4.a).get();
                bdp bdpVar = (bdp) ((jly0) t7pVar4.c).get();
                cdp cdpVar = (cdp) ((jly0) t7pVar4.d).get();
                luk lukVar = (luk) daqVar7.L1.get();
                c8o.l(lukVar);
                j0x j0xVarA = bjv.b((fdq) teqVar6.Ch.get(), (kcq) teqVar6.Sf.get(), teqVar6.v()).a(new wp20(adpVar, iac0VarC, new ge4(lukVar), cdpVar, bdpVar), ay0VarL);
                q8n q8nVar4 = (q8n) daqVar7.V2.get();
                c8o.l(q8nVar4);
                e3x e3xVar = (e3x) teqVar6.Bh.get();
                c8o.l(e3xVar);
                return new p1x(strD3, j0xVarA, q8nVar4, e3xVar, daqVar7.a.x());
            case 26:
                ozp ozpVar4 = (ozp) obj3;
                qop qopVar8 = (qop) obj;
                daq daqVar8 = ozpVar4.a;
                teq teqVar7 = ozpVar4.b;
                b0q b0qVar = new b0q(daqVar8, teqVar7);
                qopVar8.getClass();
                ((bct) obj2).getClass();
                t7p t7pVar5 = new t7p(b0qVar, qopVar8);
                String strD4 = qopVar8.d();
                ay0 ay0VarL2 = daqVar8.a.l();
                iac0 iac0VarC2 = qopVar8.c();
                adp adpVar2 = (adp) ((jly0) t7pVar5.a).get();
                bdp bdpVar2 = (bdp) ((jly0) t7pVar5.c).get();
                cdp cdpVar2 = (cdp) ((jly0) t7pVar5.d).get();
                luk lukVar2 = (luk) daqVar8.L1.get();
                c8o.l(lukVar2);
                j0x j0xVarA2 = bjv.b((fdq) teqVar7.Ch.get(), (kcq) teqVar7.Sf.get(), teqVar7.v()).a(new wp20(adpVar2, iac0VarC2, new ge4(lukVar2), cdpVar2, bdpVar2), ay0VarL2);
                q8n q8nVar5 = (q8n) daqVar8.V2.get();
                c8o.l(q8nVar5);
                e3x e3xVar2 = (e3x) teqVar7.Bh.get();
                c8o.l(e3xVar2);
                return new c2x(strD4, j0xVarA2, q8nVar5, e3xVar2);
            default:
                daq daqVar9 = ((d0q) obj3).a;
                ((sq21) obj).getClass();
                ((jq21) obj2).getClass();
                return new j1y(new fza(new p5y(), (byte) 9));
        }
    }

    public Object d(Task task) {
        return (Task) ((hhn) this.b).call();
    }

    @Override // p.n0g1
    public void e(k0g1 k0g1Var) {
        ((exs) this.b).j(k0g1Var);
    }

    public void f(zf30 zf30Var) {
        byte b = this.a;
        h21 h21Var = (h21) this.b;
        switch (b) {
            case 12:
                odu oduVar = (odu) zf30Var;
                pdu pduVar = (pdu) h21Var.b.get();
                pduVar.getClass();
                oduVar.getClass();
                oduVar.K1 = new z2p(pduVar).a;
                zce0 zce0Var = (zce0) pduVar.a.get();
                c8o.l(zce0Var);
                oduVar.L1 = zce0Var;
                break;
            case 19:
                mpv mpvVar = (mpv) zf30Var;
                npv npvVar = (npv) h21Var.b.get();
                npvVar.getClass();
                mpvVar.getClass();
                mpvVar.X1 = (jcp) ((jly0) new b6p(npvVar).c).get();
                break;
            case 21:
                w8w w8wVar = (w8w) zf30Var;
                v8w v8wVar = (v8w) h21Var.b.get();
                v8wVar.getClass();
                w8wVar.getClass();
                gw70 gw70Var = (gw70) v8wVar.a.get();
                c8o.l(gw70Var);
                w8wVar.Z1 = gw70Var;
                h85 h85Var = (h85) v8wVar.b.get();
                c8o.l(h85Var);
                w8wVar.a2 = h85Var;
                break;
            case 23:
                evw evwVar = (evw) zf30Var;
                xvw xvwVar = (xvw) h21Var.b.get();
                xvwVar.getClass();
                evwVar.getClass();
                tnm tnmVar = new tnm(xvwVar, evwVar);
                kg0 kg0Var = (kg0) xvwVar.a.get();
                c8o.l(kg0Var);
                evwVar.G1 = kg0Var;
                bvw bvwVar = (bvw) xvwVar.c.get();
                c8o.l(bvwVar);
                evwVar.H1 = bvwVar;
                evwVar.I1 = (mir0) ((jly0) tnmVar.e).get();
                evwVar.J1 = (Map) ((jly0) tnmVar.h).get();
                break;
            case 24:
                mxw mxwVar = (mxw) zf30Var;
                kxw kxwVar = (kxw) h21Var.b.get();
                kxwVar.getClass();
                mxwVar.getClass();
                kg0 kg0Var2 = (kg0) kxwVar.a.get();
                c8o.l(kg0Var2);
                mxwVar.W1 = kg0Var2;
                ohv0 ohv0Var = (ohv0) kxwVar.b.get();
                c8o.l(ohv0Var);
                mxwVar.X1 = ohv0Var;
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                b0y b0yVar = (b0y) zf30Var;
                ((p0y) h21Var.b.get()).getClass();
                b0yVar.getClass();
                b0yVar.W1 = new twa();
                break;
            default:
                j3y j3yVar = (j3y) zf30Var;
                k3y k3yVar = (k3y) h21Var.b.get();
                k3yVar.getClass();
                j3yVar.getClass();
                RetrofitMaker retrofitMaker = (RetrofitMaker) k3yVar.a.get();
                c8o.l(retrofitMaker);
                j3yVar.W1 = new m3y(new b3y(new h5a1(new au81((rs81) retrofitMaker.createExperimentalWebgateService(rs81.class, "android-endless-sillywalk-network")), (byte) 9)));
                break;
        }
    }

    @Override // p.jn20
    public void g(float f) {
        e eVar = ((c) this.b).b;
        if (eVar.f == f) {
            return;
        }
        eVar.f = f;
        eVar.c(false);
    }

    public void invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                ((uz3) obj).d((far) obj2);
                break;
            default:
                ((uz3) obj).p((Exception) obj2);
                break;
        }
    }

    public Object m(dxy dxyVar) {
        return new v0s((Context) dxyVar.a(Context.class), ((wi20) dxyVar.a(wi20.class)).d(), dxyVar.c(lzy0.a(v560.class)), dxyVar.g(gys.class), (Executor) dxyVar.d((lzy0) this.b));
    }

    public /* synthetic */ thn(tz3 tz3Var, Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
