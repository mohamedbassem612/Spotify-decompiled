package com.spotify.widgets.widgetbackgroundupdates;

import android.content.Context;
import android.content.Intent;
import androidx.work.WorkerParameters;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.awl1;
import p.bql1;
import p.bzn1;
import p.cql1;
import p.d9n;
import p.dql1;
import p.eg;
import p.hm5;
import p.i0n0;
import p.kb61;
import p.lvh1;
import p.ne11;
import p.onm;
import p.oo70;
import p.sn40;
import p.tp21;
import p.un40;
import p.w8d0;
import p.y011;
import p.y8d0;
import p.zle1;
import p.zn41;
import p.zvl1;
import p.zzm0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018Ba\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/spotify/widgets/widgetbackgroundupdates/WidgetUpdateWorker;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/kb61;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/oo70;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/zn41;", "scopeWorkDispatcher", "Lp/zle1;", "timeKeeper", "Lp/sn40;", "getInstalledWidgetCount", "Lp/bql1;", "widgetUpdateScheduler", "Lp/ne11;", "refreshRecommendationsUseCase", "Lp/tp21;", "requestUpdate", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/oo70;Lp/zn41;Lp/zle1;Lp/sn40;Lp/bql1;Lp/ne11;Lp/tp21;)V", "p/maq", "src_main_java_com_spotify_widgets_widgetbackgroundupdates-widgetbackgroundupdates"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WidgetUpdateWorker extends MusicAppQuasarWorker<kb61> {
    public final oo70 n;
    public final zn41 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zle1 f0p;
    public final sn40 q;
    public final bql1 r;
    public final ne11 s;
    public final tp21 t;
    public final zzm0 u;
    public final byte v;
    public final byte w;
    public final String x;

    public WidgetUpdateWorker(Context context, WorkerParameters workerParameters, oo70 oo70Var, zn41 zn41Var, zle1 zle1Var, sn40 sn40Var, bql1 bql1Var, ne11 ne11Var, tp21 tp21Var) {
        super(context, workerParameters, (zvl1) null, 4, (DefaultConstructorMarker) null);
        this.n = oo70Var;
        this.o = zn41Var;
        this.f0p = zle1Var;
        this.q = sn40Var;
        this.r = bql1Var;
        this.s = ne11Var;
        this.t = tp21Var;
        this.u = zzm0.a;
        this.v = (byte) 30;
        this.w = (byte) 30;
        this.x = "dynamic-npv-widget-background-update";
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final oo70 getN() {
        return this.n;
    }

    public final i0n0 B() {
        return this.u;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final zle1 getF0p() {
        return this.f0p;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final Object j(kb61 kb61Var, onm onmVar) {
        dql1 dql1Var;
        if (onmVar instanceof dql1) {
            dql1Var = (dql1) onmVar;
            int i = dql1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dql1Var.c = i - Integer.MIN_VALUE;
            } else {
                dql1Var = new dql1(this, onmVar);
            }
        } else {
            dql1Var = new dql1(this, onmVar);
        }
        Object objA = dql1Var.a;
        int i2 = dql1Var.c;
        if (i2 == 0) {
            hm5.M(objA);
            dql1Var.c = 1;
            objA = ((un40) this.q).a(dql1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objA);
        }
        Integer num = (Integer) objA;
        if (num == null) {
            return new w8d0();
        }
        int iIntValue = num.intValue();
        bql1 bql1Var = this.r;
        if (iIntValue == 0) {
            bzn1.r("dynamic-npv-widget-periodic-update", awl1.d(((cql1) bql1Var).a));
        } else if (((cql1) bql1Var).a() == lvh1.a) {
            ((y011) this.s).b = true;
            Context context = this.t.a;
            context.sendBroadcast(new Intent("com.spotify.widgets.widgets.ACTION_UPDATE").setClassName(context, "com.spotify.widgets.npvwidget.WidgetUpdateCoordinator"));
        }
        return y8d0.a();
    }

    public final long l() {
        return this.w;
    }

    public final long m() {
        return this.v;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final zn41 getO() {
        return this.o;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getX() {
        return this.x;
    }
}
