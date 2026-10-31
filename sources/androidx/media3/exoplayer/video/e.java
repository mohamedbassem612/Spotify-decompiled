package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e {
    public final Context a;
    public boolean b;
    public VideoFrameReleaseHelper$VSyncSampler c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h = 1.0f;
    public int i = 0;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f6p;
    public long q;

    public e(Context context) {
        this.a = context;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.i == Integer.MIN_VALUE || this.g == 0.0f || !surface.isValid()) {
            return;
        }
        this.g = 0.0f;
        VideoFrameReleaseHelper$Api30.setSurfaceFrameRate(this.e, 0.0f);
    }

    public final void b() {
        this.o = -1L;
        this.l = -1L;
        this.n = -9223372036854775807L;
        this.j = 0L;
        this.k = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    public final void c(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.i == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.d) {
            float f2 = this.f;
            if (f2 != -1.0f) {
                f = f2 * this.h;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.g != f) {
            this.g = f;
            VideoFrameReleaseHelper$Api30.setSurfaceFrameRate(this.e, f);
        }
    }
}
