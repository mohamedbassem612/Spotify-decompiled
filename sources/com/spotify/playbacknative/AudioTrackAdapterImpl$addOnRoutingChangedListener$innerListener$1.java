package com.spotify.playbacknative;

import android.media.AudioTrack;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/media/AudioTrack;", "kotlin.jvm.PlatformType", "it", "Lp/rih1;", "onRoutingChanged", "(Landroid/media/AudioTrack;)V", "<anonymous>"}, k = 3, mv = {2, 3, 0})
public final class AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$1 implements AudioTrack.OnRoutingChangedListener {
    final /* synthetic */ AudioTrackAdapter.OnRoutingChangedListener $listener;
    final /* synthetic */ AudioTrackAdapterImpl this$0;

    public AudioTrackAdapterImpl$addOnRoutingChangedListener$innerListener$1(AudioTrackAdapter.OnRoutingChangedListener onRoutingChangedListener, AudioTrackAdapterImpl audioTrackAdapterImpl) {
        this.$listener = onRoutingChangedListener;
        this.this$0 = audioTrackAdapterImpl;
    }

    @Override // android.media.AudioTrack.OnRoutingChangedListener
    public final void onRoutingChanged(AudioTrack audioTrack) {
        AudioTrackAdapter.OnRoutingChangedListener onRoutingChangedListener = this.$listener;
        AudioTrackAdapterImpl audioTrackAdapterImpl = this.this$0;
        onRoutingChangedListener.onRoutingChanged(audioTrackAdapterImpl.toAudioDeviceInfoFacade(audioTrackAdapterImpl.safeRoutedDevice(audioTrack)));
    }
}
