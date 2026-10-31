package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gxj0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ixj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gxj0(ixj0 ixj0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ixj0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ixj0 ixj0Var = this.b;
        switch (b) {
            case 0:
                return new rxc0(ixj0Var.a);
            default:
                me30 me30Var = ixj0Var.e;
                kby kbyVar = ((cxc0) obj).f;
                le30 le30VarA = me30Var.a(kbyVar.p);
                Map map = kbyVar.q;
                if (map.isEmpty()) {
                    map = null;
                }
                return new nwj0(map != null ? Boolean.valueOf(z6k0.b(map)) : null, ixj0Var.b.S && (le30VarA == le30.b1 || le30VarA == le30.c1));
        }
    }
}
