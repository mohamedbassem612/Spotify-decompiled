package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class maj0 implements xpw {
    public final int a;
    public final iu30 b;
    public final kly0 c;
    public final rey0 d = new rey0(new otf0(this, (byte) 27));
    public final psw e;
    public final rqw f;

    public maj0(int i, iu30 iu30Var, caq caqVar) {
        this.a = i;
        this.b = iu30Var;
        this.c = caqVar;
        j2i j2iVar = new j2i(-832048358, new y3i0(this, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
        this.f = i == 2 ? new eih1() : n3o1.q(this).a(new pah0(this, (byte) 8), fri0.X0);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
