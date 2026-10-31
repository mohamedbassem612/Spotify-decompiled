package p;

import android.media.browse.MediaBrowser;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rr4 extends MediaBrowser.SubscriptionCallback {
    public final /* synthetic */ d520 a;

    public rr4(d520 d520Var) {
        this.a = d520Var;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onChildrenLoaded(String str, List list) {
        Object iconUri;
        u011 u011Var;
        Uri uri;
        list.size();
        List list2 = list;
        if (!list2.isEmpty()) {
            ((MediaBrowser.MediaItem) list.get(0)).isBrowsable();
        }
        boolean z = !list2.isEmpty() && ((MediaBrowser.MediaItem) list.get(0)).isBrowsable();
        d520 d520Var = this.a;
        if (z) {
            MediaBrowser mediaBrowserZ = d520Var.z();
            String mediaId = ((MediaBrowser.MediaItem) list.get(0)).getMediaId();
            mediaId.getClass();
            mediaBrowserZ.subscribe(mediaId, this);
            return;
        }
        ohd ohdVar = (ohd) d520Var.e;
        if (ohdVar == null) {
            return;
        }
        d520Var.e = null;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) it.next();
            Bundle extras = mediaItem.getDescription().getExtras();
            if (extras == null || (iconUri = extras.getString("com.spotify.music.extra.ICON_URI_MEDIUM")) == null) {
                iconUri = mediaItem.getDescription().getIconUri();
            }
            if (iconUri != null) {
                Uri uri2 = Uri.EMPTY;
                if (uri2.equals(iconUri)) {
                    u011Var = null;
                } else {
                    String strValueOf = String.valueOf(mediaItem.getDescription().getTitle());
                    CharSequence subtitle = mediaItem.getDescription().getSubtitle();
                    String string = subtitle != null ? subtitle.toString() : null;
                    if (string == null) {
                        string = "";
                    }
                    String string2 = iconUri.toString();
                    String mediaId2 = mediaItem.getMediaId();
                    if (mediaId2 != null && (uri = Uri.parse(ihc1.U0(mediaId2, "---", mediaId2))) != null) {
                        uri2 = uri;
                    }
                    u011Var = new u011(uri2, strValueOf, string, string2);
                }
            } else {
                u011Var = null;
            }
            if (u011Var != null) {
                arrayList.add(u011Var);
            }
        }
        ohdVar.resumeWith(arrayList);
    }

    @Override // android.media.browse.MediaBrowser.SubscriptionCallback
    public final void onError(String str) {
        d520 d520Var = this.a;
        ohd ohdVar = (ohd) d520Var.e;
        if (ohdVar != null) {
            d520Var.e = null;
            ohdVar.resumeWith(new m231(new RuntimeException("Can't load items from media browser service")));
        }
    }
}
