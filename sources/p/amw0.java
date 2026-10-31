package p;

import android.graphics.Rect;
import android.util.Rational;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class amw0 implements haw0 {
    public final /* synthetic */ gmw0 a;

    public amw0(gmw0 gmw0Var) {
        this.a = gmw0Var;
    }

    @Override // p.haw0
    public final void a(j4d1 j4d1Var) {
        hmw0 q4d1Var;
        byte b = 16;
        if (!w8p1.w()) {
            x74.N(this.a.getContext()).execute(new zyh0(this, j4d1Var, b));
            return;
        }
        j2h1.o("PreviewView");
        n3d n3dVar = j4d1Var.d;
        this.a.i = n3dVar.g();
        imw0 imw0Var = this.a.h;
        Rect rectA = n3dVar.c().a();
        imw0Var.getClass();
        new Rational(rectA.width(), rectA.height());
        synchronized (imw0Var) {
            imw0Var.b = rectA;
        }
        j4d1Var.b(x74.N(this.a.getContext()), new k65(this, n3dVar, j4d1Var, b));
        gmw0 gmw0Var = this.a;
        hmw0 hmw0Var = gmw0Var.b;
        dmw0 dmw0Var = gmw0Var.a;
        if (!(hmw0Var instanceof q4d1) || gmw0.b(j4d1Var, dmw0Var)) {
            gmw0 gmw0Var2 = this.a;
            boolean zB = gmw0.b(j4d1Var, gmw0Var2.a);
            gmw0 gmw0Var3 = this.a;
            ylw0 ylw0Var = gmw0Var3.d;
            if (zB) {
                hfe1 hfe1Var = new hfe1(gmw0Var3, ylw0Var);
                hfe1Var.i = false;
                hfe1Var.k = new AtomicReference();
                q4d1Var = hfe1Var;
            } else {
                q4d1Var = new q4d1(gmw0Var3, ylw0Var);
            }
            gmw0Var2.b = q4d1Var;
        }
        l3d l3dVarG = n3dVar.g();
        gmw0 gmw0Var4 = this.a;
        kdn0 kdn0Var = gmw0Var4.f;
        hmw0 hmw0Var2 = gmw0Var4.b;
        kl1 kl1Var = new kl1();
        kl1Var.a = false;
        kl1Var.b = l3dVarG;
        kl1Var.c = kdn0Var;
        kl1Var.e = hmw0Var2;
        synchronized (kl1Var) {
            kl1Var.d = (fmw0) kdn0Var.e();
        }
        this.a.g.set(kl1Var);
        n3dVar.k().f(x74.N(this.a.getContext()), kl1Var);
        this.a.b.e(j4d1Var, new k65(this, kl1Var, n3dVar, (byte) 17));
        gmw0 gmw0Var5 = this.a;
        if (gmw0Var5.indexOfChild(gmw0Var5.c) == -1) {
            gmw0 gmw0Var6 = this.a;
            gmw0Var6.addView(gmw0Var6.c);
        }
    }
}
