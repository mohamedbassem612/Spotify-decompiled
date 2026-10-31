package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s6e0 implements jik1 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s6e0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final lik1 getViewUri() {
        lik1 lik1Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bbr0 bbr0Var = ((v6e0) obj).f;
                bn70 bn70VarA = bbr0Var.b0(bn70.class).a();
                if (bn70VarA != null && (lik1Var = bn70VarA.b) != null) {
                    return lik1Var;
                }
                zh10 zh10VarA = bbr0Var.b0(zh10.class).a();
                if (zh10VarA != null) {
                    return zh10VarA.b;
                }
                eg.m("Your page must declare a Identifier or FallbackIdentifier");
                return null;
            default:
                return ((fqu0) obj).b;
        }
    }
}
