package com.spotify.ondemandtrials.configimpl;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.spotify.androidx.workmanager.SpotifyCoroutineWorker;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import p.d9n;
import p.eg;
import p.hm5;
import p.ihq0;
import p.lnm;
import p.onm;
import p.v3q0;
import p.v8d0;
import p.wgq0;
import p.y8d0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/spotify/ondemandtrials/configimpl/OnDemandTrialFetchEndWorker;", "Lcom/spotify/androidx/workmanager/SpotifyCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "Lp/wgq0;", "oneDayTrialEndMessagingApi", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lp/wgq0;)V", "p/laq", "src_main_java_com_spotify_ondemandtrials_configimpl-configimpl"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public final class OnDemandTrialFetchEndWorker extends SpotifyCoroutineWorker {
    public final wgq0 i;

    public OnDemandTrialFetchEndWorker(Context context, WorkerParameters workerParameters, wgq0 wgq0Var) {
        super(context, workerParameters);
        this.i = wgq0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(lnm lnmVar) {
        v3q0 v3q0Var;
        if (lnmVar instanceof v3q0) {
            v3q0Var = (v3q0) lnmVar;
            int i = v3q0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v3q0Var.c = i - Integer.MIN_VALUE;
            } else {
                v3q0Var = new v3q0(this, (onm) lnmVar);
            }
        } else {
            v3q0Var = new v3q0(this, (onm) lnmVar);
        }
        Object obj = v3q0Var.a;
        int i2 = v3q0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                wgq0 wgq0Var = this.i;
                v3q0Var.c = 1;
                Object objB = ((ihq0) wgq0Var).b(v3q0Var);
                d9n d9nVar = d9n.a;
                if (objB == d9nVar) {
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
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new v8d0();
        }
    }
}
