package p;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class oo7 {
    public static void a(AudioAttributes.Builder builder, boolean z) {
        builder.setIsContentSpatialized(z);
    }

    public static void b(AudioAttributes.Builder builder, int i) {
        builder.setSpatializationBehavior(i);
    }
}
