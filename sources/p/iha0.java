package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class iha0 extends gha0 {
    public final List X;
    public final int Y;
    public int Z;
    public final uga0 t;

    public iha0(nfa0 nfa0Var, uga0 uga0Var) {
        super(nfa0Var, uga0Var, (String) null, 12);
        this.t = uga0Var;
        List listL1 = o7h.l1(uga0Var.a.keySet());
        this.X = listL1;
        this.Y = listL1.size() * 2;
        this.Z = -1;
    }

    @Override // p.gha0, p.z6
    public final ega0 G() {
        return this.t;
    }

    @Override // p.gha0
    /* JADX INFO: renamed from: P */
    public final uga0 G() {
        return this.t;
    }

    @Override // p.gha0, p.z6
    public final ega0 e(String str) {
        return this.Z % 2 == 0 ? fga0.c(str) : (ega0) sqg0.G(str, this.t);
    }

    @Override // p.gha0
    public final int p(h661 h661Var) {
        int i = this.Z;
        if (i >= this.Y - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.Z = i2;
        return i2;
    }

    @Override // p.gha0, p.z6
    public final String z(h661 h661Var, int i) {
        return (String) this.X.get(i / 2);
    }

    @Override // p.gha0, p.z6
    public final void a(h661 h661Var) {
    }
}
