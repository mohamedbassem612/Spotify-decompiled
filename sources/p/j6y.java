package p;

import android.content.Context;
import com.spotify.engagesdk.engagecontinuationcluster.workers.EngageContinuationClusterClearer;
import com.spotify.engagesdk.engagerecommendationscluster.workers.EngageRecommendationsClusterClearer;
import com.spotify.engagesdk.engagesigninrequest.workers.EngageOnBroadcastSignInHandler;
import com.spotify.yourlibrary.importsyncnotification.importsyncworker.ImportSyncWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j6y implements r0z0 {
    public final /* synthetic */ byte a;
    public final Context b;

    public /* synthetic */ j6y(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    public final void a() {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                ciq0 ciq0Var = new ciq0(EngageContinuationClusterClearer.class);
                vwl1 vwl1Var = ((qwl1) ciq0Var).c;
                vwl1Var.q = true;
                vwl1Var.r = 1;
                awl1.d(context).c("EngageContinuationClusterClearer", 2, ciq0Var.b());
                break;
            case 1:
                awl1.d(context).c("EngageSignInRequester", 2, new ciq0(EngageOnBroadcastSignInHandler.class).b());
                break;
            case 2:
                ciq0 ciq0Var2 = new ciq0(EngageRecommendationsClusterClearer.class);
                vwl1 vwl1Var2 = ((qwl1) ciq0Var2).c;
                vwl1Var2.q = true;
                vwl1Var2.r = 1;
                awl1.d(context).c("EngageRecommendationsClusterClearer", 2, ciq0Var2.b());
                break;
            default:
                awl1.d(context).c("import_sync", 2, new ciq0(ImportSyncWorker.class).b());
                break;
        }
    }

    public final void cancel() {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                bzn1.r("EngageContinuationClusterClearer", awl1.d(context));
                break;
            case 1:
                bzn1.r("EngageSignInRequester", awl1.d(context));
                break;
            case 2:
                bzn1.r("EngageRecommendationsClusterClearer", awl1.d(context));
                break;
            default:
                bzn1.r("import_sync", awl1.d(context));
                break;
        }
    }
}
