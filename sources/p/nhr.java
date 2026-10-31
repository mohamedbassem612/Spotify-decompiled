package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nhr implements qyo0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public nhr(ghr ghrVar, ha8 ha8Var) {
        this.a = (byte) 0;
        this.b = ghrVar;
        this.c = ha8Var;
        this.d = new vku();
    }

    @Override // p.qyo0
    public final void c() {
        byte b = this.a;
        Object obj = this.b;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                ((vku) obj2).a(((ghr) obj).a().subscribe(new yrh(this, (byte) 13)));
                break;
            default:
                if (((jo20) obj2).isEnabled()) {
                    ((yzs) ((ynb0) this.c).get()).a((bbr0) null, (gj5) obj, a8l.a);
                    break;
                }
                break;
        }
    }

    @Override // p.qyo0
    public final void d() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((vku) obj).c();
                break;
            default:
                if (((jo20) obj).isEnabled()) {
                    ((yzs) ((ynb0) this.c).get()).b(a8l.a);
                    break;
                }
                break;
        }
    }

    public nhr(gj5 gj5Var, ynb0 ynb0Var, jo20 jo20Var) {
        this.a = (byte) 1;
        this.b = gj5Var;
        this.c = ynb0Var;
        this.d = jo20Var;
    }
}
