package androidx.car.app.media;

import android.os.RemoteException;
import java.util.Objects;
import p.eg;
import p.kpd;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class CarAudioCallbackDelegate {
    private final ICarAudioCallback mCallback;

    private CarAudioCallbackDelegate(kpd kpdVar) {
        this.mCallback = new CarAudioCallbackStub(kpdVar);
    }

    public static CarAudioCallbackDelegate create(kpd kpdVar) {
        return new CarAudioCallbackDelegate(kpdVar);
    }

    public void onStopRecording() {
        try {
            ICarAudioCallback iCarAudioCallback = this.mCallback;
            Objects.requireNonNull(iCarAudioCallback);
            iCarAudioCallback.onStopRecording();
        } catch (RemoteException e) {
            eg.j(e);
        }
    }

    @qrd
    public static class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        private final kpd mCarAudioCallback;

        public CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            kpd kpdVar = this.mCarAudioCallback;
            Objects.requireNonNull(kpdVar);
            kpdVar.onStopRecording();
        }

        public CarAudioCallbackStub(kpd kpdVar) {
            this.mCarAudioCallback = kpdVar;
        }
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }
}
