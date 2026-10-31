package androidx.media;

import android.media.AudioAttributes;
import p.f5j1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(f5j1 f5j1Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) f5j1Var.g(1, audioAttributesImplApi21.a);
        audioAttributesImplApi21.b = f5j1Var.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, f5j1 f5j1Var) {
        f5j1Var.getClass();
        f5j1Var.k(1, audioAttributesImplApi21.a);
        f5j1Var.j(audioAttributesImplApi21.b, 2);
    }
}
