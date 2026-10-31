package com.spotify.playbacknative;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/spotify/playbacknative/AudioTrackAdapter$OnRoutingChangedListener;", "", "Lcom/spotify/playbacknative/AudioDeviceInfoFacade;", "routedDevice", "Lp/rih1;", "onRoutingChanged", "(Lcom/spotify/playbacknative/AudioDeviceInfoFacade;)V", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface AudioTrackAdapter$OnRoutingChangedListener {
    void onRoutingChanged(AudioDeviceInfoFacade routedDevice);
}
