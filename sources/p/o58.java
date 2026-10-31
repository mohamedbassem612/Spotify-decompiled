package p;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import androidx.media3.exoplayer.audio.AudioOutput$WriteException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o58 {
    public static final Object r = new Object();
    public static ScheduledExecutorService s;
    public static int t;
    public final AudioTrack a;
    public final px7 b;
    public final ps7 c;
    public yu3 d;
    public final s58 e;
    public final boolean f;
    public final int g;
    public final n58 h;
    public final h9d0 i = new h9d0(Thread.currentThread());
    public boolean j;
    public long k;
    public long l;
    public long m;
    public ByteBuffer n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f106p;
    public int q;

    public o58(AudioTrack audioTrack, px7 px7Var, ps7 ps7Var, rdd1 rdd1Var) {
        int iZ;
        this.a = audioTrack;
        this.b = px7Var;
        this.c = ps7Var;
        int i = px7Var.a;
        boolean zP = zoi1.P(i);
        this.f = zP;
        if (zP) {
            iZ = zoi1.z(i) * Integer.bitCount(px7Var.c);
            this.g = iZ;
        } else {
            iZ = -1;
            this.g = -1;
        }
        this.e = new s58(new ymm0(this, (byte) 25), rdd1Var, audioTrack, px7Var.a, iZ, px7Var.f);
        if (ps7Var != null) {
            this.d = new yu3(audioTrack, ps7Var);
        }
        this.h = c() ? new n58(this) : null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00da  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x0105  */
    /* JADX WARN: Code duplicated, block: B:43:0x010d  */
    /* JADX WARN: Code duplicated, block: B:46:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0130  */
    /* JADX WARN: Code duplicated, block: B:51:0x013a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0151  */
    /* JADX WARN: Code duplicated, block: B:55:0x0158  */
    /* JADX WARN: Code duplicated, block: B:57:0x0186  */
    /* JADX WARN: Code duplicated, block: B:58:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0215  */
    /* JADX WARN: Code duplicated, block: B:63:0x021c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0221  */
    /* JADX WARN: Code duplicated, block: B:67:0x022e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0232  */
    /* JADX WARN: Code duplicated, block: B:71:0x0235  */
    /* JADX WARN: Code duplicated, block: B:73:0x0238 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x023c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0242 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0244  */
    /* JADX WARN: Code duplicated, block: B:79:0x024a  */
    /* JADX WARN: Code duplicated, block: B:81:0x024d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0252 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0254  */
    /* JADX WARN: Code duplicated, block: B:86:0x025d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0288  */
    /* JADX WARN: Code duplicated, block: B:89:0x028d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0297  */
    /* JADX WARN: Code duplicated, block: B:92:0x029c  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:94:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:96:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:98:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c9  */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0186, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x01d6, please report this as an issue */
    public final long a() {
        s58 s58Var;
        rdd1 rdd1Var;
        int i;
        AudioTrack audioTrack;
        long j;
        s58 s58Var2;
        long jB;
        byte b;
        long j2;
        long j3;
        boolean z;
        float f;
        long jB2;
        i58 i58Var;
        i58 i58Var2;
        int i2;
        AudioTimestamp audioTimestamp;
        boolean timestamp;
        AudioTimestamp audioTimestamp2;
        i58 i58Var3;
        byte b2;
        byte b3;
        AudioTimestamp audioTimestamp3;
        long j4;
        long j5;
        long j6;
        long jH;
        i58 i58Var4;
        ymm0 ymm0Var;
        long j7;
        long jH2;
        long j8;
        long j9;
        Method method;
        Method method2;
        long jB3 = b();
        s58 s58Var3 = this.e;
        rdd1 rdd1Var2 = s58Var3.b;
        int i3 = s58Var3.e;
        j58 j58Var = s58Var3.h;
        AudioTrack audioTrack2 = s58Var3.d;
        if (audioTrack2.getPlayState() == 3) {
            long[] jArr = s58Var3.c;
            rdd1Var2.getClass();
            j = 1000;
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - s58Var3.l >= 30000) {
                long jE0 = zoi1.e0(i3, s58Var3.a());
                if (jE0 == 0) {
                    jB3 = jB3;
                    s58Var = s58Var3;
                    rdd1Var = rdd1Var2;
                    i = i3;
                    audioTrack = audioTrack2;
                } else {
                    jArr[s58Var3.s] = zoi1.J(s58Var3.i, jE0) - jNanoTime;
                    s58Var3.s = (s58Var3.s + 1) % 10;
                    int i4 = s58Var3.t;
                    if (i4 < 10) {
                        s58Var3.t = i4 + 1;
                    }
                    s58Var3.l = jNanoTime;
                    s58Var3.k = 0L;
                    int i5 = 0;
                    while (true) {
                        int i6 = s58Var3.t;
                        if (i5 >= i6) {
                            break;
                        }
                        s58Var3.k = (jArr[i5] / ((long) i6)) + s58Var3.k;
                        i5++;
                    }
                    j2 = s58Var3.n;
                    if (s58Var3.g || (method = s58Var3.m) == null || jNanoTime - s58Var3.o < 500000) {
                        j3 = 500000;
                    } else {
                        try {
                            Integer num = (Integer) method.invoke(audioTrack2, null);
                            String str = zoi1.a;
                            j3 = 500000;
                            try {
                                long jIntValue = (((long) num.intValue()) * 1000) - s58Var3.f;
                                s58Var3.n = jIntValue;
                                long jMax = Math.max(jIntValue, 0L);
                                s58Var3.n = jMax;
                                if (jMax > 10000000) {
                                    oon1.H("Ignoring impossibly large audio latency: " + jMax);
                                    s58Var3.n = 0L;
                                }
                            } catch (Exception unused) {
                                method2 = null;
                                s58Var3.m = method2;
                            }
                        } catch (Exception unused2) {
                            j3 = 500000;
                            method2 = null;
                        }
                        s58Var3.o = jNanoTime;
                    }
                    if (j2 != s58Var3.n) {
                        z = true;
                    } else {
                        z = false;
                    }
                    f = s58Var3.i;
                    jB2 = s58Var3.b(jNanoTime);
                    i58Var = j58Var.a;
                    i58Var2 = j58Var.a;
                    i2 = j58Var.b;
                    if (z) {
                        rdd1Var = rdd1Var2;
                        audioTrack = audioTrack2;
                    } else {
                        audioTrack = audioTrack2;
                        rdd1Var = rdd1Var2;
                        if (jNanoTime - j58Var.g < j58Var.f) {
                            jB3 = jB3;
                            s58Var = s58Var3;
                            i = i3;
                        }
                    }
                    j58Var.g = jNanoTime;
                    AudioTrack audioTrack3 = i58Var.a;
                    audioTimestamp = i58Var.b;
                    timestamp = audioTrack3.getTimestamp(audioTimestamp);
                    if (timestamp) {
                        j8 = audioTimestamp.framePosition;
                        j9 = i58Var.d;
                        if (j9 > j8) {
                            if (i58Var.f) {
                                i58Var.g += j9;
                                i58Var.f = false;
                            } else {
                                i58Var.c++;
                            }
                        }
                        i58Var.d = j8;
                        i58Var.e = j8 + i58Var.g + (i58Var.c << 32);
                    }
                    if (timestamp != 0) {
                        ymm0Var = j58Var.c;
                        j7 = audioTimestamp.nanoTime / 1000;
                        i = i3;
                        audioTimestamp2 = audioTimestamp;
                        jH2 = zoi1.H(f, jNanoTime - (i58Var2.b.nanoTime / 1000)) + zoi1.e0(i2, i58Var2.e);
                        if (Math.abs(j7 - jNanoTime) > 5000000) {
                            long j10 = i58Var.e;
                            ymm0Var.getClass();
                            s58Var = s58Var3;
                            String str2 = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j7 + ", " + jNanoTime + ", " + jB2 + ", " + ((o58) ymm0Var.b).b();
                            HashSet hashSet = hph0.a;
                            oon1.H(str2);
                            b2 = 4;
                            j58Var.a(4);
                            i58Var3 = i58Var2;
                        } else {
                            s58Var = s58Var3;
                            if (Math.abs(jH2 - jB2) > 5000000) {
                                long j11 = i58Var.e;
                                ymm0Var.getClass();
                                i58Var3 = i58Var2;
                                String str3 = "Spurious audio timestamp (frame position mismatch): " + j11 + ", " + j7 + ", " + jNanoTime + ", " + jB2 + ", " + ((o58) ymm0Var.b).b();
                                HashSet hashSet2 = hph0.a;
                                oon1.H(str3);
                                b2 = 4;
                                j58Var.a(4);
                            } else {
                                i58Var3 = i58Var2;
                                b2 = 4;
                                if (j58Var.d == 4) {
                                    j58Var.a(0);
                                }
                            }
                        }
                    } else {
                        s58Var = s58Var3;
                        audioTimestamp2 = audioTimestamp;
                        i = i3;
                        i58Var3 = i58Var2;
                        b2 = 4;
                    }
                    b3 = j58Var.d;
                    if (b3 != 0) {
                        audioTimestamp3 = audioTimestamp2;
                        if (timestamp != 0) {
                            j4 = audioTimestamp3.nanoTime;
                            if (j4 / 1000 >= j58Var.e) {
                                j58Var.h = i58Var.e;
                                j58Var.i = j4 / 1000;
                                j58Var.a(1);
                            }
                        } else if (jNanoTime - j58Var.e > j3) {
                            j58Var.a(3);
                        }
                    } else if (b3 != 1) {
                        if (b3 != 2) {
                            if (b3 != 3) {
                                if (b3 != b2) {
                                    bhn0.w();
                                    return 0L;
                                }
                            } else if (timestamp) {
                                j58Var.a(0);
                            }
                        } else if (timestamp == 0) {
                            j58Var.a(0);
                        }
                    } else if (timestamp != 0) {
                        j5 = i58Var.e;
                        j6 = j58Var.h;
                        if (j5 <= j6) {
                            jH = zoi1.H(f, jNanoTime - j58Var.i) + zoi1.e0(i2, j6);
                            i58Var4 = i58Var3;
                            if (Math.abs((zoi1.H(f, jNanoTime - (i58Var4.b.nanoTime / 1000)) + zoi1.e0(i2, i58Var4.e)) - jH) < 1000) {
                                j58Var.a(2);
                            } else if (jNanoTime - j58Var.e > 2000000) {
                                j58Var.a(3);
                            } else {
                                j58Var.h = i58Var.e;
                                j58Var.i = audioTimestamp2.nanoTime / 1000;
                            }
                        } else if (jNanoTime - j58Var.e > 2000000) {
                            j58Var.a(3);
                        } else {
                            j58Var.h = i58Var.e;
                            j58Var.i = audioTimestamp2.nanoTime / 1000;
                        }
                    } else {
                        j58Var.a(0);
                    }
                }
            } else {
                j2 = s58Var3.n;
                if (s58Var3.g) {
                    j3 = 500000;
                } else {
                    j3 = 500000;
                }
                if (j2 != s58Var3.n) {
                    z = true;
                } else {
                    z = false;
                }
                f = s58Var3.i;
                jB2 = s58Var3.b(jNanoTime);
                i58Var = j58Var.a;
                i58Var2 = j58Var.a;
                i2 = j58Var.b;
                if (z) {
                    audioTrack = audioTrack2;
                    rdd1Var = rdd1Var2;
                    if (jNanoTime - j58Var.g < j58Var.f) {
                        jB3 = jB3;
                        s58Var = s58Var3;
                        i = i3;
                    }
                } else {
                    rdd1Var = rdd1Var2;
                    audioTrack = audioTrack2;
                }
                j58Var.g = jNanoTime;
                AudioTrack audioTrack4 = i58Var.a;
                audioTimestamp = i58Var.b;
                timestamp = audioTrack4.getTimestamp(audioTimestamp);
                if (timestamp) {
                    j8 = audioTimestamp.framePosition;
                    j9 = i58Var.d;
                    if (j9 > j8) {
                        if (i58Var.f) {
                            i58Var.g += j9;
                            i58Var.f = false;
                        } else {
                            i58Var.c++;
                        }
                    }
                    i58Var.d = j8;
                    i58Var.e = j8 + i58Var.g + (i58Var.c << 32);
                }
                if (timestamp != 0) {
                    ymm0Var = j58Var.c;
                    j7 = audioTimestamp.nanoTime / 1000;
                    i = i3;
                    audioTimestamp2 = audioTimestamp;
                    jH2 = zoi1.H(f, jNanoTime - (i58Var2.b.nanoTime / 1000)) + zoi1.e0(i2, i58Var2.e);
                    if (Math.abs(j7 - jNanoTime) > 5000000) {
                        long j12 = i58Var.e;
                        ymm0Var.getClass();
                        s58Var = s58Var3;
                        String str4 = "Spurious audio timestamp (system clock mismatch): " + j12 + ", " + j7 + ", " + jNanoTime + ", " + jB2 + ", " + ((o58) ymm0Var.b).b();
                        HashSet hashSet3 = hph0.a;
                        oon1.H(str4);
                        b2 = 4;
                        j58Var.a(4);
                        i58Var3 = i58Var2;
                    } else {
                        s58Var = s58Var3;
                        if (Math.abs(jH2 - jB2) > 5000000) {
                            long j13 = i58Var.e;
                            ymm0Var.getClass();
                            i58Var3 = i58Var2;
                            String str5 = "Spurious audio timestamp (frame position mismatch): " + j13 + ", " + j7 + ", " + jNanoTime + ", " + jB2 + ", " + ((o58) ymm0Var.b).b();
                            HashSet hashSet4 = hph0.a;
                            oon1.H(str5);
                            b2 = 4;
                            j58Var.a(4);
                        } else {
                            i58Var3 = i58Var2;
                            b2 = 4;
                            if (j58Var.d == 4) {
                                j58Var.a(0);
                            }
                        }
                    }
                } else {
                    s58Var = s58Var3;
                    audioTimestamp2 = audioTimestamp;
                    i = i3;
                    i58Var3 = i58Var2;
                    b2 = 4;
                }
                b3 = j58Var.d;
                if (b3 != 0) {
                    audioTimestamp3 = audioTimestamp2;
                    if (timestamp != 0) {
                        j4 = audioTimestamp3.nanoTime;
                        if (j4 / 1000 >= j58Var.e) {
                            j58Var.h = i58Var.e;
                            j58Var.i = j4 / 1000;
                            j58Var.a(1);
                        }
                    } else if (jNanoTime - j58Var.e > j3) {
                        j58Var.a(3);
                    }
                } else if (b3 != 1) {
                    if (b3 != 2) {
                        if (b3 != 3) {
                            if (b3 != b2) {
                                bhn0.w();
                                return 0L;
                            }
                        } else if (timestamp) {
                            j58Var.a(0);
                        }
                    } else if (timestamp == 0) {
                        j58Var.a(0);
                    }
                } else if (timestamp != 0) {
                    j5 = i58Var.e;
                    j6 = j58Var.h;
                    if (j5 <= j6) {
                        jH = zoi1.H(f, jNanoTime - j58Var.i) + zoi1.e0(i2, j6);
                        i58Var4 = i58Var3;
                        if (Math.abs((zoi1.H(f, jNanoTime - (i58Var4.b.nanoTime / 1000)) + zoi1.e0(i2, i58Var4.e)) - jH) < 1000) {
                            j58Var.a(2);
                        } else if (jNanoTime - j58Var.e > 2000000) {
                            j58Var.a(3);
                        } else {
                            j58Var.h = i58Var.e;
                            j58Var.i = audioTimestamp2.nanoTime / 1000;
                        }
                    } else if (jNanoTime - j58Var.e > 2000000) {
                        j58Var.a(3);
                    } else {
                        j58Var.h = i58Var.e;
                        j58Var.i = audioTimestamp2.nanoTime / 1000;
                    }
                } else {
                    j58Var.a(0);
                }
            }
        } else {
            jB3 = jB3;
            s58Var = s58Var3;
            rdd1Var = rdd1Var2;
            i = i3;
            audioTrack = audioTrack2;
            j = 1000;
        }
        rdd1Var.getClass();
        long jNanoTime2 = System.nanoTime() / j;
        boolean z2 = j58Var.d == 2;
        if (z2) {
            s58Var2 = s58Var;
            float f2 = s58Var2.i;
            i58 i58Var5 = j58Var.a;
            jB = zoi1.H(f2, jNanoTime2 - (i58Var5.b.nanoTime / j)) + zoi1.e0(j58Var.b, i58Var5.e);
        } else {
            s58Var2 = s58Var;
            jB = s58Var2.b(jNanoTime2);
        }
        long jK = jB;
        long jE1 = zoi1.e0(i, jB3);
        if (jK >= jE1) {
            s58Var2.e();
            j58Var.a(0);
            return jE1;
        }
        int playState = audioTrack.getPlayState();
        if (playState == 3) {
            if (z2 || ((b = j58Var.d) != 0 && b != 1)) {
                s58Var2.d(jK);
            }
            long j14 = s58Var2.z;
            if (j14 != -9223372036854775807L) {
                long j15 = jK - s58Var2.y;
                long jH3 = zoi1.H(s58Var2.i, jNanoTime2 - j14);
                long j16 = s58Var2.y + jH3;
                long jAbs = Math.abs(j16 - jK);
                if (j15 != 0 && jAbs < 1000000) {
                    long j17 = (jH3 * 10) / 100;
                    jK = zoi1.k(jK, j16 - j17, j16 + j17);
                }
            }
            s58Var2.z = jNanoTime2;
            s58Var2.y = jK;
        } else if (playState == 1) {
            s58Var2.d(jK);
        }
        return jK;
    }

    public final long b() {
        if (!this.f) {
            return this.l;
        }
        long j = this.k;
        long j2 = this.g;
        String str = zoi1.a;
        return ((j + j2) - 1) / j2;
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT >= 29 && this.a.isOffloadedPlayback();
    }

    public final void d(int i, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.a.setOffloadDelayPadding(i, i2);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        AudioTrack audioTrack = this.a;
        if (audioTrack.getPlayState() != 3) {
            return;
        }
        audioTrack.setOffloadEndOfStream();
        s58 s58Var = this.e;
        s58Var.A = true;
        s58Var.h.a.f = true;
    }

    public final void f(dbu0 dbu0Var) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        LogSessionId logSessionIdA = dbu0Var.a();
        if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.a.setLogSessionId(logSessionIdA);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    public final boolean g(int i, long j, ByteBuffer byteBuffer) {
        int iWrite;
        boolean z;
        ps7 ps7Var;
        r58 r58Var;
        tp7 tp7Var;
        long j2 = j;
        px7 px7Var = this.b;
        boolean z2 = this.f;
        if (!z2 && this.f106p == 0) {
            this.f106p = ygr.i(byteBuffer, px7Var.a);
        }
        h9d0 h9d0Var = this.i;
        h9d0Var.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = (Thread) h9d0Var.c;
        byte b = 26;
        AudioTrack audioTrack = this.a;
        if (threadCurrentThread == thread) {
            b();
            int underrunCount = audioTrack.getUnderrunCount();
            boolean z3 = underrunCount > this.q;
            this.q = underrunCount;
            if (z3) {
                h9d0Var.h(-1, new um5(b));
            }
        }
        int iRemaining = byteBuffer.remaining();
        if (px7Var.d) {
            if (j2 == Long.MIN_VALUE) {
                j2 = this.m;
            } else {
                this.m = j2;
            }
            int iRemaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                iWrite = audioTrack.write(byteBuffer, iRemaining2, 1, 1000 * j2);
            } else {
                if (this.n == null) {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                    this.n = byteBufferAllocate;
                    byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                    this.n.putInt(1431633921);
                }
                if (this.o == 0) {
                    this.n.putInt(4, iRemaining2);
                    this.n.putLong(8, j2 * 1000);
                    this.n.position(0);
                    this.o = iRemaining2;
                }
                int iRemaining3 = this.n.remaining();
                if (iRemaining3 <= 0) {
                    iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                    if (iWrite < 0) {
                        this.o = 0;
                    } else {
                        this.o -= iWrite;
                    }
                } else {
                    int iWrite2 = audioTrack.write(this.n, iRemaining3, 1);
                    if (iWrite2 < 0) {
                        this.o = 0;
                        iWrite = iWrite2;
                    } else if (iWrite2 < iRemaining3) {
                        iWrite = 0;
                    } else {
                        iWrite = audioTrack.write(byteBuffer, iRemaining2, 1);
                        if (iWrite < 0) {
                            this.o = 0;
                        } else {
                            this.o -= iWrite;
                        }
                    }
                }
            }
        } else {
            iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (iWrite >= 0) {
            z = iWrite == iRemaining;
            if (z2) {
                this.k += (long) iWrite;
                return z;
            }
            if (z) {
                this.l = (((long) this.f106p) * ((long) i)) + this.l;
            }
            return z;
        }
        z = iWrite == -6 || iWrite == -32;
        if (z && (ps7Var = this.c) != null && (tp7Var = (r58Var = (r58) ps7Var.b).h) != null) {
            qp7 qp7Var = qp7.f;
            r58Var.g = qp7Var;
            tp7Var.h(qp7Var);
        }
        throw new AudioOutput$WriteException(iWrite, z);
    }
}
