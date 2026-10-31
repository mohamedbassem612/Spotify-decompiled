package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vho1 extends yho1 {
    public final transient int h;
    public final transient int i;
    public final /* synthetic */ yho1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vho1(yho1 yho1Var, int i, int i2) {
        super((byte) 4);
        this.t = yho1Var;
        this.h = i;
        this.i = i2;
    }

    public final Object get(int i) {
        eio1.E(i, this.i);
        return this.t.get(i + this.h);
    }

    public final Object[] k() {
        return this.t.k();
    }

    public final int l() {
        return this.t.l() + this.h;
    }

    public final int m() {
        return this.t.l() + this.h + this.i;
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final yho1 subList(int i, int i2) {
        eio1.G(i, i2, this.i);
        int i3 = this.h;
        return this.t.p(i + i3, i2 + i3);
    }

    public final int size() {
        return this.i;
    }
}
