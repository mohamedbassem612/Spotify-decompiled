package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ma3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qa3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma3(qa3 qa3Var, byte b) {
        super(1);
        this.a = b;
        this.b = qa3Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qa3 qa3Var = this.b;
        switch (b) {
            case 0:
                return new rxc0(qa3Var.b);
            default:
                kby kbyVar = ((cxc0) obj).f;
                c8c0 c8c0Var = qa3Var.d;
                boolean z = zro1.u(c8c0Var) && (zro1.v(c8c0Var) || c8c0Var == c8c0.e);
                gh3 gh3VarA = kbyVar.x.a(gh3.class);
                gpe0 gpe0Var = null;
                if (z && gh3VarA != null) {
                    boolean z2 = gh3VarA.h;
                    bql bqlVarA = kbyVar.x.a(bql.class);
                    lql lqlVar = bqlVarA != null ? bqlVarA.a : null;
                    kql kqlVar = kql.a;
                    if (z2 || u890.j(lqlVar, kqlVar) || u890.j(lqlVar, hql.a)) {
                        gpe0Var = u890.j(lqlVar, kqlVar) ? gpe0.a : fpe0.a;
                    }
                }
                qa3Var.g.set(gpe0Var);
                return new qet0(kbyVar.a, false, gpe0Var != null, (pet0) null, 26);
        }
    }
}
