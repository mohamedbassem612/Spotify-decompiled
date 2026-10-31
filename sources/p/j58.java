package p;

import android.media.AudioTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j58 {
    public final i58 a;
    public final int b;
    public final ymm0 c;
    public byte d;
    public long e;
    public int f;
    public long g;
    public long h;
    public long i;

    public j58(AudioTrack audioTrack, ymm0 ymm0Var) {
        this.a = new i58(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = ymm0Var;
        a(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        this.d = i;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = 10000;
            return;
        }
        if (i == 1) {
            this.f = 10000;
            return;
        }
        if (i == 2 || i == 3) {
            this.f = 10000000;
        } else if (i == 4) {
            this.f = 500000;
        } else {
            bhn0.w();
        }
    }
}
