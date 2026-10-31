package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGLDisplay;
import android.os.Build;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class azs implements voj1 {
    public static final /* synthetic */ int y = 0;
    public final Context b;
    public final ks40 c;
    public final boolean d;
    public final EGLDisplay e;
    public final zj80 f;
    public final roj1 g;
    public final uoj1 h;
    public final Executor i;
    public final boolean j;
    public final cg20 k;
    public final ArrayList l;
    public final hsk m;
    public final hsk n;
    public zys o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public zys f15p;
    public boolean q;
    public final ArrayList r;
    public final Object s;
    public final x8h t;
    public final c9r u;
    public volatile xj30 v;
    public volatile boolean w;
    public volatile boolean x;

    static {
        hph0.a("media3.effect");
    }

    public azs(Context context, ks40 ks40Var, boolean z, EGLDisplay eGLDisplay, zj80 zj80Var, roj1 roj1Var, uoj1 uoj1Var, Executor executor, cg20 cg20Var, boolean z2, x8h x8hVar, bg21 bg21Var) {
        c9r c9rVar = c9r.b;
        this.b = context;
        this.c = ks40Var;
        this.d = z;
        this.e = eGLDisplay;
        this.f = zj80Var;
        this.g = roj1Var;
        this.h = uoj1Var;
        this.i = executor;
        this.j = z2;
        this.r = new ArrayList();
        this.s = new Object();
        this.t = x8hVar;
        this.u = c9rVar;
        this.k = cg20Var;
        this.l = new ArrayList();
        hsk hskVar = new hsk();
        this.m = hskVar;
        hskVar.f();
        hsk hskVar2 = new hsk();
        this.n = hskVar2;
        hskVar2.f();
        mxr mxrVar = new mxr(this, executor, uoj1Var, roj1Var, bg21Var);
        cg20Var.h.h();
        cg20Var.w = mxrVar;
    }

    public static void a(ks40 ks40Var, bg11 bg11Var, cg20 cg20Var, roj1 roj1Var, uoj1 uoj1Var, Executor executor) {
        ArrayList arrayList = new ArrayList((Collection) bg11Var);
        arrayList.add(cg20Var);
        int i = 0;
        while (i < arrayList.size() - 1) {
            rs40 rs40Var = (rs40) arrayList.get(i);
            i++;
            rs40 rs40Var2 = (rs40) arrayList.get(i);
            cce cceVar = new cce(ks40Var, rs40Var, rs40Var2, roj1Var);
            rs40Var.b(cceVar);
            rs40Var.d(executor, new sys(uoj1Var, (byte) 0));
            rs40Var2.c(cceVar);
        }
    }

    public static bg11 d(Context context, bg11 bg11Var, x8h x8hVar, cg20 cg20Var) {
        v280 v280Var = new v280(4);
        v280 v280Var2 = new v280(4);
        v280 v280Var3 = new v280(4);
        for (int i = 0; i < bg11Var.d; i++) {
            siw siwVar = (siw) bg11Var.get(i);
            dm5.n(siwVar instanceof js40, "DefaultVideoFrameProcessor only supports GlEffects");
            js40 js40Var = (js40) siwVar;
            if (js40Var instanceof mch0) {
                v280Var2.c((mch0) js40Var);
            } else {
                boolean zH = x8h.h(x8hVar);
                bg11 bg11VarG = v280Var2.g();
                bg11 bg11VarG2 = v280Var3.g();
                if (!bg11VarG.isEmpty() || !bg11VarG2.isEmpty()) {
                    v280Var.c(dos.j(context, bg11VarG, bg11VarG2, zH));
                    v280Var2 = new v280(4);
                    v280Var3 = new v280(4);
                }
                v280Var.c(js40Var.a(context, zH));
            }
        }
        bg11 bg11VarG3 = v280Var2.g();
        bg11 bg11VarG4 = v280Var3.g();
        cg20Var.h.h();
        ArrayList arrayList = cg20Var.b;
        arrayList.clear();
        arrayList.addAll(bg11VarG3);
        ArrayList arrayList2 = cg20Var.c;
        arrayList2.clear();
        arrayList2.addAll(bg11VarG4);
        cg20Var.x = true;
        return v280Var.g();
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00a9 A[Catch: all -> 0x009b, LOOP:0: B:51:0x009f->B:54:0x00a9, LOOP_END, TRY_ENTER, TryCatch #2 {all -> 0x009b, blocks: (B:46:0x0090, B:61:0x011b, B:62:0x0132, B:64:0x0134, B:66:0x0142, B:69:0x015a, B:68:0x014e, B:75:0x0165, B:51:0x009f, B:54:0x00a9, B:55:0x00b5, B:57:0x00c9, B:58:0x00d3, B:60:0x00ed, B:63:0x0133), top: B:87:0x0090, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c9 A[Catch: all -> 0x009b, TryCatch #2 {all -> 0x009b, blocks: (B:46:0x0090, B:61:0x011b, B:62:0x0132, B:64:0x0134, B:66:0x0142, B:69:0x015a, B:68:0x014e, B:75:0x0165, B:51:0x009f, B:54:0x00a9, B:55:0x00b5, B:57:0x00c9, B:58:0x00d3, B:60:0x00ed, B:63:0x0133), top: B:87:0x0090, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x00b5 A[EDGE_INSN: B:88:0x00b5->B:55:0x00b5 BREAK  A[LOOP:0: B:51:0x009f->B:54:0x00a9], SYNTHETIC] */
    public final void b(zys zysVar, boolean z) {
        int size;
        ArrayList arrayList;
        v280 v280Var;
        c9r c9rVar;
        x8h x8hVar = zysVar.b.H;
        x8hVar.getClass();
        x8h x8hVar2 = this.t;
        int i = 0;
        boolean z2 = true;
        if (x8h.h(x8hVar)) {
            dm5.m(x8hVar.a == 6);
        }
        if (x8h.h(x8hVar) || x8h.h(x8hVar2)) {
            try {
                if (fn31.M() != 3) {
                    throw new VideoFrameProcessingException("OpenGL ES 3.0 context support is required for HDR input or output.");
                }
            } catch (GlUtil.GlException e) {
                throw VideoFrameProcessingException.a(-9223372036854775807L, e);
            }
        }
        dm5.m(x8hVar.f());
        dm5.m(x8hVar.c != 1);
        boolean zF = x8hVar2.f();
        int i2 = x8hVar2.a;
        int i3 = x8hVar2.c;
        dm5.m(zF);
        dm5.m(i3 != 1);
        if (x8h.h(x8hVar) != x8h.h(x8hVar2)) {
            if ((x8hVar.a != 6 || i2 == 6 || !x8h.h(x8hVar) || (i3 != 10 && i3 != 3)) && (!x8hVar.equals(x8h.i) || i2 != 6 || !x8h.h(x8hVar2))) {
                z2 = false;
            }
            dm5.m(z2);
        }
        this.n.d();
        if (!z) {
            try {
                if (!this.r.equals(zysVar.c)) {
                    while (true) {
                        size = this.l.size();
                        arrayList = this.l;
                        if (i < size) {
                            break;
                        }
                        ((rs40) arrayList.get(i)).release();
                        i++;
                    }
                    arrayList.clear();
                    v280Var = new v280(4);
                    v280Var.e(zysVar.c);
                    c9rVar = this.u;
                    if (c9rVar != c9r.b) {
                        v280Var.c(new b9r(c9rVar, this.t));
                    }
                    this.l.addAll(d(this.b, v280Var.g(), this.t, this.k));
                    v280 v280Var2 = new v280(4);
                    this.f.i = (rs40) hr80.q(this.l, this.k);
                    v280Var2.e(this.l);
                    a(this.c, v280Var2.g(), this.k, this.g, this.h, this.i);
                    this.r.clear();
                    this.r.addAll(zysVar.c);
                }
            } catch (Throwable th) {
                this.n.f();
                throw th;
            }
            this.n.f();
            throw th;
        }
        while (true) {
            size = this.l.size();
            arrayList = this.l;
            if (i < size) {
                break;
                break;
            } else {
                ((rs40) arrayList.get(i)).release();
                i++;
            }
        }
        arrayList.clear();
        v280Var = new v280(4);
        v280Var.e(zysVar.c);
        c9rVar = this.u;
        if (c9rVar != c9r.b) {
            v280Var.c(new b9r(c9rVar, this.t));
        }
        this.l.addAll(d(this.b, v280Var.g(), this.t, this.k));
        v280 v280Var3 = new v280(4);
        this.f.i = (rs40) hr80.q(this.l, this.k);
        v280Var3.e(this.l);
        a(this.c, v280Var3.g(), this.k, this.g, this.h, this.i);
        this.r.clear();
        this.r.addAll(zysVar.c);
        this.f.a(zysVar.a, new xj30(zysVar.b, zysVar.d));
        this.m.f();
        synchronized (this.s) {
        }
        this.i.execute(new fss(this, zysVar));
        zys zysVar2 = this.o;
        if (zysVar2 == null || zysVar.b.B != zysVar2.b.B) {
            this.i.execute(new e0i((Object) this, (Object) zysVar, (byte) 16));
        }
        this.o = zysVar;
        this.n.f();
    }

    public final void c() {
        zys zysVar;
        this.g.h();
        synchronized (this.s) {
            try {
                zysVar = this.f15p;
                if (zysVar != null) {
                    this.f15p = null;
                } else {
                    zysVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zysVar != null) {
            b(zysVar, false);
        }
    }

    public final void e() {
        final byte b = 1;
        try {
            this.n.a();
            final byte b2 = 0;
            this.w = false;
            o5 o5Var = this.f.j;
            if (o5Var != null) {
                o5Var.getClass();
                o5Var.o();
                this.g.a();
                o5Var.G();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                vys vysVar = new vys(countDownLatch, (byte) 0);
                synchronized (o5Var.b) {
                    o5Var.d = vysVar;
                }
                roj1 roj1Var = this.g;
                final cg20 cg20Var = this.k;
                Objects.requireNonNull(cg20Var);
                roj1Var.f(new qoj1() { // from class: p.wys
                    @Override // p.qoj1
                    public final void run() {
                        byte b3 = b2;
                        cg20 cg20Var2 = cg20Var;
                        switch (b3) {
                            case 0:
                                cg20Var2.flush();
                                break;
                            default:
                                ts40 ts40Var = cg20Var2.o;
                                dfe1 dfe1Var = cg20Var2.l;
                                if (ts40Var != null) {
                                    ArrayDeque arrayDeque = dfe1Var.a;
                                    ArrayDeque arrayDeque2 = dfe1Var.b;
                                    arrayDeque.addAll(arrayDeque2);
                                    arrayDeque2.clear();
                                    v4f0 v4f0Var = cg20Var2.m;
                                    int i = 0;
                                    v4f0Var.a = 0;
                                    v4f0Var.b = -1;
                                    v4f0Var.c = 0;
                                    v4f0 v4f0Var2 = cg20Var2.n;
                                    v4f0Var2.a = 0;
                                    v4f0Var2.b = -1;
                                    v4f0Var2.c = 0;
                                    while (true) {
                                        if (i < (cg20Var2.o == null ? 1 : dfe1Var.d())) {
                                            cg20Var2.u.k();
                                            i++;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, true);
                countDownLatch.await();
                synchronized (o5Var.b) {
                    o5Var.d = null;
                }
                roj1 roj1Var2 = this.g;
                final cg20 cg20Var2 = this.k;
                Objects.requireNonNull(cg20Var2);
                roj1Var2.c(new qoj1() { // from class: p.wys
                    @Override // p.qoj1
                    public final void run() {
                        byte b3 = b;
                        cg20 cg20Var3 = cg20Var2;
                        switch (b3) {
                            case 0:
                                cg20Var3.flush();
                                break;
                            default:
                                ts40 ts40Var = cg20Var3.o;
                                dfe1 dfe1Var = cg20Var3.l;
                                if (ts40Var != null) {
                                    ArrayDeque arrayDeque = dfe1Var.a;
                                    ArrayDeque arrayDeque2 = dfe1Var.b;
                                    arrayDeque.addAll(arrayDeque2);
                                    arrayDeque2.clear();
                                    v4f0 v4f0Var = cg20Var3.m;
                                    int i = 0;
                                    v4f0Var.a = 0;
                                    v4f0Var.b = -1;
                                    v4f0Var.c = 0;
                                    v4f0 v4f0Var2 = cg20Var3.n;
                                    v4f0Var2.a = 0;
                                    v4f0Var2.b = -1;
                                    v4f0Var2.c = 0;
                                    while (true) {
                                        if (i < (cg20Var3.o == null ? 1 : dfe1Var.d())) {
                                            cg20Var3.u.k();
                                            i++;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                this.g.c(new tys(this, (byte) 3));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.i.execute(new uys(this, e, (byte) 1));
        }
    }

    public final boolean f(Bitmap bitmap, rgl rglVar) {
        dm5.y(!this.w);
        boolean z = false;
        if (!this.m.e() || this.x) {
            return false;
        }
        if (x8h.h(this.t)) {
            if (Build.VERSION.SDK_INT >= 34 && bitmap.hasGainmap()) {
                z = true;
            }
            dm5.n(z, "VideoFrameProcessor configured for HDR output, but either received SDR input, or is on an API level that doesn't support gainmaps. SDR to HDR tonemapping is not supported.");
        }
        xj30 xj30Var = this.v;
        xj30Var.getClass();
        o5 o5Var = this.f.j;
        o5Var.getClass();
        o5Var.B(bitmap, xj30Var, rglVar);
        return true;
    }

    public final boolean g() {
        dm5.y(!this.w);
        dm5.s(this.v, "registerInputStream must be called before registering input frames");
        if (!this.m.e() || this.x) {
            return false;
        }
        o5 o5Var = this.f.j;
        o5Var.getClass();
        o5Var.E(this.v);
        return true;
    }

    public final void h(int i, long j, List list, ie30 ie30Var) {
        ie30 ie30Var2;
        if (this.x) {
            return;
        }
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            hhg1.n(String.valueOf(i));
            return;
        }
        LinkedHashMap linkedHashMap = x8r.a;
        synchronized (x8r.class) {
        }
        float f = ie30Var.E;
        if (f > 1.0f) {
            ge30 ge30VarA = ie30Var.a();
            ge30VarA.v = (int) (ie30Var.w * f);
            ge30VarA.D = 1.0f;
            ie30Var2 = new ie30(ge30VarA);
        } else if (f < 1.0f) {
            ge30 ge30VarA2 = ie30Var.a();
            ge30VarA2.w = (int) (ie30Var.x / f);
            ge30VarA2.D = 1.0f;
            ie30Var2 = new ie30(ge30VarA2);
        } else {
            ie30Var2 = ie30Var;
        }
        this.v = new xj30(ie30Var2, j);
        try {
            this.m.a();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.i.execute(new uys(this, e, (byte) 0));
        }
        synchronized (this.s) {
            try {
                zys zysVar = new zys(i, j, list, ie30Var);
                if (this.q) {
                    this.f15p = zysVar;
                    this.m.d();
                    o5 o5Var = this.f.j;
                    o5Var.getClass();
                    o5Var.L();
                } else {
                    this.q = true;
                    this.m.d();
                    this.g.f(new ace(this, zysVar, (byte) 1), true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        this.x = true;
        try {
            this.g.e(new tys(this, (byte) 1));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bhn0.p(e);
        }
    }

    public final void j(o3d1 o3d1Var) {
        cg20 cg20Var = this.k;
        cg20Var.getClass();
        try {
            cg20Var.h.c(new ace(cg20Var, o3d1Var, (byte) 3));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            cg20Var.i.execute(new e0i((Object) cg20Var, (Object) e, (byte) 28));
        }
    }

    public final void k() {
        x8r.a();
        dm5.y(!this.w);
        this.w = true;
        if (this.x) {
            return;
        }
        o5 o5Var = this.f.j;
        o5Var.getClass();
        o5Var.L();
    }
}
