package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q871 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z3i0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q871(z3i0 z3i0Var, byte b) {
        super(3);
        this.a = b;
        this.b = z3i0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        z3i0 z3i0Var = this.b;
        switch (b) {
            case 0:
                u871 u871Var = (u871) ((idd1) z3i0Var.g).getValue();
                qv61 qv61Var = new qv61((p871) obj, (byte) 6);
                s871 s871VarA = u871Var.c.a();
                String str = u871Var.d;
                th30 th30Var = u871Var.a;
                s871VarA.a2 = new fh61(u871Var, qv61Var, (byte) 12);
                s871VarA.b2 = new uvk0(str);
                s871VarA.g1(th30Var, t871.a);
                return rih1.a;
            default:
                if (!((o871) obj3).equals(o871.a)) {
                    eg.o();
                    return null;
                }
                uvk0 uvk0Var = (uvk0) ((idd1) z3i0Var.h).getValue();
                uvk0Var.getClass();
                x6h1 x6h1VarC = uvk0Var.a.c();
                x6h1VarC.i.add(new a7h1("share_history_banner", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis());
        }
    }
}
