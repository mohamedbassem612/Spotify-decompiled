package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g9i0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bpb1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ g9i0(bpb1 bpb1Var, String str, byte b) {
        this.a = b;
        this.b = bpb1Var;
        this.c = str;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        String str = this.c;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case 0:
                bpb1Var.collect(new buc0(vr20Var, str, (byte) 5), lnmVar);
                break;
            case 1:
                bpb1Var.collect(new buc0(vr20Var, str, (byte) 17), lnmVar);
                break;
            case 2:
                bpb1Var.collect(new buc0(vr20Var, str, (byte) 18), lnmVar);
                break;
            case 3:
                bpb1Var.collect(new buc0(vr20Var, str, (byte) 22), lnmVar);
                break;
            default:
                bpb1Var.collect(new ru11(vr20Var, str, (byte) 8), lnmVar);
                break;
        }
        return d9nVar;
    }
}
