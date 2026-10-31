package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dfc0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ifc0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dfc0(ifc0 ifc0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ifc0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ifc0 ifc0Var = this.b;
        switch (b) {
            case 0:
                ifc0Var.c.a(urb.a);
                return rih1.a;
            default:
                mop mopVar = ifc0Var.a;
                xe01 xe01Var = ifc0Var.g;
                bpb1 bpb1Var = ifc0Var.d;
                dfc0 dfc0Var = new dfc0(ifc0Var, (byte) 0);
                mopVar.getClass();
                return new kpg0(new et90(xe01Var, dfc0Var, bpb1Var), xdc0.h);
        }
    }
}
