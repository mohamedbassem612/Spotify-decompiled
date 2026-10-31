package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gea implements o3e1 {
    public final j2i a;
    public final pfn0 b = new pfn0();
    public final hrr0 c = v8r.q((Object) null);

    public gea(j2i j2iVar) {
        this.a = j2iVar;
    }

    @Override // p.o3e1
    public final Object a(g3e1 g3e1Var, a8d1 a8d1Var) {
        Object objA = this.b.a(hfn0.a, new i24(this, new fea(g3e1Var), null, (byte) 9), a8d1Var);
        return objA == d9n.a ? objA : rih1.a;
    }

    public final void b(final Function0 function0, b0k b0kVar, final int i) {
        final Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(723898654);
        int i2 = (x340Var.g(this) ? 32 : 16) | i;
        final byte b = 0;
        final byte b2 = 1;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            fea feaVar = (fea) this.c.getValue();
            if (feaVar == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new vu30(this, function0, i, b) { // from class: p.eea
                        public final /* synthetic */ byte a;
                        public final /* synthetic */ gea b;
                        public final /* synthetic */ Function0 c;

                        {
                            this.a = b;
                            this.b = this;
                        }

                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = this.a;
                            rih1 rih1Var = rih1.a;
                            Function0 function2 = this.c;
                            gea geaVar = this.b;
                            b0k b0kVar2 = (b0k) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    geaVar.b(function2, b0kVar2, czo1.p(7));
                                    break;
                                default:
                                    geaVar.b(function2, b0kVar2, czo1.p(7));
                                    break;
                            }
                            return rih1Var;
                        }
                    };
                    return;
                }
                return;
            }
            function1 = function0;
            this.a.c1(feaVar, feaVar.a, function1, x340Var, 384);
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new vu30(this, function1, i, b2) { // from class: p.eea
                public final /* synthetic */ byte a;
                public final /* synthetic */ gea b;
                public final /* synthetic */ Function0 c;

                {
                    this.a = b2;
                    this.b = this;
                }

                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = this.a;
                    rih1 rih1Var = rih1.a;
                    Function0 function2 = this.c;
                    gea geaVar = this.b;
                    b0k b0kVar2 = (b0k) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            geaVar.b(function2, b0kVar2, czo1.p(7));
                            break;
                        default:
                            geaVar.b(function2, b0kVar2, czo1.p(7));
                            break;
                    }
                    return rih1Var;
                }
            };
        }
    }
}
