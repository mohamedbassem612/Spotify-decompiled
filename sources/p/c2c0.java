package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c2c0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ur00 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2c0(ur00 ur00Var, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = ur00Var;
        this.c = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        boolean z = this.c;
        ur00 ur00Var = this.b;
        switch (b) {
            case 0:
                return new c2c0(ur00Var, z, lnmVar, (byte) 0);
            default:
                return new c2c0(ur00Var, z, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        boolean z = this.c;
        ur00 ur00Var = this.b;
        String str = "checked";
        switch (b) {
            case 0:
                hm5.M(obj);
                k2c0 k2c0Var = (k2c0) ur00Var.e;
                k2c0Var.getClass();
                char c = z ? (char) 2 : (char) 1;
                char c2 = z ? (char) 1 : (char) 2;
                i8h1 i8h1VarA = k2c0Var.a();
                x6h1 x6h1VarC = k2c0Var.b.b.c();
                x6h1VarC.i.add(new a7h1("legal_confirm_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (c == 1) {
                    obj2 = "checked";
                } else {
                    if (c != 2) {
                        throw null;
                    }
                    obj2 = "unchecked";
                }
                mmr0 mmr0Var = new mmr0("state_before_toggle", obj2);
                if (c2 != 1) {
                    if (c2 != 2) {
                        throw null;
                    }
                    str = "unchecked";
                }
                i8h1VarA.m(new w7h1("", "", z7h1Var, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var, new mmr0("state_after_toggle", str)})), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            default:
                hm5.M(obj);
                k2c0 k2c0Var2 = (k2c0) ur00Var.e;
                k2c0Var2.getClass();
                char c3 = z ? (char) 2 : (char) 1;
                char c4 = z ? (char) 1 : (char) 2;
                i8h1 i8h1VarA2 = k2c0Var2.a();
                x6h1 x6h1VarC2 = k2c0Var2.b.b.c();
                x6h1VarC2.i.add(new a7h1("agree_to_privacy_policy_for_plan_managers_toggle", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
                if (c3 == 1) {
                    obj3 = "checked";
                } else {
                    if (c3 != 2) {
                        throw null;
                    }
                    obj3 = "unchecked";
                }
                mmr0 mmr0Var2 = new mmr0("state_before_toggle", obj3);
                if (c4 != 1) {
                    if (c4 != 2) {
                        throw null;
                    }
                    str = "unchecked";
                }
                i8h1VarA2.m(new w7h1("", "", z7h1Var2, new x7h1("toggle_state", 1, sqg0.J(new mmr0[]{mmr0Var2, new mmr0("state_after_toggle", str)})), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
        }
    }
}
