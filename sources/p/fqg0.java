package p;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fqg0 implements xpw {
    public final laa a;
    public final boolean b;
    public final FrameLayout.LayoutParams c;
    public final qim0 d;
    public final mqw e;
    public final rqw f;
    public final eqg0 g = new eqg0(this);

    public fqg0(laa laaVar, boolean z, FrameLayout.LayoutParams layoutParams, qim0 qim0Var) {
        this.a = laaVar;
        this.b = z;
        this.c = layoutParams;
        this.d = qim0Var;
        this.e = laaVar.getBehavior();
        this.f = laaVar.a();
    }

    @Override // p.avl1
    public final rqw a() {
        return this.f;
    }

    @Override // p.maa
    public final String b() {
        return this.a.b();
    }

    @Override // p.maa
    public final jsw c() {
        return this.g;
    }

    public final void e(int i, Object obj, b0k b0kVar, ksw kswVar, iu30 iu30Var) {
        int i2;
        iu30 iu30Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(596562193);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(obj) : x340Var.i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(kswVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zG = x340Var.g(kswVar);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                objT = new ysw(kswVar.b, kswVar.c, kswVar.d);
                x340Var.s0(objT);
            }
            ysw yswVar = (ysw) objT;
            ien0 ien0Var = qsw.a;
            u601 u601VarC = gfe0.c(x340Var);
            if (this.b) {
                x340Var.i0(-388493453);
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = wlg0.Y0;
                    x340Var.s0(objT2);
                }
                iu30Var2 = (iu30) objT2;
                x340Var.r(false);
            } else {
                x340Var.i0(-388397044);
                x340Var.r(false);
                iu30Var2 = null;
            }
            int i3 = i2 & 14;
            boolean zI = x340Var.i(this) | x340Var.i(u601VarC) | (i3 == 4);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new gnf0(iu30Var, this, u601VarC, (byte) 6);
                x340Var.s0(objT3);
            }
            iu30 iu30Var3 = (iu30) objT3;
            boolean zI2 = (i3 == 4) | x340Var.i(u601VarC) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(obj))) | x340Var.i(yswVar);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new ntf0(u601VarC, iu30Var, obj, yswVar);
                x340Var.s0(objT4);
            }
            dm5.b(iu30Var3, this.d, iu30Var2, null, (iu30) objT4, x340Var, 0, 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, this, iu30Var, obj, kswVar, (byte) 28);
        }
    }

    @Override // p.maa
    public final mqw getBehavior() {
        return this.e;
    }
}
