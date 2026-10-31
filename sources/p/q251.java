package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q251 implements xpw {
    public boolean a;
    public final rey0 b = new rey0(krz0.U0);
    public final ia00 c;
    public final psw d;

    public q251(x151 x151Var) {
        ia00 ia00VarA;
        if (x151Var.equals(w151.a)) {
            ia00VarA = n3o1.q(this).a(vs31.X0, new o251(this, (byte) 0));
        } else if (x151Var.equals(v151.a)) {
            ia00VarA = n3o1.q(this).a(vs31.Y0, new o251(this, (byte) 1));
        } else {
            if (!x151Var.equals(u151.a)) {
                eg.o();
                throw null;
            }
            ia00VarA = n3o1.q(this).a(vs31.Z0, new o251(this, (byte) 2));
        }
        this.c = ia00VarA;
        j2i j2iVar = new j2i(-56790083, new hg31(this, (byte) 9), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
