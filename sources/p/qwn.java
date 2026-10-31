package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qwn implements gqw {
    public final /* synthetic */ vp11 a;
    public final /* synthetic */ jto b;
    public final /* synthetic */ w3l0 c;

    public qwn(vp11 vp11Var, jto jtoVar, w3l0 w3l0Var) {
        this.a = vp11Var;
        this.b = jtoVar;
        this.c = w3l0Var;
    }

    @Override // p.gqw
    public final wpw a(iqw iqwVar, iqw iqwVar2, jqw jqwVar) {
        twa twaVar = new twa();
        vp11 vp11Var = this.a;
        p04 p04Var = vp11Var.i;
        v72 v72Var = p04Var != null ? p04Var.a : null;
        vhd vhdVar = vp11Var.f;
        teb tebVar = new teb(twaVar, v72Var, vhdVar.b, vhdVar.c, 16);
        jto jtoVar = this.b;
        return new jpg0(new jb3(tebVar, jtoVar, iqwVar, iqwVar2, jqwVar, new sw9(jtoVar.a.size(), this.c)), eln.e1);
    }
}
