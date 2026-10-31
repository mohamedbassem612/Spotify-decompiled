package p;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k0t implements o5s {
    public final ywv0 X;
    public final pe a;
    public final boolean b;
    public final zle1 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public sqj1 g;
    public View i;
    public final Handler h = new Handler(Looper.getMainLooper());
    public boolean t = true;
    public final efr Y = new efr(this, (byte) 13);

    public k0t(woa woaVar, kma kmaVar, fpa fpaVar, pe peVar, boolean z, zle1 zle1Var) {
        this.a = peVar;
        this.b = z;
        this.c = zle1Var;
        this.X = new ywv0(woaVar, kmaVar, fpaVar, new cv7(this, (byte) 4));
    }

    public static o2u0 a(sqj1 sqj1Var) {
        kjj1 kjj1Var = sqj1Var.a;
        if (kjj1Var == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        String str = sqj1Var.e;
        Map mapSingletonMap = str != null ? Collections.singletonMap("itemId", str) : b7x.a;
        if (kjj1Var instanceof jjj1) {
            return new o2u0(((jjj1) kjj1Var).a, 4, mapSingletonMap);
        }
        if (kjj1Var instanceof kjj1) {
            return new o2u0(wqn1.n(kjj1Var.a), 4, mapSingletonMap);
        }
        eg.o();
        return null;
    }

    public final void b(sqj1 sqj1Var) {
        ljj1 ljj1Var;
        krw0.i.f.a(this);
        this.g = sqj1Var;
        if (this.e) {
            boolean z = sqj1Var.b;
            rqj1 rqj1Var = sqj1Var.d;
            t45 t45VarA = null;
            ywv0 ywv0Var = this.X;
            if (!z || (ljj1Var = sqj1Var.a) == null || !ljj1Var.c() || !this.a.b(4) || this.b) {
                this.f = false;
                uoa uoaVar = (uoa) ywv0Var.f;
                if (uoaVar != null) {
                    ((woa) ywv0Var.a).c(uoaVar);
                    ywv0Var.f = null;
                }
                e();
                return;
            }
            this.f = true;
            if (u890.j((o2u0) ywv0Var.g, a(sqj1Var))) {
                return;
            }
            if (!rqj1Var.d || this.d) {
                boolean z2 = rqj1Var.b;
                s45 s45Var = this.c;
                if (z2) {
                    t45VarA = s45Var.a(rqj1Var.c);
                    ConcurrentHashMap concurrentHashMap = t45VarA.g;
                    concurrentHashMap.put("feature_id", sqj1Var.c);
                    concurrentHashMap.put("media_loaded", "false");
                    concurrentHashMap.put("phase", "render");
                }
                if (t45VarA != null) {
                    t45.m(t45VarA, "load", 4);
                }
                if (rqj1Var.a) {
                    this.h.postDelayed(new uu1(this, sqj1Var, t45VarA, (byte) 8), 200L);
                } else {
                    d(sqj1Var, t45VarA);
                }
                if (t45VarA != null) {
                    t45VarA.g("load");
                }
                if (t45VarA != null) {
                    s45Var.b(t45VarA.e());
                }
            }
        }
    }

    public final void c(d1o1 d1o1Var) {
        sqj1 sqj1Var;
        boolean z = d1o1Var instanceof x500;
        ywv0 ywv0Var = this.X;
        if (z) {
            x500 x500Var = (x500) d1o1Var;
            this.i = x500Var.f;
            VideoSurfaceView videoSurfaceView = x500Var.e;
            videoSurfaceView.setBufferingThrobberEnabled(false);
            videoSurfaceView.setVideoSurfaceCallback(this.Y);
            ywv0Var.e = videoSurfaceView;
            uoa uoaVar = (uoa) ywv0Var.f;
            if (uoaVar != null) {
                uoaVar.d(videoSurfaceView);
            }
            if (this.t) {
                e();
                return;
            }
            this.t = false;
            View view = this.i;
            if (view != null) {
                view.setVisibility(4);
                return;
            }
            return;
        }
        if (d1o1Var instanceof vxz) {
            b(((vxz) d1o1Var).e);
            return;
        }
        t45 t45VarA = null;
        if (!d1o1Var.equals(zyz.e)) {
            if (d1o1Var.equals(zyz.f)) {
                this.d = false;
                uoa uoaVar2 = (uoa) ywv0Var.f;
                if (uoaVar2 != null) {
                    uoaVar2.f();
                    return;
                }
                return;
            }
            if (!d1o1Var.equals(zyz.g)) {
                eg.o();
                return;
            }
            this.d = false;
            this.h.removeCallbacksAndMessages(null);
            ywv0Var.g = null;
            ywv0Var.h = null;
            uoa uoaVar3 = (uoa) ywv0Var.f;
            if (uoaVar3 != null) {
                uoaVar3.u();
            }
            uoa uoaVar4 = (uoa) ywv0Var.f;
            if (uoaVar4 != null) {
                ((woa) ywv0Var.a).c(uoaVar4);
                ywv0Var.f = null;
            }
            e();
            krw0.i.f.d(this);
            return;
        }
        this.d = true;
        if (!this.f || (sqj1Var = this.g) == null) {
            return;
        }
        o2u0 o2u0VarA = a(sqj1Var);
        rqj1 rqj1Var = sqj1Var.d;
        boolean z2 = rqj1Var.b;
        s45 s45Var = this.c;
        if (z2) {
            t45VarA = s45Var.a(rqj1Var.c);
            ConcurrentHashMap concurrentHashMap = t45VarA.g;
            concurrentHashMap.put("feature_id", sqj1Var.c);
            concurrentHashMap.put("media_loaded", String.valueOf(u890.j((o2u0) ywv0Var.g, o2u0VarA)));
            concurrentHashMap.put("phase", "gain_focus");
        }
        if (t45VarA != null) {
            t45.m(t45VarA, "load", 4);
        }
        if (u890.j((o2u0) ywv0Var.g, o2u0VarA)) {
            ywv0Var.j(t45VarA);
        } else {
            d(sqj1Var, t45VarA);
        }
        if (t45VarA != null) {
            t45VarA.g("load");
        }
        if (t45VarA != null) {
            s45Var.b(t45VarA.e());
        }
    }

    public final void d(sqj1 sqj1Var, t45 t45Var) {
        e();
        ljj1 ljj1Var = sqj1Var.a;
        if (ljj1Var == null) {
            hhg1.n("Required value was null.");
            return;
        }
        o2u0 o2u0VarA = a(sqj1Var);
        oot0 oot0Var = new oot0(ljj1Var.b(), ljj1Var.a(), false, false, (hu7) null, (tne1) null, false, 240);
        String str = sqj1Var.c;
        if (t45Var != null) {
            t45.m(t45Var, "play", 4);
        }
        if (t45Var != null) {
            t45.m(t45Var, "betamax_release_player", 4);
        }
        ywv0 ywv0Var = this.X;
        uoa uoaVar = (uoa) ywv0Var.f;
        if (uoaVar != null) {
            ((woa) ywv0Var.a).c(uoaVar);
            ywv0Var.f = null;
        }
        if (t45Var != null) {
            t45Var.g("betamax_release_player");
        }
        ywv0Var.i = str;
        ywv0Var.g = o2u0VarA;
        ywv0Var.h = oot0Var;
        if (t45Var != null) {
            t45.m(t45Var, "betamax_acquire_player", 4);
        }
        uoa uoaVarB = ywv0Var.b(str, o2u0VarA);
        if (t45Var != null) {
            t45Var.g("betamax_acquire_player");
        }
        ywv0Var.f = uoaVarB;
        if (((o2u0) ywv0Var.g) != null && ((oot0) ywv0Var.h) != null) {
            if (t45Var != null) {
                t45.m(t45Var, "betamax_play_with_options", 4);
            }
            o2u0 o2u0Var = (o2u0) ywv0Var.g;
            if (o2u0Var == null) {
                hhg1.n("Required value was null.");
                return;
            }
            oot0 oot0Var2 = (oot0) ywv0Var.h;
            if (oot0Var2 == null) {
                hhg1.n("Required value was null.");
                return;
            } else {
                uoaVarB.h(o2u0Var, oot0Var2);
                if (t45Var != null) {
                    t45Var.g("betamax_play_with_options");
                }
            }
        }
        if (t45Var != null) {
            t45Var.g("play");
        }
        if (this.d) {
            ywv0Var.j(t45Var);
        }
    }

    public final void e() {
        this.t = true;
        View view = this.i;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void onPause(iac0 iac0Var) {
        this.e = false;
        uoa uoaVar = (uoa) this.X.f;
        if (uoaVar != null) {
            uoaVar.f();
        }
    }

    public final void onResume(iac0 iac0Var) {
        this.e = true;
        sqj1 sqj1Var = this.g;
        if (sqj1Var != null) {
            b(sqj1Var);
        }
    }
}
