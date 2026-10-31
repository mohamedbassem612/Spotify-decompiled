package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gda1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pda1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gda1(pda1 pda1Var, byte b) {
        super(0);
        this.a = b;
        this.b = pda1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        pda1 pda1Var = this.b;
        switch (b) {
            case 0:
                return pda1Var.s.d().d.toString();
            case 1:
                return pda1Var.d();
            case 2:
                pda1Var.f(new yrn0((ou80) null));
                c4p1.q(pda1Var.s);
                yt91 yt91Var = pda1Var.n;
                ((hrr0) yt91Var.d).setValue(Boolean.FALSE);
                err0 err0Var = (err0) yt91Var.c;
                err0Var.t(err0Var.s() + 1);
                return rih1.a;
            default:
                Boolean bool = (Boolean) ((hrr0) pda1Var.n.d).getValue();
                bool.booleanValue();
                return new yvg1(bool, pda1Var.d(), pda1Var.e());
        }
    }
}
