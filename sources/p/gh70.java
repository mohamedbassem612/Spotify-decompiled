package p;

import android.os.IInterface;
import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public interface gh70 extends IInterface {
    void W0(PlaybackStateCompat playbackStateCompat);

    void onRepeatModeChanged(int i);

    void onShuffleModeChanged(int i);
}
