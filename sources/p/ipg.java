package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ipg implements yum1 {
    public final /* synthetic */ byte a = 0;
    public final lik1 b;
    public final boolean c;
    public final yhm d;

    public ipg(lik1 lik1Var, wqg wqgVar, boolean z, yhm yhmVar) {
        this.b = lik1Var;
        this.c = z;
        this.d = yhmVar;
    }

    @Override // p.yum1
    public final boolean a(String str) {
        switch (this.a) {
            case 0:
                return str.equals("spotify:playlist:37i9dQZF1CIl0ks0ynmzpD");
            default:
                return str.equals("spotify:local-files") || str.equals("spotify:playlist:37i9dQZEVXhds8kU6ckEgw");
        }
    }

    @Override // p.yum1
    public final void b(ssi0 ssi0Var) {
        byte b = this.a;
        lik1 lik1Var = this.b;
        yhm yhmVar = this.d;
        boolean z = this.c;
        switch (b) {
            case 0:
                if (z) {
                    yhmVar.a(new kpg(lik1Var), ssi0Var.e);
                    break;
                }
                break;
            default:
                if (z) {
                    yhmVar.a(new wde0(ssi0Var.b, lik1Var), ssi0Var.e);
                    break;
                }
                break;
        }
    }

    public ipg(lik1 lik1Var, boolean z, yhm yhmVar) {
        this.b = lik1Var;
        this.c = z;
        this.d = yhmVar;
    }
}
