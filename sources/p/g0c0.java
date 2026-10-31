package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g0c0 implements pua0 {
    public faa0 a;
    public final /* synthetic */ h0c0 b;
    public final /* synthetic */ iu30 c;

    public g0c0(h0c0 h0c0Var, iu30 iu30Var) {
        this.b = h0c0Var;
        this.c = iu30Var;
        gaa0 gaa0VarF = op71.f();
        gaa0VarF.m0(rih1.a);
        this.a = gaa0VarF;
    }

    public final Map a(Set set) {
        boolean zIsActive = this.a.isActive();
        h0c0 h0c0Var = this.b;
        if (!zIsActive) {
            h0c0Var.c.c();
            this.a = c921.y(smo1.e(h0c0Var.a), (o8n) null, 0, new ss90(h0c0Var, this.c, (lnm) null, (byte) 15), 3);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            if (((a2v) obj).c()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        bpb1 bpb1Var = h0c0Var.b;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((a2v) it.next()).a());
        }
        bpb1Var.m((Object) null, linkedHashSet);
        int iS = zno1.s(q7h.U(arrayList2, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj2 : arrayList2) {
            linkedHashMap.put(obj2, new j3r(f2v.a));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(List list, onm onmVar) {
        f0c0 f0c0Var;
        Iterator it;
        if (onmVar instanceof f0c0) {
            f0c0Var = (f0c0) onmVar;
            int i = f0c0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f0c0Var.d = i - Integer.MIN_VALUE;
            } else {
                f0c0Var = new f0c0(this, onmVar);
            }
        } else {
            f0c0Var = new f0c0(this, onmVar);
        }
        Object obj = f0c0Var.b;
        int i2 = f0c0Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            it = list.iterator();
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = f0c0Var.a;
            hm5.M(obj);
        }
        while (it.hasNext()) {
            mmr0 mmr0Var = (mmr0) it.next();
            if (((a2v) mmr0Var.a).c()) {
                String strA = ((a2v) mmr0Var.a).a();
                h0c0 h0c0Var = this.b;
                q8n q8nVar = h0c0Var.a;
                xtz xtzVar = new xtz(mmr0Var, h0c0Var, strA, (lnm) null, (byte) 20);
                f0c0Var.a = it;
                f0c0Var.d = 1;
                Object objH = c921.H(q8nVar, xtzVar, f0c0Var);
                d9n d9nVar = d9n.a;
                if (objH == d9nVar) {
                    return d9nVar;
                }
            }
        }
        return rih1.a;
    }

    public final void dispose() {
        if (this.a.isActive()) {
            this.b.c.d();
            this.a.d((CancellationException) null);
        }
    }

    public final void b(Set set) {
    }
}
