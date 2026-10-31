package p;

import com.spotify.boombox.audiosink.NativeAudioSinkChain;
import com.spotify.boombox.audiosink.NativeAudioSinkChainFactory;
import com.spotify.esperanto.esperanto.Transport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z48 implements NativeAudioSinkChainFactory {
    public Transport a;
    public NativeAudioSinkChainFactory b;

    public final synchronized NativeAudioSinkChain create(boolean z, int i, int i2, boolean z2, float f, float f2) {
        NativeAudioSinkChainFactory nativeAudioSinkChainFactory;
        nativeAudioSinkChainFactory = this.b;
        return nativeAudioSinkChainFactory != null ? nativeAudioSinkChainFactory.create(z, i, i2, z2, f, f2) : null;
    }
}
