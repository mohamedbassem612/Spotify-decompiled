package p;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x590 implements q590, o8u0 {
    public final exs N0;
    public qba O0;
    public boolean P0;
    public yo00 Q0;
    public r590 R0;
    public final ArrayList S0;
    public final c5u0 T0;
    public int U0;
    public y1k1 V0;
    public y1k1 W0;
    public final u4b1 X;
    public VideoSurfaceView X0;
    public final w6e0 Y;
    public float Y0;
    public final u5u0 Z;
    public final bpa a;
    public final bjh0 b;
    public final boolean c;
    public final String d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final oqe1 h = new oqe1();
    public final rfh0 i;
    public final ajr t;

    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    public x590(Context context, l270 l270Var, yqu0 yqu0Var, a0b a0bVar, ps6 ps6Var, ArrayList arrayList, anh0 anh0Var, sr20 sr20Var, boolean z, bpa bpaVar, bjh0 bjh0Var, boolean z2, String str, List list, yfu yfuVar, q8n q8nVar, b2b1 b2b1Var, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, boolean z8, o5n o5nVar, Long l, boolean z9) {
        rfh0 rfh0Var;
        b2b1 b2b1Var2 = b2b1Var;
        this.a = bpaVar;
        this.b = bjh0Var;
        this.c = z2;
        this.d = str;
        this.e = list;
        this.f = z4;
        this.g = z7;
        if (b2b1Var2 == null) {
            rfh0Var = null;
        } else {
            b2b1Var2 = b2b1Var2.a ? b2b1Var2 : null;
            if (b2b1Var2 != null) {
                rfh0Var = new rfh0(b2b1Var2.b, bjh0Var.o);
            } else {
                rfh0Var = null;
            }
        }
        this.i = rfh0Var;
        ajr ajrVarF = g6p1.f(context, l);
        this.t = ajrVarF;
        u4b1 x3b1Var = rfh0Var != null ? new x3b1(bjh0Var, rfh0Var) : new u4b1(bjh0Var);
        this.X = x3b1Var;
        this.Y = new w6e0(l270Var, yqu0Var, arrayList, anh0Var, (byte) 20);
        u5u0 u5u0Var = new u5u0();
        this.Z = u5u0Var;
        this.S0 = new ArrayList();
        c5u0 c5u0Var = new c5u0();
        this.T0 = c5u0Var;
        f6b1 f6b1Var = new f6b1(context, sr20Var, list, z3, o5nVar, z9);
        ((ojs) f6b1Var).d = i;
        ((ojs) f6b1Var).c = true;
        exs exsVarA = ps6Var.a(context, new h2b1(bpaVar instanceof kma ? (kma) bpaVar : null, new jma((byte) 0, false), new t590(2, this, x590.class, "canSelectFormat", "canSelectFormat(Landroidx/media3/common/Format;Ljava/util/List;)Z", 0, (byte) 0), z, yfuVar, q8nVar, new u590(this, (byte) 0), new u590(this, (byte) 1), z5, z6, z8, c5u0Var));
        this.N0 = exsVarA;
        yo00 yo00VarE = a0b.e(context, f6b1Var, exsVarA, ajrVarF, x3b1Var, Looper.getMainLooper());
        yo00VarE.m.a(this);
        yo00VarE.z0(u5u0Var);
        this.Q0 = yo00VarE;
        this.U0 = 1;
        this.Y0 = 1.0f;
    }

    @Override // p.q590
    public final void A0(iu30 iu30Var) {
        yo00 yo00Var = this.Q0;
        if (yo00Var != null) {
            iu30Var.invoke(yo00Var);
        }
    }

    @Override // p.q590
    public final boolean B0() {
        yo00 yo00Var = this.Q0;
        if (yo00Var != null) {
            return yo00Var.e1();
        }
        return false;
    }

    @Override // p.q590
    public final float D() {
        k2u0 k2u0VarL;
        yo00 yo00Var = this.Q0;
        if (yo00Var == null || (k2u0VarL = yo00Var.l()) == null) {
            return 0.0f;
        }
        return k2u0VarL.a;
    }

    @Override // p.q590
    public final rfh0 D0() {
        return this.i;
    }

    @Override // p.q590
    public final void E(Locale locale) {
        String languageTag = locale != null ? locale.toLanguageTag() : null;
        exs exsVar = this.N0;
        yws ywsVarD = exsVar.d();
        ywsVarD.k(languageTag);
        exsVar.p(new zws(ywsVarD));
    }

    @Override // p.q590
    public final p590 F() {
        String str;
        u5u0 u5u0Var = this.Z;
        hfs hfsVar = u5u0Var.a;
        synchronized (hfsVar) {
            str = hfsVar.f;
        }
        t5u0 t5u0Var = str == null ? null : (t5u0) u5u0Var.b.get(str);
        s5u0 s5u0VarA = t5u0Var != null ? t5u0Var.a(false) : null;
        return s5u0VarA != null ? new p590(s5u0VarA.N[3]) : new p590();
    }

    public final boolean F0(ie30 ie30Var, List list) {
        int iMax;
        y1k1 y1k1Var;
        y1k1 y1k1Var2;
        int i = ie30Var.x;
        int i2 = ie30Var.w;
        int i3 = 0;
        if (this.f && !(((y1k1Var = this.W0) == null || y1k1Var.equals(new y1k1(0, 0)) || (i2 >= y1k1Var.a && i >= y1k1Var.b)) && ((y1k1Var2 = this.V0) == null || y1k1Var2.equals(new y1k1(0, 0)) || (i2 <= y1k1Var2.a && i <= y1k1Var2.b)))) {
            return false;
        }
        VideoSurfaceView videoSurfaceView = this.X0;
        if (videoSurfaceView != null) {
            int width = videoSurfaceView.getWidth();
            int height = videoSurfaceView.getHeight();
            if (width > 0 && height > 0 && (i2 > (iMax = Math.max(width, height)) || i > iMax)) {
                k0d k0dVar = y590.b;
                Collections.sort(list, k0dVar);
                ge30 ge30Var = new ge30();
                ge30Var.v = width;
                ge30Var.w = height;
                int iBinarySearch = Collections.binarySearch(list, new ie30(ge30Var), k0dVar);
                if (iBinarySearch < 0) {
                    int iAbs = Math.abs(iBinarySearch);
                    if (iAbs >= list.size()) {
                        iAbs--;
                    }
                    if (!(this.b.a instanceof sn10) || !this.c) {
                        i3 = iAbs - 1;
                    } else if (iAbs != 1) {
                        i3 = iAbs - 2;
                    }
                    return ie30Var.equals(list.get(i3));
                }
            }
        }
        return true;
    }

    @Override // p.q590
    public final void G(hpc1 hpc1Var) {
        String str;
        if (hpc1Var == null || (str = hpc1Var.h) == null) {
            str = "";
        }
        exs exsVar = this.N0;
        yws ywsVarD = exsVar.d();
        ywsVarD.l(str);
        exsVar.p(new zws(ywsVarD));
    }

    public final boolean G0() {
        yo00 yo00Var = this.Q0;
        if (yo00Var == null || !yo00Var.q()) {
            return false;
        }
        Set set = y590.a;
        yo00 yo00Var2 = this.Q0;
        return o7h.i0(set, yo00Var2 != null ? Integer.valueOf(yo00Var2.getPlaybackState()) : null);
    }

    public final void H(int i) {
        VideoSurfaceView videoSurfaceView;
        if (!this.P0 || (videoSurfaceView = this.X0) == null) {
            return;
        }
        videoSurfaceView.setKeepScreenOn(G0());
    }

    public final void H0() {
        if (this.f) {
            boolean zJ = u890.j(this.V0, this.W0);
            ArrayList arrayList = this.S0;
            if (zJ) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((g0g1) it.next()).u(this.V0);
                }
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((g0g1) it2.next()).u(null);
                }
            }
        }
    }

    @Override // p.q590
    public final void I(y1k1 y1k1Var) {
        if (this.f) {
            this.W0 = y1k1Var;
            H0();
            return;
        }
        exs exsVar = this.N0;
        yws ywsVarD = exsVar.d();
        int i = y1k1Var.a;
        int i2 = y1k1Var.b;
        ((j0g1) ywsVarD).e = i;
        ((j0g1) ywsVarD).f = i2;
        exsVar.p(new zws(ywsVarD));
    }

    public final void I0(Integer[] numArr, boolean z) {
        yo00 yo00Var = this.Q0;
        if (yo00Var == null) {
            return;
        }
        exs exsVar = this.N0;
        yws ywsVarD = exsVar.d();
        int iP0 = yo00Var.p0();
        for (int i = 0; i < iP0; i++) {
            if (f46.M(numArr, Integer.valueOf(yo00Var.s1(i)))) {
                SparseBooleanArray sparseBooleanArray = ywsVarD.R;
                if (sparseBooleanArray.get(i) != z) {
                    if (z) {
                        sparseBooleanArray.put(i, true);
                    } else {
                        sparseBooleanArray.delete(i);
                    }
                }
            }
        }
        exsVar.p(new zws(ywsVarD));
    }

    public final void J(int i, yoh0 yoh0Var) {
        if (yoh0Var != null) {
            this.T0.a = 1;
        }
    }

    @Override // p.q590
    public final oqe1 M() {
        yo00 yo00Var;
        sqe1 sqe1VarD0;
        yo00 yo00Var2 = this.Q0;
        Integer numValueOf = yo00Var2 != null ? Integer.valueOf(yo00Var2.Q0()) : null;
        if (numValueOf == null || (yo00Var = this.Q0) == null || (sqe1VarD0 = yo00Var.d0()) == null) {
            return null;
        }
        return sqe1VarD0.n(numValueOf.intValue(), this.h, 0L);
    }

    @Override // p.q590
    public final int N() {
        return this.U0;
    }

    @Override // p.q590
    public final void Q(VideoSurfaceView videoSurfaceView) {
        x590 x590Var;
        yo00 yo00Var;
        yo00 yo00Var2;
        VideoSurfaceView videoSurfaceView2 = this.X0;
        if (videoSurfaceView2 != null && (yo00Var2 = this.Q0) != null) {
            yo00Var2.P(videoSurfaceView2.getOnRenderedFirstFrameListener());
        }
        if (videoSurfaceView != null && (yo00Var = this.Q0) != null) {
            yo00Var.J(videoSurfaceView.getOnRenderedFirstFrameListener());
        }
        if (this.P0) {
            VideoSurfaceView videoSurfaceView3 = this.X0;
            if (videoSurfaceView3 != null) {
                videoSurfaceView3.setKeepScreenOn(false);
            }
            if (videoSurfaceView != null) {
                videoSurfaceView.setKeepScreenOn(G0());
            }
        }
        VideoSurfaceView videoSurfaceView4 = this.X0;
        if (videoSurfaceView4 != null) {
            videoSurfaceView4.setExoPlayer((iu30) null);
        }
        this.X0 = videoSurfaceView;
        if (videoSurfaceView != null) {
            x590Var = this;
            videoSurfaceView.setExoPlayer(new ft30(1, x590Var, x590.class, "exoPlayer", "exoPlayer(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 19));
        } else {
            x590Var = this;
        }
        if (videoSurfaceView == null || !videoSurfaceView.getUseSurfaceView()) {
            yo00 yo00Var3 = x590Var.Q0;
            if (yo00Var3 != null) {
                TextureView textureView = videoSurfaceView != null ? videoSurfaceView.getTextureView() : null;
                yo00Var3.J1();
                if (textureView == null) {
                    yo00Var3.l1();
                    return;
                }
                yo00Var3.A1();
                yo00Var3.a0 = textureView;
                if (textureView.getSurfaceTextureListener() != null) {
                    oon1.H("Replacing existing SurfaceTextureListener.");
                }
                textureView.setSurfaceTextureListener(yo00Var3.w);
                SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
                if (surfaceTexture == null) {
                    yo00Var3.D1((Surface) null);
                    yo00Var3.x1(0, 0);
                    return;
                } else {
                    Surface surface = new Surface(surfaceTexture);
                    yo00Var3.D1(surface);
                    yo00Var3.W = surface;
                    yo00Var3.x1(textureView.getWidth(), textureView.getHeight());
                    return;
                }
            }
            return;
        }
        yo00 yo00Var4 = x590Var.Q0;
        if (yo00Var4 != null) {
            kxa1 surfaceView = videoSurfaceView.getSurfaceView();
            so00 so00Var = yo00Var4.w;
            yo00Var4.J1();
            if (!(surfaceView instanceof kxa1)) {
                yo00Var4.I(surfaceView != null ? surfaceView.getHolder() : null);
                return;
            }
            yo00Var4.A1();
            yo00Var4.Y = surfaceView;
            sbu0 sbu0VarN1 = yo00Var4.n1(yo00Var4.x);
            sbu0VarN1.d(10000);
            sbu0VarN1.c(yo00Var4.Y);
            sbu0VarN1.b();
            yo00Var4.Y.a.add(so00Var);
            yo00Var4.D1(yo00Var4.Y.getVideoSurface());
            SurfaceHolder holder = surfaceView.getHolder();
            yo00Var4.Z = false;
            yo00Var4.X = holder;
            holder.addCallback(so00Var);
            Surface surface2 = yo00Var4.X.getSurface();
            if (surface2 == null || !surface2.isValid()) {
                yo00Var4.x1(0, 0);
            } else {
                Rect surfaceFrame = yo00Var4.X.getSurfaceFrame();
                yo00Var4.x1(surfaceFrame.width(), surfaceFrame.height());
            }
        }
    }

    @Override // p.q590
    public final void S(p3u0 p3u0Var) {
        ajr ajrVar = this.t;
        if (p3u0Var != null) {
            ajrVar.c(new Handler(Looper.getMainLooper()), p3u0Var);
            yo00 yo00Var = this.Q0;
            if (yo00Var != null) {
                yo00Var.m.a(p3u0Var);
            }
        } else {
            r590 r590Var = this.R0;
            if (r590Var != null) {
                ajrVar.a(r590Var);
                yo00 yo00Var2 = this.Q0;
                if (yo00Var2 != null) {
                    yo00Var2.P(r590Var);
                }
            }
        }
        this.R0 = p3u0Var;
    }

    @Override // p.q590
    public final void T(boolean z) {
        I0(new Integer[]{2, 5}, z);
    }

    @Override // p.q590
    public final void U(m0u0 m0u0Var, oot0 oot0Var) {
        long j = oot0Var.b;
        long j2 = oot0Var.a;
        this.P0 = oot0Var.d;
        hu7 hu7Var = oot0Var.e;
        List list = this.e;
        if (hu7Var != null) {
            ArrayList<sg10> arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof sg10) {
                    arrayList.add(obj);
                }
            }
            for (sg10 sg10Var : arrayList) {
                sg10Var.getClass();
                sg10Var.n = yoi1.r(hu7Var.a, 0L, 6000L);
                sg10Var.m = hu7Var.b;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof ipb) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((ipb) it.next()).s(m0u0Var.f());
        }
        r590 r590Var = this.R0;
        if (r590Var == null) {
            eg.m("setPlayerEventListener must be called before play()");
            return;
        }
        qba qbaVarG = this.Y.g(m0u0Var, r590Var, this.a, this.b.t, this.d, this.g);
        this.O0 = qbaVarG;
        if (j2 < 0 || j <= j2) {
            yo00 yo00Var = this.Q0;
            if (j2 > 0) {
                if (yo00Var != null) {
                    qbaVarG.getClass();
                    yo00Var.N(qbaVarG, j2);
                }
            } else if (yo00Var != null) {
                qbaVarG.getClass();
                yo00Var.C0(qbaVarG);
            }
        } else {
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long jConvert = timeUnit.convert(j2, timeUnit2);
            long jConvert2 = timeUnit.convert(j, timeUnit2);
            yo00 yo00Var2 = this.Q0;
            if (yo00Var2 != null) {
                qba qbaVar = this.O0;
                qbaVar.getClass();
                yo00Var2.W0(new dpg(qbaVar, jConvert, jConvert2));
            }
        }
        yo00 yo00Var3 = this.Q0;
        if (yo00Var3 != null) {
            yo00Var3.M(oot0Var.c);
        }
        yo00 yo00Var4 = this.Q0;
        if (yo00Var4 != null) {
            yo00Var4.e();
        }
    }

    @Override // p.q590
    public final void V() {
        yo00 yo00Var;
        qba qbaVar = this.O0;
        if (qbaVar == null || (yo00Var = this.Q0) == null) {
            return;
        }
        yo00Var.a0(qbaVar);
    }

    @Override // p.q590
    public final void W(y1k1 y1k1Var) {
        if (this.f) {
            this.V0 = y1k1Var;
            H0();
            return;
        }
        exs exsVar = this.N0;
        yws ywsVarD = exsVar.d();
        int i = y1k1Var.a;
        int i2 = y1k1Var.b;
        ((j0g1) ywsVarD).a = i;
        ((j0g1) ywsVarD).b = i2;
        exsVar.p(new zws(ywsVarD));
    }

    @Override // p.q590
    public final void a() {
        yo00 yo00Var = this.Q0;
        if (yo00Var != null) {
            yo00Var.M(false);
        }
    }

    @Override // p.q590
    public final void a0(int i) {
        if (this.U0 == i) {
            return;
        }
        this.U0 = i;
        yo00 yo00Var = this.Q0;
        if (yo00Var == null) {
            return;
        }
        int iC = l1d.C(i);
        if (iC == 0) {
            yo00Var.g(this.Y0);
            I0(new Integer[]{1}, false);
        } else if (iC == 1) {
            I0(new Integer[]{1}, true);
        } else if (iC != 2) {
            eg.o();
        } else {
            yo00Var.g(0.0f);
            I0(new Integer[]{1}, false);
        }
    }

    @Override // p.q590
    public final float c() {
        return this.Y0;
    }

    @Override // p.q590
    public final boolean c0() {
        yo00 yo00Var = this.Q0;
        if (yo00Var == null) {
            return true;
        }
        int iP0 = yo00Var.p0();
        for (int i = 0; i < iP0; i++) {
            if (yo00Var.s1(i) == 2) {
                return this.N0.f.E0.get(i);
            }
        }
        return true;
    }

    @Override // p.q590
    public final void d() {
        yo00 yo00Var = this.Q0;
        if (yo00Var != null) {
            yo00Var.M(true);
        }
    }

    @Override // p.q590
    public final void d0(int i) {
        exs exsVar = this.N0;
        yws ywsVarD = exsVar.d();
        ((j0g1) ywsVarD).d = i;
        exsVar.p(new zws(ywsVarD));
    }

    @Override // p.q590
    public final void f(long j) {
        yo00 yo00Var = this.Q0;
        if (yo00Var != null) {
            yo00Var.h1(5, j);
        }
    }

    @Override // p.q590
    public final long f0() {
        oqe1 oqe1VarM = M();
        if (oqe1VarM != null) {
            return zoi1.n0(oqe1VarM.l);
        }
        return 0L;
    }

    @Override // p.q590
    public final void g(float f) {
        yo00 yo00Var;
        float fO = yoi1.o(f, 0.0f, 1.0f);
        this.Y0 = fO;
        if (this.U0 != 1 || (yo00Var = this.Q0) == null) {
            return;
        }
        yo00Var.g(fO);
    }

    public final void g0(int i, boolean z) {
        VideoSurfaceView videoSurfaceView;
        if (!this.P0 || (videoSurfaceView = this.X0) == null) {
            return;
        }
        videoSurfaceView.setKeepScreenOn(G0());
    }

    @Override // p.q590
    public final long getDuration() {
        if (!B0()) {
            yo00 yo00Var = this.Q0;
            long duration = yo00Var != null ? yo00Var.getDuration() : -1L;
            if (duration != -9223372036854775807L) {
                return duration;
            }
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0022 A[RETURN] */
    @Override // p.q590
    public final g5u0 getPlaybackState() {
        yo00 yo00Var = this.Q0;
        int playbackState = yo00Var != null ? yo00Var.getPlaybackState() : 1;
        for (g5u0 g5u0Var : g5u0.values()) {
            if (g5u0Var.a == playbackState) {
                if (g5u0Var == null) {
                    return g5u0.IDLE;
                }
                return g5u0Var;
            }
        }
        g5u0Var = null;
        if (g5u0Var == null) {
            return g5u0.IDLE;
        }
        return g5u0Var;
    }

    @Override // p.q590
    public final void h(float f) {
        yo00 yo00Var = this.Q0;
        if (yo00Var != null) {
            yo00Var.m(new k2u0(f));
        }
    }

    @Override // p.q590
    public final VideoSurfaceView i0() {
        return this.X0;
    }

    @Override // p.q590
    public final void k0(boolean z) {
        I0(new Integer[]{3}, z);
    }

    @Override // p.q590
    public final void l0(boolean z) {
        yo00 yo00Var = this.Q0;
        if (yo00Var != null) {
            yo00Var.setRepeatMode(z ? 2 : 0);
        }
    }

    @Override // p.q590
    public final long o0(long j) {
        yo00 yo00Var = this.Q0;
        if (yo00Var != null) {
            if (B0()) {
                sqe1 sqe1VarD0 = yo00Var.d0();
                if (!sqe1VarD0.p()) {
                    dqe1 dqe1Var = new dqe1();
                    sqe1VarD0.f(yo00Var.v0(), dqe1Var, false);
                    return j - zoi1.n0(dqe1Var.e);
                }
            } else if (getDuration() > 0 && j > getDuration()) {
                return Math.min(j, getDuration());
            }
        }
        return j;
    }

    @Override // p.q590
    public final void p() {
        yo00 yo00Var = this.Q0;
        if (yo00Var != null) {
            yo00Var.e();
        }
    }

    @Override // p.q590
    public final boolean q() {
        yo00 yo00Var = this.Q0;
        if (yo00Var != null) {
            return yo00Var.q();
        }
        return false;
    }

    @Override // p.q590
    public final void r(xw7 xw7Var) {
        yo00 yo00Var = this.Q0;
        if (yo00Var != null) {
            sbu0 sbu0VarG = yo00Var.G(new fey(this, (byte) 24));
            sbu0VarG.c(xw7Var);
            sbu0VarG.b();
        }
    }

    @Override // p.q590
    public final void release() {
        VideoSurfaceView videoSurfaceView = this.X0;
        if (videoSurfaceView != null) {
            videoSurfaceView.setExoPlayer((iu30) null);
        }
        r590 r590Var = this.R0;
        if (r590Var != null) {
            this.t.a(r590Var);
        }
        yo00 yo00Var = this.Q0;
        if (yo00Var != null) {
            yo00Var.t0(this.Z);
            yo00Var.P(this);
            Trace.beginSection("BetamaxPlayer.ReleaseExoPlayer");
            try {
                yo00Var.y1();
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        this.O0 = null;
        this.Q0 = null;
        this.R0 = null;
    }

    @Override // p.q590
    public final List s0() {
        kqg0 kqg0Var = this.N0.c;
        return kqg0Var == null ? z6x.a : new upa0(Collections.singletonList(kqg0Var), (byte) 20).e();
    }

    @Override // p.q590
    public final void stop() {
        yo00 yo00Var = this.Q0;
        if (yo00Var != null) {
            yo00Var.stop();
        }
        this.O0 = null;
    }

    @Override // p.q590
    public final boolean u0() {
        yo00 yo00Var = this.Q0;
        boolean z = false;
        if (yo00Var != null) {
            yo00Var.J1();
            if (yo00Var.H == 0) {
                z = true;
            }
        }
        return !z;
    }

    @Override // p.q590
    public final long v() {
        yo00 yo00Var = this.Q0;
        return o0(yo00Var != null ? yo00Var.v() : 0L);
    }

    @Override // p.q590
    public final List y() {
        kqg0 kqg0Var = this.N0.c;
        return kqg0Var == null ? z6x.a : new upa0(Collections.singletonList(kqg0Var), (byte) 20).f();
    }

    @Override // p.q590
    public final klb1 z() {
        yo00 yo00Var = this.Q0;
        if (yo00Var == null) {
            return null;
        }
        bjh0 bjh0Var = this.b;
        u4b1 u4b1Var = this.X;
        x3b1 x3b1Var = u4b1Var instanceof x3b1 ? (x3b1) u4b1Var : null;
        return l0o1.h(yo00Var, bjh0Var, x3b1Var != null ? Long.valueOf(x3b1Var.H) : null);
    }
}
