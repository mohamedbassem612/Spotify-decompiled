package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qwn0 implements mmo {
    public final yun0 a;
    public final kdn0 b = new kdn0();

    public qwn0(yun0 yun0Var) {
        this.a = yun0Var;
    }

    @Override // p.mmo
    public final void b(String str, zf30 zf30Var) {
        xg30 xg30VarA;
        yun0 yun0Var = this.a;
        xun0 xun0VarH = yun0Var.h();
        if (xun0VarH == null || (xg30VarA = xun0VarH.a()) == null) {
            return;
        }
        xun0 xun0VarH2 = yun0Var.h();
        if (zf30Var != (xun0VarH2 != null ? xun0VarH2.b() : null)) {
            return;
        }
        xg30VarA.a = str;
        this.b.m(str);
    }

    @Override // p.mmo
    public final zf30 c() {
        xun0 xun0VarH = this.a.h();
        if (xun0VarH != null) {
            return xun0VarH.b();
        }
        return null;
    }

    @Override // p.mmo
    public final kdn0 d() {
        return this.b;
    }

    @Override // p.mmo
    public final e6w0 k() {
        xg30 xg30VarA;
        xun0 xun0VarH = this.a.h();
        if (xun0VarH == null || (xg30VarA = xun0VarH.a()) == null) {
            return null;
        }
        return xg30VarA.d;
    }
}
