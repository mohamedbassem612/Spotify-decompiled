package p;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.exoplayer.ExoTimeoutException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.video.MediaCodecVideoDecoderException;
import com.google.android.video.exo.NetworkAccessWhileInOfflineModeException;
import com.spotify.base.java.logging.Logger;
import com.spotify.betamax.common.SunsetUpgradeRequiredException;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.betamax.player.exception.BetamaxException;
import com.spotify.betamax.player.exception.BetamaxPlaybackException;
import com.spotify.betamax.player.exception.ManifestLoadException;
import com.spotify.betamax.player.exception.UnplayablePlaybackException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p3u0 implements r590 {
    public final um51 N0;
    public final boolean O0;
    public final o2p P0;
    public final boolean Q0;
    public final cuw R0;
    public final boolean S0;
    public int U0;
    public BetamaxException V0;
    public Long W0;
    public final boolean X;
    public boolean X0;
    public final llm Y;
    public final boolean Z;
    public volatile boolean Z0;
    public final yqg a;
    public volatile boolean a1;
    public final g06 b;
    public boolean b1;
    public final q590 c;
    public long c1;
    public final yna d;
    public long d1;
    public final kma e;
    public long e1;
    public final yfu f;
    public boolean f1;
    public final z77 g;
    public final lgy h;
    public final m0u0 i;
    public boolean i1;
    public nn51 l1;
    public sm51 m1;
    public List o1;
    public List p1;
    public hpc1 q1;
    public Locale r1;
    public boolean s1;
    public final oot0 t;
    public y1k1 t1;
    public boolean u1;
    public int v1;
    public int x1;
    public int T0 = 1;
    public boolean Y0 = true;
    public final b8p1 g1 = new b8p1((byte) 20);
    public final Handler h1 = new Handler(Looper.getMainLooper());
    public qeo j1 = qeo.d;
    public jgc1 k1 = jgc1.UNKNOWN;
    public int w1 = 1;
    public volatile boolean n1 = true;

    public p3u0(yqg yqgVar, g06 g06Var, q590 q590Var, yna ynaVar, kma kmaVar, yfu yfuVar, z77 z77Var, lgy lgyVar, m0u0 m0u0Var, oot0 oot0Var, boolean z, llm llmVar, boolean z2, boolean z3, um51 um51Var, boolean z4, o2p o2pVar, boolean z5, cuw cuwVar, boolean z6) {
        np00 np00Var;
        m0u0 m0u0Var2;
        lls0 lls0Var;
        c0u0 c0u0VarA;
        m0u0 m0u0Var3 = m0u0Var;
        this.a = yqgVar;
        this.b = g06Var;
        this.c = q590Var;
        this.d = ynaVar;
        this.e = kmaVar;
        this.f = yfuVar;
        this.g = z77Var;
        this.h = lgyVar;
        this.i = m0u0Var3;
        this.t = oot0Var;
        this.X = z;
        this.Y = llmVar;
        this.Z = z3;
        this.N0 = um51Var;
        this.O0 = z4;
        this.P0 = o2pVar;
        this.Q0 = z5;
        this.R0 = cuwVar;
        this.S0 = z6;
        this.e1 = yqgVar.b();
        z6x z6xVar = z6x.a;
        this.o1 = z6xVar;
        this.p1 = z6xVar;
        this.x1 = 5;
        lls0 lls0Var2 = new lls0(z2, new d3u0(this, (byte) 0), (byte) 7);
        wao0 wao0Var = new wao0(1, q590Var, q590.class, "exoPlayer", "exoPlayer(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 28);
        ArrayList<c0u0> arrayList = new ArrayList();
        np00 np00Var2 = new np00(wao0Var, (Handler) lgyVar.c);
        for (o590 o590Var : (List) lgyVar.b) {
            boolean z7 = o590Var instanceof o590;
            String str = (String) lgyVar.e;
            if (z7) {
                lls0 lls0Var3 = lls0Var2;
                np00 np00Var3 = np00Var2;
                m0u0Var2 = m0u0Var3;
                spq0 spq0VarI = o590Var.I(m0u0Var2, oot0Var, np00Var3, str, lls0Var3);
                np00Var = np00Var3;
                lls0Var = lls0Var3;
                c0u0VarA = spq0VarI.c() ? (c0u0) spq0VarI.b() : null;
            } else {
                np00Var = np00Var2;
                m0u0Var2 = m0u0Var3;
                lls0Var = lls0Var2;
                c0u0VarA = o590Var.a(m0u0Var2, oot0Var, np00Var, str);
            }
            if (c0u0VarA != null) {
                arrayList.add(c0u0VarA);
            }
            lls0Var2 = lls0Var;
            m0u0Var3 = m0u0Var2;
            np00Var2 = np00Var;
        }
        np00 np00Var4 = np00Var2;
        m0u0 m0u0Var4 = m0u0Var3;
        ((ConcurrentHashMap) lgyVar.f).put(m0u0Var4, arrayList);
        ((ConcurrentHashMap) lgyVar.g).put(m0u0Var4, np00Var4);
        hce1 hce1Var = (hce1) lgyVar.i;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) hce1Var.e;
        pjj1 pjj1Var = (pjj1) concurrentHashMap.remove(m0u0Var4);
        if (pjj1Var != null) {
            pjj1Var.a.invoke(new xaj1(pjj1Var, (byte) 13));
        }
        List listH = ((lgy) ((fgs0) hce1Var.d).b).h(m0u0Var4);
        if (!(listH instanceof Collection) || !listH.isEmpty()) {
            Iterator it = listH.iterator();
            while (it.hasNext()) {
                if (((c0u0) it.next()) instanceof n590) {
                    rjj1 rjj1Var = new rjj1(wao0Var, hce1Var, m0u0Var4);
                    concurrentHashMap.put(m0u0Var4, new pjj1(wao0Var, rjj1Var));
                    wao0Var.invoke(new xaj1(rjj1Var, (byte) 14));
                    break;
                }
            }
        }
        AtomicReference atomicReference = new AtomicReference(new loj1(0L, 0L));
        wao0Var.invoke(new fgs0(atomicReference, (byte) 27));
        zhq0 zhq0Var = new zhq0(atomicReference, wao0Var, (byte) 27);
        for (c0u0 c0u0Var : arrayList) {
            if (c0u0Var instanceof n590) {
                ((n590) c0u0Var).x(zhq0Var);
            }
        }
        h0(this.c.c());
        boolean zA = this.b.a();
        VideoSurfaceView videoSurfaceViewI0 = this.c.i0();
        if (this.S0) {
            this.c.m0(new c30(this, zA, videoSurfaceViewI0, (byte) 29));
        } else {
            this.h.D(this.i, zA, this.c.c0(), this.c.D(), videoSurfaceViewI0);
        }
        this.b.a.add(this);
        this.c.S(this);
        this.s1 = true;
    }

    public static void a0(VideoSurfaceView videoSurfaceView) {
        if (videoSurfaceView != null) {
            videoSurfaceView.setSeekFrameLoader((sm51) null);
        }
        if (videoSurfaceView != null) {
            videoSurfaceView.setOnScrubStart((Function0) null);
        }
        if (videoSurfaceView != null) {
            videoSurfaceView.setOnScrubEnd((Function0) null);
        }
    }

    public final void A0() {
        String str;
        if (this.o1.isEmpty()) {
            return;
        }
        hpc1 hpc1Var = this.q1;
        List list = this.o1;
        hpc1 hpc1Var2 = null;
        if (hpc1Var != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (u890.j(((hpc1) obj).i, hpc1Var.i)) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (!it2.hasNext()) {
                                Iterator it3 = arrayList.iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        hpc1Var2 = (hpc1) o7h.q0(arrayList);
                                        break;
                                    }
                                    hpc1Var2 = (hpc1) it3.next();
                                } while (hpc1Var.g != hpc1Var2.g);
                            } else {
                                hpc1Var2 = (hpc1) it2.next();
                            }
                        } while (!u890.j(hpc1Var.f, hpc1Var2.f));
                    } else {
                        hpc1Var2 = (hpc1) it.next();
                    }
                } while (!hpc1Var.equals(hpc1Var2));
            }
        }
        if (hpc1Var2 == null || (str = hpc1Var2.h) == null) {
            str = "";
        }
        boolean z = str.length() == 0;
        q590 q590Var = this.c;
        q590Var.k0(z);
        q590Var.G(hpc1Var2);
        if (this.S0) {
            q590Var.m0(new aft0(this, hpc1Var2, (byte) 13));
        } else {
            this.h.P(this.i, q590Var.v(), hpc1Var2);
        }
    }

    public final void B0() {
        L0(true);
    }

    public final void C(o3g1 o3g1Var) {
        b380 b380Var = o3g1Var.a;
        int size = b380Var.size();
        byte b = 0;
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = ((n3g1) b380Var.get(i2)).a;
            for (int i4 = 0; i4 < i3; i4++) {
                String str = ((n3g1) b380Var.get(i2)).b.d[i4].p;
                if (str == null) {
                    break;
                }
                if (ihc1.h0(str, "video", false)) {
                    i = 3;
                    break;
                } else {
                    if (ihc1.h0(str, "audio", false)) {
                        i = 2;
                    }
                }
            }
            if (i == 3) {
                break;
            }
        }
        if (i != 1) {
            this.w1 = i;
        }
        jgc1 jgc1Var = this.k1;
        int i5 = this.w1;
        if (this.S0) {
            this.c.m0(new l3u0(this, i5, jgc1Var, b));
        } else {
            this.h.B(this.i, i5, jgc1Var);
        }
        fn31.T(this.Y, (o8n) null, 0, new f3t0(this, jgc1Var, (lnm) null, (byte) 14), 3);
    }

    public final void C0(sqe1 sqe1Var, int i) {
        boolean z = this.S0;
        q590 q590Var = this.c;
        if (z) {
            q590Var.m0(new d3u0(this, (byte) 9));
            return;
        }
        if (q590Var.getDuration() >= 0) {
            boolean zB0 = q590Var.B0();
            m0u0 m0u0Var = this.i;
            lgy lgyVar = this.h;
            if (!zB0) {
                lgyVar.v(m0u0Var, q590Var.getDuration());
            }
            oqe1 oqe1VarM = q590Var.M();
            if (oqe1VarM != null) {
                lgyVar.L(m0u0Var, new ko51(zoi1.n0(oqe1VarM.p), zoi1.n0(oqe1VarM.m)));
            }
        }
    }

    public final void D0(Exception exc) {
        BetamaxException betamaxException;
        if (exc instanceof BetamaxException) {
            betamaxException = (BetamaxException) exc;
        } else {
            BetamaxException betamaxPlaybackException = this.V0;
            if (betamaxPlaybackException == null) {
                betamaxPlaybackException = new BetamaxPlaybackException("Error during playback", xjz.ERROR_UNKNOWN, exc);
            }
            betamaxException = betamaxPlaybackException;
        }
        boolean z = this.S0;
        q590 q590Var = this.c;
        if (z) {
            q590Var.m0(new aft0(this, betamaxException, (byte) 14));
        } else {
            this.h.x(this.i, betamaxException, q590Var.v());
        }
        q590Var.a();
        Z0(3, null, null, jap1.u());
    }

    public final void E0(boolean z) {
        if (!z || this.f1) {
            return;
        }
        boolean z2 = this.S0;
        q590 q590Var = this.c;
        if (z2) {
            q590Var.m0(new d3u0(this, (byte) 2));
        } else {
            this.h.H(this.i, q590Var.v());
        }
        this.f1 = true;
    }

    public final void F0() {
        this.b1 = false;
        L0(false);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00b3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(java.util.List r21, java.util.List r22, p.nn51 r23, p.xw7 r24, java.util.List r25, java.util.List r26, int r27, java.lang.Long r28, java.lang.Long r29, boolean r30) throws java.lang.Throwable {
        /*
            r20 = this;
            r1 = r20
            r0 = r24
            p.b8p1 r2 = r1.g1
            p.q590 r10 = r1.c
            r3 = 0
            r1.V0 = r3
            r3 = r21
            r1.o1 = r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L1b
            java.util.List r3 = r10.y()
            r1.o1 = r3
        L1b:
            r3 = r22
            r1.p1 = r3
            if (r27 != 0) goto L23
            r3 = 5
            goto L25
        L23:
            r3 = r27
        L25:
            r1.x1 = r3
            monitor-enter(r2)
            java.lang.Object r4 = r2.e     // Catch: java.lang.Throwable -> L31
            p.llb1 r4 = (p.llb1) r4     // Catch: java.lang.Throwable -> L31
            if (r4 != 0) goto L35
            r2.b = r3     // Catch: java.lang.Throwable -> L31
            goto L35
        L31:
            r0 = move-exception
            r3 = r2
            goto Lb1
        L35:
            monitor-exit(r2)
            java.util.List r3 = r1.p1
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L44
            java.util.List r3 = r10.s0()
            r1.p1 = r3
        L44:
            r1.A0()
            r1.u0()
            r3 = r23
            r1.l1 = r3
            r1.s0()
            if (r0 == 0) goto L56
            r10.r(r0)
        L56:
            boolean r0 = r1.Z
            if (r0 == 0) goto L6f
            if (r30 == 0) goto L6f
            r0 = 0
            r1.Y0 = r0
            p.g06 r0 = r1.b
            boolean r0 = r0.a()
            boolean r3 = r1.X0
            if (r3 != 0) goto L6f
            if (r0 == 0) goto L6c
            goto L6f
        L6c:
            r1.W()
        L6f:
            r3 = r2
            p.llb1 r2 = new p.llb1
            p.ix21 r0 = r3.r()
            r3 = 6
            r2.<init>(r0, r3)
            java.util.List r13 = r1.o1
            java.util.List r6 = r1.p1
            int r7 = r1.x1
            boolean r0 = r1.S0
            if (r0 == 0) goto L96
            p.j3u0 r0 = new p.j3u0
            r4 = r25
            r5 = r26
            r8 = r28
            r9 = r29
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.m0(r0)
            return
        L96:
            p.lgy r0 = r1.h
            p.m0u0 r3 = r1.i
            r0.O(r3, r2)
            p.lgy r11 = r1.h
            p.m0u0 r12 = r1.i
            r14 = r25
            r15 = r26
            r18 = r28
            r19 = r29
            r16 = r6
            r17 = r7
            r11.z(r12, r13, r14, r15, r16, r17, r18, r19)
            return
        Lb1:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb3
            throw r0
        Lb3:
            r0 = move-exception
            goto Lb1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.p3u0.G(java.util.List, java.util.List, p.nn51, p.xw7, java.util.List, java.util.List, int, java.lang.Long, java.lang.Long, boolean):void");
    }

    public final void G0() {
        q590 q590Var = this.c;
        if (q590Var.q()) {
            q590Var.a();
            if (this.S0) {
                q590Var.m0(new d3u0(this, (byte) 11));
            } else {
                this.h.C(this.i, q590Var.v());
            }
        }
    }

    public final void H(int i) {
        VideoSurfaceView videoSurfaceViewI0;
        VideoSurfaceView videoSurfaceViewI1;
        if (i == 2) {
            boolean z = this.S0;
            q590 q590Var = this.c;
            if (z) {
                q590Var.m0(new d3u0(this, (byte) 5));
            } else {
                this.h.p(this.i, q590Var.v());
            }
            VideoSurfaceView videoSurfaceViewI2 = this.c.i0();
            if (videoSurfaceViewI2 != null) {
                videoSurfaceViewI2.setCanPrefetchSeekFrames(false);
            }
            if (this.W0 != null) {
                if (videoSurfaceViewI2 != null) {
                    videoSurfaceViewI2.setIsBuffering(true);
                }
            } else if (videoSurfaceViewI2 != null) {
                videoSurfaceViewI2.V0 = true;
                if (videoSurfaceViewI2.U0) {
                    videoSurfaceViewI2.N0.post(new toa(videoSurfaceViewI2, (byte) 3));
                }
            }
        } else if (i == 3) {
            Long l = this.W0;
            if (this.T0 != 3 || l != null) {
                if (l != null) {
                    long jLongValue = l.longValue();
                    boolean z2 = this.n1;
                    boolean z3 = this.S0;
                    q590 q590Var2 = this.c;
                    if (z3) {
                        q590Var2.m0(new k3u0(this, jLongValue, z2, (byte) 0));
                    } else {
                        this.h.M(this.i, jLongValue, q590Var2.v(), z2);
                    }
                }
                this.W0 = null;
                this.U0 = 0;
                VideoSurfaceView videoSurfaceViewI3 = this.c.i0();
                if (videoSurfaceViewI3 != null) {
                    videoSurfaceViewI3.setCanPrefetchSeekFrames(this.O0);
                }
                if (this.a1 && (videoSurfaceViewI1 = this.c.i0()) != null) {
                    videoSurfaceViewI1.post(new an90(this, (byte) 21));
                }
                if (this.T0 != 3) {
                    if (!this.i1) {
                        this.i1 = true;
                        boolean z4 = this.S0;
                        q590 q590Var3 = this.c;
                        if (z4) {
                            q590Var3.m0(new d3u0(this, (byte) 6));
                        } else {
                            this.h.O(this.i, Y0(q590Var3.v()));
                        }
                    }
                    boolean z5 = this.S0;
                    q590 q590Var4 = this.c;
                    if (z5) {
                        q590Var4.m0(new d3u0(this, (byte) 7));
                    } else {
                        long jV = q590Var4.v();
                        lgy lgyVar = this.h;
                        m0u0 m0u0Var = this.i;
                        if (jV < 0 && !this.c.B0()) {
                            jV = 0;
                        }
                        lgyVar.I(m0u0Var, jV);
                    }
                }
            }
        } else if (i == 4) {
            Z0(1, null, null, jap1.u());
        }
        if ((!this.c.q() || i != 2) && (videoSurfaceViewI0 = this.c.i0()) != null) {
            videoSurfaceViewI0.setIsBuffering(false);
        }
        if (i == 1 && this.Z0) {
            this.Z0 = false;
            VideoSurfaceView videoSurfaceViewI4 = this.c.i0();
            if (videoSurfaceViewI4 != null) {
                videoSurfaceViewI4.setIsJoining(false);
            }
        }
        this.T0 = i;
    }

    public final void H0() {
        m0u0 m0u0Var = this.i;
        o2u0 o2u0Var = m0u0Var.a;
        this.v1 = 0;
        boolean z = this.X;
        oot0 oot0Var = this.t;
        if (!z && o2u0Var.c) {
            c0(m0u0Var, Long.valueOf(oot0Var.a), new UnplayablePlaybackException("Unable to play royalty media without royalty support", xjz.ERROR_ROYALTY_MEDIA_UNSUPPORTED, null));
            return;
        }
        q590 q590Var = this.c;
        if (q590Var.c0() && !o2u0Var.b) {
            c0(m0u0Var, Long.valueOf(oot0Var.a), new UnplayablePlaybackException("Unable to play media when video is disabled and audio only is not allowed", xjz.ERROR_AUDIO_ONLY_NOT_ALLOWED, null));
            return;
        }
        try {
            q590Var.U(m0u0Var, oot0Var);
        } catch (Exception e) {
            Logger.e(e, "Could not initiate video playback", new Object[0]);
            c0(m0u0Var, null, new UnplayablePlaybackException("Failed to start playback", xjz.ERROR_UNKNOWN, e));
        }
    }

    public final void I0() {
        this.v1 = 0;
        q590 q590Var = this.c;
        if (q590Var.q()) {
            return;
        }
        if (q590Var.B0() && this.t.g) {
            q590Var.V();
        } else if (q590Var.getPlaybackState() == g5u0.IDLE) {
            q590Var.p();
        }
        q590Var.d();
        if (this.S0) {
            q590Var.m0(new d3u0(this, (byte) 12));
        } else {
            this.h.K(this.i, q590Var.v());
        }
    }

    public final void J(int i, yoh0 yoh0Var) {
        if (i == 0) {
            boolean z = this.S0;
            q590 q590Var = this.c;
            if (z) {
                q590Var.m0(new d3u0(this, (byte) 4));
                return;
            }
            this.h.y(this.i, q590Var.F());
        }
    }

    public final void J0(long j, boolean z) {
        long j2;
        this.n1 = z;
        long jMax = Math.max(0L, j);
        if (this.c.getDuration() > 0 && jMax > this.c.getDuration()) {
            boolean z2 = this.S0;
            q590 q590Var = this.c;
            if (z2) {
                q590Var.m0(new n3u0(this, z, (byte) 0));
            } else {
                this.h.N(this.i, q590Var.v(), this.c.getDuration(), z);
            }
            Z0(1, Long.valueOf(this.c.getDuration()), null, jap1.u());
            return;
        }
        if (this.c.B0() && jMax == Long.MAX_VALUE) {
            jMax = this.c.f0();
        }
        long j3 = jMax;
        boolean z3 = this.S0;
        q590 q590Var2 = this.c;
        if (z3) {
            j2 = j3;
            q590Var2.m0(new k3u0(this, j3, z, (byte) 1));
        } else {
            j2 = j3;
            long jV = q590Var2.v();
            this.h.N(this.i, jV, this.c.o0(j2), z);
            if (this.W0 == null) {
                this.W0 = Long.valueOf(jV);
            }
        }
        if (this.Q0 && !this.c.c0()) {
            this.c.T(true);
            this.a1 = true;
            VideoSurfaceView videoSurfaceViewI0 = this.c.i0();
            if (videoSurfaceViewI0 != null) {
                videoSurfaceViewI0.setIsJoining(true);
            }
        }
        this.c.f(j2);
    }

    public final void K0(int i) {
        q590 q590Var = this.c;
        q590Var.a0(i);
        if (this.S0) {
            q590Var.m0(new i3u0(this, i, (byte) 2));
            return;
        }
        long jV = q590Var.v();
        lgy lgyVar = this.h;
        m0u0 m0u0Var = this.i;
        lgyVar.m(m0u0Var, i, jV);
        lgyVar.k(m0u0Var, i != 1, jV);
    }

    @Override // p.r590
    public final void L() {
        b8p1 b8p1Var = this.g1;
        synchronized (b8p1Var) {
            if (((llb1) b8p1Var.e) == null) {
                b8p1Var.b = 3;
            }
        }
    }

    public final void L0(boolean z) {
        boolean z2 = this.S0;
        q590 q590Var = this.c;
        if (z2) {
            q590Var.m0(new n3u0(this, z, (byte) 1));
        } else {
            this.h.n(this.i, z, q590Var.v());
        }
        b1();
    }

    public final void M(int i, long j) {
        if (!this.S0) {
            this.h.u(this.i, i);
        } else {
            this.c.m0(new i3u0(this, i, (byte) 1));
        }
    }

    public final void M0(int i) {
        this.c.d0(i);
    }

    public final void N0(y1k1 y1k1Var) {
        this.c.W(y1k1Var);
    }

    public final void O0(y1k1 y1k1Var) {
        this.c.I(y1k1Var);
    }

    public final void P0(float f) {
        q590 q590Var = this.c;
        if (Float.compare(q590Var.D(), f) != 0) {
            q590Var.h(f);
            if (this.S0) {
                q590Var.m0(new m3u0(this, f, (byte) 1));
            } else {
                this.h.G(f, q590Var.v(), this.i);
            }
        }
    }

    public final void Q(IOException iOException) {
        BetamaxException manifestLoadException;
        String strB;
        xjz xjzVar;
        Logger.l(iOException, "onManifestError", new Object[0]);
        boolean z = iOException instanceof HttpDataSource.InvalidResponseCodeException;
        if (z && ((HttpDataSource.InvalidResponseCodeException) iOException).d == 410) {
            manifestLoadException = new ManifestLoadException("Gone, resource not longer available", xjz.ERROR_GONE, iOException);
        } else {
            xjz xjzVar2 = xjz.ERROR_UNKNOWN;
            if (z) {
                HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = (HttpDataSource.InvalidResponseCodeException) iOException;
                int i = invalidResponseCodeException.d;
                String str = invalidResponseCodeException.e;
                byte[] bArr = invalidResponseCodeException.g;
                Map map = dig0.a;
                Locale locale = Locale.ROOT;
                String str2 = String.format(locale, "Error loading manifest. HttpStatusCode=%d, httpStatusMessage=%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), str}, 2));
                try {
                    String str3 = new String(bArr, nne.a);
                    if (i == 404 && TextUtils.isEmpty(str3)) {
                        str3 = String.format(locale, "{\"reason\":\"%s\"}", Arrays.copyOf(new Object[]{"MANIFEST_DELETED"}, 1));
                    }
                    ega0 ega0Var = (ega0) fga0.l(nfa0.d.c(str3)).get("reason");
                    if (ega0Var != null && (strB = fga0.m(ega0Var).b()) != null && (xjzVar = (xjz) dig0.a.get(strB)) != null) {
                        xjzVar2 = xjzVar;
                    }
                } catch (IllegalArgumentException e) {
                    Logger.l(e, "Failed to get error type from response body", new Object[0]);
                }
                manifestLoadException = new ManifestLoadException(str2, xjzVar2, null);
            } else if (iOException instanceof BetamaxException) {
                manifestLoadException = (BetamaxException) iOException;
            } else {
                manifestLoadException = iOException.getCause() instanceof BetamaxException ? (BetamaxException) iOException.getCause() : new ManifestLoadException("Could not load manifest", xjzVar2, iOException);
            }
        }
        this.V0 = manifestLoadException;
    }

    public final void Q0(Locale locale) {
        if (u890.j(this.r1, locale)) {
            return;
        }
        this.r1 = locale;
        u0();
    }

    public final void R() {
        if (this.Z0) {
            this.Z0 = false;
            VideoSurfaceView videoSurfaceViewI0 = this.c.i0();
            if (videoSurfaceViewI0 != null) {
                videoSurfaceViewI0.setIsJoining(false);
            }
            boolean z = this.S0;
            q590 q590Var = this.c;
            if (z) {
                q590Var.m0(new d3u0(this, (byte) 8));
            } else {
                this.h.V(this.i, q590Var.v());
            }
        }
        if (this.a1) {
            this.a1 = false;
            VideoSurfaceView videoSurfaceViewI1 = this.c.i0();
            if (videoSurfaceViewI1 != null) {
                videoSurfaceViewI1.setIsJoining(false);
            }
        }
    }

    public final void R0(hpc1 hpc1Var) {
        if (u890.j(this.q1, hpc1Var)) {
            return;
        }
        this.q1 = hpc1Var;
        A0();
    }

    public final void S0(boolean z) {
        this.c.l0(z);
    }

    public final void T0(boolean z) {
        if (this.s1 == z) {
            return;
        }
        this.s1 = z;
        W();
    }

    public final void U0(y2g1 y2g1Var) {
        if (y2g1Var != null && y2g1Var.b) {
            n57.e("Tracker manager already allocated to another PlaybackSession");
            return;
        }
        if (y2g1Var != null) {
            y2g1Var.b = true;
        }
        if (this.S0) {
            this.c.m0(new aft0(this, y2g1Var, (byte) 16));
            return;
        }
        m0u0 m0u0Var = this.i;
        lgy lgyVar = this.h;
        Iterator it = lgyVar.h(m0u0Var).iterator();
        while (it.hasNext()) {
            ((Handler) lgyVar.c).post(new uu1((c0u0) it.next(), y2g1Var, lgyVar, (byte) 26));
        }
    }

    public final void V0(boolean z) {
        this.X0 = z;
        b1();
    }

    public final void W() {
        fn31.T(this.Y, (o8n) null, 0, new c3u0(this, this.Y0 && this.s1, null, (byte) 0), 3);
    }

    public final void W0(VideoSurfaceView videoSurfaceView) {
        VideoSurfaceView videoSurfaceView2;
        cuw cuwVar;
        cuw cuwVar2;
        vik1 vik1Var;
        VideoSurfaceView videoSurfaceViewI0 = this.c.i0();
        if (videoSurfaceViewI0 != null && (cuwVar2 = this.R0) != null && (vik1Var = (vik1) cuwVar2.a.remove(videoSurfaceViewI0)) != null) {
            vik1Var.b();
        }
        a0(videoSurfaceViewI0);
        if (videoSurfaceViewI0 != videoSurfaceView && videoSurfaceViewI0 != null) {
            videoSurfaceViewI0.setIsJoining(false);
        }
        this.c.Q(videoSurfaceView);
        if (videoSurfaceViewI0 != videoSurfaceView && videoSurfaceView != null) {
            videoSurfaceView.setIsJoining(this.Z0);
        }
        W();
        VideoSurfaceView videoSurfaceViewI1 = this.c.i0();
        if (videoSurfaceViewI1 != null) {
            videoSurfaceViewI1.e(this.j1);
        }
        s0();
        if (videoSurfaceView == null || (cuwVar = this.R0) == null) {
            videoSurfaceView2 = videoSurfaceView;
        } else {
            d3u0 d3u0Var = new d3u0(this, (byte) 14);
            vik1 vik1Var2 = (vik1) cuwVar.a.remove(videoSurfaceView);
            if (vik1Var2 != null) {
                vik1Var2.b();
            }
            LinkedHashMap linkedHashMap = cuwVar.a;
            vik1 vik1Var3 = new vik1();
            videoSurfaceView2 = videoSurfaceView;
            vik1Var3.e(videoSurfaceView2, new v7v(videoSurfaceView, (byte) 15), (moy0) null, new w3w(new p811(), d3u0Var, (byte) 8), (r1t) null);
            linkedHashMap.put(videoSurfaceView2, vik1Var3);
        }
        boolean z = this.S0;
        q590 q590Var = this.c;
        if (z) {
            q590Var.m0(new aft0(this, videoSurfaceView2, (byte) 17));
        } else {
            this.h.Q(this.i, videoSurfaceView2, q590Var.v());
        }
    }

    public final void X0(float f) {
        this.c.g(f);
    }

    public final llb1 Y0(long j) {
        klb1 klb1Var;
        llb1 llb1VarY;
        oot0 oot0Var = this.t;
        long j2 = oot0Var.a;
        boolean z = j2 >= 0 && oot0Var.b > j2;
        long j3 = z ? j2 : 0L;
        long duration = z ? oot0Var.b - j2 : this.c.getDuration();
        klb1 klb1VarZ = this.c.z();
        if (klb1VarZ != null) {
            long j4 = duration - j;
            Map map = klb1VarZ.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (iIntValue != 1) {
                    if (iIntValue == 2 && !this.c.c0()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                } else if (this.c.N() != 2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            long jMin = klb1VarZ.b;
            if (duration > 0) {
                jMin = Math.min(jMin, (j4 >= 0 ? j4 : 0L) * 1000);
            }
            klb1Var = new klb1(jMin, linkedHashMap);
        } else {
            klb1Var = null;
        }
        b8p1 b8p1Var = this.g1;
        long j5 = j + j3;
        synchronized (b8p1Var) {
            try {
                llb1 llb1Var = (llb1) b8p1Var.e;
                if (llb1Var != null) {
                    return llb1Var;
                }
                if (b8p1Var.b == 3) {
                    ix21 ix21Var = ix21.NONE;
                    llb1VarY = new llb1(ix21Var, ix21Var, 5);
                } else {
                    llb1VarY = b8p1Var.y(j5, klb1Var);
                }
                b8p1Var.e = llb1VarY;
                ((LinkedHashMap) b8p1Var.d).clear();
                return llb1VarY;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p.r590
    public final void Z(long j, boolean z) {
        if (z) {
            this.c1 += j;
        } else {
            this.d1 += j;
        }
        long j2 = this.e1 + 2000;
        yqg yqgVar = this.a;
        if (j2 <= yqgVar.b()) {
            m0u0 m0u0Var = this.i;
            lgy lgyVar = this.h;
            q590 q590Var = this.c;
            boolean z2 = this.S0;
            if (z) {
                long j3 = this.c1;
                if (z2) {
                    q590Var.m0(new g3u0(this, j3, (byte) 0));
                } else {
                    lgyVar.r(m0u0Var, j3);
                }
                this.c1 = 0L;
            } else {
                long j4 = this.d1;
                if (z2) {
                    q590Var.m0(new g3u0(this, j4, (byte) 1));
                } else {
                    lgyVar.q(m0u0Var, j4);
                }
                this.d1 = 0L;
            }
            this.e1 = yqgVar.b();
        }
    }

    public final void Z0(int i, Long l, m0u0 m0u0Var, r4t r4tVar) {
        int i2;
        int i3;
        cuw cuwVar;
        vik1 vik1Var;
        p3u0 p3u0Var = this;
        smo1.p(p3u0Var.Y, (CancellationException) null);
        p3u0Var.w1 = 1;
        o811 o811Var = new o811();
        o811Var.a = l != null ? l.longValue() : 0L;
        boolean z = p3u0Var.S0;
        q590 q590Var = p3u0Var.c;
        if (l == null) {
            if (z) {
                q590Var.m0(new li6(o811Var, (byte) 1));
            } else {
                o811Var.a = q590Var.v();
            }
        }
        VideoSurfaceView videoSurfaceViewI0 = q590Var.i0();
        if (videoSurfaceViewI0 != null && (cuwVar = p3u0Var.R0) != null && (vik1Var = (vik1) cuwVar.a.remove(videoSurfaceViewI0)) != null) {
            vik1Var.b();
        }
        q590Var.stop();
        q590Var.S(null);
        q590Var.k0(true);
        p3u0Var.b.a.remove(p3u0Var);
        long j = p3u0Var.c1;
        long j2 = p3u0Var.d1;
        m0u0 m0u0Var2 = p3u0Var.i;
        lgy lgyVar = p3u0Var.h;
        if (z) {
            p3u0Var = this;
            q590Var.m0(new rna(j, this, j2, m0u0Var, (byte) 2));
        } else {
            if (j > 0) {
                lgyVar.r(m0u0Var2, j);
            }
            if (j2 > 0) {
                lgyVar.q(m0u0Var2, j2);
            }
            if (m0u0Var != null) {
                lgyVar.w(m0u0Var2, m0u0Var);
            }
            lgyVar.y(m0u0Var2, q590Var.F());
        }
        int i4 = p3u0Var.v1;
        int i5 = i4 == 0 ? -1 : b3u0.a[l1d.C(i4)];
        if (i5 != -1) {
            if (i5 == 1) {
                i3 = 4;
            } else {
                if (i5 != 2) {
                    eg.o();
                    return;
                }
                i3 = 5;
            }
            i2 = i3;
        } else {
            i2 = i;
        }
        a0(q590Var.i0());
        rm5 rm5VarC = z ? r4tVar.c() : null;
        if (z) {
            q590Var.m0(new qf8(p3u0Var, i2, r4tVar, o811Var, rm5VarC, (byte) 5));
        } else {
            lgyVar.F(m0u0Var2, i2, r4tVar, o811Var.a);
            if (rm5VarC != null) {
                kks0 kks0Var = new kks0(rm5VarC, (byte) 20);
                if (u890.j(Looper.myLooper(), Looper.getMainLooper())) {
                    kks0Var.invoke();
                } else {
                    p3u0Var.h1.post(new an90(kks0Var, (byte) 22));
                }
            }
        }
        p3u0Var.g.invoke();
        if (z) {
            q590Var.m0(new d3u0(p3u0Var, (byte) 13));
        } else {
            lgyVar.E(m0u0Var2);
        }
    }

    public final void a(int i, long j, long j2) {
        if (this.S0) {
            this.c.m0(new f3u0(this, j, j2, i));
        } else {
            this.h.o(this.i, j, j2, i);
        }
    }

    public final void a1(int i, m0u0 m0u0Var, r4t r4tVar) {
        Z0(i, null, m0u0Var, r4tVar);
    }

    @Override // p.r590
    public final void b(z1k1 z1k1Var) {
        int i = z1k1Var.b;
        int i2 = z1k1Var.a;
        if (i2 == 0 || i == 0) {
            this.t1 = null;
            return;
        }
        this.t1 = new y1k1(i2, i);
        VideoSurfaceView videoSurfaceViewI0 = this.c.i0();
        if (videoSurfaceViewI0 != null) {
            videoSurfaceViewI0.d(i2, i);
        }
    }

    public final void b1() {
        boolean z = this.S0;
        q590 q590Var = this.c;
        if (!z) {
            boolean zC0 = q590Var.c0();
            long jV = this.c.v();
            this.c.T(this.X0 || this.b.a());
            boolean zC1 = this.c.c0();
            this.h.T(this.i, this.c.c0(), jV);
            if (zC0 && !zC1) {
                W();
                this.Z0 = true;
                VideoSurfaceView videoSurfaceViewI0 = this.c.i0();
                if (videoSurfaceViewI0 != null) {
                    videoSurfaceViewI0.setIsJoining(true);
                }
                this.h.W(this.i, jV);
            } else if (!zC0 && zC1) {
                this.Z0 = false;
                VideoSurfaceView videoSurfaceViewI1 = this.c.i0();
                if (videoSurfaceViewI1 != null) {
                    videoSurfaceViewI1.setIsJoining(false);
                }
            }
            if (!this.c.c0() || this.i.a.b) {
                return;
            }
            G0();
            return;
        }
        boolean zC2 = q590Var.c0();
        boolean z2 = this.X0 || this.b.a();
        boolean z3 = zC2 && !z2;
        boolean z4 = this.S0;
        q590 q590Var2 = this.c;
        if (z4) {
            q590Var2.m0(new o3u0(this, z2, z3, zC2));
        } else {
            long jV2 = q590Var2.v();
            this.h.T(this.i, z2, jV2);
            if (z3) {
                this.h.W(this.i, jV2);
                this.Z0 = true;
                VideoSurfaceView videoSurfaceViewI2 = this.c.i0();
                if (videoSurfaceViewI2 != null) {
                    videoSurfaceViewI2.setIsJoining(true);
                }
            } else if (!zC2 && z2) {
                this.Z0 = false;
                VideoSurfaceView videoSurfaceViewI3 = this.c.i0();
                if (videoSurfaceViewI3 != null) {
                    videoSurfaceViewI3.setIsJoining(false);
                }
            }
        }
        this.c.T(z2);
        if (z3) {
            W();
        }
        if (!z2 || this.i.a.b) {
            return;
        }
        G0();
    }

    public final void c() {
        if (this.Z) {
            this.Y0 = false;
            boolean zA = this.b.a();
            if (!this.X0 && !zA) {
                W();
            }
        }
        if (!this.S0) {
            this.h.t(this.i);
        } else {
            this.c.m0(new d3u0(this, (byte) 1));
        }
    }

    public final void c0(m0u0 m0u0Var, Long l, UnplayablePlaybackException unplayablePlaybackException) {
        p3u0 p3u0Var;
        Long l2;
        boolean z = this.S0;
        q590 q590Var = this.c;
        if (z) {
            p3u0Var = this;
            l2 = l;
            q590Var.m0(new ntf0(p3u0Var, m0u0Var, unplayablePlaybackException, l2, (byte) 27));
        } else {
            p3u0Var = this;
            l2 = l;
            long jV = q590Var.v();
            if (l2 != null) {
                jV = l2.longValue();
            }
            p3u0Var.h.x(m0u0Var, unplayablePlaybackException, jV);
        }
        p3u0Var.Z0(3, l2, null, jap1.u());
    }

    public final boolean d0() {
        return this.c.q();
    }

    @Override // p.r590
    public final void e(o2r o2rVar, n3r n3rVar, boolean z) {
        rfh0 rfh0VarD0 = this.c.D0();
        if (rfh0VarD0 != null) {
            rfh0VarD0.e(o2rVar, n3rVar, z);
        }
    }

    public final void f(int i) {
        fn31.T(this.Y, (o8n) null, 0, new nx5(this, i, (lnm) null, (byte) 9), 3);
    }

    public final m0u0 f0() {
        return this.i;
    }

    public final void g0(int i, boolean z) {
        VideoSurfaceView videoSurfaceViewI0;
        if ((!z || this.T0 != 2) && (videoSurfaceViewI0 = this.c.i0()) != null) {
            videoSurfaceViewI0.setIsBuffering(false);
        }
        if (z || !this.Z0) {
            return;
        }
        this.Z0 = false;
        VideoSurfaceView videoSurfaceViewI1 = this.c.i0();
        if (videoSurfaceViewI1 != null) {
            videoSurfaceViewI1.setIsJoining(false);
        }
    }

    public final void h0(float f) {
        boolean z = this.S0;
        q590 q590Var = this.c;
        if (z) {
            q590Var.m0(new m3u0(this, f, (byte) 0));
        } else {
            this.h.X(f, q590Var.v(), this.i);
        }
    }

    public final g5u0 i0() {
        return this.c.getPlaybackState();
    }

    @Override // p.r590
    public final void j(o2r o2rVar, n3r n3rVar, boolean z) {
        rfh0 rfh0VarD0 = this.c.D0();
        if (rfh0VarD0 != null) {
            rfh0VarD0.j(o2rVar, n3rVar, z);
        }
        s();
    }

    public final void j0(p8u0 p8u0Var, p8u0 p8u0Var2, int i) {
        if (this.c.u0() && i == 0) {
            boolean z = this.n1;
            if (this.S0) {
                this.c.m0(new gh1(this, z, p8u0Var, p8u0Var2, (byte) 21));
            } else {
                this.h.N(this.i, this.c.getDuration(), 0L, z);
                this.h.M(this.i, p8u0Var.f, p8u0Var2.f, z);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum k0(onm onmVar) {
        e3u0 e3u0Var;
        URL m231Var;
        jgc1 jgc1Var;
        if (onmVar instanceof e3u0) {
            e3u0Var = (e3u0) onmVar;
            int i = e3u0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e3u0Var.c = i - Integer.MIN_VALUE;
            } else {
                e3u0Var = new e3u0(this, onmVar);
            }
        } else {
            e3u0Var = new e3u0(this, onmVar);
        }
        Object objValueOf = e3u0Var.a;
        int i2 = e3u0Var.c;
        if (i2 == 0) {
            hm5.M(objValueOf);
            String str = this.i.a.a;
            if (nhc1.Y(str, "file:", false)) {
                jgc1Var = jgc1.LOCAL;
            } else if (this.c.B0()) {
                jgc1Var = jgc1.LIVE;
            } else {
                yna ynaVar = this.d;
                if (ynaVar == null || !t9p1.i((kru) ynaVar.b.g.get(str))) {
                    e3u0Var.c = 1;
                    yfu yfuVar = this.f;
                    if (yfuVar == null || wqn1.y(str)) {
                        kma kmaVar = this.e;
                        objValueOf = Boolean.valueOf(kmaVar != null && kmaVar.b(str));
                    } else {
                        try {
                            m231Var = new URL(str);
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable th) {
                            m231Var = new m231(th);
                        }
                        if (m231Var instanceof m231) {
                            m231Var = null;
                        }
                        URL url = m231Var;
                        objValueOf = url == null ? Boolean.FALSE : fn31.Y((q8n) yfuVar.c, new zfe(yfuVar, url, (lnm) null, (byte) 5), e3u0Var);
                    }
                    d9n d9nVar = d9n.a;
                    if (objValueOf == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    jgc1Var = jgc1.OFFLINE;
                }
            }
            this.k1 = jgc1Var;
            return jgc1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objValueOf);
        jgc1Var = ((Boolean) objValueOf).booleanValue() ? jgc1.CACHE : jgc1.ON_DEMAND;
        this.k1 = jgc1Var;
        return jgc1Var;
    }

    public final y1k1 l0() {
        return this.t1;
    }

    @Override // p.r590
    public final void m(o2r o2rVar, n3r n3rVar, boolean z, int i) {
        b8p1 b8p1Var = this.g1;
        synchronized (b8p1Var) {
            try {
                if (((llb1) b8p1Var.e) == null && i > 0) {
                    ix21 ix21Var = z ? ix21.NETWORK : ix21.CACHE;
                    Object obj = n3rVar.j;
                    if (u890.j(obj, zhg0.a)) {
                        LinkedHashSet linkedHashSet = (LinkedHashSet) b8p1Var.c;
                        if (o2rVar instanceof gr51) {
                            Long l = ((gr51) o2rVar).S0;
                            if (l == null) {
                                ix21Var = ix21.UNKNOWN;
                            } else {
                                ix21Var = l.longValue() == 0 ? ix21.CACHE : ix21.NETWORK;
                            }
                        }
                        linkedHashSet.add(ix21Var);
                    } else if ((obj instanceof np51) && (((np51) obj).d == 1 || ((np51) obj).d == 2)) {
                        LinkedHashMap linkedHashMap = (LinkedHashMap) b8p1Var.d;
                        Object linkedHashSet2 = linkedHashMap.get(obj);
                        if (linkedHashSet2 == null) {
                            linkedHashSet2 = new LinkedHashSet();
                            linkedHashMap.put(obj, linkedHashSet2);
                        }
                        ((Set) linkedHashSet2).add(ix21Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        rfh0 rfh0VarD0 = this.c.D0();
        if (rfh0VarD0 != null) {
            rfh0VarD0.m(o2rVar, n3rVar, z, i);
        }
        Z(i, z);
    }

    public final VideoSurfaceView m0() {
        return this.c.i0();
    }

    public final void n(PlaybackException playbackException) {
        BetamaxPlaybackException betamaxPlaybackException;
        Logger.e(playbackException, "Video playback error", new Object[0]);
        Throwable cause = playbackException.getCause();
        if (!(cause instanceof HttpDataSource.InvalidResponseCodeException) && !(cause instanceof MediaCodec.CryptoException)) {
            Exception exc = cause instanceof Exception ? (Exception) cause : null;
            if (!((exc != null ? exc.getCause() : null) instanceof SunsetUpgradeRequiredException)) {
                int i = playbackException.a;
                q590 q590Var = this.c;
                if (i == 1002) {
                    q590Var.V();
                    return;
                }
                int i2 = 1;
                if (i != 2001) {
                    if (i != 2002) {
                        cause.getClass();
                        if (!(cause.getCause() instanceof NetworkAccessWhileInOfflineModeException)) {
                            hxt0 hxt0Var = hxt0.i;
                            mf20 mf20Var = new mf20(z561.T(zqb0.P0, z561.c0(hxt0Var, playbackException)));
                            while (true) {
                                if (!mf20Var.hasNext()) {
                                    mf20 mf20Var2 = new mf20(z561.T(zqb0.N0, z561.c0(hxt0Var, playbackException)));
                                    loop1: while (true) {
                                        if (!mf20Var2.hasNext()) {
                                            mf20 mf20Var3 = new mf20(z561.T(zqb0.O0, z561.c0(hxt0Var, playbackException)));
                                            while (true) {
                                                if (!mf20Var3.hasNext()) {
                                                    Iterator it = z561.c0(hxt0Var, playbackException).iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            betamaxPlaybackException = new BetamaxPlaybackException("Error during playback", xjz.ERROR_UNKNOWN, playbackException);
                                                            break;
                                                        } else if (((Throwable) it.next()) instanceof MediaCodecVideoDecoderException) {
                                                            betamaxPlaybackException = new BetamaxPlaybackException("Video decoder failed", xjz.ERROR_VIDEO_DECODER_FAILED, playbackException);
                                                            break;
                                                        }
                                                    }
                                                } else {
                                                    String str = ((MediaCodecRenderer.DecoderInitializationException) mf20Var3.next()).a;
                                                    if (str != null && asj0.o(str)) {
                                                        betamaxPlaybackException = new BetamaxPlaybackException("Video decoder initialization failed", xjz.ERROR_VIDEO_DECODER_INIT_FAILED, playbackException);
                                                        break;
                                                    }
                                                }
                                            }
                                        } else {
                                            Iterator it2 = z561.c0(hxt0Var, (MediaCodecVideoDecoderException) mf20Var2.next()).iterator();
                                            while (true) {
                                                if (it2.hasNext()) {
                                                    Throwable th = (Throwable) it2.next();
                                                    if ((th instanceof IllegalStateException) && !(th instanceof MediaCodec.CodecException)) {
                                                        betamaxPlaybackException = new BetamaxPlaybackException("Video codec entered an illegal state", xjz.ERROR_VIDEO_CODEC_ILLEGAL_STATE, playbackException);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (((ExoTimeoutException) mf20Var.next()).a == 3) {
                                    betamaxPlaybackException = new BetamaxPlaybackException("Video surface detach timed out", xjz.ERROR_VIDEO_SURFACE_DETACH_TIMEOUT, playbackException);
                                    break;
                                }
                            }
                        } else {
                            betamaxPlaybackException = new BetamaxPlaybackException("Error during playback", xjz.ERROR_IN_OFFLINE_MODE, playbackException);
                        }
                    } else {
                        betamaxPlaybackException = new BetamaxPlaybackException("Connection timeout", xjz.ERROR_NETWORK_CONNECTION_TIMEOUT, playbackException);
                    }
                } else {
                    betamaxPlaybackException = new BetamaxPlaybackException("Unable to connect", xjz.ERROR_NETWORK_CONNECTION_FAILED, playbackException);
                }
                if (q590Var.B0() && this.U0 < 5) {
                    q590Var.V();
                    this.U0++;
                    return;
                }
                boolean z = this.b1;
                m0u0 m0u0Var = this.i;
                if (!z && this.b.a() && q590Var.c0() && q590Var.q() && m0u0Var.a.b && i != 2001 && i != 2002) {
                    cause.getClass();
                    if (!(cause.getCause() instanceof NetworkAccessWhileInOfflineModeException)) {
                        this.b1 = true;
                        q590Var.p();
                        return;
                    }
                }
                if (i != 2001 && i != 2002) {
                    i2 = 2;
                }
                this.v1 = i2;
                q590Var.a();
                if (this.S0) {
                    q590Var.m0(new aft0(this, betamaxPlaybackException, (byte) 15));
                    return;
                } else {
                    this.h.J(m0u0Var, betamaxPlaybackException, q590Var.v());
                    return;
                }
            }
        }
        D0(playbackException);
    }

    public final void o(qeo qeoVar) {
        this.j1 = qeoVar;
        VideoSurfaceView videoSurfaceViewI0 = this.c.i0();
        if (videoSurfaceViewI0 != null) {
            videoSurfaceViewI0.e(qeoVar);
        }
    }

    public final rm51 o0(int i, long j, int i2) {
        sm51 sm51Var = this.m1;
        if (sm51Var != null) {
            return sm51Var.a(i, j, i2);
        }
        return null;
    }

    public final void p(int i, ie30 ie30Var) {
        if (ie30Var == null) {
            return;
        }
        String str = ie30Var.l;
        byte b = 0;
        byte b2 = 2;
        byte b3 = 1;
        m0u0 m0u0Var = this.i;
        lgy lgyVar = this.h;
        q590 q590Var = this.c;
        boolean z = this.S0;
        if (i != 0) {
            if (i == 1) {
                if (z) {
                    q590Var.m0(new h3u0(this, ie30Var, (byte) 3));
                    return;
                } else {
                    lgyVar.l(m0u0Var, ie30Var, q590Var.v());
                    return;
                }
            }
            if (i != 2) {
                Logger.k("Unknown event source id for downstream format changed event", new Object[0]);
                return;
            } else if (z) {
                q590Var.m0(new h3u0(this, ie30Var, b2));
                return;
            } else {
                lgyVar.U(m0u0Var, ie30Var, q590Var.v());
                return;
            }
        }
        if (ie30Var.x > 0 || zoi1.B(2, str) != null) {
            if (z) {
                q590Var.m0(new h3u0(this, ie30Var, b));
                return;
            } else {
                lgyVar.U(m0u0Var, ie30Var, q590Var.v());
                return;
            }
        }
        if (zoi1.B(1, str) != null) {
            if (z) {
                q590Var.m0(new h3u0(this, ie30Var, b3));
            } else {
                lgyVar.l(m0u0Var, ie30Var, q590Var.v());
            }
        }
    }

    public final void r() {
        if (!this.S0) {
            this.h.A(this.i);
        } else {
            this.c.m0(new d3u0(this, (byte) 3));
        }
    }

    @Override // p.r590
    public final void s() {
        if (!this.S0) {
            this.h.S(this.i);
        } else {
            this.c.m0(new d3u0(this, (byte) 10));
        }
    }

    public final void s0() {
        ywv0 ywv0Var;
        nn51 nn51Var = this.l1;
        q590 q590Var = this.c;
        if (nn51Var == null) {
            a0(q590Var.i0());
            return;
        }
        um51 um51Var = this.N0;
        if (um51Var != null) {
            vm51 vm51VarA = um51Var.a(nn51Var);
            VideoSurfaceView videoSurfaceViewI0 = q590Var.i0();
            if (videoSurfaceViewI0 != null) {
                videoSurfaceViewI0.setSeekFrameLoader(new zm51(vm51VarA, this.a));
            }
            this.m1 = vm51VarA;
        }
        VideoSurfaceView videoSurfaceViewI1 = q590Var.i0();
        if (videoSurfaceViewI1 != null) {
            o2p o2pVar = this.P0;
            if (o2pVar != null) {
                p2p p2pVar = o2pVar.a;
                c21 c21Var = (c21) p2pVar.d;
                ywv0Var = new ywv0(nn51Var, (cn51) ((jly0) c21Var.g).get(), ((q2p) p2pVar.c).h, (qha) ((jly0) c21Var.i).get());
            } else {
                ywv0Var = null;
            }
            videoSurfaceViewI1.setSeekFramePrefetcher(ywv0Var);
        }
        VideoSurfaceView videoSurfaceViewI2 = q590Var.i0();
        if (videoSurfaceViewI2 != null) {
            videoSurfaceViewI2.setOnScrubStart(new t0r0(0, this, p3u0.class, "onScrubStart", "onScrubStart$src_main_java_com_spotify_betamax_playerimpl_playerimpl()V", 0, (byte) 21));
        }
        VideoSurfaceView videoSurfaceViewI3 = q590Var.i0();
        if (videoSurfaceViewI3 != null) {
            videoSurfaceViewI3.setOnScrubEnd(new t0r0(0, this, p3u0.class, "onScrubEnd", "onScrubEnd$src_main_java_com_spotify_betamax_playerimpl_playerimpl()V", 0, (byte) 22));
        }
    }

    @Override // p.r590
    public final void t(o2r o2rVar, n3r n3rVar, boolean z) {
        rfh0 rfh0VarD0 = this.c.D0();
        if (rfh0VarD0 != null) {
            rfh0VarD0.t(o2rVar, n3rVar, z);
        }
    }

    public final void u0() {
        Locale localeS;
        Locale locale;
        if (this.p1.isEmpty()) {
            return;
        }
        Locale locale2 = this.r1;
        List list = this.p1;
        if (locale2 == null) {
            localeS = gto1.s(list);
        } else {
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((nv7) it.next()).a);
            }
            ArrayList<Locale> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (u890.j(((Locale) obj).getLanguage(), locale2.getLanguage())) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                localeS = gto1.s(list);
            } else {
                Iterator it2 = arrayList2.iterator();
                do {
                    if (it2.hasNext()) {
                        locale = (Locale) it2.next();
                    } else {
                        Iterator it3 = arrayList2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                locale = (Locale) it3.next();
                                if (u890.j(locale2.getLanguage(), locale.getLanguage()) && locale.getCountry().length() > 0) {
                                    break;
                                }
                            } else {
                                for (Locale locale3 : arrayList2) {
                                    if (u890.j(locale2.getLanguage(), locale3.getLanguage())) {
                                        localeS = locale3;
                                    }
                                }
                                localeS = gto1.s(list);
                            }
                        }
                    }
                } while (!u890.j(locale2.toLanguageTag(), locale.toLanguageTag()));
                localeS = locale;
            }
        }
        this.c.E(localeS);
    }

    @Override // p.r590
    public final void z0() {
        fn31.T(this.Y, (o8n) null, 0, new kdt0(this, (lnm) null, (byte) 1), 3);
    }
}
