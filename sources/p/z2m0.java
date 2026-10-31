package p;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class z2m0 implements n8h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final /* synthetic */ ksk0 c;

    public z2m0(ksk0 ksk0Var, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.c = ksk0Var;
                x6h1 x6h1VarC = ksk0Var.c.c();
                x6h1VarC.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                this.b = x6h1VarC.a();
                break;
            case 3:
                this.c = ksk0Var;
                x6h1 x6h1VarC2 = ksk0Var.c.c();
                x6h1VarC2.i.add(new a7h1("tabs", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                this.b = x6h1VarC2.a();
                break;
            default:
                this.c = ksk0Var;
                x6h1 x6h1VarC3 = ksk0Var.c.c();
                x6h1VarC3.i.add(new a7h1("address_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                this.b = x6h1VarC3.a();
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        ksk0 ksk0Var = this.c;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = ksk0Var.b;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var2.b);
            case 1:
                r6h1 r6h1Var3 = r6h1.c;
                r6h1 r6h1Var4 = ksk0Var.b;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var4.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var4.b);
            case 2:
                r6h1 r6h1Var5 = r6h1.c;
                r6h1 r6h1Var6 = ksk0Var.b;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(r6h1Var6.a);
                arrayList3.add(y6h1Var);
                return new r6h1(arrayList3, r6h1Var6.b);
            default:
                r6h1 r6h1Var7 = r6h1.c;
                r6h1 r6h1Var8 = ksk0Var.b;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(r6h1Var8.a);
                arrayList4.add(y6h1Var);
                return new r6h1(arrayList4, r6h1Var8.b);
        }
    }

    public a3m0 e() {
        return new a3m0(this);
    }

    public a3m0 h(String str) {
        return new a3m0(this, str, (byte) 1);
    }

    public a3m0 i(Integer num, String str) {
        return new a3m0(this, num, str);
    }

    public w7h1 j(String str) {
        z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
        if (str == null) {
            str = "";
        }
        return new w7h1("", "", z7h1Var, new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str)), this.b, this.c.b, System.currentTimeMillis());
    }

    public mjl0 k() {
        return new mjl0(this);
    }

    public a3m0 l(String str) {
        return new a3m0(this, str, (byte) 3);
    }

    public sqk0 m(String str) {
        return new sqk0(this, str);
    }

    public z2m0(ksk0 ksk0Var, String str) {
        this.a = (byte) 1;
        this.c = ksk0Var;
        x6h1 x6h1VarC = ksk0Var.c.c();
        x6h1VarC.i.add(new a7h1("badge_bottom_sheet", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        this.b = x6h1VarC.a();
    }
}
