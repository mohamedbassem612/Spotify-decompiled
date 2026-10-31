package p;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class eun0 implements cun0 {
    public final Set a;
    public final List b;

    public eun0(List list, Set set) {
        this.a = set;
        this.b = list;
    }

    @Override // p.dyf0
    public final void a(Intent intent) {
        List list = this.b;
        list.clear();
        Set set = this.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hyf0 hyf0VarA = ((uph) it.next()).a(intent);
            if (hyf0VarA != null) {
                arrayList.add(hyf0VarA);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            list.addAll(arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.cun0
    public final Object b(lnm lnmVar) {
        dun0 dun0Var;
        int i;
        Iterator it;
        if (lnmVar instanceof dun0) {
            dun0Var = (dun0) lnmVar;
            int i2 = dun0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dun0Var.e = i2 - Integer.MIN_VALUE;
            } else {
                dun0Var = new dun0(this, lnmVar);
            }
        } else {
            dun0Var = new dun0(this, lnmVar);
        }
        Object obj = dun0Var.c;
        int i3 = dun0Var.e;
        List list = this.b;
        if (i3 == 0) {
            hm5.M(obj);
            i = 0;
            it = list.iterator();
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = dun0Var.b;
            it = dun0Var.a;
            hm5.M(obj);
        }
        while (it.hasNext()) {
            hyf0 hyf0Var = (hyf0) it.next();
            dun0Var.a = it;
            dun0Var.b = i;
            dun0Var.e = 1;
            Object objA = hyf0Var.a(dun0Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        }
        list.clear();
        return rih1.a;
    }
}
