package com.spotify.playbacknative;

import android.media.AudioDeviceInfo;
import android.os.Build;
import com.spotify.playlist4.proto.PlaylistSyncReasonProto;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, d2 = {"getAddressFrom", "", "audioDeviceInfo", "Landroid/media/AudioDeviceInfo;", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, k = 2, mv = {2, 3, 0}, xi = PlaylistSyncReasonProto.PlaylistSyncCaller.MULTIGET_ADDITIONAL_RESPONSE_VALUE)
public final class AudioDeviceInfoFacadeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAddressFrom(AudioDeviceInfo audioDeviceInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return audioDeviceInfo.getAddress();
        }
        return null;
    }
}
