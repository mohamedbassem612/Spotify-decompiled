package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ozg1 implements wpw {
    public final sfx a;
    public final ojm b;
    public final boolean c;
    public final rey0 d;
    public final ia00 e;
    public final kjv f;

    public ozg1(sfx sfxVar, lzn0 lzn0Var, boolean z, agc0 agc0Var) {
        ojm ojmVarV = k1o1.v(lzn0Var);
        this.a = sfxVar;
        this.b = ojmVarV;
        this.c = z;
        this.d = new rey0(new e9f1(this, (byte) 12));
        this.e = n3o1.q(this).a(swg1.d, swg1.e);
        this.f = lnn1.h(new mzg1(this, (byte) 0), dw81.P0, new ymg1(this, (byte) 8));
    }

    public final rqw a() {
        return this.e;
    }

    public final rsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
