package p;

import com.spotify.playbacknative.AudioEffectsListener;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g48 {
    public final AudioEffectsListener a;
    public final AtomicInteger b = new AtomicInteger(0);
    public final ArrayList c = new ArrayList();
    public final f48 d = new f48(this);

    public g48(AudioEffectsListener audioEffectsListener) {
        this.a = audioEffectsListener;
    }
}
