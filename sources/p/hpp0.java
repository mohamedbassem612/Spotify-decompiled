package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hpp0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ List b;
    public /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hpp0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        switch (b) {
            case 0:
                hpp0 hpp0Var = new hpp0(b2, (lnm) obj3, (byte) 0);
                hpp0Var.b = (List) obj;
                hpp0Var.c = (String) obj2;
                return hpp0Var.invokeSuspend(rih1Var);
            case 1:
                hpp0 hpp0Var2 = new hpp0(b2, (lnm) obj3, (byte) 1);
                hpp0Var2.b = (List) obj;
                hpp0Var2.c = (String) obj2;
                return hpp0Var2.invokeSuspend(rih1Var);
            case 2:
                hpp0 hpp0Var3 = new hpp0(b2, (lnm) obj3, (byte) 2);
                hpp0Var3.b = (List) obj;
                hpp0Var3.c = (String) obj2;
                return hpp0Var3.invokeSuspend(rih1Var);
            default:
                hpp0 hpp0Var4 = new hpp0(b2, (lnm) obj3, b2);
                hpp0Var4.c = (String) obj;
                hpp0Var4.b = (List) obj2;
                return hpp0Var4.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                List list = this.b;
                String str = this.c;
                hm5.M(obj);
                List<l820> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (l820 l820Var : list2) {
                    boolean zEquals = l820Var.b.equals(str);
                    arrayList.add(new l820(l820Var.d, l820Var.a, l820Var.b, zEquals));
                }
                return arrayList;
            case 1:
                List list3 = this.b;
                String str2 = this.c;
                hm5.M(obj);
                if (list3.isEmpty()) {
                    return null;
                }
                return str2;
            case 2:
                List list4 = this.b;
                String str3 = this.c;
                hm5.M(obj);
                return o7h.N0(p7h.N(str3), list4);
            default:
                String str4 = this.c;
                List list5 = this.b;
                hm5.M(obj);
                return mqn1.D(str4, list5);
        }
    }
}
