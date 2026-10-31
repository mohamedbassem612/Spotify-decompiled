package p;

import android.widget.EditText;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uee extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h72 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uee(h72 h72Var, byte b) {
        super(2);
        this.a = b;
        this.b = h72Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        h72 h72Var = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj2).intValue();
                oee oeeVar = (oee) h72Var.h;
                oeeVar.g.c(oee.h[0], oeeVar, o7h.J0(oeeVar.a(), (String) obj));
                xid xidVar = oeeVar.c;
                x6h1 x6h1VarC = ((yok0) xidVar.c).b.c();
                x6h1VarC.i.add(new a7h1("selected_pronouns_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                Integer numValueOf = Integer.valueOf(iIntValue);
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("remove_user_pronoun_chip_button", (String) null, numValueOf, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                ((i8h1) xidVar.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_deselect", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                String str = (String) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                kdy0 kdy0Var = (kdy0) h72Var.d;
                ldy0 ldy0Var = new ldy0(iIntValue2);
                Object objB = ((i7h1) kdy0Var.e).b(ldy0Var, ldy0Var, idy0.a, (op80) null);
                w7h1 w7h1Var = objB instanceof w7h1 ? (w7h1) objB : null;
                if (w7h1Var != null) {
                    ((i8h1) kdy0Var.c).m(w7h1Var, (xj61) null);
                }
                oee oeeVar2 = (oee) h72Var.h;
                oeeVar2.g.c(oee.h[0], oeeVar2, o7h.O0(str, oeeVar2.a()));
                ((EditText) ((idd1) h72Var.i).getValue()).setText("");
                break;
        }
        return rih1Var;
    }
}
