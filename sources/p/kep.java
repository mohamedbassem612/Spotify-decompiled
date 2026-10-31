package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kep implements ubv0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ kep(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    @Override // p.ubv0
    public final tzr0 a(yeu0 yeu0Var, lik1 lik1Var) {
        byte b = this.a;
        gbp gbpVar = this.b;
        switch (b) {
            case 0:
                f9p f9pVar = (f9p) ((lbp) gbpVar).c;
                e7z e7zVar = (e7z) f9pVar.X;
                dg30 dg30Var = (dg30) e7zVar.n.get();
                c8o.l(dg30Var);
                i4q i4qVar = (i4q) e7zVar.s.get();
                c8o.l(i4qVar);
                jl21 jl21Var = (jl21) e7zVar.o.get();
                c8o.l(jl21Var);
                st60 st60Var = new st60(dg30Var, i4qVar, new jl00(jl21Var, (byte) 20), (byte) 21);
                zwz0 zwz0Var = (zwz0) ((e7z) f9pVar.X).m0.get();
                c8o.l(zwz0Var);
                return new tzr0(yeu0Var, lik1Var, st60Var, new sks0(zwz0Var, (byte) 10), (byte) 13);
            default:
                nwp nwpVar = (nwp) gbpVar.c;
                dg30 dg30Var2 = (dg30) nwpVar.e.get();
                em0 em0Var = nwpVar.a;
                i4q i4qVarI = em0Var.I();
                c8o.l(i4qVarI);
                jl21 jl21Var2 = (jl21) ((teq) em0Var.c).l2.get();
                c8o.l(jl21Var2);
                st60 st60Var2 = new st60(dg30Var2, i4qVarI, new jl00(jl21Var2, (byte) 20), (byte) 21);
                zwz0 zwz0Var2 = (zwz0) ((daq) nwpVar.a.b).U1.get();
                c8o.l(zwz0Var2);
                return new tzr0(yeu0Var, lik1Var, st60Var2, new sks0(zwz0Var2, (byte) 10), (byte) 13);
        }
    }
}
