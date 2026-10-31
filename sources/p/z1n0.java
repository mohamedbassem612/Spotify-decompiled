package p;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.aipartner.promptsuggestionsprovider.PromptSuggestionsWorker;
import com.spotify.bluejay.upload.impl.worker.AttachmentUploadWorker;
import com.spotify.collection.offlinesyncnotification.offlinesyncworker.OfflineSyncWorker;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.engagesdk.engagecontinuationcluster.workers.EngageContinuationClusterClearer;
import com.spotify.engagesdk.engagecontinuationcluster.workers.EngageContinuationClusterPublisher;
import com.spotify.engagesdk.engagerecommendationscluster.workers.EngageRecommendationsClusterClearer;
import com.spotify.engagesdk.engagerecommendationscluster.workers.EngageRecommendationsClusterPublisher;
import com.spotify.engagesdk.engagesigninrequest.workers.EngageOnBroadcastSignInHandler;
import com.spotify.eventsender.musicintegration.eventsenderworker.EventSenderWorker;
import com.spotify.inappuserfeedback.worker.FeedbackUploadWorker;
import com.spotify.notifications.notifications.workers.NotificationHandlingQuasarWorker;
import com.spotify.notifications.notifications.workers.NotificationLoggingQuasarWorker;
import com.spotify.notifications.notifications.workers.PushTokenSyncQuasarWorker;
import com.spotify.ondemandtrials.configimpl.OnDemandTrialFetchEndWorker;
import com.spotify.oopsplatform.appintegration.DiagnosticReportUploadWorker;
import com.spotify.remoteconfig.backgroundsync.RemoteConfigBackgroundSyncWorker;
import com.spotify.storage.localstorage.CacheMovingWorkerImpl;
import com.spotify.storage.localstorageapi.CacheMovingWorker;
import com.spotify.widgets.widgetbackgroundupdates.WidgetUpdateWorker;
import com.spotify.yourlibrary.importsyncnotification.importsyncworker.ImportSyncWorker;
import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z1n0 extends ixl1 {
    public final oaq a;
    public final zaq b;
    public final abq c;
    public final bbq d;
    public final cbq e;
    public final hqp f;
    public final dbq g;
    public final ebq h;
    public final fbq i;
    public final gbq j;
    public final eaq k;
    public final faq l;
    public final gaq m;
    public final haq n;
    public final iaq o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jaq f150p;
    public final kaq q;
    public final laq r;
    public final maq s;

    public z1n0(oaq oaqVar, zaq zaqVar, abq abqVar, bbq bbqVar, cbq cbqVar, hqp hqpVar, dbq dbqVar, ebq ebqVar, fbq fbqVar, gbq gbqVar, eaq eaqVar, faq faqVar, gaq gaqVar, haq haqVar, iaq iaqVar, jaq jaqVar, kaq kaqVar, laq laqVar, maq maqVar) {
        this.a = oaqVar;
        this.b = zaqVar;
        this.c = abqVar;
        this.d = bbqVar;
        this.e = cbqVar;
        this.f = hqpVar;
        this.g = dbqVar;
        this.h = ebqVar;
        this.i = fbqVar;
        this.j = gbqVar;
        this.k = eaqVar;
        this.l = faqVar;
        this.m = gaqVar;
        this.n = haqVar;
        this.o = iaqVar;
        this.f150p = jaqVar;
        this.q = kaqVar;
        this.r = laqVar;
        this.s = maqVar;
    }

    @Override // p.ixl1
    public final z8d0 a(Context context, String str, WorkerParameters workerParameters) {
        if (str.equals(PromptSuggestionsWorker.class.getName())) {
            gbp gbpVar = this.a.a;
            vyx0 vyx0Var = (vyx0) gbp.a(gbpVar).qi.get();
            oyx0 oyx0VarF = n0a.f((RetrofitMaker) gbp.a(gbpVar).a.a.Y3.get());
            f9h f9hVar = new f9h((byte) 2);
            int i = t380.c;
            return new PromptSuggestionsWorker(context, workerParameters, vyx0Var, new gid(oyx0VarF, new vqv0(new b291(f9hVar), (byte) 6), (byte) 23));
        }
        if (str.equals(OfflineSyncWorker.class.getName())) {
            gbp gbpVar2 = this.b.a;
            oo70 oo70Var = (oo70) gbp.a(gbpVar2).M2.get();
            zn41 zn41Var = (zn41) gbp.a(gbpVar2).Zl.get();
            daq daqVar = gbp.a(gbpVar2).a.a;
            mxp0 mxp0Var = new mxp0((vpp0) daqVar.C8.get(), daqVar.C());
            daq daqVar2 = gbp.a(gbpVar2).a.a;
            return new OfflineSyncWorker(context, workerParameters, oo70Var, zn41Var, mxp0Var, new poj0((Context) daqVar2.x1.a, (xs80) daqVar2.b3.get()), (m94) gbp.a(gbpVar2).bj.get(), (zle1) gbp.a(gbpVar2).a3.get());
        }
        if (str.equals(ImportSyncWorker.class.getName())) {
            gbp gbpVar3 = this.c.a;
            oo70 oo70Var2 = (oo70) gbp.a(gbpVar3).M2.get();
            zn41 zn41Var2 = (zn41) gbp.a(gbpVar3).Zl.get();
            d480 d480Var = new d480((iuz) gbp.a(gbpVar3).a.n0.get());
            daq daqVar3 = gbp.a(gbpVar3).a.a;
            return new ImportSyncWorker(context, workerParameters, oo70Var2, zn41Var2, d480Var, new st60((Context) daqVar3.x1.a, (xs80) daqVar3.b3.get()), (wen0) gbp.a(gbpVar3).a.o0.get(), (zle1) gbp.a(gbpVar3).a3.get());
        }
        if (str.equals(RemoteConfigBackgroundSyncWorker.class.getName())) {
            gbp gbpVar4 = this.d.a;
            return new RemoteConfigBackgroundSyncWorker(context, workerParameters, (oo70) gbp.a(gbpVar4).M2.get(), (zn41) gbp.a(gbpVar4).am.get(), (zle1) gbp.a(gbpVar4).a3.get());
        }
        if (str.equals(EventSenderWorker.class.getName())) {
            gbp gbpVar5 = this.e.a;
            return new EventSenderWorker(context, workerParameters, (oo70) gbp.a(gbpVar5).M2.get(), vj3.k(gbp.a(gbpVar5).a.a.u()), (zle1) gbp.a(gbpVar5).a3.get(), (xb00) gbp.a(gbpVar5).d2.get(), (bzm0) gbp.a(gbpVar5).y4.get(), (gx5) gbp.a(gbpVar5).W1.get(), f7z.l((yep) gbp.a(gbpVar5).a.a.c2.get()));
        }
        if (str.equals(CacheMovingWorker.class.getName())) {
            dlp dlpVar = this.f.a;
            return new CacheMovingWorkerImpl(context, workerParameters, (s6b1) dlp.a(dlpVar).b.get(), uge0.B(dlp.a(dlpVar).a.g()), dlp.a(dlpVar).a.n(), dlp.a(dlpVar).a.k(), dlp.a(dlpVar).a.h(), dlp.a(dlpVar).a.i(), dlp.a(dlpVar).a.j());
        }
        if (str.equals(NotificationHandlingQuasarWorker.class.getName())) {
            gbp gbpVar6 = this.g.a;
            oo70 oo70Var3 = (oo70) gbp.a(gbpVar6).M2.get();
            zn41 zn41Var3 = (zn41) gbp.a(gbpVar6).Zl.get();
            zle1 zle1Var = (zle1) gbp.a(gbpVar6).a3.get();
            hbq hbqVar = gbp.a(gbpVar6).a;
            sba sbaVar = new sba(xqu.a(hbqVar.s0), xqu.a(hbqVar.t0), xqu.a(hbqVar.u0), xqu.a(hbqVar.v0));
            hbq hbqVar2 = gbp.a(gbpVar6).a;
            jly0 jly0Var = hbqVar2.K0;
            daq daqVar4 = hbqVar2.a;
            d520 d520Var = new d520((pwy0) jly0Var.get(), new xgc((byte) 17), new qb00((yqg) daqVar4.J1.get(), (t2j0) daqVar4.f2.get()), hbqVar2.z(), (yqg) daqVar4.J1.get(), (yuy0) hbqVar2.L0.get(), (dto0) daqVar4.eg.get(), (Context) daqVar4.x1.a);
            hbq hbqVar3 = gbp.a(gbpVar6).a;
            ix7 ix7Var = new ix7((mbf) hbqVar3.s0.get(), hbqVar3.z(), j380.l(or81.a, hbqVar3.M0), (byte) 19);
            zg4 zg4Var = (zg4) gbp.a(gbpVar6).Qh.get();
            daq daqVar5 = gbp.a(gbpVar6).a.a;
            return new NotificationHandlingQuasarWorker(context, workerParameters, oo70Var3, zn41Var3, zle1Var, sbaVar, d520Var, ix7Var, zg4Var, new uxy0((zle1) daqVar5.a3.get(), (zg4) daqVar5.Qh.get()), (q8n) gbp.a(gbpVar6).E1.get());
        }
        if (str.equals(NotificationLoggingQuasarWorker.class.getName())) {
            gbp gbpVar7 = this.h.a;
            daq daqVar6 = gbp.a(gbpVar7).a.a;
            return new NotificationLoggingQuasarWorker(context, workerParameters, new qb00((yqg) daqVar6.J1.get(), (t2j0) daqVar6.f2.get()), (oo70) gbp.a(gbpVar7).M2.get(), (zn41) gbp.a(gbpVar7).Zl.get(), (zle1) gbp.a(gbpVar7).a3.get());
        }
        if (str.equals(PushTokenSyncQuasarWorker.class.getName())) {
            gbp gbpVar8 = this.i.a;
            return new PushTokenSyncQuasarWorker(context, workerParameters, (xxy0) gbp.a(gbpVar8).yk.get(), (oo70) gbp.a(gbpVar8).M2.get(), (zn41) gbp.a(gbpVar8).Zl.get(), (zle1) gbp.a(gbpVar8).a3.get());
        }
        if (str.equals(EngageRecommendationsClusterPublisher.class.getName())) {
            gbp gbpVar9 = this.j.a;
            oo70 oo70Var4 = (oo70) gbp.a(gbpVar9).M2.get();
            zle1 zle1Var2 = (zle1) gbp.a(gbpVar9).a3.get();
            zn41 zn41Var4 = (zn41) gbp.a(gbpVar9).am.get();
            daq daqVar7 = gbp.a(gbpVar9).a.a;
            return new EngageRecommendationsClusterPublisher(context, workerParameters, oo70Var4, zle1Var2, zn41Var4, new eow((Context) daqVar7.x1.a, new zeu(tk00.a((ghp) daqVar7.qa.get()), (Context) daqVar7.x1.a, (agc0) daqVar7.B7.get())), (w6y) gbp.a(gbpVar9).P4.get(), (ke4) gbp.a(gbpVar9).Rh.get(), (r0z0) gbp.a(gbpVar9).dl.get(), (t6y) gbp.a(gbpVar9).il.get());
        }
        if (str.equals(EngageRecommendationsClusterClearer.class.getName())) {
            gbp gbpVar10 = this.k.a;
            return new EngageRecommendationsClusterClearer(context, workerParameters, (oo70) gbp.a(gbpVar10).M2.get(), (zle1) gbp.a(gbpVar10).a3.get(), vj3.k(gbp.a(gbpVar10).a.a.u()), (w6y) gbp.a(gbpVar10).P4.get(), new q6y((Context) gbp.a(gbpVar10).a.a.x1.a));
        }
        if (str.equals(EngageContinuationClusterPublisher.class.getName())) {
            gbp gbpVar11 = this.l.a;
            return new EngageContinuationClusterPublisher(context, workerParameters, (oo70) gbp.a(gbpVar11).M2.get(), (zle1) gbp.a(gbpVar11).a3.get(), (zn41) gbp.a(gbpVar11).am.get(), (m01) gbp.a(gbpVar11).gl.get(), (w6y) gbp.a(gbpVar11).P4.get(), (je4) gbp.a(gbpVar11).Sh.get(), (r0z0) gbp.a(gbpVar11).fl.get(), (t6y) gbp.a(gbpVar11).il.get());
        }
        if (str.equals(EngageContinuationClusterClearer.class.getName())) {
            gbp gbpVar12 = this.m.a;
            return new EngageContinuationClusterClearer(context, workerParameters, (oo70) gbp.a(gbpVar12).M2.get(), (zle1) gbp.a(gbpVar12).a3.get(), vj3.k(gbp.a(gbpVar12).a.a.u()), (w6y) gbp.a(gbpVar12).P4.get(), new q6y((Context) gbp.a(gbpVar12).a.a.x1.a));
        }
        if (str.equals(EngageOnBroadcastSignInHandler.class.getName())) {
            gbp gbpVar13 = this.n.a;
            return new EngageOnBroadcastSignInHandler(context, workerParameters, (oo70) gbp.a(gbpVar13).M2.get(), (zle1) gbp.a(gbpVar13).a3.get(), vj3.k(gbp.a(gbpVar13).a.a.u()), (Flowable) gbp.a(gbpVar13).z2.get(), (w6y) gbp.a(gbpVar13).P4.get());
        }
        if (str.equals(FeedbackUploadWorker.class.getName())) {
            gbp gbpVar14 = this.o.a;
            return new FeedbackUploadWorker((f9i1) gbp.a(gbpVar14).cm.get(), (dma1) gbp.a(gbpVar14).C1.get(), (yqg) gbp.a(gbpVar14).J1.get(), context, workerParameters, ((Boolean) gbp.a(gbpVar14).W2.get()).booleanValue(), (ov20) gbp.a(gbpVar14).P5.get(), (mr20) gbp.a(gbpVar14).cc.get());
        }
        if (str.equals(AttachmentUploadWorker.class.getName())) {
            return new AttachmentUploadWorker((dk7) gbp.a(this.f150p.a).a.Y0.get(), context, workerParameters);
        }
        if (str.equals(OnDemandTrialFetchEndWorker.class.getName())) {
            return new OnDemandTrialFetchEndWorker(context, workerParameters, (wgq0) gbp.a(this.r.a).a.b1.get());
        }
        if (str.equals(WidgetUpdateWorker.class.getName())) {
            gbp gbpVar15 = this.s.a;
            return new WidgetUpdateWorker(context, workerParameters, (oo70) gbp.a(gbpVar15).M2.get(), (zn41) gbp.a(gbpVar15).am.get(), (zle1) gbp.a(gbpVar15).a3.get(), (sn40) gbp.a(gbpVar15).Hl.get(), (bql1) gbp.a(gbpVar15).Kl.get(), (ne11) gbp.a(gbpVar15).fm.get(), new tp21((Context) gbp.a(gbpVar15).a.a.x1.a));
        }
        if (!str.equals(DiagnosticReportUploadWorker.class.getName())) {
            return null;
        }
        gbp gbpVar16 = this.q.a;
        return new DiagnosticReportUploadWorker(context, workerParameters, (q8n) gbp.a(gbpVar16).E1.get(), gbp.a(gbpVar16).W3, gbp.a(gbpVar16).b2, gbp.a(gbpVar16).f2);
    }
}
