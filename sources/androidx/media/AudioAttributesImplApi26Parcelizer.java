package androidx.media;

import android.media.AudioAttributes;
import p.f5j1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(f5j1 f5j1Var) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) f5j1Var.g(1, audioAttributesImplApi26.a);
        audioAttributesImplApi26.b = f5j1Var.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, f5j1 f5j1Var) {
        f5j1Var.getClass();
        f5j1Var.k(1, audioAttributesImplApi26.a);
        f5j1Var.j(audioAttributesImplApi26.b, 2);
    }
}
