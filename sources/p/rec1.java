package p;

import com.google.protobuf.Timestamp;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.stream_reporting_attribution.proto.StreamReportingAttributionOuterClass$StreamReportingAttribution;
import com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass$StatusResponse;
import com.spotify.stream_reporting_esperanto.proto.StreamEndRequestOuterClass$StreamEndRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamHandleOuterClass$StreamHandle;
import com.spotify.stream_reporting_esperanto.proto.StreamProgressRequestOuterClass$StreamProgressRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamSeekRequestOuterClass$StreamSeekRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamStartResponseOuterClass$StreamStartResponse;
import com.spotify.streamreporting.streamreportingesperanto.StreamReportingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rec1 implements n590, c0u0 {
    public boolean N0;
    public boolean O0;
    public StreamHandleOuterClass$StreamHandle P0;
    public long Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public float U0;
    public jgc1 V0;
    public u8i0 W0;
    public m0u0 X;
    public String X0;
    public np00 Y;
    public String Y0;
    public boolean Z;
    public boolean Z0;
    public final jn7 a;
    public boolean a1;
    public final lvw0 b;
    public koe1 b1;
    public final yqg c;
    public m0u0 c1;
    public final bas d;
    public boolean d1;
    public final String e;
    public hiq0 e1;
    public final q8n f;
    public boolean f1;
    public final boolean g;
    public lls0 g1;
    public final bbc h = mno1.a(Integer.MAX_VALUE, 0, 6);
    public int h1;
    public final llm i;
    public final xab1 t;

    public rec1(String str, jn7 jn7Var, yqg yqgVar, q8n q8nVar, q8n q8nVar2, bas basVar, lvw0 lvw0Var, boolean z) {
        this.a = jn7Var;
        this.b = lvw0Var;
        this.c = yqgVar;
        this.d = basVar;
        this.e = str;
        this.f = q8nVar2;
        this.g = z;
        llm llmVarH = us71.h(q8nVar);
        this.i = llmVarH;
        this.t = fn31.T(llmVarH, (o8n) null, 0, new xba1(this, null, (byte) 16), 3);
        this.h1 = 1;
        this.V0 = jgc1.g;
        this.W0 = u8i0.MEDIA_TYPE_UNKNOWN;
        this.Z0 = true;
        this.a1 = true;
        this.d1 = this.Z;
    }

    public static Timestamp I(long j) {
        sve1 sve1VarR = Timestamp.r();
        sve1VarR.q(j / 1000);
        sve1VarR.n((int) TimeUnit.MILLISECONDS.toNanos(j % 1000));
        return sve1VarR.build();
    }

    public static String U(rec1 rec1Var, String str) {
        m0u0 m0u0Var = rec1Var.X;
        m0u0Var.getClass();
        Map mapP = (Map) rec1Var.d.a.invoke(m0u0Var);
        if (!mapP.containsKey("playback_id")) {
            mapP = sqg0.P(mapP, new mmr0("playback_id", zod.D(m0u0Var)));
        }
        String str2 = (String) mapP.get(str);
        return str2 == null ? (String) m0u0Var.a.d.get(str) : str2;
    }

    public final void B(boolean z, boolean z2, float f, VideoSurfaceView videoSurfaceView, long j) {
        int i;
        t2k1 configuration;
        this.S0 = z;
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
        this.h1 = i;
        this.Z0 = !z2;
        this.U0 = f;
    }

    public final void G(float f, long j, long j2) {
        if (this.N0) {
            this.Q0 = j;
            this.U0 = f;
            T(j, j2);
        }
    }

    public final void H(VideoSurfaceView videoSurfaceView, long j, long j2) {
        int i;
        t2k1 configuration;
        if (this.N0) {
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
            this.h1 = i;
            this.Q0 = j;
            T(j, j2);
        }
    }

    public final void J(long j, long j2) {
        if (this.N0) {
            this.R0 = false;
            this.d1 = true;
            this.Q0 = j;
            T(j, j2);
        }
    }

    public final void O(long j, long j2) {
        if (this.N0) {
            this.Q0 = j;
            this.R0 = true;
            T(j, j2);
        }
    }

    public final void Q(long j, long j2, boolean z) {
        if (this.N0) {
            this.a1 = !z;
            this.Q0 = j;
            T(j, j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
    public final void R(r4t r4tVar, int i, long j, long j2) {
        int iC;
        String str;
        if (this.N0) {
            koe1 koe1Var = this.b1;
            if (koe1Var != null) {
                np00 np00Var = this.Y;
                if (np00Var != null) {
                    np00Var.c(koe1Var);
                }
                this.b1 = null;
            }
            this.Q0 = j;
            boolean z = this.d1;
            bbc bbcVar = this.h;
            if (z && !this.O0) {
                bbcVar.l(new efc1(q(j, j2)));
            }
            hiq0 hiq0Var = this.e1;
            if (hiq0Var != null) {
                long j3 = hiq0Var.a;
                boolean z2 = hiq0Var.b;
                bbcVar.l(new xdc1(a(j3, j2)));
                afc1 afc1VarN = StreamSeekRequestOuterClass$StreamSeekRequest.n();
                afc1VarN.q(j3);
                afc1VarN.t(j);
                afc1VarN.n(I(j2));
                afc1VarN.r(!z2);
                bbcVar.l(new yec1(afc1VarN));
            }
            bbcVar.l(new xdc1(a(j, j2)));
            m0u0 m0u0Var = this.c1;
            if (m0u0Var != null) {
                Map mapP = (Map) this.d.a.invoke(m0u0Var);
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
            bbcVar.l(new kdc1(mdc1VarN, r4tVar.c()));
        }
    }

    public final void S(long j, long j2) {
        if (this.N0) {
            String strU = U(this, "interaction_id");
            if (strU == null) {
                strU = "";
            }
            this.X0 = strU;
            String strU2 = U(this, "page_instance_id");
            this.Y0 = strU2 != null ? strU2 : "";
            this.Q0 = j;
            this.h.l(new efc1(q(j, j2)));
            this.O0 = true;
            T(this.Q0, j2);
        }
    }

    public final void T(long j, long j2) {
        if (this.O0 && this.e1 == null) {
            this.h.l(new xdc1(a(j, j2)));
        }
    }

    public final void V(StatusResponseOuterClass$StatusResponse statusResponseOuterClass$StatusResponse, int i) {
        String str;
        if (statusResponseOuterClass$StatusResponse == null || statusResponseOuterClass$StatusResponse.o() != iub1.SUCCESS) {
            iub1 iub1VarO = statusResponseOuterClass$StatusResponse != null ? statusResponseOuterClass$StatusResponse.o() : iub1.UNRECOGNIZED;
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
            lls0 lls0Var = this.g1;
            if (lls0Var == null || !lls0Var.b) {
                return;
            }
            ((d3u0) lls0Var.c).invoke(streamReportingException);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W(mdc1 mdc1Var, rm5 rm5Var, lnm lnmVar) {
        mec1 mec1Var;
        if (lnmVar instanceof mec1) {
            mec1Var = (mec1) lnmVar;
            int i = mec1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mec1Var.d = i - Integer.MIN_VALUE;
            } else {
                mec1Var = new mec1(this, lnmVar);
            }
        } else {
            mec1Var = new mec1(this, lnmVar);
        }
        Object objY = mec1Var.b;
        int i2 = mec1Var.d;
        rih1 rih1Var = rih1.a;
        llm llmVar = this.i;
        xab1 xab1Var = this.t;
        bbc bbcVar = this.h;
        lnm lnmVar2 = null;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                if (this.P0 == null) {
                    rm5Var.H();
                    return rih1Var;
                }
                q8n q8nVar = this.f;
                sb91 sb91Var = new sb91(this, mdc1Var, lnmVar2, (byte) 28);
                mec1Var.a = rm5Var;
                mec1Var.d = 1;
                objY = fn31.Y(q8nVar, sb91Var, mec1Var);
                d9n d9nVar = d9n.a;
                if (objY == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rm5Var = mec1Var.a;
                hm5.M(objY);
            }
            V((StatusResponseOuterClass$StatusResponse) objY, 4);
        } catch (CancellationException e) {
            try {
                throw e;
            } catch (Throwable th) {
                bbcVar.H((Throwable) null);
                xab1Var.d((CancellationException) null);
                smo1.p(llmVar, (CancellationException) null);
                this.P0 = null;
                this.O0 = false;
                rm5Var.H();
                throw th;
            }
        } catch (Throwable unused) {
        }
        bbcVar.H((Throwable) null);
        xab1Var.d((CancellationException) null);
        smo1.p(llmVar, (CancellationException) null);
        this.P0 = null;
        this.O0 = false;
        rm5Var.H();
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X(zdc1 zdc1Var, lnm lnmVar) {
        nec1 nec1Var;
        if (lnmVar instanceof nec1) {
            nec1Var = (nec1) lnmVar;
            int i = nec1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nec1Var.c = i - Integer.MIN_VALUE;
            } else {
                nec1Var = new nec1(this, lnmVar);
            }
        } else {
            nec1Var = new nec1(this, lnmVar);
        }
        Object objY = nec1Var.a;
        int i2 = nec1Var.c;
        lnm lnmVar2 = null;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                if (this.P0 != null) {
                    q8n q8nVar = this.f;
                    sb91 sb91Var = new sb91(this, zdc1Var, lnmVar2, (byte) 29);
                    nec1Var.c = 1;
                    objY = fn31.Y(q8nVar, sb91Var, nec1Var);
                    d9n d9nVar = d9n.a;
                    if (objY == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
            V((StatusResponseOuterClass$StatusResponse) objY, 2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y(afc1 afc1Var, lnm lnmVar) {
        oec1 oec1Var;
        if (lnmVar instanceof oec1) {
            oec1Var = (oec1) lnmVar;
            int i = oec1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                oec1Var.c = i - Integer.MIN_VALUE;
            } else {
                oec1Var = new oec1(this, lnmVar);
            }
        } else {
            oec1Var = new oec1(this, lnmVar);
        }
        Object objY = oec1Var.a;
        int i2 = oec1Var.c;
        lnm lnmVar2 = null;
        rih1 rih1Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                if (this.P0 != null) {
                    q8n q8nVar = this.f;
                    pec1 pec1Var = new pec1(this, afc1Var, lnmVar2, (byte) 0);
                    oec1Var.c = 1;
                    objY = fn31.Y(q8nVar, pec1Var, oec1Var);
                    d9n d9nVar = d9n.a;
                    if (objY == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
            V((StatusResponseOuterClass$StatusResponse) objY, 3);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z(StreamStartRequestOuterClass$StreamStartRequest streamStartRequestOuterClass$StreamStartRequest, lnm lnmVar) {
        qec1 qec1Var;
        if (lnmVar instanceof qec1) {
            qec1Var = (qec1) lnmVar;
            int i = qec1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qec1Var.c = i - Integer.MIN_VALUE;
            } else {
                qec1Var = new qec1(this, lnmVar);
            }
        } else {
            qec1Var = new qec1(this, lnmVar);
        }
        Object objY = qec1Var.a;
        int i2 = qec1Var.c;
        lnm lnmVar2 = null;
        rih1 rih1Var = rih1.a;
        byte b = 1;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                if (this.P0 == null) {
                    q8n q8nVar = this.f;
                    pec1 pec1Var = new pec1(this, streamStartRequestOuterClass$StreamStartRequest, lnmVar2, b);
                    qec1Var.c = 1;
                    objY = fn31.Y(q8nVar, pec1Var, qec1Var);
                    d9n d9nVar = d9n.a;
                    if (objY == d9nVar) {
                        return d9nVar;
                    }
                }
                return rih1Var;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
            StreamStartResponseOuterClass$StreamStartResponse streamStartResponseOuterClass$StreamStartResponse = (StreamStartResponseOuterClass$StreamStartResponse) objY;
            this.P0 = streamStartResponseOuterClass$StreamStartResponse.o();
            V(streamStartResponseOuterClass$StreamStartResponse.n(), 1);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        return rih1Var;
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
        int i2 = this.h1;
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
        if (this.N0) {
            this.S0 = z;
            this.Q0 = j;
            if (z) {
                this.T0 = false;
            }
            T(j, j2);
        }
    }

    public final void h(m0u0 m0u0Var) {
        if (this.N0) {
            this.c1 = m0u0Var;
        }
    }

    public final void j(int i, jgc1 jgc1Var, long j) {
        u8i0 u8i0Var;
        if (this.N0) {
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
    }

    public final void k(long j, long j2) {
        if (this.N0) {
            koe1 koe1Var = this.b1;
            if (koe1Var != null) {
                np00 np00Var = this.Y;
                if (np00Var != null) {
                    np00Var.c(koe1Var);
                }
                this.b1 = null;
            }
            np00 np00Var2 = this.Y;
            this.b1 = np00Var2 != null ? np00Var2.a(j, new xq81(this, (byte) 12)) : null;
        }
    }

    public final void l(long j, long j2, long j3, boolean z) {
        if (this.N0) {
            this.e1 = null;
            this.Q0 = j2;
            T(j, j3);
            if (this.O0) {
                afc1 afc1VarN = StreamSeekRequestOuterClass$StreamSeekRequest.n();
                afc1VarN.q(j);
                afc1VarN.t(j2);
                afc1VarN.n(I(j3));
                afc1VarN.r(!z);
                this.h.l(new yec1(afc1VarN));
            }
        }
    }

    public final void n(long j, long j2, boolean z) {
        if (this.N0) {
            this.Z0 = !z;
            this.Q0 = j;
            T(j, j2);
        }
    }

    public final void p(long j, long j2, long j3, boolean z) {
        if (this.N0 && this.e1 == null) {
            this.e1 = new hiq0(j, z);
        }
    }

    public final StreamStartRequestOuterClass$StreamStartRequest q(long j, long j2) {
        if (this.g && !this.f1) {
            List listM = p7h.M(new mmr0[]{new mmr0("playback_id", U(this, "playback_id")), new mmr0("interaction_id", U(this, "interaction_id")), new mmr0("page_instance_id", U(this, "page_instance_id")), new mmr0("content_uri", U(this, "endvideo_track_uri"))});
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM) {
                String str = (String) ((mmr0) obj).b;
                if (str == null || str.length() == 0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((String) ((mmr0) it.next()).a);
            }
            if (!arrayList2.isEmpty()) {
                n57.e("Multiplayer playback started with missing or empty stream reporting fields: ".concat(o7h.y0(arrayList2, (CharSequence) null, (String) null, (String) null, (iu30) null, 63)));
            }
        }
        this.f1 = true;
        gfc1 gfc1VarP = StreamStartRequestOuterClass$StreamStartRequest.p();
        String strU = U(this, "playback_id");
        if (strU != null) {
            gfc1VarP.N(eth.M(strU));
        } else {
            gfc1VarP.q();
        }
        gfc1VarP.O();
        m0u0 m0u0Var = this.X;
        m0u0Var.getClass();
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
        gfc1VarP.W(cuo1.I((String) this.b.b.h()));
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
        m0u0 m0u0Var2 = this.X;
        m0u0Var2.getClass();
        String strU7 = U(this, "media.manifest_id");
        if (strU7 == null) {
            strU7 = "";
        }
        String strW = wqn1.w(m0u0Var2.a.a);
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
        int i2 = this.h1;
        if (this.Z0 && this.W0 != u8i0Var) {
            i = i2;
        }
        gfc1VarP.Y(cuo1.K(i != 0 ? i : 1));
        String strU11 = U(this, "endvideo_session_id");
        gfc1VarP.Q(strU11 != null ? strU11 : "");
        gfc1VarP.n(this.e);
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
        StreamReportingAttributionOuterClass$StreamReportingAttribution streamReportingAttributionOuterClass$StreamReportingAttributionT = rjo1.t(new kmy(1, this, rec1.class, "getMetadata", "getMetadata(Ljava/lang/String;Lcom/spotify/betamax/player/PlaybackIdentity;)Ljava/lang/String;", 0, (byte) 3));
        if (streamReportingAttributionOuterClass$StreamReportingAttributionT != null) {
            gfc1VarP.r(streamReportingAttributionOuterClass$StreamReportingAttributionT);
        }
        gfc1VarP.J(kqq0.ORCHESTRATION_STACK_MULTIPLAYER);
        return (StreamStartRequestOuterClass$StreamStartRequest) gfc1VarP.build();
    }

    public final void t() {
        iu30 iu30Var;
        m0u0 m0u0Var = this.X;
        if (m0u0Var == null || (iu30Var = this.d.b) == null) {
            return;
        }
        iu30Var.invoke(m0u0Var);
    }
}
