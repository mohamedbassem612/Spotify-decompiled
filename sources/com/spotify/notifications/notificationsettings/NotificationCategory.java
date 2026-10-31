package com.spotify.notifications.notificationsettings;

import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;
import p.r0z;
import p.t0z;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/spotify/notifications/notificationsettings/NotificationCategory;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "MUSIC_ARTIST_RECOMMENDATIONS", "CONCERTS_EVENTS", "OFFERS_BUNDLES", "EXPERIENCES_MADE_FOR_YOU", "PODCAST_SHOW_RECOMMENDATIONS", "LIVESTREAM_VIRTUAL_EVENTS", "FEATURES_TIPS", "SURVEYS", "NEWS_CULTURAL_MOMENTS", "ARTIST_CREATOR_MERCH", "AUDIOBOOKS", "COMMENTS", "JAM", "MESSAGES", "SOCIAL", "PROMPTED_EXPERIENCES", "src_main_java_com_spotify_notifications_notificationsettings-notificationsettings"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public enum NotificationCategory {
    MUSIC_ARTIST_RECOMMENDATIONS("notify-music-and-artist-recommendations"),
    CONCERTS_EVENTS("notify-in-person-concerts-and-events"),
    OFFERS_BUNDLES("notify-spotify-offers-and-bundles"),
    EXPERIENCES_MADE_FOR_YOU("notify-spotify-experiences-made-for-you"),
    PODCAST_SHOW_RECOMMENDATIONS("notify-podcast-and-show-recommendations"),
    LIVESTREAM_VIRTUAL_EVENTS("notify-livestream-and-virtual-events"),
    FEATURES_TIPS("notify-spotify-features-and-tips"),
    SURVEYS("notify-surveys"),
    NEWS_CULTURAL_MOMENTS("notify-news-and-cultural-moments"),
    ARTIST_CREATOR_MERCH("notify-artist-and-creator-merchandise"),
    AUDIOBOOKS("notify-audiobooks"),
    COMMENTS("notify-comments"),
    JAM("notify-jam"),
    MESSAGES("notify-messages"),
    SOCIAL("notify-social"),
    PROMPTED_EXPERIENCES("notify-prompted-experiences");

    private static final /* synthetic */ r0z $ENTRIES = new t0z(values());
    private final String key;

    NotificationCategory(String str) {
        this.key = str;
    }

    public static r0z getEntries() {
        return $ENTRIES;
    }

    public final String getKey() {
        return this.key;
    }
}
