package p;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.os.Build;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import java.util.LinkedHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dya extends o5 {
    public boolean X;
    public boolean Y;
    public final LinkedBlockingQueue e;
    public final ks40 f;
    public final boolean g;
    public dos h;
    public ss40 i;
    public int t;

    public dya(ks40 ks40Var, roj1 roj1Var, boolean z) {
        super(roj1Var);
        this.f = ks40Var;
        this.e = new LinkedBlockingQueue();
        this.g = z;
    }

    @Override // p.o5
    public final void B(final Bitmap bitmap, final xj30 xj30Var, final rgl rglVar) {
        ((roj1) this.c).f(new qoj1() { // from class: p.bya
            @Override // p.qoj1
            public final void run() {
                rgl rglVar2 = rglVar;
                dm5.n(rglVar2.b(), "Bitmap queued but no timestamps provided.");
                dya dyaVar = this.a;
                dyaVar.e.add(new cya(bitmap, xj30Var, rglVar2));
                dyaVar.Q();
                dyaVar.X = false;
            }
        }, true);
    }

    @Override // p.o5
    public final void F() {
        ((roj1) this.c).f(new aya(this, (byte) 2), true);
    }

    @Override // p.o5
    public final void K(dos dosVar) {
        this.t = 0;
        this.h = dosVar;
    }

    @Override // p.o5
    public final void L() {
        ((roj1) this.c).f(new aya(this, (byte) 0), true);
    }

    public final void Q() {
        Gainmap gainmap;
        if (this.e.isEmpty() || this.t == 0) {
            return;
        }
        cya cyaVar = (cya) this.e.element();
        xj30 xj30Var = cyaVar.b;
        rgl rglVar = cyaVar.c;
        dm5.y(rglVar.b());
        long j = cyaVar.b.b;
        dm5.y(rglVar.b());
        int i = rglVar.e;
        rglVar.e = i + 1;
        long jRound = Math.round(rglVar.b * ((double) i));
        dm5.y(jRound >= 0);
        long j2 = jRound + j;
        if (!this.Y) {
            this.Y = true;
            Bitmap bitmap = cyaVar.a;
            try {
                ss40 ss40Var = this.i;
                if (ss40Var != null) {
                    ss40Var.a();
                }
                int iL = fn31.L();
                fn31.V(iL, bitmap);
                ie30 ie30Var = xj30Var.a;
                this.i = new ss40(iL, -1, ie30Var.w, ie30Var.x);
                if (Build.VERSION.SDK_INT >= 34 && bitmap.hasGainmap()) {
                    dos dosVar = this.h;
                    dosVar.getClass();
                    Gainmap gainmap2 = bitmap.getGainmap();
                    gainmap2.getClass();
                    if (dosVar.k && ((gainmap = dosVar.s) == null || !sf.g(gainmap, gainmap2))) {
                        dosVar.v = false;
                        dosVar.s = gainmap2;
                        int i2 = dosVar.t;
                        if (i2 == -1) {
                            Bitmap gainmapContents = gainmap2.getGainmapContents();
                            int iL2 = fn31.L();
                            fn31.V(iL2, gainmapContents);
                            dosVar.t = iL2;
                        } else {
                            fn31.V(i2, gainmap2.getGainmapContents());
                        }
                    }
                }
                if (this.g) {
                    dos dosVar2 = this.h;
                    dosVar2.getClass();
                    dm5.y(dosVar2.a.c == 1);
                    dosVar2.u = true;
                    dosVar2.v = false;
                }
            } catch (GlUtil.GlException e) {
                throw VideoFrameProcessingException.a(-9223372036854775807L, e);
            }
        }
        this.t--;
        dos dosVar3 = this.h;
        dosVar3.getClass();
        ks40 ks40Var = this.f;
        ss40 ss40Var2 = this.i;
        ss40Var2.getClass();
        dosVar3.g(ks40Var, ss40Var2, j2);
        ie30 ie30Var2 = xj30Var.a;
        LinkedHashMap linkedHashMap = x8r.a;
        synchronized (x8r.class) {
        }
        if (cyaVar.c.b()) {
            return;
        }
        this.Y = false;
        ((cya) this.e.remove()).a.recycle();
        if (this.e.isEmpty() && this.X) {
            dos dosVar4 = this.h;
            dosVar4.getClass();
            dosVar4.a();
            x8r.a();
            this.X = false;
        }
    }

    public final void k() {
        ((roj1) this.c).f(new aya(this, (byte) 1), true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.util.GlUtil$GlException */
    @Override // p.o5
    public final void q() throws VideoFrameProcessingException {
        this.e.clear();
        this.Y = false;
        this.X = false;
        this.t = 0;
        ss40 ss40Var = this.i;
        if (ss40Var != null) {
            try {
                ss40Var.a();
                this.i = null;
            } catch (GlUtil.GlException e) {
                throw VideoFrameProcessingException.a(-9223372036854775807L, e);
            }
        }
        super.q();
    }
}
