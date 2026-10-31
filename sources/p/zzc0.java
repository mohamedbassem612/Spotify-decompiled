package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zzc0 implements Consumer {
    public final /* synthetic */ byte a;
    public static final zzc0 b = new zzc0(0);
    public static final zzc0 c = new zzc0(1);
    public static final zzc0 d = new zzc0(2);
    public static final zzc0 e = new zzc0(3);
    public static final zzc0 f = new zzc0(4);
    public static final zzc0 g = new zzc0(5);
    public static final zzc0 h = new zzc0(6);
    public static final zzc0 i = new zzc0(7);
    public static final zzc0 t = new zzc0(8);
    public static final zzc0 X = new zzc0(9);
    public static final zzc0 Y = new zzc0(10);
    public static final zzc0 Z = new zzc0(11);
    public static final zzc0 N0 = new zzc0(12);
    public static final zzc0 O0 = new zzc0(13);
    public static final zzc0 P0 = new zzc0(14);
    public static final zzc0 Q0 = new zzc0(15);
    public static final zzc0 R0 = new zzc0(16);
    public static final zzc0 S0 = new zzc0(17);
    public static final zzc0 T0 = new zzc0(18);
    public static final zzc0 U0 = new zzc0(19);
    public static final zzc0 V0 = new zzc0(20);
    public static final zzc0 W0 = new zzc0(21);
    public static final zzc0 X0 = new zzc0(22);
    public static final zzc0 Y0 = new zzc0(23);
    public static final zzc0 Z0 = new zzc0(24);
    public static final zzc0 a1 = new zzc0(25);
    public static final zzc0 b1 = new zzc0(26);
    public static final zzc0 c1 = new zzc0(27);
    public static final zzc0 d1 = new zzc0(28);
    public static final zzc0 e1 = new zzc0(29);

    public /* synthetic */ zzc0(byte b2) {
        this.a = b2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                nqf0 nqf0Var = (nqf0) obj;
                nqf0Var.b.invoke(nqf0Var.a);
                break;
            case 4:
                n57.e("[Puffin] Error applying filters: " + ((Throwable) obj));
                break;
            case 5:
                Logger.e((Throwable) obj, "[Puffin] Error downloading filters", new Object[0]);
                break;
            case 6:
                Logger.d("Collection platform failed to return a value for the entity", new Object[0]);
                break;
            case 7:
                Logger.e((Throwable) obj, "Could not observe media-button player state", new Object[0]);
                break;
            case 8:
                Logger.e((Throwable) obj, "Error while observing errors.", new Object[0]);
                break;
            case 9:
                Logger.e((Throwable) obj, "Error during restriction media action observe.", new Object[0]);
                break;
            case 10:
                break;
            case 11:
                Logger.e((Throwable) obj, "Error prefetching info", new Object[0]);
                break;
            case 12:
                Throwable th = (Throwable) obj;
                Logger.d(l1d.m("NotificationPreferenceEnableActionImpl: Error enabling all notifications: ", th.getMessage()), new Object[]{th});
                break;
            case 13:
                Logger.h((Throwable) obj, "Could not enter PiP", new Object[0]);
                break;
            case 14:
                Logger.e((Throwable) obj, "Err loading NowPlayingFragment", new Object[0]);
                break;
            case 15:
                ((tb0) obj).toString();
                break;
            case 16:
                n57.e("[Puffin] Error getting Puffin State: " + ((Throwable) obj));
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                Logger.e((Throwable) obj, "Error in subscription to Product State", new Object[0]);
                break;
            case 21:
                break;
            case 22:
                Logger.e((Throwable) obj, "Go: Failed to play TTS", new Object[0]);
                break;
            case 23:
                n57.s("[Puffin] Error removing optimization: " + ((Throwable) obj));
                break;
            case 24:
                Logger.e((Throwable) obj, "Party session observation failed", new Object[0]);
                break;
            case 25:
                break;
            case 26:
                break;
            case 27:
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                break;
            default:
                break;
        }
    }
}
