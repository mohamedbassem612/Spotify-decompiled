package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class evc0 extends s5 {
    public final bvc0 a = new bvc0();
    public final int b;
    public boolean c;

    public evc0(int i) {
        this.b = i;
    }

    @Override // p.s5
    public final boolean c(e6b e6bVar) {
        if (!this.c) {
            return true;
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
            if (this.a.b == null) {
                return null;
            }
            e6b e6bVarF = cquVar.g().f();
            this.c = (e6bVarF instanceof oor0) || (e6bVarF instanceof bvc0);
            return jwg.a(cquVar.f);
        }
        int i = cquVar.h;
        int i2 = this.b;
        if (i >= i2) {
            return new jwg(-1, cquVar.d + i2, false);
        }
        return null;
    }
}
