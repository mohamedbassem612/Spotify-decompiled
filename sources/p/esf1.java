package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class esf1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gsf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ esf1(gsf1 gsf1Var, byte b) {
        super(0);
        this.a = b;
        this.b = gsf1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        gsf1 gsf1Var = this.b;
        switch (b) {
            case 0:
                bpb1 bpb1Var = gsf1Var.d;
                Boolean bool = Boolean.TRUE;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, bool);
                return rih1.a;
            default:
                dtq dtqVar = gsf1Var.b;
                bpb1 bpb1Var2 = gsf1Var.d;
                any anyVar = new any(gsf1Var.c, (byte) 18);
                esf1 esf1Var = new esf1(gsf1Var, (byte) 0);
                jmq jmqVar = (jmq) dtqVar.a.b;
                return new kpg0(new ecd1(bpb1Var2, anyVar, esf1Var, ((qop) jmqVar.a).d(), ((lzp) jmqVar.c).a.i3()), bpf1.U0);
        }
    }
}
