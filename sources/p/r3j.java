package p;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r3j extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3j(String str, List list, byte b) {
        super(1);
        this.a = b;
        this.b = str;
        this.c = list;
    }

    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        List list = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, str);
                b261.p(e261Var, list);
                return rih1Var;
            case 1:
                return new aum0((List) null, Collections.singletonList(str), this.c, (Map) null, 9);
            case 2:
                e261 e261Var2 = (e261) obj;
                b261.n(e261Var2, str);
                b261.p(e261Var2, list);
                return rih1Var;
            case 3:
                d441 d441VarG1 = ((y341) obj).g1(str);
                try {
                    Iterator it = list.iterator();
                    int i = 1;
                    while (it.hasNext()) {
                        d441VarG1.K(i, (String) it.next());
                        i++;
                    }
                    d441VarG1.f1();
                    return rih1Var;
                } finally {
                    d441VarG1.close();
                }
            case 4:
                e261 e261Var3 = (e261) obj;
                b261.n(e261Var3, str);
                b261.p(e261Var3, list);
                return rih1Var;
            case 5:
                qv00 qv00Var = (qv00) obj;
                List list2 = list;
                qv00Var.b(jo70.class, list2, false);
                qv00Var.b(xkk1.class, list2, false);
                if (str != null) {
                    qv00Var.a(str, xkk1.class, false);
                }
                return rih1Var;
            default:
                qv00 qv00Var2 = (qv00) obj;
                if (list.contains("title")) {
                    qv00Var2.a(str, jo70.class, false);
                }
                if (list.contains("start_offset")) {
                    qv00Var2.a(str, hll.class, false);
                    qv00Var2.a(str, d7u0.class, false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r3j(List list, String str, byte b) {
        super(1);
        this.a = b;
        this.c = list;
        this.b = str;
    }
}
