package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fp50 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ldo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fp50(ldo ldoVar, byte b) {
        super(4);
        this.a = b;
        this.b = ldoVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        ldo ldoVar = this.b;
        switch (b) {
            case 0:
                ep50 ep50Var = (ep50) obj;
                ((Number) obj3).intValue();
                cur curVar = (cur) ((ynb0) ldoVar.d).get();
                int i = ep50Var.b;
                String str = ((cp50) ep50Var.a.j).a;
                fyk0 fyk0Var = (fyk0) curVar.a.get();
                fyk0Var.getClass();
                return new byk0(new jpk0(fyk0Var), Integer.valueOf(i), str, (byte) 2);
            default:
                ep50 ep50Var2 = (ep50) obj2;
                cur curVar2 = (cur) ((ynb0) ldoVar.d).get();
                int i2 = ep50Var2.b;
                String str2 = ((cp50) ep50Var2.a.j).a;
                fyk0 fyk0Var2 = (fyk0) curVar2.a.get();
                fyk0Var2.getClass();
                x6h1 x6h1VarC = fyk0Var2.a.c();
                x6h1VarC.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                Integer numValueOf = Integer.valueOf(i2);
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("groupable_device", (String) null, numValueOf, str2, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis());
        }
    }
}
