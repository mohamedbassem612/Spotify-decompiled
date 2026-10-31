package p;

import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p4d1 implements SurfaceHolder.Callback {
    public Size a;
    public j4d1 b;
    public j4d1 c;
    public k65 d;
    public Size e;
    public boolean f = false;
    public boolean g = false;
    public final /* synthetic */ q4d1 h;

    public p4d1(q4d1 q4d1Var) {
        this.h = q4d1Var;
    }

    public final void a() {
        if (this.b != null) {
            Objects.toString(this.b);
            j2h1.o("SurfaceViewImpl");
            this.b.c();
        }
    }

    public final boolean b() {
        q4d1 q4d1Var = this.h;
        Surface surface = q4d1Var.e.getHolder().getSurface();
        if (this.f || this.b == null || !Objects.equals(this.a, this.e)) {
            return false;
        }
        j2h1.o("SurfaceViewImpl");
        k65 k65Var = this.d;
        j4d1 j4d1Var = this.b;
        Objects.requireNonNull(j4d1Var);
        j4d1Var.a(surface, x74.N(q4d1Var.e.getContext()), new jj5(k65Var, (byte) 4));
        this.f = true;
        q4d1Var.d = true;
        q4d1Var.f();
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        j2h1.o("SurfaceViewImpl");
        this.e = new Size(i2, i3);
        b();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        j4d1 j4d1Var;
        j2h1.o("SurfaceViewImpl");
        if (!this.g || (j4d1Var = this.c) == null) {
            return;
        }
        j4d1Var.c();
        j4d1Var.i.b((Object) null);
        this.c = null;
        this.g = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        j2h1.o("SurfaceViewImpl");
        if (!this.f) {
            a();
        } else if (this.b != null) {
            Objects.toString(this.b);
            j2h1.o("SurfaceViewImpl");
            this.b.k.a();
        }
        this.g = true;
        j4d1 j4d1Var = this.b;
        if (j4d1Var != null) {
            this.c = j4d1Var;
        }
        this.f = false;
        this.b = null;
        this.d = null;
        this.e = null;
        this.a = null;
    }
}
