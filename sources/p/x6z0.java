package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x6z0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bs0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x6z0(bs0 bs0Var, byte b) {
        super(1);
        this.a = b;
        this.b = bs0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bs0 bs0Var = this.b;
        switch (b) {
            case 0:
                return new w6z0(((waz0) bs0Var.b).a().a, new se10(14, z6x.a, (List) null), true);
            case 1:
                ((qtr) obj).b(new y6z0(bs0Var, (lnm) null));
                return rih1.a;
            default:
                return (qzh) bs0Var.e;
        }
    }
}
