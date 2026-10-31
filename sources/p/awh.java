package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class awh implements isi0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pdy0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ awh(pdy0 pdy0Var, Object obj, byte b) {
        this.a = b;
        this.b = pdy0Var;
        this.c = obj;
    }

    public final void a() {
        byte b = this.a;
        Object obj = this.c;
        h55 h55Var = this.b;
        switch (b) {
            case 0:
                if (((o94) h55Var).a()) {
                    ((e390) ((ynb0) obj).get()).a.f(-1);
                }
                break;
            case 1:
                if (((nf4) h55Var).a()) {
                    for (o320 o320Var : ((p320) obj).a.values()) {
                        o320Var.getClass();
                        dem1.v();
                        o320Var.a.clear();
                        o320Var.b.clear();
                    }
                }
                break;
            default:
                if (h55Var.a()) {
                    d390 d390Var = (d390) ((ynb0) obj).get();
                    d390Var.a.f(-1);
                    d390Var.b.f(-1);
                }
                break;
        }
    }
}
