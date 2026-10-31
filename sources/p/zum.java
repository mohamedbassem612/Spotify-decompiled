package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zum extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bvm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zum(bvm bvmVar, byte b) {
        super(1);
        this.a = b;
        this.b = bvmVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bvm bvmVar = this.b;
        switch (b) {
            case 0:
                vhc1 vhc1Var = (vhc1) obj;
                return new mqm(new jvm(bvmVar.b, vhc1Var.getUri(), vhc1Var.a()), new lqm(Collections.singletonList(ovm.a), (smc0) bvmVar.d, (qle1) null, 4));
            case 1:
                return bvmVar.b;
            default:
                String str = bvmVar.b;
                l7e0 l7e0Var = ((hwq) obj).g;
                return new bio0(str, l7e0Var.getUri(), l7e0Var.a());
        }
    }
}
