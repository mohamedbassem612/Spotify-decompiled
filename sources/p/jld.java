package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class jld implements Consumer {
    public final /* synthetic */ byte a;

    private final void a(Object obj) {
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                n57.g("Cannot receive value from RxFlags", (Throwable) obj);
                break;
            case 1:
                break;
            case 2:
                Logger.e((Throwable) obj, "Couldn't subscribe to NavigationContext", new Object[0]);
                break;
            case 3:
                Logger.e((Throwable) obj, "Couldn't subscribe to player and radio state", new Object[0]);
                break;
            case 4:
                Logger.e((Throwable) obj, "Error subscribing to user data", new Object[0]);
                break;
            case 5:
                break;
            case 6:
                Logger.e((Throwable) obj, "Failed to add track to queue", new Object[0]);
                break;
            case 7:
                Logger.e((Throwable) obj, "Failed to observe on product observer", new Object[0]);
                break;
            case 8:
                Logger.d("EIS: Couldn't load list, error: %s", new Object[]{((Throwable) obj).getMessage()});
                break;
            case 9:
                Logger.d("EIS: Couldn't load list, error: %s", new Object[]{((Throwable) obj).getMessage()});
                break;
            case 10:
                Logger.e((Throwable) obj, "Failed to retrieve view model", new Object[0]);
                break;
            case 11:
                int i = w1t0.Z1;
                break;
            case 12:
                break;
            case 13:
                Logger.e((Throwable) obj, "Failed to listen for playback errors.", new Object[0]);
                break;
            case 14:
                Logger.e((Throwable) obj, "Failed getting the player state", new Object[0]);
                break;
            case 15:
                Logger.e((Throwable) obj, "Failed getting the player state", new Object[0]);
                break;
            case 16:
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Throwable th = (Throwable) obj;
                th.getCause();
                th.getMessage();
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                Logger.e((Throwable) obj, "Failed getting the player state", new Object[0]);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Logger.e((Throwable) obj, "Failed getting the player state", new Object[0]);
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                Logger.e((Throwable) obj, "Couldn't subscribe to RxSessionSatate", new Object[0]);
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Logger.e((Throwable) obj, "Failed to get auth response", new Object[0]);
                break;
            default:
                Logger.e((Throwable) obj, "Failed getting the player state", new Object[0]);
                break;
        }
    }
}
