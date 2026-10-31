package androidx.media;

import p.f5j1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(f5j1 f5j1Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = f5j1Var.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = f5j1Var.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = f5j1Var.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = f5j1Var.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, f5j1 f5j1Var) {
        f5j1Var.getClass();
        f5j1Var.j(audioAttributesImplBase.a, 1);
        f5j1Var.j(audioAttributesImplBase.b, 2);
        f5j1Var.j(audioAttributesImplBase.c, 3);
        f5j1Var.j(audioAttributesImplBase.d, 4);
    }
}
