package p;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s58 {
    public boolean A;
    public long B;
    public final ymm0 a;
    public final rdd1 b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final j58 h;
    public float i;
    public long j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f130p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public s58(ymm0 ymm0Var, rdd1 rdd1Var, AudioTrack audioTrack, int i, int i2, int i3) {
        this.a = ymm0Var;
        this.b = rdd1Var;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.h = new j58(audioTrack, ymm0Var);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean zP = zoi1.P(i);
        this.g = zP;
        this.f = zP ? zoi1.e0(sampleRate, i3 / i2) : -9223372036854775807L;
        this.q = 0L;
        this.r = 0L;
        this.A = false;
        this.B = 0L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.o = 0L;
        this.n = 0L;
        this.i = 1.0f;
        this.j = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    public final long a() {
        long j;
        if (this.u != -9223372036854775807L) {
            return Math.min(this.x, c());
        }
        this.b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f130p >= 5) {
            AudioTrack audioTrack = this.d;
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    j = this.q;
                    if (j > playbackHeadPosition) {
                        if (this.A) {
                            this.B += j;
                            this.A = false;
                        } else {
                            this.r++;
                        }
                    }
                    this.q = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.q <= 0 || playState != 3) {
                    this.v = -9223372036854775807L;
                    j = this.q;
                    if (j > playbackHeadPosition) {
                        if (this.A) {
                            this.B += j;
                            this.A = false;
                        } else {
                            this.r++;
                        }
                    }
                    this.q = playbackHeadPosition;
                } else if (this.v == -9223372036854775807L) {
                    this.v = jElapsedRealtime;
                }
            }
            this.f130p = jElapsedRealtime;
        }
        return this.q + this.B + (this.r << 32);
    }

    public final long b(long j) {
        long jH;
        int i = this.t;
        int i2 = this.e;
        if (i == 0) {
            jH = this.u != -9223372036854775807L ? zoi1.e0(i2, c()) : zoi1.e0(i2, a());
        } else {
            jH = zoi1.H(this.i, j + this.k);
        }
        long jMax = Math.max(0L, jH - this.n);
        return this.u != -9223372036854775807L ? Math.min(zoi1.e0(i2, this.x), jMax) : jMax;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.w;
        }
        this.b.getClass();
        return this.w + zoi1.t(this.e, zoi1.H(this.i, zoi1.W(SystemClock.elapsedRealtime()) - this.u));
    }

    public final void d(long j) {
        long j2 = this.j;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long J = zoi1.J(this.i, j - j2);
        this.b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - zoi1.n0(J);
        this.j = -9223372036854775807L;
        h9d0 h9d0Var = ((o58) this.a.b).i;
        h9d0Var.getClass();
        if (Thread.currentThread() == ((Thread) h9d0Var.c)) {
            h9d0Var.h(-1, new l58(jCurrentTimeMillis));
        }
    }

    public final void e() {
        this.k = 0L;
        this.t = 0;
        this.s = 0;
        this.l = 0L;
        this.y = -9223372036854775807L;
        this.z = -9223372036854775807L;
    }
}
