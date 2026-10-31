package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class med implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ bfd c;

    public /* synthetic */ med(vr20 vr20Var, bfd bfdVar, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = bfdVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        led ledVar;
        oed oedVar;
        Object x7dVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        bfd bfdVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof led) {
                    ledVar = (led) lnmVar;
                    int i = ledVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ledVar.b = i - Integer.MIN_VALUE;
                    } else {
                        ledVar = new led(this, lnmVar);
                    }
                } else {
                    ledVar = new led(this, lnmVar);
                }
                Object obj2 = ledVar.a;
                int i2 = ledVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                Object objY = ((e331) obj).a;
                if (!(objY instanceof m231)) {
                    objY = bfdVar.y(bfdVar.a((goe) objY));
                }
                e331 e331Var = new e331(objY);
                ledVar.b = 1;
                return vr20Var.emit(e331Var, ledVar) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof oed) {
                    oedVar = (oed) lnmVar;
                    int i3 = oedVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        oedVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        oedVar = new oed(this, lnmVar);
                    }
                } else {
                    oedVar = new oed(this, lnmVar);
                }
                Object obj3 = oedVar.a;
                int i4 = oedVar.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    kdd kddVar = (kdd) obj;
                    if ((kddVar instanceof jdd) || (kddVar instanceof idd)) {
                        x7dVar = y7d.a;
                    } else if (kddVar instanceof gdd) {
                        x7dVar = w7d.a;
                    } else if (kddVar instanceof hdd) {
                        List list = ((hdd) kddVar).a;
                        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(bfdVar.a((goe) it.next()));
                        }
                        x7dVar = new x7d(arrayList);
                    } else {
                        eg.o();
                    }
                    oedVar.b = 1;
                    return vr20Var.emit(x7dVar, oedVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
