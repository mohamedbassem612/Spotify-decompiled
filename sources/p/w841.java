package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.player.esperanto.proto.EsResponseWithReasons;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w841 implements Consumer {
    public final /* synthetic */ byte a;
    public static final w841 b = new w841(0);
    public static final w841 c = new w841(1);
    public static final w841 d = new w841(2);
    public static final w841 e = new w841(3);
    public static final w841 f = new w841(4);
    public static final w841 g = new w841(5);
    public static final w841 h = new w841(6);
    public static final w841 i = new w841(7);
    public static final w841 t = new w841(8);
    public static final w841 X = new w841(9);
    public static final w841 Y = new w841(10);
    public static final w841 Z = new w841(11);
    public static final w841 N0 = new w841(12);
    public static final w841 O0 = new w841(13);
    public static final w841 P0 = new w841(14);
    public static final w841 Q0 = new w841(15);
    public static final w841 R0 = new w841(16);
    public static final w841 S0 = new w841(17);
    public static final w841 T0 = new w841(18);
    public static final w841 U0 = new w841(19);
    public static final w841 V0 = new w841(20);
    public static final w841 W0 = new w841(21);
    public static final w841 X0 = new w841(22);
    public static final w841 Y0 = new w841(23);
    public static final w841 Z0 = new w841(24);
    public static final w841 a1 = new w841(25);
    public static final w841 b1 = new w841(26);
    public static final w841 c1 = new w841(27);
    public static final w841 d1 = new w841(28);
    public static final w841 e1 = new w841(29);

    public /* synthetic */ w841(byte b2) {
        this.a = b2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                Throwable th = (Throwable) obj;
                Logger.d(l1d.m("Failed to change playlist follow state: ", th != null ? th.getMessage() : null), new Object[0]);
                break;
            case 3:
                Throwable th2 = (Throwable) obj;
                Logger.d(l1d.m("Unable to save content: ", th2 != null ? th2.getMessage() : null), new Object[0]);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                Logger.d(l1d.m("Unable to save content: ", ((Throwable) obj).getMessage()), new Object[0]);
                break;
            case 7:
                n57.e("[Puffin] Error in SaveFilterStateUseCase: " + ((Throwable) obj));
                break;
            case 8:
                Logger.e((Throwable) obj, "Failed to search main", new Object[0]);
                break;
            case 9:
                Logger.e((Throwable) obj, "Failed to search entity", new Object[0]);
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                Logger.e((Throwable) obj, "Failed sending reset signal", new Object[0]);
                break;
            case 18:
                Logger.e((Throwable) obj, "[Puffin] Error while combining ShouldOverrideNormalization observables.", new Object[0]);
                break;
            case 19:
                break;
            case 20:
                Logger.e((Throwable) obj, "Error playing from pick and shuffle cap", new Object[0]);
                break;
            case 21:
                Logger.e((Throwable) obj, "Could not load signup v2 configuration, fallback to default", new Object[0]);
                break;
            case 22:
                Logger.e((Throwable) obj, "Sleep timer failed to pause playback", new Object[0]);
                break;
            case 23:
                ((EsResponseWithReasons.ResponseWithReasons) obj).toString();
                break;
            case 24:
                Logger.e((Throwable) obj, "Failed starting lens Smart Shuffle playback", new Object[0]);
                break;
            case 25:
                ((py21) obj).toString();
                break;
            case 26:
                n57.t("Failed to send minus signal through the context player client for the currently playing item", (Throwable) obj);
                break;
            case 27:
                ((py21) obj).b(fe91.W0, fe91.X0);
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                Logger.e((Throwable) obj, "social listening impl: Failed observing device broadcast status.", new Object[0]);
                break;
            default:
                Logger.e((Throwable) obj, "social listening impl: Failed observing social session update.", new Object[0]);
                break;
        }
    }
}
