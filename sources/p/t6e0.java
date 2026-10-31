package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t6e0 implements o6r0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t6e0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final n6r0 e() {
        n6r0 n6r0Var;
        n6r0 n6r0Var2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bbr0 bbr0Var = ((v6e0) obj).f;
                bn70 bn70VarA = bbr0Var.b0(bn70.class).a();
                if (bn70VarA != null && (n6r0Var = bn70VarA.a) != null) {
                    return n6r0Var;
                }
                zh10 zh10VarA = bbr0Var.b0(zh10.class).a();
                if (zh10VarA != null) {
                    return zh10VarA.a;
                }
                eg.m("Your page must declare a Identifier or FallbackIdentifier");
                return null;
            default:
                bbr0 bbr0Var2 = (bbr0) obj;
                bn70 bn70VarA2 = bbr0Var2.b0(bn70.class).a();
                if (bn70VarA2 != null && (n6r0Var2 = bn70VarA2.a) != null) {
                    return n6r0Var2;
                }
                zh10 zh10VarA2 = bbr0Var2.b0(zh10.class).a();
                if (zh10VarA2 != null) {
                    return zh10VarA2.a;
                }
                eg.m("Your page must declare a Identifier or FallbackIdentifier");
                return null;
        }
    }
}
