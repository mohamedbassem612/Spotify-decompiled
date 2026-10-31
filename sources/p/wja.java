package p;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wja implements rqw {
    public final /* synthetic */ byte a;
    public final hll0 b;

    public wja(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                this.b = new hll0(yon1.Y3().a, nik1.W1.a);
                break;
            case 2:
                AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                this.b = new hll0(yon1.Y3().a, nik1.W1.a);
                break;
            case 3:
                AtomicReferenceArray atomicReferenceArray3 = p6r0.e;
                this.b = new hll0(yon1.Y3().a, nik1.W1.a);
                break;
            case 4:
                AtomicReferenceArray atomicReferenceArray4 = p6r0.e;
                this.b = new hll0(yon1.Y3().a, nik1.W1.a);
                break;
            case 5:
                AtomicReferenceArray atomicReferenceArray5 = p6r0.e;
                this.b = new hll0(yon1.Y3().a, nik1.W1.a);
                break;
            default:
                AtomicReferenceArray atomicReferenceArray6 = p6r0.e;
                this.b = new hll0(yon1.Y3().a, nik1.W1.a);
                break;
        }
    }

    public final /* bridge */ /* synthetic */ Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            default:
                break;
        }
        return null;
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        hll0 hll0Var = this.b;
        switch (b) {
            case 0:
                x6h1 x6h1VarC = hll0Var.a.c();
                x6h1VarC.i.add(new a7h1("benefit_list_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 1:
                x6h1 x6h1VarC2 = hll0Var.a.c();
                x6h1VarC2.i.add(new a7h1("cancel_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
            case 2:
                x6h1 x6h1VarC3 = hll0Var.a.c();
                x6h1VarC3.i.add(new a7h1("plan_verification_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA3 = x6h1VarC3.a();
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1VarA3;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var3.a();
            case 3:
                x6h1 x6h1VarC4 = hll0Var.a.c();
                x6h1VarC4.i.add(new a7h1("unboxing_hub_entry_point", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                y6h1 y6h1VarA4 = x6h1VarC4.a();
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1VarA4;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var4.a();
            case 4:
                x6h1 x6h1VarC5 = hll0Var.a.c();
                x6h1VarC5.i.add(new a7h1("add_on_list_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                y6h1 y6h1VarA5 = x6h1VarC5.a();
                k7h1 k7h1Var5 = new k7h1();
                ((xjn) k7h1Var5).a = y6h1VarA5;
                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var5.a();
            default:
                x6h1 x6h1VarC6 = hll0Var.a.c();
                x6h1VarC6.i.add(new a7h1("add_on_list_card", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = true;
                y6h1 y6h1VarA6 = x6h1VarC6.a();
                k7h1 k7h1Var6 = new k7h1();
                ((xjn) k7h1Var6).a = y6h1VarA6;
                ((xjn) k7h1Var6).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var6.a();
        }
    }
}
