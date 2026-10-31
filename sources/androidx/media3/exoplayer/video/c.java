package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.SystemClock;
import android.view.Surface;
import p.bhn0;
import p.dm5;
import p.rdd1;
import p.x1c;
import p.zoi1;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class c {
    public final b a;
    public final e b;
    public final long c;
    public boolean d;
    public long g;
    public boolean i;
    public boolean l;
    public boolean m;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public float j = 1.0f;
    public rdd1 k = rdd1.a;

    public c(Context context, b bVar, long j) {
        this.a = bVar;
        this.c = j;
        this.b = new e(context);
    }

    public final int a(long j, long j2, long j3, long j4, boolean z, boolean z2, long j5, long j6, x1c x1cVar) {
        long j7;
        boolean z3;
        long j8;
        long j9;
        long j10;
        long j11;
        float f;
        float f2;
        x1cVar.a = -9223372036854775807L;
        x1cVar.b = -9223372036854775807L;
        boolean z4 = this.d;
        if (z4 && this.f == -9223372036854775807L) {
            this.f = j2;
        }
        long jW = (long) ((j - j2) / ((double) this.j));
        if (z4) {
            this.k.getClass();
            jW -= zoi1.W(SystemClock.elapsedRealtime()) - j3;
        }
        x1cVar.a = jW;
        if (!z || z2) {
            if (this.l) {
                if (this.h == -9223372036854775807L || this.i) {
                    int i = this.e;
                    if (i != 0) {
                        if (i == 1) {
                            j7 = -9223372036854775807L;
                        } else if (i == 2) {
                            j7 = -9223372036854775807L;
                            if (j2 < j4) {
                                z3 = false;
                            }
                        } else {
                            if (i != 3) {
                                bhn0.w();
                                return 0;
                            }
                            this.k.getClass();
                            j7 = -9223372036854775807L;
                            long jW2 = zoi1.W(SystemClock.elapsedRealtime()) - this.g;
                            if (this.d) {
                                long j12 = this.f;
                                if (j12 == -9223372036854775807L || j12 == j2 || jW >= -30000 || jW2 <= 100000) {
                                }
                            }
                            z3 = false;
                        }
                        z3 = true;
                    } else {
                        j7 = -9223372036854775807L;
                        z3 = this.d;
                    }
                } else {
                    z3 = false;
                    j7 = -9223372036854775807L;
                }
                if (z3) {
                    return 0;
                }
                if (!this.d || j2 == this.f) {
                    return 5;
                }
                this.k.getClass();
                long jNanoTime = System.nanoTime();
                e eVar = this.b;
                long j13 = (x1cVar.a * 1000) + jNanoTime;
                long j14 = eVar.n;
                if (j != j14) {
                    eVar.o = eVar.l;
                    eVar.f6p = eVar.m;
                    eVar.q = j14;
                    eVar.j = eVar.k;
                }
                long j15 = eVar.o;
                if (j15 != -1) {
                    if (j5 != j7) {
                        f = (j6 - j15) * j5;
                        f2 = eVar.h;
                    } else {
                        f = (j - eVar.q) * 1000;
                        f2 = eVar.h;
                    }
                    long j16 = eVar.f6p + ((long) (f / f2));
                    if (Math.abs(j13 - j16) <= 20000000) {
                        j13 = j16;
                    } else {
                        eVar.b();
                    }
                }
                eVar.l = j6;
                eVar.m = j13;
                eVar.n = j;
                VideoFrameReleaseHelper$VSyncSampler videoFrameReleaseHelper$VSyncSampler = eVar.c;
                if (videoFrameReleaseHelper$VSyncSampler != null) {
                    long j17 = videoFrameReleaseHelper$VSyncSampler.sampledVsyncTimeNs;
                    long j18 = eVar.c.vsyncDurationNs;
                    if (j17 != j7 && j18 != j7) {
                        long j19 = (((j13 - j17) / j18) * j18) + j17;
                        if (j13 <= j19) {
                            j8 = j19 - j18;
                        } else {
                            j19 += j18;
                            j8 = j19;
                        }
                        long j20 = j19 - j13;
                        long j21 = j13 - j8;
                        long jAbs = Math.abs(j20 - j21);
                        if (jAbs < j18 / 2) {
                            j10 = j18;
                            long j22 = j10 / 4;
                            j9 = j8;
                            if (jAbs < j22) {
                                j11 = eVar.j;
                                if (j11 != 0) {
                                    eVar.k = j11;
                                } else {
                                    if (j20 < j21) {
                                        j22 = -j22;
                                    }
                                    eVar.k = j22;
                                    j11 = j22;
                                }
                            } else {
                                j11 = 0;
                                eVar.k = 0L;
                            }
                        } else {
                            j9 = j8;
                            j10 = j18;
                            j11 = eVar.j;
                            eVar.k = j11;
                        }
                        if (j20 + j11 >= j21) {
                            j19 = j9;
                        }
                        j13 = j19 - ((j10 * 80) / 100);
                    }
                }
                x1cVar.b = j13;
                long j23 = (j13 - jNanoTime) / 1000;
                x1cVar.a = j23;
                boolean z5 = (this.h == j7 || this.i) ? false : true;
                if (this.a.g1(j23, j2, j3, z2, z5)) {
                    return 4;
                }
                long j24 = x1cVar.a;
                if (j24 >= -30000 || z2) {
                    return j24 > 50000 ? 5 : 1;
                }
                return z5 ? 3 : 2;
            }
            if (this.a.g1(jW, j2, j3, z2, true)) {
                return 4;
            }
            if (!this.d || x1cVar.a >= 30000) {
                this.m = true;
                return 5;
            }
        }
        return 3;
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (this.m && !this.l))) {
            this.h = -9223372036854775807L;
            return true;
        }
        if (this.h == -9223372036854775807L) {
            return false;
        }
        this.k.getClass();
        if (SystemClock.elapsedRealtime() < this.h) {
            return true;
        }
        this.h = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        long jElapsedRealtime;
        this.i = z;
        long j = this.c;
        if (j > 0) {
            this.k.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime() + j;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.h = jElapsedRealtime;
    }

    public final void d() {
        this.d = true;
        this.k.getClass();
        this.g = zoi1.W(SystemClock.elapsedRealtime());
        e eVar = this.b;
        eVar.d = true;
        eVar.b();
        if (!eVar.b) {
            VideoFrameReleaseHelper$VSyncSampler videoFrameReleaseHelper$VSyncSamplerMaybeBuildInstance = VideoFrameReleaseHelper$VSyncSampler.maybeBuildInstance(eVar.a);
            eVar.c = videoFrameReleaseHelper$VSyncSamplerMaybeBuildInstance;
            if (videoFrameReleaseHelper$VSyncSamplerMaybeBuildInstance != null) {
                videoFrameReleaseHelper$VSyncSamplerMaybeBuildInstance.listener = null;
            }
            eVar.b = true;
        }
        VideoFrameReleaseHelper$VSyncSampler videoFrameReleaseHelper$VSyncSampler = eVar.c;
        if (videoFrameReleaseHelper$VSyncSampler != null) {
            videoFrameReleaseHelper$VSyncSampler.register();
        }
        eVar.c(false);
    }

    public final void e(int i) {
        if (i == 0) {
            this.e = 1;
        } else if (i == 1) {
            this.e = 0;
        } else {
            if (i != 2) {
                bhn0.w();
                return;
            }
            this.e = Math.min(this.e, 2);
        }
        this.b.b();
    }

    public final void f(Surface surface) {
        this.l = surface != null;
        this.m = false;
        e eVar = this.b;
        if (eVar.e != surface) {
            eVar.a();
            eVar.e = surface;
            eVar.c(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void g(float f) {
        dm5.m(f > 0.0f);
        if (f == this.j) {
            return;
        }
        this.j = f;
        e eVar = this.b;
        eVar.h = f;
        eVar.c(false);
    }
}
