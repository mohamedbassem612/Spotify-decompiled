package p;

import com.spotify.audiorecognition.v1.AudioRecognitionResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n28 implements p28 {
    public final AudioRecognitionResponse a;

    public n28(AudioRecognitionResponse audioRecognitionResponse) {
        this.a = audioRecognitionResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n28) && this.a.equals(((n28) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
