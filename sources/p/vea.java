package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vea implements jyp0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7e1 b;

    public /* synthetic */ vea(r7e1 r7e1Var, byte b) {
        this.a = b;
        this.b = r7e1Var;
    }

    @Override // p.jyp0
    public final long a() {
        byte b = this.a;
        r7e1 r7e1Var = this.b;
        switch (b) {
            case 0:
                return r7e1Var.j(true).b;
            case 1:
                return r7e1Var.p(true, true).b;
            default:
                return r7e1Var.p(false, true).b;
        }
    }
}
