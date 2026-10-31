package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jw2 implements aw2 {
    public final lzn0 a;
    public final gw70 b;
    public final rzo c;
    public final d6g1 d;
    public final mt31 e;
    public final nw2 f = new nw2((byte) 0);
    public final js20 g;
    public final psw h;

    public jw2(lzn0 lzn0Var, gw70 gw70Var, rzo rzoVar, zob1 zob1Var, d6g1 d6g1Var, mt31 mt31Var) {
        this.a = lzn0Var;
        this.b = gw70Var;
        this.c = rzoVar;
        this.d = d6g1Var;
        this.e = mt31Var;
        this.g = x3p1.m(zob1Var, fw2.g, ah1.V0, null, new jm1(this, (byte) 16), 8);
        j2i j2iVar = new j2i(14751359, new r1(this, (byte) 29), true);
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.h;
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
