package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.clientrestrictions.v1.RestrictedIntegrationsResponse;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dxu implements Consumer {
    public final /* synthetic */ byte a;
    public static final dxu b = new dxu(0);
    public static final dxu c = new dxu(1);
    public static final dxu d = new dxu(2);
    public static final dxu e = new dxu(3);
    public static final dxu f = new dxu(4);
    public static final dxu g = new dxu(5);
    public static final dxu h = new dxu(6);
    public static final dxu i = new dxu(7);
    public static final dxu t = new dxu(8);
    public static final dxu X = new dxu(9);
    public static final dxu Y = new dxu(10);
    public static final dxu Z = new dxu(11);
    public static final dxu N0 = new dxu(12);
    public static final dxu O0 = new dxu(13);
    public static final dxu P0 = new dxu(14);
    public static final dxu Q0 = new dxu(15);
    public static final dxu R0 = new dxu(16);
    public static final dxu S0 = new dxu(17);
    public static final dxu T0 = new dxu(18);
    public static final dxu U0 = new dxu(19);
    public static final dxu V0 = new dxu(20);
    public static final dxu W0 = new dxu(21);
    public static final dxu X0 = new dxu(22);
    public static final dxu Y0 = new dxu(23);
    public static final dxu Z0 = new dxu(24);
    public static final dxu a1 = new dxu(25);
    public static final dxu b1 = new dxu(26);
    public static final dxu c1 = new dxu(27);
    public static final dxu d1 = new dxu(28);
    public static final dxu e1 = new dxu(29);

    public /* synthetic */ dxu(byte b2) {
        this.a = b2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                return;
            case 2:
                return;
            case 3:
                return;
            case 4:
                return;
            case 5:
                n57.g("Error in effect handler", (Throwable) obj);
                return;
            case 6:
                Throwable th = (Throwable) obj;
                Logger.d("EnableAllNotificationPreferencesActionHandler", new Object[]{l1d.m("Error enabling all notifications: ", th.getMessage()), th});
                return;
            case 7:
                Logger.l((Throwable) obj, "Unable to change segments", new Object[0]);
                return;
            case 8:
                n57.t("Error while handling play command for Vodcast", (Throwable) obj);
                return;
            case 9:
                Logger.e((Throwable) obj, "Failed to render model", new Object[0]);
                return;
            case 10:
                return;
            case 11:
                return;
            case 12:
                return;
            case 13:
                Throwable th2 = (Throwable) obj;
                Logger.e(th2, th2.getMessage(), new Object[0]);
                return;
            case 14:
                Throwable th3 = (Throwable) obj;
                Logger.e(th3, th3.getMessage(), new Object[0]);
                return;
            case 15:
                return;
            case 16:
                Throwable th4 = (Throwable) obj;
                Logger.e(th4, th4.getMessage(), new Object[0]);
                return;
            case 17:
                ((s031) obj).toString();
                return;
            case 18:
                Objects.toString(((RestrictedIntegrationsResponse) obj).p());
                return;
            case 19:
                Logger.e((Throwable) obj, "failed to update playback speed", new Object[0]);
                return;
            case 20:
                Logger.e((Throwable) obj, "Error searching", new Object[0]);
                return;
            case 21:
                return;
            case 22:
                throw new IllegalStateException("FadingSeekBarPresenter::seekTo failed", (Throwable) obj);
            case 23:
                return;
            case 24:
                return;
            case 25:
                return;
            case 26:
                return;
            case 27:
                return;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return;
            default:
                Logger.e((Throwable) obj, "Failed to opt out of show notifications", new Object[0]);
                return;
        }
    }
}
