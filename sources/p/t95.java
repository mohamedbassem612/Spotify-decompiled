package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class t95 implements y95 {
    public final q95 a;
    public final q95 b;

    public t95(q95 q95Var, q95 q95Var2) {
        this.a = q95Var;
        this.b = q95Var2;
    }

    @Override // p.y95
    public final fba c0() {
        return new jya1((cr20) this.a.c0(), (cr20) this.b.c0());
    }

    @Override // p.y95
    public final List l0() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p.y95
    public final boolean o0() {
        return this.a.o0() && this.b.o0();
    }
}
