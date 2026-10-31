package p;

import androidx.compose.ui.geometry.Offset;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class o7n implements iu30 {
    public final /* synthetic */ r1c0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ z8e1 d;
    public final /* synthetic */ c8e1 e;
    public final /* synthetic */ x180 f;
    public final /* synthetic */ hyp0 g;
    public final /* synthetic */ x6e1 h;
    public final /* synthetic */ c9n i;
    public final /* synthetic */ j5c t;

    public /* synthetic */ o7n(r1c0 r1c0Var, boolean z, boolean z2, z8e1 z8e1Var, c8e1 c8e1Var, x180 x180Var, hyp0 hyp0Var, x6e1 x6e1Var, c9n c9nVar, j5c j5cVar) {
        this.a = r1c0Var;
        this.b = z;
        this.c = z2;
        this.d = z8e1Var;
        this.e = c8e1Var;
        this.f = x180Var;
        this.g = hyp0Var;
        this.h = x6e1Var;
        this.i = c9nVar;
        this.t = j5cVar;
    }

    public final Object invoke(Object obj) {
        z9e1 z9e1VarD;
        wz20 wz20Var = (wz20) obj;
        r1c0 r1c0Var = this.a;
        boolean zB = r1c0Var.b();
        boolean zB2 = wz20Var.b();
        rih1 rih1Var = rih1.a;
        if (zB != zB2) {
            r1c0Var.f.setValue(Boolean.valueOf(wz20Var.b()));
            boolean zB3 = r1c0Var.b();
            c8e1 c8e1Var = this.e;
            hyp0 hyp0Var = this.g;
            if (zB3 && this.b && !this.c) {
                eko1.D(this.d, r1c0Var, c8e1Var, this.f, hyp0Var);
            } else {
                eko1.t(r1c0Var);
            }
            if (wz20Var.b() && (z9e1VarD = r1c0Var.d()) != null) {
                fn31.T(this.i, (o8n) null, 0, new el0((byte) 17, this.t, c8e1Var, r1c0Var, z9e1VarD, hyp0Var, (lnm) null), 3);
            }
            if (!wz20Var.b()) {
                this.h.d((Offset) null);
            }
        }
        return rih1Var;
    }
}
