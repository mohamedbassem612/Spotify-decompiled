package p;

import com.spotify.nowplayingmodes.adsmode.data.AdsModeModel;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d62 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u961 b;
    public final /* synthetic */ ip80 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d62(u961 u961Var, ip80 ip80Var, byte b) {
        super(1);
        this.a = b;
        this.b = u961Var;
        this.c = ip80Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ip80 ip80Var = this.c;
        u961 u961Var = this.b;
        switch (b) {
            case 0:
                g5l0 g5l0Var = new g5l0(((n6r0) u961Var.c).path(), ((lik1) u961Var.d).a, ((o2p0) u961Var.b).a, (byte) 28);
                String str = ip80Var.d;
                String str2 = ip80Var.c;
                AdsModeModel.Format format = ip80Var.a;
                AdsModeModel.Product product = ip80Var.b;
                return new fhl0(new sqk0(g5l0Var, str2, format.a(product), str), str2, format.a(product), str);
            default:
                g5l0 g5l0Var2 = new g5l0(((n6r0) u961Var.c).path(), ((lik1) u961Var.d).a, ((o2p0) u961Var.b).a, (byte) 28);
                String str3 = ip80Var.d;
                String str4 = ip80Var.c;
                AdsModeModel.Format format2 = ip80Var.a;
                AdsModeModel.Product product2 = ip80Var.b;
                return new ghl0(new sqk0(g5l0Var2, str4, format2.a(product2), str3), str4, format2.a(product2), str3);
        }
    }
}
