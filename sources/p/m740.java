package p;

import java.util.Optional;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m740 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o740 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m740(o740 o740Var, byte b) {
        super(2);
        this.a = b;
        this.b = o740Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        o740 o740Var = this.b;
        switch (b) {
            case 0:
                sp00 sp00Var = o740Var.b;
                return new jpg0(new jb3((hjc) sp00Var.b, (y5v0) sp00Var.c, (mcn1) sp00Var.d, (ij81) sp00Var.e, new epb1((zob1) obj)), r640.c);
            default:
                rzo0 rzo0Var = o740Var.c;
                return new jpg0(new ug3((a1r0) rzo0Var.b, (gw70) rzo0Var.c, (Optional) rzo0Var.d, new epb1((zob1) obj)), r640.e);
        }
    }
}
