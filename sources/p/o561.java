package p;

import android.graphics.Bitmap;
import androidx.media3.transformer.ExportException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o561 implements b67 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final ie30 d;
    public final ie30 e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ q561 h;

    public o561(q561 q561Var, long j) {
        this.h = q561Var;
        this.a = j;
        boolean z = q561Var.y || q561Var.b.contains(1);
        this.b = z;
        boolean z2 = q561Var.z || q561Var.b.contains(2);
        this.c = z2;
        dm5.y(z || z2);
        ge30 ge30Var = new ge30();
        ge30Var.o = asj0.p("audio/raw");
        this.d = new ie30(ge30Var);
        ge30 ge30Var2 = new ge30();
        ge30Var2.o = asj0.p("audio/raw");
        ge30Var2.K = 44100;
        ge30Var2.I = 2;
        ge30Var2.L = 2;
        this.e = new ie30(ge30Var2);
    }

    public final void a() {
        boolean z = false;
        boolean z2 = true;
        boolean z3 = this.b && !this.f;
        boolean z4 = this.c && !this.g;
        dm5.y(z3 || z4);
        q561 q561Var = this.h;
        if (z3) {
            try {
                p561 p561VarE = q561Var.e(this.e);
                if (p561VarE == null) {
                    z = true;
                } else {
                    q561 q561Var2 = p561VarE.d;
                    if (q561Var2.k.decrementAndGet() == 0 && !q561Var2.j()) {
                        q561Var2.f.f(new v241(p561VarE, (byte) 3));
                    }
                    this.f = true;
                }
            } catch (ExportException e) {
                q561Var.b(e);
                return;
            } catch (RuntimeException e2) {
                q561Var.b(ExportException.a(1000, e2));
                return;
            }
        }
        if (!z4) {
            z2 = z;
        } else if (q561Var.e(q561.B) != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(16, 16, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.eraseColor(-16777216);
            q561Var.i(bitmapCreateBitmap);
            this.g = true;
            z2 = z;
        }
        if (z2) {
            q561Var.f.g(new v241(this, (byte) 2), 10L);
        }
    }

    @Override // p.b67
    public final int c(ij81 ij81Var) {
        boolean z = this.b && !this.f;
        boolean z2 = this.c && !this.g;
        if (z && z2) {
            ij81Var.b = 0;
            return 2;
        }
        if (z || z2) {
            ij81Var.b = 50;
            return 2;
        }
        ij81Var.b = 99;
        return 2;
    }

    @Override // p.b67
    public final j380 g() {
        return gg11.g;
    }

    @Override // p.b67
    public final void start() {
        long j = this.a;
        q561 q561Var = this.h;
        q561Var.f(j);
        boolean z = this.c;
        boolean z2 = this.b;
        q561Var.a((z2 && z) ? 2 : 1);
        if (z2) {
            q561Var.d(2, this.d);
        }
        if (z) {
            q561Var.d(2, q561.B);
        }
        a();
    }

    @Override // p.b67
    public final void release() {
    }
}
