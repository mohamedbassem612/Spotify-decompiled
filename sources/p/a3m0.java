package p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a3m0 implements n8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ z2m0 c;

    public a3m0(z2m0 z2m0Var, String str, byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.c = z2m0Var;
                x6h1 x6h1VarC = z2m0Var.b.c();
                x6h1VarC.i.add(new a7h1("share_button", "venue-entity-share-id", (Integer) null, str, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            default:
                this.c = z2m0Var;
                x6h1 x6h1VarC2 = z2m0Var.b.c();
                x6h1VarC2.i.add(new a7h1("badge", str, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
        }
    }

    public w7h1 a(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), this.b, this.c.c.b, System.currentTimeMillis());
    }

    public final r6h1 b() {
        byte b = this.a;
        z2m0 z2m0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = z2m0Var.c.b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var2.b);
            case 1:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = z2m0Var.c.b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var4.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var4.b);
            case 2:
                r6h1 r6h1Var5 = r6h1.c;
                r6h1 r6h1Var6 = z2m0Var.c.b;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(r6h1Var6.a);
                arrayList3.add(y6h1Var);
                return new r6h1(arrayList3, r6h1Var6.b);
            default:
                r6h1 r6h1Var7 = r6h1.c;
                r6h1 r6h1Var8 = z2m0Var.c.b;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(r6h1Var8.a);
                arrayList4.add(y6h1Var);
                return new r6h1(arrayList4, r6h1Var8.b);
        }
    }

    public w7h1 e(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("share", 2, sqg0.J(new mmr0[]{new mmr0("entity_to_be_shared", str), new mmr0("share_id", "venue-entity-share-id")})), this.b, this.c.c.b, System.currentTimeMillis());
    }

    public w7h1 h() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), this.b, this.c.c.b, System.currentTimeMillis());
    }

    public w7h1 i() {
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), this.b, this.c.c.b, System.currentTimeMillis());
    }

    public a3m0(z2m0 z2m0Var, Integer num, String str) {
        this.a = (byte) 2;
        this.c = z2m0Var;
        x6h1 x6h1VarC = z2m0Var.b.c();
        x6h1VarC.i.add(new a7h1("concept_chip", (String) null, num, str, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }

    public a3m0(z2m0 z2m0Var) {
        this.a = (byte) 0;
        this.c = z2m0Var;
        x6h1 x6h1VarC = z2m0Var.b.c();
        x6h1VarC.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }
}
