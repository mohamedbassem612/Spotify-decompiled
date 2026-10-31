package androidx.car.app.media;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import p.bhn0;
import p.njq0;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public final class OpenMicrophoneResponse {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;
    private final ParcelFileDescriptor mCarMicrophoneDescriptor;

    public OpenMicrophoneResponse(njq0 njq0Var) {
        this.mCarAudioCallbackDelegate = njq0Var.a;
        this.mCarMicrophoneDescriptor = null;
    }

    public CarAudioCallbackDelegate getCarAudioCallback() {
        CarAudioCallbackDelegate carAudioCallbackDelegate = this.mCarAudioCallbackDelegate;
        Objects.requireNonNull(carAudioCallbackDelegate);
        return carAudioCallbackDelegate;
    }

    public InputStream getCarMicrophoneInputStream() {
        ParcelFileDescriptor parcelFileDescriptor = this.mCarMicrophoneDescriptor;
        if (parcelFileDescriptor == null) {
            try {
                ParcelFileDescriptor[] parcelFileDescriptorArrCreateReliablePipe = ParcelFileDescriptor.createReliablePipe();
                parcelFileDescriptorArrCreateReliablePipe[1].close();
                parcelFileDescriptor = parcelFileDescriptorArrCreateReliablePipe[0];
            } catch (IOException e) {
                bhn0.p(e);
                return null;
            }
        }
        return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
    }

    private OpenMicrophoneResponse() {
        this.mCarMicrophoneDescriptor = null;
        this.mCarAudioCallbackDelegate = null;
    }
}
