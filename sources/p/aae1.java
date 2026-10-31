package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class aae1 {
    public final a6e1 a;
    public vu30 b;
    public final a6e1 c;
    public final hrr0 d;
    public final hrr0 e;
    public final hrr0 f;
    public final hrr0 g;
    public final j5c h;

    public aae1() {
        a6e1 a6e1Var = new a6e1();
        this.a = a6e1Var;
        this.c = a6e1Var;
        f331 f331Var = f331.X0;
        this.d = new hrr0((Object) null, f331Var);
        this.e = new hrr0((Object) null, f331Var);
        this.f = new hrr0((Object) null, f331Var);
        this.g = v8r.q(new p3v(0.0f));
        this.h = new j5c();
    }

    public final long a(long j) {
        n511 n511VarM;
        elb0 elb0VarE = e();
        n511 n511Var = n511.e;
        if (elb0VarE != null) {
            if (elb0VarE.a()) {
                elb0 elb0VarB = b();
                n511VarM = elb0VarB != null ? elb0VarB.M(elb0VarE, true) : null;
            } else {
                n511VarM = n511Var;
            }
            if (n511VarM != null) {
                n511Var = n511VarM;
            }
        }
        return z4p1.s(j, n511Var);
    }

    public final elb0 b() {
        return (elb0) this.f.getValue();
    }

    public final y9e1 c() {
        return (y9e1) this.c.getValue();
    }

    public final int d(long j, boolean z) {
        y9e1 y9e1VarC = c();
        if (y9e1VarC == null) {
            return -1;
        }
        if (z) {
            j = a(j);
        }
        return y9e1VarC.b.g(z4p1.y(this, j));
    }

    public final elb0 e() {
        return (elb0) this.d.getValue();
    }

    public final boolean f(long j) {
        y9e1 y9e1VarC = c();
        if (y9e1VarC == null) {
            return false;
        }
        long jY = z4p1.y(this, a(j));
        int iE = y9e1VarC.b.e(Float.intBitsToFloat((int) (4294967295L & jY)));
        int i = (int) (jY >> 32);
        return Float.intBitsToFloat(i) >= y9e1VarC.g(iE) && Float.intBitsToFloat(i) <= y9e1VarC.h(iE);
    }
}
