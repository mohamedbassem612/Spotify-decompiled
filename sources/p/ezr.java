package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ezr implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hzr b;

    public /* synthetic */ ezr(hzr hzrVar, byte b) {
        this.a = b;
        this.b = hzrVar;
    }

    public final void accept(Object obj) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        byte b = this.a;
        hzr hzrVar = this.b;
        switch (b) {
            case 0:
                hzrVar.a.e();
                break;
            case 1:
                erg0 erg0Var = (erg0) obj;
                zxl zxlVar = hzrVar.b;
                ArrayList arrayList = erg0Var.c;
                ArrayList arrayList2 = erg0Var.d;
                if (!arrayList.isEmpty()) {
                    zxlVar.a.j((String[]) erg0Var.c.toArray(new String[0]), true);
                }
                if (!arrayList2.isEmpty()) {
                    zxlVar.a.j((String[]) arrayList2.toArray(new String[0]), false);
                }
                break;
            case 2:
                jqd0 jqd0Var = hzrVar.d;
                ((wh41) jqd0Var.c).m(rrg0.f);
                lzn0 lzn0Var = (lzn0) jqd0Var.d;
                lzn0Var.e();
                if (jqd0Var.b) {
                    lzn0Var.e();
                }
                break;
            case 3:
                goq goqVar = hzrVar.f;
                mw40 mw40VarT = yoi1.T(((nw40) goqVar.g).a, (String) ((idd1) goqVar.d).getValue(), (String) ((idd1) goqVar.e).getValue());
                String str = (String) ((idd1) goqVar.f).getValue();
                z6s z6sVar = new z6s(goqVar, (byte) 0);
                mw40VarT.a = str;
                mw40VarT.c = z6sVar;
                String str2 = (String) ((idd1) goqVar.h).getValue();
                z6s z6sVar2 = new z6s(goqVar, (byte) 1);
                mw40VarT.b = str2;
                mw40VarT.d = z6sVar2;
                mw40VarT.f = new vae(goqVar, (byte) 1);
                mw40VarT.h = new nn5(goqVar, (byte) 1);
                mw40VarT.b().b();
                break;
            default:
                ptf1 ptf1Var = hzrVar.c;
                vzn1 vzn1Var = ((drg0) obj).c;
                epl0 epl0Var = (epl0) ptf1Var.c;
                boolean z = vzn1Var instanceof xrg0;
                b7x b7xVar = b7x.a;
                if (z) {
                    epl0Var.getClass();
                    x6h1 x6h1VarC = epl0Var.a.c();
                    x6h1VarC.i.add(new a7h1("mark_all_as_played", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    String str3 = ((xrg0) vzn1Var).c;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_entity_in_list", 1, Collections.singletonMap("entity_to_be_selected", str3 != null ? str3 : "")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                } else {
                    if (vzn1Var instanceof wrg0) {
                        epl0Var.getClass();
                        x6h1 x6h1VarC2 = epl0Var.a.c();
                        x6h1VarC2.i.add(new a7h1("mark_all_as_played", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        y6h1 y6h1VarA2 = x6h1VarC2.a();
                        String str4 = ((wrg0) vzn1Var).c;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("deselect_entity_in_list", 1, Collections.singletonMap("entity_to_be_deselected", str4 != null ? str4 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                    } else if (vzn1Var instanceof vrg0) {
                        epl0Var.getClass();
                        x6h1 x6h1VarC3 = epl0Var.a.c();
                        x6h1VarC3.i.add(new a7h1("episode_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        y6h1 y6h1VarA3 = x6h1VarC3.a();
                        String str5 = ((vrg0) vzn1Var).c;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("select_entity_in_list", 1, Collections.singletonMap("entity_to_be_selected", str5 != null ? str5 : "")), y6h1VarA3, r6h1.c, System.currentTimeMillis());
                    } else if (vzn1Var instanceof urg0) {
                        epl0Var.getClass();
                        x6h1 x6h1VarC4 = epl0Var.a.c();
                        x6h1VarC4.i.add(new a7h1("episode_row", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        y6h1 y6h1VarA4 = x6h1VarC4.a();
                        String str6 = ((urg0) vzn1Var).c;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("deselect_entity_in_list", 1, Collections.singletonMap("entity_to_be_deselected", str6 != null ? str6 : "")), y6h1VarA4, r6h1.c, System.currentTimeMillis());
                    } else if (!(vzn1Var instanceof trg0)) {
                        eg.o();
                    } else {
                        epl0Var.getClass();
                        x6h1 x6h1VarC5 = epl0Var.a.c();
                        x6h1VarC5.i.add(new a7h1("done_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        y6h1 y6h1VarA5 = x6h1VarC5.a();
                        String str7 = ((trg0) vzn1Var).c;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("complete_mark_as_played", 1, Collections.singletonMap("item_uri", str7 != null ? str7 : "")), y6h1VarA5, r6h1.c, System.currentTimeMillis());
                    }
                    w7h1Var = w7h1Var2;
                }
                ((i8h1) ((ynb0) ptf1Var.b).get()).m(w7h1Var, (xj61) null);
                break;
        }
    }
}
