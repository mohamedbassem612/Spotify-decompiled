package p;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.comscore.streaming.ContentMediaFormat;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class so00 implements qwj1, t38, hbe1, plj0, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ yo00 a;

    public so00(yo00 yo00Var) {
        this.a = yo00Var;
    }

    public final void A(long j, long j2, String str) {
        pfr pfrVar = this.a.s;
        tz3 tz3VarW = pfrVar.W();
        pfrVar.a0(tz3VarW, ContentMediaFormat.PREVIEW_EPISODE, new hfr(tz3VarW, str, j2, j, (byte) 0));
    }

    public final void B(far farVar) {
        pfr pfrVar = this.a.s;
        pfrVar.a0(pfrVar.W(), ContentMediaFormat.PREVIEW_GENERIC, new lfr((byte) 2));
    }

    public final void C(Exception exc) {
        pfr pfrVar = this.a.s;
        pfrVar.a0(pfrVar.W(), 1029, new n7o((byte) 28));
    }

    public final void D(Exception exc) {
        pfr pfrVar = this.a.s;
        pfrVar.a0(pfrVar.W(), 1030, new lfr((byte) 3));
    }

    public final void E(long j, Object obj) {
        yo00 yo00Var = this.a;
        pfr pfrVar = yo00Var.s;
        tz3 tz3VarW = pfrVar.W();
        pfrVar.a0(tz3VarW, 26, new bzh(tz3VarW, obj, j));
        if (yo00Var.V == obj) {
            yo00Var.m.h(26, new n9v((byte) 14));
        }
    }

    public final void F(int i, long j) {
        pfr pfrVar = this.a.s;
        pfrVar.a0(pfrVar.M((p2i0) pfrVar.d.e), 1021, new lfr((byte) 5));
    }

    public final void G(int i, long j, long j2) {
        pfr pfrVar = this.a.s;
        pfrVar.a0(pfrVar.W(), 1011, new lfr((byte) 20));
    }

    public final void I(ie30 ie30Var, iar iarVar) {
        yo00 yo00Var = this.a;
        yo00Var.T = ie30Var;
        pfr pfrVar = yo00Var.s;
        pfrVar.a0(pfrVar.W(), 1017, new lfr((byte) 9));
    }

    public final void M(int i, long j) {
        pfr pfrVar = this.a.s;
        tz3 tz3VarM = pfrVar.M((p2i0) pfrVar.d.e);
        pfrVar.a0(tz3VarM, 1018, new nfr(tz3VarM, i, j));
    }

    public final void S(iwg iwgVar) {
        this.a.G.r(iwgVar);
    }

    public final void T(long j, long j2, String str) {
        pfr pfrVar = this.a.s;
        tz3 tz3VarW = pfrVar.W();
        pfrVar.a0(tz3VarW, 1016, new hfr(tz3VarW, str, j2, j, (byte) 1));
    }

    public final void b(z1k1 z1k1Var) {
        yo00 yo00Var = this.a;
        yo00Var.o0 = z1k1Var;
        yo00Var.m.h(25, new kfr(z1k1Var));
    }

    public final void d(far farVar) {
        yo00 yo00Var = this.a;
        pfr pfrVar = yo00Var.s;
        tz3 tz3VarM = pfrVar.M((p2i0) pfrVar.d.e);
        pfrVar.a0(tz3VarM, 1020, new thn(tz3VarM, farVar, (byte) 4));
        yo00Var.T = null;
        yo00Var.d0 = null;
    }

    public final void h(String str) {
        pfr pfrVar = this.a.s;
        pfrVar.a0(pfrVar.W(), 1019, new lfr((byte) 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(int i) {
        t01 t01Var = this.a.C;
        ro00 ro00Var = new ro00(i, 0 == true ? 1 : 0);
        t01Var.getClass();
        dm5.y(Looper.myLooper() == ((wdd1) t01Var.c).a.getLooper());
        t01Var.a++;
        t01Var.E(new ny2((Object) t01Var, (Object) ro00Var, (byte) 16));
        t01Var.H(Integer.valueOf(i));
    }

    public final void k(boolean z) {
        yo00 yo00Var = this.a;
        if (yo00Var.h0 == z) {
            return;
        }
        yo00Var.h0 = z;
        yo00Var.m.h(23, new mo00((byte) 1, z));
    }

    public final void l(List list) {
        this.a.m.h(27, new ifr(list));
    }

    public final void n(far farVar) {
        yo00 yo00Var = this.a;
        pfr pfrVar = yo00Var.s;
        pfrVar.a0(pfrVar.M((p2i0) pfrVar.d.e), ContentMediaFormat.EXTRA_MOVIE, new lfr((byte) 6));
        yo00Var.U = null;
    }

    public final void o(qeo qeoVar) {
        yo00 yo00Var = this.a;
        yo00Var.i0 = qeoVar;
        yo00Var.m.h(27, new nay(qeoVar, (byte) 7));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        yo00 yo00Var = this.a;
        yo00Var.D1(surface);
        yo00Var.W = surface;
        yo00Var.x1(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        yo00 yo00Var = this.a;
        yo00Var.D1(null);
        yo00Var.x1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.x1(i, i2);
    }

    public final void p(b4x0 b4x0Var) {
        pfr pfrVar = this.a.s;
        pfrVar.a0(pfrVar.W(), 1031, new lfr((byte) 10));
    }

    public final void q(String str) {
        pfr pfrVar = this.a.s;
        pfrVar.a0(pfrVar.W(), ContentMediaFormat.EXTRA_EPISODE, new n7o((byte) 5));
    }

    public final void r(b4x0 b4x0Var) {
        pfr pfrVar = this.a.s;
        pfrVar.a0(pfrVar.W(), 1032, new lfr((byte) 28));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.x1(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        yo00 yo00Var = this.a;
        if (yo00Var.Z) {
            yo00Var.D1(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        yo00 yo00Var = this.a;
        if (yo00Var.Z) {
            yo00Var.D1(null);
        }
        yo00Var.x1(0, 0);
    }

    public final void u(hjj0 hjj0Var) {
        yo00 yo00Var = this.a;
        h9d0 h9d0Var = yo00Var.m;
        upq upqVarA = yo00Var.s0.a();
        int i = 0;
        while (true) {
            rij0[] rij0VarArr = hjj0Var.a;
            if (i >= rij0VarArr.length) {
                break;
            }
            rij0VarArr[i].b(upqVarA);
            i++;
        }
        yo00Var.s0 = new tqh0(upqVarA);
        tqh0 tqh0VarK1 = yo00Var.k1();
        if (!tqh0VarK1.equals(yo00Var.R)) {
            yo00Var.R = tqh0VarK1;
            h9d0Var.c(14, new nay(this, (byte) 8));
        }
        h9d0Var.c(28, new nay(hjj0Var, (byte) 9));
        h9d0Var.b();
    }

    public final void v(far farVar) {
        yo00 yo00Var = this.a;
        yo00Var.d0 = farVar;
        pfr pfrVar = yo00Var.s;
        pfrVar.a0(pfrVar.W(), ContentMediaFormat.PARTIAL_CONTENT_PODCAST, new lfr((byte) 12));
    }

    public final void w(ie30 ie30Var, iar iarVar) {
        yo00 yo00Var = this.a;
        yo00Var.U = ie30Var;
        pfr pfrVar = yo00Var.s;
        pfrVar.a0(pfrVar.W(), ContentMediaFormat.PREVIEW_MOVIE, new lfr((byte) 11));
    }

    public final void x(Exception exc) {
        pfr pfrVar = this.a.s;
        pfrVar.a0(pfrVar.W(), ContentMediaFormat.FULL_CONTENT_PODCAST, new lfr((byte) 15));
    }

    public final void y(iwg iwgVar) {
        this.a.F.r(iwgVar);
    }

    public final void z(long j) {
        pfr pfrVar = this.a.s;
        pfrVar.a0(pfrVar.W(), ContentMediaFormat.EXTRA_GENERIC, new lfr((byte) 21));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
