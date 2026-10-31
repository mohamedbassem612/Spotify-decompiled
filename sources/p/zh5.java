package p;

import android.media.MediaRoute2Info;
import android.net.Uri;
import android.window.BackEvent;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class zh5 {
    public static float a(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static int b(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static float c(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static float d(BackEvent backEvent) {
        return backEvent.getTouchY();
    }

    public static final vuh0 e(MediaRoute2Info mediaRoute2Info) {
        String id = mediaRoute2Info.getId();
        String string = mediaRoute2Info.getName().toString();
        List<String> features = mediaRoute2Info.getFeatures();
        int type = mediaRoute2Info.getType();
        boolean zIsSystemRoute = mediaRoute2Info.isSystemRoute();
        Uri iconUri = mediaRoute2Info.getIconUri();
        CharSequence description = mediaRoute2Info.getDescription();
        return new vuh0(id, string, features, type, zIsSystemRoute, iconUri, description != null ? description.toString() : null, mediaRoute2Info.getConnectionState(), mediaRoute2Info.getClientPackageName(), mediaRoute2Info.getVolumeHandling(), mediaRoute2Info.getVolumeMax(), mediaRoute2Info.getVolume(), mediaRoute2Info.getDeduplicationIds(), mediaRoute2Info.getExtras());
    }
}
