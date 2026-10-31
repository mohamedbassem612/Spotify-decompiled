package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kp50 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kp50(cb0 cb0Var, byte b) {
        super(4);
        this.a = b;
        this.b = cb0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        cb0 cb0Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                fyk0 fyk0Var = (fyk0) ((cur) cb0Var.b.get()).a.get();
                fyk0Var.getClass();
                return new byk0(new jpk0(fyk0Var));
            default:
                cur curVar = (cur) cb0Var.b.get();
                boolean z = ((jp50) obj2).a;
                fyk0 fyk0Var2 = (fyk0) curVar.a.get();
                fyk0Var2.getClass();
                x6h1 x6h1VarC = fyk0Var2.a.c();
                x6h1VarC.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("groupable_devices_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                return z ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis());
        }
    }
}
