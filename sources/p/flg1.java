package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class flg1 extends cjg1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jhg1 b;

    public /* synthetic */ flg1(jhg1 jhg1Var, byte b) {
        this.a = b;
        this.b = jhg1Var;
    }

    @Override // p.cjg1, p.ghg1
    public void b(jhg1 jhg1Var) {
        switch (this.a) {
            case 1:
                glg1 glg1Var = (glg1) this.b;
                glg1Var.f1.remove(jhg1Var);
                if (!glg1Var.y()) {
                    glg1Var.D(glg1Var, ihg1.x0, false);
                    glg1Var.R0 = true;
                    glg1Var.D(glg1Var, ihg1.w0, false);
                }
                break;
        }
    }

    @Override // p.cjg1, p.ghg1
    public void f(jhg1 jhg1Var) {
        switch (this.a) {
            case 0:
                this.b.J();
                jhg1Var.G(this);
                break;
        }
    }
}
