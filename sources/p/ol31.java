package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ol31 implements xpw {
    public final va31 a;
    public final kj31 b;
    public final boolean c;
    public final ict0 d;
    public final js20 e;
    public final ia00 f = n3o1.q(this).a(ve21.d1, ve21.e1);
    public final psw g;

    public ol31(q8n q8nVar, va31 va31Var, kj31 kj31Var, boolean z, ict0 ict0Var) {
        this.a = va31Var;
        this.b = kj31Var;
        this.c = z;
        this.d = ict0Var;
        this.e = a4p1.h(new nl31(this, (byte) 0), new nl31(this, (byte) 1), new ps11(this, (byte) 24), q8nVar, new nl31(this, (byte) 2));
        j2i j2iVar = new j2i(-1168587287, new hg31(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
