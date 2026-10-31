package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xns implements mr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bpb1 b;
    public final /* synthetic */ Set c;

    public /* synthetic */ xns(bpb1 bpb1Var, Set set, byte b) {
        this.a = b;
        this.b = bpb1Var;
        this.c = set;
    }

    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        Set set = this.c;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case 0:
                bpb1Var.collect(new nw9(vr20Var, set, (byte) 6), lnmVar);
                break;
            default:
                bpb1Var.collect(new nw9(vr20Var, set, (byte) 7), lnmVar);
                break;
        }
        return d9nVar;
    }
}
