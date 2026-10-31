package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k530 implements Consumer {
    public final /* synthetic */ byte a;
    public static final k530 b = new k530(0);
    public static final k530 c = new k530(1);
    public static final k530 d = new k530(2);
    public static final k530 e = new k530(3);
    public static final k530 f = new k530(4);
    public static final k530 g = new k530(5);
    public static final k530 h = new k530(6);
    public static final k530 i = new k530(7);
    public static final k530 t = new k530(8);
    public static final k530 X = new k530(9);
    public static final k530 Y = new k530(10);
    public static final k530 Z = new k530(11);
    public static final k530 N0 = new k530(12);
    public static final k530 O0 = new k530(13);
    public static final k530 P0 = new k530(14);
    public static final k530 Q0 = new k530(15);
    public static final k530 R0 = new k530(16);
    public static final k530 S0 = new k530(17);
    public static final k530 T0 = new k530(18);
    public static final k530 U0 = new k530(19);
    public static final k530 V0 = new k530(20);
    public static final k530 W0 = new k530(21);
    public static final k530 X0 = new k530(22);
    public static final k530 Y0 = new k530(23);
    public static final k530 Z0 = new k530(24);
    public static final k530 a1 = new k530(25);
    public static final k530 b1 = new k530(26);
    public static final k530 c1 = new k530(27);
    public static final k530 d1 = new k530(28);
    public static final k530 e1 = new k530(29);

    public /* synthetic */ k530(byte b2) {
        this.a = b2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Logger.e((Throwable) obj, "Failed to get followed state using FollowEndpoint", new Object[0]);
                break;
            case 1:
                Logger.d("Error subscribing to page identifier.", new Object[0]);
                break;
            case 2:
                Logger.e((Throwable) obj, "FreeEmployeeDayActivityPlugin: failed to check the conditions and/or send in-app message trigger", new Object[0]);
                break;
            case 3:
                Logger.e((Throwable) obj, "Product state monitoring has failed", new Object[0]);
                break;
            case 4:
                Logger.e((Throwable) obj, "FullScreenQRCodeView: QR Code could not be generated", new Object[0]);
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                Throwable th = (Throwable) obj;
                Logger.e(th, th.getMessage(), new Object[0]);
                break;
            case 8:
                Logger.b("[LiveSharing] Terminating live-sharing session.", new Object[0]);
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                Logger.d("[Puffin] Core returned error: " + ((Notification) obj), new Object[0]);
                break;
            case 12:
                Logger.e((Throwable) obj, "Failed to get username", new Object[0]);
                break;
            case 13:
                n57.e(((Throwable) obj).toString());
                break;
            case 14:
                Logger.d("Failed to prepare transcript", new Object[0]);
                break;
            case 15:
                Logger.e((Throwable) obj, "Failed to show message from PubSub.", new Object[0]);
                break;
            case 16:
                ((MessageResponse) obj).toString();
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Logger.d("Failed to save language selection", new Object[0]);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Throwable th2 = (Throwable) obj;
                Logger.e(th2, th2.getMessage(), new Object[0]);
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Throwable) obj).getMessage();
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Logger.k("Fetching FCM token failed with error %s", new Object[]{((Throwable) obj).getMessage()});
                break;
            case 22:
                ((Throwable) obj).getMessage();
                break;
            case 23:
                ((Throwable) obj).getMessage();
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Logger.d("EIS: Error in list entity observable", new Object[]{(Throwable) obj});
                break;
            case 25:
                ((wsc0) obj).e.size();
                break;
            case 26:
                Logger.d("EIS: Couldn't load list, error: %s", new Object[]{((Throwable) obj).getMessage()});
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
