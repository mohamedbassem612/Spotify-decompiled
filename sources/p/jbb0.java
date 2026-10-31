package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jbb0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ o860 c;

    public /* synthetic */ jbb0(vr20 vr20Var, o860 o860Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = o860Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        ibb0 ibb0Var;
        Boolean m231Var;
        lbb0 lbb0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        o860 o860Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof ibb0) {
                    ibb0Var = (ibb0) lnmVar;
                    int i = ibb0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ibb0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        ibb0Var = new ibb0(this, lnmVar);
                    }
                } else {
                    ibb0Var = new ibb0(this, lnmVar);
                }
                Object obj2 = ibb0Var.a;
                int i2 = ibb0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                ArrayList arrayListI = o860.i(((pqc1) o860Var.b).f);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : arrayListI) {
                    String str = ((hpc1) obj3).f;
                    try {
                        m231Var = Boolean.valueOf(!u890.j(Locale.forLanguageTag(str).toLanguageTag(), ago1.q(str)));
                    } catch (Throwable th) {
                        m231Var = new m231(th);
                    }
                    if (e331.a(m231Var) == null ? m231Var.booleanValue() : false) {
                        arrayList.add(obj3);
                    }
                    break;
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(o860.y((hpc1) it.next()));
                }
                ibb0Var.b = 1;
                return vr20Var.emit(arrayList2, ibb0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof lbb0) {
                    lbb0Var = (lbb0) lnmVar;
                    int i3 = lbb0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        lbb0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        lbb0Var = new lbb0(this, lnmVar);
                    }
                } else {
                    lbb0Var = new lbb0(this, lnmVar);
                }
                Object obj4 = lbb0Var.a;
                int i4 = lbb0Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj4);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj4);
                hpc1 hpc1Var = ((pqc1) o860Var.b).g;
                vab0 vab0VarY = hpc1Var != null ? o860.y(hpc1Var) : null;
                lbb0Var.b = 1;
                return vr20Var.emit(vab0VarY, lbb0Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
