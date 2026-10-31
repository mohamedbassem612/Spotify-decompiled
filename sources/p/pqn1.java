package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pqn1 extends rqn1 {
    public final transient int h;
    public final transient int i;
    public final /* synthetic */ rqn1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqn1(rqn1 rqn1Var, int i, int i2) {
        super((byte) 3);
        this.t = rqn1Var;
        this.h = i;
        this.i = i2;
    }

    public final Object get(int i) {
        epo1.L(i, this.i);
        return this.t.get(i + this.h);
    }

    public final int i() {
        return this.t.l() + this.h + this.i;
    }

    public final int l() {
        return this.t.l() + this.h;
    }

    public final Object[] n() {
        return this.t.n();
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final rqn1 subList(int i, int i2) {
        epo1.N(i, i2, this.i);
        int i3 = this.h;
        return this.t.p(i + i3, i2 + i3);
    }

    public final int size() {
        return this.i;
    }
}
