package p;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g81 implements kg51 {
    public final /* synthetic */ byte a;
    public final Context b;

    public /* synthetic */ g81(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qf90 qf90Var = qf90.a;
        int i = 0;
        Context context = this.b;
        switch (b) {
            case 0:
                tr3 tr3Var = (tr3) obj;
                Boolean bool = (Boolean) tr3Var.c.a(qf90Var);
                return Collections.singletonList(new ghy(1, context.getString(2131964006), bool != null ? bool.booleanValue() : false, tr3Var.b.a.b));
            case 1:
                tr3 tr3Var2 = (tr3) obj;
                Boolean bool2 = (Boolean) tr3Var2.c.a(qf90Var);
                return Collections.singletonList(new ghy(2, context.getString(2131964007), bool2 != null ? bool2.booleanValue() : false, tr3Var2.b.a.b));
            case 2:
                tr3 tr3Var3 = (tr3) obj;
                Boolean bool3 = (Boolean) tr3Var3.c.a(qf90Var);
                return Collections.singletonList(new ghy(3, context.getString(2131964069), bool3 != null ? bool3.booleanValue() : false, tr3Var3.b.a.b));
            case 3:
                tr3 tr3Var4 = (tr3) obj;
                Boolean bool4 = (Boolean) tr3Var4.c.a(qf90Var);
                return Collections.singletonList(new ghy(4, context.getString(2131964090), bool4 != null ? bool4.booleanValue() : false, tr3Var4.b.a.b));
            default:
                tr3 tr3Var5 = (tr3) obj;
                zgo zgoVar = (zgo) tr3Var5.c.a(aho.a);
                if (zgoVar instanceof xgo) {
                    List list = ((xgo) zgoVar).a;
                    if (!list.isEmpty()) {
                        String string = context.getString(2131964139);
                        as3 as3Var = tr3Var5.b.a.b;
                        smc0 smc0VarN = k4p1.n();
                        smc0VarN.add(new khy(string));
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                        for (Object obj2 : list2) {
                            int i2 = i + 1;
                            if (i < 0) {
                                p7h.T();
                                throw null;
                            }
                            arrayList.add(new bhy(i, (ttm1) obj2, as3Var, i));
                            i = i2;
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            smc0VarN.add((bhy) it.next());
                        }
                        return k4p1.k(smc0VarN);
                    }
                }
                return z6x.a;
        }
    }
}
