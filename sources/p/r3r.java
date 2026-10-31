package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class r3r implements wrw {
    public final wul1 a;
    public final vu30 b;
    public final vu30 c;
    public final fnn d;
    public final b7x e;
    public final mch f;

    public r3r(wul1 wul1Var, vu30 vu30Var, vu30 vu30Var2) {
        ruh0 ruh0VarF;
        this.a = wul1Var;
        this.b = vu30Var;
        this.c = vu30Var2;
        this.d = new fnn(this, (byte) 29);
        this.e = b7x.a;
        f4r data = wul1Var.getData();
        f4r f4rVarB = null;
        tmh0 tmh0Var = wul1Var instanceof tmh0 ? (tmh0) wul1Var : null;
        if (tmh0Var != null && (ruh0VarF = tmh0Var.f()) != null) {
            f4rVarB = ruh0VarF.b();
        }
        this.f = i6p1.q(data, f4rVarB);
    }

    @Override // p.wrw
    public final f4r b() {
        return this.f;
    }

    @Override // p.wrw
    public final vu30 c() {
        return new i4o(this, (byte) 6);
    }

    @Override // p.wrw
    public final vu30 d() {
        return this.b;
    }

    @Override // p.wrw
    public final iu30 e() {
        return this.d;
    }

    @Override // p.wrw
    public final s3r f() {
        return new q3r(this);
    }

    @Override // p.wrw
    public final ruh0 g() {
        wul1 wul1Var = this.a;
        tmh0 tmh0Var = wul1Var instanceof tmh0 ? (tmh0) wul1Var : null;
        if (tmh0Var != null) {
            return tmh0Var.f();
        }
        return null;
    }

    @Override // p.wrw
    public final Map getMetadata() {
        return this.e;
    }

    @Override // p.wrw
    public final vu30 h() {
        return this.c;
    }

    public /* synthetic */ r3r(wul1 wul1Var, vu30 vu30Var, int i) {
        this(wul1Var, (i & 2) != 0 ? ido.N0 : vu30Var, (vu30) null);
    }
}
