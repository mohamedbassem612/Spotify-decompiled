package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dcq {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ dcq(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final ngx0 a(n6r0 n6r0Var) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                return new ngx0((yix0) r7qVar.d.Y2.get(), n6r0Var);
            default:
                p68 p68Var = (p68) ((a1q) ((uyp) r7qVar).b).b;
                yll yllVar = p68Var.a ? (yll) p68Var.c : (yix0) p68Var.b;
                c8o.l(yllVar);
                return new ngx0(yllVar, n6r0Var);
        }
    }
}
