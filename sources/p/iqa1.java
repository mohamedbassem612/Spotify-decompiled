package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.concertpageview.v1.Row;
import com.spotify.connect.esperanto.proto.CommonMessages$StatusResponse;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class iqa1 implements Consumer {
    public final /* synthetic */ byte a;
    public static final iqa1 b = new iqa1(0);
    public static final iqa1 c = new iqa1(1);
    public static final iqa1 d = new iqa1(2);
    public static final iqa1 e = new iqa1(3);
    public static final iqa1 f = new iqa1(4);
    public static final iqa1 g = new iqa1(5);
    public static final iqa1 h = new iqa1(6);
    public static final iqa1 i = new iqa1(7);
    public static final iqa1 t = new iqa1(8);
    public static final iqa1 X = new iqa1(9);
    public static final iqa1 Y = new iqa1(10);
    public static final iqa1 Z = new iqa1(11);
    public static final iqa1 N0 = new iqa1(12);
    public static final iqa1 O0 = new iqa1(13);
    public static final iqa1 P0 = new iqa1(14);
    public static final iqa1 Q0 = new iqa1(15);
    public static final iqa1 R0 = new iqa1(16);
    public static final iqa1 S0 = new iqa1(17);
    public static final iqa1 T0 = new iqa1(18);
    public static final iqa1 U0 = new iqa1(19);
    public static final iqa1 V0 = new iqa1(20);
    public static final iqa1 W0 = new iqa1(21);
    public static final iqa1 X0 = new iqa1(22);
    public static final iqa1 Y0 = new iqa1(23);
    public static final iqa1 Z0 = new iqa1(24);
    public static final iqa1 a1 = new iqa1(25);
    public static final iqa1 b1 = new iqa1(26);
    public static final iqa1 c1 = new iqa1(27);
    public static final iqa1 d1 = new iqa1(28);
    public static final iqa1 e1 = new iqa1(29);

    public /* synthetic */ iqa1(byte b2) {
        this.a = b2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Logger.l((Throwable) obj, "Failed to fetch BPM for speed badge", new Object[0]);
                break;
            case 1:
                break;
            case 2:
                Logger.e((Throwable) obj, "Couldn't set Spotify cookies", new Object[0]);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                n57.e("[Puffin] Error observing core errors: " + ((Throwable) obj));
                break;
            case 10:
                n57.e("[Puffin] Error observing Processing Compatibility: " + ((Throwable) obj));
                break;
            case 11:
                Logger.e((Throwable) obj, "Failed to observe show subscriber state", new Object[0]);
                break;
            case 12:
                ((Throwable) obj).getMessage();
                break;
            case 13:
                Logger.k("Fetching FCM token failed with error %s", new Object[]{((Throwable) obj).getMessage()});
                break;
            case 14:
                ((Throwable) obj).getMessage();
                break;
            case 15:
                break;
            case 16:
                Throwable th = (Throwable) obj;
                Logger.d("ToggleNotificationPreferenceActionHandler", new Object[]{l1d.m("Error updating notification preferences: ", th.getMessage()), th});
                break;
            case 17:
                break;
            case 18:
                Logger.d("Social playback attempt failed", new Object[0]);
                break;
            case 19:
                n57.s("[Puffin] Error tracking PuffinFilter usage: " + ((Throwable) obj));
                break;
            case 20:
                Logger.e((Throwable) obj, "Failure in Track Row Playback", new Object[0]);
                break;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                break;
            case 22:
                Logger.e((Throwable) obj, "Failed updating chat message preferences", new Object[0]);
                break;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                n57.e(((Throwable) obj).getMessage());
                break;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                Logger.e((Throwable) obj, "Failed to load Betamax configuration, skipping video player initialization", new Object[0]);
                break;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                crk1 crk1Var = (crk1) obj;
                iu30 iu30Var = crk1Var.a.d;
                if (iu30Var != null) {
                    iu30Var.invoke(Double.valueOf(crk1Var.b));
                }
                break;
            case 26:
                frk1 frk1Var = (frk1) obj;
                iu30 iu30Var2 = frk1Var.a.d;
                if (iu30Var2 != null) {
                    iu30Var2.invoke(Double.valueOf(frk1Var.b.doubleValue()));
                }
                break;
            case 27:
                iu30 iu30Var3 = ((grk1) obj).a.d;
                if (iu30Var3 != null) {
                    iu30Var3.invoke(Boolean.FALSE);
                }
                break;
            case 28:
                CommonMessages$StatusResponse commonMessages$StatusResponse = (CommonMessages$StatusResponse) obj;
                if (commonMessages$StatusResponse.n() != psh.b) {
                    Logger.d("Down volume failure " + commonMessages$StatusResponse.n(), new Object[0]);
                }
                break;
            default:
                Throwable th2 = (Throwable) obj;
                Logger.e(th2, l1d.m("Down volume failure: ", th2.getMessage()), new Object[0]);
                break;
        }
    }
}
