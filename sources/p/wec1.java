package p;

import com.google.protobuf.Timestamp;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.stream_reporting_attribution.proto.StreamReportingAttributionOuterClass$StreamReportingAttribution;
import com.spotify.stream_reporting_debug_tracer_esperanto.proto.DebugTracerPlaybackIdRequest;
import com.spotify.stream_reporting_debug_tracer_esperanto.proto.DebugTracerRequest;
import com.spotify.stream_reporting_debug_tracer_esperanto.proto.DebugTracerStreamHandleRequest;
import com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass$StatusResponse;
import com.spotify.stream_reporting_esperanto.proto.StreamEndRequestOuterClass$StreamEndRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamHandleOuterClass$StreamHandle;
import com.spotify.stream_reporting_esperanto.proto.StreamProgressRequestOuterClass$StreamProgressRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamSeekRequestOuterClass$StreamSeekRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import com.spotify.streamreporting.streamreportingesperanto.StreamReportingException;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wec1 implements n590 {
    public final Disposable N0;
    public boolean O0;
    public StreamHandleOuterClass$StreamHandle P0;
    public long Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public float U0;
    public jgc1 V0;
    public u8i0 W0;
    public final lls0 X;
    public String X0;
    public final yqg Y;
    public String Y0;
    public final PublishSubject Z;
    public boolean Z0;
    public final m0u0 a;
    public boolean a1;
    public final String b;
    public koe1 b1;
    public final hec1 c;
    public m0u0 c1;
    public final t2j0 d;
    public boolean d1;
    public final lvw0 e;
    public iiq0 e1;
    public final np00 f;
    public int f1;
    public final Scheduler g;
    public final bas h;
    public final be i;
    public final boolean t;

    public wec1(m0u0 m0u0Var, String str, hec1 hec1Var, t2j0 t2j0Var, lvw0 lvw0Var, np00 np00Var, Scheduler scheduler, bas basVar, be beVar, boolean z, boolean z2, lls0 lls0Var, yqg yqgVar) {
        this.a = m0u0Var;
        this.b = str;
        this.c = hec1Var;
        this.d = t2j0Var;
        this.e = lvw0Var;
        this.f = np00Var;
        this.g = scheduler;
        this.h = basVar;
        this.i = beVar;
        this.t = z;
        this.X = lls0Var;
        this.Y = yqgVar;
        PublishSubject publishSubject = new PublishSubject();
        this.Z = publishSubject;
        Completable completableConcatMapCompletable = publishSubject.concatMapCompletable(new h5a1(this, (byte) 8));
        completableConcatMapCompletable.getClass();
        this.N0 = completableConcatMapCompletable.o(Functions.h).subscribe();
        this.f1 = 1;
        this.V0 = jgc1.g;
        this.W0 = u8i0.MEDIA_TYPE_UNKNOWN;
        this.Z0 = true;
        this.a1 = true;
        this.d1 = z2;
    }

    public static Timestamp I(long j) {
        sve1 sve1VarR = Timestamp.r();
        sve1VarR.q(j / 1000);
        sve1VarR.n((int) TimeUnit.MILLISECONDS.toNanos(j % 1000));
        return sve1VarR.build();
    }

    public static String U(wec1 wec1Var, String str) {
        m0u0 m0u0Var = wec1Var.a;
        Map mapP = (Map) wec1Var.h.a.invoke(m0u0Var);
        if (!mapP.containsKey("playback_id")) {
            mapP = sqg0.P(mapP, new mmr0("playback_id", zod.D(m0u0Var)));
        }
        String str2 = (String) mapP.get(str);
        return str2 == null ? (String) m0u0Var.a.d.get(str) : str2;
    }

    public final void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        int i;
        t2k1 configuration;
        W(w8r.DEBUG_TRACE_POINT_BETAMAX_STREAM_REPORTING_ON_PLAYBACK_CREATED);
        this.T0 = (z || videoSurfaceView == null || !videoSurfaceView.a1) ? false : true;
        String identifier = (videoSurfaceView == null || (configuration = videoSurfaceView.getConfiguration()) == null) ? null : configuration.getIdentifier();
        if (identifier == null || ihc1.y0(identifier)) {
            i = 1;
        } else if (identifier.equals("fullscreen")) {
            i = 2;
        } else if (identifier.equals("now-playing-bar")) {
            i = 3;
        } else if (identifier.equals("now-playing-sidebar")) {
            i = 4;
        } else if (identifier.equals("now-playing-view")) {
            i = 5;
        } else if (identifier.equals("now-playing-view-vertical-portrait")) {
            i = 6;
        } else {
            i = identifier.equals("picture-in-picture") ? 7 : 8;
        }
        this.f1 = i;
        this.S0 = z;
        this.Z0 = !z2;
        this.U0 = f;
    }

    public final void G(float f, long j, long j2) {
        this.Q0 = j;
        this.U0 = f;
        T(j, j2);
    }

    public final void H(VideoSurfaceView videoSurfaceView, long j, long j2) {
        int i;
        t2k1 configuration;
        this.T0 = videoSurfaceView != null ? videoSurfaceView.a1 : false;
        String identifier = (videoSurfaceView == null || (configuration = videoSurfaceView.getConfiguration()) == null) ? null : configuration.getIdentifier();
        if (identifier == null || ihc1.y0(identifier)) {
            i = 1;
        } else if (identifier.equals("fullscreen")) {
            i = 2;
        } else if (identifier.equals("now-playing-bar")) {
            i = 3;
        } else if (identifier.equals("now-playing-sidebar")) {
            i = 4;
        } else if (identifier.equals("now-playing-view")) {
            i = 5;
        } else if (identifier.equals("now-playing-view-vertical-portrait")) {
            i = 6;
        } else {
            i = identifier.equals("picture-in-picture") ? 7 : 8;
        }
        this.f1 = i;
        this.Q0 = j;
        T(j, j2);
    }

    public final void J(long j, long j2) {
        this.R0 = false;
        this.d1 = true;
        this.Q0 = j;
        T(j, j2);
    }

    public final void O(long j, long j2) {
        this.Q0 = j;
        this.R0 = true;
        T(j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0091  */
    /* JADX WARN: Code duplicated, block: B:21:0x0097  */
    /* JADX WARN: Code duplicated, block: B:22:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    public final void R(r4t r4tVar, int i, long j, long j2) {
        int iC;
        String str;
        this.Q0 = j;
        boolean z = this.d1;
        PublishSubject publishSubject = this.Z;
        if (z && !this.O0) {
            publishSubject.onNext(new ffc1(q(j, j2)));
        }
        iiq0 iiq0Var = this.e1;
        if (iiq0Var != null) {
            long j3 = iiq0Var.a;
            boolean z2 = iiq0Var.b;
            publishSubject.onNext(new ydc1(a(j3, j2)));
            afc1 afc1VarN = StreamSeekRequestOuterClass$StreamSeekRequest.n();
            afc1VarN.q(j3);
            afc1VarN.t(j);
            afc1VarN.n(I(j2));
            afc1VarN.r(!z2);
            publishSubject.onNext(new zec1(afc1VarN));
        }
        publishSubject.onNext(new ydc1(a(j, j2)));
        m0u0 m0u0Var = this.c1;
        if (m0u0Var != null) {
            Map mapP = (Map) this.h.a.invoke(m0u0Var);
            if (!mapP.containsKey("playback_id")) {
                mapP = sqg0.P(mapP, new mmr0("playback_id", zod.D(m0u0Var)));
            }
            str = (String) mapP.get("endvideo_reason_start");
            if (str == null) {
                str = (String) m0u0Var.a.d.get("endvideo_reason_start");
            }
            if (str == null) {
                iC = l1d.C(i);
                if (iC != 0) {
                    str = "trackdone";
                } else if (iC == 1) {
                    str = "endplay";
                } else if (iC != 2 || iC == 3 || iC == 4) {
                    str = "trackerror";
                } else {
                    if (iC != 5) {
                        eg.o();
                        return;
                    }
                    str = "endplay";
                }
            }
        } else {
            iC = l1d.C(i);
            if (iC != 0) {
                str = "trackdone";
            } else if (iC == 1) {
                str = "endplay";
            } else {
                if (iC != 2) {
                }
                str = "trackerror";
            }
        }
        mdc1 mdc1VarN = StreamEndRequestOuterClass$StreamEndRequest.n();
        mdc1VarN.q(cuo1.F(str));
        mdc1VarN.n(I(j2));
        publishSubject.onNext(new ldc1(mdc1VarN, r4tVar.c()));
    }

    public final void S(long j, long j2) {
        String strU = U(this, "interaction_id");
        if (strU == null) {
            strU = "";
        }
        this.X0 = strU;
        String strU2 = U(this, "page_instance_id");
        this.Y0 = strU2 != null ? strU2 : "";
        this.Q0 = j;
        this.Z.onNext(new ffc1(q(j, j2)));
        this.O0 = true;
        T(this.Q0, j2);
    }

    public final void T(long j, long j2) {
        if (this.O0 && this.e1 == null) {
            this.Z.onNext(new ydc1(a(j, j2)));
        }
    }

    public final void V(StatusResponseOuterClass$StatusResponse statusResponseOuterClass$StatusResponse, int i) {
        String str;
        w8r w8rVar;
        if ((statusResponseOuterClass$StatusResponse != null ? statusResponseOuterClass$StatusResponse.o() : null) != iub1.SUCCESS) {
            statusResponseOuterClass$StatusResponse.getClass();
            iub1 iub1VarO = statusResponseOuterClass$StatusResponse.o();
            if (i == 1) {
                str = "StreamStart";
            } else if (i == 2) {
                str = "StreamProgress";
            } else if (i != 3) {
                str = i != 4 ? "null" : "StreamEnd";
            } else {
                str = "StreamSeek";
            }
            StreamReportingException streamReportingException = new StreamReportingException(iub1VarO, "Error returned from StreamReportingService.".concat(str));
            lls0 lls0Var = this.X;
            if (lls0Var.b) {
                ((d3u0) lls0Var.c).invoke(streamReportingException);
            }
            this.d.a(x9p1.i(this.a, this.b, streamReportingException.a.getNumber(), streamReportingException));
            int iC = l1d.C(i);
            if (iC == 0) {
                w8rVar = w8r.DEBUG_TRACE_POINT_BETAMAX_STREAM_REPORTING_START_ERROR;
            } else if (iC == 1) {
                w8rVar = w8r.DEBUG_TRACE_POINT_BETAMAX_STREAM_REPORTING_PROGRESS_ERROR;
            } else if (iC == 2) {
                w8rVar = w8r.DEBUG_TRACE_POINT_BETAMAX_STREAM_REPORTING_SEEK_ERROR;
            } else {
                if (iC != 3) {
                    eg.o();
                    return;
                }
                w8rVar = w8r.DEBUG_TRACE_POINT_BETAMAX_STREAM_REPORTING_END_ERROR;
            }
            W(w8rVar);
        }
        if (i == 1) {
            W(w8r.DEBUG_TRACE_POINT_BETAMAX_STREAM_REPORTING_START_END);
        } else if (i == 4) {
            W(w8r.DEBUG_TRACE_POINT_BETAMAX_STREAM_REPORTING_END_END);
        }
    }

    public final void W(w8r w8rVar) {
        if (this.t) {
            StreamHandleOuterClass$StreamHandle streamHandleOuterClass$StreamHandle = this.P0;
            String strU = U(this, "playback_id");
            be beVar = this.i;
            if (streamHandleOuterClass$StreamHandle != null && strU != null) {
                p811 p811Var = new p811();
                z8r z8rVarN = DebugTracerRequest.n();
                z8rVarN.q(eth.M(strU));
                z8rVarN.r(streamHandleOuterClass$StreamHandle.o());
                z8rVarN.n(w8rVar);
                p811Var.a = beVar.callSingle("spotify.debug_tracer.proto.DebugTracerService", "trace", (DebugTracerRequest) z8rVarN.build()).map(bya0.T0).doFinally(new uec1(p811Var, (byte) 2)).subscribe(iqa1.t, new vec1(this, (byte) 2));
                return;
            }
            if (streamHandleOuterClass$StreamHandle != null) {
                p811 p811Var2 = new p811();
                a9r a9rVarN = DebugTracerStreamHandleRequest.n();
                a9rVarN.q(streamHandleOuterClass$StreamHandle.o());
                a9rVarN.n(w8rVar);
                p811Var2.a = beVar.callSingle("spotify.debug_tracer.proto.DebugTracerService", "trace_stream_handle", (DebugTracerStreamHandleRequest) a9rVarN.build()).map(olj0.U0).doFinally(new uec1(p811Var2, (byte) 1)).subscribe(iqa1.i, new vec1(this, (byte) 1));
                return;
            }
            if (strU != null) {
                p811 p811Var3 = new p811();
                y8r y8rVarN = DebugTracerPlaybackIdRequest.n();
                y8rVarN.q(eth.M(strU));
                y8rVarN.n(w8rVar);
                p811Var3.a = beVar.callSingle("spotify.debug_tracer.proto.DebugTracerService", "trace_playback_id", (DebugTracerPlaybackIdRequest) y8rVarN.build()).map(stf0.Y0).doFinally(new uec1(p811Var3, (byte) 0)).subscribe(iqa1.h, new vec1(this, (byte) 0));
            }
        }
    }

    public final void X(Throwable th) {
        lls0 lls0Var = this.X;
        if (lls0Var.b) {
            ((d3u0) lls0Var.c).invoke(th);
        }
        this.d.a(x9p1.i(this.a, this.b, th.hashCode(), th));
    }

    public final zdc1 a(long j, long j2) {
        zdc1 zdc1VarN = StreamProgressRequestOuterClass$StreamProgressRequest.n();
        zdc1VarN.q(j);
        zdc1VarN.u(this.R0);
        boolean z = this.Z0;
        int i = 0;
        u8i0 u8i0Var = u8i0.AUDIO;
        zdc1VarN.v(z && this.W0 != u8i0Var);
        zdc1VarN.r(this.a1);
        zdc1VarN.s(this.S0);
        zdc1VarN.t(this.T0);
        int i2 = this.f1;
        if (this.Z0 && this.W0 != u8i0Var) {
            i = i2;
        }
        zdc1VarN.z(cuo1.K(i != 0 ? i : 1));
        zdc1VarN.w(this.U0);
        zdc1VarN.x(this.R0 ? r5u0.PAUSED : r5u0.ACTIVE);
        zdc1VarN.n(I(j2));
        return zdc1VarN;
    }

    public final void d(long j, long j2, boolean z) {
        this.S0 = z;
        this.Q0 = j;
        if (z) {
            this.T0 = false;
        }
        T(j, j2);
    }

    public final void h(m0u0 m0u0Var) {
        this.c1 = m0u0Var;
    }

    public final void j(int i, jgc1 jgc1Var, long j) {
        u8i0 u8i0Var;
        this.V0 = jgc1Var;
        int iC = l1d.C(i);
        if (iC == 0) {
            u8i0Var = u8i0.MEDIA_TYPE_UNKNOWN;
        } else if (iC == 1) {
            u8i0Var = u8i0.AUDIO;
        } else {
            if (iC != 2) {
                eg.o();
                return;
            }
            u8i0Var = u8i0.VIDEO;
        }
        this.W0 = u8i0Var;
    }

    public final void k(long j, long j2) {
        koe1 koe1Var = this.b1;
        np00 np00Var = this.f;
        if (koe1Var != null) {
            np00Var.c(koe1Var);
            this.b1 = null;
        }
        this.b1 = np00Var.a(j, new y281(this, (byte) 16));
    }

    public final void l(long j, long j2, long j3, boolean z) {
        this.e1 = null;
        this.Q0 = j2;
        T(j, j3);
        if (this.O0) {
            afc1 afc1VarN = StreamSeekRequestOuterClass$StreamSeekRequest.n();
            afc1VarN.q(j);
            afc1VarN.t(j2);
            afc1VarN.n(I(j3));
            afc1VarN.r(!z);
            this.Z.onNext(new zec1(afc1VarN));
        }
    }

    public final void n(long j, long j2, boolean z) {
        this.Z0 = !z;
        this.Q0 = j;
        T(j, j2);
    }

    public final void o(int i, long j, long j2) {
        this.a1 = i == 1;
        this.Q0 = j;
        T(j, j2);
    }

    public final void p(long j, long j2, long j3, boolean z) {
        if (this.e1 == null) {
            this.e1 = new iiq0(j, z);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:97:0x01b5  */
    public final StreamStartRequestOuterClass$StreamStartRequest q(long j, long j2) {
        String str;
        gfc1 gfc1VarP = StreamStartRequestOuterClass$StreamStartRequest.p();
        String strU = U(this, "playback_id");
        if (strU != null) {
            gfc1VarP.N(eth.M(strU));
        } else {
            gfc1VarP.q();
        }
        gfc1VarP.O();
        m0u0 m0u0Var = this.a;
        gfc1VarP.X(m0u0Var.d);
        String strU2 = U(this, "endvideo_track_uri");
        if (strU2 == null) {
            strU2 = "";
        }
        gfc1VarP.w(strU2);
        String strU3 = U(this, "endvideo_context_uri");
        if (strU3 == null) {
            strU3 = "";
        }
        gfc1VarP.L(strU3);
        String strU4 = U(this, "endvideo_provider");
        if (strU4 == null) {
            strU4 = "";
        }
        gfc1VarP.S(strU4);
        String strU5 = U(this, "endvideo_referrer_identifier");
        if (strU5 == null) {
            strU5 = "";
        }
        gfc1VarP.U(strU5);
        gfc1VarP.W(cuo1.I((String) this.e.b.h()));
        String strU6 = U(this, "endvideo_device_identifier");
        if (strU6 == null) {
            strU6 = "";
        }
        gfc1VarP.u(strU6);
        String str2 = this.Y0;
        if (str2 == null) {
            str2 = "";
        }
        gfc1VarP.K(str2);
        String str3 = this.X0;
        if (str3 == null) {
            str3 = "";
        }
        gfc1VarP.B(str3);
        gfc1VarP.T(cuo1.F(U(this, "endvideo_reason_start")));
        gfc1VarP.E(u890.j(U(this, "endvideo_is_shuffling_context"), "true"));
        String strU7 = U(this, "media.manifest_id");
        if (strU7 == null) {
            strU7 = "";
        }
        String strW = wqn1.w(m0u0Var.a.a);
        if (strW != null) {
            strU7 = strW;
        }
        gfc1VarP.G(strU7);
        gfc1VarP.H(this.W0);
        gfc1VarP.P(j2);
        gfc1VarP.V(j);
        int i = 0;
        gfc1VarP.D(this.V0 == jgc1.c);
        gfc1VarP.v(this.V0 == jgc1.e);
        gfc1VarP.s(u890.j(U(this, "endvideo_is_client_offline"), "true"));
        String strU8 = U(this, "endvideo_feature_uuid");
        if (strU8 == null) {
            strU8 = "";
        }
        gfc1VarP.A(strU8);
        String strU9 = U(this, "endvideo_decision_id");
        if (strU9 == null) {
            strU9 = "";
        }
        gfc1VarP.y(strU9);
        String strU10 = U(this, "endvideo_play_context_decision_id");
        if (strU10 == null) {
            strU10 = "";
        }
        gfc1VarP.M(strU10);
        gfc1VarP.t(I(j2));
        gfc1VarP.C(this.a1);
        boolean z = this.Z0;
        u8i0 u8i0Var = u8i0.AUDIO;
        gfc1VarP.F(z && this.W0 != u8i0Var);
        int i2 = this.f1;
        if (this.Z0 && this.W0 != u8i0Var) {
            i = i2;
        }
        gfc1VarP.Y(cuo1.K(i != 0 ? i : 1));
        String strU11 = U(this, "endvideo_session_id");
        gfc1VarP.Q(strU11 != null ? strU11 : "");
        String strU12 = U(this, "preview_impression_uri");
        if (strU12 != null) {
            gfc1VarP.R(strU12);
        }
        String strU13 = U(this, "on_demand_type");
        if (strU13 != null) {
            gfc1VarP.I(strU13);
        }
        String strU14 = U(this, "entrypoint_uri");
        if (strU14 != null) {
            gfc1VarP.z(strU14);
        }
        String strU15 = U(this, "custom_reporting_attribution");
        if (strU15 != null) {
            gfc1VarP.x(strU15);
        }
        StreamReportingAttributionOuterClass$StreamReportingAttribution streamReportingAttributionOuterClass$StreamReportingAttributionT = rjo1.t(new kmy(1, this, wec1.class, "getMetadata", "getMetadata(Ljava/lang/String;Lcom/spotify/betamax/player/PlaybackIdentity;)Ljava/lang/String;", 0, (byte) 4));
        if (streamReportingAttributionOuterClass$StreamReportingAttributionT != null) {
            gfc1VarP.r(streamReportingAttributionOuterClass$StreamReportingAttributionT);
        }
        String strU16 = U(this, "orchestration_stack");
        kqq0 kqq0Var = kqq0.ORCHESTRATION_STACK_STANDALONE;
        if (strU16 != null) {
            int iHashCode = strU16.hashCode();
            kqq0 kqq0Var2 = kqq0.ORCHESTRATION_STACK_UNKNOWN;
            switch (iHashCode) {
                case -1284644795:
                    if (!strU16.equals("standalone")) {
                        kqq0Var = kqq0Var2;
                    }
                    break;
                case -481333391:
                    if (!strU16.equals("context_player")) {
                        kqq0Var = kqq0Var2;
                    } else {
                        kqq0Var = kqq0.ORCHESTRATION_STACK_CONTEXT_PLAYER;
                    }
                    break;
                case -284840886:
                    str = "unknown";
                    strU16.equals(str);
                    kqq0Var = kqq0Var2;
                    break;
                case 370121122:
                    str = "list_player";
                    strU16.equals(str);
                    kqq0Var = kqq0Var2;
                    break;
                case 562356570:
                    if (!strU16.equals("multiplayer")) {
                        kqq0Var = kqq0Var2;
                    } else {
                        kqq0Var = kqq0.ORCHESTRATION_STACK_MULTIPLAYER;
                    }
                    break;
                default:
                    kqq0Var = kqq0Var2;
                    break;
            }
        }
        gfc1VarP.J(kqq0Var);
        return (StreamStartRequestOuterClass$StreamStartRequest) gfc1VarP.build();
    }

    public final void t() {
        iu30 iu30Var = this.h.b;
        if (iu30Var != null) {
            iu30Var.invoke(this.a);
        }
    }
}
