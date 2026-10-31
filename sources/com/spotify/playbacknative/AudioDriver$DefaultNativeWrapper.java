package com.spotify.playbacknative;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public class AudioDriver$DefaultNativeWrapper implements AudioDriver$NativeWrapper {
    final /* synthetic */ AudioDriver this$0;

    private AudioDriver$DefaultNativeWrapper(AudioDriver audioDriver) {
        this.this$0 = audioDriver;
    }

    @Override // com.spotify.playbacknative.AudioDriver$NativeWrapper
    public void onBufferUnderrun(int i) {
        AudioDriver.d(this.this$0, i);
    }

    @Override // com.spotify.playbacknative.AudioDriver$NativeWrapper
    public void onDestroy() {
        AudioDriver.e(this.this$0);
    }

    @Override // com.spotify.playbacknative.AudioDriver$NativeWrapper
    public void onFlush() {
        AudioDriver.f(this.this$0);
    }

    public /* synthetic */ AudioDriver$DefaultNativeWrapper(AudioDriver audioDriver, int i) {
        this(audioDriver);
    }
}
