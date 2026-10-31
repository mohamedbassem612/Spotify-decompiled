package com.spotify.coremediarenderer.bridge;

import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J7\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016Jg\u0010\"\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH&¢\u0006\u0004\b\"\u0010#J'\u0010&\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\rH&¢\u0006\u0004\b&\u0010'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006(À\u0006\u0001"}, d2 = {"Lcom/spotify/coremediarenderer/bridge/PlaybackRegistrationListener;", "", "", "playbackId", "mediaUrl", "trackUri", "trackUid", "sessionId", "Lp/rih1;", "onPlaybackRegistered", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onPlaybackUnregistered", "(Ljava/lang/String;)V", "", "displaySleepPreventionActive", "onDisplaySleepPreventionActiveChanged", "(Ljava/lang/String;Z)V", "", "languageCodes", "", "trackFlags", "onSubtitleTracksAvailable", "(Ljava/lang/String;[Ljava/lang/String;[I)V", "text", "styleRuns", "rubyRanges", "rubyAnnotations", "", "alignment", "", "linePercentage", "lineNumber", "position", "size", "onSubtitleCueChanged", "(Ljava/lang/String;Ljava/lang/String;[I[I[Ljava/lang/String;IDIDD)V", "languageCode", "closedCaption", "onActiveSubtitleChanged", "(Ljava/lang/String;Ljava/lang/String;Z)V", "src_main_java_com_spotify_coremediarenderer_bridge-bridge"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface PlaybackRegistrationListener {
    void onActiveSubtitleChanged(String playbackId, String languageCode, boolean closedCaption);

    void onDisplaySleepPreventionActiveChanged(String playbackId, boolean displaySleepPreventionActive);

    void onPlaybackRegistered(String playbackId, String mediaUrl, String trackUri, String trackUid, String sessionId);

    void onPlaybackUnregistered(String playbackId);

    void onSubtitleCueChanged(String playbackId, String text, int[] styleRuns, int[] rubyRanges, String[] rubyAnnotations, int alignment, double linePercentage, int lineNumber, double position, double size);

    void onSubtitleTracksAvailable(String playbackId, String[] languageCodes, int[] trackFlags);
}
