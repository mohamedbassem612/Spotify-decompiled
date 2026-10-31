package p;

import android.os.Bundle;
import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h5g extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChoiceScreenUcActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h5g(ChoiceScreenUcActivity choiceScreenUcActivity, byte b) {
        super(0);
        this.a = b;
        this.b = choiceScreenUcActivity;
    }

    public final Object invoke() {
        byte b = this.a;
        g0i g0iVar = this.b;
        switch (b) {
            case 0:
                Bundle extras = g0iVar.getIntent().getExtras();
                v5g v5gVar = extras != null ? (v5g) jhc1.t(extras, "EXTRA_CHOICE_SCREEN_UC_ARGS", v5g.class) : null;
                if (v5gVar != null) {
                    return v5gVar;
                }
                hhg1.n("Required value was null.");
                return null;
            case 1:
                gw70 gw70Var = g0iVar.b1;
                if (gw70Var != null) {
                    return new xb30(gw70Var);
                }
                u890.C("imageLoader");
                throw null;
            case 2:
                dsk0 dsk0Var = g0iVar.l1;
                if (dsk0Var != null) {
                    return dsk0Var.e();
                }
                u890.C("ubiEventFactory");
                throw null;
            case 3:
                dsk0 dsk0Var2 = g0iVar.l1;
                if (dsk0Var2 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC = dsk0Var2.b.c();
                x6h1VarC.i.add(new a7h1("loader", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 4:
                dsk0 dsk0Var3 = g0iVar.l1;
                if (dsk0Var3 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC2 = dsk0Var3.b.c();
                x6h1VarC2.i.add(new a7h1("top_warnings", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
            case 5:
                dsk0 dsk0Var4 = g0iVar.l1;
                if (dsk0Var4 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC3 = dsk0Var4.b.c();
                x6h1VarC3.i.add(new a7h1("item_unavailable", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA3 = x6h1VarC3.a();
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1VarA3;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var3.a();
            case 6:
                dsk0 dsk0Var5 = g0iVar.l1;
                if (dsk0Var5 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC4 = dsk0Var5.b.c();
                x6h1VarC4.i.add(new a7h1("error_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                y6h1 y6h1VarA4 = x6h1VarC4.a();
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1VarA4;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var4.a();
            case 7:
                return g0iVar.o();
            case 8:
                return g0iVar.O();
            default:
                n9g n9gVar = g0iVar.f1;
                if (n9gVar != null) {
                    return n9gVar;
                }
                u890.C("vmFactory");
                throw null;
        }
    }
}
