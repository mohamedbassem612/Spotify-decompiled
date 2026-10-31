package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x0v0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ j1v0 c;

    public /* synthetic */ x0v0(vr20 vr20Var, j1v0 j1v0Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = j1v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        w0v0 w0v0Var;
        z0v0 z0v0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j1v0 j1v0Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof w0v0) {
                    w0v0Var = (w0v0) lnmVar;
                    int i = w0v0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        w0v0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        w0v0Var = new w0v0(this, lnmVar);
                    }
                } else {
                    w0v0Var = new w0v0(this, lnmVar);
                }
                Object obj2 = w0v0Var.a;
                int i2 = w0v0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                ArrayList arrayList = new ArrayList();
                for (hwq hwqVar : (List) obj) {
                    String strB = j1v0Var.b(hwqVar);
                    LinkedHashMap linkedHashMap = j1v0Var.n;
                    if (linkedHashMap == null) {
                        u890.C("rowElements");
                        throw null;
                    }
                    wul1 wul1Var = (maa) linkedHashMap.get(strB);
                    wul1 wul1Var2 = wul1Var instanceof wul1 ? wul1Var : null;
                    f1r f1rVarA = wul1Var2 != null ? wul1Var2.getData().a(hwqVar) : null;
                    if (f1rVarA != null) {
                        arrayList.add(f1rVarA);
                    }
                }
                Set setP1 = o7h.p1(arrayList);
                w0v0Var.b = 1;
                return vr20Var.emit(setP1, w0v0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof z0v0) {
                    z0v0Var = (z0v0) lnmVar;
                    int i3 = z0v0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        z0v0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        z0v0Var = new z0v0(this, lnmVar);
                    }
                } else {
                    z0v0Var = new z0v0(this, lnmVar);
                }
                Object obj3 = z0v0Var.a;
                int i4 = z0v0Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    vhc1 vhc1VarU = i2p1.u((hwq) it.next());
                    ArrayList arrayList3 = j1v0Var.f;
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((zqw) ((s1v0) it2.next()).b).c().b().a(vhc1VarU));
                    }
                    r7h.W(arrayList4, arrayList2);
                }
                Set setP2 = o7h.p1(arrayList2);
                z0v0Var.b = 1;
                return vr20Var.emit(setP2, z0v0Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
