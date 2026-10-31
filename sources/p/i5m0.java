package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i5m0 implements n8h1, p8h1 {
    public final y6h1 a;
    public final /* synthetic */ c4m0 b;

    public i5m0(c4m0 c4m0Var, int i) {
        String str;
        this.b = c4m0Var;
        x6h1 x6h1VarC = c4m0Var.c.c();
        switch (i) {
            case 1:
                str = "all_fail";
                break;
            case 2:
                str = "all_success";
                break;
            case 3:
                str = "partial";
                break;
            case 4:
                str = "partial_24h";
                break;
            case 5:
                str = "partial_48h";
                break;
            case 6:
                str = "partial_fail";
                break;
            case 7:
                str = "partial_fail_24h";
                break;
            case 8:
                str = "partial_fail_48h";
                break;
            case 9:
                str = "partial_success";
                break;
            case 10:
                str = "successful_fail";
                break;
            case 11:
                str = "successful_partial_fail";
                break;
            default:
                throw null;
        }
        x6h1VarC.i.add(new a7h1("match_results_banner", str, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        this.a = x6h1VarC.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        r6h1 r6h1Var2 = this.b.b;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.a);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.a;
        ((xjn) k7h1Var).b = this.b.b;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        return k7h1Var.a();
    }
}
