package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mkr extends k9 {
    public final /* synthetic */ byte c = 0;
    public final Object d;
    public final Object e;

    public mkr(q8n q8nVar, kma kmaVar, jma jmaVar) {
        super(q8nVar, (byte) 4);
        this.d = kmaVar;
        this.e = jmaVar;
    }

    public Integer N0(ArrayList arrayList, ksc kscVar) {
        switch (this.c) {
            case 1:
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (true) {
                    dz10 dz10Var = null;
                    if (!it.hasNext()) {
                        List listA1 = o7h.a1(arrayList2, new cvt((byte) 7));
                        if (listA1.isEmpty()) {
                            return null;
                        }
                        List list = listA1;
                        ArrayList arrayList3 = new ArrayList(q7h.U(list, 10));
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((dz10) it2.next()).c.b);
                        }
                        int iIntValue = ((Number) jo31.t(o6x.a, new lqv(this, arrayList3, ((dz10) o7h.q0(listA1)).c.a(), (lnm) null, (byte) 8))).intValue();
                        if (iIntValue != -1) {
                            return Integer.valueOf(((dz10) listA1.get(iIntValue)).a);
                        }
                        return null;
                    }
                    mmr0 mmr0Var = (mmr0) it.next();
                    int iIntValue2 = ((Number) mmr0Var.a).intValue();
                    Object obj = ((vjh0) mmr0Var.b).c().j;
                    np51 np51Var = obj instanceof np51 ? (np51) obj : null;
                    if (np51Var != null) {
                        ie30 ie30Var = (ie30) kscVar.d.invoke(Integer.valueOf(iIntValue2));
                        if (kscVar.b || (kscVar.c.contains(ie30Var) && ie30Var.k >= kscVar.a.k)) {
                            dz10Var = new dz10(iIntValue2, ie30Var, np51Var);
                        }
                    }
                    if (dz10Var != null) {
                        arrayList2.add(dz10Var);
                    }
                }
                break;
            default:
                return super.N0(arrayList, kscVar);
        }
    }

    public final Object e1(vjh0 vjh0Var, fe6 fe6Var) {
        byte b = this.c;
        Object obj = this.e;
        switch (b) {
            case 0:
                String strA = ((jma) obj).a(vjh0Var.c());
                kma kmaVar = (kma) this.d;
                return Boolean.valueOf(kmaVar != null ? kmaVar.b(strA) : false);
            default:
                Object obj2 = vjh0Var.c().j;
                np51 np51Var = obj2 instanceof np51 ? (np51) obj2 : null;
                if (np51Var == null) {
                    return Boolean.FALSE;
                }
                yfu yfuVar = (yfu) obj;
                return c921.H((q8n) yfuVar.c, new lqv(yfuVar, np51Var.b, np51Var.a(), false, (lnm) null, (byte) 7), fe6Var);
        }
    }

    public mkr(q8n q8nVar, yfu yfuVar) {
        super(q8nVar, (byte) 4);
        this.d = q8nVar;
        this.e = yfuVar;
    }
}
