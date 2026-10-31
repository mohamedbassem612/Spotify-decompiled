package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nmc0 extends s5 {
    public final lmc0 a;
    public boolean b;
    public int c;

    public nmc0(lmc0 lmc0Var) {
        this.a = lmc0Var;
    }

    @Override // p.s5
    public final boolean c(e6b e6bVar) {
        if (!(e6bVar instanceof bvc0)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.b = false;
        }
        return true;
    }

    @Override // p.s5
    public final e6b f() {
        return this.a;
    }

    @Override // p.s5
    public final boolean h() {
        return true;
    }

    @Override // p.s5
    public final jwg j(cqu cquVar) {
        if (cquVar.i) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return jwg.a(cquVar.c);
    }
}
