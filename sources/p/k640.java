package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k640 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ay8 b;
    public final /* synthetic */ u740 c;

    public /* synthetic */ k640(ay8 ay8Var, u740 u740Var, byte b) {
        this.a = b;
        this.b = ay8Var;
        this.c = u740Var;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        u740 u740Var = this.c;
        ay8 ay8Var = this.b;
        switch (b) {
            case 0:
                ay8Var.collect(new j640(vr20Var, u740Var, (byte) 0), lnmVar);
                break;
            default:
                ay8Var.collect(new j640(vr20Var, u740Var, (byte) 1), lnmVar);
                break;
        }
        return d9nVar;
    }
}
