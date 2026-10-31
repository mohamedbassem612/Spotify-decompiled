package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h4f1 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bpb1 b;

    public /* synthetic */ h4f1(bpb1 bpb1Var, byte b) {
        this.a = b;
        this.b = bpb1Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case 0:
                bpb1Var.collect(new qmd1(vr20Var, (byte) 15), lnmVar);
                break;
            case 1:
                bpb1Var.collect(new qmd1(vr20Var, (byte) 23), lnmVar);
                break;
            case 2:
                bpb1Var.collect(new yhg1(vr20Var, (byte) 5), lnmVar);
                break;
            case 3:
                bpb1Var.collect(new lpl1(vr20Var, (byte) 5), lnmVar);
                break;
            default:
                bpb1Var.collect(new lpl1(vr20Var, (byte) 18), lnmVar);
                break;
        }
        return d9nVar;
    }
}
