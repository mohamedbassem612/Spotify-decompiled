package p;

import com.spotify.playbacknative.AudioDriver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class im61 {
    public int a;
    public final int[] b = new int[10];

    public final int a() {
        return (this.a & 16) != 0 ? this.b[4] : AudioDriver.SPOTIFY_MAX_VOLUME;
    }

    public final void b(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return;
            }
            this.a = (1 << i) | this.a;
            iArr[i] = i2;
        }
    }
}
