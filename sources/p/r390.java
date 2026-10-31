package p;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r390 implements q590, o8u0, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public volatile long N0;
    public SurfaceHolder O0;
    public final AtomicLong P0;
    public i390 Q0;
    public final rfh0 R0;
    public final ajr S0;
    public final u4b1 T0;
    public final w6e0 U0;
    public final u5u0 V0;
    public final exs W0;
    public final Handler X;
    public qba X0;
    public volatile boolean Y;
    public boolean Y0;
    public volatile boolean Z;
    public yo00 Z0;
    public final bpa a;
    public r590 a1;
    public final bjh0 b;
    public final CopyOnWriteArrayList b1;
    public final boolean c;
    public final c5u0 c1;
    public final String d;
    public y1k1 d1;
    public final List e;
    public y1k1 e1;
    public final boolean f;
    public VideoSurfaceView f1;
    public final boolean g;
    public float g1;
    public final Looper h;
    public int h1;
    public final Handler i;
    public final llm t;

    /* JADX WARN: Code duplicated, block: B:10:0x0078  */
    public r390(Context context, l270 l270Var, yqu0 yqu0Var, a0b a0bVar, ps6 ps6Var, ArrayList arrayList, anh0 anh0Var, sr20 sr20Var, boolean z, bpa bpaVar, bjh0 bjh0Var, boolean z2, String str, List list, yfu yfuVar, q8n q8nVar, b2b1 b2b1Var, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, boolean z8, o5n o5nVar, Long l, Looper looper, boolean z9) {
        rfh0 rfh0Var;
        b2b1 b2b1Var2 = b2b1Var;
        this.a = bpaVar;
        this.b = bjh0Var;
        this.c = z2;
        this.d = str;
        this.e = list;
        this.f = z4;
        this.g = z7;
        this.h = looper;
        Handler handler = new Handler(looper);
        this.i = handler;
        byte b = 0;
        qbu0 qbu0Var = new qbu0(handler, false);
        j0d1 j0d1VarB = guo1.B();
        qbu0 qbu0Var2 = qbu0Var.e;
        qbu0Var2.getClass();
        this.t = smo1.e(flo1.l(qbu0Var2, j0d1VarB));
        this.X = new Handler(Looper.getMainLooper());
        this.P0 = new AtomicLong();
        this.Q0 = new i390((Surface) null, (l291) null, 7);
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
        this.R0 = rfh0Var;
        ajr ajrVarF = g6p1.f(context, l);
        this.S0 = ajrVarF;
        u4b1 x3b1Var = rfh0Var != null ? new x3b1(bjh0Var, rfh0Var) : new u4b1(bjh0Var);
        this.T0 = x3b1Var;
        this.U0 = new w6e0(l270Var, yqu0Var, arrayList, anh0Var, (byte) 20);
        u5u0 u5u0Var = new u5u0();
        this.V0 = u5u0Var;
        this.b1 = new CopyOnWriteArrayList();
        c5u0 c5u0Var = new c5u0();
        this.c1 = c5u0Var;
        f6b1 f6b1Var = new f6b1(context, sr20Var, list, z3, o5nVar, z9);
        ((ojs) f6b1Var).d = i;
        ((ojs) f6b1Var).c = true;
        exs exsVarA = ps6Var.a(context, new h2b1(bpaVar instanceof kma ? (kma) bpaVar : null, new jma((byte) 0, false), new c4z(2, this, r390.class, "canSelectFormat", "canSelectFormat(Landroidx/media3/common/Format;Ljava/util/List;)Z", 0, (byte) 14), z, yfuVar, q8nVar, new h390(this, b), new h390(this, (byte) 1), z5, z6, z8, c5u0Var));
        this.W0 = exsVarA;
        yo00 yo00VarE = a0b.e(context, f6b1Var, exsVarA, ajrVarF, x3b1Var, looper);
        yo00VarE.m.a(this);
        yo00VarE.z0(u5u0Var);
        this.Z0 = yo00VarE;
        this.h1 = 1;
        this.g1 = 1.0f;
    }

    public static long F0(ExoPlayer exoPlayer, long j) {
        int iV0;
        if (((j9a) exoPlayer).e1()) {
            sqe1 sqe1VarD0 = exoPlayer.d0();
            if (!sqe1VarD0.p() && (iV0 = exoPlayer.v0()) < sqe1VarD0.h()) {
                dqe1 dqe1Var = new dqe1();
                sqe1VarD0.f(iV0, dqe1Var, false);
                return j - zoi1.n0(dqe1Var.e);
            }
        } else {
            long duration = exoPlayer.getDuration();
            if (duration != -9223372036854775807L && duration > 0 && j > duration) {
                return Math.min(j, duration);
            }
        }
        return j;
    }

    public static Object K0(r390 r390Var, Object obj, iu30 iu30Var) {
        return r390Var.J0(obj, s390.a, jcu0.d, iu30Var);
    }

    @Override // p.q590
    public final void A0(iu30 iu30Var) {
        yo00 yo00Var;
        if (this.Y || (yo00Var = this.Z0) == null) {
            return;
        }
        fn31.T(this.t, (o8n) null, 0, new y160(iu30Var, yo00Var, (lnm) null, (byte) 13), 3);
    }

    @Override // p.q590
    public final boolean B0() {
        return ((Boolean) K0(this, Boolean.FALSE, td80.Y0)).booleanValue();
    }

    @Override // p.q590
    public final float D() {
        return ((Number) K0(this, Float.valueOf(1.0f), td80.b1)).floatValue();
    }

    @Override // p.q590
    public final rfh0 D0() {
        return this.R0;
    }

    @Override // p.q590
    public final void E(Locale locale) {
        A0(new p390(this.W0, locale != null ? locale.toLanguageTag() : null, (byte) 0));
    }

    @Override // p.q590
    public final p590 F() {
        String str;
        if (!u890.j(Looper.myLooper(), this.h)) {
            return (p590) K0(this, new p590(), new h390(this, (byte) 5));
        }
        u5u0 u5u0Var = this.V0;
        hfs hfsVar = u5u0Var.a;
        synchronized (hfsVar) {
            str = hfsVar.f;
        }
        t5u0 t5u0Var = str == null ? null : (t5u0) u5u0Var.b.get(str);
        s5u0 s5u0VarA = t5u0Var != null ? t5u0Var.a(false) : null;
        return s5u0VarA != null ? new p590(s5u0VarA.N[3]) : new p590();
    }

    @Override // p.q590
    public final void G(hpc1 hpc1Var) {
        String str;
        if (hpc1Var == null || (str = hpc1Var.h) == null) {
            str = "";
        }
        A0(new p390(this.W0, str, (byte) 1));
    }

    public final void G0(ExoPlayer exoPlayer, i390 i390Var) {
        Surface surface;
        i390 i390Var2 = this.Q0;
        l291 l291VarC = exoPlayer.C();
        Surface surface2 = i390Var.a;
        if (surface2 == null || !surface2.isValid()) {
            surface2 = null;
        }
        if (surface2 != null) {
            exoPlayer.n(surface2);
        } else {
            Surface surface3 = i390Var2.a;
            if (surface3 != null) {
                exoPlayer.t(surface3);
            }
        }
        this.Q0 = surface2 != null ? i390Var : new i390((Surface) null, (l291) null, 7);
        boolean z = i390Var2.c;
        Surface surface4 = i390Var2.a;
        if (z && surface4 != surface2 && surface4 != null) {
            surface4.release();
        }
        if (i390Var.c && surface2 == null && (surface = i390Var.a) != surface4 && surface != null) {
            surface.release();
        }
        l291 l291VarC2 = !u890.j(exoPlayer.C(), l291VarC) ? exoPlayer.C() : i390Var2.b;
        l291VarC2.getClass();
        if (u890.j(this.Q0.b, l291VarC2)) {
            return;
        }
        k8p1.p(exoPlayer, this.Q0.b);
    }

    public final void H(int i) {
        yo00 yo00Var = this.Z0;
        boolean z = false;
        if (yo00Var != null && yo00Var.q() && y590.a.contains(Integer.valueOf(i))) {
            z = true;
        }
        this.Z = z;
        this.X.post(new m390(this, z, (byte) 1));
    }

    public final boolean H0() {
        yo00 yo00Var = this.Z0;
        if (yo00Var == null) {
            return true;
        }
        int iP0 = yo00Var.p0();
        for (int i = 0; i < iP0; i++) {
            if (yo00Var.s1(i) == 2) {
                return this.W0.f.E0.get(i);
            }
        }
        return true;
    }

    @Override // p.q590
    public final void I(y1k1 y1k1Var) {
        if (!this.f) {
            A0(new l390(this.W0, y1k1Var, (byte) 1));
        } else {
            this.e1 = y1k1Var;
            I0();
        }
    }

    public final void I0() {
        if (this.f) {
            List listL1 = o7h.l1(this.b1);
            if (u890.j(this.d1, this.e1)) {
                Iterator it = listL1.iterator();
                while (it.hasNext()) {
                    ((g0g1) it.next()).u(this.d1);
                }
            } else {
                Iterator it2 = listL1.iterator();
                while (it2.hasNext()) {
                    ((g0g1) it2.next()).u(null);
                }
            }
        }
    }

    public final void J(int i, yoh0 yoh0Var) {
        if (yoh0Var != null) {
            this.c1.a = 1;
        }
    }

    public final Object J0(Object obj, long j, jcu0 jcu0Var, iu30 iu30Var) {
        yo00 yo00Var = this.Z0;
        if (this.Y || yo00Var == null) {
            return obj;
        }
        return jo31.t(o6x.a, new ie3(j, obj, this, jcu0Var, iu30Var, (ExoPlayer) yo00Var, (lnm) null));
    }

    public final void L0(ExoPlayer exoPlayer, Surface surface, l291 l291Var) {
        i390 i390Var = this.Q0;
        if (i390Var.a != surface || u890.j(i390Var.b, l291Var)) {
            return;
        }
        i390 i390Var2 = this.Q0;
        this.Q0 = new i390(i390Var2.a, l291Var, i390Var2.c);
        k8p1.p(exoPlayer, l291Var);
    }

    @Override // p.q590
    public final oqe1 M() {
        return (oqe1) K0(this, null, td80.W0);
    }

    public final void M0(Integer[] numArr, boolean z) {
        yo00 yo00Var = this.Z0;
        if (yo00Var == null) {
            return;
        }
        exs exsVar = this.W0;
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

    @Override // p.q590
    public final int N() {
        return this.h1;
    }

    @Override // p.q590
    public final void Q(VideoSurfaceView videoSurfaceView) {
        l291 l291Var;
        TextureView textureView;
        SurfaceView surfaceView;
        if (this.Y) {
            return;
        }
        this.P0.incrementAndGet();
        VideoSurfaceView videoSurfaceView2 = this.f1;
        SurfaceHolder holder = (videoSurfaceView == null || !videoSurfaceView.getUseSurfaceView() || (surfaceView = videoSurfaceView.getSurfaceView()) == null) ? null : surfaceView.getHolder();
        TextureView textureView2 = (holder != null || videoSurfaceView == null) ? null : videoSurfaceView.getTextureView();
        SurfaceTexture surfaceTexture = textureView2 != null ? textureView2.getSurfaceTexture() : null;
        Surface surface = holder != null ? holder.getSurface() : null;
        if (holder != null) {
            Rect surfaceFrame = holder.getSurfaceFrame();
            l291Var = new l291(surfaceFrame.width(), surfaceFrame.height());
        } else {
            l291Var = (textureView2 == null || surfaceTexture == null) ? new l291(0, 0) : new l291(textureView2.getWidth(), textureView2.getHeight());
        }
        r390 r390Var = this;
        r390Var.J0(rih1.a, jfv.c, jcu0.e, new j96(videoSurfaceView2 != null ? videoSurfaceView2.getOnRenderedFirstFrameListener() : null, surface, l291Var, surfaceTexture, this, videoSurfaceView != null ? videoSurfaceView.getOnRenderedFirstFrameListener() : null, (byte) 14));
        if (r390Var.Y0) {
            if (videoSurfaceView2 != null) {
                videoSurfaceView2.setKeepScreenOn(false);
            }
            if (videoSurfaceView != null) {
                videoSurfaceView.setKeepScreenOn(r390Var.Z);
            }
        }
        SurfaceHolder surfaceHolder = r390Var.O0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(r390Var);
        }
        if (videoSurfaceView2 != null && (textureView = videoSurfaceView2.getTextureView()) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        if (videoSurfaceView2 != null) {
            videoSurfaceView2.setExoPlayer((iu30) null);
        }
        r390Var.f1 = videoSurfaceView;
        r390Var.O0 = holder;
        if (videoSurfaceView != null) {
            r390Var = this;
            videoSurfaceView.setExoPlayer(new ft30(1, this, r390.class, "exoPlayer", "exoPlayer(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 16));
        }
        if (holder != null) {
            holder.addCallback(r390Var);
        }
        if (textureView2 != null) {
            textureView2.setSurfaceTextureListener(r390Var);
        }
    }

    @Override // p.q590
    public final void S(p3u0 p3u0Var) {
        r590 r590Var = this.a1;
        this.a1 = p3u0Var;
        A0(new lb50(p3u0Var, this, r590Var, (byte) 9));
    }

    @Override // p.q590
    public final void T(boolean z) {
        A0(new k390(z, this));
    }

    @Override // p.q590
    public final void U(m0u0 m0u0Var, oot0 oot0Var) {
        this.Y0 = oot0Var.d;
        hu7 hu7Var = oot0Var.e;
        if (hu7Var != null) {
            List list = this.e;
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
        List list2 = this.e;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof ipb) {
                arrayList2.add(obj2);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((ipb) it.next()).s(m0u0Var.f());
        }
        r590 r590Var = this.a1;
        if (r590Var == null) {
            eg.m("setPlayerEventListener must be called before play()");
            return;
        }
        qba qbaVarG = this.U0.g(m0u0Var, r590Var, this.a, this.b.t, this.d, this.g);
        this.X0 = qbaVarG;
        qbaVarG.getClass();
        long j = oot0Var.a;
        long j2 = 0;
        boolean z = j >= 0 && oot0Var.b > j;
        if (!z) {
            if (j < 0) {
                j = 0;
            }
            j2 = j;
        }
        this.N0 = j2;
        A0(new lp00(z, oot0Var, qbaVarG, this, j2));
    }

    @Override // p.q590
    public final void V() {
        qba qbaVar = this.X0;
        if (qbaVar == null) {
            return;
        }
        A0(new ux70(qbaVar, (byte) 17));
    }

    @Override // p.q590
    public final void W(y1k1 y1k1Var) {
        if (!this.f) {
            A0(new l390(this.W0, y1k1Var, (byte) 0));
        } else {
            this.d1 = y1k1Var;
            I0();
        }
    }

    @Override // p.q590
    public final void a() {
        A0(td80.Z0);
    }

    @Override // p.q590
    public final void a0(int i) {
        if (this.h1 == i) {
            return;
        }
        this.h1 = i;
        A0(new ym(this, i, (byte) 13));
    }

    @Override // p.q590
    public final float c() {
        return this.g1;
    }

    @Override // p.q590
    public final boolean c0() {
        return ((Boolean) K0(this, Boolean.TRUE, new h390(this, (byte) 3))).booleanValue();
    }

    @Override // p.q590
    public final void d() {
        A0(td80.e1);
    }

    @Override // p.q590
    public final void d0(int i) {
        A0(new ym(this.W0, i, (byte) 14));
    }

    @Override // p.q590
    public final void f(long j) {
        this.N0 = j;
        A0(new n82(j, this, (byte) 4));
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
        this.g1 = yoi1.o(f, 0.0f, 1.0f);
        if (this.h1 == 1) {
            A0(new h390(this, (byte) 7));
        }
    }

    public final void g0(int i, boolean z) {
        yo00 yo00Var = this.Z0;
        boolean z2 = yo00Var != null && z && y590.a.contains(Integer.valueOf(yo00Var.getPlaybackState()));
        this.Z = z2;
        this.X.post(new m390(this, z2, (byte) 0));
    }

    @Override // p.q590
    public final long getDuration() {
        return ((Number) K0(this, -1L, td80.X0)).longValue();
    }

    @Override // p.q590
    public final g5u0 getPlaybackState() {
        return (g5u0) K0(this, g5u0.IDLE, td80.c1);
    }

    @Override // p.q590
    public final void h(float f) {
        A0(new jc5((byte) 25, f));
    }

    @Override // p.q590
    public final VideoSurfaceView i0() {
        return this.f1;
    }

    @Override // p.q590
    public final void k0(boolean z) {
        A0(new k390(this, z));
    }

    @Override // p.q590
    public final void l0(boolean z) {
        A0(new mj10((byte) 9, z));
    }

    @Override // p.q590
    public final void m0(iu30 iu30Var) {
        yo00 yo00Var = this.Z0;
        xvy x680Var = (this.Y || yo00Var == null) ? new x680(iu30Var, this, (byte) 7) : new xvy(iu30Var, this, yo00Var, (byte) 25);
        if (u890.j(Looper.myLooper(), this.h)) {
            x680Var.invoke();
        } else {
            if (this.i.post(new is3(x680Var, (byte) 4))) {
                return;
            }
            iu30Var.invoke(Long.valueOf(this.N0));
        }
    }

    @Override // p.q590
    public final long o0(long j) {
        return ((Number) K0(this, Long.valueOf(j), new ps(this, j))).longValue();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView textureView;
        VideoSurfaceView videoSurfaceView = this.f1;
        if (((videoSurfaceView == null || (textureView = videoSurfaceView.getTextureView()) == null) ? null : textureView.getSurfaceTexture()) != surfaceTexture || this.Y) {
            return;
        }
        rtb rtbVar = new rtb(surfaceTexture, i, i2, (byte) 1);
        long jIncrementAndGet = this.P0.incrementAndGet();
        yo00 yo00Var = this.Z0;
        if (yo00Var == null) {
            return;
        }
        fn31.T(this.t, (o8n) null, 0, new g28(this, jIncrementAndGet, yo00Var, rtbVar, (lnm) null), 3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        TextureView textureView;
        VideoSurfaceView videoSurfaceView = this.f1;
        if (((videoSurfaceView == null || (textureView = videoSurfaceView.getTextureView()) == null) ? null : textureView.getSurfaceTexture()) != surfaceTexture) {
            return true;
        }
        this.P0.incrementAndGet();
        J0(rih1.a, jfv.c, jcu0.e, new h390(this, (byte) 4));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        TextureView textureView;
        VideoSurfaceView videoSurfaceView = this.f1;
        if (((videoSurfaceView == null || (textureView = videoSurfaceView.getTextureView()) == null) ? null : textureView.getSurfaceTexture()) != surfaceTexture) {
            return;
        }
        A0(new hnn(this, this.P0.get(), i, i2));
    }

    @Override // p.q590
    public final void p() {
        A0(o390.b);
    }

    @Override // p.q590
    public final boolean q() {
        return ((Boolean) K0(this, Boolean.FALSE, td80.a1)).booleanValue();
    }

    @Override // p.q590
    public final void r(xw7 xw7Var) {
        A0(new vq80(xw7Var, this, (byte) 2));
    }

    @Override // p.q590
    public final void release() {
        if (this.Y) {
            return;
        }
        if (this.f1 != null) {
            Q(null);
        }
        this.Y = true;
        smo1.r(this.t, "Player scope released");
        r590 r590Var = this.a1;
        if (r590Var != null) {
            this.S0.a(r590Var);
        }
        this.a1 = null;
        this.i.post(new n390(this, (byte) 0));
        this.i.post(new n390(this, (byte) 1));
    }

    @Override // p.q590
    public final List s0() {
        return (List) K0(this, z6x.a, new j390(this.W0, (byte) 0));
    }

    @Override // p.q590
    public final void stop() {
        A0(o390.c);
        this.X0 = null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.O0 != surfaceHolder) {
            return;
        }
        A0(new q390(this, this.P0.get(), surfaceHolder.getSurface(), i2, i3));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.O0 != surfaceHolder) {
            return;
        }
        Surface surface = surfaceHolder.getSurface();
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        nd70 nd70Var = new nd70(new i390(surface, new l291(surfaceFrame.width(), surfaceFrame.height()), 4), (byte) 26);
        long jIncrementAndGet = this.P0.incrementAndGet();
        yo00 yo00Var = this.Z0;
        if (yo00Var == null) {
            return;
        }
        fn31.T(this.t, (o8n) null, 0, new g28(this, jIncrementAndGet, yo00Var, nd70Var, (lnm) null), 3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.O0 != surfaceHolder) {
            return;
        }
        Surface surface = surfaceHolder.getSurface();
        this.P0.incrementAndGet();
        J0(rih1.a, jfv.c, jcu0.e, new vq80(this, surface, (byte) 3));
    }

    @Override // p.q590
    public final boolean u0() {
        return ((Boolean) K0(this, Boolean.FALSE, td80.d1)).booleanValue();
    }

    @Override // p.q590
    public final long v() {
        Long l = (Long) K0(this, null, new h390(this, (byte) 2));
        return l != null ? l.longValue() : this.N0;
    }

    @Override // p.q590
    public final List y() {
        return (List) K0(this, z6x.a, new j390(this.W0, (byte) 1));
    }

    @Override // p.q590
    public final klb1 z() {
        return (klb1) K0(this, null, new h390(this, (byte) 6));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
