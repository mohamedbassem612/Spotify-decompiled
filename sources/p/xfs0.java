package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.processors.PublishProcessor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xfs0 implements Consumer {
    public final /* synthetic */ byte a;
    public static final xfs0 b = new xfs0(0);
    public static final xfs0 c = new xfs0(1);
    public static final xfs0 d = new xfs0(2);
    public static final xfs0 e = new xfs0(3);
    public static final xfs0 f = new xfs0(4);
    public static final xfs0 g = new xfs0(5);
    public static final xfs0 h = new xfs0(6);
    public static final xfs0 i = new xfs0(7);
    public static final xfs0 t = new xfs0(8);
    public static final xfs0 X = new xfs0(9);
    public static final xfs0 Y = new xfs0(10);
    public static final xfs0 Z = new xfs0(11);
    public static final xfs0 N0 = new xfs0(12);
    public static final xfs0 O0 = new xfs0(13);
    public static final xfs0 P0 = new xfs0(14);
    public static final xfs0 Q0 = new xfs0(15);
    public static final xfs0 R0 = new xfs0(16);
    public static final xfs0 S0 = new xfs0(17);
    public static final xfs0 T0 = new xfs0(18);
    public static final xfs0 U0 = new xfs0(19);
    public static final xfs0 V0 = new xfs0(20);
    public static final xfs0 W0 = new xfs0(21);
    public static final xfs0 X0 = new xfs0(22);
    public static final xfs0 Y0 = new xfs0(23);
    public static final xfs0 Z0 = new xfs0(24);
    public static final xfs0 a1 = new xfs0(25);
    public static final xfs0 b1 = new xfs0(26);
    public static final xfs0 c1 = new xfs0(27);
    public static final xfs0 d1 = new xfs0(28);
    public static final xfs0 e1 = new xfs0(29);

    public /* synthetic */ xfs0(byte b2) {
        this.a = b2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                Logger.e((Throwable) obj, "PersonalizedShuffleListComponent: failed to set lens.", new Object[0]);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                new PublishProcessor().onNext((ju41) obj);
                break;
            case 6:
                Logger.k("Stall timer failed", new Object[0]);
                break;
            case 7:
                Logger.e((Throwable) obj, "Couldn't get current track uri.", new Object[0]);
                break;
            case 8:
                Logger.e((Throwable) obj, "Failed to change list with custom resolver", new Object[0]);
                break;
            case 9:
                Logger.e((Throwable) obj, "Failed to change list", new Object[0]);
                break;
            case 10:
                Logger.e((Throwable) obj, "Failed to update list items with custom resolver", new Object[0]);
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                Logger.e((Throwable) obj, "Error while fetching Playlist metadata", new Object[0]);
                break;
            case 14:
                Logger.e((Throwable) obj, "Error while fetching Playlist metadata", new Object[0]);
                break;
            case 15:
                break;
            case 16:
                Logger.e((Throwable) obj, "Failed to show SmartShuffle upsell", new Object[0]);
                break;
            case 17:
                Logger.d(((Throwable) obj).getMessage(), new Object[0]);
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                Logger.d(((Throwable) obj).getMessage(), new Object[0]);
                break;
            case 21:
                break;
            case 22:
                Logger.d(((Throwable) obj).getMessage(), new Object[0]);
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                break;
            case 26:
                Throwable th = (Throwable) obj;
                Logger.e(th, th.getMessage(), new Object[0]);
                break;
            case 27:
                Throwable th2 = (Throwable) obj;
                Logger.e(th2, th2.getMessage(), new Object[0]);
                break;
            case 28:
                Logger.e((Throwable) obj, "Failed adding playlist to rootlist", new Object[0]);
                break;
            default:
                Logger.e((Throwable) obj, "Failed creating a session", new Object[0]);
                break;
        }
    }
}
