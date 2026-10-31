package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jy00 implements zu30 {
    public static final jy00 b = new jy00(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ jy00(byte b2) {
        this.a = b2;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.a) {
            case 0:
                return a((pnl0) obj, (dhm0) obj3, (t600) obj4);
            default:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (x340Var.g(aqb0Var) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= x340Var.e(iIntValue) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(i & 1, (i & 147) != 146)) {
                    x340Var2.b0();
                    return rih1.a;
                }
                throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + iIntValue + '.');
        }
    }

    public w7h1 a(pnl0 pnl0Var, dhm0 dhm0Var, t600 t600Var) {
        r6h1 r6h1Var = pnl0Var.a;
        y6h1 y6h1Var = pnl0Var.b;
        boolean z = t600Var instanceof rzz;
        b7x b7xVar = b7x.a;
        if (z) {
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("extender_item_list", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            y6h1 y6h1VarA = x6h1VarC.a();
            rzz rzzVar = (rzz) t600Var;
            p111 p111Var = rzzVar.b;
            Integer numValueOf = Integer.valueOf(rzzVar.a);
            String str = p111Var.b;
            x6h1 x6h1VarC2 = y6h1VarA.c();
            x6h1VarC2.i.add(new a7h1("item", (String) null, numValueOf, str, (String) null));
            x6h1VarC2.j = true;
            y6h1 y6h1VarA2 = x6h1VarC2.a();
            String str2 = p111Var.b;
            z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
            if (str2 == null) {
                str2 = "";
            }
            return new w7h1("", "", z7h1Var, new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str2)), y6h1VarA2, r6h1Var, System.currentTimeMillis());
        }
        if (!(t600Var instanceof nvz)) {
            if (!(t600Var instanceof szz)) {
                return null;
            }
            x6h1 x6h1VarC3 = y6h1Var.c();
            x6h1VarC3.i.add(new a7h1("extender_item_list", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC3.j = false;
            y6h1 y6h1VarA3 = x6h1VarC3.a();
            szz szzVar = (szz) t600Var;
            Integer numValueOf2 = Integer.valueOf(szzVar.a);
            String str3 = szzVar.b.b;
            x6h1 x6h1VarC4 = y6h1VarA3.c();
            x6h1VarC4.i.add(new a7h1("item", (String) null, numValueOf2, str3, (String) null));
            x6h1VarC4.j = true;
            return new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
        }
        x6h1 x6h1VarC5 = y6h1Var.c();
        x6h1VarC5.i.add(new a7h1("extender_item_list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC5.j = false;
        y6h1 y6h1VarA4 = x6h1VarC5.a();
        nvz nvzVar = (nvz) t600Var;
        Integer numValueOf3 = Integer.valueOf(nvzVar.a);
        String str4 = nvzVar.b;
        x6h1 x6h1VarC6 = y6h1VarA4.c();
        x6h1VarC6.i.add(new a7h1("item", (String) null, numValueOf3, str4, (String) null));
        x6h1VarC6.j = true;
        x6h1 x6h1VarC7 = x6h1VarC6.a().c();
        x6h1VarC7.i.add(new a7h1("add_songs_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC7.j = false;
        y6h1 y6h1VarA5 = x6h1VarC7.a();
        String str5 = dhm0Var.b;
        String str6 = nvzVar.b;
        z7h1 z7h1Var2 = new z7h1("hit", 1, b7xVar);
        if (str5 == null) {
            str5 = "";
        }
        mmr0 mmr0Var = new mmr0("playlist", str5);
        if (str6 == null) {
            str6 = "";
        }
        return new w7h1("", "", z7h1Var2, new x7h1("add_to_playlist", 2, sqg0.J(new mmr0[]{mmr0Var, new mmr0("item_to_be_added", str6)})), y6h1VarA5, r6h1Var, System.currentTimeMillis());
    }
}
