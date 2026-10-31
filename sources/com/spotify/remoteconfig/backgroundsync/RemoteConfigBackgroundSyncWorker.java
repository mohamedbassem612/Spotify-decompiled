package com.spotify.remoteconfig.backgroundsync;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.music.quasarworker.MusicAppQuasarWorker;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.serviceapi.android.quasarworker.NoProgressTimeoutException;
import com.spotify.serviceapi.android.quasarworker.ScopeEnterTimeoutException;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;
import p.d9n;
import p.eg;
import p.fc11;
import p.gtv0;
import p.h0n0;
import p.hm5;
import p.hz11;
import p.i0n0;
import p.kb61;
import p.n57;
import p.onm;
import p.oo70;
import p.y8d0;
import p.zle1;
import p.zn41;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010BA\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/spotify/remoteconfig/backgroundsync/RemoteConfigBackgroundSyncWorker;", "Lcom/spotify/music/quasarworker/MusicAppQuasarWorker;", "Lp/kb61;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/oo70;", "Lcom/spotify/musicappplatform/state/idle/api/MusicAppLock;", "idleManager", "Lp/zn41;", "scopeWorkDispatcher", "Lp/zle1;", "timeKeeper", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/oo70;Lp/zn41;Lp/zle1;)V", "p/bbq", "src_main_java_com_spotify_remoteconfig_backgroundsync-backgroundsync"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class RemoteConfigBackgroundSyncWorker extends MusicAppQuasarWorker<kb61> {
    public final oo70 n;
    public final zn41 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zle1 f3p;
    public final h0n0 q;
    public final byte r;
    public final short s;
    public final String t;

    public RemoteConfigBackgroundSyncWorker(Context context, WorkerParameters workerParameters, oo70 oo70Var, zn41 zn41Var, zle1 zle1Var) {
        super(context, workerParameters, null, 4, null);
        this.n = oo70Var;
        this.o = zn41Var;
        this.f3p = zle1Var;
        this.q = h0n0.a;
        this.r = (byte) 30;
        this.s = (short) 300;
        this.t = "remote config background sync";
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: A, reason: from getter */
    public final oo70 getN() {
        return this.n;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    public final i0n0 B() {
        return this.q;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker
    /* JADX INFO: renamed from: C, reason: from getter */
    public final zle1 getF3p() {
        return this.f3p;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final Object j(kb61 kb61Var, onm onmVar) {
        hz11 hz11Var;
        if (onmVar instanceof hz11) {
            hz11Var = (hz11) onmVar;
            int i = hz11Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hz11Var.c = i - Integer.MIN_VALUE;
            } else {
                hz11Var = new hz11(this, onmVar);
            }
        } else {
            hz11Var = new hz11(this, onmVar);
        }
        Object obj = hz11Var.a;
        int i2 = hz11Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            Single singleFirstOrError = kb61Var.y().X.filter(gtv0.d).firstOrError();
            hz11Var.c = 1;
            Object objJ = fc11.j(singleFirstOrError, hz11Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return y8d0.a();
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public final long l() {
        return this.s;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    public final long m() {
        return this.r;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: n, reason: from getter */
    public final zn41 getO() {
        return this.o;
    }

    @Override // com.spotify.serviceapi.android.quasarworker.QuasarWorker
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getT() {
        return this.t;
    }

    @Override // com.spotify.music.quasarworker.MusicAppQuasarWorker, com.spotify.serviceapi.android.quasarworker.QuasarWorker
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
