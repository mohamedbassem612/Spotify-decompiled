package com.spotify.yourlibrary.importsyncnotification.importsyncworker;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import com.spotify.serviceapi.android.quasarworker.NoProgressTimeoutException;
import com.spotify.serviceapi.android.quasarworker.ScopeEnterTimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.afv;
import p.b480;
import p.b5p1;
import p.bpb1;
import p.c0n0;
import p.d480;
import p.d9n;
import p.eg;
import p.f480;
import p.fts;
import p.fu20;
import p.hm5;
import p.i0n0;
import p.i480;
import p.j480;
import p.lnm;
import p.n57;
import p.onm;
import p.oo70;
import p.pew0;
import p.r2t;
import p.rqt0;
import p.wen0;
import p.y160;
import p.y8d0;
import p.zle1;
import p.zn41;
import p.zvl1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017Bc\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0010\b\u0001\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/spotify/yourlibrary/importsyncnotification/importsyncworker/ImportSyncWorker;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/r2t;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/oo70;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/zn41;", "scopeWorkDispatcher", "Lp/d480;", "importSyncObserver", "Lp/b480;", "importSyncNotificationManager", "Lp/wen0;", "", "importSyncFailure", "Lp/zle1;", "timeKeeper", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/oo70;Lp/zn41;Lp/d480;Lp/b480;Lp/wen0;Lp/zle1;)V", "p/abq", "src_main_java_com_spotify_yourlibrary_importsyncnotification_importsyncworker-importsyncworker"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ImportSyncWorker extends MusicAppQuasarWorker<r2t> {
    public final oo70 n;
    public final zn41 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d480 f1p;
    public final b480 q;
    public final wen0 r;
    public final zle1 s;
    public final c0n0 t;
    public final String u;
    public final byte v;
    public final short w;

    public ImportSyncWorker(Context context, WorkerParameters workerParameters, oo70 oo70Var, zn41 zn41Var, d480 d480Var, b480 b480Var, wen0 wen0Var, zle1 zle1Var) {
        super(context, workerParameters, (zvl1) null, 4, (DefaultConstructorMarker) null);
        this.n = oo70Var;
        this.o = zn41Var;
        this.f1p = d480Var;
        this.q = b480Var;
        this.r = wen0Var;
        this.s = zle1Var;
        c0n0 c0n0Var = c0n0.a;
        this.t = c0n0Var;
        this.u = c0n0Var.getName();
        this.v = (byte) 30;
        this.w = (short) 300;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final oo70 getN() {
        return this.n;
    }

    public final i0n0 B() {
        return this.t;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final zle1 getS() {
        return this.s;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D(lnm lnmVar) {
        j480 j480Var;
        if (lnmVar instanceof j480) {
            j480Var = (j480) lnmVar;
            int i = j480Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j480Var.c = i - Integer.MIN_VALUE;
            } else {
                j480Var = new j480(this, (onm) lnmVar);
            }
        } else {
            j480Var = new j480(this, (onm) lnmVar);
        }
        Object objJ = j480Var.a;
        int i2 = j480Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            fu20 fu20Var = new fu20(rqt0.u(new fts(this.f1p.a.c, (byte) 5)), new y160(this, (lnm) null, (byte) 10), (byte) 1);
            afv afvVar = new afv(2, (lnm) null, (byte) 22);
            j480Var.c = 1;
            objJ = b5p1.j(fu20Var, afvVar, j480Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        i480 i480Var = (i480) objJ;
        if (i480Var instanceof f480) {
            String str = ((f480) i480Var).a;
            if (str == null) {
                str = "unknown";
            }
            bpb1 bpb1Var = this.r;
            bpb1Var.getClass();
            bpb1Var.m((Object) null, str);
        }
        return y8d0.a();
    }

    public final /* bridge */ /* synthetic */ Object j(Object obj, pew0 pew0Var) {
        return D(pew0Var);
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
    public final String getU() {
        return this.u;
    }

    public final void t(Exception exc) {
        super.t(exc);
        if ((exc instanceof ScopeEnterTimeoutException) || (exc instanceof NoProgressTimeoutException)) {
            return;
        }
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        n57.t(message, exc);
    }
}
