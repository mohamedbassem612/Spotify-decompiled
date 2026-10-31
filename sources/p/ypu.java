package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ypu extends s5 {
    public final /* synthetic */ byte a;
    public final e6b b;

    public ypu(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new ife1();
                break;
            default:
                this.b = new xpu();
                break;
        }
    }

    @Override // p.s5
    public void a(ala1 ala1Var) {
        byte b = this.a;
    }

    @Override // p.s5
    public boolean c(e6b e6bVar) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.c(e6bVar);
        }
    }

    @Override // p.s5
    public final e6b f() {
        byte b = this.a;
        e6b e6bVar = this.b;
        switch (b) {
            case 0:
                return (xpu) e6bVar;
            default:
                return (ife1) e6bVar;
        }
    }

    @Override // p.s5
    public boolean h() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.h();
        }
    }

    @Override // p.s5
    public final jwg j(cqu cquVar) {
        switch (this.a) {
            case 0:
                return jwg.a(cquVar.c);
            default:
                return null;
        }
    }

    private final void k(ala1 ala1Var) {
    }
}
