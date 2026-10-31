package androidx.car.app.media;

import androidx.car.app.k;
import java.io.IOException;
import java.io.InputStream;
import p.mpd;
import p.qrd;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@qrd
public class ProjectedCarAudioRecord extends mpd {
    private InputStream mInputStream;

    public ProjectedCarAudioRecord(k kVar) {
        super(kVar);
    }

    @Override // p.mpd
    public int readInternal(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.mInputStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            return inputStream.read(bArr, i, i2);
        } catch (IOException unused) {
            stopRecording();
            return -1;
        }
    }

    @Override // p.mpd
    public void startRecordingInternal(OpenMicrophoneResponse openMicrophoneResponse) {
        this.mInputStream = openMicrophoneResponse.getCarMicrophoneInputStream();
    }

    @Override // p.mpd
    public void stopRecordingInternal() {
        try {
            InputStream inputStream = this.mInputStream;
            if (inputStream != null) {
                inputStream.close();
                this.mInputStream = null;
            }
        } catch (IOException unused) {
        }
    }
}
