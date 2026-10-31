package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ycl1 implements xgm1 {
    public final xgm1 a;
    public final e7m1 b;
    public final bpb1 c = gio1.b(Boolean.TRUE);
    public final bpb1 d = gio1.b(Boolean.FALSE);

    public ycl1(xgm1 xgm1Var, e7m1 e7m1Var) {
        this.a = xgm1Var;
        this.b = e7m1Var;
    }

    @Override // p.xgm1
    public final void a(vgm1 vgm1Var) {
        this.a.a(vgm1Var);
    }

    public final void b(kxj1 kxj1Var) {
        boolean zEquals = kxj1Var.equals(ixj1.a);
        bpb1 bpb1Var = this.c;
        if (zEquals) {
            bpb1Var.m((Object) null, Boolean.TRUE);
            return;
        }
        if (kxj1Var.equals(hxj1.a)) {
            bpb1Var.m((Object) null, Boolean.FALSE);
        } else {
            if (kxj1Var.equals(gxj1.a)) {
                return;
            }
            if (kxj1Var.equals(jxj1.a)) {
                this.b.invoke(sjz.d);
            } else {
                eg.o();
            }
        }
    }

    @Override // p.xgm1
    public final zob1 getState() {
        return this.a.getState();
    }
}
