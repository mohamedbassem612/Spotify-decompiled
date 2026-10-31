package p;

import com.spotify.playlistmixing.endpoints.MixingReorderingError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class phk0 {
    public final String a;
    public final vhk0 b;
    public final vek0 c;

    public phk0(String str, vhk0 vhk0Var, vek0 vek0Var) {
        this.a = str;
        this.b = vhk0Var;
        this.c = vek0Var;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00df  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(brv brvVar, onm onmVar) {
        ohk0 ohk0Var;
        Object objB;
        wd21 wd21Var;
        Object obj;
        List list;
        Throwable thA;
        MixingReorderingError mixingReorderingError;
        if (onmVar instanceof ohk0) {
            ohk0Var = (ohk0) onmVar;
            int i = ohk0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ohk0Var.f = i - Integer.MIN_VALUE;
            } else {
                ohk0Var = new ohk0(this, onmVar);
            }
        } else {
            ohk0Var = new ohk0(this, onmVar);
        }
        ohk0 ohk0Var2 = ohk0Var;
        Object obj2 = ohk0Var2.d;
        int i2 = ohk0Var2.f;
        String str = this.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj2);
            List list2 = brvVar.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list2) {
                if (obj3 instanceof r8t) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r7h.W(((r8t) it.next()).a, arrayList2);
            }
            ohk0Var2.a = brvVar;
            ohk0Var2.f = 1;
            objB = this.c.b(str, arrayList2, ohk0Var2);
            if (objB != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            brvVar = ohk0Var2.a;
            hm5.M(obj2);
            objB = ((e331) obj2).a;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = ohk0Var2.c;
            wd21Var = ohk0Var2.b;
            hm5.M(obj2);
            obj = ((e331) obj2).a;
        }
        thA = e331.a(obj);
        if (thA == null) {
            jt50 jt50Var = (jt50) obj;
            return new lsv(jt50Var.b, list, jt50Var.a, wd21Var);
        }
        mixingReorderingError = thA instanceof MixingReorderingError ? (MixingReorderingError) thA : null;
        if (mixingReorderingError == null) {
            mixingReorderingError = MixingReorderingError.ReorderFailed.a;
        }
        return new gsv(mixingReorderingError, 1);
        if (e331.a(objB) != null) {
            return new gsv(MixingReorderingError.ReorderFailed.a, 1);
        }
        wd21 wd21Var2 = (wd21) objB;
        ArrayList arrayListS = x2p1.s(brvVar.b, brvVar.a);
        List list3 = brvVar.c ? wd21Var2.b : z6x.a;
        ArrayList arrayList3 = wd21Var2.a;
        ohk0Var2.a = null;
        ohk0Var2.b = wd21Var2;
        ohk0Var2.c = list3;
        ohk0Var2.f = 2;
        Object objC = ((zhk0) this.b).c(str, arrayList3, list3, arrayListS, ohk0Var2);
        if (objC != d9nVar) {
            wd21Var = wd21Var2;
            obj = objC;
            list = list3;
            thA = e331.a(obj);
            if (thA == null) {
                jt50 jt50Var2 = (jt50) obj;
                return new lsv(jt50Var2.b, list, jt50Var2.a, wd21Var);
            }
            if (thA instanceof MixingReorderingError) {
            }
            if (mixingReorderingError == null) {
                mixingReorderingError = MixingReorderingError.ReorderFailed.a;
            }
            return new gsv(mixingReorderingError, 1);
        }
        return d9nVar;
    }
}
