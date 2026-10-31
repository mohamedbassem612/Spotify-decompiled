package android.support.v4.media;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import p.eyh0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
class MediaBrowserCompat$ItemReceiver extends ResultReceiver {
    @Override // android.support.v4.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (bundle != null) {
            eyh0.b(bundle);
            try {
                bundle.isEmpty();
            } catch (BadParcelableException unused) {
                bundle = null;
            }
        }
        if (i != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.KEY_MEDIA_ITEM)) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM);
        if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
            throw null;
        }
        throw null;
    }
}
