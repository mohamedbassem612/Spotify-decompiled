package p;

import android.view.View;
import com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l5g implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChoiceScreenUcActivity b;

    public /* synthetic */ l5g(ChoiceScreenUcActivity choiceScreenUcActivity, byte b) {
        this.a = b;
        this.b = choiceScreenUcActivity;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.app.Activity, com.spotify.gpb.choicescreenuc.ChoiceScreenUcActivity] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h9g h9gVar;
        sce sceVar;
        h9g h9gVar2;
        y8g y8gVar;
        h9g h9gVar3;
        lra lraVarB;
        nra nraVar;
        tco tcoVar;
        h9g h9gVar4;
        lra lraVarB2;
        tly0 tly0Var;
        byte b = this.a;
        h7g h7gVar = h7g.a;
        b7x b7xVar = b7x.a;
        ?? r0 = this.b;
        switch (b) {
            case 0:
                r0.finish();
                return;
            case 1:
                uba ubaVarL0 = r0.l0();
                dsk0 dsk0Var = r0.l1;
                if (dsk0Var == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC = dsk0Var.b.c();
                x6h1VarC.i.add(new a7h1("ucb_content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("change_country_cta", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA = x6h1VarC2.a();
                i9g i9gVar = r0.w1;
                String str = (i9gVar == null || (h9gVar = i9gVar.c) == null || (sceVar = h9gVar.f) == null) ? null : sceVar.a;
                ubaVarL0.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                r0.m0().U(v6g.a);
                return;
            case 2:
                uba ubaVarL1 = r0.l0();
                dsk0 dsk0Var2 = r0.l1;
                if (dsk0Var2 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC3 = dsk0Var2.b.c();
                x6h1VarC3.i.add(new a7h1("ucb_content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("change_product_btn", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                y6h1 y6h1VarA2 = x6h1VarC4.a();
                i9g i9gVar2 = r0.w1;
                String str2 = (i9gVar2 == null || (h9gVar2 = i9gVar2.c) == null || (y8gVar = h9gVar2.g) == null) ? null : y8gVar.b;
                ubaVarL1.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                r0.m0().U(w6g.a);
                return;
            case 3:
                uba ubaVarL2 = r0.l0();
                dsk0 dsk0Var3 = r0.l1;
                if (dsk0Var3 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC5 = dsk0Var3.b.c();
                x6h1VarC5.i.add(new a7h1("ucb_content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("billing_unavailable_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = true;
                x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                x6h1VarC7.i.add(new a7h1("billing_unavailable_btn", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                y6h1 y6h1VarA3 = x6h1VarC7.a();
                i9g i9gVar3 = r0.w1;
                String str3 = (i9gVar3 == null || (h9gVar3 = i9gVar3.c) == null || (lraVarB = h9gVar3.b()) == null || (nraVar = lraVarB.a) == null || (tcoVar = nraVar.b) == null) ? null : tcoVar.b;
                ubaVarL2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3 != null ? str3 : "")), y6h1VarA3, r6h1.c, System.currentTimeMillis()), (xj61) null);
                r0.m0().U(p7g.a);
                return;
            case 4:
                uba ubaVarL3 = r0.l0();
                dsk0 dsk0Var4 = r0.l1;
                if (dsk0Var4 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC8 = dsk0Var4.b.c();
                x6h1VarC8.i.add(new a7h1("ucb_content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = true;
                x6h1 x6h1VarC9 = x6h1VarC8.a().c();
                x6h1VarC9.i.add(new a7h1("spotify_btn", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = false;
                ubaVarL3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC9.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                r0.m0().U(new y6g(1));
                return;
            case 5:
                uba ubaVarL4 = r0.l0();
                dsk0 dsk0Var5 = r0.l1;
                if (dsk0Var5 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC10 = dsk0Var5.b.c();
                x6h1VarC10.i.add(new a7h1("ucb_content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = true;
                x6h1 x6h1VarC11 = x6h1VarC10.a().c();
                x6h1VarC11.i.add(new a7h1("google_btn", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC11.j = false;
                ubaVarL4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC11.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                r0.m0().U(new y6g(2));
                return;
            case 6:
                uba ubaVarL5 = r0.l0();
                dsk0 dsk0Var6 = r0.l1;
                if (dsk0Var6 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC12 = dsk0Var6.b.c();
                x6h1VarC12.i.add(new a7h1("ucb_content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC12.j = true;
                x6h1 x6h1VarC13 = x6h1VarC12.a().c();
                x6h1VarC13.i.add(new a7h1("billing_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC13.j = true;
                x6h1 x6h1VarC14 = x6h1VarC13.a().c();
                x6h1VarC14.i.add(new a7h1("legal_checkbox_container", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC14.j = true;
                x6h1 x6h1VarC15 = x6h1VarC14.a().c();
                x6h1VarC15.i.add(new a7h1("legal_checkbox", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC15.j = false;
                ubaVarL5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_element_toggle", 1, b7xVar), x6h1VarC15.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                r0.m0().U(h7gVar);
                return;
            case 7:
                uba ubaVarL6 = r0.l0();
                dsk0 dsk0Var7 = r0.l1;
                if (dsk0Var7 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC16 = dsk0Var7.b.c();
                x6h1VarC16.i.add(new a7h1("ucb_content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC16.j = true;
                x6h1 x6h1VarC17 = x6h1VarC16.a().c();
                x6h1VarC17.i.add(new a7h1("billing_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC17.j = true;
                x6h1 x6h1VarC18 = x6h1VarC17.a().c();
                x6h1VarC18.i.add(new a7h1("legal_checkbox_container", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC18.j = true;
                x6h1 x6h1VarC19 = x6h1VarC18.a().c();
                x6h1VarC19.i.add(new a7h1("legal_checkbox", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC19.j = false;
                ubaVarL6.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_element_toggle", 1, b7xVar), x6h1VarC19.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                r0.m0().U(h7gVar);
                return;
            default:
                uba ubaVarL7 = r0.l0();
                dsk0 dsk0Var8 = r0.l1;
                if (dsk0Var8 == null) {
                    u890.C("ubiEventFactory");
                    throw null;
                }
                x6h1 x6h1VarC20 = dsk0Var8.b.c();
                x6h1VarC20.i.add(new a7h1("ucb_content", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC20.j = true;
                x6h1 x6h1VarC21 = x6h1VarC20.a().c();
                x6h1VarC21.i.add(new a7h1("billing_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC21.j = true;
                x6h1 x6h1VarC22 = x6h1VarC21.a().c();
                x6h1VarC22.i.add(new a7h1("continue_with_x_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC22.j = false;
                y6h1 y6h1VarA4 = x6h1VarC22.a();
                i9g i9gVar4 = r0.w1;
                String string = (i9gVar4 == null || (h9gVar4 = i9gVar4.c) == null || (lraVarB2 = h9gVar4.b()) == null || (tly0Var = lraVarB2.h) == null) ? null : tly0Var.toString();
                ubaVarL7.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", string != null ? string : "")), y6h1VarA4, r6h1.c, System.currentTimeMillis()), (xj61) null);
                r0.m0().U(z6g.a);
                return;
        }
    }
}
