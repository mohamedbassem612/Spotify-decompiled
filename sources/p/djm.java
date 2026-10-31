package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class djm implements ya {
    public final /* synthetic */ byte a;
    public final jq4 b;

    public /* synthetic */ djm(jq4 jq4Var, byte b) {
        this.a = b;
        this.b = jq4Var;
    }

    public final boolean accept(Object obj) {
        byte b = this.a;
        jq4 jq4Var = this.b;
        switch (b) {
            case 0:
                return jq4Var.c();
            default:
                return jq4Var.i();
        }
    }
}
