package p;

import com.spotify.base.java.logging.Logger;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v62 extends r6 implements r8n {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v62(byte b) {
        super(olj0.T0);
        this.b = b;
        switch (b) {
            case 4:
                super(olj0.T0);
                break;
            case 5:
                super(olj0.T0);
                break;
            case 6:
            case 7:
            case 12:
            case 13:
            case 14:
            case 16:
            default:
                break;
            case 8:
                super(olj0.T0);
                break;
            case 9:
                super(olj0.T0);
                break;
            case 10:
                super(olj0.T0);
                break;
            case 11:
                super(olj0.T0);
                break;
            case 15:
                super(olj0.T0);
                break;
            case 17:
                super(olj0.T0);
                break;
            case 18:
                super(olj0.T0);
                break;
        }
    }

    public final void p(Throwable th, o8n o8nVar) throws Throwable {
        switch (this.b) {
            case 0:
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                n57.g(message, th);
                return;
            case 1:
                Logger.e(th, "Failed to observe app rater state", new Object[0]);
                return;
            case 2:
                Logger.e(th, "CMPManagerImpl: failed to clear caches on logout", new Object[0]);
                return;
            case 3:
                Logger.l(th, "Failed to remove Jam notifications", new Object[0]);
                return;
            case 4:
                Logger.e(th, "Failed to log out device after PIN gate approval", new Object[0]);
                return;
            case 5:
                Logger.e(th, "Error in EngageContinuationClusterDaemon.", new Object[0]);
                return;
            case 6:
                Logger.e(th, "Error in EngageRecommendationsClusterDaemon.", new Object[0]);
                return;
            case 7:
                Logger.e(th, "Error in EngageSignInRequestDaemon.", new Object[0]);
                return;
            case 8:
                n57.e(th.getMessage());
                return;
            case 9:
                return;
            case 10:
                Logger.e(th, "A coroutine threw an exception on IdleManagerScope: " + o8nVar, new Object[0]);
                return;
            case 11:
                Logger.e(th, "A coroutine threw an exception on AuditScope: " + o8nVar, new Object[0]);
                return;
            case 12:
                n57.t("Reachability collection failed; keeping the last cached verdict", th);
                return;
            case 13:
                n57.g("[Lossless] Exception in LosslessRemoteDeviceMessageBoxPlugin", th);
                return;
            case 14:
                Logger.e(th, "MakeSourcePublicLauncher coroutine failed", new Object[0]);
                return;
            case 15:
                n57.t("Error selecting media service.", th);
                return;
            case 16:
                Logger.l(th, "Process load sampling failed", new Object[0]);
                return;
            case 17:
                n57.g("[Puffin] Exception in PuffinDaemon", th);
                return;
            case 18:
                n57.t("Reachability collection failed; keeping the last cached verdict", th);
                return;
            case 19:
                Logger.e(th, "ShareSourceWithCollaboratorsLauncher coroutine failed", new Object[0]);
                return;
            case 20:
                n57.t("SharedPreferences size sampling failed", th);
                return;
            case 21:
                if (!(th instanceof ClosedSendChannelException)) {
                    throw th;
                }
                return;
            case 22:
                Logger.e(th, "SourceItemPrivacyLoader coroutine failed", new Object[0]);
                return;
            case 23:
                Logger.e(th, "TransitionOperationLauncher coroutine failed", new Object[0]);
                return;
            case 24:
                Logger.e(th, "Video manifest prefetch stopped unexpectedly", new Object[0]);
                return;
            default:
                return;
        }
    }

    private final void h(Throwable th, o8n o8nVar) {
    }

    private final void q(Throwable th, o8n o8nVar) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v62(n8n n8nVar, byte b) {
        super(n8nVar);
        this.b = b;
    }
}
