package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v3o implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ay8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ v3o(ay8 ay8Var, String str, byte b) {
        this.a = b;
        this.b = ay8Var;
        this.c = str;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        String str = this.c;
        ay8 ay8Var = this.b;
        switch (b) {
            case 0:
                ay8Var.collect(new st(vr20Var, str, (byte) 25), lnmVar);
                break;
            case 1:
                ay8Var.collect(new buc0(vr20Var, str, (byte) 9), lnmVar);
                break;
            case 2:
                ay8Var.collect(new buc0(vr20Var, str, (byte) 23), lnmVar);
                break;
            default:
                ay8Var.collect(new buc0(vr20Var, str, (byte) 29), lnmVar);
                break;
        }
        return d9nVar;
    }
}
