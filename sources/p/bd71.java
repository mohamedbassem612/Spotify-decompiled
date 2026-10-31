package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bd71 implements xpw {
    public final a1g a;
    public final dwr0 b;
    public final z710 c;
    public final i8h1 d;
    public final vu30 e;
    public final h4l0 f;
    public tv80 g;
    public final rey0 h;
    public final u7h1 i;
    public final psw t;

    public bd71(a1g a1gVar, dwr0 dwr0Var, z710 z710Var, i8h1 i8h1Var, vu30 vu30Var) {
        this.a = a1gVar;
        this.b = dwr0Var;
        this.c = z710Var;
        this.d = i8h1Var;
        this.e = vu30Var;
        r6h1 r6h1Var = r6h1.c;
        this.f = new h4l0((byte) 4);
        this.h = new rey0(new ad71(this, (byte) 0));
        this.i = eth.a0((vu30) null, new ad71(this, (byte) 1), 1);
        j2i j2iVar = new j2i(-1327270212, new c771(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
