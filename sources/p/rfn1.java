package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rfn1 extends egn1 {
    public final transient int h;
    public final transient int i;
    public final /* synthetic */ egn1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfn1(egn1 egn1Var, int i, int i2) {
        super((byte) 2);
        this.t = egn1Var;
        this.h = i;
        this.i = i2;
    }

    public final Object get(int i) {
        wmo1.D(i, this.i);
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

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final egn1 subList(int i, int i2) {
        wmo1.F(i, i2, this.i);
        int i3 = this.h;
        return this.t.q(i + i3, i2 + i3);
    }

    public final int size() {
        return this.i;
    }
}
