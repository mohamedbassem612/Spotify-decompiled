package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class psw implements jsw {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bv30 b;

    public /* synthetic */ psw(bv30 bv30Var, byte b) {
        this.a = b;
        this.b = bv30Var;
    }

    public final void a(int i, Object obj, b0k b0kVar, ksw kswVar, iu30 iu30Var) {
        switch (this.a) {
            case 0:
                x340 x340Var = (x340) b0kVar;
                x340Var.i0(242442800);
                int i2 = (i >> 6) & 14;
                int i3 = i << 3;
                this.b.c1(kswVar, obj, iu30Var, x340Var, Integer.valueOf((i3 & 896) | i2 | (i3 & 112)));
                x340Var.r(false);
                break;
            default:
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.i0(-861386030);
                int i4 = (i >> 6) & 14;
                int i5 = i << 3;
                this.b.c1(kswVar, obj, iu30Var, x340Var2, Integer.valueOf((i5 & 896) | i4 | (i5 & 112)));
                x340Var2.r(false);
                break;
        }
    }

    public final boolean b() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return false;
        }
    }
}
