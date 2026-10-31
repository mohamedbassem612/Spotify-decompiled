package p;

import android.content.Context;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import com.spotify.audio.record.AudioRecordingException;
import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z28 implements Supplier {
    public final bv40 a;
    public final mw7 b;
    public final u28 c;
    public final f38 d;
    public final ow3 e;

    public z28(Context context, bv40 bv40Var, mw7 mw7Var, u28 u28Var, f38 f38Var) {
        this.a = bv40Var;
        this.b = mw7Var;
        this.c = u28Var;
        this.d = f38Var;
        this.e = new ow3(context, u28Var, (byte) 22);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w28 get() {
        NoiseSuppressor noiseSuppressorCreate;
        ow3 ow3Var = this.e;
        ow3Var.l();
        Boolean bool = (Boolean) this.d.get();
        if (((uw7) this.b).a.getMode() == 3 && !bool.booleanValue()) {
            throw new AudioRecordingException(new IllegalStateException("Mic is unavailable, it may already be in use by another process"));
        }
        boolean zBooleanValue = bool.booleanValue();
        int iA = zBooleanValue ? 16000 : this.c.a();
        w28 w28VarB = ow3Var.b(zBooleanValue ? 6 : 1, iA, new y28((byte) 0, iA, zBooleanValue));
        int audioSessionId = w28VarB.a().getAudioSessionId();
        if (!bool.booleanValue() && ((Boolean) s28.b.get()).booleanValue()) {
            AcousticEchoCanceler acousticEchoCancelerK = zp8.k(audioSessionId);
            if (acousticEchoCancelerK != null) {
                acousticEchoCancelerK.setEnabled(true);
            }
            if (acousticEchoCancelerK != null) {
                acousticEchoCancelerK.getEnabled();
            }
        }
        if (!bool.booleanValue() && NoiseSuppressor.isAvailable() && (noiseSuppressorCreate = NoiseSuppressor.create(audioSessionId)) != null) {
            noiseSuppressorCreate.setEnabled(true);
            noiseSuppressorCreate.getEnabled();
        }
        fuo1.o(w28VarB.a(), this.a.l());
        return w28VarB;
    }
}
