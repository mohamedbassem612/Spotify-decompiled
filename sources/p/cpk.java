package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cpk extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpk(ArrayList arrayList, String str) {
        super(1);
        this.c = arrayList;
        this.b = str;
    }

    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ArrayList arrayList = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                qv00 qv00Var = (qv00) obj;
                qv00Var.b(j6k.class, arrayList, false);
                qv00Var.b(jfk.class, arrayList, false);
                qv00Var.b(lhe0.class, arrayList, false);
                if (str != null) {
                    qv00Var.a(str, s5k.class, false);
                }
                return rih1Var;
            default:
                d441 d441VarG1 = ((y341) obj).g1(str);
                try {
                    Iterator it = arrayList.iterator();
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpk(String str, ArrayList arrayList) {
        super(1);
        this.b = str;
        this.c = arrayList;
    }
}
