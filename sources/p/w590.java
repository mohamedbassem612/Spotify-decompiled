package p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.player.model.ContextTrack$Metadata;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w590 {
    public final esm0 a;
    public final n0g0 b;
    public final c4z c;
    public final c4z d;
    public final nsm0 e;
    public final sr20 f;
    public final uoa g;
    public final lbc0 h;
    public final cv7 i;
    public final tec1 j;
    public final boolean k;
    public final int l;
    public final llm m;
    public boolean n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f84p;
    public tv80 q;
    public yjp1 r;
    public VideoSurfaceView s;

    public w590(esm0 esm0Var, n0g0 n0g0Var, c4z c4zVar, c4z c4zVar2, nsm0 nsm0Var, sr20 sr20Var, uoa uoaVar, lbc0 lbc0Var, cv7 cv7Var, tec1 tec1Var, boolean z, int i) {
        this.a = esm0Var;
        this.b = n0g0Var;
        this.c = c4zVar;
        this.d = c4zVar2;
        this.e = nsm0Var;
        this.f = sr20Var;
        this.g = uoaVar;
        this.h = lbc0Var;
        this.i = cv7Var;
        this.j = tec1Var;
        this.k = z;
        this.l = i;
        llm llmVarE = smo1.e(flo1.l(op71.f(), igu.b));
        this.m = llmVarE;
        this.n = true;
        fn31.T(llmVarE, (o8n) null, 0, new mx(this, (lnm) null, (byte) 26), 3);
    }

    public static void h(VideoSurfaceView videoSurfaceView, int i) {
        int i2 = i == 0 ? -1 : v590.b[l1d.C(i)];
        if (i2 != -1) {
            if (i2 == 1) {
                if (videoSurfaceView != null) {
                    videoSurfaceView.setEnableVideoScreenRecording(true);
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    return;
                }
                eg.o();
            } else if (videoSurfaceView != null) {
                videoSurfaceView.setEnableVideoScreenRecording(false);
            }
        }
    }

    public final String i() {
        m0u0 m0u0VarE = this.g.e();
        if (m0u0VarE != null) {
            return m0u0VarE.d;
        }
        return null;
    }

    public final bpb1 j() {
        return (bpb1) this.i.b;
    }

    public final void k(lsm0 lsm0Var) {
        cv7 cv7Var = this.i;
        if (u890.j(((z590) ((bpb1) cv7Var.b).getValue()).a, lsm0Var)) {
            return;
        }
        cv7Var.c(new tla(lsm0Var, (byte) 3));
        l(lsm0Var, false, null, null, null, null, false);
    }

    /* JADX WARN: Code duplicated, block: B:88:0x01ac  */
    public final void l(lsm0 lsm0Var, boolean z, yjp1 yjp1Var, tv80 tv80Var, Long l, String str, boolean z2) {
        Long l2;
        Long l3;
        tec1 tec1Var;
        if (!z2) {
            v();
        }
        this.i.c(new tla(lsm0Var, (byte) 3));
        this.r = yjp1Var;
        VideoSurfaceView videoSurfaceView = this.s;
        int i = lsm0Var.j;
        jsm0 jsm0Var = lsm0Var.e;
        boolean z3 = lsm0Var.i;
        ksm0 ksm0Var = lsm0Var.b;
        h(videoSurfaceView, i);
        ujo1 ujo1Var = ksm0Var.a;
        ujo1 ujo1Var2 = ksm0Var.a;
        if ((ujo1Var instanceof gec1) && (tec1Var = this.j) != null) {
            tec1Var.i = new rec1(tec1Var.e, tec1Var.a, tec1Var.c, tec1Var.g, tec1Var.h, tec1Var.d, tec1Var.b, tec1Var.f);
        }
        boolean z4 = false;
        uoa uoaVar = this.g;
        if (z && this.n) {
            y2g1 y2g1Var = (y2g1) this.b.invoke();
            y2g1Var.a = l != null ? l.longValue() : ((yqg) y2g1Var.c).b();
            uoaVar.s(y2g1Var);
            this.n = false;
        }
        uoaVar.q(lsm0Var.c && !(ujo1Var2 instanceof gec1));
        xkg0 xkg0Var = new xkg0();
        String str2 = ujo1Var2 instanceof gec1 ? ((gec1) ujo1Var2).c : null;
        xkg0Var.put("video_surface_identifier", lsm0Var.h);
        xkg0Var.put("betamax_override_feature_identifier", ksm0Var.d);
        xkg0Var.put("is_multiplayer_playback", "true");
        xkg0Var.put("orchestration_stack", "multiplayer");
        String str3 = ksm0Var.b;
        if (str3 != null) {
        }
        String str4 = ksm0Var.c;
        if (str4 != null) {
        }
        String str5 = ksm0Var.f;
        if (str5 != null) {
        }
        String str6 = ksm0Var.g;
        if (str6 != null) {
        }
        String str7 = ksm0Var.h;
        if (str7 != null) {
        }
        String str8 = ksm0Var.i;
        if (str8 != null) {
        }
        if (tv80Var != null) {
            xkg0 xkg0VarV = c97.v(tv80Var);
            String str9 = (String) xkg0VarV.get(ContextTrack$Metadata.KEY_INTERACTION_ID);
            if (str9 != null) {
            }
            String str10 = (String) xkg0VarV.get("page_id");
            if (str10 != null) {
            }
            String str11 = (String) xkg0VarV.get("root_specification_id");
            if (str11 != null) {
            }
            String str12 = (String) xkg0VarV.get("leaf_specification_id");
            if (str12 != null) {
            }
        }
        if (str != null) {
        }
        if (str2 != null) {
        }
        String str13 = this.a.a;
        if (str13 != null) {
        }
        if (yjp1Var != null) {
            xkg0Var.put("provenance_id", yjp1Var.b);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) xkg0Var.b());
        linkedHashMap.put("metadata_keys.internal.is_royalty_media", String.valueOf(ujo1Var2 instanceof gec1));
        boolean z5 = (ujo1Var2 instanceof gec1) && !this.k;
        String str14 = lsm0Var.a;
        int i2 = this.l;
        int i3 = i2 == 0 ? -1 : v590.a[l1d.C(i2)];
        if (i3 == -1) {
            z4 = true;
        } else if (i3 != 1) {
            if (i3 == 2) {
                z4 = true;
            } else {
                if (i3 != 3) {
                    eg.o();
                    return;
                }
                z4 = z3;
            }
        }
        o2u0 o2u0Var = new o2u0(str14, z4, z5, linkedHashMap);
        long jLongValue = (jsm0Var == null || (l3 = jsm0Var.a) == null) ? lsm0Var.f : l3.longValue();
        long jLongValue2 = (jsm0Var == null || (l2 = jsm0Var.b) == null) ? 0L : l2.longValue();
        boolean z6 = lsm0Var.d;
        ism0 ism0Var = lsm0Var.g;
        oot0 oot0Var = new oot0(jLongValue, jLongValue2, z, z6, ism0Var != null ? new hu7(ism0Var.a, true) : null, (tne1) null, false, 224);
        uoaVar.t(z3);
        uoaVar.h(o2u0Var, oot0Var);
    }

    public final rm51 m(int i, long j, int i2) {
        p3u0 p3u0Var = this.g.f;
        if (p3u0Var != null) {
            return p3u0Var.o0(i, j, i2);
        }
        return null;
    }

    public final void n() {
        this.g.p(3);
    }

    public final void o() {
        this.g.f();
    }

    public final void p(lsm0 lsm0Var, tv80 tv80Var, Long l, String str, yjp1 yjp1Var) {
        bpb1 bpb1Var = (bpb1) this.i.b;
        if (!u890.j(((z590) bpb1Var.getValue()).a, lsm0Var) || (((z590) bpb1Var.getValue()).c instanceof k091)) {
            l(lsm0Var, true, yjp1Var, tv80Var, l, str, false);
        } else {
            r(tv80Var, l, str, yjp1Var);
        }
    }

    public final void q() {
        smo1.p(this.m, (CancellationException) null);
        u(null);
        this.h.invoke(this.g);
    }

    public final void r(tv80 tv80Var, Long l, String str, yjp1 yjp1Var) {
        boolean z = this.n;
        uoa uoaVar = this.g;
        if (z) {
            y2g1 y2g1Var = (y2g1) this.b.invoke();
            y2g1Var.a = l != null ? l.longValue() : ((yqg) y2g1Var.c).b();
            uoaVar.s(y2g1Var);
            this.n = false;
        }
        m0u0 m0u0VarE = uoaVar.e();
        String str2 = m0u0VarE != null ? m0u0VarE.d : null;
        if (str2 != null && tv80Var != null) {
            this.c.invoke(str2, tv80Var);
            this.q = tv80Var;
        }
        m0u0 m0u0VarE2 = uoaVar.e();
        String str3 = m0u0VarE2 != null ? m0u0VarE2.d : null;
        if (str3 != null && str != null) {
            this.f84p = str;
            this.d.invoke(str3, str);
        }
        m0u0 m0u0VarE3 = uoaVar.e();
        String str4 = m0u0VarE3 != null ? m0u0VarE3.d : null;
        if (str4 != null && yjp1Var != null) {
            this.r = yjp1Var;
            this.e.invoke(str4, yjp1Var.b);
        }
        uoaVar.l();
    }

    public final void s(long j) {
        uoa.m(this.g, j);
    }

    public final void t(float f) {
        uoa uoaVar = this.g;
        uoaVar.m = f;
        p3u0 p3u0Var = uoaVar.f;
        if (p3u0Var != null) {
            p3u0Var.P0(f);
        }
    }

    public final void u(VideoSurfaceView videoSurfaceView) {
        VideoSurfaceView videoSurfaceView2;
        VideoSurfaceView videoSurfaceView3 = this.s;
        if (videoSurfaceView3 == videoSurfaceView) {
            return;
        }
        uoa uoaVar = this.g;
        if (videoSurfaceView3 != null) {
            uoaVar.k(videoSurfaceView3);
        }
        if (videoSurfaceView != null) {
            uoaVar.d(videoSurfaceView);
            videoSurfaceView2 = videoSurfaceView;
        } else {
            videoSurfaceView2 = null;
        }
        this.s = videoSurfaceView2;
        lsm0 lsm0Var = ((z590) ((bpb1) this.i.b).getValue()).a;
        h(videoSurfaceView, lsm0Var != null ? lsm0Var.j : 0);
    }

    public final void v() {
        this.g.u();
        this.i.c(new tla((Object) null, (byte) 3));
        this.q = null;
        this.f84p = null;
        this.r = null;
        VideoSurfaceView videoSurfaceView = this.s;
        if (videoSurfaceView != null) {
            videoSurfaceView.setEnableVideoScreenRecording(true);
        }
        this.n = true;
    }

    public final void w() {
        this.g.p(1);
    }
}
