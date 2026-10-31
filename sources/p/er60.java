package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class er60 implements xpw {
    public final mqw b;
    public final rqw c;
    public final avl1 d;
    public final Object e;
    public final /* synthetic */ byte a = 1;
    public final jsw f = new rzj(this, (byte) 7);

    public er60(w460 w460Var) {
        this.d = w460Var;
        this.b = w460Var.d;
        this.c = w460Var.e;
        this.e = w460Var.b();
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final String b() {
        switch (this.a) {
            case 0:
                return (String) this.e;
            default:
                return this.d.b();
        }
    }

    public final jsw c() {
        byte b = this.a;
        rzj rzjVar = this.f;
        switch (b) {
            case 0:
                break;
        }
        return rzjVar;
    }

    public void e(int i, Object obj, b0k b0kVar, ksw kswVar, iu30 iu30Var) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1813468847);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(obj) : x340Var.i(obj) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(kswVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ysw(kswVar.b, kswVar.c, kswVar.d);
                x340Var.s0(objT);
            }
            ysw yswVar = (ysw) objT;
            ien0 ien0Var = qsw.a;
            u601 u601VarC = gfe0.c(x340Var);
            qim0 qim0Var = (qim0) this.e;
            int i3 = i2 & 14;
            boolean zI = ((i2 & 7168) == 2048) | x340Var.i(u601VarC) | (i3 == 4);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new v721(iu30Var, this, u601VarC, (byte) 19);
                x340Var.s0(objT2);
            }
            iu30 iu30Var2 = (iu30) objT2;
            boolean zI2 = (i3 == 4) | x340Var.i(u601VarC) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && x340Var.i(obj))) | x340Var.i(yswVar);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new o4u(u601VarC, iu30Var, obj, yswVar);
                x340Var.s0(objT3);
            }
            dm5.a(iu30Var2, qim0Var, (iu30) objT3, x340Var, 0, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, this, iu30Var, obj, kswVar, (byte) 3);
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public er60(laa laaVar, qim0 qim0Var) {
        this.d = laaVar;
        this.e = qim0Var;
        this.b = laaVar.getBehavior();
        this.c = laaVar.a();
    }
}
