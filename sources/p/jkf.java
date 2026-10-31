package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jkf implements xpw {
    public final ia00 X;
    public final psw Y;
    public final lzn0 a;
    public final add b;
    public final ynb0 c;
    public final cce d;
    public final ynb0 e;
    public final haa0 f;
    public final k7d g;
    public final jed0 h;
    public final int i;
    public final poy0 t = d4o1.f(new ikf(this, (byte) 0), nve.X0, new qff(this, (byte) 2), new ikf(this, (byte) 1), 8);

    public jkf(lzn0 lzn0Var, add addVar, ynb0 ynb0Var, cce cceVar, ynb0 ynb0Var2, haa0 haa0Var, k7d k7dVar, jed0 jed0Var, int i) {
        ia00 ia00VarA;
        this.a = lzn0Var;
        this.b = addVar;
        this.c = ynb0Var;
        this.d = cceVar;
        this.e = ynb0Var2;
        this.f = haa0Var;
        this.g = k7dVar;
        this.h = jed0Var;
        this.i = i;
        int iC = l1d.C(i);
        if (iC == 0) {
            ia00VarA = n3o1.q(this).a(r0f.g, r0f.h);
        } else {
            if (iC != 1) {
                eg.o();
                throw null;
            }
            ia00VarA = n3o1.q(this).a(r0f.i, r0f.t);
        }
        this.X = ia00VarA;
        j2i j2iVar = new j2i(434381842, new gtd(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.Y = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.X;
    }

    public final jsw c() {
        return this.Y;
    }

    public final mqw getBehavior() {
        return this.t;
    }
}
