package p;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.os.ResultReceiver;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yhh0 extends gih0 {
    public final /* synthetic */ byte e;
    public final /* synthetic */ ResultReceiver f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yhh0(Object obj, ResultReceiver resultReceiver, byte b) {
        super(obj);
        this.e = b;
        this.f = resultReceiver;
    }

    @Override // p.gih0
    public final void c(Object obj) {
        byte b = this.e;
        ResultReceiver resultReceiver = this.f;
        switch (b) {
            case 0:
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) obj;
                if ((this.d & 2) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM, mediaBrowserCompat$MediaItem);
                    resultReceiver.send(0, bundle);
                } else {
                    resultReceiver.send(-1, null);
                }
                break;
            default:
                List list = (List) obj;
                if (list != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS, (Parcelable[]) list.toArray(new MediaBrowserCompat$MediaItem[0]));
                    resultReceiver.send(0, bundle2);
                } else {
                    resultReceiver.send(-1, null);
                }
                break;
        }
    }
}
