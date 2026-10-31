package p;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class om41 {
    public static final /* synthetic */ int a = 0;

    static {
        qs10.c("Schedulers");
    }

    public static void a(dxl1 dxl1Var, ytw0 ytw0Var, List list) {
        if (list.size() > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dxl1Var.f(jCurrentTimeMillis, ((vwl1) it.next()).a);
            }
        }
    }

    public static void b(btk btkVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        dxl1 dxl1VarA = workDatabase.A();
        workDatabase.c();
        try {
            en31 en31Var = dxl1VarA.a;
            en31 en31Var2 = dxl1VarA.a;
            List list2 = (List) qyo1.x(en31Var, true, false, new qti1((byte) 25));
            a(dxl1VarA, btkVar.d, list2);
            List list3 = (List) qyo1.x(en31Var2, true, false, new qti1((byte) 22));
            a(dxl1VarA, btkVar.d, list3);
            list3.addAll(list2);
            List list4 = (List) qyo1.x(en31Var2, true, false, new qti1((byte) 28));
            workDatabase.s();
            workDatabase.o();
            if (list3.size() > 0) {
                vwl1[] vwl1VarArr = (vwl1[]) list3.toArray(new vwl1[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    im41 im41Var = (im41) it.next();
                    if (im41Var.d()) {
                        im41Var.e(vwl1VarArr);
                    }
                }
            }
            if (list4.size() > 0) {
                vwl1[] vwl1VarArr2 = (vwl1[]) list4.toArray(new vwl1[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    im41 im41Var2 = (im41) it2.next();
                    if (!im41Var2.d()) {
                        im41Var2.e(vwl1VarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.o();
            throw th;
        }
    }
}
