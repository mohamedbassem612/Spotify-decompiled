package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class xmd1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r2a1 b;
    public final /* synthetic */ ji50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xmd1(r2a1 r2a1Var, ji50 ji50Var, byte b) {
        super(2);
        this.a = b;
        this.b = r2a1Var;
        this.c = ji50Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        ji50 ji50Var = this.c;
        r2a1 r2a1Var = this.b;
        switch (b) {
            case 0:
                s0k s0kVar = (s0k) r2a1Var.b;
                return new kpg0(wgi0.a((wgi0) s0kVar.e.get(), ji50Var.a, s0kVar.g, s0k.f13p, (p731) null, s0kVar.n, new wei0(false, false, 12), (cgi0) null, (Function0) null, (hs00) null, (mgi0) null, (ngi0) null, (yih0) null, s0kVar.f, (bpb1) null, (k2g0) null, 28608), new r0k(s0kVar, (byte) 1));
            default:
                s0k s0kVar2 = (s0k) r2a1Var.b;
                return new kpg0(wgi0.a((wgi0) s0kVar2.e.get(), ji50Var.a, s0kVar2.g, s0k.f13p, (p731) null, s0kVar2.n, new wei0(false, false, 12), (cgi0) null, (Function0) null, (hs00) null, (mgi0) null, (ngi0) null, (yih0) null, s0kVar2.f, (bpb1) null, (k2g0) null, 28608), new r0k(s0kVar2, (byte) 4));
        }
    }
}
