package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hzj1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jzj1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hzj1(jzj1 jzj1Var, byte b) {
        super(3);
        this.a = b;
        this.b = jzj1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        tv80 tv80Var;
        ou80 ou80Var;
        byte b = this.a;
        jzj1 jzj1Var = this.b;
        String str = null;
        switch (b) {
            case 0:
                fzj1 fzj1Var = (fzj1) obj2;
                tqw tqwVar = (tqw) obj3;
                iu30 iu30Var = jzj1Var.g;
                if (fzj1Var instanceof ezj1) {
                    iu30Var.invoke(((ezj1) fzj1Var).a);
                } else {
                    if (!(fzj1Var instanceof dzj1)) {
                        eg.o();
                        return null;
                    }
                    if (tqwVar != null && (tv80Var = (tv80) tqwVar.a(rc11.a.b(tv80.class))) != null && (ou80Var = tv80Var.a) != null) {
                        str = ou80Var.a;
                    }
                    if (str == null) {
                        str = "";
                    }
                    iu30Var.invoke(new kyj1(str));
                }
                return rih1.a;
            default:
                gzj1 gzj1Var = (gzj1) obj;
                fzj1 fzj1Var2 = (fzj1) obj3;
                if (!(fzj1Var2 instanceof dzj1)) {
                    if (fzj1Var2 instanceof ezj1) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                if (l1d.c(gzj1Var.a.d, 4) >= 0) {
                    return null;
                }
                txk0 txk0Var = jzj1Var.f.a;
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), txk0Var.b, r6h1.c, System.currentTimeMillis());
        }
    }
}
