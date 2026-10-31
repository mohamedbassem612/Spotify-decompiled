package p;

import com.spotify.watchfeedentrypoints.component.item.v1.WatchFeedVideoCarouselComponent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pal1 extends qal1 {
    public final WatchFeedVideoCarouselComponent a;

    public pal1(WatchFeedVideoCarouselComponent watchFeedVideoCarouselComponent) {
        this.a = watchFeedVideoCarouselComponent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pal1) && this.a.equals(((pal1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
