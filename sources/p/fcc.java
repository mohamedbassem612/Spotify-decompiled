package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformEsperantoItemsResponse;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fcc implements Consumer {
    public final /* synthetic */ byte a;
    public static final fcc b = new fcc(0);
    public static final fcc c = new fcc(1);
    public static final fcc d = new fcc(2);
    public static final fcc e = new fcc(3);
    public static final fcc f = new fcc(4);
    public static final fcc g = new fcc(5);
    public static final fcc h = new fcc(6);
    public static final fcc i = new fcc(7);
    public static final fcc t = new fcc(8);
    public static final fcc X = new fcc(9);
    public static final fcc Y = new fcc(10);
    public static final fcc Z = new fcc(11);
    public static final fcc N0 = new fcc(12);
    public static final fcc O0 = new fcc(13);
    public static final fcc P0 = new fcc(14);
    public static final fcc Q0 = new fcc(15);
    public static final fcc R0 = new fcc(16);
    public static final fcc S0 = new fcc(17);
    public static final fcc T0 = new fcc(18);
    public static final fcc U0 = new fcc(19);
    public static final fcc V0 = new fcc(20);
    public static final fcc W0 = new fcc(21);
    public static final fcc X0 = new fcc(22);
    public static final fcc Y0 = new fcc(23);
    public static final fcc Z0 = new fcc(24);
    public static final fcc a1 = new fcc(25);
    public static final fcc b1 = new fcc(26);
    public static final fcc c1 = new fcc(27);
    public static final fcc d1 = new fcc(28);
    public static final fcc e1 = new fcc(29);

    public /* synthetic */ fcc(byte b2) {
        this.a = b2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Logger.e((Throwable) obj, "BulkRedownloadCancelReceiver: cancel failed", new Object[0]);
                break;
            case 1:
                ((Throwable) obj).getMessage();
                break;
            case 2:
                break;
            case 3:
                Logger.e((Throwable) obj, "Failed to log Canvas state", new Object[0]);
                break;
            case 4:
                Logger.b("[AA-RESUME] connect-sync emitted within 1s", new Object[0]);
                break;
            case 5:
                Logger.e((Throwable) obj, "Failed to add cards based on item", new Object[0]);
                break;
            case 6:
                Logger.k("NotificationCategories", new Object[]{"Language selection load failed", (Throwable) obj});
                break;
            case 7:
                Logger.k("NotificationCategories", new Object[]{"Categories reload failed", (Throwable) obj});
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                Logger.e((Throwable) obj, "CollectionArtistEffectHandlersImpl: Shuffle state updating has failed", new Object[0]);
                break;
            case 11:
                Logger.e((Throwable) obj, "Send dislike to feedback service failed", new Object[0]);
                break;
            case 12:
                Logger.e((Throwable) obj, "Send remove dislike to feedback service failed", new Object[0]);
                break;
            case 13:
                Logger.e((Throwable) obj, "Error fetching partner-id after %d retries", new Object[]{3});
                break;
            case 14:
                Logger.e((Throwable) obj, "Error updating chat message preferences", new Object[0]);
                break;
            case 15:
                Logger.e((Throwable) obj, "failed to process android status", new Object[0]);
                break;
            case 16:
                CollectionPlatformEsperantoItemsResponse collectionPlatformEsperantoItemsResponse = (CollectionPlatformEsperantoItemsResponse) obj;
                if (collectionPlatformEsperantoItemsResponse.n().o() != 200) {
                    bhn0.f(collectionPlatformEsperantoItemsResponse.n().q());
                    break;
                }
                break;
            case 17:
                Logger.d(((Throwable) obj).getMessage(), new Object[0]);
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                xsq0 xsq0Var = (atq0) obj;
                xsq0 xsq0Var2 = xsq0Var instanceof xsq0 ? xsq0Var : null;
                if (xsq0Var2 != null) {
                    Logger.e(xsq0Var2.a, "Recoverable exception converted to Failure", new Object[0]);
                }
                break;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                n57.t("Unrecoverable error in DefaultOutcomeInterceptor", (Throwable) obj);
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                n57.t("Can not launch speed control fragment", (Throwable) obj);
                break;
            case 23:
                n57.s("SpeedControl could not load playback speed preferences");
                break;
            case 24:
                mmr0 mmr0Var = (mmr0) obj;
                tss tssVar = (tss) mmr0Var.a;
                spq0 spq0Var = (spq0) mmr0Var.b;
                if (spq0Var.c()) {
                    tssVar.a((ContextTrack) spq0Var.b());
                }
                break;
            case 25:
                n57.t("Failed to execute logger action", (Throwable) obj);
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                break;
            default:
                break;
        }
    }
}
