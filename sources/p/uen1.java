package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uen1 extends efn1 {
    public final transient int h;
    public final transient int i;
    public final /* synthetic */ efn1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uen1(efn1 efn1Var, int i, int i2) {
        super((byte) 1);
        this.t = efn1Var;
        this.h = i;
        this.i = i2;
    }

    public final Object get(int i) {
        rno1.r(i, this.i);
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
    public final efn1 subList(int i, int i2) {
        rno1.t(i, i2, this.i);
        int i3 = this.h;
        return this.t.p(i + i3, i2 + i3);
    }

    public final int size() {
        return this.i;
    }
}
