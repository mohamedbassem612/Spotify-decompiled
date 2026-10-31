package androidx.car.app.media;

import java.util.Objects;
import p.mjq0;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class OpenMicrophoneRequest {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;

    public OpenMicrophoneRequest(mjq0 mjq0Var) {
        this.mCarAudioCallbackDelegate = mjq0Var.a;
    }

    public CarAudioCallbackDelegate getCarAudioCallbackDelegate() {
        CarAudioCallbackDelegate carAudioCallbackDelegate = this.mCarAudioCallbackDelegate;
        Objects.requireNonNull(carAudioCallbackDelegate);
        return carAudioCallbackDelegate;
    }

    private OpenMicrophoneRequest() {
        this.mCarAudioCallbackDelegate = null;
    }
}
