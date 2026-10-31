package androidx.media;

import p.f5j1;
import p.h5j1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(f5j1 f5j1Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        h5j1 h5j1VarH = audioAttributesCompat.a;
        if (f5j1Var.e(1)) {
            h5j1VarH = f5j1Var.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) h5j1VarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, f5j1 f5j1Var) {
        f5j1Var.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        f5j1Var.i(1);
        f5j1Var.l(audioAttributesImpl);
    }
}
