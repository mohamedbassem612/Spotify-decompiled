package p;

import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.HostException;
import androidx.car.app.IAppHost;
import androidx.car.app.b;
import androidx.car.app.media.OpenMicrophoneRequest;
import androidx.car.app.media.OpenMicrophoneResponse;
import androidx.car.app.serialization.BundlerException;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class mpd {
    public static final int AUDIO_CONTENT_BUFFER_SIZE = 512;
    public static final String AUDIO_CONTENT_MIME = "audio/l16";
    public static final int AUDIO_CONTENT_SAMPLING_RATE = 16000;
    private static final int RECORDSTATE_RECORDING = 1;
    private static final int RECORDSTATE_REMOTE_CLOSED = 2;
    private static final int RECORDSTATE_STOPPED = 0;
    private final androidx.car.app.k mCarContext;
    private OpenMicrophoneResponse mOpenMicrophoneResponse;
    private int mRecordingState = 0;
    private final Object mRecordingStateLock = new Object();

    public mpd(androidx.car.app.k kVar) {
        this.mCarContext = kVar;
    }

    public static mpd create(androidx.car.app.k kVar) {
        Objects.requireNonNull(kVar);
        try {
            return (mpd) Class.forName(kVar.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "androidx.car.app.media.AutomotiveCarAudioRecord" : "androidx.car.app.media.ProjectedCarAudioRecord").getConstructor(androidx.car.app.k.class).newInstance(kVar);
        } catch (ReflectiveOperationException unused) {
            eg.m("CarAudioRecord not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
            return null;
        }
    }

    public final /* synthetic */ void a() {
        synchronized (this.mRecordingStateLock) {
            this.mRecordingState = 2;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        synchronized (this.mRecordingStateLock) {
            int i3 = this.mRecordingState;
            if (i3 == 0) {
                throw new IllegalStateException("Called read before calling startRecording or after calling stopRecording");
            }
            if (i3 != 2) {
                return readInternal(bArr, i, i2);
            }
            return -1;
        }
    }

    public abstract int readInternal(byte[] bArr, int i, int i2);

    public void startRecording() {
        synchronized (this.mRecordingStateLock) {
            try {
                if (this.mRecordingState != 0) {
                    throw new IllegalStateException("Cannot start recording if it has started and not been stopped");
                }
                b bVar = (b) this.mCarContext.e(b.class);
                OpenMicrophoneRequest openMicrophoneRequest = new OpenMicrophoneRequest(new mjq0(new lpd(this, (byte) 0)));
                bVar.getClass();
                OpenMicrophoneResponse openMicrophoneResponse = null;
                try {
                    androidx.car.app.l lVar = bVar.c;
                    try {
                        Log.isLoggable("CarApp", 3);
                        IInterface iInterfaceB = lVar.b("app");
                        if (iInterfaceB != null) {
                            tcc tccVarOpenMicrophone = ((IAppHost) iInterfaceB).openMicrophone(new tcc(openMicrophoneRequest));
                            if (tccVarOpenMicrophone != null) {
                                openMicrophoneResponse = (OpenMicrophoneResponse) tccVarOpenMicrophone.a();
                            }
                        }
                        this.mOpenMicrophoneResponse = openMicrophoneResponse;
                        if (openMicrophoneResponse == null) {
                            openMicrophoneResponse = new OpenMicrophoneResponse(new njq0(new q58((byte) 23)));
                            this.mOpenMicrophoneResponse = openMicrophoneResponse;
                        }
                        startRecordingInternal(openMicrophoneResponse);
                        this.mRecordingState = 1;
                    } catch (SecurityException e) {
                        throw e;
                    } catch (RuntimeException e2) {
                        throw new HostException("Remote openMicrophone call failed", e2);
                    }
                } catch (RemoteException | BundlerException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void startRecordingInternal(OpenMicrophoneResponse openMicrophoneResponse);

    public void stopRecording() {
        synchronized (this.mRecordingStateLock) {
            try {
                OpenMicrophoneResponse openMicrophoneResponse = this.mOpenMicrophoneResponse;
                if (openMicrophoneResponse != null) {
                    if (this.mRecordingState != 2) {
                        openMicrophoneResponse.getCarAudioCallback().onStopRecording();
                    }
                    this.mOpenMicrophoneResponse = null;
                }
                stopRecordingInternal();
                this.mRecordingState = 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void stopRecordingInternal();
}
