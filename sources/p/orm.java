package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class orm extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ res b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ orm(res resVar, byte b) {
        super(3);
        this.a = b;
        this.b = resVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List listSingletonList;
        w7h1 w7h1Var;
        byte b = this.a;
        irm irmVar = irm.a;
        jrm jrmVar = jrm.a;
        grm grmVar = grm.a;
        hrm hrmVar = hrm.a;
        res resVar = this.b;
        switch (b) {
            case 0:
                nrm nrmVar = (nrm) obj;
                krm krmVar = (krm) obj2;
                tqw tqwVar = (tqw) obj3;
                if (krmVar.equals(hrmVar)) {
                    ((lzn0) resVar.d).e();
                } else if (krmVar.equals(grmVar)) {
                    mrm mrmVar = nrmVar instanceof mrm ? (mrm) nrmVar : null;
                    if (mrmVar != null) {
                        mrmVar.f.invoke(tqwVar);
                    }
                } else if (krmVar.equals(jrmVar)) {
                    String strY = nrmVar.y();
                    if (strY != null) {
                        if (nrmVar instanceof lrm) {
                            listSingletonList = ((lrm) nrmVar).e;
                        } else {
                            if (!(nrmVar instanceof mrm)) {
                                eg.o();
                                return null;
                            }
                            listSingletonList = Collections.singletonList(((mrm) nrmVar).e);
                        }
                        lnh0 lnh0Var = (lnh0) resVar.g;
                        String strA = nrmVar.a();
                        List list = listSingletonList;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : list) {
                            if (((vy30) obj4).d == 1) {
                                arrayList.add(obj4);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((vy30) it.next()).a);
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : list) {
                            if (((vy30) obj5).d == 2) {
                                arrayList3.add(obj5);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((vy30) it2.next()).a);
                        }
                        mnh0 mnh0Var = new mnh0(strA, strY, arrayList2, arrayList4, nrmVar.z());
                        tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                        Set set = pcf.a;
                        mfm mfmVarA = lnh0Var.a.a(new lik1("spotify:chat-message:".concat(strY)));
                        m441 m441Var = new m441(new k1e0(lnh0Var, mnh0Var, (lnm) null, (byte) 7));
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        mfm.d(mfmVarA, m441Var, yon1.d1(), (bjm) null, tv80VarY, 20);
                    }
                } else if (!krmVar.equals(irmVar)) {
                    eg.o();
                    return null;
                }
                return rih1.a;
            default:
                krm krmVar2 = (krm) obj3;
                nqk0 nqk0Var = (nqk0) resVar.b;
                boolean zEquals = krmVar2.equals(hrmVar);
                b7x b7xVar = b7x.a;
                if (zEquals) {
                    nqk0Var.getClass();
                    x6h1 x6h1VarC = nqk0Var.b.c();
                    x6h1VarC.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
                } else if (krmVar2.equals(grmVar)) {
                    nqk0Var.getClass();
                    x6h1 x6h1VarC2 = nqk0Var.b.c();
                    x6h1VarC2.i.add(new a7h1("back_to_grid_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                } else if (krmVar2.equals(jrmVar)) {
                    nqk0Var.getClass();
                    x6h1 x6h1VarC3 = nqk0Var.b.c();
                    x6h1VarC3.i.add(new a7h1("more_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                } else {
                    if (!krmVar2.equals(irmVar)) {
                        eg.o();
                        return null;
                    }
                    nqk0Var.getClass();
                    x6h1 x6h1VarC4 = nqk0Var.b.c();
                    x6h1VarC4.i.add(new a7h1("download_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
        }
    }
}
