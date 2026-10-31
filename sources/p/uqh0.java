package p;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import androidx.media3.datasource.HttpDataSource;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uqh0 implements uz3, q3u0 {
    public int A;
    public boolean B;
    public final Context a;
    public final hfs c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public PlaybackException o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public mgc f154p;
    public mgc q;
    public mgc r;
    public ie30 s;
    public ie30 t;
    public ie30 u;
    public boolean v;
    public byte w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = tx9.n();
    public final oqe1 f = new oqe1();
    public final dqe1 g = new dqe1();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    public uqh0(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        hfs hfsVar = new hfs();
        this.c = hfsVar;
        hfsVar.d = this;
    }

    public static uqh0 j(Context context) {
        MediaMetricsManager mediaMetricsManagerG = swg0.g(context.getSystemService("media_metrics"));
        if (mediaMetricsManagerG == null) {
            return null;
        }
        return new uqh0(context, mediaMetricsManagerG.createPlaybackSession());
    }

    public final void A(int i, long j, ie30 ie30Var, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (ie30Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = ie30Var.o;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = ie30Var.f66p;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = ie30Var.l;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = ie30Var.k;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = ie30Var.w;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = ie30Var.x;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = ie30Var.J;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = ie30Var.L;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = ie30Var.d;
            if (str4 != null) {
                String str5 = zoi1.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = ie30Var.B;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.b.execute(new ag20(this, timeSinceCreatedMillis.build(), (byte) 22));
    }

    @Override // p.uz3
    public final void b(z1k1 z1k1Var) {
        mgc mgcVar = this.f154p;
        if (mgcVar != null) {
            ie30 ie30Var = (ie30) mgcVar.c;
            if (ie30Var.x == -1) {
                ge30 ge30VarA = ie30Var.a();
                ge30VarA.v = z1k1Var.a;
                ge30VarA.w = z1k1Var.b;
                this.f154p = new mgc(new ie30(ge30VarA), mgcVar.b, (String) mgcVar.d, (byte) 18);
            }
        }
    }

    @Override // p.uz3
    public final void d(far farVar) {
        this.y += farVar.g;
        this.z += farVar.e;
    }

    @Override // p.q3u0
    public final void f(tz3 tz3Var, String str, boolean z) {
        p2i0 p2i0Var = tz3Var.d;
        if ((p2i0Var == null || !p2i0Var.c()) && str.equals(this.j)) {
            k();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    @Override // p.q3u0
    public final void g(tz3 tz3Var, String str) {
        p2i0 p2i0Var = tz3Var.d;
        if (p2i0Var == null || !p2i0Var.c()) {
            k();
            this.j = str;
            this.k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.0");
            z(tz3Var.b, p2i0Var);
        }
    }

    public final boolean i(mgc mgcVar) {
        String str;
        if (mgcVar == null) {
            return false;
        }
        String str2 = (String) mgcVar.d;
        hfs hfsVar = this.c;
        synchronized (hfsVar) {
            str = hfsVar.f;
        }
        return str2.equals(str);
    }

    public final void k() {
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = (Long) this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.b.execute(new ag20(this, this.k.build(), (byte) 25));
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    public final LogSessionId l() {
        return this.d.getSessionId();
    }

    public final /* synthetic */ void m(PlaybackMetrics playbackMetrics) {
        this.d.reportPlaybackMetrics(playbackMetrics);
    }

    @Override // p.uz3
    public final void n(PlaybackException playbackException) {
        this.o = playbackException;
    }

    @Override // p.uz3
    public final void o(tz3 tz3Var, int i, long j) {
        p2i0 p2i0Var = tz3Var.d;
        if (p2i0Var != null) {
            String strE = this.c.e(tz3Var.b, p2i0Var);
            HashMap map = this.i;
            Long l = (Long) map.get(strE);
            HashMap map2 = this.h;
            Long l2 = (Long) map2.get(strE);
            map.put(strE, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strE, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // p.uz3
    public final void q(tz3 tz3Var, qqh0 qqh0Var) {
        p2i0 p2i0Var = tz3Var.d;
        if (p2i0Var == null) {
            return;
        }
        ie30 ie30Var = qqh0Var.c;
        ie30Var.getClass();
        int i = qqh0Var.d;
        sqe1 sqe1Var = tz3Var.b;
        p2i0Var.getClass();
        mgc mgcVar = new mgc(ie30Var, i, this.c.e(sqe1Var, p2i0Var), (byte) 18);
        int i2 = qqh0Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.q = mgcVar;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.r = mgcVar;
                return;
            }
        }
        this.f154p = mgcVar;
    }

    @Override // p.uz3
    public final void r(qqh0 qqh0Var, IOException iOException) {
        this.w = qqh0Var.a;
    }

    @Override // p.uz3
    public final void s(p8u0 p8u0Var, int i) {
        if (i == 1) {
            this.v = true;
        }
        this.l = i;
    }

    /* JADX WARN: Code duplicated, block: B:206:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:224:0x0403  */
    /* JADX WARN: Code duplicated, block: B:225:0x0405  */
    /* JADX WARN: Code duplicated, block: B:233:0x041b  */
    /* JADX WARN: Code duplicated, block: B:234:0x041d  */
    /* JADX WARN: Code duplicated, block: B:323:0x0544 A[PHI: r5
      0x0544: PHI (r5v76 int) = (r5v74 int), (r5v73 int), (r5v73 int), (r5v73 int) binds: [B:330:0x0555, B:312:0x0529, B:313:0x052b, B:314:0x052d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:340:0x0568  */
    /* JADX WARN: Code duplicated, block: B:343:0x0592  */
    /* JADX WARN: Code duplicated, block: B:358:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.uz3
    public final void t(r8u0 r8u0Var, em3 em3Var) {
        hfs hfsVar;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        f3a f3aVar;
        f3a f3aVar2;
        int i8;
        f3a f3aVar3;
        int i9;
        mgc mgcVar;
        int i10;
        int i11;
        boolean z2;
        ie30 ie30Var;
        int i12;
        int i13;
        x8v x8vVar;
        int i14;
        ko20 ko20Var = (ko20) em3Var.b;
        if (ko20Var.a.size() == 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            int size = ko20Var.a.size();
            hfsVar = this.c;
            if (i15 >= size) {
                break;
            }
            int iB = ko20Var.b(i15);
            tz3 tz3VarM = em3Var.m(iB);
            if (iB == 0) {
                hfsVar.i(tz3VarM);
            } else if (iB == 11) {
                hfsVar.h(this.l, tz3VarM);
            } else {
                hfsVar.g(tz3VarM);
            }
            i15++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (em3Var.j(0)) {
            tz3 tz3VarM2 = em3Var.m(0);
            if (this.k != null) {
                z(tz3VarM2.b, tz3VarM2.d);
            }
        }
        if (em3Var.j(2) && this.k != null) {
            w280 w280VarR = r8u0Var.U().a.r(0);
            loop1: while (true) {
                if (!w280VarR.hasNext()) {
                    x8vVar = null;
                    break;
                }
                n3g1 n3g1Var = (n3g1) w280VarR.next();
                for (int i16 = 0; i16 < n3g1Var.a; i16++) {
                    if (n3g1Var.e[i16] && (x8vVar = n3g1Var.b.d[i16].t) != null) {
                        break loop1;
                    }
                }
            }
            if (x8vVar != null) {
                PlaybackMetrics.Builder builder = this.k;
                String str = zoi1.a;
                int i17 = 0;
                while (true) {
                    if (i17 >= x8vVar.d) {
                        i14 = 1;
                        break;
                    }
                    UUID uuid = x8vVar.a[i17].b;
                    if (uuid.equals(whc.e)) {
                        i14 = 3;
                        break;
                    } else if (uuid.equals(whc.f)) {
                        i14 = 2;
                        break;
                    } else {
                        if (uuid.equals(whc.d)) {
                            i14 = 6;
                            break;
                        }
                        i17++;
                    }
                }
                builder.setDrmType(i14);
            }
        }
        if (em3Var.j(1011)) {
            this.A++;
        }
        Exception exc = this.o;
        Context context = this.a;
        Executor executor = this.b;
        long j = this.e;
        if (exc == null) {
            i9 = 1;
            i7 = 13;
            i2 = 8;
            i3 = 7;
            i4 = 6;
            i5 = 9;
            i6 = 5;
        } else {
            int i18 = ((PlaybackException) exc).a;
            boolean z3 = this.w == 4;
            if (i18 == 1001) {
                f3aVar = new f3a(20, 0);
                i7 = 13;
                i2 = 8;
                i3 = 7;
                i4 = 6;
                i5 = 9;
                i6 = 5;
            } else {
                if (exc instanceof ExoPlaybackException) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) exc;
                    z = exoPlaybackException.t == 1;
                    i = exoPlaybackException.N0;
                } else {
                    z = false;
                    i = 0;
                }
                Throwable cause = exc.getCause();
                cause.getClass();
                int i19 = 27;
                if (cause instanceof IOException) {
                    if (cause instanceof HttpDataSource.InvalidResponseCodeException) {
                        i6 = 5;
                        f3aVar3 = new f3a(5, ((HttpDataSource.InvalidResponseCodeException) cause).d);
                    } else {
                        i6 = 5;
                        if ((cause instanceof HttpDataSource$InvalidContentTypeException) || (cause instanceof ParserException)) {
                            i8 = 9;
                            i3 = 7;
                            i4 = 6;
                            f3aVar = new f3a(z3 ? 10 : 11, 0);
                            i2 = 8;
                        } else {
                            boolean z4 = cause instanceof HttpDataSource.HttpDataSourceException;
                            if (z4 || (cause instanceof UdpDataSource$UdpDataSourceException)) {
                                i8 = 9;
                                if (v8o0.a(context).b() == 1) {
                                    f3aVar = new f3a(3, 0);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        f3aVar = new f3a(6, 0);
                                        i6 = 5;
                                        i4 = 6;
                                        i5 = 9;
                                        i7 = 13;
                                        i2 = 8;
                                        i3 = 7;
                                    } else {
                                        if (cause2 instanceof SocketTimeoutException) {
                                            f3aVar = new f3a(7, 0);
                                            i3 = 7;
                                        } else {
                                            i3 = 7;
                                            if (z4 && ((HttpDataSource.HttpDataSourceException) cause).c == 1) {
                                                f3aVar = new f3a(4, 0);
                                            } else {
                                                f3aVar = new f3a(8, 0);
                                                i2 = 8;
                                                i4 = 6;
                                            }
                                        }
                                        i6 = 5;
                                        i4 = 6;
                                        i5 = 9;
                                        i7 = 13;
                                        i2 = 8;
                                    }
                                }
                            } else {
                                if (i18 == 1002) {
                                    f3aVar = new f3a(21, 0);
                                } else if (cause instanceof DrmSession.DrmSessionException) {
                                    Throwable cause3 = cause.getCause();
                                    cause3.getClass();
                                    if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                        int iF = zoi1.F(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                        switch (zoi1.E(iF)) {
                                            case 6002:
                                                i19 = 24;
                                                break;
                                            case 6003:
                                                i19 = 28;
                                                break;
                                            case 6004:
                                                i19 = 25;
                                                break;
                                            case 6005:
                                                i19 = 26;
                                                break;
                                        }
                                        f3aVar3 = new f3a(i19, iF);
                                    } else if (cause3 instanceof MediaDrmResetException) {
                                        f3aVar = new f3a(27, 0);
                                    } else if (cause3 instanceof NotProvisionedException) {
                                        f3aVar = new f3a(24, 0);
                                    } else if (cause3 instanceof DeniedByServerException) {
                                        f3aVar = new f3a(29, 0);
                                    } else if (cause3 instanceof UnsupportedDrmException) {
                                        f3aVar = new f3a(23, 0);
                                    } else {
                                        f3aVar = cause3 instanceof DefaultDrmSessionManager$MissingSchemeDataException ? new f3a(28, 0) : new f3a(30, 0);
                                    }
                                } else if ((cause instanceof FileDataSource$FileDataSourceException) && (cause.getCause() instanceof FileNotFoundException)) {
                                    Throwable cause4 = cause.getCause();
                                    cause4.getClass();
                                    Throwable cause5 = cause4.getCause();
                                    f3aVar = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new f3a(32, 0) : new f3a(31, 0);
                                } else {
                                    i8 = 9;
                                    f3aVar = new f3a(9, 0);
                                }
                                i6 = i6;
                                i7 = 13;
                                i2 = 8;
                                i3 = 7;
                                i4 = 6;
                                i5 = 9;
                            }
                            i6 = 5;
                            i5 = i8;
                            i7 = 13;
                            i2 = 8;
                            i3 = 7;
                            i4 = 6;
                        }
                        i5 = i8;
                        i7 = 13;
                    }
                    f3aVar = f3aVar3;
                    i6 = i6;
                    i7 = 13;
                    i2 = 8;
                    i3 = 7;
                    i4 = 6;
                    i5 = 9;
                } else {
                    int i20 = 28;
                    i2 = 8;
                    i3 = 7;
                    i4 = 6;
                    i5 = 9;
                    i6 = 5;
                    if (z && (i == 0 || i == 1)) {
                        f3aVar = new f3a(35, 0);
                    } else if (z && i == 3) {
                        f3aVar = new f3a(15, 0);
                    } else if (z && i == 2) {
                        f3aVar = new f3a(23, 0);
                    } else {
                        if (cause instanceof MediaCodecRenderer$DecoderInitializationException) {
                            i7 = 13;
                            f3aVar2 = new f3a(13, zoi1.F(((MediaCodecRenderer$DecoderInitializationException) cause).d));
                        } else {
                            i7 = 13;
                            if (cause instanceof MediaCodecDecoderException) {
                                f3aVar2 = new f3a(14, ((MediaCodecDecoderException) cause).a);
                            } else if (cause instanceof OutOfMemoryError) {
                                f3aVar = new f3a(14, 0);
                            } else if (cause instanceof AudioSink$InitializationException) {
                                f3aVar = new f3a(17, 0);
                            } else if (cause instanceof AudioSink$WriteException) {
                                f3aVar2 = new f3a(18, ((AudioSink$WriteException) cause).a);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (zoi1.E(errorCode)) {
                                    case 6002:
                                        i20 = 24;
                                        break;
                                    case 6003:
                                        break;
                                    case 6004:
                                        i20 = 25;
                                        break;
                                    case 6005:
                                        i20 = 26;
                                        break;
                                    default:
                                        i20 = 27;
                                        break;
                                }
                                f3aVar = new f3a(i20, errorCode);
                            } else {
                                f3aVar = new f3a(22, 0);
                            }
                        }
                        f3aVar = f3aVar2;
                    }
                    i7 = 13;
                }
            }
            executor.execute(new ag20(this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - j).setErrorCode(f3aVar.a).setSubErrorCode(f3aVar.b).setException(exc).build(), (byte) 24));
            i9 = 1;
            this.B = true;
            this.o = null;
        }
        if (em3Var.j(2)) {
            o3g1 o3g1VarU = r8u0Var.U();
            boolean zA = o3g1VarU.a(2);
            boolean zA2 = o3g1VarU.a(i9);
            boolean zA3 = o3g1VarU.a(3);
            if (zA || zA2 || zA3) {
                if (zA) {
                    ie30Var = null;
                } else {
                    if (Objects.equals(this.s, null)) {
                        ie30Var = null;
                    } else {
                        int i21 = this.s == null ? 1 : 0;
                        this.s = null;
                        executor = executor;
                        ie30Var = null;
                        i10 = 10;
                        A(1, jElapsedRealtime, null, i21);
                    }
                    if (!zA2 && !Objects.equals(this.t, ie30Var)) {
                        if (this.t == null) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        this.t = ie30Var;
                        A(0, jElapsedRealtime, ie30Var, i13);
                    }
                    if (!zA3 && !Objects.equals(this.u, ie30Var)) {
                        if (this.u == null) {
                            i12 = 1;
                        } else {
                            i12 = 0;
                        }
                        this.u = ie30Var;
                        A(2, jElapsedRealtime, ie30Var, i12);
                    }
                    mgcVar = ie30Var;
                }
                i10 = 10;
                if (!zA2) {
                    if (this.t == null) {
                        i13 = 1;
                    } else {
                        i13 = 0;
                    }
                    this.t = ie30Var;
                    A(0, jElapsedRealtime, ie30Var, i13);
                }
                if (!zA3) {
                    if (this.u == null) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    this.u = ie30Var;
                    A(2, jElapsedRealtime, ie30Var, i12);
                }
                mgcVar = ie30Var;
            } else {
                executor = executor;
                mgcVar = 0;
                i10 = 10;
            }
        } else {
            executor = executor;
            mgcVar = 0;
            i10 = 10;
        }
        if (i(this.f154p)) {
            mgc mgcVar2 = this.f154p;
            ie30 ie30Var2 = (ie30) mgcVar2.c;
            if (ie30Var2.x != -1) {
                int i22 = mgcVar2.b;
                if (!Objects.equals(this.s, ie30Var2)) {
                    int i23 = (this.s == null && i22 == 0) ? 1 : i22;
                    this.s = ie30Var2;
                    A(1, jElapsedRealtime, ie30Var2, i23);
                }
                this.f154p = mgcVar;
            }
        }
        if (i(this.q)) {
            mgc mgcVar3 = this.q;
            ie30 ie30Var3 = (ie30) mgcVar3.c;
            int i24 = mgcVar3.b;
            if (!Objects.equals(this.t, ie30Var3)) {
                int i25 = (this.t == null && i24 == 0) ? 1 : i24;
                this.t = ie30Var3;
                A(0, jElapsedRealtime, ie30Var3, i25);
            }
            this.q = mgcVar;
        }
        if (i(this.r)) {
            mgc mgcVar4 = this.r;
            ie30 ie30Var4 = (ie30) mgcVar4.c;
            int i26 = mgcVar4.b;
            if (!Objects.equals(this.u, ie30Var4)) {
                int i27 = (this.u == null && i26 == 0) ? 1 : i26;
                this.u = ie30Var4;
                A(2, jElapsedRealtime, ie30Var4, i27);
            }
            this.r = mgcVar;
        }
        switch (v8o0.a(context).b()) {
            case 0:
                i11 = 0;
                break;
            case 1:
                i11 = i5;
                break;
            case 2:
                i11 = 2;
                break;
            case 3:
                i11 = 4;
                break;
            case 4:
                i11 = i6;
                break;
            case 5:
                i11 = i4;
                break;
            case 6:
            case 8:
            default:
                i11 = 1;
                break;
            case 7:
                i11 = 3;
                break;
            case 9:
                i11 = i2;
                break;
            case 10:
                i11 = i3;
                break;
        }
        if (i11 != this.n) {
            this.n = i11;
            executor.execute(new ag20(this, new NetworkEvent.Builder().setNetworkType(i11).setTimeSinceCreatedMillis(jElapsedRealtime - j).build(), (byte) 23));
        }
        if (r8u0Var.getPlaybackState() != 2) {
            this.v = false;
        }
        if (r8u0Var.L() == null) {
            this.x = false;
        } else if (em3Var.j(i10)) {
            this.x = true;
        }
        int playbackState = r8u0Var.getPlaybackState();
        if (!this.v) {
            if (!this.x) {
                if (playbackState == 4) {
                    z2 = true;
                    i7 = 11;
                } else {
                    i7 = 12;
                    int i28 = 2;
                    if (playbackState == 2) {
                        int i29 = this.m;
                        if (i29 == 0 || i29 == 2 || i29 == 12) {
                            i7 = i28;
                        } else if (r8u0Var.q()) {
                            i7 = r8u0Var.c0() != 0 ? i10 : i4;
                        } else {
                            i7 = i3;
                        }
                    } else {
                        i28 = 3;
                        if (playbackState != 3) {
                            z2 = true;
                            if (playbackState != 1 || this.m == 0) {
                                i7 = this.m;
                            }
                        } else if (!r8u0Var.q()) {
                            i7 = 4;
                        } else if (r8u0Var.c0() != 0) {
                            i7 = i5;
                        } else {
                            i7 = i28;
                        }
                    }
                }
            }
            if (this.m != i7) {
                this.m = i7;
                this.B = z2;
                executor.execute(new ag20(this, new PlaybackStateEvent.Builder().setState(this.m).setTimeSinceCreatedMillis(jElapsedRealtime - j).build(), (byte) 26));
            }
            if (em3Var.j(1028)) {
                hfsVar.c(em3Var.m(1028));
            }
        }
        i7 = i6;
        z2 = true;
        if (this.m != i7) {
            this.m = i7;
            this.B = z2;
            executor.execute(new ag20(this, new PlaybackStateEvent.Builder().setState(this.m).setTimeSinceCreatedMillis(jElapsedRealtime - j).build(), (byte) 26));
        }
        if (em3Var.j(1028)) {
            hfsVar.c(em3Var.m(1028));
        }
    }

    public final /* synthetic */ void v(NetworkEvent networkEvent) {
        this.d.reportNetworkEvent(networkEvent);
    }

    public final /* synthetic */ void w(PlaybackErrorEvent playbackErrorEvent) {
        this.d.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final /* synthetic */ void x(PlaybackStateEvent playbackStateEvent) {
        this.d.reportPlaybackStateEvent(playbackStateEvent);
    }

    public final /* synthetic */ void y(TrackChangeEvent trackChangeEvent) {
        this.d.reportTrackChangeEvent(trackChangeEvent);
    }

    public final void z(sqe1 sqe1Var, p2i0 p2i0Var) {
        int iB;
        PlaybackMetrics.Builder builder = this.k;
        if (p2i0Var == null || (iB = sqe1Var.b(p2i0Var.a)) == -1) {
            return;
        }
        dqe1 dqe1Var = this.g;
        int i = 0;
        sqe1Var.f(iB, dqe1Var, false);
        int i2 = dqe1Var.c;
        oqe1 oqe1Var = this.f;
        sqe1Var.m(i2, oqe1Var);
        soh0 soh0Var = oqe1Var.c.b;
        if (soh0Var != null) {
            int iN = zoi1.N(soh0Var.a, soh0Var.b);
            if (iN == 0) {
                i = 3;
            } else if (iN != 1) {
                i = iN != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (oqe1Var.m != -9223372036854775807L && !oqe1Var.k && !oqe1Var.i && !oqe1Var.c()) {
            builder.setMediaDurationMillis(zoi1.n0(oqe1Var.m));
        }
        builder.setPlaybackType(oqe1Var.c() ? 2 : 1);
        this.B = true;
    }

    @Override // p.q3u0
    public final void a(String str) {
    }

    @Override // p.q3u0
    public final void h(tz3 tz3Var, String str) {
    }
}
