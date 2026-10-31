package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ufd implements xpw {
    public final /* synthetic */ byte a = 0;
    public final urk0 b;
    public final iu30 c;

    public ufd(iu30 iu30Var, urk0 urk0Var) {
        this.c = iu30Var;
        this.b = urk0Var;
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return n3o1.q(this).a(new hp9(this, (byte) 22), s1b.X0);
            default:
                return n3o1.q(this).a(new z821(this, (byte) 15), v451.c);
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                j2i j2iVar = pai.a;
                ien0 ien0Var = qsw.a;
                return new psw(j2iVar, (byte) 0);
            default:
                j2i j2iVar2 = afj.a;
                ien0 ien0Var2 = qsw.a;
                return new psw(j2iVar2, (byte) 0);
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                return new rey0(new gaa(this, (byte) 22));
            default:
                return new rey0(new u451(this, (byte) 2));
        }
    }

    public ufd(urk0 urk0Var, iu30 iu30Var) {
        this.b = urk0Var;
        this.c = iu30Var;
    }
}
