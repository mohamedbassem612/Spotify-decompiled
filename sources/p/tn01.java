package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tn01 {
    public static final bma1 e = bma1.b.u("chat_content_picker_recent_searches");
    public final Single a;
    public final nfa0 b;
    public final tcy c;
    public final r36 d = new r36(fn01.Companion.serializer(), (byte) 0);

    public tn01(Single single, nfa0 nfa0Var, tcy tcyVar) {
        this.a = single;
        this.b = nfa0Var;
        this.c = tcyVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        qn01 qn01Var;
        if (onmVar instanceof qn01) {
            qn01Var = (qn01) onmVar;
            int i = qn01Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qn01Var.c = i - Integer.MIN_VALUE;
            } else {
                qn01Var = new qn01(this, onmVar);
            }
        } else {
            qn01Var = new qn01(this, onmVar);
        }
        Object objJ = qn01Var.a;
        int i2 = qn01Var.c;
        if (i2 == 0) {
            hm5.M(objJ);
            qn01Var.c = 1;
            objJ = fc11.j(this.a, qn01Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objJ);
        }
        hma1 hma1VarEdit = ((dma1) objJ).edit();
        hma1VarEdit.f(e);
        hma1VarEdit.g();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x008a A[LOOP:0: B:28:0x0084->B:30:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(onm onmVar) {
        rn01 rn01Var;
        List list;
        List list2;
        ArrayList arrayList;
        ArrayList arrayList2;
        if (onmVar instanceof rn01) {
            rn01Var = (rn01) onmVar;
            int i = rn01Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                rn01Var.d = i - Integer.MIN_VALUE;
            } else {
                rn01Var = new rn01(this, onmVar);
            }
        } else {
            rn01Var = new rn01(this, onmVar);
        }
        Object objJ = rn01Var.b;
        int i2 = rn01Var.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ);
            rn01Var.d = 1;
            objJ = fc11.j(this.a, rn01Var);
            if (objJ != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(objJ);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = rn01Var.a;
            hm5.M(objJ);
        }
        list2 = (List) objJ;
        List<fn01> list3 = list;
        arrayList = new ArrayList(q7h.U(list3, 10));
        for (fn01 fn01Var : list3) {
            arrayList.add(new hby(fn01Var.a, fn01Var.b));
        }
        arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (list2.contains(((hby) obj).b)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
        String strE = ((dma1) objJ).e(e, (String) null);
        if (strE == null) {
            return z6x.a;
        }
        List list4 = (List) this.b.a(strE, this.d);
        rn01Var.a = list4;
        rn01Var.d = 2;
        Object objA = this.c.a(rn01Var);
        if (objA != d9nVar) {
            objJ = objA;
            list = list4;
            list2 = (List) objJ;
            List<fn01> list5 = list;
            arrayList = new ArrayList(q7h.U(list5, 10));
            while (r7.hasNext()) {
                arrayList.add(new hby(fn01Var.a, fn01Var.b));
            }
            arrayList2 = new ArrayList();
            while (r0.hasNext()) {
                if (list2.contains(((hby) obj).b)) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0091 A[Catch: Exception -> 0x002f, LOOP:0: B:31:0x008b->B:33:0x0091, LOOP_END, TryCatch #0 {Exception -> 0x002f, blocks: (B:13:0x002b, B:30:0x0062, B:31:0x008b, B:33:0x0091, B:34:0x00a4, B:20:0x003b, B:26:0x004f, B:23:0x0042), top: B:39:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(hby hbyVar, onm onmVar) {
        sn01 sn01Var;
        hby hbyVar2;
        dma1 dma1Var;
        ArrayList arrayList;
        if (onmVar instanceof sn01) {
            sn01Var = (sn01) onmVar;
            int i = sn01Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                sn01Var.e = i - Integer.MIN_VALUE;
            } else {
                sn01Var = new sn01(this, onmVar);
            }
        } else {
            sn01Var = new sn01(this, onmVar);
        }
        Object objJ = sn01Var.c;
        int i2 = sn01Var.e;
        byte b = 2;
        Serializable serializable = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single single = this.a;
                sn01Var.a = hbyVar;
                sn01Var.e = 1;
                objJ = fc11.j(single, sn01Var);
                if (objJ == serializable) {
                }
                return serializable;
            }
            if (i2 == 1) {
                hbyVar = sn01Var.a;
                hm5.M(objJ);
            } else {
                if (i2 != 2) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dma1Var = sn01Var.b;
                hbyVar2 = sn01Var.a;
                hm5.M(objJ);
            }
            ArrayList arrayList2 = new ArrayList((Collection) objJ);
            r7h.a0(arrayList2, new ak01(hbyVar2, b));
            arrayList2.add(0, hbyVar2);
            List<hby> listD1 = o7h.d1(arrayList2, 15);
            arrayList = new ArrayList(q7h.U(listD1, 10));
            for (hby hbyVar3 : listD1) {
                arrayList.add(new fn01(hbyVar3.a, hbyVar3.b));
            }
            hma1 hma1VarEdit = dma1Var.edit();
            hma1VarEdit.d(e, this.b.b(this.d, arrayList));
            hma1VarEdit.g();
            return rih1.a;
            dma1 dma1Var2 = (dma1) objJ;
            sn01Var.a = hbyVar;
            sn01Var.b = dma1Var2;
            sn01Var.e = 2;
            Serializable serializableB = b(sn01Var);
            if (serializableB != serializable) {
                hbyVar2 = hbyVar;
                dma1Var = dma1Var2;
                objJ = serializableB;
                ArrayList arrayList3 = new ArrayList((Collection) objJ);
                r7h.a0(arrayList3, new ak01(hbyVar2, b));
                arrayList3.add(0, hbyVar2);
                List<hby> listD2 = o7h.d1(arrayList3, 15);
                arrayList = new ArrayList(q7h.U(listD2, 10));
                while (r9.hasNext()) {
                    arrayList.add(new fn01(hbyVar3.a, hbyVar3.b));
                }
                hma1 hma1VarEdit2 = dma1Var.edit();
                hma1VarEdit2.d(e, this.b.b(this.d, arrayList));
                hma1VarEdit2.g();
                return rih1.a;
            }
            return serializable;
        } catch (Exception e2) {
            Logger.e(e2, "ChatContentPicker: Failed to save recent search", new Object[0]);
        }
    }
}
