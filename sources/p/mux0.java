package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mux0 implements Consumer {
    public final /* synthetic */ byte a;
    public static final mux0 b = new mux0(0);
    public static final mux0 c = new mux0(1);
    public static final mux0 d = new mux0(2);
    public static final mux0 e = new mux0(3);
    public static final mux0 f = new mux0(4);
    public static final mux0 g = new mux0(5);
    public static final mux0 h = new mux0(6);
    public static final mux0 i = new mux0(7);
    public static final mux0 t = new mux0(8);
    public static final mux0 X = new mux0(9);
    public static final mux0 Y = new mux0(10);
    public static final mux0 Z = new mux0(11);
    public static final mux0 N0 = new mux0(12);
    public static final mux0 O0 = new mux0(13);
    public static final mux0 P0 = new mux0(14);
    public static final mux0 Q0 = new mux0(15);
    public static final mux0 R0 = new mux0(16);
    public static final mux0 S0 = new mux0(17);
    public static final mux0 T0 = new mux0(18);
    public static final mux0 U0 = new mux0(19);
    public static final mux0 V0 = new mux0(20);
    public static final mux0 W0 = new mux0(21);
    public static final mux0 X0 = new mux0(22);
    public static final mux0 Y0 = new mux0(23);
    public static final mux0 Z0 = new mux0(24);
    public static final mux0 a1 = new mux0(25);
    public static final mux0 b1 = new mux0(26);
    public static final mux0 c1 = new mux0(27);
    public static final mux0 d1 = new mux0(28);
    public static final mux0 e1 = new mux0(29);

    public /* synthetic */ mux0(byte b2) {
        this.a = b2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Logger.e((Throwable) obj, "Failed calling change list", new Object[0]);
                break;
            case 1:
                Logger.e((Throwable) obj, "Failed changing a playlist", new Object[0]);
                break;
            case 2:
                Logger.e((Throwable) obj, "Failed getting playlist image background", new Object[0]);
                break;
            case 3:
                Logger.e((Throwable) obj, "Failed setting AI curation reference ID", new Object[0]);
                break;
            case 4:
                Logger.e((Throwable) obj, "Failed setting picture background", new Object[0]);
                break;
            case 5:
                Logger.e((Throwable) obj, "Failed updating chat message preferences", new Object[0]);
                break;
            case 6:
                n57.e("[Puffin] Error getting connect state: " + ((Throwable) obj));
                break;
            case 7:
                n57.g("[Puffin] Exception in Puffin subscription", (Throwable) obj);
                break;
            case 8:
                n57.t("QueuePermissionProvider: state subscription terminated", (Throwable) obj);
                break;
            case 9:
                n57.t("QueuePermissionProvider: permission observable error, retrying", (Throwable) obj);
                break;
            case 10:
                n57.t("QueuePermissionProvider: capping observable error", (Throwable) obj);
                break;
            case 11:
                break;
            case 12:
                Logger.d("Failed to prepare transcript", new Object[0]);
                break;
            case 13:
                Logger.e((Throwable) obj, "Failed to show Play Modes upsell", new Object[0]);
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                Logger.g("RC Properties and product state FetchResult=".concat(((g020) obj).a()), new Object[0]);
                break;
            case 17:
                Logger.d(((Throwable) obj).getMessage(), new Object[0]);
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                n57.g("Error in selection mode event source", (Throwable) obj);
                break;
            case 23:
                n57.g("Error in local files event source", (Throwable) obj);
                break;
            case 24:
                n57.g("Error in event source", (Throwable) obj);
                break;
            case 25:
                n57.g("Error in event source", (Throwable) obj);
                break;
            case 26:
                n57.g("Error in also available offline event source", (Throwable) obj);
                break;
            case 27:
                n57.g("Error in library layout event source", (Throwable) obj);
                break;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                n57.g("Error in pins layout event source", (Throwable) obj);
                break;
            default:
                break;
        }
    }
}
