package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ycd0 implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dt71 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ycd0(dt71 dt71Var, String str, byte b) {
        this.a = b;
        this.b = dt71Var;
        this.c = str;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        String str = this.c;
        dt71 dt71Var = this.b;
        switch (b) {
            case 0:
                dt71Var.collect(new buc0(vr20Var, str, (byte) 1), lnmVar);
                break;
            default:
                dt71Var.collect(new ru11(vr20Var, str, (byte) 23), lnmVar);
                break;
        }
        return d9nVar;
    }
}
