package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qz9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz9(List list, List list2, ArrayList arrayList, List list3, k6a1 k6a1Var, c9n c9nVar, xtb0 xtb0Var, boolean z) {
        super(1);
        this.c = list;
        this.d = list2;
        this.e = arrayList;
        this.f = list3;
        this.g = k6a1Var;
        this.h = c9nVar;
        this.i = xtb0Var;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.i;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        Object obj6 = this.e;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (b) {
            case 0:
                return new e27(new lz9((g2z) obj8, (byte) 0), new jz9((dg90) obj7, (bhf) obj6, (gqg) obj5, (q8n) obj4, this.b, (wh71) obj3, (oud) obj, (Context) obj2));
            case 1:
                rtb0 rtb0Var = (rtb0) obj;
                List list = (List) obj8;
                Set set = (Set) obj7;
                iu30 iu30Var = (iu30) obj6;
                ven0 ven0Var = (ven0) obj5;
                iu30 iu30Var2 = (iu30) obj4;
                iu30 iu30Var3 = (iu30) obj3;
                kl80 kl80Var = (kl80) obj2;
                int i = 0;
                for (Object obj9 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    pl80 pl80Var = (pl80) obj9;
                    String str = pl80Var.a;
                    pl80 pl80Var2 = (pl80) o7h.s0(list);
                    boolean z = u890.j(pl80Var2 != null ? pl80Var2.a : null, str) || set.contains(str);
                    rtb0.f(rtb0Var, "header-".concat(str), new j2i(1680306563, new hm80(pl80Var, i, z, iu30Var, ven0Var), true), 2);
                    rtb0.c(rtb0Var, "body-".concat(str), new j2i(-968287113, new hpy(z, this.b, pl80Var, iu30Var2, iu30Var3, kl80Var), true), 2);
                    i = i2;
                }
                return rih1Var;
            default:
                List list2 = (List) obj8;
                ((rtb0) obj).e(list2.size(), (iu30) null, new xg50(list2, (byte) 29), new j2i(2039820996, new dff0(list2, (List) obj7, (ArrayList) obj6, (List) obj5, list2, (k6a1) obj4, (c9n) obj3, (xtb0) obj2, this.b), true));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz9(List list, Set set, iu30 iu30Var, ven0 ven0Var, boolean z, iu30 iu30Var2, iu30 iu30Var3, kl80 kl80Var) {
        super(1);
        this.c = list;
        this.d = set;
        this.e = iu30Var;
        this.f = ven0Var;
        this.b = z;
        this.g = iu30Var2;
        this.h = iu30Var3;
        this.i = kl80Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz9(g2z g2zVar, dg90 dg90Var, bhf bhfVar, gqg gqgVar, q8n q8nVar, boolean z, wh71 wh71Var, Context context) {
        super(1);
        this.c = g2zVar;
        this.d = dg90Var;
        this.e = bhfVar;
        this.f = gqgVar;
        this.g = q8nVar;
        this.b = z;
        this.h = wh71Var;
        this.i = context;
    }
}
