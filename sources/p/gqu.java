package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gqu implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ em3 b;

    public /* synthetic */ gqu(em3 em3Var, byte b) {
        this.a = b;
        this.b = em3Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        em3 em3Var = this.b;
        switch (b) {
            case 0:
                vn5 vn5Var = (vn5) obj;
                vn5Var.getClass();
                int i = vn5Var.a;
                i8h1 i8h1Var = (i8h1) em3Var.b;
                rrk0 rrk0Var = (rrk0) em3Var.c;
                Integer numValueOf = Integer.valueOf(i);
                x6h1 x6h1VarC = rrk0Var.b.c();
                x6h1VarC.i.add(new a7h1("icon_row", "default", numValueOf, (String) null, (String) null));
                x6h1VarC.j = true;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("select_entity_in_list", 1, Collections.singletonMap("entity_to_be_selected", "default")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                wn5 wn5Var = (wn5) obj;
                wn5Var.getClass();
                int i2 = wn5Var.a;
                i8h1 i8h1Var2 = (i8h1) em3Var.b;
                rrk0 rrk0Var2 = (rrk0) em3Var.c;
                Integer numValueOf2 = Integer.valueOf(i2);
                x6h1 x6h1VarC2 = rrk0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("icon_row", "default", numValueOf2, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA = x6h1VarC2.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1.c;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var2.f(k7h1Var.a(), (Set) null);
                break;
        }
    }
}
