package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fl20 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pbq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fl20(pbq pbqVar, byte b) {
        super(0);
        this.a = b;
        this.b = pbqVar;
    }

    public final Object invoke() {
        byte b = this.a;
        pbq pbqVar = this.b;
        switch (b) {
            case 0:
                mhp mhpVar = (mhp) pbqVar.X;
                lik1 lik1Var = (lik1) pbqVar.f;
                spn spnVar = (spn) ((gl20) ((ip31) mhpVar.a.c).b).m.get();
                c8o.l(spnVar);
                return new rqr(spnVar, lik1Var);
            default:
                ((lhp) ((yjq) pbqVar.t).d).getClass();
                return new lzr();
        }
    }
}
