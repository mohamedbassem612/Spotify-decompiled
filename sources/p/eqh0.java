package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class eqh0 implements ezh0, e2i0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ iph0 c;

    public /* synthetic */ eqh0(String str, iph0 iph0Var, byte b) {
        this.a = b;
        this.b = str;
        this.c = iph0Var;
    }

    public void h(hxh0 hxh0Var, int i) {
        hxh0Var.n(i, this.b, this.c);
    }

    public Object i(fzh0 fzh0Var, ixh0 ixh0Var, int i) {
        byte b = this.a;
        iph0 iph0Var = this.c;
        String str = this.b;
        iqh0 iqh0Var = (iqh0) fzh0Var;
        switch (b) {
            case 1:
                return iqh0Var.K(ixh0Var, str, iph0Var);
            default:
                return iqh0Var.J(ixh0Var, str, iph0Var);
        }
    }
}
