package p;

import com.spotify.pam.v2.Action;
import com.spotify.pam.v2.ActionTypeMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dvm0 implements rqw {
    public final /* synthetic */ byte a = 0;
    public final Object b;
    public final /* synthetic */ Object c;

    public dvm0(evm0 evm0Var) {
        this.c = evm0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = new hll0(yon1.Y3().a, nik1.W1.a);
    }

    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return (w7h1) ((xu30) this.c).invoke(obj, obj2, obj3);
        }
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        int i;
        String uri;
        Action actionN;
        byte b = this.a;
        Object obj3 = this.c;
        ActionTypeMap actionTypeMap = null;
        Object obj4 = null;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                if (!((lbt0) obj).b.h.g || !((evm0) obj3).b.b.l()) {
                    return null;
                }
                x6h1 x6h1VarC = ((hll0) obj5).a.c();
                x6h1VarC.i.add(new a7h1("user_plan_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("buy_account_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA = x6h1VarC2.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 1:
                if (!((lbt0) obj).b.h.g || !((fvm0) obj3).b.b.l()) {
                    return null;
                }
                x6h1 x6h1VarC3 = ((hll0) obj5).a.c();
                x6h1VarC3.i.add(new a7h1("user_plan_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("buy_account_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                y6h1 y6h1VarA2 = x6h1VarC4.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
            case 2:
                p2c1 p2c1Var = (p2c1) obj2;
                y6h1 y6h1Var = ((yok0) obj5).b;
                int i2 = p2c1Var.b;
                s2c1 s2c1Var = p2c1Var.a;
                int iC = l1d.C(((q2c1) obj3).a);
                if (iC == 0) {
                    x6h1 x6h1VarC5 = y6h1Var.c();
                    x6h1VarC5.i.add(new a7h1("plans", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC5.a();
                    Integer numValueOf = Integer.valueOf(i2);
                    i = s2c1Var.f ? 1 : 2;
                    String str = s2c1Var.i;
                    x6h1 x6h1VarC6 = y6h1VarA3.c();
                    x6h1VarC6.i.add(new a7h1("storefront_card", (String) null, numValueOf, str, ktk0.f(i)));
                    x6h1VarC6.j = true;
                    y6h1 y6h1VarA4 = x6h1VarC6.a();
                    k7h1 k7h1Var3 = new k7h1();
                    ((xjn) k7h1Var3).a = y6h1VarA4;
                    ((xjn) k7h1Var3).b = r6h1.c;
                    ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                    return k7h1Var3.a();
                }
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                int i3 = p2c1Var.c ? 1 : 2;
                i = s2c1Var.m ? 1 : 2;
                c380 c380Var = s2c1Var.l;
                if (c380Var != null) {
                    for (Object obj6 : c380Var) {
                        if (((ActionTypeMap) obj6).o() == s80.ASTRO_GET_DETAILS) {
                            obj4 = obj6;
                            actionTypeMap = (ActionTypeMap) obj4;
                        }
                    }
                    actionTypeMap = (ActionTypeMap) obj4;
                }
                if (actionTypeMap == null || (actionN = actionTypeMap.n()) == null || (uri = actionN.getUri()) == null) {
                    uri = "";
                }
                String str2 = uri;
                x6h1 x6h1VarC7 = y6h1Var.c();
                x6h1VarC7.i.add(new a7h1("add_ons", (String) null, (Integer) null, (String) null, ktk0.a(i3)));
                x6h1VarC7.j = false;
                y6h1 y6h1VarA5 = x6h1VarC7.a();
                Integer numValueOf2 = Integer.valueOf(i2);
                x6h1 x6h1VarC8 = y6h1VarA5.c();
                x6h1VarC8.i.add(new a7h1("storefront_card_add_on", (String) null, numValueOf2, str2, ktk0.b(i)));
                x6h1VarC8.j = true;
                y6h1 y6h1VarA6 = x6h1VarC8.a();
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1VarA6;
                ((xjn) k7h1Var4).b = r6h1.c;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var4.a();
            default:
                return ((vu30) obj5).invoke(obj, obj2);
        }
    }

    public dvm0(fvm0 fvm0Var) {
        this.c = fvm0Var;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        this.b = new hll0(yon1.Y3().a, nik1.W1.a);
    }

    public dvm0(vu30 vu30Var, xu30 xu30Var) {
        this.b = vu30Var;
        this.c = xu30Var;
    }

    public dvm0(q2c1 q2c1Var) {
        this.c = q2c1Var;
        r6h1 r6h1Var = r6h1.c;
        this.b = new yok0((byte) 7);
    }
}
